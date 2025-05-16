/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.undofeature;

import java.util.*;
/**
 *
 * @author Students Account
 */
public class UndoFeature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stacker = new Stack<>();
        Stack<String> history = new Stack<>(); 

        while (true) {
            System.out.println("Enter sentence(or type 'undo' to undo, 'exit' to stop): ");
            String sen = scan.nextLine();

            if (sen.equals("exit")) {
                System.out.println("Goodbye");
                scan.close();
                return; 
            } else if (sen.equals("undo")) {
                if (!history.isEmpty()) {
                    String lastReversed = history.pop();
                    System.out.println("Undid last reversed sentence: " + lastReversed);
                } else {
                    System.out.println("No sentences to undo.");
                }
                continue; 
            }

           
            String[] words = sen.split(" ");
            for (String word : words) {
                stacker.push(word);
            }

            
            StringBuilder reversedSentence = new StringBuilder();
            while (!stacker.isEmpty()) {
                reversedSentence.append(stacker.pop()).append(" ");
            }

            
            history.push(reversedSentence.toString().trim());
            System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
        }
    }
}

