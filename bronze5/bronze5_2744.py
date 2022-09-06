input_word = input()
a = ""
for i in range(0, len(input_word)):
    if input_word[i].isupper():
        a += input_word[i].lower()
    else:
        a += input_word[i].upper()

print(a)