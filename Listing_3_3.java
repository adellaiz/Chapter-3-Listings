/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:39:38
 * @modify date 2020-07-08 18:40:10
 * @desc [Suppose you want to develop a program for a first-grader to practice subtraction. The program
randomly generates two single-digit integers, number1 and number2, with number1 >=
number2, and it displays to the student a question such as “What is 9 - 2?” After the student
enters the answer, the program displays a message indicating whether it is correct.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        int answer = input.nextInt();
        if(number1 - number2 == answer){
            System.out.println("Youre correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}