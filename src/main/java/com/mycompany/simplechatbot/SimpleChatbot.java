/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplechatbot;

/**
 *
 * @author Erika
 */
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there! I'm your school chatbot. What's your name?");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "! How can I help you today?");
        System.out.println("Type 'bye' to end the chat.");

        while (true) {
            System.out.print(name + ": ");
            String userMessage = scanner.nextLine();

            if (userMessage.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye, " + name + "! Have a great day.");
                break;
            } else {
                String botResponse = generateResponse(userMessage);
                System.out.println("Bot: " + botResponse);
            }
        }

        scanner.close();
    }

    private static String generateResponse(String userMessage) {
        // Simple rule-based responses
        if (userMessage.contains("hello") || userMessage.contains("hi")) {
            return "Hi there! How can I assist you?";
        } else if (userMessage.contains("how are you")) {
            return "I'm just a computer program, but thanks for asking!";
        } else if (userMessage.contains("school")) {
            return "School is a place for learning and growth. Do you have any specific questions about school?";
        } else {
            return "I'm not sure how to respond to that. If you have any questions, feel free to ask!";
        }
    }
}