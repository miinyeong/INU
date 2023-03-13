def selectionSort(a, n):
    for i in range(1,n):
        min = i;
        for j in range(i+1,n+1):
            if(a[min] > a[j]):
                min = j;
        a[min], a[i] = a[i], a[min]

def checkSort(a, n):
    isSorted = True
    for i in range(1, n):
        if (a[i] > a[i+1]):
            isSorted = False
        if (not isSorted):
            break
    if isSorted:
        print("정렬 완료")
    else:
        print("정렬 오류 발생")

import random, time

N = 5000
a = []
a.append(None)
for i in range(N,0,-1):
    a.append(i)
start_time = time.time()
selectionSort(a, N)
end_time = time.time() - start_time
print('선택 정렬의 실행 시간 (N = %d) : %0.3f'%(N, end_time))
checkSort(a, N)
