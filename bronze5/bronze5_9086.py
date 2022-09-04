num = int(input())

li = []

for i in range(0, num):
    a = input()

    li.append(a)

for i in li:
    print(i[0]+i[-1])