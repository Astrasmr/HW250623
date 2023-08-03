public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4(95);
        task5(2);
        task5(4);
        task5(7);
        task5(10);
        task5(13);
    }
        public static void task1 () {
            System.out.println(" Задача 1");
            var clientOS = 1;
            if (clientOS <= 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS >= 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
            public static void task2 () {
                System.out.println(" Задача 2");
                var clientDeviceYear = 2018;
                if (clientDeviceYear <= 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientDeviceYear >2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }

    public static void task3 () {
        System.out.println(" Задача 3");
        short year = 2021;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
            System.out.println(year + " год не является високосным");
        } else{
            System.out.println(year + " год является високосным");
        }
    }


    public static void task4 (int distance) {
        System.out.println(" Задача 4");
        int day = 0;
        if (distance<20){
            day ++;
            System.out.println("Потребуется дней:" + day);
        } else if
        (20<=distance&&distance<60){
            day+=2;
            System.out.println("Потребуется дней:" + day);
        } else if
        (60<=distance&&distance<=100){
            day+=3;
            System.out.println("Потребуется дней:" + day);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5 (int mountNumber) {
        System.out.println("Задача 5");
        switch (mountNumber) {
        case 12:
        case 1:
        case 2:
        System.out.println(" Зима ");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println(" Весна ");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println(" Лето ");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println(" Осень ");
        break;
        default:
        System.out.println(" Неверный номер месяца ");
        }
}
}


