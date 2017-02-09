import java.util.Scanner;

public class Play 
{
	public static void playTime()
	{
		int location=-1;
		
		boolean jail=false;
		
		while(Player.p.getMoney()>0)
		{
			System.out.println("Your current worth: "+Player.p.getMoney());
			int move=Dice.rollDice();
			if(jail==false)
			{
				if(location+move<40)
				{
					location=move+location;
					System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
					if(location==29)
					{
						System.out.println("Sorry! You have landed in jail! From now on, your movement will be reversed until you hit payday. You will also lose $50.");
						location=9;
						System.out.println("Your current location:" +Board.board.get(location));
						Player.p.setMoney(Player.p.getMoney()-50);
						jail=true;
					}
					if(location==39)
					{
						System.out.println("You have reached the end of the board! You get $200.");
						Player.p.setMoney(Player.p.getMoney()+200);
					}
				}
				else
				{
					location=0+(move-(40-location));
					System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
					System.out.println("You have reached the end of the board! You get $200.");
					Player.p.setMoney(Player.p.getMoney()+200);
				}
			}
			else
			{
				if(location-move>=0)
				{
					location=location-move;
					System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
				}
				else
				{
					location=39-(move-location);
					System.out.println("You rolled "+move+" and have moved to: "+Board.board.get(location));
					System.out.println("Your reversed journey has been ended. Your direction will become normal again. Sadly, you won't get the $200 salary.");
					jail=false;
				}
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
							if(Board.board.get(i).getNumber()==1)
							{
								System.out.println(Board.board.get(i));
							}
						}
						
						Player.p.setMoney(Player.p.getMoney()-Board.board.get(location).getValue());
					}
					else
					{
							System.out.println("Alright then.");
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
