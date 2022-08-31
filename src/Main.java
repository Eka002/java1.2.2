public class Main {
    public static void main(String[] args) {
        int wallet = 100;
        int contribute = 1100;
        int bonus = contribute / 100;
        if (contribute >=1000) {
            System.out.println("Счет: " + (wallet + contribute + bonus));
            System.out.println("Бонус: " + bonus);
        } else {
            System.out.println("Счет: " + (wallet + contribute));
        }
    }
}