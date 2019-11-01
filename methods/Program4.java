import java.util.Scanner;
class Program4


{
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name");
        String sname=sc.next();
       sc.nextLine();
       
        System.out.println("enter the clg name ");
        String cname=sc.nextLine();
    
        System.out.println("enter the student id");
        int id=sc.nextInt();
        System.out.println("enter the student marks");
        double marks=sc.nextDouble();
        System.out.println("enter the  student grade");
        char grade=sc.next().charAt(0);
        System.out.println("enter the student mobile no");
        long mobile=sc.nextLong();



        System.out.println("the student details  are");


        System.out.println("clg name:"+sname);
        System.out.println("student name:"+cname);
        System.out.println("student id :"+id);
        System.out.println("student marks:"+marks);
        System.out.println("student grade :"+grade);
        System.out.println("sudent mobile no :"+mobile);
        System.out.println("main ends");
            
        }
    }
