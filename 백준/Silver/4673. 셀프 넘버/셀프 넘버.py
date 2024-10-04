def d(n):
    num = list(str(n)) # 각 자리수를 개별 처리
    selfnum = n
    for digit in num:
        selfnum += int(digit)
    return selfnum

# 1-10000까지의 숫자
numbers = set(range(1,10001))
# 생성자 저장
g = set()

#각 숫자에 대해 계산, g집합에 추가
for n in range(1,10001):
    g.add(d(n))

notsn = numbers-g

for i in sorted(notsn):
    print(i)