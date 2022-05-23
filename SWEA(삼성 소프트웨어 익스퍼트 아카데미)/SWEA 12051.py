TC = int(input())

for t in range(1, TC + 1):
    N, PD, PG = list(map(int, input().split()))

    if PD != 0 and PG == 0:
        result = "Broken"

    elif PD != 100 and PG == 100:
        result = "Broken"

    else:
        result = "Broken"

        for i in range(1, N + 1):
            if (i * PD) / 100 == (i * PD) // 100:
                result = "Possible"
                break

    print("#"+str(t), result)
