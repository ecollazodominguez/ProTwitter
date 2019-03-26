/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protwitter;

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
//        obx.tweet();
        obx.timeTable();
    }
    
}
