public class Employee {
    // Private fields
    private final String name;
    private final String email;
    private final int age;
    private double salary;

    // Constructor
    public Employee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to return a formatted string for employee details
    public String getEmployeeDetails() {
        return String.format("Name: %s, Email: %s, Age: %d, Salary: %.2f",
                name, email, age, salary);
    }
}
