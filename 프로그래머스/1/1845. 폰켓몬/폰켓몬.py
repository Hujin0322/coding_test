def solution(nums):
    uq=set(nums)
    maxs=len(nums)//2
    return min(len(uq),maxs)