import java.util.Arrays;
import java.util.stream.Collectors;

public class AverageSalary {
    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Ivan", 25, 10000),
                new Employee("Vasya", 30, 20000),
                new Employee("Masha", 20, 30000),
                new Employee("Misha", 32, 40000),
                new Employee("Katya", 22, 60000),
        };

        System.out.println("Средняя зарплата сотрудников = " + Arrays.stream(staff)
                .collect(Collectors.averagingDouble(s -> s.getSalary()))
        );
        ageStaff(staff, 4);
    }

    private static void ageStaff(Employee[] staff, int numbersOfEmployees) {
        System.out.println(Arrays.stream(staff)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(numbersOfEmployees)
                .map(Employee::getName)
                .collect(Collectors.joining(",", numbersOfEmployees + " самых старших сотрудников зовут: ", ".")));


    }
}
