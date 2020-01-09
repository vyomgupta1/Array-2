// Time Complexity :
//      n - length of array
//      total time complexity will be O(n)
//
// Space Complexity :
//      constant space
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        if(nums.length==0)
            return al;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])-1]>0)
            {
                nums[Math.abs(nums[i])-1] = 0-nums[Math.abs(nums[i])-1];      
            }
        }
        for(int i=0; i<nums.length;i++)
        {
            if((nums[i])>0)
            {
                al.add(i+1);
            }
        }
        return al;
    }
}