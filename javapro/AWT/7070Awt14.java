// Create a simple AWT application that displays a List with FlowLayout manager. (Program 14)
// Created by Aryan , Rollno 7070
// Note : In order to compile and run this program , rename it from "7070Awt14.java" to "Awt14.java"

import java.awt.*;
import java.awt.event.*;

class Awt14 {
    private Frame frame;
    private List myList;

    public Awt14() {
        frame = new Frame("AWT List Example");
        myList = new List();

        // Add items to the List
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
        myList.add("Item 4");
        myList.add("Item 5");

        // Set FlowLayout for the frame
        frame.setLayout(new FlowLayout());

        // Add the List to the frame
        frame.add(myList);

        // Add a WindowListener to handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Awt14();
    }
}
