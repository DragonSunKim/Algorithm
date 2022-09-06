N, M = map(int, input().split())

list_1 = []
list_2 = []

for i in range(0, N):
    input_list = list(map(int, input().split()))
    list_1.append(input_list)


for i in range(0, N):
    input_list = list(map(int, input().split()))
    list_2.append(input_list)


for i in range(0, N):
    for j in range(0, M):
        print(list_1[i][j]+list_2[i][j], end=" ")
    print()