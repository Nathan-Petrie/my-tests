package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class omniUp extends InstantCommand {
	public omniUp() {
		super();
		requires(Robot.omniShifter);
	}
	
	protected void initialize() {
		Robot.omniShifter.retractBoth();
	}
}
