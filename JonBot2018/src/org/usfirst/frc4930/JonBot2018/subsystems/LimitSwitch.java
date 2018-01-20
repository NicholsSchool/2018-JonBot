package org.usfirst.frc4930.JonBot2018.subsystems;

import org.usfirst.frc4930.JonBot2018.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LimitSwitch extends Subsystem {
	

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	} 
	
	public boolean getPosition() {
		return RobotMap.limSwitch.get();
	}


}
