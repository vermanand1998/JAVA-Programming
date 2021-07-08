public class cwh_31_method1 {
    int logic(int x,int y)//static ki koi jarurat nhi h qki ab hm method ko object create kerke call kr rahe hai
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a=5;
        int b=7;
        int c;
        //method invocation using the object creation
        cwh_31_method1 obj=new cwh_31_method1();
        c=obj.logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
