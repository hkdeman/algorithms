import math
class HashTable:
    def __init__(self,capacity=1,a=1,scaling_factor=1,shift=0):
        self.capacity = capacity
        self.a = a
        self.scaling_factor = scaling_factor
        self.shift = shift
        self.S = []
        for i in range(self.capacity):
            self.S.append([])
        self.size = 0
    
    def size(self):
        return self.size
    
    def is_empty(self):
        return self.size > 0
    
    def hash_code(self,s):
        code = 7
        for i in range(len(s)):
            code = self.a*code  + ord(s[i])
        return code
    
    def hash(self,s):
        return int(math.fabs(self.scaling_factor*self.hash_code(s) + self.shift) % self.capacity)
    
    def put(self,s):
        i = self.hash(s)
        bucket = self.S[i]
        if (s not in bucket):
            bucket.append(s)
            self.size+=1
    
    def get(self,s):
        i = hash(s)
        bucket = self.S[i]
        return s in bucket
