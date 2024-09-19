n = int(input())
list = []
for i in range(n):
    a = input()
    list.append(a)
result = sorted(set(list), key=lambda x:(len(x),x))

print("\n".join(result))