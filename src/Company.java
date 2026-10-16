//2.Business requirement: A company pays full-time employees, contractors, and interns.
//Each category has a different salary calculation rule, but all employees share basic employee details.

abstract class Employee{
    private int id;
    private String name;
    private double pay;

    Employee(int id, String name, double pay){
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    public abstract double calSal(double pay);

    public void getDetails(){
        System.out.println("Employee details: ");
        double salary = this.calSal(pay);
        System.out.println("Id: "+id+", name: "+name+", salary:"+salary);
    }
}

class FullTimeEmp extends Employee{
    FullTimeEmp(int id, String name, double pay) {
        super(id, name, pay);
    }

    @Override
    public double calSal(double pay) {
        System.out.println("Salary calculation for full time employee");
        double sal = pay - (pay*10/100);
        return sal;
    }
}

class Intern  extends Employee{

    Intern(int id, String name, double pay) {
        super(id, name, pay);
    }

    @Override
    public double calSal(double pay) {
        System.out.println("Salary calculation for Intern");
        double sal = pay - (pay*2/100);
        return sal;
    }
}

class Contractual  extends Employee{

    Contractual(int id, String name, double pay) {
        super(id, name, pay);
    }

    @Override
    public double calSal(double pay) {
        System.out.println("Salary calculation for Contractual employee");
        double sal = pay;
        return sal;
    }
}

public class Company {
    public static void main(String[] args){
        Employee emp1 = new FullTimeEmp(1, "Tayyab", 1000);
        emp1.getDetails();
        System.out.println();
        Employee emp2 = new Intern(2, "John", 1000);
        emp2.getDetails();
        System.out.println();
        Employee emp3 = new Contractual(3, "SpongeBob", 1000);
        emp3.getDetails();
    }
}
