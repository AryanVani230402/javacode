public class gcd {
    public static void main(String[] args) {
        gcd(46,69);
    }

    private static int gcd(int a, int b) {
        if(b==0)
        {
            System.out.println(a);
            return a;
        }
        gcd(b,a%b);
        return a;
    }
}
