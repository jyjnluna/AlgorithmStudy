Chess = [1,1,2,2,2,8]
Count = list(map(int,input().split()))
for i in range(6):
    print(Chess[i]-Count[i], end = ' ')
