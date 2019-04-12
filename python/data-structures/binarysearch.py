def divide_and_conquer(A,lwb,upb,s):
    if lwb > upb: return -1
    mid = (lwb+upb)//2
    if s == A[mid]: return mid
    if s < A[mid]: return divide_and_conquer(A,lwb,mid-1,s)
    else: return divide_and_conquer(A,mid+1,upb,s)

def binary_search(A,s):
    return divide_and_conquer(A,0,len(A)-1,s)
