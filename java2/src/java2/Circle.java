package java2;

public class Circle extends Shape {
	public String Color;
	public int Radius;
	
	public Circle(String color, int radius) {
		Color = color;
		Radius = radius;
	}
	
	public void getArea() {
		System.out.println("Area is: " + (Radius^2)*Math.PI);
	}
}