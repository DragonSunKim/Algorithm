from math import ceil


R, C, N = map(int, input().split())

c_num = ceil(C / N)
r_num = ceil(R / N)

ans = c_num * r_num

print(ans)