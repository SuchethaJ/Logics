package listStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee("Alice Johnson", "IT", "Manager", 38, 4, 120000, 4,1,"part-time"),
                new Employee("Bob Smith", "IT", "Developer", 29, 5, 125000, 5,2,"full-time"),
                new Employee("Charlie Davis", "HR", "Manager", 45, 18, 150000, 3,3,"full-time"),
                new Employee("Diana Patel", "Finance", "Analyst", 32, 7, 78000, 4,4,"part-time"),
                new Employee("Ethan Brown", "Sales", "Manager", 41, 2, 110000, 2,5,"part-time"),
                new Employee("Fiona Wilson", "Marketing", "Executive", 27, 3, 62000, 5,6,"full-time"),
                new Employee("George Miller", "IT", "Developer", 36, 10, 98000, 3,7,"full-time"),
                new Employee("Hannah Garcia", "HR", "Manager", 30, 6, 95000, 4,8,"part-time"),
                new Employee("Ian Thompson", "Finance", "Manager", 50, 3, 175000, 5,9,"part-time"),
                new Employee("Julia Roberts", "Sales", "Executive", 28, 4, 70000, 3,10,"full-time")
        );

//       1. Implement a program that reads a list of Employee objects from the user and performs the following operations:
//        Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years.
//        Sort the remaining employees in descending order of their years of experience, and then by their performance ratings in ascending order.
//        Return a new list containing the names of the remaining employees, but with each name reversed and in uppercase.
//
//
       List<StringBuilder> builderList = employees.stream().filter(employee -> !(employee.getJobTitle().equals("Manager")
                        && employee.getSalary() > 100000 && employee.getYearsOfExperience() > 3))
                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()
                        .thenComparing(Employee::getPerformanceRating))
                .map(employee -> new StringBuilder(employee.getName()
                        .toUpperCase()).reverse()).toList();
        System.out.println(builderList);

//-------------------------------------------------------------------------------------------------------------------

//        2. Create a program that takes a list of Employee objects as input and performs the following operations:
//        Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8,
//        but have a salary between 60,000 and 120,000.
//        Sort the remaining employees in ascending order of their salaries,
//        and then by their years of experience in descending order.
//        Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.

//        List<Integer> list = employees.stream().filter(employee -> (employee.getYearsOfExperience() <= 5 && employee.getPerformanceRating() < 8
//                        && employee.getSalary() > 60000 && employee.getSalary() < 120000))
//                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getYearsOfExperience).reversed())
//                .map(employee -> employee.getId() * 10).collect(Collectors.toList());
//        System.out.println(list);

//------------------------------------------------------------------------------------------------------------------------
//        3.Write a program that reads a list of Employee objects from the user and performs the following operations:
//        Remove all employees who are part-time and have a salary less than 50,000,
//        but are in the Sales or Marketing department.
//        Calculate the sum of the salaries of the remaining employees,
//        but only for those who have more than 3 years of experience.
//        Find the average age of the remaining employees, but only for those who have a performance rating of at least 7

//        List<Employee> collect = employees.stream().filter(employee -> !(employee.getjobType().equals("part-time")
//                && employee.getSalary() < 50000
//                && employee.getDepartment().equals("Sales") || employee.getDepartment().equals("Marketing"))).collect(Collectors.toList());
//        double sum = collect.stream().filter(employee -> employee.getYearsOfExperience() > 3).mapToDouble(Employee::getSalary).sum();
//        double v = collect.stream().filter(employee -> employee.getPerformanceRating() >= 7).mapToDouble(Employee::getAge).average().orElse(0);
//
//        System.out.println(collect);
//        System.out.println(sum);
//        System.out.println(v);

//----------------------------------------------------------------------------------------------------------------------------
    }
}
