// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.Code2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Spark;
// import edu.wpi.first.wpilibj.Relay;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	//old drive train 2016
	public static final int driveMotorLeft = 2; // 2
	public static final int driveMotorLeft_Back = 3 ; //3
	public static final int driveMotorRight = 0; //0
	public static final int driveMotorRight_Back = 1; //1
	
	//Motors for robot components 2017
	public static Spark gearFlipSpark1;
	public static Servo servoServo1;

//    
//    public static SpeedController shooterSpeedController1;
//    public static SpeedController shooterSpeedController2;
//    public static Ultrasonic shooterUltrasonic1;
//    public static Ultrasonic shooterUltrasonic2;
//    public static Ultrasonic shooterUltrasonic3;
//    public static Ultrasonic shooterUltrasonic4;
//    
//    public static SpeedController gateSpeedController1;
//    
//    public static Spark climberSpark1;
//    
//    public static SpeedController drivetrainSpeedController1;
//    public static SpeedController drivetrainSpeedController2;
//    public static SpeedController drivetrainSpeedController3;
//    public static SpeedController drivetrainSpeedController4;


	// Multiplier used to correct the direction of motors
	public static final int driveMotorLeftDir = -1;
	public static final int driveMotorRightDir = 1;
	public static final int driveMotorRightBackDir = 1;
	public static final int driveMotorLeftBackDir = -1;
	

	// Multiplier used for slower speed control
	public static final double CREEP_SPEED = 0.5;
	public static final double CREEP_SPEED_ULTRA = .125;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        //Motors for robot components 2017
        gearFlipSpark1 = new Spark(0);
        LiveWindow.addActuator("GearFlip", "Spark 1", (Spark) gearFlipSpark1);
        
        servoServo1 = new Servo(5);
        LiveWindow.addActuator("Servo", "Camera Servo", servoServo1);
//        gearFlipUltra1 = new Ultrasonic(0,1);
//        LiveWindow.addSensor("Ultra1", "Ultrasonic 1", gearFlipUltra1);
//        gearFlipUltra2 = new Ultrasonic(0,1);
//        LiveWindow.addSensor("Ultra2", "Ultrasonic 2", gearFlipUltra2);
//        gearFlipAnalogGyro1 = new AnalogGyro(0);
//        LiveWindow.addSensor("Gyroscope", "AnalogGyro 1", gearFlipAnalogGyro1);
//        gearFlipAnalogGyro1.setSensitivity(0.007);
//        
//        shooterSpeedController1 = new Talon(0);
//        LiveWindow.addActuator("Shooter", "Speed Controller 1", (Talon) shooterSpeedController1);
//        shooterSpeedController2 = new Talon(1);
//        LiveWindow.addActuator("Shooter", "Speed Controller 2", (Talon) shooterSpeedController2);
//        shooterUltrasonic1 = new Ultrasonic(0, 1);
//        LiveWindow.addSensor("Ultrasonic", "Ultrasonic 1", shooterUltrasonic1);
//        shooterUltrasonic2 = new Ultrasonic(0, 1);
//        LiveWindow.addSensor("Ultrasonic", "Ultrasonic 2", shooterUltrasonic2);
//        shooterUltrasonic3 = new Ultrasonic(0, 1);
//        LiveWindow.addSensor("Ultrasonic", "Ultrasonic 3", shooterUltrasonic3);
//        shooterUltrasonic4 = new Ultrasonic(0, 1);
//        LiveWindow.addSensor("Ultrasonic", "Ultrasonic 4", shooterUltrasonic4);
//        
//        gateSpeedController1 = new Victor(0);
//        LiveWindow.addActuator("Gate", "Speed Controller 1", (Victor) gateSpeedController1);
//        
//        climberSpark1 = new Spark(1);
//        LiveWindow.addActuator("Climber", "Spark 1", (Spark) climberSpark1);
    }

        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
