package org.usfirst.frc.team4610.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class OmniShifter extends Subsystem {
	DoubleSolenoid omniLeft = new DoubleSolenoid(1, 2);
	DoubleSolenoid omniRight = new DoubleSolenoid(3, 4);

	/**
	 * Extend both solenoids to swivel.
	 */
	public void extendBoth() {
		omniLeft.set(DoubleSolenoid.Value.kForward);
		omniRight.set(DoubleSolenoid.Value.kForward);
	}

	/**
	 * Retract both solenoids to play d
	 */
	public void retractBoth() {
		omniLeft.set(DoubleSolenoid.Value.kReverse);
		omniLeft.set(DoubleSolenoid.Value.kReverse);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
