testCase = 10

for t in range(1, testCase+1):
    n = int(input())

    li = list(map(int, input().split()))

    houseHold = 0

    for i in range(2, n-2):
        case1 = li[i] - li[i-2]
        case2 = li[i] - li[i-1]
        case3 = li[i] - li[i+1]
        case4 = li[i] - li[i+2]

        if case1 > 0 and case2 > 0 and case3 > 0 and case4 > 0:
            houseHold += min(case1, case2, case3, case4)

    print("#"+str(t), str(houseHold))

