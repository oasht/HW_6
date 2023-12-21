import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Department it=new Department("IT");
        Department hr=new Department(("HR"));
        Employee emp1=new Employee("Vasya", it);
        Employee emp2=new Employee("Petya", it);
        Employee emp3=new Employee("Ivan", it);
        Employee emp4=new Employee("Alex", it);
        it.setBoss(emp4);
        System.out.println(it.getEmployeeList());
        System.out.println(emp1);
        it.removeEmployee(emp1);
        System.out.println(it.getEmployeeList());
        System.out.println(emp1);
        hr.addEmployee(emp1);
        System.out.println(emp1);
        hr.setBoss(emp2);
        System.out.println(it.getEmployeeList());
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(hr.getEmployeeList());

    }
}