package ss5_Access_Modifier.Thuc_Hanh.Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        college = "codegym";
    }

    void display(){
        System.out.println(rollno + " "+name+" "+college);
    }
}
