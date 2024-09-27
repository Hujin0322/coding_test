def solution(array, commands):
    answer=[]
    for i in commands:
        sliced = array[i[0]-1:i[1]]
        num = sorted(sliced)[i[2]-1]
        answer.append(num)
    return answer