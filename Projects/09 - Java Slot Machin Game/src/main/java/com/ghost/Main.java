package com.ghost;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // initialization
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playagain = "yes";

        System.out.println("Welcome to the JAVA Slot Machine!");
        System.out.println("Symbols: 🍇 🍉 🍊 🍋 🍎");

        while (balance > 0 ) {
            System.out.println("Your current Balance: " + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            } else if ( bet <= 0) {
                System.out.println("That must be greater then 0!");
            } else {
                balance -= bet;
                System.out.println("Current balance: " + balance);
            }

            System.out.println("Spinning...");
            String[] rows = spinRow();
            printRow(rows);
            payout = getPayout(rows,bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else if (payout == 0) {
                System.out.println("Sorry You Lost this Round!");
            }
            System.out.print("Do you want to play again! (Y,N)");
            playagain = scanner.next().toLowerCase();

            if (playagain.equals("N")) {
                break;
            }
        }

        System.out.println("Thanks for playing the slot!");

        scanner.close();
    }
    public static String[] spinRow() {
        Random random = new Random();
        String[] symbols = {"🍇", "🍉", "🍊", "🍋" ,"🍎"};
        String[] rows = new String[3];

        for (int i = 0; i < rows.length; i++) {
            rows[i] = symbols[random.nextInt(symbols.length)];
        }

        return rows;
    }
    public static void printRow(String[] rows) {
            System.out.println(" " + String.join(" | ", rows));
    }
    public static int getPayout(String[] row,int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]) {
                case "🍇" -> bet * 3;
                case "🍉" -> bet * 5;
                case "🍊" -> bet * 10;
                case "🍋" -> bet * 15;
                case "🍎" -> bet * 25;
                default -> 0;
            };
        }else if (row[0].equals(row[1]) ) {
            return switch(row[0]) {
                case "🍇" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🍎" -> bet * 6;
                default -> 0;
            };
        }else if (row[1].equals(row[2]) ) {
            return switch(row[1]) {
                case "🍇" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🍋" -> bet * 6;
                case "🍎" -> bet * 7;
                default -> 0;
            };
        }
        return 0;
    }
}
