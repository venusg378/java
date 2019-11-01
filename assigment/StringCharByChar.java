import java.util.Scanner;
class StringCharByChar
{
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("the String is "+s);
        for(int i=0;i<=s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}