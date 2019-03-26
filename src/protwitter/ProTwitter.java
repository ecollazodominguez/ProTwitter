/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protwitter;

import javax.swing.JOptionPane;
import twitter4j.TwitterException;

/**
 *
 * @author ecollazodominguez
 */
public class ProTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
                Metodos obx = new Metodos();
                int opcion;
        do{
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "Elija opción\n"
                    + "1 - Enviar tweet\n"
                    + "2 - Mostrar TimeTable\n"
                    + "3 - Buscar Tweet\n"
                    + "4 - Enviar MD\n"));
            
            switch(opcion){
                case 1:
                    obx.tweet();
                    break;
                case 2:
                    obx.timeTable();
                    break;
                case 3:
                    obx.searchTweet(JOptionPane.showInputDialog(null, "Palabra a buscar"));
                    break;
                case 4:
                    obx.sendDM(JOptionPane.showInputDialog(null, "Usuario a mandar DM"),JOptionPane.showInputDialog(null, "Escribe mensaje"));
                    break;
            }
            
        }while(opcion > 4);

    }

}
