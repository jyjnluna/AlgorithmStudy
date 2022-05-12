T = int(input())

for testCase in range(1,T+1):
    numbers = list(map(int, input().split()))

    oddNumberSum = 0

    for i in numbers:
        if i%2 == 1:
            oddNumberSum += i

    print("#"+str(testCase),str(oddNumberSum))
