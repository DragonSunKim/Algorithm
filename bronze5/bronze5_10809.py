# ord(문자) : 아스키 코드 반환
# chr(숫자) : 숫자에 맞는 아스키 코드 반환

# print(ord("a"), ord("z"))


# word = input()

# for i in range(ord("a"), ord("z")+1):
#     for j in range(0, len(word)):
#         if word[j] == chr(i):
#             a = 1
    
#     if a=

word = input()

li = [chr(i) for i in range(ord("a"), ord("z")+1)]

for i in range(ord("a"), ord("z")+1):
    z = -1
    for j in range(0, len(word)):
        if (word[j] == chr(i)) and z == -1:
            z = j
    print(z ,end= " ")
    