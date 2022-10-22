def binarySearch(a, key, left, right):
    if left <= right:
        mid = (left +  right) // 2;
        if key == a[mid]:
             return mid
        elif key < a[mid]:
            return binarySearch(a, key, left, mid-1)
        else:
            return binarySearch(a, key, mid + 1, right)
    else: return -1

A = [1,2,3,4,5,6,7,8,9,10]
print(A)
while True:
    K = int(input('Key : '))
    res = binarySearch(A,K,0,10)
    print(res)
