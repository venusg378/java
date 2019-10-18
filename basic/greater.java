import java.util.Scanner;
class greater
{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        if(num1>num2)
        {
            System.out.println("the biggest number is :"+num1);

        }
        else{
            System.out.println("the biggest number is "+num2);
        }
         if(num1==num2)
        {
            System.out.println("the both "+num1+" and "+num2+"are same");
        }
        //hi i love my program 

        
    }
}