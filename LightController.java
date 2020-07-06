package soliriusCodeExercise;

/**
 * this class will allow a user to control the lights
 * 
 * @author colmokane
 *
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class LightController {

	/**
	 * constant values for light default number (1 - 20)
	 */
	public static final int DEFAULT_MIN = 1;
	public static final int DEFAULT_MAX = 20;

	// main method
	public static void main(String[] args) {

		// create some lights here..
		Light red = new Light(1, Colour.Red, "On");
		Light blue = new Light(2, Colour.Blue, "On");
		Light green = new Light(3, Colour.Green, "On");
		Light yellow = new Light(4, Colour.Yellow, "On");
		Light white = new Light(5, Colour.White, "On");
		Light red2 = new Light(6, Colour.Green, "On");
		Light blue2 = new Light(7, Colour.Blue, "On");

		// store lights in an array
		Light[] lights = { red, blue, green, yellow, white, red2, blue2 };

		// call method declarations
		runProgram(lights);

	} // end of main method

	/**
	 * method to display array contents and run program
	 */
	public static void runProgram(Light[] lights) {

		// do while loop will run infinitely until stopped or default exceeded
		do {

			// outer loop
			for (int outerLoop = 0; outerLoop < lights.length; outerLoop++) {

				// inner loop
				for (int innerLoop = 0; innerLoop < 1; innerLoop++) {

					// time stamp
					getTime();
					try {
						// wait for 0.5 seconds
						Thread.sleep(500);
					} catch (InterruptedException exception) {
						exception.printStackTrace();
						System.out.println("Error - something went wrong.."); // if exception - print error message
					}

					// switch light on
					System.out.println(lights[outerLoop].getNumber() + " " + lights[outerLoop].getColour() + " Light "
							+ lights[outerLoop].getState());

					System.out.println(); // line break

					// if inner loop not equal to array length, switch light off
					if (innerLoop != lights.length) {
						// time stamp
						getTime();
						System.out.println(lights[outerLoop].getNumber() + " " + lights[outerLoop].getColour()
								+ " Light " + lights[innerLoop].switchState());

					}

				}
				try {
					// wait for 0.5 seconds
					Thread.sleep(500);
				} catch (InterruptedException exception) {
					exception.printStackTrace();
					System.out.println("Error - something went wrong.."); // if exception - print error message
				}

				// if light number less than 1 or greater than 20 (default) loop will terminate
				if (lights[outerLoop].getNumber() < DEFAULT_MIN || lights[outerLoop].getNumber() > DEFAULT_MAX) {
					System.out.println("Loop interrupted.. Light number Out of Bounds (1-20) - Exiting program!");
					System.exit(outerLoop);

				}
			}
			// end of infinite do while loop
		} while (true);
	}

	/**
	 * method to return current time
	 */
	public static void getTime() {

		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		System.out.print(time.format(date) + ": ");
	}

}
