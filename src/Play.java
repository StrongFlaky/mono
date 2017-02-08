import java.util.Scanner;

public class Play 
{
	public static void playTime()
	{
		int location=-1;
		
		while(Player.p.getMoney()>0)
		{
			System.out.println("Your current money: "+Player.p.getMoney());
			int move=Dice.rollDice();
			if(location+move<40)
			{
				location=move+location;
				System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
				if(location==39)
				{
					System.out.println("You have reached the original, you get 200 bucks because of it");
					Player.p.setMoney(Player.p.getMoney()+200);
				}
			}
			else
			{
				location=0+(move-(40-location));
				System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
				System.out.println("You have passed the original, you get 200 bucks because of it");
				Player.p.setMoney(Player.p.getMoney()+200);
			}
			if(Board.board.get(location).getValue()>0)
			{
				if(Player.p.getMoney()>Board.board.get(location).getValue())
				{
					System.out.println("Do you want to buy this? Press ''y'' for yes, anything else for no.");
					Scanner scan=new Scanner(System.in);
					String result=scan.nextLine();
					if(result.equals("y"))
					{
						System.out.println("Congratulations! You now own this. The information has been updated.");
						Board.board.get(location).setOccupation(Player.p.getName());
						Board.board.get(location).setNumber(1);
						System.out.println("New information: ");
						for(int i=0; i<=39; i++)
						{
							System.out.println(Board.board.get(i));
							if(i==39)
							{
							}
						}
						Player.p.setMoney(Player.p.getMoney()-Board.board.get(location).getValue());
					}
					else
					{
						System.out.println("Alright then");
					}
					
					
				}
				else
				{
					System.out.println("You have no money to buy this land.");
				}
			}
		}
		System.out.println("Sorry! You have no money. Thanks for playing.");
	}
}
