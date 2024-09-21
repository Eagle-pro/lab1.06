public class Intern extends Employee {
    // Constant for salary limit
    private static final double SALARY_LIMIT = 20000;

    // Constructor for Intern
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, validateSalary(salary)); // Validate salary in constructor
    }

    // Static method to validate intern's salary
    private static double validateSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("Salary exceeds the maximum allowed for an intern!");
        }
        return salary;
    }

    // Override the setSalary method to ensure salary limit is enforced
    public void setSalary() {
        setSalary(0.0);
    }

    // Override the setSalary method to ensure salary limit is enforced
    @Override
    public void setSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("Salary exceeds the maximum allowed for an intern!");
        }
        super.setSalary(salary);
    }
}
