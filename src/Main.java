class Employee {

    // Encapsulation
    private int id;
    private String name;

    // Protected field for inheritance
    protected double salary;

    // Static member
    static int employeeCount = 0;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.salary = 0;
        employeeCount++;
    }

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }
    }

    // Method Overloading
    public void work() {
        System.out.println(name + " is working.");
    }

    public void work(int hours) {
        System.out.println(name + " worked for " + hours + " hours.");
    }

    // Method to override
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Final method
    public final void companyPolicy() {
        System.out.println("All employees must follow company policies.");
    }

    // Static method
    public static void totalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}
class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {

        // super keyword
        super(id, name, salary);

        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Method Overriding
    @Override
    public void displayInfo() {

        // super method
        super.displayInfo();

        System.out.println("Programming Language: " + programmingLanguage);
    }

    public void code() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }
}
class Manager extends Employee {

    private String department;

    public Manager(int id, String name, double salary, String department) {

        super(id, name, salary);

        this.department = department;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Department: " + department);
    }

    public void manageTeam() {
        System.out.println(getName() + " is managing the team.");
    }
}
class Intern extends Developer {

    private int internshipDuration;

    public Intern(int id, String name, double salary,
                  String programmingLanguage,
                  int internshipDuration) {

        super(id, name, salary, programmingLanguage);

        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Internship Duration: "
                + internshipDuration + " months");
    }
}
class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
class SecuritySystem {

    public void login(String username) {
        System.out.println(username + " logged in.");
    }

    // Method Overloading
    public void login(String username, String password) {
        System.out.println(username + " logged in with password.");
    }
}
public class Main {

    public static void main(String[] args) {

        // Objects
        Developer dev1 =
                new Developer(101, "Kidus", 5000, "Java");

        Manager manager1 =
                new Manager(201, "Abel", 8000, "IT");

        Intern intern1 =
                new Intern(301, "Sara", 2000,
                        "Python", 6);

        // Demonstrating method overriding
        dev1.displayInfo();

        System.out.println("----------------");

        manager1.displayInfo();

        System.out.println("----------------");

        intern1.displayInfo();

        System.out.println("----------------");

        // Method overloading
        dev1.work();
        dev1.work(8);

        System.out.println("----------------");

        // Runtime Polymorphism (Upcasting)
        Employee emp;

        emp = new Developer(401, "John", 6000, "C++");
        emp.displayInfo();

        System.out.println("----------------");

        emp = new Manager(501, "Helen", 9000, "Finance");
        emp.displayInfo();

        System.out.println("----------------");

        // Final method
        dev1.companyPolicy();

        System.out.println("----------------");

        // Static method
        Employee.totalEmployees();

        System.out.println("----------------");

        // Final class
        Department dep = new Department("Software Engineering");
        dep.showDepartment();

        System.out.println("----------------");

        // Security System
        SecuritySystem security = new SecuritySystem();

        security.login("admin");
        security.login("admin", "1234");
    }
}