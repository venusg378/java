class second
{
    public static void main(String[] args) {
        System.out.println("main method stated now");
        m1();
        System.out.println("main method exits now");
    }

    public static void m1()
    {
        System.out.println("m1 method called by main");
        m2();
        System.out.println("m1 method exist now");
    }

    public static void m2()
        {
            System.out.println("m2 method called by m1");
            m3();
            System.out.println(" m2 method exist now");
        }
    public static void m3()
    {
        System.out.println("  m3 called by m2");
        System.out.println(" m3 completly exits now");
    }

    
}