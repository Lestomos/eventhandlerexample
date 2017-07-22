package diego.com;

public class Referee implements Ball.IBall
{
	
	public Referee(Ball b)
	{
		b.subscribeToBallOnPlay(this);
	}
	
	public void onBallInPlay(BallArgs args)
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("Referee watching the ball!");
		System.out.println("Speed: " + args.getSpeed() + "; Direction: " + args.getSpeed());
		System.out.println("------------------------------------------------------------");
	}
}
