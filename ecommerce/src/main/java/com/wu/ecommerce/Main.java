package com.wu.ecommerce;

import java.sql.SQLException;
import java.util.*;
import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.DataNotFoundExeption;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.service.ProductService;
import com.wu.ecommerce.service.ProductServiceImpl;
import com.wu.ecommerce.service.UserService;
import com.wu.ecommerce.service.UserServiceImpl;

public class Main {

public static void main(String[] args) throws ClassNotFoundException, SQLException, DataNotFoundExeption, InvalidIdException, InvalidPriceException {
		
		Scanner scanner = new Scanner(System.in);
		ProductService productService = ProductServiceImpl.getInstance();
		Product product = null;
		Product product1 = null;
		Product product2= null;
		Product product3 = null;
		Product product4 = null;
		
		UserService userService = UserServiceImpl.getInstance();
		User user = null;
		
		try {
			product = new Product("PID1", "productName1", 100, "Cat1");
			user = new User("UID1", "shravani", "parsewar", "1234567890");
			//			product1 = new Product("PID2", "productName2", 100, "Cat1");
//			product2 = new Product("PID3", "productName3", 100, "Cat2");
//			product3 = new Product("PID4", "productName4", 100, "Cat2");
//			product4 = new Product("PID5", "productName5", 100, "Cat3");
		} catch (InvalidIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int choice = 0;
		while(true) {
			System.out.println("enter the choice");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				productService.addProduct(product);
//				productService.addProduct(product1);
//				productService.addProduct(product2);
//				productService.addProduct(product3);
//				productService.addProduct(product4);
				break;
			case 2:
				userService.addUser(user);
//				productService.getProducts();
//				System.out.println(product.compareTo(product1));
				break;
				
			case 3:
				System.out.println(productService.getProducts());			
				break;
				
			case 4:
				System.out.println(productService.getAllProductsByCategory("Cat1"));
				break;
				
			case 5:
				System.out.println(productService.getEmployeeByProductId("PID1"));
				break;
				
			case 6:
				System.out.println(userService.getUser());
				break;

			default:
				break;
			}
			
			
			
		}
	
}
		
	}


