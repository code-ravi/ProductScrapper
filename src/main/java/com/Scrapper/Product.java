package com.Scrapper;

public class Product {
	private String productName;
	private String productPrice;
	private String itemNumber;
	private String productCatagory;
	private String productDescription;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getProductCatagory() {
		return productCatagory;
	}
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Product(String productName, String productPrice, String itemNumber, String productCatagory,
			String productDescription) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.itemNumber = itemNumber;
		this.productCatagory = productCatagory;
		this.productDescription = productDescription;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + ", itemNumber=" + itemNumber
				+ ", productCatagory=" + productCatagory + ", productDescription=" + productDescription + "]";
	}
	
	
}
