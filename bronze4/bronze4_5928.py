D, H, M = map(int, input().split())

my_day = (D - 11) * 24 * 60
my_hour = H * 60
my_minute = M

ans = (my_day + my_hour + my_minute) - ((11*60) + (11))

if ans < 0:
    print(-1)
else:
    print(ans)