import statistics

N = int(input())

score = list(map(int, input().split()))

print(statistics.median(score))
