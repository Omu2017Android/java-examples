package main;

import lib.VideoCamera;
import lib.VideoPlayer;

/**
 *
 * @author sentinel
 */
public class InterfaceFirstExample {

    public static void main(String[] args) {
        
        VideoCamera videoCamera1 = new VideoCamera();
        videoCamera1.welcome();
        
        System.out.println("Kaydedilen video: " + videoCamera1.record());
        System.out.println("Kaydedilen video: " + videoCamera1.record());
        System.out.println("Kaydedilen video: " + videoCamera1.record());
        
        videoCamera1.play("Manus baba - etegi belinde");
        videoCamera1.pause("Manus baba - etegi belinde");
        videoCamera1.stop("Manus baba - etegi belinde");
        
        VideoPlayer videoPlayer1 = new VideoPlayer();
        videoPlayer1.play("Gazapizm - heyecani yok");
        videoPlayer1.setConnectedDisplay("TV");
        videoPlayer1.play("Gazapizm - heyecani yok");
        videoPlayer1.pause("Gazapizm - heyecani yok");
        videoPlayer1.stop("Gazapizm - heyecani yok");
    }
    
}
