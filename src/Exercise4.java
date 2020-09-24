import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        //TODO: Support for fractions
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        double height = in.nextDouble()*2.54;
        System.out.print("Width : ");
        double width = in.nextDouble()*2.54;
        double perimeter = 2*width + 2*height;
        System.out.printf("\n%,.2f", perimeter);
        System.out.print(" centimeters.");
        in.close();
    }
}
