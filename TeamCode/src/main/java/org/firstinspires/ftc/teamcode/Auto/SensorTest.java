package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

import org.firstinspires.ftc.teamcode.Subsystems.BaconActivator;

/**
 * Created by Owner_2 on 12/31/2016.
 */
@Autonomous(name="SensorTest", group="Autonomus")
public class SensorTest extends LinearOpMode {
    ColorSensor colorSensor;
    OpticalDistanceSensor left_ods;
    OpticalDistanceSensor right_ods;
    OpticalDistanceSensor right_back_ods;
    GyroSensor gyro;
   // ModernRoboticsI2cRangeSensor range;
    ModernRoboticsI2cRangeSensor rangeSensor1;
    ModernRoboticsI2cRangeSensor rangeSensor2;

    BaconActivator baconActivator;

    @Override
    public void runOpMode() {
        colorSensor = hardwareMap.colorSensor.get("Beacon Color");
        //range = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "Range");
        rangeSensor1 = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "Range 1");
        rangeSensor2 = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "Range 2");
        gyro = hardwareMap.gyroSensor.get("gyroSensor");
        left_ods = hardwareMap.opticalDistanceSensor.get("Left ods");
        right_ods = hardwareMap.opticalDistanceSensor.get("Right ods");

        right_back_ods = hardwareMap.opticalDistanceSensor.get("Right Back ods");
        baconActivator = new BaconActivator("Bacon Activator", hardwareMap);

        telemetry.update();

        colorSensor.enableLed(false);
        baconActivator.sensorScanning();
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Blue ", colorSensor.blue());
            telemetry.addData("Raw Left", left_ods.getRawLightDetected());
            telemetry.addData("Left ODS reading", left_ods.getLightDetected());
            telemetry.addData("Raw Right", right_ods.getRawLightDetected());
            telemetry.addData("Right ODS reading", right_ods.getLightDetected());
            telemetry.addData("Raw Back Right", right_back_ods.getRawLightDetected());
            telemetry.addData("Right Back ODS reading", right_back_ods.getLightDetected());
            telemetry.addData("Raw Ultrasonic 1", rangeSensor1.rawUltrasonic());
            telemetry.addData("Cm Ultrasonic 1", rangeSensor1.cmUltrasonic());
            telemetry.addData("Raw Ultrasonic 2", rangeSensor2.rawUltrasonic());
            telemetry.addData("Cm Ultrasonic 2", rangeSensor2.cmUltrasonic());
           // telemetry.addData("raw ultrasonic", range.rawUltrasonic());
            //telemetry.addData("raw optical", range.rawOptical());
            //telemetry.addData("cm optical", "%.2f cm", range.cmOptical());
            //telemetry.addData("cm", "%.2f cm", range.getDistance(DistanceUnit.CM));
            telemetry.update();

        }
    }
}