package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command{
	
		protected void initialize() {
	
		}

		protected void execute() {
			Robot.driveTrain.tankMove(0.4, 0.4);
		}

		protected boolean isFinished() {
	
			return false;
		}
		
	    protected void end() {
	    	Robot.driveTrain.tankStop();
	    }

	    protected void interrupted() {
	    	end();
	    }
}
