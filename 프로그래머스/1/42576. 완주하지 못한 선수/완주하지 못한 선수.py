def solution(participant, completion):
    par_cnt = {}
    
    for n in participant:
        if n in par_cnt: par_cnt[n] += 1
        else: par_cnt[n] = 1
    
    for n in completion:
        par_cnt[n] -= 1
    
    for n in par_cnt:
        if par_cnt[n] > 0: return n