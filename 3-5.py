
n, k = map(int, input().split())
result = 0

# while(n >= k) :
#     if n % k == 0:
#         n %= k
#         n -= 1
#         result += 1
#         print("result1 >>>" + str(result))
#         if n == 1:
#             break;
#     else :
#         n -= 1
#         result += 1
#         print("result2 >>>" + str(result))
#         if n == 1:
#             break;

while n >= k :
    while n % k != 0:
        n -= 1
        result += 1
    n //= k
    result += 1

while n > 1 :
    n -= 1
    result += 1

print(result)

