import java.util.Scanner;
class OddEven
{
    public static boolean isOddEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        
        }
    }

}
class PositiveOrNegative
{
    public static void isPositive(int num){

        if(num>0){
            System.out.println("the "+num+"is positive");
        }
        else if(num<0){
            System.out.println("the "+num+"is negative");

        }
    }

}
class Program1
{
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter the no");
        int num=sc.nextInt();
        if(OddEven.isOddEven(num))
        {
            System.out.println("the "+num+"is even");

        }
        else{
            System.out.println("the "+num+"is odd");
        }
        PositiveOrNegative.isPositive(num);




    }
}