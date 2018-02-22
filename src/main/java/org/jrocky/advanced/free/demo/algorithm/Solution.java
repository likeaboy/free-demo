package org.jrocky.advanced.free.demo.algorithm;

class Solution {
	
	public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int rst = new Solution().removeDuplicates(nums);
        System.out.println(rst);
    }
	
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int rst = 1;
        int tmp = nums[0];
        for(int i=1;i<nums.length;i++){
            if(tmp == nums[i])
                continue;
            rst++;
            tmp = nums[i];
        }
        return rst;
    }
}