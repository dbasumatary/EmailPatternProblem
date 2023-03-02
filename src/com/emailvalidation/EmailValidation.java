package com.emailvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UC2 - Validation of part 2 - email has to have @ symbol
public class EmailValidation {
    public void checkValidEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email address: ");
        String email = scanner.next();

        //Checking the start of email starting with characters and provide @ symbol
        String regexInput = "^(?=.{3,20}@)[a-zA-Z]{2,}[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-_.][a-zA-Z0-9-]+$";
        Pattern patternObject = Pattern.compile(regexInput);

        //We are assuming the email cannot be null
        assert email != null;

        // The Matcher class is used to perform match operations on a character sequence.
        Matcher matcherObject = patternObject.matcher(email);

        //the matches() method tries to match the whole string against the pattern.
        boolean isEmail =  matcherObject.matches();

        if(isEmail)
            System.out.println(email + " is a valid email address");
        else
            System.out.println(email + " is an invalid email address");
    }
    public static void main(String[] args) {
        System.out.println("---------- Email Validation ----------");
        EmailValidation emailValidation = new EmailValidation();

        //invoke the method
        emailValidation.checkValidEmail();
    }
}
