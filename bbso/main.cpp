#include <iostream>
#include <time.h>

int main() {
    clock_t start, end;
    start = clock(); //в переменной start хранится время начала выполнения скрипта

    int i = 1; //f(i) параметр i, от котрого берется функция
// В данной функции мы для примера рассмотрим f(1)
    int b = 3;//Коэффициент b из функции
    int c = 3;//Коэффициент с из функции

    int f = 0;//Значение функции

    int iteration = 100000000;//Количество суммирований

    //Цикл, в котором производится расчет f(i)
    //К значению f прибавляется значение summa
    //summa - результат работы сумматра от 1 до 100000000
    for(int k = 0; k < i; k++)
    {
        int summa = 0;
    //Цикл для подсчета результата сумматра
        for(int j = 1; j <= iteration; j++)
        {
            summa += b * 2 + c - (k + 1);
        }
        f += summa;
    }

    end = clock();
    std::cout << (((double) end - start) / ((double) CLOCKS_PER_SEC));
    return 0;

}
