def square1(n):
    i = 0
    sum = 0 
    while i <= n:
        sum+=i**2
        i+=1
    return sum

def square2(n):
    sum = (n*(n+1)*(2*n+1))//6
    return sum
