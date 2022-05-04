package com.company;

public class Main {
    static long start = System.currentTimeMillis();//засекает время
    public static void main(String[] args) {
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
        System.out.println(f);// значение ф-ии
        long finish = System.currentTimeMillis();//останавливает счет времени
        long elapsed = (finish - start);//сравнивает
        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();// делает замер
        System.out.println("Proslo, мс: " + elapsed);//вывод в консоль, сколько прошло времени
        System.out.println("skolko, byte: " + usedBytes );//вывод в консоль, сколько понадобилось памяти 
    }
}

