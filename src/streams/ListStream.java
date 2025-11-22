package listStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {

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


        // 1. Implement a program that reads a list of Employee objects from the user and performs the following operations:
        //Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years.
        //Sort the remaining employees in descending order of their years of experience, and then by their performance ratings in ascending order.
        //Return a new list containing the names of the remaining employees, but with each name reversed and in uppercase.


//        List<StringBuilder> builderList = employees.stream().filter(employee -> !(employee.getJobTitle().equals("Manager")
//                        && employee.getSalary() > 100000 && employee.getYearsOfExperience() > 3))
//                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()
//                        .thenComparing(Employee::getPerformanceRating))
//                .map(employee -> new StringBuilder(employee.getName()
//                        .toUpperCase()).reverse()).toList();
//        System.out.println(builderList);

        //------------------------------------------------------------------------------------------------------------------

        //2. Filter employees from IT department who have rating ≥ 4,
        //Sort them by salary ascending,
        //Return only names in lowercase.

//        List<StringBuilder> it = employees.stream().filter(employee -> (employee.getDepartment().equals("IT")) && employee.getPerformanceRating() >= 4)
//                .sorted(Comparator.comparing(Employee::getSalary))
//                .map(employee -> new StringBuilder(employee.getName().toLowerCase())).toList();
//
//        System.out.println(it);

        //-----------------------------------------------------------------------------------------------

//        3. Filter employees who have more than 5 years of experience
//        Sort by performance rating descending
//        Return a list of Employee objects.

//        List<Employee> list = employees.stream()
//                .filter(employee -> employee.getYearsOfExperience() > 5)
//                .sorted(Comparator.comparing(Employee::getPerformanceRating).reversed())
//                .toList();
//        System.out.println(list);
    }
}
