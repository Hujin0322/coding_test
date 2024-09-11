
N = int(input())  # 과목 개수
arr = list(map(int,input().split()))

M = max(arr)
for i in range(N):
    arr[i] = arr[i]/M*100
print(sum(arr)/N)