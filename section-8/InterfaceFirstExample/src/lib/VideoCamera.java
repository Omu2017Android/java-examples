/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sentinel
 */
public class VideoCamera implements Recorder {

    private static long recordId = 0;
    private List<String> videos;

    public VideoCamera() {
        this.videos = new ArrayList<>();
    }
    
    @Override
    public String record() {
        videos.add("video-" + recordId);
        return "video-" + recordId++ + " recorded!";
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to Video Camera");
    }

    @Override
    public void play(String media) {
        System.out.println(media + " is playing on the camera screen...");
    }

    @Override
    public void stop(String media) {
        System.out.println(media + " is stopped on the camera screen!");
    }

    @Override
    public void pause(String media) {
        System.out.println(media + " is paused on the camera screen.");
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }
    
}
