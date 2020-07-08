/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:36:16
 * @modify date 2020-07-08 18:36:57
 * @desc [Suppose you want to develop a program to let a first-grader practice addition. The program
randomly generates two single-digit integers, number1 and number2, and displays to the student
a question such as “What is 1 + 7?,” as shown in the sample run in Listing 3.1. After the student
types the answer, the program displays a message to indicate whether it is true or false]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_1 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int number = input.nextInt();
        int answer = number1 + number2;
        boolean isTrue = true;
        if(number == answer){
            isTrue = true;
            System.out.println(number1 + " + " + number2 + " = " + answer + " is " + isTrue);
        } else {
            isTrue = false;
            System.out.println(number1 + " + " + number2 + " = " + number + " is " + isTrue);
        }
    }
}
