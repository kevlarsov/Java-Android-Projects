package java2;

public class Shape {
	String Name;
	String Color = "Red";
	
	static void getArea() {
		System.out.println("*** GOT AREA ***");
	}

	public Shape(String name) {
		Name = name;
		getArea();
	}

	public static void main(String[] args) {
	}
}