# weekley-work-2
# 1.Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
~~~
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}


This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}


Finally, we can create a Bird object that can both fly and walk.
public class Solution{
   public static void main(String[] args){

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}


The above code will print:
I am walking
I am flying

This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.
  You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
I am walking
I am flying I am singing
~~~

# 2. Create a class named 'Member' having the following members:
~~~
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
~~~


# 3.Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
~~~
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
~~~

# 4.Define a method to calculate power of a number raised to other i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user
