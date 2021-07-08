public class cwh_35_Exercise_Average {
    static void Average(int [] array)
    {
//        int c=(a+b)/2;
//        System.out.println(c);
        int avg,sum=0;
        for (int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        avg=sum/array.length;
        System.out.print(avg);
    }


    public static void main(String[] args)
    {
//        Average(2,4);
        int [] arr={2,4,6,8};
        Average(arr);
    }
}
