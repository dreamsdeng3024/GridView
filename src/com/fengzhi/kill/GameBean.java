package com.fengzhi.kill;

public class GameBean {
	
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	public GameBean() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GameBean [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
	public GameBean(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	

}
