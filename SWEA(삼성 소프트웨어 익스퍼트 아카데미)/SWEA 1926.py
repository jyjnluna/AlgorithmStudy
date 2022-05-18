N = int(input())

for i in range(1, N+1):
    num = sum(1 for j in str(i) if j in ["3", "6", "9"])

    if num == 0:
        print(i, end=" ")

    else:
        print("-"*num, end=" ")
