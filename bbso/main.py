import time  # библетка времени чтобы узнать время работы программы
import os, psutil
process = psutil.Process(os.getpid())


start_time = time.time()  # в переменной start_time хранится время начала выполнения скрипта

i = 1  # f(i) параметр i, от котрого берется функция
# В данной функции мы для примера рассмотрим f(1)
b = 3  # Коэффициент b из функции
c = 3  # Коэффициент с из функции

iteration = 100000000  # Количество суммирований
f = 0  # Значение функции

# Цикл, в котором производится расчет f(i)
# К значению f прибавляется значение summa
# summa - результат работы сумматра от 1 до 100000000

for k in range(i):
    summa = 0
    # Цикл для подсчета результата сумматра
    for j in range(1, iteration + 1):
        summa += b * 2 + c - (k + 1)

    f += summa

print(process.memory_info().rss) # объем памяти в байтах
print("--- %s seconds ---" % (time.time() - start_time))
