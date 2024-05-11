class checkPrime
{
    public static boolean isPrime(int n)
    {
        if(n==2) return true;
        for(int x=2; x<=Math.sqrt(n); x++)
        {
            if(n % x == 0) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(isPrime(11));
    }
    
}