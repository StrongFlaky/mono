import java.util.Scanner;
public class Dice 
{
	public static int rollDice()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Press any key to roll the dice.");
		String word=scan.nextLine();
		int die1=(int)(Math.random()*6)+1;
		int die2=(int)(Math.random()*6)+1;
		return die1+die2;
	}
}

