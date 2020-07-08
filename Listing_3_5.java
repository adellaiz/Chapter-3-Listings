/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:41:12
 * @modify date 2020-07-08 18:41:43
 * @desc [The United States federal personal income tax is calculated based on filing status and taxable income. There are four filing statuses: single filers, married filing jointly or qualified
widow(er), married filing separately, and head of household. The tax rates vary every year.
Table 3.2 shows the rates for 2009. If you are, say, single with a taxable income of $10,000,
the first $8,350 is taxed at 10% and the other $1,650 is taxed at 15%, so, your total tax is
$1,082.50. You are to write a program to compute personal income tax. Your program should prompt
the user to enter the filing status and taxable income and compute the tax. Enter 0 for single
filers, 1 for married filing jointly or qualified widow(er), 2 for married filing separately, and
3 for head of household. For each filing status there are six tax rates. Each rate is applied to a certain amount of
taxable income. For example, of a taxable income of $400,000 for single filers, $8,350 is
taxed at 10%, (33,950 – 8,350) at 15%, (82,250 – 33,950) at 25%, (171,550 – 82,250) at 28%,
(372,950 – 171,550) at 33%, and (400,000 – 372,950) at 35%.]
 */
package Chapter_3;
import java.util.Scanner;
public class Listing_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-single filer, 1-married jointly or " +
        "qualifying widow(er), 2-married separately, 3-head of " +
        "household) Enter the filing status = ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income = ");
        double income = input.nextDouble();
        double tax = 0;
        if(status == 0){
            if(income <= 8350){
                tax = income * 0.10;
            } else if (income <= 33950){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15;
            } else if (income <= 82250){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;      
            } else if (income <= 372950){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 1){
            if(income <= 16700){
                tax = income * 0.10;
            } else if (income <= 67900){
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15;
            } else if (income <= 137050){
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            } else if (income <= 208850){
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 372950) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
            } else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 2){
            if(income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15;
            } else if (income <= 68525){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 104425){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
            } else if (income <= 186475){
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        } else if (status == 3){
            if(income <= 11950){
                tax = income * 0.10;
            } else if (income <= 45500){
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15;
            } else if (income <= 117450){
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 11950) * 0.25;
            } else if (income <= 190200){
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 11950) * 0.25 + (income - 117450) * 0.28;
            } else if (income <= 372950){
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 11950) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
            } else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 11950) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}