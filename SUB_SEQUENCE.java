import java.util.ArrayList;
import java.util.Collections;

public class SUB_SEQUENCE {
    public static void subsequence (int idx, int [] arr, ArrayList arrayList, int size)
    {
        if(idx>=size)
        {
            System.out.println(arrayList);
            return;
        }

        arrayList.add(arr[idx]);
        subsequence(idx+1,arr,arrayList,size);
        arrayList.remove(arrayList.size()-1);

        subsequence(idx+1,arr,arrayList,size);
    }

    public static void subsequence_with_specific_sum(int idx, int [] arr, ArrayList<Integer> arrayList, int curr_sum, int req_sum,ArrayList<ArrayList<Integer>> ans)
    {
        if(idx >= arr.length)
        {
            if(curr_sum==req_sum&& arrayList.size()==3)
            {
                Collections.sort(arrayList);
                if(!ans.contains(arrayList))
                {
                    ans.add(new ArrayList<>(arrayList));
                }
//                System.out.println(arrayList);
            }
            return;
        }
        
        arrayList.add(arr[idx]);
        curr_sum+=arr[idx];
        subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum,ans);
        
        arrayList.remove(arrayList.size()-1);
        curr_sum-=arr[idx];
        subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum,ans);
    }

    public static boolean One_subsequence_with_specific_sum(int idx, int [] arr, ArrayList arrayList, int curr_sum, int req_sum)
    {
        if(idx >= arr.length)
        {
            if(curr_sum==req_sum)
            {
//                ans_list.add(arrayList);
                System.out.println(arrayList);
                return true;
            }
            return false;
        }

        arrayList.add(arr[idx]);
        curr_sum+=arr[idx];

        if(One_subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum))
        {
            return true;
        }


        arrayList.remove(arrayList.size()-1);
        curr_sum-=arr[idx];

        if(One_subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum))
        {return true;}

        return false;
    }


    public static int Count_subsequence_with_specific_sum(int idx, int [] arr, ArrayList arrayList, int curr_sum, int req_sum)
    {
        if(idx >= arr.length)
        {
            if(curr_sum==req_sum)
            {
//                ans_list.add(arrayList);
//                System.out.println(arrayList);
                return 1;
            }
            return 0;
        }

        arrayList.add(arr[idx]);
        curr_sum+=arr[idx];
        int left = Count_subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum);

        arrayList.remove(arrayList.size()-1);
        curr_sum-=arr[idx];
        int right = Count_subsequence_with_specific_sum(idx+1,arr,arrayList,curr_sum,req_sum);

        return left + right;
    }
    public static void main(String[] args) {
//        int [] my_arr = {-1,0,1,2,-1,-4};
        int [] my_arr = {1,2,3};
        ArrayList <Integer> array_list = new ArrayList<>();
        ArrayList <ArrayList<Integer>> ans_list = new ArrayList<>();
        subsequence(0,my_arr,array_list, my_arr.length);
//        System.out.println(Count_subsequence_with_specific_sum(0,my_arr,array_list,0,2));
//        subsequence_with_specific_sum(0,my_arr,array_list,0,0,ans_list);
//        System.out.println(ans_list);
    }
}
