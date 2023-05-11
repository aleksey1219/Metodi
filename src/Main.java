public class Main {
    public static void examination(int proverka) {
        if (proverka % 4 == 0 && proverka % 100 != 0 || proverka % 400 == 0) {
            System.out.println(proverka + " год является високосным");
        } else {
            System.out.println(proverka + " год является не високосным");
        }
    }

    public static void main(String[] args) {
        examination(2019);
    }
}