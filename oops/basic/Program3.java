import java.util.Scanner;

class Demo
{
    public static String name;
    public static int id;
    public static double marks;
    public static void studentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student details below");
        System.out.println("enter the student name:");
        Demo.name=sc.nextLine();
        System.out.println("enter the student id:");
        Demo.id=sc.nextInt();
        System.out.println("enter the student marks:");
        Demo.marks=sc.nextDouble();
    }

}
class Program3
{
    public static void main(String[] args) {
        System.out.println("main started");
        Demo.studentDetails();
        System.out.println("student name :"+Demo.name);
        System.out.println("student id:"+Demo.id);
        System.out.println("student marks:"+Demo.marks);
        System.out.println("main method ended");
       
    
    }
}