import time
import random


def exchangeSort(a: list, n: int):
    for i in range(1, n):
        for j in range(i, n):
            if (a[i] < a[j+1]):
                a[i], a[j+1] = a[j+1], a[i]


def bubbleSort(a: list, n: int):
    for i in range(n, 0, -1):
        for j in range(1, i):
            if (a[j] > a[j + 1]):
                a[j], a[j+1] = a[j+1], a[j]


def selectionSort(a: list, n: int):
    for i in range(1, n+1):
        min = i
        for j in range(i, n+1):
            if (a[j] < a[min]):
                min = j
            j += 1
        a[i], a[min] = a[min], a[i]


def dec_checkSort(a, n):
    isSorted = True
    for i in range(1, n):
        if a[i] < a[i+1]:
            isSorted = False

        if not isSorted:
            break

    if isSorted:
        print("정렬 완료")

    else:
        print("정렬 오류 발생")


def acc_checkSort(a, n):
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
    c = a.copy()

    start_time = time.time()
    exchangeSort(a, n)
    end_time = time.time() - start_time
    print("교환 정렬의 실행 시간 (N=%d) : %0.3f" % (n, end_time))
    dec_checkSort(a, n)

    start_time = time.time()
    bubbleSort(b, n)
    end_time = time.time() - start_time
    print("버블 정렬의 실행 시간 (N=%d) : %0.3f" % (n, end_time))
    acc_checkSort(b, n)

    start_time = time.time()
    selectionSort(c, n)
    end_time = time.time() - start_time
    print("선택 정렬의 실행 시간 (N=%d) : %0.3f" % (n, end_time))
    acc_checkSort(c, n)
