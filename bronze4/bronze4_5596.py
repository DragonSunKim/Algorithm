a, b, c, d = map(int, input().split())
e, f, g, h = map(int, input().split())

S = a + b + c + d
T = e + f + g + h

print(max(S,T))