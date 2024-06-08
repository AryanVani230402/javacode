class debug {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] arr = {7,1,4,2,3,9,5};
        int [] a = sort(arr);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static int[] sort(int[] arr)
    {
        int i,j,temp;
        int idx = 0;
//        boolean swap = false;
        for(i=0;i<arr.length;i++)
        {
//            swap = false;
            int max=arr[0];
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>max)
                {
//                    swap = true;
                    max = arr[j];
                    idx = j;
                }
            }
//            if(swap)
//            {
                temp = arr[idx];
                arr[idx] = arr[arr.length-1-i];
                arr[arr.length-1-i] = arr[idx];
//            }
        }
        return arr;
    }
}
