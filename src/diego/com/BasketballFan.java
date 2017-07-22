package diego.com;

public class BasketballFan implements Ball.IBall
{

	public BasketballFan(Ball ball)
	{
		ball.subscribeToBallOnPlay(this);
	}
	
	public void onBallInPlay(BallArgs args)
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("Basketball fan cannot catch such a fast ball!");
		System.out.println("Speed: " + args.getSpeed() + "; Direction: " + args.getSpeed());
		System.out.println("------------------------------------------------------------");
	}
	
}
