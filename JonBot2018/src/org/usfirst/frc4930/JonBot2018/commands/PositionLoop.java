package org.usfirst.frc4930.JonBot2018.commands;

import org.usfirst.frc4930.JonBot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PositionLoop extends Command {
	
	private double position;
	
	public PositionLoop(int position) {
		this.position = position;
	}
	
	protected void initialized() {
		Robot.driveTrain.setPosition(position);
	}
	protected void execute() {
		
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		
	}
	
	protected void interrupted(){
		end();
	}
}

