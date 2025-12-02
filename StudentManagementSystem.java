import java.util.Scanner;
public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    System.out.println("\nExiting program...");
                    return;
                default:
                    System.out.println("\nInvalid choice. Try again!");
            }
        }
    }


    public static void addStudent() {
        if (count >= students.length) {
            System.out.println("\nStudent database is full!");
            return;
        }

        System.out.print("\nEnter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter student Cgpa: ");
        double Cgpa = sc.nextDouble();
        sc.nextLine();

        students[count] = new Student(name, id, Cgpa);
        count++;

        System.out.println("\nStudent added successfully!");
    }


    public static void displayAllStudents() {
        if (count == 0) {
            System.out.println("\nNo students to display!");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====\n");
        for (int i = 0; i < count; i++) {
            students[i].displayInfo();
        }
    }


    public static void searchStudent() {
        if (count == 0) {
            System.out.println("\nNo students to search!");
            return;
        }

        System.out.println("\nSearch by: ");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("\nEnter student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < count; i++) {
                if (students[i].getId() == id) {
                    System.out.println("\nStudent Found:");
                    students[i].displayInfo();
                    return;
                }
            }

        } else if (choice == 2) {
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();

            for (int i = 0; i < count; i++) {
                if (students[i].getName().equalsIgnoreCase(name)) {
                    System.out.println("\nStudent Found:");
                    students[i].displayInfo();
                    return;
                }
            }
        } else {
            System.out.println("\nInvalid choice!");
            return;
        }

        System.out.println("\nStudent not found!");
    }


    public static void updateStudent() {
        if (count == 0) {
            System.out.println("\nNo students to update!");
            return;
        }

        System.out.print("\nEnter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {

                System.out.println("\nStudent found. Enter new details.");

                System.out.print("\nNew name: ");
                String newName = sc.nextLine();

                System.out.print("New ID: ");
                int newId = sc.nextInt();

                System.out.print("New Cgpa: ");
                double newCgpa = sc.nextDouble();
                sc.nextLine();

                students[i].setName(newName);
                students[i].setId(newId);
                students[i].setCgpa(newCgpa);

                System.out.println("\nStudent updated successfully!");
                return;
            }
        }

        System.out.println("\nStudent not found!");
    }
}