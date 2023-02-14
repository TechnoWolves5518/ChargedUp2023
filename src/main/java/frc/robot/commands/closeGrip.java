// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.*;


public class closeGrip extends CommandBase {
  /** Creates a new closeGrip. */
  public closeGrip() {

    addRequirements(RobotContainer.a_armGripper);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    armGripper.closeHand();
  }
}
