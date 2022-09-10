N = int(input())

for i in range(0, N):
    num, a, b, c = map(int, input().split())

    if ((a+b+c)>=55) and ((35*0.3) <= a) and ((25*0.3) <= b) and ((40*0.3) <= c):
        print(num, a+b+c, "PASS")
    else:
        print(num, a+b+c, "FAIL")