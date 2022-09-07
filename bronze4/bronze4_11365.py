while True:
    pw = input()

    if pw == "END":
        break
    
    x=""

    for i in range(len(pw)-1,-1,-1):
        x += pw[i]
    print(x)