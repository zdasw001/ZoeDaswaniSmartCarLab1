package edu.fiu.sysdesign;
import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.selfcheck;

public class Car implements SelfCheckCapable {
   
    String color;
    String model;
    boolean isOn;


    public void prepareForUpdate(){

    }

    public boolean readyForUpdate(){
        
   
	return 0;
		} 


	public void downloadUpdate(){


	}

	public void installUpdate(){


	}

	public boolean verifyUpdate(){

		return 0;
	}




public static void main(String[] args) {
    

car = new Car();
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





	
	}