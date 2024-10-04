N = int(input())

def solve(N):
    num = str(N)
    tmp = 0
    for d in num:
        tmp += int(d)
    if N%tmp==0: return True
    return False

ans=0
for i in range(1,N+1):
    if solve(i):
        ans += 1
print(ans)