import java.util.Scanner;

class operations
{
    public static int addTwoNumber(int x,int y){
        return x+y;
    }
    public static int subTwoNumber(int x,int y){
        return x-y;
    }
    public static int mulTwoNumber(int x,int y){
        return x*y;
    }
    public static int divTwoNumber(int x,int y){
        return x/y;
    }
    public static int modTwoNumber(int x,int y){
        return x%y;
    }
}
class Caluclator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x value");
        int x=sc.nextInt();
        System.out.println("enter the y value");
        int y= sc.nextInt();
      int a=operations.addTwoNumber( x, y);
      int b=operations.subTwoNumber(x,y);
      int c = operations.divTwoNumber(x,y);
      int d= operations.mulTwoNumber(x,y);
       int e=operations.modTwoNumber(x,y);
       System.out.println("addition of two number is :"+operations.addTwoNumber( x, y));
       System.out.println("subraction of two number is :");
       System.out.println("division of two number is :"+c);
       System.out.println("multiplication of two number is :"+d);
       System.out.println("mod of two number is :"+e);
    }
}
