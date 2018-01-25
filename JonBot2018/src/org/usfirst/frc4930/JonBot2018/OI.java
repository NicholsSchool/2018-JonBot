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

import org.usfirst.frc4930.JonBot2018.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc4930.JonBot2018.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public Joystick j0;
    public Joystick j1;

    public JoystickButton j0b1;
    public JoystickButton j0b2;

    public OI() {
    

        j0 = new Joystick(0);
        j1 = new Joystick(1);
        
        j0b1 = new JoystickButton(j0, 1);
        j0b2 = new JoystickButton(j0, 2);
        
        j0b1.whenPressed(new PotDrive());
        j0b2.whenPressed(new PositionLoop(1000));
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

    }




}

