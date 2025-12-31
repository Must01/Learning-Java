package com.ghost;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "scissor", "paper"};
        String userChoice;
        String computerChoice;
        String play = "yes";

        do{
            System.out.println("Welcome to Rock Paper Scissor game!");
            System.out.print("enter your move (rock, scissor, paper): ");

            userChoice = scanner.next().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("scissor") && !userChoice.equals("paper")) {
                System.out.println("Invalid Choice");
            }

            computerChoice = choices[random.nextInt(3)];

            if (userChoice.equals(computerChoice)) {
                System.out.println("You have Draw the computer also choose: " + computerChoice);
            } else if (userChoice.equals("rock") && computerChoice.equals("scissor") || userChoice.equals("paper") && computerChoice.equals("rock") || userChoice.equals("scissor") && computerChoice.equals("paper") ) {
                System.out.println("You have Won! Congratulations.");
                System.out.println("The computer choice was: " + computerChoice);
            }
            System.out.println("Wanna Play Again? (yes,no)");
            play = scanner.next();
        } while (play.equals("yes"));

        System.out.print("Thanks for playing! 🙂")

        scanner.close();
    }

}
