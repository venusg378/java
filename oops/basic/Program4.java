class sample
{
    public static void display1(){
        System.out.println("this is display1 method");

    }public static void display2(){
        System.out.println("this is display2 method");

    }
    public static void display3(){
        System.out.println("this is display3 method");

    }

    public static void display4(){
        System.out.println("this is display4 method");

    }
    public static void display5(){
        System.out.println("this is display5 method");

    }

    
}
class Program4
{
    public static void main(String[] args) {
        System.out.println("main method stated");
        sample.display5();
        sample.display4();
        sample.display3();
        sample.display2();
        sample.display1();
        System.out.println("main method ended");
    }
}