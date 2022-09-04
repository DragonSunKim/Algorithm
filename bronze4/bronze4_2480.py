x, y, z = map(int, input().split())

if x == y and y == z:
    print(10000+x*1000)
elif x == y or x == z or y == z:
    if x == y:
        print(1000+x*100)
    elif x == z:
        print(1000+x*100)
    else:
        print(1000+y*100)
else:
    print(max(x,y,z)*100)