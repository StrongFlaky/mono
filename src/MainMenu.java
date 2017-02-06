import java.util.Scanner;
public class MainMenu 
{
	static String name;
	static int money;
	public static void main (String args[])
	{
		introduction();
		Player p=new Player(name, money);//the only way to create an object after doing blueprint in "Player" class
		Map.mapVersion();
		Play.playTime();
	}
	public static void introduction()
	{
		System.out.print("Welcome to Monopoly Game. ");
		System.out.println("Let's have some fun.");
		System.out.println("Now plz enter your name");
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		System.out.println("Now plz enter the money you and your opponent want.");
		Scanner scan1=new Scanner(System.in);
		money=scan.nextInt();
		if(money<=0)
		{
			System.out.println("How dare you do so? Let's go back and restart.");
			introduction();
		}
	}
}
 