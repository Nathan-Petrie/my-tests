package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class FastGear extends InstantCommand {
	public FastGear() {
		super();
		requires(Robot.dogShifter);
	}
	
	protected void initialize() {
		Robot.dogShifter.retractBoth();
	}
}
