import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EV3LargeRegulatedMotor motorR = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorL = new EV3LargeRegulatedMotor(MotorPort.B);
		SensorMode colorLigne = new EV3ColorSensor(SensorPort.S1);
		SensorMode colorBlock = new EV3ColorSensor(SensorPort.S3).getColorIDMode();
		EV3MediumRegulatedMotor motorBras = new EV3MediumRegulatedMotor(MotorPort.A);
		
		Orelian or = new Orelian();
		Loic l = new Loic();
		while(or.restABloc){
			
			l.goToTheNextBloc(colorBlock, motorR, motorL);
			if(l.getColor()){
				or.moveRight();
			}else{
				or.moveLeft();
			}
			
		}
		
		
	}

}
