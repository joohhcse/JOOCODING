
public class lv2_124나라의숫자 {
	
//	124 나라가 있음
//	124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
//	-124 나라에는 자연수만 존재합니다.
//	-124 나라에는 모든 수를 표현할 때 1,2,4만 사용합니다.
//	예를 들어 124나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
//	1:1
//	2:2
//	3:4
//	4:11
//	5:12
//	6:14
//	7:21
//	8:9
//	9:24
//	10:41
//	자연수 n이 매개변수로 주어질 때, n을 124나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution함수를 완성하시오

	//코딩문제가 아니라 수학문제 같당 ==> 3진법!
	
	public static String solution(int n) {
		String[] numbers = {"4", "1", "2"};
		String answer = "";
		
		int num = n;
		while (num > 0) {
			int remainder = num % 3;
			num /= 3;
			
			if(remainder == 0) {
				num--;
			}
			
			answer = numbers[remainder] + answer;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String retStr = solution(10);
		System.out.println(retStr);
	}

}
