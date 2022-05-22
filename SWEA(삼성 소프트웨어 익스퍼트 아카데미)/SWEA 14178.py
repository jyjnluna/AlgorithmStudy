T = int(input())

for i in range(1, T+1):
    N, D = list(map(int, input().split()))

    D = D * 2 + 1
    result = N // D
    if N % D != 0:
        result += 1

    print("#"+str(i), result)
