n = int(input())

ans = 1
for i in range(1, n+1):
    ans = ans * i

ans_str = str(ans)

print(ans_str[-1])