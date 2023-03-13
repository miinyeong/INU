def enqueue(queue, data):
    queue.append(data)

def dequeue(queue):
    if len(queue) == 0:
        print('큐가 공백임')
        return -1
    else:
        data = queue.pop(0)
        return data

def digit(d, k):
    temp = 1
    for i in range(1, k):
        temp *= 10
    d =int(d/temp)
    d %= 10
    return d

def radixSort(a, n, m, queue):
    for k in range(1, m+1):
        for i in range(1, n+1):
            kd = digit(a[i], k)
            enqueue(queue[kd], a[i])
        p = 0
        for i in range(10):
            while len(queue[i]) != 0:
                p += 1
                a[p] = dequeue(queue[i])

def checkSort(a, n):
    isSorted = True
    for i in range(1, n):
        if a[i] > a[i+1]:
            isSorted = False
        if not isSorted:
            break
    if isSorted:
        print("정렬 완료")
    else:
        print("정렬 오류 발생")
        
import random, time

N = 10000
M = 5
a = []
a.append(-1)
for i in range(N):
    a.append(random.randint(1, int('9'*M)))
Q = []
for i in range(10):
    Q.append([])
start_time = time.time()
radixSort(a, N, M, Q)
end_time = time.time() - start_time
print("기수 정렬의 실행 시간 (N=%d) : %0.3f"%(N, end_time))
checkSort(a, N)
