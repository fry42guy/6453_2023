// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveTrain extends SubsystemBase {



 
 private final Talon FR = new Talon(Constants.FR_Drive_ID);
 private final Talon FL = new Talon(Constants.FL_Drive_ID);
 private final Talon RR = new Talon(Constants.RR_Drive_ID);
 private final Talon RL = new Talon(Constants.RL_Drive_ID);
 private final MotorControllerGroup Left = new MotorControllerGroup(FL, RL);
 private final MotorControllerGroup Right = new MotorControllerGroup(FR, RR);
 private final DifferentialDrive drive = new DifferentialDrive(Left,Right );

  /** Creates a new DriveTrain. */
  public DriveTrain() {

  

  }

  public void drive(double left, double right) {
    drive.tankDrive(left, right);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
