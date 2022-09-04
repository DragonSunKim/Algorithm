A, B, C = map(int, input().split())
D = int(input())

b_hour = D // 3600
b_minute = (D%3600)//60
b_seconds = (D%60)

# print(hour, minute, seconds)

# print(A+hour,B+minute,C+seconds)

a_hour = A + b_hour
a_minute = B + b_minute
a_seconds = C + b_seconds



a_hour = (a_hour +(a_minute // 60) + (a_seconds // 3600)) % 24
a_minute = (a_minute + (a_seconds //60)) % 60
a_seconds = a_seconds % 60

print(a_hour, a_minute, a_seconds)