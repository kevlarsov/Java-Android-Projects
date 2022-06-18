package java1;

public class Main {

	public static void main(String[] args) {
		dog hound = new dog("Hound", "Brown", "2 feet", "60 pounds");
		System.out.println("Breed: " + hound.Breed);
		System.out.println("Color: " + hound.Color);
		System.out.println("Height: " + hound.Height);
		System.out.println("Weight: " + hound.Weight);
		dog.shake();
		dog.sit();
		dog.layDown();
	}
}
