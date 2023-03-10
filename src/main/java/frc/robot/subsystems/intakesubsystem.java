// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class intakesubsystem extends SubsystemBase {
  /** Creates a new intakesubsystem. */

private final VictorSP Intake_Right = new VictorSP(Constants.Intake_Right_ID);
private final VictorSP Intake_Left = new VictorSP(Constants.Intake_Left_ID);


  public intakesubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void Intake_In(){

Intake_Right.set(Constants.Intake_speed_In);
Intake_Left.set(Constants.Intake_speed_In*-1);
}

public void Intake_out(){
  Intake_Right.set(Constants.Intake_speed_out);
  Intake_Left.set(Constants.Intake_speed_out*-1);
}
}