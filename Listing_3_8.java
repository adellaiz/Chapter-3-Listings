/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:42:48
 * @modify date 2020-07-08 18:42:54
 * @desc [Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lottery = (int)(Math.random() * 100);
        System.out.print("Enter you lottery pick (two digits) = ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is = " + lottery);
        if(guess == lottery){
            System.out.println("Exact match you win $10,000");
        } else if (guessDigit1 == lotteryDigit1){
            System.out.println("Match all digits you win $3,000");
        } else if (guessDigit2 == lotteryDigit2){
            System.out.println("Match one digit you win $1,000");
        } else {
            System.out.println("Sorry not match");
        }
    }
}