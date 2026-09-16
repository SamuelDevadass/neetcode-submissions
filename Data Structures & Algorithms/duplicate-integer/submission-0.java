class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> my_list = new HashSet<>();
        for(int num : nums){
            if(my_list.contains(num))
                return true;
            my_list.add(num);
        }
    return false;
    }
}