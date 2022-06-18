package java1;

public class Dog {
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
	
	public Dog(String breed, String color, String height, String weight) {
		Breed = breed;
		Color = color;
		Height = height;
		Weight = weight;
	}
	
	public static void main(String[] args) {
		Dog hound = new Dog("Hound", "Brown", "2 feet", "60 pounds");
		System.out.println("Breed: " + hound.Breed);
		System.out.println("Color: " + hound.Color);
		System.out.println("Height: " + hound.Height);
		System.out.println("Weight: " + hound.Weight);
		shake();
		sit();
		layDown();
	}
}