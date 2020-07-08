/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:38:49
 * @modify date 2020-07-08 18:39:25
 * @desc [Listing 3.2 gives a program that prompts the user to enter an integer. If the number is a
multiple of 5, the program displays HiFive. If the number is divisible by 2, it displays HiEven.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        if(number % 5 == 0){
            System.out.println("HiFive");
        }
        if(number % 2 == 0){
            System.out.println("HiEven");
        }
    }
}