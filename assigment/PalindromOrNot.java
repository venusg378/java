import java.util.Scanner;
class PalindromOrNot
{
    public static void main(String[] args) {
        System.out.println("check wheather the no is palindrom or not  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no ");
        int num=sc.nextInt();
        int revs=palindromOrNot(num);
        if(num==palindromOrNot(num))
        {
            System.out.println("the no is palidrom");
        }
        else 
        {
            System.out.println("the no is not palindrom");
        }
    }

        
        
    

        public static int   palindromOrNot(int num){
            while(num>0)
                 {
                     int temp=num;
                     
                     int rem=num%10;
                     temp=temp/10;
                     revs=revs*10+rem;
                 }
                 return revs;

          
                
        }

}