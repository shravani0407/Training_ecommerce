package com.wu.ecommerce.dto;

import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

//@data - consist of annotations setter, getter, To

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor

public class Product  {

//	implements Comparable<Product>

	public Product(String productId, String productName, int price, String categoryName) throws InvalidIdException, InvalidPriceException {
		super();
		this.setProductId(productId);
		this.productName = productName;
		this.setPrice(price);
		this.categoryName = categoryName;
	}
	private String productId;
	public void setProductId(String productId) throws InvalidIdException {
		if (productId == null || productId.equals("") || productId.length()<3) {
			throw new InvalidIdException("id is invalid");
		}
		this.productId = productId;
	}
	@Setter
	private String productName;

	
	private int price;
	public void setPrice(int price) throws InvalidPriceException {
		if (price<=0) {
			throw new InvalidPriceException("invalid price");
		}
		this.price = price;
	}
	
	@Setter
	private String categoryName;
//	@Override
//	public int compareTo(Product o) {
//		return this.productId.compareTo(o.productId);
//	}
	

}
