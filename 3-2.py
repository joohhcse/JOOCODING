

# 큰 수의 법칙은 일반적으로 통계 분야에서 다루어지는 내용이지만 동빈이는
# 본인만의 방식으로 다르게 사용하고 있다. 
# 동빈이의 큰 수의 법칙은 다양한 수로 이루어진 배열이 있을때 
# 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다.
# 단 배열의 특정한 인덱스(번호)에 해당하는 수가 연속해서 K번 초과하여 더해질 수 없는 것이 이 법칙의 특징이다
# 예) 순서대로 2 4 5 4 6 으로어진 배열이 있을 때 M이 8이고, K가 3이라고 가정
# 이 경우 특정한 인덱스의 수가 연속해서 세 번까지만 더해질 수 있으므로 큰 수의 법칙에 따른 결과는
#  6+6+6+5+6+6+6+5 인 46이 된다
#  단 서로 다른 인덱스에 해당하느ㅏㄴ 수가 같은 경우에도 서로 다른것으로 간주한다
#  예를 들어 순서대로  3 4 3 4 3 으로 이루어진 배열이 있을 때 M이 7이고 K가 2라고 가정
#  이 경우 두번째 원소에 해당하는 4와 네번째 원소에 해당하는 4를 번갈아 두번씩 더하는 것이 가능하다
#  결과적으로 4+4+4+4+4+4+4 인 28이 도출된다.
# 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰수의 법칙에 따른 결과를 출력하시오 


# N, M, K를 공백을 기준으로 구분하여 입력 받기
n, m, k = map(int, input().split())
# N개의 수를 공백을 기준으로 구분하여 입력 받기
data = list(map(int, input().split()))

data.sort() # 입력 받은 수들 정렬하기
first = data[n - 1] # 가장 큰 수
second = data[n - 2] # 두 번째로 큰 수

# 가장 큰 수가 더해지는 횟수 계산
count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += (count) * first # 가장 큰 수 더하기
result += (m - count) * second # 두 번째로 큰 수 더하기

print(result) # 최종 답안 출력

#--java
# import java.util.*;

# public class Main {

#     public static void main(String[] args) {
#         Scanner sc = new Scanner(System.in);

#         // N, M, K를 공백을 기준으로 구분하여 입력 받기
#         int n = sc.nextInt();
#         int m = sc.nextInt();
#         int k = sc.nextInt();

#         // N개의 수를 공백을 기준으로 구분하여 입력 받기
#         int[] arr = new int[n];
#         for (int i = 0; i < n; i++) {
#             arr[i] = sc.nextInt();
#         }

#         Arrays.sort(arr); // 입력 받은 수들 정렬하기
#         int first = arr[n - 1]; // 가장 큰 수
#         int second = arr[n - 2]; // 두 번째로 큰 수

#         // 가장 큰 수가 더해지는 횟수 계산
#         int cnt = (m / (k + 1)) * k;
#         cnt += m % (k + 1);

#         int result = 0;
#         result += cnt * first; // 가장 큰 수 더하기
#         result += (m - cnt) * second; // 두 번째로 큰 수 더하기

#         System.out.println(result);
#     }

# }