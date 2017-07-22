package diego.com;

public class Player implements Ball.IBall
{
	
	public Player(Ball b)
	{
		b.subscribeToBallOnPlay(this);
	}
	
	public void onBallInPlay(BallArgs args)
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("Player running to catch the ball!");
		System.out.println("Speed: " + args.getSpeed() + "; Direction: " + args.getSpeed());
		System.out.println("------------------------------------------------------------");
	}
}
