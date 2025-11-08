package Project;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}

abstract class EmployeeOperations {
    public abstract void addEmployee();
    public abstract void viewEmployees();
    public abstract void updateEmployee();
    public abstract void deleteEmployee();
}

class EmployeeManagement extends EmployeeOperations {
    Scanner sc = new Scanner(System.in);

    Employee[] employees = new Employee[50];
    int count = 0;

    @Override
    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        employees[count] = new Employee(id, name, salary);
        count++;

        System.out.println("Employee Added Successfully!\n");
    }

    @Override
    public void viewEmployees() {
        if (count == 0) {
            System.out.println("No Employee Records Found.\n");
            return;
        }

        System.out.println("------ Employee List ------");
        for (int i = 0; i < count; i++) {
            Employee e = employees[i];
            System.out.println((i+1) + ". ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
        }
        System.out.println();
    }

    @Override
    public void updateEmployee() {
        try {
            System.out.print("Enter Employee Index to Update: ");
            int index = sc.nextInt() - 1;

            Employee e = employees[index];

            System.out.print("Enter New Name: ");
            String newName = sc.next();
            System.out.print("Enter New Salary: ");
            double newSalary = sc.nextDouble();

            e.setName(newName);
            e.setSalary(newSalary);

            System.out.println("Employee Updated Successfully!\n");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index! Try again.\n");
        }
    }

    @Override
    public void deleteEmployee() {
        try {
            System.out.print("Enter Employee Index to Delete: ");
            int index = sc.nextInt() - 1;

            // Shift all elements left
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            count--;

            System.out.println("Employee Deleted Successfully!\n");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index! Try again.\n");
        }
    }
}

public class CoreJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement emp = new EmployeeManagement();

        while (true) {
            System.out.println("===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> emp.addEmployee();
                case 2 -> emp.viewEmployees();
                case 3 -> emp.updateEmployee();
                case 4 -> emp.deleteEmployee();
                case 5 -> {
                    System.out.println("Thank you! Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice! Try Again.\n");
            }
        }
    }
}