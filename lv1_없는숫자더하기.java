import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        
        for(int i : numbers) {
            map.put(i, true);
        }
        
        for(int i = 1 ; i < 10 ; i++) {
            if(!map.containsKey(i))
                answer += i;
        }

        return answer;
    }
}