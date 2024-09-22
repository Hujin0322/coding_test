M,N=map(int,input().split())

prime=[True]*(N-M+1)

if M==1:
    prime[0]=False

for i in range(2,int(N**0.5)+1):
    start=max(i*i,M+(i-M%i)%i)
    for j in range(start,N+1,i):
        prime[j-M]= False

for i in range(M,N+1):
    if prime[i-M]: print(i)
