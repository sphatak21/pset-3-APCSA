import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //wages
        System.out.print("Wages      :  ");
        double wages = in.nextDouble();
        //hours
        System.out.print("Monday     :  ");
        double hours = in.nextDouble();
        System.out.print("Tuesday    :  ");
        hours = hours + in.nextDouble();
        System.out.print("Wednesday  :  ");
        hours = hours + in.nextDouble();
        System.out.print("Thursday   :  ");
        hours = hours + in.nextDouble();
        System.out.print("Friday     :  ");
        hours = hours + in.nextDouble();
        System.out.print("Saturday   :  ");
        hours = hours + in.nextDouble();
        System.out.print("Sunday     :  ");
        hours = hours + in.nextDouble();
        //hours x wages = earnings
        double earnings = wages * hours;
        System.out.print("\n$");
        System.out.printf("%.2f", earnings);
        in.close();
    }
}
