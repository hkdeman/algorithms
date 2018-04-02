def selection_sort(lis):
    min_index = lis[0]
    for i in range(len(lis)):
        mini = min(lis[i:])
        min_index = lis[i:].index(mini)
        lis[i + min_index] = lis[i] 
        lis[i] = mini  
    return lis
