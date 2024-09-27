def solution(ineq, eq, n, m):
    if eq=="!": t = ineq
    else: t = ineq+eq
    
    if eval(f"{n} {t} {m}"): return 1
    return 0