package java1;

public class Dog {
	String Breed;
	String Color;
	String Height;
	String Weight;
	
	public static void shake() {
		System.out.println("*** SHAKES ***");
	}
	public static void sit() {
		System.out.println("*** SITS ***");
	}
	public static void layDown() {
		System.out.println("*** LAYS DOWN ***");
	}
	
	public Dog(String breed, String color, String height, String weight) {
		Breed = breed;
		Color = color;
		Height = height;
		Weight = weight;
	}
	
	public static void main(String[] args) {
	}
}