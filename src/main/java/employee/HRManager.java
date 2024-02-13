package employee;

public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("\nManaging employees");
    }

    public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
}
