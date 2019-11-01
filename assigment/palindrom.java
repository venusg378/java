import java.util.Scanner;
class palindrom
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int num=sc.nextInt();
        System.out.println("no is :"+num);
        int temp=num;
        while(num>0)
        {
            int rev=0;
            int rem=num%10;
            temp=temp/10;
            rev=rev*10+rem;

        }
        //int rev=0;
        if(rev==num)
        {
            System.out.println("the no is palindrom");
        
        }
        else
        {
            System.out.println("the no is not palindrom");
        }
    }
}
