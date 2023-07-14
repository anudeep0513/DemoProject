package demopack12;

public class InvalidTimeException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hour;
	private String min;
	private String sec;
	@Override
	public String toString()
	{
		return this.hour+"[0-23]"+this.min+"0-59"+this.sec+"0-59";
	}
}
