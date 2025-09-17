package exercise13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("--- Before raiseSalary ---");
        for (Employee e : staff) e.print();

        for (int i = 0; i < 3; i++) staff[i].raiseSalary(5);

        System.out.println("\n--- After raiseSalary ---");
        for (int i = 0; i < 3; i++) staff[i].print();

        System.out.println("\n--- Testing compare ---");
        System.out.println("Comparing staff[0] and staff[1]: " + staff[0].compare(staff[1]));
        System.out.println("Comparing staff[2] and staff[1]: " + staff[2].compare(staff[1]));

        System.out.println("\n--- Sorting by salary ---");
        staff[2] = new Employee("Isabel Vidal", 1000000, 1, 11, 1993);
        System.out.println("Before sort:");
        for (Employee e : staff) e.print();

        Sortable.shell_sort(staff);

        System.out.println("\nAfter sort:");
        for (Employee e : staff) e.print();
    }
}
