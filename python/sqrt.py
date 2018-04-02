# O(sqrt(n))
def int_sqrt1(n):
    i = 0
    while ((i+1) * (i+1) <= n):
        i+=1
    return i 

# O(log(n))
def int_sqrt2(n):
    L = 0
    H = n
    D = 0
    while H != L+1:
        # print("L = %i , H = %i , D = %i" % (L,H,D))
        D = (L+H)//2
        if (D*D<=n):
            L = D
        else:
            H = D
    return L
