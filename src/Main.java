public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int refillAmount = 300;
        int bonus = 0;

        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
        }
        int totalAmount = initialAmount + refillAmount + bonus;

        System.out.println("Бонус:" + bonus + "рублей");

        System.out.println("Итоговая сумма:" + totalAmount + "рублей");
    }
}