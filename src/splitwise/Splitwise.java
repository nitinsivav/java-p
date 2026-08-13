package splitwise;

public class Splitwise {
    public static void main(String[] args) {
        System.out.println("=== Splitwise ===");
        String description = "Dinner at restaurant";
        double totalAmount = 120.0;
        int numberOfPeople = 4;
        double amountPerPerson = totalAmount / numberOfPeople;
        System.out.println("Description: " + description);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Amount Per Person: $" + amountPerPerson);
    }
}
