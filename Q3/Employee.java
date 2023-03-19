public class Employee
{
    String name;
    int year_of_joining;
    String address;
    public void disp()
    {
        System.out.println("Name\t Year of Joining\t \t Address");
    }
    public void display()
    {
        System.out.println(name + "\t" + year_of_joining + "\t" + "\t" + address);
    }
}