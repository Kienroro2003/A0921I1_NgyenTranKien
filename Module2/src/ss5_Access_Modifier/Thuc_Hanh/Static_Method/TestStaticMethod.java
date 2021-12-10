package ss5_Access_Modifier.Thuc_Hanh.Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student[] ss = new Student[3];
        int[] num = {111,222,333};
        String[] name = {"Kien","Thinh","Thang"};
        for(int i = 0; i<ss.length;i++){
            ss[i] = new Student(num[i],name[i]);
        }
        for(int i = 0 ;i< ss.length;i++){
            ss[i].display();
        }
//        Student s1= new Student(111,"Kien");
//        Student s2= new Student(222,"Thinh");
//        Student s3= new Student(333,"Thang");

    }
}
