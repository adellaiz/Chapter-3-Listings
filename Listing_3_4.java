/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:40:33
 * @modify date 2020-07-08 18:40:39
 * @desc [Write a program that prompts the user to enter a weight in pounds and height in inches and
displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254
meters. Listing 3.4 gives the program.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds \t= ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches \t= ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi <30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}