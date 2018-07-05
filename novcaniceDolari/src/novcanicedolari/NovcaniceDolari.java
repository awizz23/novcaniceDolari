package novcanicedolari;

import java.util.*;

public class NovcaniceDolari {

    public static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {

        double orgAmount;
        int orgPennies; // pennies part of the amount
        int remPennies;
        long orgDollars;
        // variables for bills of denominations.
        long hundreds;
        int fifties, twenties, tens, fives, twos, ones;

        //variables for keeping track of coins
        int pennies, nickels, dimes, quarters;

        // print greeting and prompt user for input.
        System.out.println("Given an amount in dollars and cents, I will find");
        System.out.println("a combination of bills and coins:\n");
        System.out.println("Enter a dollar amount including cents.");

        // read amount of dollars and pennies.
        orgAmount = kbd.nextDouble();

        // printf is used to format user input into dollars and cents with comma delimiter
        System.out.printf("Amount you entered in Dollars and cents: $%,.2f\n  ", orgAmount);

        orgDollars = (long) orgAmount;
        System.out.printf("\nDollars Part of Original Amount: $%,d\n", orgDollars);

        //extract the pennies from in orgAmount
        orgPennies = (int) ((orgAmount % 100));
        System.out.println("pennies part of orginal amount: " + orgPennies);

        //Extract and print the number of \$100 bills from the dollar amount. 
        //Reduce the dollar amount to account for \$100 bills
        hundreds = (long) orgAmount / 100;
        orgAmount = orgAmount % 100;
        System.out.printf("Number of $100 bills: %,d\n", hundreds);

        //Extract and print the number of \$50 bills.  Reduce the dollar amount
        //to account for \$50 bills.
        fifties = (int) orgAmount / 50;
        orgAmount = orgAmount % 50;
        System.out.println("Number of $50 bills: " + fifties);

        //Extract and print the number of \$20 bills.  Reduce the dollar amount
        //to account for \$20 bills.
        twenties = (int) orgAmount / 20;
        orgAmount = orgAmount % 20;
        System.out.println("Number of $20 bills: " + twenties);

        //Extract and print the number of \$10 bills.  Reduce the dollar amount
        //to account for \$10 bills
        tens = (int) orgAmount / 10;
        orgAmount = orgAmount % 10;
        System.out.println("Number of $10 bills: " + tens);

        //Extract and print the number of \$5 bills.  Reduce the dollar amount
        //to account for \$5 bills
        fives = (int) orgAmount / 5;
        orgAmount = orgAmount % 5;
        System.out.println("Number of $5 bills: " + fives);

        //Extract and print the number of \$2 bills.  Reduce the dollar amount
        //to account for \$2 bills
        twos = (int) orgAmount / 2;
        orgAmount = orgAmount % 2;
        System.out.println("Number of $2 bills: " + twos);

        //Extract and print the number of \$1 bills.  Reduce the dollar amount
        //to account for \$1 bills
        ones = (int) orgAmount / 1;
        orgAmount = orgAmount % 1;
        System.out.println("Number of $1 bills: " + ones);

        //Extract and print the number of quarters from the number of pennies. 
        //Reduce the number of pennies to account for the quarters
        quarters = (int) (orgAmount / 0.25);
        orgAmount = orgAmount % .25;
        System.out.println("Number of Quarters: " + quarters);

        //Extract and print the number of dimes from the number of pennies. 
        //Reduce the number of pennies to account for the dimes
        dimes = (int) (orgAmount / 0.10);
        orgAmount = orgAmount % .10;
        System.out.println("Number of Dimes: " + dimes);

        //Extract and print the number of nickels from the number of pennies. 
        //Reduce the number of pennies to account for the nickels
        nickels = (int) (orgAmount / 0.05);
        orgAmount = orgAmount % .05;
        System.out.println("Number of Nickels: " + nickels);

        //Extract and print the number of pennies and terminate the program
        pennies = (int) (orgAmount / 0.01);
        orgAmount = orgAmount % .01;
        System.out.println("Number of Pennies: " + pennies);
    }

}
