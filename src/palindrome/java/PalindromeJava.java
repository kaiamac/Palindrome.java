/*
 * Kaia Mac
 * directs the user to enter a word. The program will print the word backwards 
 * and then inform the user if it is a palindrome or not. Treat uppercase 
 * letters and lowercase letters as the same, so the program should convert the 
 * letters to all uppercase or all lowercase.
 * 25/02/2020
 */

package palindrome.java;

import javax.swing.*;



/**
 *
 * @author kamac8665
 */
public class PalindromeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word, backwardsWord;
        int pos;
        
        
        //get the word from the user.
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes. \n"
                +"This program determines if a words is a palindrome. \n\n"
                +"Enter a word:");
        
        //Reverse the word
        backwardsWord = "";
        for(pos = word.length() - 1; pos >= 0; pos--) {
            backwardsWord += word.charAt(pos);
        }
        
        //compare the words
        if(word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS NOT a palindrome.");
        }
        
        
        
        
        
        
    }
    
}