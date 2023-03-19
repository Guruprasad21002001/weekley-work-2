import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        TeamEmployee emp = new TeamEmployee();
        emp.name = s.nextLine();
        emp.address = s.nextLine();
        emp.age = s.nextInt();
        emp.phoneNumber = s.next();
        emp.salary = s.nextLong();
        emp.specialization = s.next();

        Scanner m=new Scanner(System.in);
        TeamManager mgr = new TeamManager();
        mgr.name = m.nextLine();
        mgr.address = m.nextLine();
        mgr.age = m.nextInt();
        mgr.phoneNumber = m.next();
        mgr.salary = m.nextLong();
        mgr.department = m.next();

        System.out.println("Employee details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);
    }
}