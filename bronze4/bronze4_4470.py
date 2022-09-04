N = int(input())
li = []
for i in range(0, N):
    ss = input()
    li.append(ss)

for i in range(1, N+1):
    print(str(i)+". "+li[i-1])