li = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
# print(len(li))

S = input()

for i in li:
    count = 0
    for j in range(0, len(S)):
        if S[j] == i:
            count += 1
    
    print(count, end=" ")