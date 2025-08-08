// Base class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
    }
}

// Derived class
class Manager extends Employee {
    double bonus;

    // Constructor
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary); // calling superclass constructor
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return salary + bonus;
    }

    // Overriding displayDetails to include bonus
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus      : " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

// Main class to run the program
public class EmploymentManagementSystem {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager mgr = new Manager("Alice", 101, 50000.0, 10000.0);

        // Displaying Manager details
        mgr.displayDetails();
    }
}

