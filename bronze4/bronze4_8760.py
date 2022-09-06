Z = int(input())

for i in range(0, Z):
    W, K = map(int, input().split())

    ans = (W*K)//2
    print(ans)
    