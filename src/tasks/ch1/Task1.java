public class Task1 {
    int a = 1;
    public static void main(String[] args) {

        String description = "Lunch ";
        double totalAmount = 800.0;
        boolean isActive = true;
        System.out.println("active: " + isActive);

        int person = 6;
        double eachPay =250;
        double totalCalc = eachPay * person;
        System.out.println("Total Amount: " + totalCalc);

        System.out.println(2.0/1.1);

        byte b1 = 1;
        byte b2 = (byte) 300;

        short s1 = 1;

        int i1 = 1;

        long l = 9_000_000_000L;
        System.out.println("Long value: " + l);
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("s1: " + s1);

        System.out.println("i1: " + i1);

        System.out.println("a: " + a);
    }
}