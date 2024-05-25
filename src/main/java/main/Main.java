package main;

import view.frmMenu;

/**
 * The Main class serves as the entry point for the application.
 */
public class Main {
    
    /**
     * The main method creates an instance of the menu frame and sets it to be visible.
     * 
     * @param args The command line arguments (not used in this application).
     */
    public static void main(String[] args){
        
        // Create an instance of the menu frame
        frmMenu menu = new frmMenu();
        
        // Set the menu frame to be visible
        menu.setVisible(true);
    }
}
