import java.util.Scanner;
class Areaoftriangle
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of base and hight of the triangel");
        double base=obj.nextDouble();
        double  height=obj.nextDouble();
        System.out.println("the base value is "+base);
        System.out.println("the hight value is :"+height);
        double areaoftriangle ;
        final double half=0.5;
        areaoftriangle=half*base*height;
        System.out.println("the areaoftriangle is :"+areaoftriangle);
    }
}
