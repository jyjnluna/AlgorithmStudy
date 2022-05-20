dic = {}

for i in range(1, 10):
    for j in range(1, 10):
        if not dic.get(i*j):
            dic[i*j] = 1

TC = int(input())

for i in range(1, TC+1):
    N = int(input())

    if dic.get(N):
        print("#"+str(i), "Yes")

    else:
        print("#"+str(i), "No")
