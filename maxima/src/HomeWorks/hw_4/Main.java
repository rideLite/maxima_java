package HomeWorks.hw_4;

import java.util.Objects;

/**Рекурсия, обертки, приведение
 ТЕКСТ ЗАДАНИЯ
 порядок выполнения и сдачи домашки такой же, как и раньше - новая ветка, отдельные методы для заданий, ссылка на ПР

 1) Рекурсивный подсчет суммы чисел - напишите рекурсивный метод, который принимает целое число n и возвращает сумму всех чисел от 1 до n

 2) Напишите рукурсивный расчет факториала числа

 3) Напишите рукурсивный расчет числа Фибоначчи по его порядковому номеру

 4)  - Создать переменные различных примитивных типов данных (int, double, boolean);
 - Упаковать эти данные в объекты соответствующих классов-оберток (Integer, Double, Boolean);
 - Вывести на экран значения примитивных типов и упакованных объектов.

 5) Выполните несколько арифметических операций с использованием переменных классов-оберток и примитивных типов,
 чтобы увидеть автораспаковку в действии. Например, сложите Integer и int, аналогично с другими типами

 6) Сравнение переменных:

 Создайте две переменные типа Integer с одинаковыми значениями, инициализированные через автоупаковку
 Сравните эти переменные с использованием == и Objects.equals(). Выведите результаты сравнения в консоль
 Проделайте это со значениями в диапазоне от -128 и 127 и вне этого диапазона - обратите внимание на разницу, попробуйте найти объяснение этой разницы
 7) Измерье время выполнения операций с примитивом и оберткой (в двух разных методах, например checkTimeWithPrimitive и checkTimeWithWrapper):

 Задайте время начала операции
 long startTime = System.currentTimeMillis();
 Задайте переменную sum (в одном методе int sum, в другом Integer sum)
 В цикле сложите большое количество значений (можете просто прибавлять к sum переменную i на каждой итерации), например

 Integer sum = 0;
 for (int i = 0; i < count; i++) {
 sum += i;
 }

 также обратите внимание, что большие числа для наглядности можно задавать как 100_000_000
 Замерьте время выполнения
 long endTime = System.currentTimeMillis();
 long duration = endTime - startTime;
 System.out.println("Время выполнения операции: " + duration + " миллисекунд");
 Сравните результаты
 8) Протестируйте переполнение переменных типа Integer и Long путем увеличения максимального значения (константа MAX_VALUE) и уменьшения минимального (константа MIN_VALUE)*/
public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1 - нерекурсивный метод : "+task1(5));
        System.out.println("Task 1 - рекурсивный метод : "+task1_1(5));
        System.out.println("Task 2 : " + task2(3));
        System.out.println("Task 3 Фибоначчи : " + task3(10));


        int num = 10;
        System.out.println("Task 4, int " +num);
        System.out.println("Task 4 BOXING : " + task4(num));
        double doub = 5.5;
        System.out.println("Task 4, double " +doub);
        System.out.println("Task 4_1 BOXING double: " + task4_1(doub));
        boolean checked = true;
        System.out.println("Task 4, boolean " +checked);
        System.out.println("Task 4_2 BOXING boolean: " + task4_2(checked));

        int a = 5;
        System.out.println("Task 5, Integer * int : "+ task4(a) * a );
        System.out.println("Task 5, Integer + int : "+ task4(a) + a );


//   6) Сравнение переменных:
// Создайте две переменные типа Integer с одинаковыми значениями, инициализированные через автоупаковку
// Сравните эти переменные с использованием == и Objects.equals(). Выведите результаты сравнения в консоль
// Проделайте это со значениями в диапазоне от -128 и 127 и вне этого диапазона - обратите внимание на разницу,
// попробуйте найти объяснение этой разницы
    Integer someIntA = 129;
//    task7(a);
    Integer someIntB = 129;
        System.out.println("Task 6 :"+Objects.equals(someIntA, someIntB));
        System.out.println(someIntA==someIntB);
//        Измерье время выполнения операций с примитивом и оберткой
//        (в двух разных методах, например checkTimeWithPrimitive и checkTimeWithWrapper):
//        Задайте время начала операции
//        long startTime = System.currentTimeMillis();
//        Задайте переменную sum (в одном методе int sum, в другом Integer sum)
//        В цикле сложите большое количество значений (можете просто прибавлять к sum переменную i на каждой итерации), например
//
//        Integer sum = 0;
//        for (int i = 0; i < count; i++) {
//            sum += i;
//        }
//
//        также обратите внимание, что большие числа для наглядности можно задавать как 100_000_000
//        Замерьте время выполнения
//        long endTime = System.currentTimeMillis();
//        long duration = endTime - startTime;
//        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
//        Сравните результаты
        int countInt = 100_000_000;
        checkTimeWithPrimitive(countInt);
        Integer countInteger = 100_000_000;
        checkTimeWithWrapper(countInteger);

//         8) Протестируйте переполнение переменных типа Integer и Long путем
//         увеличения максимального значения (константа MAX_VALUE) и уменьшения минимального (константа MIN_VALUE)*/
        Integer a8=25;
        System.out.println("Task 8 : переполнения переменных типа Integer и Long " );
        System.out.println( a8.MAX_VALUE);
        System.out.println( a8.MAX_VALUE+1);
        System.out.println( a8.MIN_VALUE);
        System.out.println( a8.MIN_VALUE-1);

        Long longInt = 27l;
        System.out.println( longInt.MAX_VALUE);
        System.out.println( longInt.MAX_VALUE+1);
        System.out.println( longInt.MIN_VALUE);
        System.out.println( longInt.MIN_VALUE-1);


    }

    // 1) Рекурсивный подсчет суммы чисел - напишите рекурсивный метод,
    // который принимает целое число n и возвращает сумму всех чисел от 1 до n
    public static int task1(int num){
        int summa = 0;
        for (int i=num; i>0; i--){
            summa+= i;
        }
        return summa ;
    }
    public static int task1_1(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + task1_1(num - 1);
        }
    }

//     2) Напишите рукурсивный расчет факториала числа
    public static int task2(int num){
        if(num ==1){
            return 1;
        } else {
            return num * task2(num - 1);
        }
    }
// 3) Напишите рукурсивный расчет числа Фибоначчи по его порядковому номеру
    public static int task3(int num){
        if(num ==1 || num == 2){
            return 1;
        }
            return task3(num - 1) + task3(num-2);

    }

    //    4)  - Создать переменные различных примитивных типов данных (int, double, boolean);
// - Упаковать эти данные в объекты соответствующих классов-оберток (Integer, Double, Boolean);
// - Вывести на экран значения примитивных типов и упакованных объектов.
    public static Integer task4(int num){
//        Integer boxingNumberAuto = num;
        Integer boxingNumber = Integer.valueOf(num);
        return boxingNumber;
    }
    public static Double task4_1(double doub){
//        Integer boxingNumberAuto = num;
        Double boxingDouble = Double.valueOf(doub);
        return boxingDouble;
    }
    public static Boolean task4_2(boolean checked){
//        Integer boxingNumberAuto = num;
        Boolean boxing = Boolean.valueOf(checked);
        return boxing;
    }

    public static int checkTimeWithPrimitive(int countInt){
                long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < countInt; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
        return countInt;
    }
    public static Integer checkTimeWithWrapper(Integer countInteger){
        long startTime = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < countInteger; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
        return countInteger;
    }




}
