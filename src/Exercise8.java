import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Students
        System.out.print("Students : ");
        int students = in.nextInt();
        //Teachers
        System.out.print("Teachers : ");
        int teachers = in.nextInt();
        //Capacity
        System.out.print("Capacity : ");
        int capacity = in.nextInt();
        double buses = (students + teachers + capacity-1) / capacity;
        int overflow = (students + teachers) % capacity;
        System.out.printf("Buses required      : %,.0f\n", buses);
        System.out.println("Overflow passengers : " + overflow);
        in.close();
    }
}
