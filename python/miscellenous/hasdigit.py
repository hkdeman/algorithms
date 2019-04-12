def has_digit(m,n):
    if n%10==m: return True
    else:
        if n<10: return False
        else: return has_digit(m,n//10)
