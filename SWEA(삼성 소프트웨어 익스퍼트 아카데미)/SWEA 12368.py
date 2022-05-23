T = int(input())

for tc in range(1, T+1):
    A, B = list(map(int,input().split()))

    hour = A + B

    if hour >= 24:
        hour -= 24

    print("#"+str(tc), hour)
