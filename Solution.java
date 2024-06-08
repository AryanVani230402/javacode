import java.util.*;
class Solution {
    public static void subsequence(int idx, int curr_sum, int[] arr, ArrayList<Integer> list, List<List<Integer>> ans) {
        if (idx >= arr.length || list.size() >= 3) {
            if (curr_sum == 0 && list.size() == 3) {
                if(list.get(0)+ list.get(1)+ list.get(2) == 0)
                {
                    Collections.sort(list);
//                 System.out.println(curr_sum);
//                 System.out.println(list);
                    if (!ans.contains(list)) {
                        ans.add(new ArrayList<>(list));
                    }
                }
            }
            return;
        }

        list.add(arr[idx]);
        curr_sum += arr[idx];
        subsequence(idx + 1, curr_sum, arr, list, ans);

        list.remove(list.size() - 1);
        curr_sum -= arr[idx];
        subsequence(idx + 1, curr_sum, arr, list, ans);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsequence(0, 0, nums, list, ans);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,-1,-1,0};
//        System.out.println(threeSum(arr));
        int a = -1;
        int b = -1;
        System.out.println(a-b);
    }
}