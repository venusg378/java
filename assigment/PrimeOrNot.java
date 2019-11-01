import java.util.Scanner;
class PrimeOrNot
{
    public static void main(String[] args) {
        System.out.println("the main starts now");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no ");
        int num=sc.nextInt();
        if(primeOrNot(num)>0)
        {
            System.out.println("the is not a prime");
        }
        else {
            System.out.println("the no is prime");
        }
        
        
    }




    public static int primeOrNot(int num)
    {
        int i;
        int temp=0;
        for (i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
              temp=temp+1;
            }
        }
        return temp;
    }
}