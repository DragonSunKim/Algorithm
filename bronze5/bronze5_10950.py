T = int(input())

li = []
for i in range(0, T):
    A, B = map(int, input().split())
    li.append([A, B])

for i in li:
    print(sum(i)) 