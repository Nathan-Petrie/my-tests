package org.usfirst.frc.team4610.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4610.robot.subsystems.DogShifter;
import org.usfirst.frc.team4610.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4610.robot.subsystems.OmniShifter;
import org.usfirst.frc.team4610.robot.subsystems.Pneumatics;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Command autonomousCommand;
	// list of subsystems 
	public static DriveTrain drivetrain;
	public static Pneumatics pneumatics = new Pneumatics();
	public static OmniShifter omniShifter;
	public static DogShifter dogShifter;
	public static OI oi;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		// Initialize all subsystems
		drivetrain = new DriveTrain();
		oi = new OI();
		pneumatics.start(); // Pressurize the pneumatics.

		// instantiate the command used for the autonomous period
		

		// Show what command your subsystem is running on the SmartDashboard
		SmartDashboard.putData(drivetrain);
		
	}

	@Override
	public void autonomousInit() {
		autonomousCommand.start(); // schedule the autonomous command (example)
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
	private void log() {
		
	}
}
