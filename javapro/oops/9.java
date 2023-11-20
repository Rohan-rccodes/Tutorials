import java.text.SimpleDateFormat;
import java.util.Date;

// Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
 //and a method to calculate years of service.

class Employee {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int calculateYearsOfService() {
        Date currentDate = new Date();
        long millisecondsInYear = 1000L * 60 * 60 * 24 * 365;
        long difference = currentDate.getTime() - hireDate.getTime();
        int years = (int) (difference / millisecondsInYear);
        return years;
    }
}

 class kamal7019javaOOP9 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date hireDate = dateFormat.parse("2010-06-15");
            
            Employee employee = new Employee("John Doe", 60000.0, hireDate);

            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println("Hire Date: " + dateFormat.format(employee.getHireDate()));

            int yearsOfService = employee.calculateYearsOfService();
            System.out.println("Years of Service: " + yearsOfService + " years");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
