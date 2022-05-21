T = int(input())

day = {"MON" : 1, "TUE" : 2, "WED" : 3, "THU" : 4, "FRI" : 5, "SAT" : 6, "SUN" : 7}

for i in range(1, T+1):
    test_case = input()

    if test_case == "SUN":
        print("#"+str(i), 7)

    else:
        print("#"+str(i), day["SUN"] - day[test_case])
    
