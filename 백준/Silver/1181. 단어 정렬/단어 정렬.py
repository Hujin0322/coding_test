n = int(input())
list = []
for i in range(n):
    a= input()
    list.append(a)
list = set(list)
result = sorted(list, key=lambda x:(len(x),x))

for i in range(len(result)):
    print(result[i])