T = int(input())

li = []
for i in range(0, T):
    A, B = map(int, input().split())
    li.append([A, B])

n = 1
for i in li:
    print("Case #"+str(n)+": "+str(i[0])+" + "+str(i[1])+" = "+str(sum(i)))
    n += 1