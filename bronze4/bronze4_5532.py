L = int(input()) # 방학 총 일수
A = int(input()) # 풀어야 하는 국어 페이지수
B = int(input()) # 풀어야 하는 수학 페이지수
C = int(input()) # 풀 수 있는 최대 국어 페이지 수
D = int(input()) # 풀 수 있는 최대 수학 페이지 수

if A%C == 0:
    a = A // C
else:
    a = (A//C)+1

if B%D == 0:
    b = B // D
else:
    b = (B//D)+1

m = max(a,b)
print(L-m)