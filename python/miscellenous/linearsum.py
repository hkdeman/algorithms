def linear_sum(A,n):
    if n==1: return A[0]
    else: return A[n-1]+linear_sum(A,n-1)
