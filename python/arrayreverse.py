def swap(A,i,j):
    A[i],A[j] = A[j],A[i]

def reverse(A,lwb,upb):
    if lwb < upb:
        swap(A,lwb,upb)
        reverse(A,lwb+1,upb-1)
    return A

def iter_reverse(A,lwb,upb):
    while lwb < upb:
        swap(A,lwb,upb)
        lwb+=1
        upb-=1
    return A
