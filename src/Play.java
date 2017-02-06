import java.util.Scanner;

public class Play 
{
	public static void playTime()
	{
		int location=0;
		
		while(Player.p.getMoney()>0)
		{
			System.out.println("Your current money: "+Player.p.getMoney());
			int move=Dice.rollDice();
			if(location+move<40)
			{
				location=move+location;
				System.out.println("You rolled "+move+" and have arrive: "+Board.board.get(location));
			}
			else
			{
				location=0+(move-(40-location));
				System.out.println("You rolled "+move+" and have arrive: "+Board.board.get(location));
			}
			if(Board.board.get(location).getValue()>0)
			{
				if(Player.p.getMoney()>Board.board.get(location).getValue())
				{
					System.out.println("Do you want to buy this land? press letter y for yes, anything else for no.");
					Scanner scan=new Scanner(System.in);
					String result=scan.nextLine();
					if(result.equals("y"))
					{
						System.out.println("Good, now you own this land, informations are updated.");
						Board.board.get(location).setOccupation(Player.p.getName());
						Board.board.get(location).setNumber(1);
						System.out.println("New information: ");
						for(int i=0; i<=39; i++)
						{
							System.out.println(Board.board.get(i));
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
					System.out.println("Ops. you have no more money to buy this land.");
				}
			}
		}
		System.out.println("Ops, you have no money, you lose, you get nothing, good day sir.");
	}
}
