package ss5_Access_Modifier.Bai_Tap.Student;

import ss5_Access_Modifier.Thuc_Hanh.Static_Method.Student;

public class Students {
    private String name = "John";
    private String classes = "C02";
    Students(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
