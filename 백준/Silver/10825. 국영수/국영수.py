n = int(input())
s = []

for _ in range(n):
    n, k, e, m = input().split()
    s.append((n, int(k), int(e), int(m)))

# 정렬 기준: 국어(내림차순), 영어(오름차순), 수학(내림차순)
s.sort(key=lambda x: (-x[1], x[2], -x[3], x[0]))

for ss in s:
    print(ss[0])