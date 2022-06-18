import java.util.*;
 class Employee {
    protected String name = "";
    protected int id;
    protected double salary;

}

 class Regular extends Employee {
    private double DA;
    private double HRA;
    private double basic_salary;

   Regular(double d, double h, double b) {
        DA = d;
        HRA = h;
        basic_salary = b;
    }

    public final void display() {
        System.out.print("\nSalary of the Regular employee is ");
        System.out.print((DA + HRA + basic_salary));
    }

}

 class PartTime extends Employee {
    private int number_of_hours;
    private double pay_per_hour;

    public PartTime(int n, double p) {
        number_of_hours = n;
        pay_per_hour = p;
    }

    public final void display() {
        System.out.print("\nSalary of the part-time employee is ");
        System.out.print((number_of_hours * pay_per_hour));
    }
}

class Globals {
    public static void main(String args[]) {
        Regular r = new Regular(3000, 7000, 20000);
        r.display();
        
        PartTime p = new PartTime(8, 1200);
        p.display();

    }
}