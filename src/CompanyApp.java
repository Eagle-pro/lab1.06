import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompanyApp {

    public static void main(String[] args) {
        // List to hold Employee objects
        List<Employee> employees = new ArrayList<>();

        // Create 7 Employee objects
        employees.add(new Employee("John Doe", "john.doe@example.com", 35, 50000));
        employees.add(new Employee("Jane Smith", "jane.smith@example.com", 28, 45000));
        employees.add(new Employee("Michael Brown", "michael.brown@example.com", 42, 60000));
        employees.add(new Employee("Emily White", "emily.white@example.com", 30, 55000));
        employees.add(new Employee("William Johnson", "william.johnson@example.com", 25, 47000));
        employees.add(new Employee("Emma Davis", "emma.davis@example.com", 27, 49000));
        employees.add(new Employee("James Wilson", "james.wilson@example.com", 45, 70000));

        // Create 3 Intern objects
        employees.add(new Intern("Alice Green", "alice.green@example.com", 22, 18000));
        employees.add(new Intern("Bob King", "bob.king@example.com", 23, 20000));
        try {
            employees.add(new Intern("Charlie Young", "charlie.young@example.com", 21, 25000));  // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Write all employee details to the file
        writeEmployeesToFile(employees);
    }

    // Method to write employee data to a file
    public static void writeEmployeesToFile(List<Employee> employees) {
        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (Employee emp : employees) {
                writer.write(emp.getEmployeeDetails() + "\n");
            }
            System.out.println("Employee details written to employees.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}

