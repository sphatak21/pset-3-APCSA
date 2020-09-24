import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Homeworks
        System.out.print("Homework 1 : ");
        double homework = in.nextDouble();
        System.out.print("Homework 2 : ");
        homework = homework + in.nextDouble();
        System.out.print("Homework 3 : ");
        homework = homework + in.nextDouble();
        double homeworkWeight = homework/3 * .15;
        //Quizzes
        System.out.print("Quiz 1     : ");
        double quiz = in.nextDouble();
        System.out.print("Quiz 2     : ");
        quiz = quiz + in.nextDouble();
        double quizWeight = quiz/2 * .35;
        //Test
        System.out.print("Test 1     : ");
        double test = in.nextDouble();
        double testWeight = test * .5;
        //Print
        double grade = testWeight+quizWeight+homeworkWeight;
        System.out.printf("%.2f", grade);
        System.out.print("%");
        in.close();
    }
}
