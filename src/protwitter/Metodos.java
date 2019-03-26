/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protwitter;
import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author ecollazodominguez
 */
public class Metodos {


   
    //Envía un tweet creando un objeto twitter.
    public void tweet() throws TwitterException{
    String latestStatus = JOptionPane.showInputDialog(null, "Escribe el Tweet");
    Twitter twitter = TwitterFactory.getSingleton();
    Status status = twitter.updateStatus(latestStatus);
    System.out.println("Tweet [ " + status.getText() + " ] enviado.");
    }
    
    //Muestra toda la timeTable como una Lista de objeto Status.
    public void timeTable() throws TwitterException{
        Twitter twitter = TwitterFactory.getSingleton();
    List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText()+"\n");
    }
    }
}

