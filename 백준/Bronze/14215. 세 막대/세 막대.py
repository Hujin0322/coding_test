list = list(map(int,input().split()))
list.sort()
a,b,c=list

if a+b<=c:
    c = a+b-1
print(a+b+c)