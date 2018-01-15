// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.JonBot2018.subsystems;


import org.usfirst.frc4930.JonBot2018.Robot;
import org.usfirst.frc4930.JonBot2018.RobotMap;
import org.usfirst.frc4930.JonBot2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {
	
	public double leftSide, rightSide, xSpeed, ySpeed, zRotation;
	
	public boolean tankDrive = true;
    @Override
    public void initDefaultCommand() {
    	//setDefaultCommand(new MecanumDrive());
    }

    
    public void tankMove(double left, double right) {
    	leftSide = left;
        rightSide = right;
        RobotMap.dtTankMasterMotors.tankDrive(left, right);
    }
    
    public void mecanumMove(double x, double y, double z ){
    	 xSpeed = x;
         ySpeed = y;
         zRotation = z;
         RobotMap.dtMecanumMasterMotors.driveCartesian(ySpeed, xSpeed, zRotation);
    }
    
    public void toggle() {
    	if(tankDrive){
    		tankDrive = false;
    	}
    	else {
    		tankDrive = true;
    	}
    }
    
    public void tankDrive() {
        double left = Robot.oi.j0.getY();
        double right = Robot.oi.j1.getY();
        if(tankDrive){
        	tankMove(left, right);
        }
    }
    public void mecanumDrive() {
    	double xSpeed = Robot.oi.j0.getX();
    	double ySpeed = Robot.oi.j0.getY();      
        double zRotation = Robot.oi.j0.getZ();
        if(!tankDrive){
        	mecanumMove(xSpeed, ySpeed, zRotation);
        }
    }
    public void tankStop() {
    	RobotMap.dtTankMasterMotors.stopMotor();
    }

    public void mecanumStop() {
    	RobotMap.dtMecanumMasterMotors.stopMotor();
    }

}

