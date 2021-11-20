package edu.fiu.sysdesign;

import java.io.Console;

public class Camera {
    private String power;
    private String status;

    public Camera() {
        this.power = "on";
        this.status = "stand By";
    }
    
    public void takePicture(){
        this.status = "picture";
        System.out.println("Picture taken");
        this.status = "stand by";
    }

    public void recordVideo(){
        this.status = "recording";
        System.out.println("Video is being recorded");
    }

    public void stopRecording() {
        this.status = "stand by";
        System.out.println("Video has been recorded");
    }

    public void turnCameraOn() {
        this.status = "on";
    }

    public void turnCameraOff() {
        this.status = "off";
    }
    public String getPower() {
        return this.power;
    }

    public String getStatus() {
        return this.status;
    }

}
