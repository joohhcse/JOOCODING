class Solution {
    public int solution(int[] nums) {
        int answer = -1;

        int count = 0;
        
        for(int i=0 ; i < nums.length ; i++) {
            for(int j=i+1 ; j < nums.length ; j++) {
                for(int k=j+1 ; k < nums.length ; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int primeNumCnt = 0;
                    for(int l = 1 ; l <= sum ; l++) {
                        if(sum % l == 0)
                            primeNumCnt++;
                    }
                    if(primeNumCnt == 2) {
                        count++;
                    }
                    
                }
            }
        }
        answer = count;
        
        return answer;
    }
}