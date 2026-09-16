class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dict = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            dict.put(nums[i],i);
        int difference=0;
        for(int i=0;i<nums.length;i++)
        {
            difference = target - nums[i];
            if((dict.containsKey(difference))&&(dict.get(difference)!=i))
                return new int[]{i,dict.get(difference)};
        }
        return new int[0];
    }
}
