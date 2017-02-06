import java.util.ArrayList;

public class Board
{
	static ArrayList<Square>board=new ArrayList <Square>();


	public static void setBoard(String ab)
	{
		if(ab.equals("World"))
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
			{
				System.out.println(board.get(i));
			}
		}
		else
		{
			board.add(new Square(1,"Mt. Sherman", 60, "purple", false, "none", 0));
			board.add(new Square(2,"Trail Fortune", 0, "none", false, "none", 0));
			board.add(new Square(3,"Quandary Peak", 60, "purple", false, "none", 0));
			board.add(new Square(4,"CO Fourteeners Initiative", 0, "none", false, "none", 0));
			board.add(new Square(5,"LittleBear-Blanca 14er Traverse", 200, "none", false, "none", 0));
			board.add(new Square(6,"Mt. Bierstadt", 60, "silver", false, "none", 0));
			board.add(new Square(7,"Go for an Adventure", 0, "none", false, "none", 0));
			board.add(new Square(8,"Torreys Peak", 100, "silver", false, "none", 0));
			board.add(new Square(9,"Grays Peak", 120, "silver", false, "none", 0));
			board.add(new Square(10,"Basecamp / Hiking Through", 0, "none", false, "none", 0));
			board.add(new Square(11,"Mt. Yale", 140, "pink", false, "none", 0));
			board.add(new Square(12,"Pikes Peak (14er Toll Road)", 150, "none", false, "none", 0));
			board.add(new Square(13,"Mt. Princeton", 140, "pink", false, "none", 0));
			board.add(new Square(14,"Mt. Harvard", 160, "pink", false, "none", 0));
			board.add(new Square(15,"Crestones 14er Traverse", 200, "none", false, "none", 0));
			board.add(new Square(16,"Humboldt Peak", 180, "orange", false, "none", 0));
			board.add(new Square(17,"Trail Fortune", 0, "none", false, "none", 0));
			board.add(new Square(18,"Mt. Lindsey", 180, "orange", false, "none", 0));
			board.add(new Square(19,"Kit Carson Peak", 200, "orange", false, "none", 0));
			board.add(new Square(20,"Scenic Viewpoint", 0, "none", false, "none", 0));
			board.add(new Square(21,"Mt. Sneffels", 220, "red", false, "none", 0));
			board.add(new Square(22,"Go for an Adventure", 0, "none", false, "none", 0));
			board.add(new Square(23,"Uncompahgre Peak", 220, "red", false, "none", 0));
			board.add(new Square(24,"Mt. Eolus", 240, "red", false, "none", 0));
			board.add(new Square(25,"Wilson-El Diente 14er Traverse", 200, "none", false, "none", 0));
			board.add(new Square(26,"Mount of the Holy Cross", 260, "yellow", false, "none", 0));
			board.add(new Square(27,"Mt. Massive", 0, "yellow", false, "none", 0));
			board.add(new Square(28,"Mt. Evans (14er Toll Road)", 150, "none", false, "none", 0));
			board.add(new Square(29,"Mt. Elbert", 280, "yellow", false, "none", 0));
			board.add(new Square(30,"Go to Basecamp", 0, "none", false, "none", 0));
			board.add(new Square(31,"Castle Peak", 300, "green", false, "none", 0));		
			board.add(new Square(32,"Snowmass Mountain", 300, "green", false, "none", 0));
			board.add(new Square(33,"Trail Fortune", 0, "none", false, "none", 0));
			board.add(new Square(34,"Pyramid Peak", 320, "green", false, "none", 0));
			board.add(new Square(35,"Maroon Bells 14er Traverse", 200, "none", false, "none", 0));
			board.add(new Square(36,"Go for an Adventure", 0, "none", false, "none", 0));
			board.add(new Square(37,"Longs Peak", 350, "blue", false, "none", 0));
			board.add(new Square(38,"You Lost a Boot", 75, "none", false, "none", 0));
			board.add(new Square(39,"Capitol Peak", 400, "blue", false, "none", 0));
			board.add(new Square(40,"Trailhead", 0, "none", false, "none", 0));
			for(int i=0; i<=39; i++)
			{
				System.out.println(board.get(i));
			}
		}
	}
}

