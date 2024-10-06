def solution(phone_book):
    p = set(phone_book)
    for ph in phone_book:
        for i in range(len(ph)):
            if ph[:i] in p: return False
    return True