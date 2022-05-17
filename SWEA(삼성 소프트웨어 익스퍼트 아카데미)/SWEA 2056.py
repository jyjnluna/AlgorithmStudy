t = int(input())

for i in range(t):
    print("#%s" %(i+1),end=" ")
    testCase = input()
    year = int(testCase[0:4])
    month = int(testCase[4:6])
    day = int(testCase[6:8])

    if month < 1 or month > 12:
        print(-1)
        continue

    if month%2 == 1:
        if day < 1 or day > 31:
            print(-1)
            continue

    if month%2 == 0:
        if day < 1 or day > 30:
            print(-1)
            continue

    if month == 2:
        if day < 1 or day > 28:
            print(-1)
            continue

    if month == 0:
        print(-1)
        continue

    print("%04d/%02d/%02d" %(year, month, day))
