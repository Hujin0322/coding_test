from math import *
n = int(input())

for i in range(n):
    x1,y1,r1,x2,y2,r2=map(int,input().split())
    a = sqrt((x1-x2)**2+(y1-y2)**2) # 거리 차
    b = abs(r1-r2) # 절댓값
    result=0
    if a==0 and r1==r2:result=-1
    elif a==r1+r2 or a==b:result=1
    elif b<a<r1+r2:result=2
    else: result=0
    print(result)