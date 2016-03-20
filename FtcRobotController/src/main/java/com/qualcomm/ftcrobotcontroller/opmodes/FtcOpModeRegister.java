/* Copyright (c) 2014, 2015 Qualcomm Technologies Inc

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Qualcomm Technologies Inc nor the names of its contributors
may be used to endorse or promote products derived from this software without
specific prior written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.FTC3486.OpModes.BlueAutoPark;
import com.FTC3486.OpModes.BlueAutoSmash;
import com.FTC3486.OpModes.ColorSensorTest;
import com.FTC3486.OpModes.OpticalDistanceDriveTest;
import com.FTC3486.OpModes.OpticalDistanceSensorTest;
import com.FTC3486.OpModes.RedAutoPark;
import com.FTC3486.OpModes.RedAutoSmash;
import com.FTC3486.OpModes.StraightDefense;
import com.FTC3486.OpModes.TeleOp2016;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

/**
 * Register Op Modes
 */
public class FtcOpModeRegister implements OpModeRegister {

  /**
   * The Op Mode Manager will call this method when it wants a list of all
   * available op modes. Add your op mode to the list to enable it.
   *
   * @param manager op mode manager
   */
  public void register(OpModeManager manager) {
    manager.register("NullOp", NullOp.class);
    manager.register("TeleOp2016", TeleOp2016.class);
    manager.register("RedAutoPark", RedAutoPark.class);
    manager.register("BlueAutoPark", BlueAutoPark.class);
    manager.register("RedAutoSmash", RedAutoSmash.class);
    manager.register("BlueAutoSmash", BlueAutoSmash.class);
    manager.register("StraightDefense", StraightDefense.class);
    manager.register("OpticalDistanceSensorTest", OpticalDistanceSensorTest.class);
    manager.register("ColorSensorTest", ColorSensorTest.class);
    manager.register("ODSDriveTest", OpticalDistanceDriveTest.class);
  }
}
