
//Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.

class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

   
    public String getCompany_name() {
        return company_name;
    }

    
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

     
    public String getModel_name() {
        return model_name;
    }

    
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    
    public int getYear() {
        return year;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    
    public double getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", "Camry", 2022, 30.5);

       
        System.out.println("Company: " + myCar.getCompany_name());
        System.out.println("Model: " + myCar.getModel_name());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());

      
        myCar.setCompany_name("Honda");
        myCar.setModel_name("Civic");
        myCar.setYear(2023);

        System.out.println("Updated Company: " + myCar.getCompany_name());
        System.out.println("Updated Model: " + myCar.getModel_name());
        System.out.println("Updated Year: " + myCar.getYear());
    }
}