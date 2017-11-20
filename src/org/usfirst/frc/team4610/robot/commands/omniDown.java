package org.usfirst.frc.team4610.robot.commands;

import org.usfirst.frc.team4610.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class omniDown extends InstantCommand {
	public omniDown() {
		super();
		requires(Robot.omniShifter);
}
	protected void initialize() {
		Robot.omniShifter.extendBoth();
	}
	
	
}