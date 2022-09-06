D = int(input())

li = []
a, b, c, d, e = map(int, input().split())
li.append(a)
li.append(b)
li.append(c)
li.append(d)
li.append(e)

ans = li.count(D)
print(ans)