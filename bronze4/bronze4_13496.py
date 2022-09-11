K = int(input())
count = 0
for i in range(0, K):
    n, s, d = map(int, input().split())
    total = 0
    for j in range(0, n):
        x, y = map(int, input().split())
        if x <= (s*d):
            total += y
    
    count += 1
    print("Data Set "+str(count)+":")
    print(total)
    print()