T = int(input())

for testCase in range(1, T+1):
    revenue = 0
    n = int(input())
    farm = [list(map(int, input().strip())) for _ in range(n)]
    half = n // 2
    back = half

    for i in range(n):
        for j in range(abs(half - i), abs(n - back)):
            revenue += farm[i][j]

        back = back - 1 if i < half else back + 1
    print("#"+str(testCase), revenue)
