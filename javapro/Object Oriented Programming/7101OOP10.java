
//Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.


import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    public void removeCourse(String courseName) {
        courses.remove(courseName);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Bharat Bhatt",7101);

        student1.addCourse("Maths");
        student1.addCourse("Java");
        student1.addCourse("PhP");

        System.out.println("Student Information:");
        student1.displayStudentInfo();

        student1.removeCourse("Maths");

        System.out.println("\nStudent Information after removing a course:");
        student1.displayStudentInfo();
    }
}