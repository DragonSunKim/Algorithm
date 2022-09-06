a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())

li= []
li.append(a)
li.append(b)
li.append(c)
li.append(d)
li.append(e)

for i in range(0, len(li)):
    if li[i] < 40:
        li[i] = 40

avg = int(sum(li)/len(li))
print(avg)