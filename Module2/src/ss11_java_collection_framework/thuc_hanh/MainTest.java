package ss11_java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        StudentComparator student = new StudentComparator("Kien", 30, "HT");
        StudentComparator student1 = new StudentComparator("Nam", 26, "HN");
        StudentComparator student2 = new StudentComparator("Anh", 38, "HT" );
        StudentComparator student3 = new StudentComparator("Tung", 38, "HT" );

        List<StudentComparator> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(StudentComparator st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(StudentComparator st : lists){
            System.out.println(st.toString());
        }
    }
}
