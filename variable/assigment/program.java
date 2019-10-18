import java.util.Scanner;
class program
{
 public static void main(String[] args) {
     Scanner b=new Scanner(System.in);
     System.out.println("enter the no");
     
     int a= b.nextInt();
     if( (a & 1)==0)
     {
         System.out.println(a+" is even");

     }
     else
     {
         System.out.println(a+" is odd");
     }
 }
}