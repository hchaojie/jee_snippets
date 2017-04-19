package cn.hchaojie.jee.hibernate.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String id;
	
	private String name;

	private Double price;

	private String pdesc;
	
	private List<String> keywords = new ArrayList<String>();
	
	public Product() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price 
				+ ", pdesc=" + pdesc
				+ ", keywords=" + keywords
				+ "]";
	}
}
