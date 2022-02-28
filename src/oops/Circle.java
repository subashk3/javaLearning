package oops;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color : "+super.getColor()+" Raduis of circle : "+radius+ " Area of Circle is : "+area();
	}

}
