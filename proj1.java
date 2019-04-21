

// Author: Jonathan Pham
// CS22671
// Project 1/
/ Validation of Credit Card

import java.util.Scanner;

public class jpd36proj1{

    public static void main(String args[]){
        long number, input, num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a credit card number: ");
        number = s.nextLong();
        input = number;
        
        long step1=0, step2=0, step3=0; //set values to zero
        while ( input != 0 ){
            num1 = input % 100;
            num2 = ( num1 % 10);
            num1 = ( num1 / 10 ) * 2; //fetches even place #s and multiply by 2
            
            if ( num1 >= 10 )  //if sum >= 10, add digits together
                num1 = ( ( num1 % 10 ) + ( num1 / 10 ) ); //obtains numbers >10,  //splits up place value  //and adds together
                step1 = step1 + num1; //add all second digit numbers
                step2 = step2 + num2; //add all first digit numbers
                input = input / 100;}step3 = step1 + step2; //add step 1 and step 2 together
                if (step3 % 10 == 0) //if NOT divisible by 10, credit card number is invalid
                    System.out.println(number+" is valid");
                    else  //credit card number is valid
                        System.out.println(number+" is invalid");
             }
 }
