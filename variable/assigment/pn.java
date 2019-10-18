import java.util.Scanner;
class pn
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
    
        System.out.println("enter the number");
         int num=obj.nextInt();
        if(num>0)
        {
            System.out.println(num+" is positive");
        }
        else if(num<0){
            System.out.println(num+"is negative");
        
        }
        else {
            System.out.println("the no is zero ");
        }
    }
}