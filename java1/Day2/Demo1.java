package demo1.java;
import java.util.*;

public class Demo1 {

    int num = 10;                    // Instance variable
    static int num2 = 12;            // Static variable

    public void display() {
        float num1 = 12.12f;         // Local variable
        System.out.println("Instance variable: " + num);
        System.out.println("Local variable: " + num1);
        System.out.println("Static variable: " + num2);
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.display();
       // System.out.println("Instance variable value outside the class using object: " + obj.num);
    }
}
