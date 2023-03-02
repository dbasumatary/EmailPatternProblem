package com.emailvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UC1 - Validation of part 1  - email has to start with characters
public class EmailValidation {
    public void checkValidEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email address: ");
        String email = scanner.next();

        //Checking the start of email starting with characters
        Pattern patternObject = Pattern.compile("^(?=.{3,20}@)[a-zA-Z]{2,}[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*+@(.+)$");

        //We are assuming the email cannot be null
        assert email != null;

        // The Matcher class is used to perform match operations on a character sequence.
        Matcher matcherObject = patternObject.matcher(email);

        //the matches() method tries to match the whole string against the pattern.
        boolean isEmail =  matcherObject.matches();

        if(isEmail)
            System.out.println(email + " is a Valid email address");
        else
            System.out.println(email + " is an Invalid email address");
    }
    public static void main(String[] args) {
        System.out.println("---------- Email Validation ----------");
        EmailValidation emailValidation = new EmailValidation();

        //invoke the method
        emailValidation.checkValidEmail();
    }
}
