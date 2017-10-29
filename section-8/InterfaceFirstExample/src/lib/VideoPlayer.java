/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author sentinel
 */
public class VideoPlayer implements Player {

    private String connectedDisplay;

    public VideoPlayer() {
        this.connectedDisplay = "None";
    }
    
    @Override
    public void play(String media) {
        System.out.println(media + " is playing... (ConnectedDisplay: " + connectedDisplay +")");
    }

    @Override
    public void stop(String media) {
        System.out.println(media + " is stopped! (ConnectedDisplay: " + connectedDisplay +")");
    }

    @Override
    public void pause(String media) {
        System.out.println(media + " is paused (ConnectedDisplay: " + connectedDisplay +")");
    }

    public String getConnectedDisplay() {
        return connectedDisplay;
    }

    public void setConnectedDisplay(String connectedDisplay) {
        this.connectedDisplay = connectedDisplay;
    }
    
}
