x, y = map(int, input().split())

# a + b = x
# a - b = y

a = (x+y)//2
b = x - a

if (x+y) %2 != 0:
    print(-1)
elif a < 0 or b < 0:
    print(-1)
else:
    print(a, b)