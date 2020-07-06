package soliriusCodeExercise;

/**
 * this class will represent a light
 * 
 * @author colmokane
 *
 */

public class Light {

	// instant variables

	/**
	 * light number
	 */
	private int number;

	/**
	 * light colour
	 */
	private Colour colour;

	/**
	 * light state
	 */
	private String state;

	/**
	 * default constructor
	 */
	public Light() {

	}

	/**
	 * constructor with arguments
	 */
	public Light(int number, Colour colour, String state) {
		super();
		this.number = number;
		this.colour = colour;
		this.state = state;
	}

	// getters and setters

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param set the number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the colour
	 */
	public Colour getColour() {
		return colour;
	}

	/**
	 * @param set the colour
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param set the state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * method to switch state to off
	 */
	public String switchState() {
		return "Off";
	}

	/**
	 * to string method
	 */
	@Override
	public String toString() {
		return "Light [colour=" + colour + "state=" + state + "]";
	}

}
