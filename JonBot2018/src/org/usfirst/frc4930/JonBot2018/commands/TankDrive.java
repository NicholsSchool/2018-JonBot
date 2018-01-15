package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command{

	public TankDrive() {
        requires(Robot.driveTrain);
    }
	protected void initialize() {
    }

	  protected void execute() {
	    Robot.driveTrain.tankDrive();
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
