def solution(a, b):
    answer = 0
    o = int(str(a)+str(b))
    t = 2*a*b
    if o>=t: answer=o
    else: answer=t
    return answer