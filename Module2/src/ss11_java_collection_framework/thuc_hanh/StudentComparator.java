package ss11_java_collection_framework.thuc_hanh;

public class
StudentComparator implements Comparable<StudentComparator> {
    private String name;
    private int age;
    private String address;

    public StudentComparator(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public StudentComparator() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentComparator student) {
        return this.getName().compareTo(student.getName());
    }
}
