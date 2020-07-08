/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:42:28
 * @modify date 2020-07-08 18:42:28
 * @desc [Listing 3.7 gives the program that lets the user enter a year and checks whether it is a leap
year.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year = ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is a leap year ? " + isLeapYear);
    }
}