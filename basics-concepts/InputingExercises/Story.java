/*
Write a program that asks the user for a character's name and their job. The program then prints a short story.

The output must be as shown below — note, the name and job depend on the user's input.
 */

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but i need some information first\nWhat is the main character called?");
        String character = scanner.nextLine();
        System.out.println("Wha tis their job?");
        String job = scanner.nextLine();
        System.out.println("Here is a story:\nOnce upon a time there was " + character + ", who was "+ job+".");
        System.out.println("On the way to work, " + character+ " reflect on life.");
        System.out.println("Perhaps "+character+" will not be a "+ job+" forever.");
    }
}
