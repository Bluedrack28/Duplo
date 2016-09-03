import lejos.hardware.motor.EV3LargeRegulatedMotor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EV3LargeRegulatedMotor motorR = new EV3LargeRegulatedMotor(port);
		EV3LargeRegulatedMotor motorL = new EV3LargeRegulatedMotor(port);
		
		
		Orelian or = new Orelian();
		Loic l = new Loic();
		while(or.restABloc){
			
			l.goToTheNextBloc();
			if(l.getColor()){
				or.moveRight();
			}else{
				or.moveLeft();
			}
			
		}
		
		
	}

}
