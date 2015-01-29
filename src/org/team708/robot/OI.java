package org.team708.robot;

import org.team708.robot.commands.ToggleHockeyStick;
import org.team708.robot.util.Gamepad;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Gamepad driverGamepad = new Gamepad(RobotMap.driverGamepad);
	public static Gamepad operatorGamepad = new Gamepad(RobotMap.operatorGamepad);
	
	//Driver Gamepad
	private static final int deployHockeyButtonNumber = Gamepad.button_Y;
	private static final int retractHockeyButtonNumber = Gamepad.button_Y;
	
	//* Driver Buttons //
	
	//deploys the Hockey Stick
	public static final Button deployHockeyStick = new JoystickButton(driverGamepad, deployHockeyButtonNumber);
	public static final Button retractHockeyStick = new JoystickButton(driverGamepad, retractHockeyButtonNumber);
	
	public OI() {
		//Driver
		deployHockeyStick.whenPressed(new ToggleHockeyStick());
		retractHockeyStick.whenPressed(new ToggleHockeyStick());
	}
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

