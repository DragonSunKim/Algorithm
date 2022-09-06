num1, num2, num3, num4, num5 = map(int, input().split())

ans = 0
list_item = [num1, num2, num3, num4, num5]
for i in range(0, 5):
    ans = ans + list_item[i]**2

ans %= 10
print(ans)