class a
{
    public static void print()
    {
        System.out.println("in a class print method");
        b.view();
    }
}
class b
{
     public static void view()
     {
         System.out.println("view method called by class a");
     }
}
class c{
    public static void disp(){
        System.out.println("ina c class disp method");
        test.mymethod();
    }

}
class test
{
    public static void mymethod()
    {
        System.out.println("mymethod will called by class c");

    }
}
class spacial
{
    public static void main(String[] args) {
        a.print();
        c.disp();
    }
}