public class Student {
    private String name;
    private String id;
    private double cgpa;

    Student() {
        this.name = "Unknown";
        this.id = "0000";
        this.cgpa = 0.0;
    }

    Student(String name, String id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void displayInfo() {
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("--------------------");
    }
}