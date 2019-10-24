import java.util.Scanner;
class areaoftri
{
    public static double areaoftri(int  base,int hieght)
    {
        final double half=0.5;
        double areaoftri=half*base*hieght;
        System.out.println("area of triangle is :"+areaoftri);
        return areaoftri;
    }
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the base and hieght for the areaoftriangle");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("main method stated here");
        double areaoftri=areaoftri(a,b);
        System.out.println(areaoftri);
        System.out.println("main method exist now");
    }
}