import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int []student = new int[n];
        
        Arrays.fill(student, 1);
        for (int i : lost)
            student[i - 1] -= 1;
        for (int i : reserve)
            student[i - 1] += 1;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) //왼쪽 검사
                    student[i - 1] -= 1;
                else if (i < n - 1 && student[i + 1] == 2)
                    student[i + 1] -= 1;
                else
                    answer--;
            }
        }
        return answer;
    }
}