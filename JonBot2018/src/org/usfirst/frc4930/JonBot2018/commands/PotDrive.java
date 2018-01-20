package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PotDrive extends Command {

	protected void initialize() {

	}

	protected void execute() {
		Robot.driveTrain.tankMove(0.3, 0.3);;
	}
	
	protected boolean isFinished() {
		
		return (Robot.potentiometer.stop(4) || Robot.limitSwitch.getPosition());
	}
	
	protected void end() {
		Robot.driveTrain.tankStop();
	}
	
	protected void interrupted() {
		end();
	}
	
}
