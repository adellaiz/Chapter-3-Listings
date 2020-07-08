/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:42:07
 * @modify date 2020-07-08 18:42:12
 * @desc [Listing 3.6 gives a program that checks whether a number is divisible by 2 and 3, by 2 or
3, and by 2 or 3 but not both]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer = ");
        int number = input.nextInt();
        if(number % 2 == 0 && number % 3 == 0){
            System.out.println(number + " is divisible by 2 and 3");
        }
        if(number % 2 == 0 || number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3");
        }
        if(number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3, but not both");
        }
    }
}