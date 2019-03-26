/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protwitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.DirectMessageList;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author ecollazodominguez
 */
public class Metodos {

    /**
     *Envía un tweet y muestra lo enviado.
     * @throws TwitterException
     */
    public void tweet() throws TwitterException {
        String latestStatus = JOptionPane.showInputDialog(null, "Escribe el Tweet");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(latestStatus);
        JOptionPane.showMessageDialog(null,"Tweet [ " + status.getText() + " ] enviado.");
    }


    /**
     *Muestra toda la timeTable como una Lista de objeto Status.
     * @throws TwitterException
     */
    public void timeTable() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText() + "\n");
        }
    }


    /**
     *Busca los tweets con el String indicado en el Query y lo muestra en una lista
     * @param busqueda mensaje que va a buscar en los tweets
     * @throws TwitterException
     */
    public void searchTweet(String busqueda) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(busqueda);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()+"\n");
        }
    }


    /**
     *Envía un DM al usuario que se indica y con el mensaje que quieras y muestra el mensaje enviado.
     * @param user usuario que recibirá el DM
     * @param msg mensaje que mandarás
     * @throws TwitterException
     */
    public void sendDM(String user, String msg) throws TwitterException {
        Twitter sender = TwitterFactory.getSingleton();
        DirectMessage message = sender.sendDirectMessage(user, msg);
        JOptionPane.showMessageDialog(null,"Sent: " + msg + " to @" + user);
    }

}
