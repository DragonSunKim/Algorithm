a, b = map(int, input().split())


x = a - (a*(b/100))

if x >= 100:
    print(0)
else:
    print(1)

# print(x)

