def dumb_hash(s):
    # really stupid because any anagram of the same word will have
    # the same hash
    code = 0 
    for i in range(len(s)):
        code += ord(s[i])
    return code

def poly_hash(s,num=5):
    # really long hashes with 33 clashes over 25k dictionry words
    code = 7
    for i in range(len(s)):
        code = code*num + ord(s[i])
    return code

def cyclic_shift_hash(s,code=131231222):
    for i in range(len(s)):
        key ^= ((code << 5) + ord(s[i]) + (code >> 2))
    return code

