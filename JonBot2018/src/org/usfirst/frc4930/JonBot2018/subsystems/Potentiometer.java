package org.usfirst.frc4930.JonBot2018.subsystems;

import org.usfirst.frc4930.JonBot2018.Robot;
import org.usfirst.frc4930.JonBot2018.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Potentiometer extends Subsystem {


	protected void initDefaultCommand() {
		
	}
	
	public double getDegree() {
		return RobotMap.pot.get();
	}
	
	public int getNum() {
	    double autoSwitch = RobotMap.pot.get();
	    double dialNum = (autoSwitch + 7) / (360 / 10);
	    double floor = Math.floor(dialNum);
	    if ((dialNum - floor) >= 0.5) {
	      dialNum = Math.ceil(dialNum);
	    } else {
	      dialNum = floor;
	    }
	    return (int) dialNum;
	}
	
	public void move(){
		int dialNum = getNum();
		double speed = dialNum/10;
		Robot.driveTrain.tankMove(speed, speed);
	}
	
	public boolean stop(int num){
		if(getNum() < num){
			Robot.driveTrain.tankMove(0.3, 0.3);
			return false;
		}
		else {
			Robot.driveTrain.tankStop();
			return true;
		}
	}
}
