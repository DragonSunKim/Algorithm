N = int(input())

for i in range(0, N):
    s = input()

    if len(s) >= 6 and len(s) <= 9:
        print("yes")
    else:
        print("no")