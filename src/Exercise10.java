import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Fahrenheit  : ");
        double fahr = in.nextDouble();
        double cels = (fahr - 32.00) * 5/9;
        double kelv = cels+273.15;
        System.out.printf("Celsius     :  %.2f\n", cels);
        System.out.printf("Kelvin      :  %.2f\n", kelv);
        in.close();
    }

}
