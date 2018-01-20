// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.JonBot2018;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static WPI_TalonSRX dtRFMaster;
    public static WPI_TalonSRX dtRBMaster;
    public static WPI_TalonSRX dtLFMaster;
    public static WPI_TalonSRX dtLBMaster;
    public static WPI_TalonSRX dtRFSlave;
    public static WPI_TalonSRX dtRBSlave;
    public static WPI_TalonSRX dtLFSlave;
    public static WPI_TalonSRX dtLBSlave;

    public static SpeedControllerGroup leftMaster;
    public static SpeedControllerGroup rightMaster;
    
    public static DifferentialDrive dtTankMasterMotors;
    
    public static MecanumDrive dtMecanumMasterMotors;
    
    public static void init() {
        
        dtRFMaster = new WPI_TalonSRX(28);       
        dtRBMaster = new WPI_TalonSRX(26);
        dtLFMaster = new WPI_TalonSRX(27);
        dtLBMaster = new WPI_TalonSRX(25);
        
        dtRFSlave = new WPI_TalonSRX(30);
        dtRBSlave = new WPI_TalonSRX(24);
        dtLFSlave = new WPI_TalonSRX(29);
        dtLBSlave = new WPI_TalonSRX(23); 
        
//        dtRFMaster.setInverted(true);
//        dtRBMaster.setInverted(true);
//        dtRFSlave.setInverted(true);
//        dtRBSlave.setInverted(true);
        
        dtRFSlave.set(ControlMode.Follower, 28);
        dtRBSlave.set(ControlMode.Follower, 26);
        dtLFSlave.set(ControlMode.Follower, 27);
        dtLBSlave.set(ControlMode.Follower, 25);
        
        leftMaster = new SpeedControllerGroup(dtRFMaster, dtRBMaster);
        rightMaster = new SpeedControllerGroup(dtLFMaster, dtLBMaster);

        dtTankMasterMotors = new DifferentialDrive(leftMaster, rightMaster);
        dtTankMasterMotors.setSafetyEnabled(false);
        
        dtMecanumMasterMotors = new MecanumDrive(dtLFMaster, dtLBMaster, dtRFMaster, dtRBMaster);
        dtMecanumMasterMotors.setSafetyEnabled(false);
    }
}
