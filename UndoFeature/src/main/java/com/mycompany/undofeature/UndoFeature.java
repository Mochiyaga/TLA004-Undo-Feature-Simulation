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
        Stack<String> stacker = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String actn = "";
        boolean run = true;
        
        while(run){
            System.out.println("Enter Action('undo' to undo, 'quit' to exit): ");
            actn = scan.nextLine();
            
            if(actn.equals("quit")) {
                run = false;
            } else if (actn.equals("undo")) {
                if (!stacker.isEmpty()) {
                    String lastAction = stacker.pop();  
                    System.out.println("You undid " + lastAction + ".");
                } else {
                    System.out.println("No actions to undo.");
                }

            } else {
                stacker.push(actn);  
                System.out.println("You " + actn + ".");
            }

        }
        
        System.out.print("Actions: ");
        for (String w : stacker) {
            System.out.print(w + "");
        

        }
    }
}