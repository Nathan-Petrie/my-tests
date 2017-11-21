package org.usfirst.frc.team4610.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DogShifter extends Subsystem {
	DoubleSolenoid dogLeft = new DoubleSolenoid(1, 2);
	DoubleSolenoid dogRight = new DoubleSolenoid(3, 4);

	/**
	 * Extend both solenoids to drop omni down.
	 */
	public void extendBoth() {
		dogLeft.set(DoubleSolenoid.Value.kForward);
		dogRight.set(DoubleSolenoid.Value.kForward);
	}

	/**
	 * Retract both solenoids to retract omni 
	 */
	public void retractBoth() {
		dogLeft.set(DoubleSolenoid.Value.kReverse);
		dogLeft.set(DoubleSolenoid.Value.kReverse);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}