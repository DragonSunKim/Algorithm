A, B = map(int, input().split())

if A == B:
    print(A)
elif A != B:
    if A > B:
        print(A)
    else:
        print(B)