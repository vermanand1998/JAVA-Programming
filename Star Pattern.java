public class cwh_35_Exercise_Pattern1 {
    static void Pattern1(int n)
    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        if(n>0)
        {
            Pattern1(n-1);
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }

    public static void main(String[] args)
    {
        Pattern1(4);
    }
}
