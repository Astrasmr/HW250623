public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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


    public static void task4 () {
        System.out.println(" Задача 4");
        private static int checkDeliveryDay(int distance){
        int day = 0;
        if (distance<20){
            day ++;
        } else if
        (20<=distance&&distance<60){
            day+=2;
        } else if
        (60<=distance&&distance<=100){
            day+=3;
        } else {
            day +=4;
        }
        return day;
    } private static void task(3); {
        System.out.println ("задача 3");
        int deliveryDistance = 60;
        int deliverydays = checkDeliveryDay(deliveryDistance);
        if(deliverydays<=3){
            System.out.println("Потребуется дней: " + (deliverydays));
        } else }
    System.out.println("доставки нет");}

    private static byte checkDeliveryDay(double deliveryDistance) {
        return 0;
    }
}
}

    public static void task5 () {
        System.out.println("Задача 5");
    int mountNumber = 12;
    switсh (mountNumber) {
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
        default;
        System.out.println(" Неверный номер месяца ");
        }
}

