public class cwh_35_Exercise_MultiTable {
    static int MultiTable(int n)
    {
        for(int i=1;i<=10;i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        MultiTable(7);
    }

}
