public class recursion_basic {
    public static void main(String[] args) {
//                print_nTo1(4);
//        print_1Ton(100);
//        System.out.println(sumOfn(2));
//        int [] mark = {1,2,3,4};
//        reverseArray(mark,0, mark.length-1);
//        for (int m:mark)
//        {
//            System.out.println(m);
//        }
//        StringBuilder sb = new StringBuilder("aryandadaya");
//        System.out.println(sb.lastIndexOf("ya",6));
    }
    public static void print_nTo1(int n)
    {
        if(n==0){return;}
        System.out.println(n);
        print_nTo1(n-1);
    }

    public static void print_1Ton(int n)
    {
        if(n==0)
        {
            return;
        }
        print_1Ton(n-1);
        System.out.println(n);

    }

    public static int sumOfn(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumOfn(n-1);
    }

    public static void reverseArray(int [] arr,int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        arr[l]=arr[l]^arr[r];
        arr[r]=arr[l]^arr[r];
        arr[l]=arr[l]^arr[r];
        reverseArray(arr,l+1,r-1);
    }

    public static boolean isPalindrome(String s)
    {
        return true;
    }
}

