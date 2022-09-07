N, M = map(int, input().split())

li = []
for i in range(0, N):
    s = input()
    
    a = ""
    for j in range(M-1,-1,-1):
        a += s[j]
    li.append(a)

for i in li:
    print(i)