package diego.com;

public class Test
{

	public static void main(String[] args)
	{
		Ball b = new Ball();
		BasketballFan fan = new BasketballFan(b);
		Referee ref = new Referee(b);
		Player player = new Player(b);
		
		System.out.println("TEST: Throwing the ball. Watch out!");
		b.throwTheBall();

	}

}
