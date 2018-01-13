package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleDrive extends Command{
	

	  protected void initialize() {}

	  protected void execute() {
	    Robot.driveTrain.toggle();
	  }

	  protected boolean isFinished() {
	    return false;
	  }

	  protected void end() {
	  }

	  protected void interrupted() {
	    end();
	  }
}
