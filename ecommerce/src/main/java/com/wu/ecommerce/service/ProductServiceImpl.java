package com.wu.ecommerce.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.exception.DataNotFoundExeption;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.repo.ProductRepository;
import com.wu.ecommerce.repo.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	private ProductServiceImpl() {
		
	}
	
	private static ProductService productService;
	
	public static ProductService getInstance() {
		if(productService == null) {
			productService = new ProductServiceImpl();
		}
		return productService;
	}

	public Product addProduct(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return productRepository.addProduct(product);
	}

	public List<Product> getEmployeeByProductId(String id) throws ClassNotFoundException, SQLException, DataNotFoundExeption, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		return productRepository.getEmployeeByProductId(id);
	}

	public List<Product> getProducts() throws DataNotFoundExeption, ClassNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	public List<Product> getAllProductsByCategory(String cat) throws DataNotFoundExeption, ClassNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		return productRepository.getAllProductsByCategory(cat);
	}

	public String removeProductByProductId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product updateProductByProductId(String id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
