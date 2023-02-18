// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
 
 private final Spark Arm_Motor_1 = new Spark(Constants.Spark_Arm_1_ID);
 private final Spark Arm_Motor_2 = new Spark(Constants.Spark_Arm_2_ID);
 
 

  public ArmSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void arm_up() {

   Arm_Motor_1.set(Constants.Arm_Speed_Max);
    Arm_Motor_2.set(Constants.Arm_Speed_Max*-1);
    
    
     }

public void Arm_Speed(double speed){
  Arm_Motor_1.set(speed);
  Arm_Motor_2.set(speed*-1);
}







}
