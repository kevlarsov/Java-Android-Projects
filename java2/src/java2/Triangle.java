package java2;

public class Triangle extends Shape {
	public String Color;
	public int Base;
	public int Height;
	
	public Triangle(String color, int base, int height) {
		Color = color;
		Base = base;
		Height = height;
	}
	
	public void getArea() {
		System.out.println("Area is: " + (Base * Height)/2);
	}
}