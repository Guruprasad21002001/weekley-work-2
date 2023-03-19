public class Main {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        emp1.name = "Robert";
        emp1.year_of_joining = 1994;
        emp1.address = "64C- WallsStreat";

        Employee emp2 = new Employee();
        emp2.name = "Sam\t";
        emp2.year_of_joining= 2000;
        emp2.address = "68D- WallsStreat";

        Employee emp3 = new Employee();
        emp3.name = "John";
        emp3.year_of_joining = 1999;
        emp3.address = "26B- WallsStreat";

        emp1.disp();

        emp1.display();
        emp2.display();
        emp3.display();
    }
}