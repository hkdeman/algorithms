def pigeonhole_sort(lis):
    min_lis = min(lis)
    max_lis = max(lis)
    size = max_lis - min_lis + 1
    
    holes = [0] *size
    
    for item in lis:
        holes[x-min_lis] +=1
    
    i=0
    for count in range(size):
        while holes[count] > 0:
            holes[count] -=1
            a[i] = count+min_lis
            i+=1
