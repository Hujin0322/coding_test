a,b=map(int,input().split())
c = min(a, b)

result = 0
for i in range(c,0,-1):
    if (a%i==0) & (b%i==0):
        result = i
        break
print(result)
print(int(a*b/result))