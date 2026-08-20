package splitwise;

import java.util.Scanner;

public class Splitwise {
    static final String msg = "Welcome to Splitwise";
    public static void main(String[] args) {
        System.out.println(msg);
        String description = "Dinner at restaurant";
        double totalAmount = 120.0;
        int numberOfPeople = 4;
        double amountPerPerson = totalAmount / numberOfPeople;
        Scanner sc = new Scanner(System.in);
        boolean running= true;
        while (running) {

            System.out.println("MENU");
            System.out.println("1.Add Expense");
            System.out.println("2.View Expense");
            System.out.println("3.Exit");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Adding Expense....");
                System.out.println("Added Successfully");
            }
            else if(choice == 2){
                System.out.println("Expense Summary");
                System.out.println("Description: " + description);
                System.out.println("Total Amount: $" + totalAmount);
                System.out.println("Number of People: " + numberOfPeople);
                System.out.println("Amount Per Person: $" + amountPerPerson);
            }
            else if(choice ==3){
                System.out.println("Goodbye");
                running = false;

            }
            else{
                System.out.println("Invalid Choice");
            }

        }
    }
}
