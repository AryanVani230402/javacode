import java.util.Arrays;

public class DS17_bubbleSort {

    public static int[] bubble_sort(int[] arr)
    {
        int temp;
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j=0;j< arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

//                    arr[j]=arr[j]^arr[j+1];
//                    arr[j+1]=arr[j]^arr[j+1];
//                    arr[j]=arr[j]^arr[j+1];

//                    arr[j]=arr[j]+arr[j+1];
//                    arr[j+1]=arr[j]-arr[j+1];
//                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int [] arr = {7,1,4,4,77,63,11,92,95,80,2,3,9,5};
        System.out.println((Arrays.toString(bubble_sort(arr))));
    }
}