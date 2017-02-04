package org.usfirst.frc253.Code2017.commands;


import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class SensorData extends Command {
	Ultrasonic ultraLeft;
	Ultrasonic ultraRight;
	DigitalInput photo;
	Gyro gyro1;
    public SensorData() {
    	ultraLeft = new Ultrasonic(0,1);
    	ultraRight = new Ultrasonic(5,6);
    	ultraLeft.setAutomaticMode(true);
    	ultraRight.setAutomaticMode(true);
    	photo = new DigitalInput(4);
    	gyro1 = new AnalogGyro(0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	gyro1.reset();
    	double rangeLeft = ultraLeft.getRangeInches();
     	double rangeRight = ultraRight.getRangeInches();
     	double gyroAngle = gyro1.getAngle();

     	System.out.println(rangeLeft);
     	System.out.println(rangeRight);
     	System.out.println(gyroAngle);
 		SmartDashboard.putNumber("Left Ultrasonic Distance", rangeLeft);
 		SmartDashboard.putNumber("Right Ultrasonic Distance", rangeRight);
 		SmartDashboard.putNumber("Gyroscope Angle", gyroAngle);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
