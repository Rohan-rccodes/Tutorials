//Employee.java
abstract class Employee {
  protected String name;
  protected double baseSalary;

  public Employee(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public abstract double calculateSalary();

  public abstract void displayInfo();
}
//Manager.java
class Manager extends Employee {
  private double bonus;

  public Manager(String name, double baseSalary, double bonus) {
    super(name, baseSalary);
    this.bonus = bonus;
  }

  @Override
  public double calculateSalary() {
    return baseSalary + bonus;
  }

  @Override
  public void displayInfo() {
    System.out.println("\tManager Name: " + name);
    System.out.println("\tBase Salary: $" + baseSalary);
    System.out.println("\tBonus: $" + bonus);
    System.out.println("\tTotal Salary: $" + calculateSalary());
  }
}
//Programmer.java
class Programmer extends Employee {
  private int overtimeHours;
  private double hourlyRate;

  public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
    super(name, baseSalary);
    this.overtimeHours = overtimeHours;
    this.hourlyRate = hourlyRate;
  }

  @Override
  public double calculateSalary() {
    return baseSalary + (overtimeHours * hourlyRate);
  }

  @Override
  public void displayInfo() {
    System.out.println("\tProgrammer Name: " + name);
    System.out.println("\tBase Salary: $" + baseSalary);
    System.out.println("\tOvertime Hours: " + overtimeHours);
    System.out.println("\tHourly Rate: $" + hourlyRate);
    System.out.println("\tTotal Salary: $" + calculateSalary());
  }
}
//Main.java
class Inheritance_19 {
  public static void main(String[] args) {
    System.out.println();
    Employee manager = new Manager("\tCorona Cadogan", 6000, 1000);
    Employee programmer = new Programmer("\tAntal Nuka", 5000, 20, 25.0);

    manager.displayInfo();
    System.out.println("\t---------------------");
    programmer.displayInfo();
  }
}