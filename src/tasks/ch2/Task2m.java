package tasks.ch2;

import java.util.Scanner;

public class Task2m {
    static final int NUMBER_OF_PEOPLE = 4;
    public static void case1() {
            System.out.println("Adding person...");
        }
    public static void case2() {
        if (NUMBER_OF_PEOPLE > 0) {
            double share = 100.0 / NUMBER_OF_PEOPLE;
            System.out.println("Each person gets: " + share + "%");
        } else {
            System.out.println("Warning: NUMBER_OF_PEOPLE must be greater than 0.");
        }
    }

    public static void main(String[] args) {

        


        Scanner scanner = new Scanner(System.in);
        int menuCount = 0;

        boolean running = true;
        while(running){
            System.out.println("1. Add Person");
            System.out.println("2. Show Share");
            System.out.println("3. Show Count");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                case1();
            } else if (choice == 2) {
                if(NUMBER_OF_PEOPLE <= 0){
                    System.out.println("Warning: NUMBER_OF_PEOPLE must be greater than 0.");
                } else {
                    case2();
                }
                case2();
            }
             else if (choice == 3) {
                System.out.println("Menu iterations: " + menuCount);

            } else if (choice == 0) {
                // Hidden exit option
                running = false;// false so while stops

            } else {
                System.out.println("Invalid choice. Please select a valid option.");// if any wrong inp
            }
        }
    }
}