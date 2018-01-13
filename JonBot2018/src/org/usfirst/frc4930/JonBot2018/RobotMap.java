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


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

   
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

    
    public static void init() {
        
        dtRFMaster = new WPI_TalonSRX(8);       
        dtRBMaster = new WPI_TalonSRX(6);
        dtLFMaster = new WPI_TalonSRX(7);
        dtLBMaster = new WPI_TalonSRX(5);
        
        dtRFSlave = new WPI_TalonSRX(10);
        dtRBSlave = new WPI_TalonSRX(4);
        dtLFSlave = new WPI_TalonSRX(9);
        dtLBSlave = new WPI_TalonSRX(3); 

    
    }
}