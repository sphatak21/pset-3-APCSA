import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount     :  ");
        double amount = 100 * in.nextDouble();
        double quarters = amount / 25;
        quarters = (int) quarters;
        amount = amount % 25;

        double dimes = amount / 10;
        dimes = (int) dimes;
        amount = amount % 10;

        double nickels = amount / 5;
        nickels = (int) nickels;
        amount = amount % 5;

        double pennies = amount;
        pennies = (int) pennies;

        //System.out.println("Quarters: ");
        System.out.printf("Quarters   : %.0f\n", quarters);

        System.out.printf("Dimes      : %.0f\n", dimes);

        System.out.printf("Nickels    : %.0f\n", nickels);

        System.out.printf("Pennies    : %.0f\n", pennies);
        in.close();
    }

}
