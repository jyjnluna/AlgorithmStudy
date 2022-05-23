for t in range(1, 11):
    tc = int(input())

    array = []

    for i in range(100):
        array.append(list(map(int, input().split())))

    sum_col = 0
    for i in range(100):
        sum = 0
        for j in range(100):
            sum += array[i][j]
        if sum > sum_col:
            sum_col = sum

    sum_row = 0
    for i in range(100):
        sum = 0
        for j in range(100):
            sum += array[j][i]
        if sum > sum_row:
            sum_row = sum

    sum_dia = 0
    for i in range(100):
        sum1 = 0; sum2 = 0
        sum1 += array[i][i]
        sum2 += array[i][99-i]

    if max(sum1, sum2) > sum_dia:
        sum_dia = max(sum1, sum2)

    print("#"+str(t), max(sum_col, sum_row, sum_dia))
