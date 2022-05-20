TC = int(input())
for i in range(1, TC+1):
    A, B = map(int, input().split())

    if A >= 10 or B >= 10:
        result = -1

    else:
        result = A * B

    print("#"+str(i), result)
