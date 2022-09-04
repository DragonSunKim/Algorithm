a_h1, a_m1, a_s1, a_h2, a_m2, a_s2 = map(int, input().split())
b_h1, b_m1, b_s1, b_h2, b_m2, b_s2 = map(int, input().split())
c_h1, c_m1, c_s1, c_h2, c_m2, c_s2 = map(int, input().split())

a_s = a_s2 - a_s1 
a_m = a_m2 - a_m1
a_h = a_h2 - a_h1

if a_s < 0:
    a_m -= 1
    a_s = 60 + a_s
if a_m < 0:
    a_h -= 1
    a_m = 60 + a_m

b_s = b_s2 - b_s1 
b_m = b_m2 - b_m1
b_h = b_h2 - b_h1

if b_s < 0:
    b_m -= 1
    b_s = 60 + b_s
if b_m < 0:
    b_h -= 1
    b_m = 60 + b_m
c_s = c_s2 - c_s1 
c_m = c_m2 - c_m1
c_h = c_h2 - c_h1

if c_s < 0:
    c_m -= 1
    c_s = 60 + c_s
if c_m < 0:
    c_h -= 1
    c_m = 60 + c_m

print(a_h, a_m, a_s)
print(b_h, b_m, b_s)
print(c_h, c_m, c_s)