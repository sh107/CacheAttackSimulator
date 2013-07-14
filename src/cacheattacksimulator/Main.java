/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cacheattacksimulator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int frequency = Integer.parseInt(args[0]);

            Program.run(1000000000, frequency);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
