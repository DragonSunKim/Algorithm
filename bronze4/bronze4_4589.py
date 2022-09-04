N = int(input())
li = []
for i in range(0, N):
    a, b, c = map(int, input().split())

    if a < b and b < c:
        li.append("Ordered")
    elif a > b and b > c:
        li.append("Ordered")
    else:
        li.append("Unordered")

print("Gnomes:")
for i in li:
    print(i)