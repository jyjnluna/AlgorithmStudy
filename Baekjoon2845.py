x,y = map(int,input().split())
p = list(map(int,input().split()))
z = x*y

for i in p:
    print(i-z,end=' ')
