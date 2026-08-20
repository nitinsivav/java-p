import java.util.Scanner;
public class Task2{
    static final String OPTION_1 = "1. Add Student";
    static final String OPTION_2 = "2. View Students";
    static final String OPTION_3 = "3. Exit";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Creating scanner to get user input

        /**
         * Printing menu 3 times using loops and formatting
         */
        for (int i = 0; i < 3; i++) {
            System.out.printf("1. %s%n", OPTION_1);
            System.out.printf("2. %s%n", OPTION_2);
            System.out.printf("3. %s%n", OPTION_3);
        }

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();// Getting user input for choice with scanner

        int x=5;
        x += 1;

        if(choice != 1 && choice != 2 && choice != 3){
            System.out.println("Invalid choice. Please select a valid option.");
        } // Checking if the choice is valid or not for alll choices

        switch (choice) {
            case 1->
                System.out.println("You selected: " + OPTION_1);
            case 2->
                System.out.println("You selected: " + OPTION_2);
            case 3->
                System.out.println("You selected: " + OPTION_3);
            default ->
                System.out.println("Invalid choice. Please select a valid option.");
        }// Using switch case to print the selected option and a default case to handle invalid choices

    }
          
}