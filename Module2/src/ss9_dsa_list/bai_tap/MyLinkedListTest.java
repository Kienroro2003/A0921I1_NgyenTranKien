package ss9_dsa_list.bai_tap;

import java.util.Arrays;

public class MyLinkedListTest {
    static class Student{
        private int id;
        private String name;

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
        Student a = new Student(11,"Kien");
        Student b = new Student(22,"Van");
        Student c = new Student(33,"Thinh");
        Student d = new Student(44,"Thang");
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(c);
        myLinkedList.addFirst(b);
        myLinkedList.addFirst(a);
//        Student student = myLinkedList.getLast();
//        System.out.println(student.getName());
//        myLinkedList.add(d,0);
        Student student = (Student) myLinkedList.get(0);
        System.out.println(student.getName());

//        myLinkedList.clear();
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.getLast());
    }
}
