import java.util.Scanner;
public class Map 
{
	public static void mapVersion()
	{
		System.out.println("What version of monopoly would you like to play?");
		System.out.println("Enter ''a'' for the noraml version, any other key for the colorado version.");
		Scanner scan=new Scanner(System.in);
		String answer=scan.nextLine();
		if(answer.equals("a"))
		{
			Board.setBoard("World");
		}
		else
		{
			Board.setBoard("Colorado");
		}
	}
}
