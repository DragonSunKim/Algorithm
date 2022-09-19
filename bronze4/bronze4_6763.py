limit = int(input())
speed = int(input())

dif = speed - limit
if dif <= 0:
    print("Congratulations, you are within the speed limit!")
elif dif >= 1 and dif <= 20:
    print("You are speeding and your fine is $100.")
elif dif > 20 and dif <= 30:
    print("You are speeding and your fine is $270.")
elif dif > 30 :
    print("You are speeding and your fine is $500.")