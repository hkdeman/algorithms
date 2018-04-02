def bubble_sort(lis):
    for j in range(len(lis)):
        for i in range(len(lis)-j-1):
            if lis[i] > lis[i+1]:
                lis[i],lis[i+1] = lis[i+1],lis[i]
    return lis



