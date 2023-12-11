package ie.atu;

public class Student {
    private String name;
    private int idNumber;
    private int age;
    private String address;


    public Student() {
Student student = new Student();

        this.name = "";
        this.idNumber = Integer.parseInt("");
        this.age = Integer.parseInt("");
        this.address = "";
    }
    public Student(String name, int idNumber, int age, String address) {

        this.name = name;
        this.idNumber = Integer.parseInt(String.valueOf(idNumber));
        this.age = Integer.parseInt(String.valueOf(age));
        this.address = address;
    }

    public String setName() {
        return name;
    }

    public int setIdNumber() {
        return idNumber;
    }

    public int setAge() {
        return age;
    }

    public String setAddress() {
        return address;
    }
}