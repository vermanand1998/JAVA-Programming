public class BubbleSort {
    public static void main(String args[])
    {
        int arr[]={4,2,6,8,1,3,9};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    // fun of bubble_sort
    public static void bubble_sort(int arr[])
    {
        int temp=0,count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count=1;
                }

            }
            if(count==0)
                break;;
        }
    }


}
