package exeEmployee;

public class DateEmployee {
    public static void main(String[] args) {
        Employee a1 = new Employee("Credit");
        a1.setName("Ionescu");
        a1.setSalary(4500);
        a1.setCnp("123456789012");
        System.out.println("Nume: " + a1.getName());
        System.out.println("Salariu: " + a1.getSalary());
        System.out.println("CNP: " + a1.getCnp());
        System.out.println("Department " + a1.department);
    }
}