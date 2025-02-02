public class Main {
    public static void main(String[] args) {

        // Объявляем переменные
        int initialAmount = 100; // Начальная сумма счета
        int replenishmentAmount = 1100; // Сумма пополнения

        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый счет: " + (initialAmount + replenishmentAmount + bonus) + " руб.");
        System.out.println("Бонусные рубли: " + bonus);
    }
}