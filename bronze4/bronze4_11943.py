A, B = map(int, input().split())
C, D = map(int, input().split())

if (A+D) >= (B+C):
    print(B+C)
else:
    print(A+D)