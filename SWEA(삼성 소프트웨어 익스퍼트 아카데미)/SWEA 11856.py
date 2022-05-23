TC = int(input())
for t in range(1, TC+1):
    S = list(map(str, input()))

    result = 0

    for i in range(4):
        count = 0
        for j in range(4):
            if S[i] == S[j]:
                count += 1

        if count == 2:
            result += 1

    if result == 4:
        print("#"+str(t), "Yes")

    else:
        print("#"+str(t), "No")
