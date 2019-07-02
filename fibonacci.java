public class GFG
{
    
    static int fib(int n)
    {
        if (n>=3)
        {
            return (fib(n-1) + fib (n-2));
        }
        else
        {
            return 1;
        }
    }
    
    public static void main(String[] args)
{
    for (int i=1;i<10;i++)
    {
        System.out.println(fib(i));
    }    
    
}
}
