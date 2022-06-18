package java2;

public class Main {
	public static void main(String[] args) {
		Shape R = new Shape("Rectangle");
			System.out.println("Shape: " + R.Name);
			System.out.println("Color: " + R.Color);
			
		Shape T = new Shape("Triangle");
			System.out.println("Shape: " + T.Name);
			System.out.println("Color: " + T.Color);
			
		Shape C = new Shape("Circle");
			System.out.println("Shape: " + C.Name);
			System.out.println("Color: " + C.Color);
	}
}