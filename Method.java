public class cwh_31_method {
    static int logic(int x,int y)//static lagan hoga qki bina object k hm method ko call kr rahe hai
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
        //method invocation without using any object
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
