class OddEven
{
    public static void main(String[] args) {
        System.out.println("main started");
        int num=34;
       // boolean b=isOddEven(num);
        if(isOddEven(num)){
            System.out.println("the "+num+" is even");
        }
        else{
            System.out.println("the "+num+"is odd");
        }
        System.out.println("the main ended");
        
    }
    public static boolean isOddEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}