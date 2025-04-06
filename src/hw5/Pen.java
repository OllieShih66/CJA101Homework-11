package hw5;

public abstract class Pen {
	// Ex6
	private int price;
	private String brand;

	public Pen() {
	}

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	public abstract void write();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
