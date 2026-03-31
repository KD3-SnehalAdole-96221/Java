package com.app.Fruits;

public abstract class Fruit {

	private String name;
	private double weight;
	private String color;
	boolean isFresh;

	public Fruit() {

	}

	public Fruit(String name, double weight, String color) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public abstract String taste();

	@Override
	public String toString() {
		return "name: " + name + " color: " + color + " weight: " + weight;
	}

}

class Apple extends Fruit {
	public Apple() {
		super();

	}

	
	public Apple(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet and Sour";

	}

}

class Mango extends Fruit {

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}

}

class Orange extends Fruit {

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sour";
	}

}
