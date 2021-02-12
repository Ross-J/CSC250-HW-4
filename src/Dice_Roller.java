import java.util.Random;

public class Dice_Roller
{
	int sides;
	
	Dice_Roller(int sides)
	{
		this.sides = sides;
	}
	
	int roll()
	{
		Random r = new Random();
		return r.nextInt(this.sides) + 1;
	}
}
