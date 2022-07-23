import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lv1_모의고사 {

	
    public static int[] solution(int[] answers) {
        
        int[] member1 = {1, 2, 3, 4, 5};
        int[] member2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] member3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int [3];
        
        for(int i = 0 ; i < answers.length ; i++) {
            if(answers[i] == member1[i % member1.length])
                count[0]++;
            if(answers[i] == member2[i % member2.length])
            	count[1]++;
            if(answers[i] == member3[i % member3.length])
            	count[2]++;
        }

        List<Integer> list = new ArrayList<Integer>();
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        if(max == count[0])
        	list.add(1);
        if(max == count[1])
        	list.add(2);
        if(max == count[2])
        	list.add(3);

        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1,3,2,4,2};
		int[] arr2 = {1,2,3,4,5};
		
		solution(arr1);
//		solution(arr2);
		
//		System.out.println(Arrays.toString(solution(arr1)));
//		System.out.println(Arrays.toString(solution(arr2)));
		
	}

}
