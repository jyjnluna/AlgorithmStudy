testCase = 10

for i in range(1, testCase+1):
    dumpNumber = int(input())
    boxHeight = list(map(int, input().split()))

    for j in range(dumpNumber):
        maxIndex = boxHeight.index(max(boxHeight))
        minIndex = boxHeight.index(min(boxHeight))
        boxHeight[maxIndex] -= 1
        boxHeight[minIndex] += 1

    print("#"+str(i), max(boxHeight) - min(boxHeight))
