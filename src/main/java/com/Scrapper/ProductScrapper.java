package com.Scrapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.opencsv.CSVWriter;

public class ProductScrapper {
	public static void main(String[] args) throws IOException {
		
			String url = "https://www.officedepot.com/a/browse/ergonomic-office-chairs/N=5+593065&cbxRefine=1429832/";
	        Document document = Jsoup.connect(url).get();
	        List<Product> productList = new ArrayList<Product>();

	        Elements elements = document.select(".od-search-browse-products-vertical-grid-product");
	        int count =1;
	        
	        for(Element element: elements) {
	        	if(count >10) break;
	        	
	        	String productName = element.select(".od-product-card-region.od-product-card-region-description:first-child").text();
	        	
	        	String productPrice = element.select("span.od-graphql-price-big-price").text();
	        	
	        	String itemNumber = element.select(".od-product-card-region-product-number").text();
	        	
	        	String productCatagory = document.title();
	        	
	        	String productDescription = element.select(".od-product-label-title").text();
	        
	        	count++;
	        	
	        	productList.add(new Product(productName, productPrice, itemNumber, productCatagory, productDescription));
	        }
			

			CSVWriter writer = new CSVWriter(new FileWriter("top_products.csv"));

			String[] header = { "Product Name", "Product Price", "Product Code", "Product Catagory", "Product Description"};
			writer.writeNext(header);
			
			for (Product p : productList) {
				String[] row = { p.getProductName(), p.getProductPrice(), p.getItemNumber(), p.getProductCatagory(), p.getProductDescription()};
				writer.writeNext(row);
			}
			
			writer.close();
	}

}
