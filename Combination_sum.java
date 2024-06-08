import java.util.*;

public class Combination_sum {


    public static void C_sum1(int idx,int arr [],int sum,List list,List ans)
    {
        if(idx>=arr.length || sum<=0)
        {
            if(sum==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[idx]);
        C_sum1(idx,arr,sum-arr[idx],list,ans);
        list.remove(list.size()-1);

        C_sum1(idx+1,arr,sum,list,ans);
    }

    public static void C_sum2(int idx,int arr [],int sum,ArrayList arrlist,List ans)
    {
        System.out.println("Running");
        if(idx>=arr.length || sum<=0)
        {
            if(sum==0)
            {
                ArrayList ar = new ArrayList<>(arrlist);
                Collections.sort(ar);
                if(!ans.contains(ar))
                {ans.add(ar);}
            }
            return;
        }
        arrlist.add(arr[idx]);
        C_sum2(idx+1,arr,sum-arr[idx],arrlist,ans);
        arrlist.remove(arrlist.size()-1);

        C_sum2(idx+1,arr,sum,arrlist,ans);
    }

    public static void C_sum2_fast(int idx,int arr [],int sum,ArrayList arrlist,List ans)
    {
        if(sum==0)
        {
            ans.add(new ArrayList<>(arrlist));
            return;
        }

        for(int i = idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>sum)
            {
                break;
            }

            arrlist.add(arr[i]);
            C_sum2_fast(i+1,arr,sum-arr[i],arrlist,ans);
            arrlist.remove(arrlist.size()-1);
        }
    }


    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List <Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

//        C_sum1(0,arr,8,list,ans);
//        System.out.println(ans);


        C_sum2_fast(0,arr,30,arrayList,ans);
        System.out.println(ans);
    }
}
