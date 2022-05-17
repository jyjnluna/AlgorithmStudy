T = int(input())

for i in range(1, T+1):
    N = int(input())
    li = list(map(int, input().split()))

    result = 0
    max_index = li[N-1]

    for j in range(N-2, -1, -1):
        if max_index < li[j]:
            max_index = li[j]

        else:
            result += max_index - li[j]

    print("#"+str(i), result)

