import java.util.Scanner;

class sample
{
    public static void findCharInString(String s,char c){
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                System.out.println("charater "+c+" found @"+i+" position");
                return;
            }
        }
        System.out.println("charater "+c+"is not found");
    }
}
class sample1{
    public static void displayNextChar(String s)
    {
        for(int i=0;i< s.length();i++)
        {
            System.out.println((char)(s.charAt(i)+1));
        }
    }
}
class FindChar
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String s=sc.nextLine();
        System.out.println("enter the searching charcter in string ");
        char c=sc.next().charAt(0);
        sample.findCharInString(s,c);
        sample1.displayNextChar(s);
    }
}
