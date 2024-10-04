A = int(input())
B = int(input())
C = int(input())

d = A * B * C

sn = list(str(d))
ans = [0]*10

for s in sn:
    ans[int(s)] += 1

for i in ans:
    print(i)