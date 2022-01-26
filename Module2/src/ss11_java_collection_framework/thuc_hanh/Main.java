package ss11_java_collection_framework.thuc_hanh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentComparator student1 = new StudentComparator("Nam",20, "HN");
        StudentComparator student2 = new StudentComparator("Hung",21, "HN");
        StudentComparator student3 = new StudentComparator("Ha",22, "HN");

        Map<Integer, StudentComparator> studentMap = new HashMap<Integer, StudentComparator>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student2);

        for(Map.Entry<Integer, StudentComparator> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<StudentComparator> students = new HashSet<StudentComparator>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(StudentComparator student : students){
            System.out.println(student.toString());
        }

    }
}
