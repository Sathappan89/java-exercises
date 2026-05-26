package JavaArrays;

import java.util.HashMap;
import java.util.HashSet;

public class test {

	class Solution {
		public int[] twoSum(int[] nums, int target) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int ans[] = new int[2];
			for (int i = 0; i < nums.length; i++) {
				int needednumber = target - nums[i];
				if (map.containsKey(needednumber)) {
					ans[0] = map.get(needednumber);
					ans[1] = i;
					break;
				} else {
					map.put(nums[i], i);
				}
			}
			return ans;
		}
	}}



class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left=0, right = n-1;
        while(left<right){
            int mid = (right+left)/2;
            if(nums[mid]>=nums[right]){
                left = mid+1;
            }else if(nums[mid]<nums[right]){
                right = mid;
            }
        }
        int pivot = left;
        left =0; right = n-1;
        if(nums[pivot]<= target && target <= nums[right]){
            left = pivot;
        }else{
            right = pivot -1;
        }
        int ans = binarySearch(nums,left,right,target);
        return ans;
    }

    private int binarySearch(int [] nums, int left, int right, int target){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
        }
    return -1;
    }
}
 