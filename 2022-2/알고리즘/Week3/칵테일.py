import time
import random


def cocktailshakerSort(a: list, n: int):
    way = True
    i, k = n, 1
    while (k < i):
        if way:
            for j in range(k, i):
                if (a[j] > a[j + 1]):
                    a[j], a[j+1] = a[j+1], a[j]
            way = False
            i -= 1
        else:
            for j in range(i, k, -1):
                if (a[j] < a[j-1]):
                    a[j], a[j-1] = a[j-1], a[j]
            way = True
            k += 1


def bubbleSort(a: list, n: int):
    for i in range(n, 0, -1):
        for j in range(1, i):
            if (a[j] > a[j + 1]):
                a[j], a[j+1] = a[j+1], a[j]


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


N = [1000, 5000, 10000]

for n in N:
    a = []
    a.append(None)
    for i in range(n):
        a.append(random.randint(1, n))
    b = a.copy()

    start_time = time.time()
    cocktailshakerSort(a, n)
    end_time = time.time() - start_time
    print("칵테일 쉐이커 정렬의 실행 시간 (N=%d) : %0.3f" % (n, end_time))
    checkSort(a, n)

    start_time = time.time()
    bubbleSort(b, n)
    end_time = time.time() - start_time
    print("버블 정렬의 실행 시간 (N=%d) : %0.3f" % (n, end_time))
    checkSort(b, n)
