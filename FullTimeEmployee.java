public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee() {
        // Default constructor
    }

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);  
        this.salary = salary;
    }

    public void showFullTimeEmployeeInfo() {
        System.out.println("Employee Id : " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Employee Salary: " + salary);
        System.out.println("Yearly Salary : " + salary * 12);
    }

    public double yearlySalary() {
        return salary * 12;
    }
}