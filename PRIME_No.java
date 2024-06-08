public class PRIME_No {
    public static void main(String[] args)
    {
        for(int i=0;i<100;i++)
        {
            if(check_prime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean check_prime(int num)
    {
        if(num ==0 || num ==1)
        {
            return false;
        }
        for(int i=2;i<Math.pow(num,0.5);i++)
        {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
