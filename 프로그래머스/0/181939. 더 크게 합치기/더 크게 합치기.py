def solution(a, b):
    answer = 0
    o = int(str(a)+str(b))
    t = int(str(b)+str(a))
    if o>=t: answer=o
    else: answer=t
    return answer