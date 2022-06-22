package java1;

public class Main {

	public static void main(String[] args) {
		Dog hound = new Dog("Hound", "Brown", "2 feet", "60 pounds");
		System.out.println("Breed: " + hound.Breed);
		System.out.println("Color: " + hound.Color);
		System.out.println("Height: " + hound.Height);
		System.out.println("Weight: " + hound.Weight);
		Dog.shake();
		Dog.sit();
		Dog.layDown();
	}
}
