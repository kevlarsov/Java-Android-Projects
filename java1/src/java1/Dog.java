package java1;

public class dog {
	String Breed;
	String Color;
	String Height;
	String Weight;
	
	static void shake() {
		System.out.println("*** SHAKES ***");
	}
	static void sit() {
		System.out.println("*** SITS ***");
	}
	static void layDown() {
		System.out.println("*** LAYS DOWN ***");
	}
	
	public dog(String breed, String color, String height, String weight) {
		Breed = breed;
		Color = color;
		Height = height;
		Weight = weight;
	}
	
	public static void main(String[] args) {
	}
}