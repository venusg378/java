class PositiveNegative
{
    public static void main(String[] args) {
        System.out.println("main method started");
        int num=0;
        if(PositiveNegative(num)>0)
        {
            System.out.println("the "+num+" is positive ");
        }
        else if(PositiveNegative(num)<0)
        {
            System.out.println("the "+num+"is negative");
        }
        else 
        {
            System.out.println("no is zero");
        }




        System.out.println(" main ended");

    }



    public static int PositiveNegative(int num){
        if(num>0)
        {
            return 1;
        }
        else if(num<0)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
}