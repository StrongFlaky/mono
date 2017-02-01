import java.util.ArrayList;

public class Board
{
	static ArrayList<Square>board=new ArrayList <Square>();
	
	public static void setBoard()
	{
		
		board.add(new Square(1,"Mediterranean Avenue", 60, "purple", false, "none", 0));
		board.add(new Square(2,"Community Chest", 0, "none", false, "none", 0));
		board.add(new Square(3,"Baltic Avenue", 60, "purple", false, "none", 0));
		board.add(new Square(4,"Income Tax", 0, "none", false, "none", 0));
		board.add(new Square(5,"Reading Railroad", 200, "none", false, "none", 0));
		board.add(new Square(6,"Oriental Avenue", 60, "silver", false, "none", 0));
		board.add(new Square(7,"Chance", 0, "none", false, "none", 0));
		board.add(new Square(8,"Vermont Avenue", 100, "silver", false, "none", 0));
		board.add(new Square(9,"Connecticut Avenue", 120, "silver", false, "none", 0));
		board.add(new Square(10,"In Jail", 0, "none", false, "none", 0));
		board.add(new Square(11,"St. Charles Place", 140, "pink", false, "none", 0));
		board.add(new Square(12,"Electric Company", 150, "none", false, "none", 0));
		board.add(new Square(13,"States Avenue", 140, "pink", false, "none", 0));
		board.add(new Square(14,"Virginia Avenue", 160, "pink", false, "none", 0));
		board.add(new Square(15,"Pennsylvania Road", 200, "none", false, "none", 0));
		board.add(new Square(16,"St. James Place", 180, "orange", false, "none", 0));
		board.add(new Square(17,"Community Chest", 0, "none", false, "none", 0));
		board.add(new Square(18,"Tennessee Avenue", 180, "orange", false, "none", 0));
		board.add(new Square(19,"New York Avenue", 200, "orange", false, "none", 0));
		board.add(new Square(20,"Free Parking", 0, "none", false, "none", 0));
		board.add(new Square(21,"Kentucky Avenue", 220, "red", false, "none", 0));
		board.add(new Square(22,"Chance", 0, "none", false, "none", 0));
		board.add(new Square(23,"Indiana Avenue", 220, "red", false, "none", 0));
		board.add(new Square(24,"Illinois Avenue", 240, "red", false, "none", 0));
		board.add(new Square(25,"B & O Railroad", 200, "none", false, "none", 0));
		board.add(new Square(26,"Atlantic Avenue", 260, "yellow", false, "none", 0));
		board.add(new Square(27,"Ventnor Avenue", 0, "yellow", false, "none", 0));
		board.add(new Square(28,"Water Works", 150, "none", false, "none", 0));
		board.add(new Square(29,"Marvin Gardens", 280, "yellow", false, "none", 0));
		board.add(new Square(30,"Go To Jail", 0, "none", false, "none", 0));
		board.add(new Square(31,"Pacific Avenue", 300, "green", false, "none", 0));		
		board.add(new Square(32,"North Carolina Avenue", 300, "green", false, "none", 0));
		board.add(new Square(33,"Community Chest", 0, "none", false, "none", 0));
		board.add(new Square(34,"Pennsylvania Avenue", 320, "green", false, "none", 0));
		board.add(new Square(35,"Short Line", 200, "none", false, "none", 0));
		board.add(new Square(36,"Chance", 0, "none", false, "none", 0));
		board.add(new Square(37,"Park Place", 350, "blue", false, "none", 0));
		board.add(new Square(38,"Luxury Tax", 75, "none", false, "none", 0));
		board.add(new Square(39,"Boardwalk", 400, "blue", false, "none", 0));
		board.add(new Square(40,"Collect $200", 0, "none", false, "none", 0));
		for(int i=0; i<=39; i++)
		System.out.println(board.get(i));
	}
	
	
	
}
