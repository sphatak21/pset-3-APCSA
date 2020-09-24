import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //salary
        System.out.print("Salary   :  ");
        double salary = in.nextDouble()/24;
        //401(k)
        System.out.print("401k     :  ");
        double k401 = in.nextDouble() * .01;
        //Federal
        System.out.print("Federal  :  ");
        double federal = in.nextDouble() * .01;
        //State
        System.out.print("State    :  ");
        double state = in.nextDouble() * .01;

        //before tax earnings
        double earnings = salary - (salary * k401);
        //after tax
        earnings = earnings - (earnings*federal) - (earnings*state);
        System.out.print("\n$");
        System.out.printf("%.2f", earnings);
        System.out.print(".");
        in.close();
    }
}
