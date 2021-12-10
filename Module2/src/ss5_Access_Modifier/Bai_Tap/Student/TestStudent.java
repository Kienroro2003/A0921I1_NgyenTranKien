package ss5_Access_Modifier.Bai_Tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("Kien");
        System.out.println(student.getName());
        student.setClasses("A0921I01");
        System.out.println(student.getClasses());
    }
}
