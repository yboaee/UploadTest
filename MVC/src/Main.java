
public class Main {

	public static void main(String[] args) {
		
		
		Student model = retriveStudentFromDatabase();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("안상영");
		controller.updateView();
		
	}
	
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("이영범");
		student.setRollNo("1");
		return student;
		
	}
}
