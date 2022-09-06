K, N, M = map(int, input().split())

lack_money = (K*N) - M

if lack_money >= 0:
    print(lack_money)
else:
    print(0)