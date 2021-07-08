import java.util.*;
public class BinarySearch {

public static void main(String args[])
{
    int n=10,location=-1;
    int arr[]={1,2,3,4,5,6,55,66,77,89};
    location=binary_search(arr,10,55);
    if(location!=-1)
        System.out.print(location);
    else
        System.out.print("data not found");
}
public static int binary_search(int arr[],int n,int data)
{
    int l=0,r=n-1,mid;
    while(l<r)
    {
        mid=(l+r)/2;
        if(data == arr[mid])
            return mid;
        else if(data<arr[mid])
            r=mid-1;
        else
            l=mid+1;
    }
    return -1;
}
}
