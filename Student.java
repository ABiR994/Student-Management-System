public class Student {
    private String name;
    private int id;
    private double cgpa;

    Student() {
        this.name = "Unknown";
        this.id = 0;
        this.cgpa = 0.0;
    }

    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void displayInfo() {
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("--------------------");
    }
}