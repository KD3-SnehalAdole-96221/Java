package com.sunbeam.invoice;

public class Invoice {

	private String partNumber;
	private String partDescription;
	private int Quantity;
	private double Price;

	public Invoice() {

	}

	public Invoice(String partNumber, String partDescription, int Quantity, double Price) {
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(Quantity);
		setPrice(Price);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return Quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			Price = 0.0;
		} else {
			Price = price;
		}

	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			Quantity = 0;
		} else {
			Quantity = quantity;

		}

	}
	double Total_Bill=0.0;
	public double Calculate_Bill() {
		
		Total_Bill=Price*Quantity;
		return Total_Bill;

	}
	

}
