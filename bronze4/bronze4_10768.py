m_ccc = 2
d_ccc = 18

m_input = int(input())
d_input = int(input())

if (m_input < m_ccc):
    print("Before")
elif (m_input == 2):
    if d_input < d_ccc:
        print("Before")
    elif d_input == d_ccc:
        print("Special")
    else:
        print("After")
else:
    print("After")