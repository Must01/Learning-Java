package com.ghost;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. Which HTTP method is considered 'idempotent' and used to update a resource or create it if it doesn't exist?",
                "2. What does the 401 Unauthorized status code specifically indicate?",
                "3. In a RESTful API, which architectural constraint ensures that the server does not store any client context between requests?",
                "4. Which format is the most commonly used for data exchange in modern Web APIs due to its lightweight nature?",
                "5. What is the primary purpose of an 'API Gateway' in a microservices architecture?"
        };

        String[][] options = {
                {"1. POST", "2. PATCH", "3. PUT", "4. GET"},
                {"1. The server is down", "2. Authentication is required", "3. The resource was not found", "4. Permission is denied (Forbidden)"},
                {"1. Cacheability", "2. Layered System", "3. Statelessness", "4. Uniform Interface"},
                {"1. XML", "2. YAML", "3. JSON", "4. Protocol Buffers"},
                {"1. To store database backups", "2. To act as a single entry point for routing and security", "3. To compile code on the server", "4. To provide a user interface for customers"}
        };

        int[] answers = {3,2,3,3,2};
        int score = 0;
        int guess;

        System.out.println("Welcome to the Quiz game");
        System.out.print("--------------------------------------------------");
        System.out.print("Enter Your Guess: ");
        for (int i = 0; i< questions.length;i++) {
            System.out.println("----------------------------");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter Your Guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                score += 1;
            }
            System.out.println("----------------------------");
        }

        System.out.println("----------------------------");
        System.out.println("Congratulations your score is : " + score);

        scanner.close();
    }

}
