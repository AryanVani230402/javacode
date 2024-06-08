import java.util.ArrayList;

public class Merge_Sort {
    public static void mergeSort(int [] arr,int low,int high)
    {
        if(low==high)
        {
            return;
        }
        int mid=(low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static int [] merge(int[] arr, int low, int mid, int high)
    {
        ArrayList <Integer> temp = new ArrayList<>();
        int ptr1=low;
        int ptr2=mid+1;

        while(ptr1<=mid && ptr2<=high)
        {
            if(arr[ptr1]<=arr[ptr2])
            {
                temp.add(arr[ptr1]);
                ptr1++;
            }
            else
            {
                temp.add(arr[ptr2]);
                ptr2++;
            }
        }

        while(ptr1<=mid)
        {
            temp.add(arr[ptr1]);
            ptr1++;
        }

        while(ptr2<=high)
        {
            temp.add(arr[ptr2]);
            ptr2++;
        }

        for (int i = low; i<=high; i++)
        {
            arr[i]= temp.get(i-low);
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr ={4,7,342,8,34,78,78,43456,3,8,7,12,2,4,45,55,44,4,6};
        mergeSort(arr,0, arr.length-1);
        for (int m : arr)
        {
            System.out.print(m+" ");
        }
    }
}
