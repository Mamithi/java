package com.mamithi.dialog;

import javax.swing.*;

public class Dialog {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");

        // Create a message to display
        String message = String.format("Welcome, %s, to  Java GUI!", name);

        // Display the message to welcome with the user name
        JOptionPane.showMessageDialog(null, message);
    }

}
