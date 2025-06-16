package Day10;
import java.util.Scanner;

//Base class
class Person {
 String name;
 int age;

 void accept(Scanner sc) {
     System.out.print("Enter the name: ");
     name = sc.nextLine();

     System.out.print("Enter the age: ");
     age = sc.nextInt();
     sc.nextLine(); // Consume the leftover newline
 }
}

//Subclass of Person
public class Emp extends Person {
 double sal;

 void acceptEmp(Scanner sc) {
     System.out.print("Enter the salary: ");
     sal = sc.nextDouble();
 }

 void display() {
     System.out.println("\n--- Employee Details ---");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: " + sal);
 }

 // Main method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); // One Scanner object for all input

     Emp e = new Emp();
     e.accept(sc);
     e.acceptEmp(sc);
     e.display();

     sc.close(); // Always close the Scanner
 }
}
