from math import ceil


k, w, m = map(int, input().split())

ans = ceil((w - k)/m)

print(ans)

# print(ceil(2.1))