public class Main {
    public static void examination(int proverka) {
        if (proverka % 4 == 0 && proverka % 100 != 0 || proverka % 400 == 0) {
            System.out.println(proverka + " год является високосным");
        } else {
            System.out.println(proverka + " год является не високосным");
        }
    }

    public static void install(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("нет сообщений");
        }
    }

    public static void deliver(int km) {
        int day = 1;
        if (km < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (km >= 20 && km < 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (km >= 60 && km < 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else if (km >= 100) {
            System.out.println("Доставки нет");
        }
    }


    public static void main(String[] args) {
        System.out.println("Решение задачи №1");
        examination(2019);
        task2();
        task3();
    }

    public static void task2() {
        System.out.println("Решение задачи №2");
        install(1, 2015);
    }

    public static void task3() {
        System.out.println("Решение задачи №3");
        deliver(2);
    }
}