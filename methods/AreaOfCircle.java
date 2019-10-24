import java.util.Scanner;

public class AreaOfCircle
{ 
    

    // area of circle method defination
    public static double areaOfCircle(double radius)
    {
       final double pi=3.141;
         return pi*radius*radius;
    
    }
    // area of circumference  method defination
   public static double areaOfCircumference(double radius)
   {
       final double pi=3.141;
         return 2*pi*radius;
       
    }
    // main method defination 
    public static void main(String[] args)
     {
       final double pi=3.141;
        System.out.println("main method started now");

        Scanner obj=new Scanner(System.in);// scanner class 
        System.out.print("enter the radius of the circle: ");
        double radius=obj.nextDouble(); // accept the value of radius from the user 

       

        System.out.println("the radius of circle is:"+areaOfCircle(radius));
        System.out.println("the area of circumference :"+areaOfCircumference(radius));
        System.out.println("main method exist now");
    }
}