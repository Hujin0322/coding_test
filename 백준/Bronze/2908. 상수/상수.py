a,b = map(list,input().split())
A = a[2]+a[1]+a[0]
B = b[2]+b[1]+b[0]

if int(A) > int(B):
    print(int(A))
else: print(int(B))