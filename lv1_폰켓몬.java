import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int myPokeMonCnt = nums.length / 2;
        for(int i = 0 ; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        
        if(myPokeMonCnt < set.size())
            return myPokeMonCnt;
        else
            return set.size();
    
    }
}