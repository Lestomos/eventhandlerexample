package diego.com;
import java.util.ArrayList;
import java.util.List;

public class Ball
{
	List<IBall> subscribersList = new ArrayList<IBall>();
	
	public static interface IBall
	{
		void onBallInPlay(BallArgs args);
	}
	
	public void subscribeToBallOnPlay(IBall b)
	{
		subscribersList.add(b);
	}
	
	public void throwTheBall()
	{
		for(IBall subscriber : subscribersList)
		{
			subscriber.onBallInPlay(new BallArgs(5, "North"));
		}
	}
}