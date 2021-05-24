public class Main {
    public static void main(String[] args) {
        double initialBalance = 100.00;
        double refillAmount = 1100.00;
        boolean qualifiedForBonus = refillAmount > 1000.00;
        //int bonus = (int) (qualifiedForBonus ? refillAmount / 100 : 0);
        int bonus;
        if (qualifiedForBonus) {
            bonus = (int) refillAmount / 100;
        } else {
            bonus = 0;
        }
        double totalBalance = initialBalance + refillAmount + bonus;
        System.out.println("Итоговый баланс:" + totalBalance);
    }
}