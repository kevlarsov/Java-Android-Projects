package java2;

public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("red", 5, 10);
		System.out.println(r1.Color);
		System.out.println(r1.Height);
		System.out.println(r1.Width);
		r1.getArea();
	}
}