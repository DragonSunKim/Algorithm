T = int(input())
A, B, C, D, E = map(int, input().split())

li = []
li.append(A)
li.append(B)
li.append(C)
li.append(D)
li.append(E)

count = 0

for i in li:
    if T == i:
        count += 1
print(count)