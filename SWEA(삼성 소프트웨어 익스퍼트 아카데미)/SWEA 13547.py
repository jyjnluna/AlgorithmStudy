T = int(input())

for tc in range(1, T+1):
    test_case = input()
    a = test_case.count("x")
    if a >= 8:
        result = "NO"

    else:
        result = "YES"

    print("#"+str(tc), result)

