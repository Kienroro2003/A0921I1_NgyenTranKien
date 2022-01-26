package ss11_java_collection_framework.thuc_hanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
