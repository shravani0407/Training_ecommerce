package com.wu.ecommerce.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.exception.DataNotFoundExeption;
import com.wu.ecommerce.exception.IdNotFoundExeption;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.utils.DBUtils;

public class ProductRepositoryImpl implements ProductRepository {
	
	private ProductRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
//	private Product[] products = new Product[10];
	
//	private TreeSet<Product> product = new TreeSet<Product>(new Comparator<Product>() {
//		public int compare(Product o1, Product o2) {
//			return o1.getProductName().compareTo(o2.getProductName());
//		}
//	});
	
	
	private TreeSet<Product> products = new TreeSet<Product>(new TreeSet<Product> 
			((o1, o2)->  o1.getProductName().compareTo(o2.getProductName())));
		
			
	
	
	
	private static ProductRepository productRepository;
	
	private static int counter = -1;

	public static ProductRepository getInstance() {
		if(productRepository == null) {
			//create the object
			productRepository = new ProductRepositoryImpl();
		}
		return productRepository;
	}
	
//	private Set<Product> products = new HashSet<Product>();
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		if(counter >= products.length-1) {
//			Product temp[] = new Product[products.length * 2];
//			System.arraycopy(products, 0, temp, 0, products.length);
//			products = temp;			
//		}
//		products[++counter] = product;
//		
//		return product;
		String insertStatement = "insert into product(productId, productName, price, categoryName ) "
				+ "values (?,?,?,?)";
		Connection connection = DBUtils.getInstance().getConnection();
		//prepared statement:
		PreparedStatement preparedStatement= connection.prepareStatement(insertStatement);
		preparedStatement.setString(1, product.getProductId());
		preparedStatement.setString(2, product.getProductName());
		preparedStatement.setInt(3, product.getPrice());
		preparedStatement.setString(4, product.getCategoryName());
		
		int result = preparedStatement.executeUpdate();
		
		if(result > 0) {
			return product;
		}
		else {
			return null;
		}

		
	}

	public Product getProductById(String id) throws IdNotFoundExeption {
		// TODO Auto-generated method stub
		Product p = null;
//		for (Product product : products) {
//			if(product.getProductId().equals(id) && product != null) {
//				return Optional.of(product);
//			}
//		}
		return products.stream().filter(e->e.getProductId().equals(id))
				.findFirst().orElseThrow(()->new IdNotFoundExeption("id is not present"));
	}

	public List<Product> getProducts() throws DataNotFoundExeption, ClassNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		
		String query = "select * from product";
		Connection connection = DBUtils.getInstance().getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Product> products = new ArrayList<Product>();
		
		while(resultSet.next()) {
			Product product = new Product();
			product.setProductId(resultSet.getString("productId"));
			product.setProductName(resultSet.getString("productName"));
			product.setPrice(resultSet.getInt("price"));
			product.setCategoryName(resultSet.getString("categoryName"));
			products.add(product);
		}
		
		return Optional.ofNullable(products)
				.filter(l->!l.isEmpty())
				.orElseThrow(() -> new DataNotFoundExeption("Data is not present."));
	
	}

	public List<Product> getAllProductsByCategory(String cat) throws DataNotFoundExeption, ClassNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		
		//products.stream().filter(e->e.getCategoryName().equals(cat)).toList();           to list is available from java version 16
		
		String query = "select * from product where categoryName=categoryName";
		Connection connection = DBUtils.getInstance().getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Product> products = new ArrayList<Product>();
		
		while(resultSet.next()) {
			Product product = new Product();
			product.setProductId(resultSet.getString("productId"));
			product.setProductName(resultSet.getString("productName"));
			product.setPrice(resultSet.getInt("price"));
			product.setCategoryName(resultSet.getString("categoryName"));
			products.add(product);
		}
		
				List<Product> temp = products
				 .stream()
				 .filter(e->e.getCategoryName().equals(cat)).collect(Collectors.toList());
		
			return Optional.ofNullable(temp).filter(l->!l.isEmpty()).orElseThrow(()-> new DataNotFoundExeption("data is not available"));
	}

	public String removeProductByProductId(String id) throws IdNotFoundExeption {
		Product product = this.getProductById(id);
		boolean result = products.remove(product);
		if(result) {
			return "success";
		}
		else {
			return "fail";
		}
	}

	public Product updateProductByProductId(String id, Product product) throws ClassNotFoundException, SQLException {
		
		return null;
	}

	@Override
	public List<Product> getEmployeeByProductId(String id) throws ClassNotFoundException, SQLException, DataNotFoundExeption, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		String query = "select * from product where productId=productId";
		Connection connection = DBUtils.getInstance().getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		List<Product> products = new ArrayList<Product>();
		
		while(resultSet.next()) {
			Product product = new Product();
			product.setProductId(resultSet.getString("productId"));
			product.setProductName(resultSet.getString("productName"));
			product.setPrice(resultSet.getInt("price"));
			product.setCategoryName(resultSet.getString("categoryName"));
			products.add(product);
		}
		
		return Optional.ofNullable(products)
				.filter(l->!l.isEmpty())
				.orElseThrow(() -> new DataNotFoundExeption("Data is not present."));
	}

}
