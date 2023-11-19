class Employee {
       /*  Topic = Object oriented programme
    29. Write a Java program to create a class called Employee with
     private instance variables employee_id, employee_name, and
      employee_salary. Provide public getter and setter methods to
       access and modify the id and name variables, but provide a getter
        method for the salary variable that returns a formatted string. 
   */ 
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    
    public int getEmployeeId() {
        return employee_id;
    }

    
    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    
    public String getEmployeeName() {
        return employee_name;
    }

   
    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    
    public String getFormattedSalary() {
        return String.format("%.2f", employee_salary);
    }

   
    public void setEmployeeSalary(double salary) {
        this.employee_salary = salary;
    }
}
class prog29{
    public static void main(String[] args){
      
        Employee employee = new Employee();

        
        employee.setEmployeeId(1);
        employee.setEmployeeName("John Doe");
        employee.setEmployeeSalary(50000.0);

        
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: $" + employee.getFormattedSalary());
    }
}
