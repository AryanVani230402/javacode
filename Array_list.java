import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Array_list {
    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        if(nums.length == 0 || target<nums[0] || target>nums[nums.length-1])
        {
            return ans;
        }

        int mid = nums.length/2;

        if(nums[mid] == target)
        {
            int a = mid;
            int b = mid;
            while(nums[a] == target)
            {
                a--;
            }
            while(nums[b] == target)
            {
                b++;
            }

            ans[0] = a+1;
            ans[1] = b-1;

            return ans;
        }
        else if(nums[mid]>target)
        {
            searchRange(Arrays.copyOfRange(nums,0,mid+1),target);
        }
        else
        {
            searchRange(Arrays.copyOfRange(nums,mid+1,nums.length),target);
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums [] ={5,7,7,8,8,10};
        System.out.print(searchRange(nums,6)[0] + " ");
        System.out.println(searchRange(nums,6)[1]);
    }
}
