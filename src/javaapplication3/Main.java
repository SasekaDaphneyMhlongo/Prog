
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Mhlongo_Saseka_Daphney
 */

public class Main {

    public static void main(String[] args) {
        Scanner LT = new Scanner(System.in);

        String firstname = "", lastname = "", username = "", password = "";
        SignUp signUp = new SignUp();

        // Registration Process
        System.out.println("Register your account:");
        while (true) {
            System.out.print("Enter your firstname: ");
            firstname = LT.nextLine();

            System.out.print("Enter your lastname: ");
            lastname = LT.nextLine();

            System.out.println("Enter username:");
            username = LT.nextLine();

            System.out.println("Enter password:");
            password = LT.nextLine();

            String registrationStatus = signUp.registerUser(username, password);

            System.out.println(registrationStatus);

            if (registrationStatus.equals("Username and password registered successfully"))
            {
                break; 
            }
        }
        

        // Login Process
System.out.println("Login to your account:");
Login login = new Login(username, password);

boolean loginSuccessful = false;
while (!loginSuccessful) {
    System.out.println("Enter username:");
    String enteredUsername = LT.nextLine();

    System.out.println("Enter password:");
    String enteredPassword = LT.nextLine();

    loginSuccessful = login.loginUser(enteredUsername, enteredPassword);

    if (loginSuccessful) 
    {
        System.out.println("Login successful");
        System.out.println("Welcome " + firstname + " " + lastname + ", it is great to see you.");
    } 
    else 
    {
        System.out.println("Username or password incorrect, please try again.");
    }
}
        }
    }

   






    




