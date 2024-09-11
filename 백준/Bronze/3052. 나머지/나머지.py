arr = []
for i in range(10):
    N = int(input())%42
    if N not in arr:
        arr.append(N)
print(len(arr))