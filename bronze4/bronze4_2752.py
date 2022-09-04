li = list(map(int, input().split()))

a = min(li)
li.remove(a)
b = min(li)
li.remove(b)
c = li[0]

print(a, b, c)