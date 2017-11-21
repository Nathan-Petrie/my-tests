package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class LowGear extends InstantCommand {
	public LowGear() {
		super();
		requires(Robot.dogShifter);
	}
	
	protected void initialized() {
		Robot.dogShifter.extendBoth();
	}
}
