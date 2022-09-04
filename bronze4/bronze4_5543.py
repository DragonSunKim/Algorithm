a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())

a_min = min(a+d-50, a+e-50)
b_min = min(b+d-50, b+e-50)
c_min = min(c+d-50, c+e-50)

print(min(a_min, b_min, c_min))