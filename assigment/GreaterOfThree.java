import java.util.Scanner;
class GreaterOfThree
{
    public static void main(String[] args) {
        System.out.println("enter the three number ");
        Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        System.out.println("num3:"+num3);
            greaterOfThree(num1, num2, num3);
    }



    public static void greaterOfThree(int num1,int num2,int num3)
    {
       
        if(num1>num2 && num1>num3)
        {
            System.out.println(num1+"is greater");
        
        }
        else if(num2>num3)
        {
        
            System.out.println(num2+"is greater");
        }
        else{
            System.out.println(num3+"is greater");
        }
    }
}