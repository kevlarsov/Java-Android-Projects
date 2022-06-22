package java2;

public class Rectangle extends Shape {
	public String Color;
	public int Height;
	public int Width;
	
	public Rectangle(String color, int height, int width) {
		Color = color;
		Height = height;
		Width = width;
	}
	
	public void getArea() {
		System.out.println("Area is: " + (Height * Width));
	}
}