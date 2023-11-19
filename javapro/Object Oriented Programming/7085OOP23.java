import java.util.Scanner;

class Student {
    private static int studentCount = 0;
    private int rollNo;
    private String name;
    private String className;

    public Student(String name, String className) {
        this.rollNo = ++studentCount;
        this.name = name;
        this.className = className;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
    }
}
class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter class: ");
            String className = scanner.nextLine();

            students[i] = new Student(name, className);
        }

        System.out.println("Details of all students:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("---------------");
        }

        scanner.close();
    }
}
