class Test
{

    public static int x;
    public static void display(){
        System.out.println(x);
    }

}
class Program2
{
    public static void main(String[] args) {
        System.out.println("main method started now ");

        Test.display();

        System.out.println("the main method ended");

    }
}