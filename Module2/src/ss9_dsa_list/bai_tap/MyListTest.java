package ss9_dsa_list.bai_tap;

public class MyListTest {
    static class Student{
        private int id;
        private String name;
        private String[] say;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
        Student a = new Student(1,"Kiên");
        Student b = new Student(2,"Anh");
        Student c = new Student(3,"Thịnh");
        Student d = new Student(4,"Thắng");
        Student e = new Student(5,"Vân");
        Student f = new Student(6,"Hưng");
        Student g = new Student(7,"Hân");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyArrayList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f);
        studentMyList.add(g);
//        System.out.println(studentMyList.size());
//        for(int i = 0 ; i < studentMyList.size(); i++){
//            Student student = (Student) studentMyList.elements[i];
////            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.println(studentMyList.indexOf(c));
//        System.out.println(studentMyList.indexOf(f));
//        System.out.println(studentMyList.contains(b));
        newMyArrayList = studentMyList.clone();
//        for(int i = 0 ; i < newMyArrayList.size ; i++){
//            System.out.println(newMyArrayList.get(i).getName());
//        }
        System.out.println(newMyArrayList.remove(0).getName());
        System.out.println("----------------------------");
        for(int i = 0 ; i < newMyArrayList.size ; i++){
            System.out.println(newMyArrayList.get(i).getName());
        }
    }

}
