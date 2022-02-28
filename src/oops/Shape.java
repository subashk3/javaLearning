package oops;

public abstract class Shape {

	private String color;

	public Shape(String color) {

		this.color = color;
	}
	abstract double area();

	abstract public String toString();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
