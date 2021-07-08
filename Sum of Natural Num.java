import java.util.Scanner;
public class cwh_35_Exercise_SumNnaturaalNum {
    static int SumNaturaalNum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+ SumNaturaalNum(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner var=new Scanner(System.in);
        int n=var.nextInt();
        int c=SumNaturaalNum(n);
        System.out.println(c);
    }
}
