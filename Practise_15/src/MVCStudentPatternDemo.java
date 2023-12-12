public class MVCStudentPatternDemo {
    public static void main(String[] args) throws Exception {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Tom");

        System.out.println("\nAfter updating, Student Details are as follows");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student course = new Student();
        course.setName("Andrew");
        course.setRollNo("No");
        return course;
    }
}
