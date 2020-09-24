import java.util.Scanner;
public class Exercise3 {
    //TODO: make it work for fractions
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        double height = in.nextDouble() * 25.4;
        System.out.print("Width : ");
        double width = in.nextDouble() * 25.4;
        double area = width * height;
        System.out.printf("\n%,.2f", area);
        System.out.print(" square millimeters.");
        in.close();
    }

}

