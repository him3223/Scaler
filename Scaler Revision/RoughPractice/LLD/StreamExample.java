import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + department + ", $" + salary + ")";
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 60000, "HR"),
            new Employee("Bob", 48000, "IT"),
            new Employee("Charlie", 70000, "Finance"),
            new Employee("David", 55000, "IT"),
            new Employee("Eva", 40000, "HR")
        );

        // employees.stream().filter(e -> e.getSalary() > 50000).forEach(System.out::println);

        employees.stream().filter(e -> e.getDepartment().equals("IT")).forEach(System.out::println);

        /*

        // 1. Employees with salary > 50000
        System.out.println("Employees with salary > 50000:");
        employees.stream()
                 .filter(e -> e.getSalary() > 50000)
                 .forEach(System.out::println);

        // 2. Names of employees in IT
        System.out.println("\nNames of employees in IT:");
        List<String> itNames = employees.stream()
                                        .filter(e -> e.getDepartment().equals("IT"))
                                        .map(Employee::getName)
                                        .collect(Collectors.toList());
        itNames.forEach(System.out::println);

        // 3. Average salary
        double avgSalary = employees.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0);
        System.out.println("\nAverage salary: " + avgSalary);

        // 4. Group by department
        System.out.println("\nEmployees grouped by department:");
        Map<String, List<Employee>> grouped = employees.stream()
                                                       .collect(Collectors.groupingBy(Employee::getDepartment));
        grouped.forEach((dept, emps) -> {
            System.out.println(dept + ": " + emps);
        });
        */
    }
}
