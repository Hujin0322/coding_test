from itertools import combinations

n,m = map(int,input().split())
list = list(map(int,input().split()))
result = []
for i in combinations(list, 3):
    if m-sum(i) >= 0:
        result.append(sum(i))
result.sort()
print(result[-1])