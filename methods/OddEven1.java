class OddEven1
{
    public static void main(String[] args) {
        System.out.println("main started");
        int num=34;
       // boolean b=isOddEven(num);
     //String s = isOddEven(num)
        System.out.println(isOddEven(num));
        
        System.out.println("the main ended");

    }
    public static String isOddEven(int num)
    {
        if(num % 2 == 0)
        {
            return ""+num+"is even";
        }
        else
        {
            return ""+num+"is odd";
        }
    }
}