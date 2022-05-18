T = int(input())

dr = [-0, 1, 0, -1]
dc = [1, 0, -1, 0]

for i in range(1, T+1):
    testCase = int(input())
    snail = [[0]*testCase for _ in range(testCase)]
    r, c = 0, 0
    dist = 0

    for j in range(1, testCase*testCase + 1):
        snail[r][c] = j
        r += dr[dist]
        c += dc[dist]

        if r < 0 or c < 0 or r >= testCase or c >= testCase or snail[r][c] != 0:
            r -= dr[dist]
            c -= dc[dist]

            dist = (dist + 1) % 4

            r += dr[dist]
            c += dc[dist]

    print("#"+str(i))
    for row in snail:
        print(*row)



