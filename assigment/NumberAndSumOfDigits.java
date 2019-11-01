import java.util.Scanner;
class NumberAndSumOfDigits
{
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        System.out.println("the num is "+num);

        System.out.println(sum(num));

    }


    public static long sum(long num)
    {
        long sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}