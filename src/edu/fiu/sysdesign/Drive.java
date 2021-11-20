package edu.fiu.sysdesign;

public class Wheels {
    
    private  String direction;
    private int speed;

    private void setSpeed(int speed){

        this.speed = speed;


    }

    public void goRight(){

        this.direction = "right";


    }

    public void goLeft(){

        this.direction = "left";

    }

    public void goForward(int speed){
        
        setSpeed(speed);

    }

    public void goBackward(int speed){

        setSpeed(speed);

    }

    public void spin(){

        goRight();
        goRight();
        goRight();
        goRight();
    }

    public void stop (int speed){

        setSpeed(0);
        
    }



}
