package java3;

public class MVCPatternDemo {
	public static void main(String[] args) {
		
		Student model = retrieveStudentFromDb();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		String[] names = {"Adam", "David", "James", "Ryan", "Zach"};
		for (String i : names) {
			controller.setStudentName(i);
			controller.updateView();
		}
	}
	
	private static Student retrieveStudentFromDb() {
		Student student = new Student();
		student.setName("John");
		student.setRollNo(0);
		return student;
	}
}
