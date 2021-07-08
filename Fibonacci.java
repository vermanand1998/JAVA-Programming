public class cwh_34_Fibonacci {
     static int n1=0,n2=1,n3=0;
    static int fibonacci(int count)
    {
        if(count>1)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " +n3);
            fibonacci(count-1);
        }
        return  0;

    }
    public static void main(String[] args)
    {
        int count =10;
        System.out.println(" " +n1);
        System.out.println(" " +n2);
        fibonacci(count);
    }
}
