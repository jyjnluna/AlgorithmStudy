T = int(input())

for i in range(1, T+1):
    N = int(input())

    answer = 0
    row = [0] * N

    def is_promising(x):
        for i in range(x):
            if row[x] == row[i] or abs(row[x] - row[i]) == abs(x - i):
                return False

        return True

    def n_queen(x):
        global answer
        if x == N:
            answer += 1
            return

        else:
            for i in range(N):
                row[x] = i
                if is_promising(x):
                    n_queen(x+1)

    n_queen(0)
    print("#"+str(i), answer)
