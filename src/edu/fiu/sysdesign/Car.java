package edu.fiu.sysdesign;

public class Car {
   
    String color;
    String model;
    boolean isOn;


    public void turnOn(){

    }

    public void turnOff(){
        
    } 

}


public static void main(String[] args) {
    

Car car = new Car();
car.runSelfCheck();



}

@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.1);
		}
		
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return name;
		}

		@Override
		public boolean runSelfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.basicSelfCheckRunner(this);
		}