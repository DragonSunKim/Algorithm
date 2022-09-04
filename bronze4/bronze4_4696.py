while True:
    n = float(input())

    if n == 0:
        break

    ans = 1 + (n) + (n**2) + (n**3) + (n**4)

    # print(round(ans,2))
    print("%.2f"%ans)