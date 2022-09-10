A = int(input())
B = int(input())
C = int(input())
D = int(input())

li = []
li.append(A)
li.append(B)
li.append(C)
li.append(D)
li.remove(min(li))

E = int(input())
F = int(input())

li2= []
li2.append(E)
li2.append(F)

li2.remove(min(li2))

print(sum(li) + sum(li2))