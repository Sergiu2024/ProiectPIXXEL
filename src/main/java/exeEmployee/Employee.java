package exeEmployee;

public class Employee {
    private String name;
    private int salary;
    public String department;

    private String cnp;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary( int salary){
        this.salary=salary;
    }


    public String getCnp(){
        return cnp;
    }

    public void setCnp( String cnp){
        this.cnp=cnp;
    }

    public Employee(String departement) {
        this.department = departement;
    }

}
