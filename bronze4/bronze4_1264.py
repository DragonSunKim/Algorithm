li = ["a", "e", "i", "o", "u", "A", "E","I", "O", "U"]
while True:
    x = input()

    if x == "#":
        break

    count = 0

    for i in li:
        for j in range(0, len(x)):
            if x[j] == i:
                count += 1

    print(count)

