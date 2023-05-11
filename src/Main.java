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


    public static void main(String[] args) {
        System.out.println("Решение задачи №1");
        examination(2019);
        task2();
    }
    public static void task2() {
        System.out.println("Решение задачи №2");
       install(1,2015);
    }
}