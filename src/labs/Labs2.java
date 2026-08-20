package labs;

import java.util.Scanner;

public class Labs2{
    public static void main(String[] args) {
        //Lab A
        System.out.println(17/5);
        System.out.println(17.0/5);
        System.out.println(17%5);

        //Lab B
        int choice = 2;
        boolean value = choice == 2;
        boolean val1 = choice != 3;
        boolean val2 = choice >= 1 && choice <= 3;

        //Lab C
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("Add");
        }
        else if (ch ==2){
            System.out.println("View");
        }
        else if (ch ==3){
            System.out.println("Exit");
        }
        else{
            System.out.println("Invalid");
        }

        //Lab D

        switch(ch){
            case 1 -> System.out.println("Add");
            case 2 -> System.out.println("View");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Invalid");
        }

        //Lab E

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);
        }

        int count = 5;
        while(count < 0 ){
            System.out.println(count);
            count--;
        }

    }
}