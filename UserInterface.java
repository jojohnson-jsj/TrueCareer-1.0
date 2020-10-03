import java.util.*;

public class UserInterface {

	public static void main(String [] args) {
		System.out.println("Welcome to TrueCareer 1.0!");
		
		while (true)
		{
			System.out.println("Would you like to load in an existing player or create a new one?");
			System.out.println("(Enter 0 to load in a player and 1 to create a new one)");
		
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			int loadOrCreate = Integer.parseInt(scan.nextLine());
			
			if (loadOrCreate == 0)
				loadPlayer();
			else if (loadOrCreate == 1)
				createPlayer();
			else
				continue;
			
			break;
			
		}
		
		System.out.println("\nThank you for using TrueCareer 1.0!");
	}
	
	// Called by main. Creates a player based on user input and either adds it to a pre-existing XML file or creates a new one.
	public static void createPlayer()
	{
		int playerIndex = 0;
		int fileExists = 0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String XMLFileName;
		
		ArrayList<Player> playerList;
		
		System.out.println("Do you already have an XML file save with other players? Enter 1 for yes and 0 for no");
		fileExists = Integer.parseInt(scan.nextLine());
		
		
		
		if (fileExists == 1)
		{
			System.out.println("Enter the exact name of the XML file where you want to save this new player");
			XMLFileName = scan.nextLine();
		
			if (!XMLFileName.contains(".xml"))
				XMLFileName += ".xml";
		
			playerList = InOutXML.readPlayers(XMLFileName);
			
			playerIndex = playerList.size();
		}
		else 
		{
			System.out.println("Enter the exact name of the XML file you want to create to save this new player");
			XMLFileName = scan.nextLine();
			
			if (!XMLFileName.contains(".xml"))
				XMLFileName += ".xml";
			
			playerList = new ArrayList<>();
			playerIndex = 0;
		}
		
			
		
		playerList.add(new Player());
		
		playerList.get(playerIndex).createPlayer();
		
		InOutXML.writePlayers(playerList, XMLFileName);
		
		System.out.printf("%s has been created\n", playerList.get(playerIndex).getName());
		System.out.println("You can view your created player by running this programming again and selecting load");
		System.out.println("If any mistake were made during player creation, select load and edit to fix individual stats");
		
	}
	
	// Called by main. Displays the options available if the user chooses to load in a pre-created player, and calls other methods
	// to do a variety of tasks with that information. 
	public static void loadPlayer()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String enteredPlayerName;
		String XMLFileName;
		int playerIndex, found = 0;
		
		System.out.println("Enter the player's name exactly as it is saved.");
		enteredPlayerName = scan.nextLine();
		
		System.out.println("Enter the exact name of the XML file");
		XMLFileName = scan.nextLine();
		
		if (!XMLFileName.contains(".xml"))
			XMLFileName += ".xml";
		
		ArrayList<Player> playerList = InOutXML.readPlayers(XMLFileName);
		
		for (int i = 0; i < playerList.size(); i++)
		{
			if (playerList.get(i).getName().equals(enteredPlayerName))
			{
				playerIndex = i;
				found = 1;
				System.out.printf("%s has been loaded in\n\n", playerList.get(i).getName());
				
				while (true)
				{
					System.out.println("\nWould you like to edit a player's stats, view a player's stats, or enter stats for a played game?");
					System.out.println("\nEnter:\n0 to edit a player\n1 to view a player's stats\n2 to enter game statistics\n3 to use your XP for skill upgrades\n'exit' to exit");
					
					String initialChoice = scan.nextLine();
					
					if (initialChoice.equals("exit") || initialChoice.equals("Exit"))
						break;
					
					int choice = Integer.parseInt(initialChoice);
					
					if (choice == 0)
					{ 
						playerList.get(playerIndex).editPlayer();
						InOutXML.writePlayers(playerList, XMLFileName);
					}
					else if (choice == 1)
					{
						playerList.get(playerIndex).viewStats();
					}
					else if (choice == 2)
					{
						playerList.get(playerIndex).playGame();
						InOutXML.writePlayers(playerList, XMLFileName);
					}
					else if (choice == 3)
					{
						playerList.get(playerIndex).useXP();
						InOutXML.writePlayers(playerList, XMLFileName);
					}
					else
						continue;
				}
			}
			
			if (found == 1)
				break;
		}
		
		if (found == 0)
			System.out.println("The player name you entered is not stored in the XML file you entered");
		
		return;
	}
}
