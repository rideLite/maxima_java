package HomeWorks.hw_2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int daysOfYear = 365;
        byte daysOfWeek = 7;
        short daysOfMonth = 30;
        long hours= 241092370491L;
        double raiting = 9.9;
        boolean checked = true;
        System.out.println("Значение переменной daysOfYear"+" с типом int равно " + daysOfYear);
        System.out.println("Значение переменной daysOfWeek"+" с типом byte равно " + daysOfWeek);
        System.out.println("Значение переменной daysOfMonth"+" с типом short равно " + daysOfMonth);
        System.out.println("Значение переменной hours"+" с типом long равно " + hours);
        System.out.println("Значение переменной raiting"+" с типом double равно " + raiting);
        System.out.println("Значение переменной checked"+" с типом boolean равно " + checked);

       /**5) На гитхабе создать пулл реквест (ПР, PR - pull request),
        отправить ссылку на него для проверки домашки

        ЗАДАНИЕ:

        1) Объявите переменные типа int, byte, short, long, float, double, char, boolean.

        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.

        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».

        2) На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?

        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
*/
       System.out.println("Task2");
       int allPaint = 120;
       int white = 2;
       int brown = 4;
       int classes =  allPaint/(white+brown);
       int whiteFinal = classes*white;
       int brownFinal = classes*brown;
        System.out.println("В школе, где "+classes + "классов, нужно "+ whiteFinal+ " банок белой краски и "+ brownFinal+ " коричневой краски»");


       /**
        3) К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
*/
        System.out.println("Task3");
        int mashaOldSalary = 67760;
        int denisOldSalary = 83690;
        int krisOldSalary = 76230;
        int procent = 10;
        int mashaNewSalary = mashaOldSalary + mashaOldSalary/procent;
        int diffrenceMasha = mashaNewSalary*12 - mashaOldSalary*12;
        System.out.println("Маша теперь получает "+mashaNewSalary+" рублей. Годовой доход вырос на "+diffrenceMasha+" рублей");

        int denisNewSalary = denisOldSalary + denisOldSalary/procent;
        int diffrenceDenis = denisNewSalary*12 - denisOldSalary*12;
        System.out.println("Денис теперь получает "+denisNewSalary+" рублей. Годовой доход вырос на "+diffrenceDenis+" рублей");

        int krisNewSalary = krisOldSalary + krisOldSalary/procent;
        int diffrenceYearSalary = krisNewSalary*12 - krisOldSalary*12;
        System.out.println("Кристина теперь получает "+mashaNewSalary+" рублей. Годовой доход вырос на "+diffrenceYearSalary+" рублей");

        



       /**
        4) Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:

        «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».
*/
        System.out.println("Task 4");
       int temp = 10;
       if (temp<5){
           System.out.println("На улице "+temp+" градусов,  нужно надеть шапку ");
       } else if (temp>=5) {
           System.out.println("На улице "+temp+" градусов,  можно идти без шапки ");
       }


        /**


         5) (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.

         Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.

         Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).

         */
        System.out.println("Task 5");
        int mouthNumber = 12;
        switch (mouthNumber){
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
        }


        /**

         6) Выведите в консоль все четные числа от 0 до 17 с помощью цикла.
         (использовать в теле цикла вложенное условие if с проверкой, что остаток от деления на 2 равен нулю)
         */
        System.out.println("Task 6");
        for (int i=1; i<=17; i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }
        /**
         7) С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        System.out.println("Task 7");
        for (int i=10; i>0; i--){
            System.out.println(i);
        }
        /**

         8) С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.

         Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .*/
        System.out.println("Task 8");
        int a = 2459000;
        int b = 15000;
        int counter = 0;
        while (a>0){
            a =a-b;
            counter++;
            System.out.println("Месяц "+counter+", сумма накоплений равна "+b*counter+" рублей");

        }
    }
    
}