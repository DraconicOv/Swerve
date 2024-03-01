// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Launcher extends SubsystemBase {
    private final CANSparkMax grabFeedMotor;
    private final CANSparkMax moveFeedMotor;
    private final CANSparkMax launchMotorR;
    private final CANSparkMax launchMotorL;
    public Launcher(){
        grabFeedMotor = new CANSparkMax(Constants.grabFeedMotorId, MotorType.kBrushless);
        grabFeedMotor.restoreFactoryDefaults();
        grabFeedMotor.setSmartCurrentLimit(38);
        moveFeedMotor = new CANSparkMax(Constants.moveFeedMotorId, MotorType.kBrushless);
        moveFeedMotor.restoreFactoryDefaults();
        moveFeedMotor.setSmartCurrentLimit(38);
        launchMotorR = new CANSparkMax(Constants.launchMotorRId, MotorType.kBrushless);
        launchMotorR.restoreFactoryDefaults();
        launchMotorR.setSmartCurrentLimit(38);
        launchMotorL = new CANSparkMax(Constants.launchMotorLId, MotorType.kBrushless);
        launchMotorL.restoreFactoryDefaults();
        launchMotorL.setSmartCurrentLimit(38);
    }
    public void grabNote(){
        grabFeedMotor.set(-0.3);
        moveFeedMotor.set(0.3);
    }
    public void stopGrab(){
        grabFeedMotor.set(0.0);
        moveFeedMotor.set(0.0);
    }
    public void launchNote(){
        launchMotorL.set(0.8);
        launchMotorR.set(0.8);
    }

    public void stopLauncher(){
        launchMotorL.set(0);
        launchMotorR.set(0);
    }
}
