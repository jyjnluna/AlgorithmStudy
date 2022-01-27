result = 0
for i in list(map(int,input().split())):
    result += i**2
print(result%10)
