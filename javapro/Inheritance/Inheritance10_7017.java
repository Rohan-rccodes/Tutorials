// Define the base class Employee
class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus() {
        return 0; // Default bonus calculation for generic Employee
    }

    public String generatePerformanceReport() {
        return "Performance report for " + name + ":\n" +
                "No specific performance metrics available.";
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is managing project: " + projectName);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String address, double salary, String jobTitle, int teamSize) {
        super(name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15; // Bonus calculation for Manager
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + ":\n" +
                "Team size: " + teamSize + " members";
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1; // Bonus calculation for Developer
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Developer " + getName() + ":\n" +
                "Programming language: " + programmingLanguage;
    }
}

// Subclass Programmer
class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    // No need to override calculateBonus() and generatePerformanceReport()
}

// Main class to test the implementation
class inheritance10 {
    public static void main(String[] args) {
        Manager manager = new Manager("Rohan", "123 Main St", 70000, "Manager", 5);
        Developer developer = new Developer("Ram", "456 Oak Ave", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Shyam", "789 Elm Dr", 50000, "Python");

        System.out.println(manager.generatePerformanceReport());
        System.out.println("Bonus: =" + manager.calculateBonus()+"rs");
        manager.manageProject("Project A");

        System.out.println(developer.generatePerformanceReport());
        System.out.println("Bonus: =" + developer.calculateBonus()+"rs");
        developer.manageProject("Project B");

        System.out.println(programmer.generatePerformanceReport());
        System.out.println("Bonus: =" + programmer.calculateBonus()+"rs");
        programmer.manageProject("Project C");
    }
}

