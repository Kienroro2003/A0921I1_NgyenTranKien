package case_study.task1.models;

public abstract class Person {
    protected String date;
    protected String name;
    protected String gender;
    protected int ID;
    protected int IDPerson;
    protected int numberPhone;
    protected String email;

    public Person() {
    }

    public Person(String date, String name, String gender, int ID, int IDPerson, int numberPhone, String email) {
        this.date = date;
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.IDPerson = IDPerson;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIDPerson() {
        return IDPerson;
    }

    public void setIDPerson(int IDPerson) {
        this.IDPerson = IDPerson;
    }
}
