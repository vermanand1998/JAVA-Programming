public class cwh_34_recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
        static int factorial_iterative(int n)
        {
            if(n==0 || n==1)
            {
                return 1;
            }
        else
        {
            int product=1;
            for(int i=1;i<=n;i++)
            {
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args)
    {   System.out.println("The factorial of an given number is :" + factorial(0));
        System.out.println("The factorial of an given number is :" + factorial(2));
        System.out.println("The factorial of an given number is :" + factorial(3));
        System.out.println("The factorial of an given number is :" + factorial(5));

        System.out.println("The factorial of an given number is :" + factorial_iterative(0));
        System.out.println("The factorial of an given number is :" + factorial_iterative(2));
        System.out.println("The factorial of an given number is :" + factorial_iterative(3));
        System.out.println("The factorial of an given number is :" + factorial_iterative(5));
    }

}
