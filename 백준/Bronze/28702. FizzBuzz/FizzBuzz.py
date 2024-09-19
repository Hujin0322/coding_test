list = []
for i in range(3):
    a = input()
    if a.isdigit():
        list.append(int(a))
    else: list.append(a)

for i, n in enumerate(list):
    if isinstance(n,int):
        if i==0:next=n+3
        elif i==1:next=n+2
        else: next=n+1
        
if next%3==0:
    if next%5==0:print("FizzBuzz")
    else: print("Fizz")
elif next%5==0:print("Buzz")
else: print(next)