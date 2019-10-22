class three
{
    public static void main(String[] args) {
        System.out.println(" the main method started ");
        boolean b= m1(10);
        System.out.println(" the main method ended");
    }
    public static boolean m1(int x)
    {
        System.out.println(x);
        double d= m2('a');
        System.out.println("m1 is ended");
        return true;
    }
    public static double m2(char c)
    {
        System.out.println(c);
        long l=m3("venu");
        System.out.println("m2 is ended");
        return 23.143;
    }
    public static long m3(String s)
    {
        System.out.println(s);
        System.out.println(" m3 is ended");
        return 143l;
    }
}