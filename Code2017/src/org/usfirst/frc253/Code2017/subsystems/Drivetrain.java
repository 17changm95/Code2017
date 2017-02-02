
package org.usfirst.frc253.Code2017.subsystems;


import org.usfirst.frc253.Code2017.RobotMap;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *	Drivetrain for the robot. It is unsure at this time what the final drivetrain will be, so we will program one using standard
 *	two motor tank. This drivtrain uses the TalonSRX motor controllers. At this time, there are no sensors.
 */
public class Drivetrain extends Subsystem {
    
	private Victor driveMotorLeft;
	private Victor driveMotorLeft_Back;
	private Victor driveMotorRight;
	private Victor driveMotorRight_Back;
	public Drivetrain() {
		super();
		driveMotorLeft = new Victor(RobotMap.driveMotorLeft);
		driveMotorLeft_Back = new  Victor(RobotMap.driveMotorLeft_Back);
		driveMotorRight = new Victor(RobotMap.driveMotorRight);
		driveMotorRight_Back = new Victor(RobotMap.driveMotorRight_Back);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new org.usfirst.frc253.Code2017.commands.TankDrive());
    }
    
    public void setLeft(double power) {
    	driveMotorLeft.set(power * RobotMap.driveMotorLeftDir);
    }
    
    public void setLeft_Back(double power) {
    	driveMotorLeft_Back.set(power * RobotMap.driveMotorLeftBackDir);
    }
    public void setRight(double power) {
    	driveMotorRight.set(power * RobotMap.driveMotorRightDir);
    	
    }
    public void setRight_Back(double power) {
    	driveMotorRight_Back.set(power * RobotMap.driveMotorRightBackDir);
    }
    
    public double getLeftSpeed() {
    	return driveMotorLeft.getSpeed();
    }
    public double getLeft_BackSpeed() {
    	return driveMotorLeft_Back.getSpeed();
    }
    
    public double getRightSpeed() {
    	return driveMotorRight.getSpeed();
    }
    public double getRight_BackSpeed() {
    	return driveMotorRight_Back.getSpeed();
    }
    

}