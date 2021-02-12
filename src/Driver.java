
public class Driver 
{

	public static void main(String[] args)
	{
		Dice_Roller d6 = new Dice_Roller(6);
		Dice_Roller d8 = new Dice_Roller(8);
		Dice_Roller d12 = new Dice_Roller(12);
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(d6.roll());
			System.out.println(d8.roll());
			System.out.println(d12.roll());
		}
	}
}
