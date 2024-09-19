import math

a = int(input())
list = list(map(int,input().split()))
b,c = map(int,input().split())
cnt = 0

for i in range(len(list)):
    q,r = divmod(list[i],b)
    if q == 0:
        if r == 0:
            continue
        else: cnt += 1
    elif q !=0:
        if r == 0:
            cnt=cnt+q
        else: cnt=cnt+1+q
print(cnt)
q,r=divmod(a,c)
print(q,r)
