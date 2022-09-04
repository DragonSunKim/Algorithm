# X = 영수증에 적힌 총 금액
X = int(input())

# N = 영수증에 적힌 구매한 물건의 종류의 수
N = int(input())

# 계산한 총 금액
total_money = 0

for i in range(0,N):

    # a: 각 물건의 가격, b: 개수
    a, b = map(int, input().split())

    total_money += (a*b)

if X == total_money:
    print("Yes")
else:
    print("No")