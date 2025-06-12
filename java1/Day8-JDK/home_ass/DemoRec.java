import java.util.*;
class DemoRec
{
 public static void main(String args[])
 {
   double len, br, area;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter length and breadth of rectangle:-");
   len = sc.nextDouble();
   br = sc.nextDouble();
   area = len*br;
   System.out.println("Area of rectangle is"+area);
   }
 }
   
   