package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MecanumDrive extends Command{

	public MecanumDrive() {
        requires(Robot.driveTrain);
    }
	protected void initialize() {
    }

	  protected void execute() {
	    Robot.driveTrain.mecanumDrive();
	  }

	  protected boolean isFinished() {
	    return false;
	  }

	  protected void end() {
	    Robot.driveTrain.mecanumStop();
	  }

	  protected void interrupted() {
	    end();
	  }

}
