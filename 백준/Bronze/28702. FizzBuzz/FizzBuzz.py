for i in range(3,0,-1):
    a = input()
    if a not in ['Fizz','Buzz','FizzBuzz']:
        next = int(a) + i
        
if next%15==0:print('FizzBuzz')
elif next%3==0:print('Fizz')
elif next%5==0:print('Buzz')
else: print(next)