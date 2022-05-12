import statistics

T = int(input())

for i in range(1, T+1):
    li = list(map(int, input().split()))

    avg = round(statistics.mean(li))

    print("#"+str(i), avg)

