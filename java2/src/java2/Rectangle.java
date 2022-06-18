package java2;

public class Rectangle extends Shape {
	public int Height = 5;
	public int Width = 10;
	
	public Rectangle(String name, int height, int width) {
		super(name);
		Height = height;
		Width = width;
	}
	
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle("Rectangle 1", 5, 10);
			System.out.println(R1.Name + " has a height of " + R1.Height + " and a width of " + R1.Width);
			getArea();
	}
}