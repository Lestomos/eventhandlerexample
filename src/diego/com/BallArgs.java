package diego.com;

public class BallArgs
{
	private int speed;
	private String direction;

	public BallArgs(int speed, String direction)
	{
		this.speed = speed;
		this.direction = direction;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public String getDirection()
	{
		return direction;
	}

	public void setDirection(String direction)
	{
		this.direction = direction;
	}
}
