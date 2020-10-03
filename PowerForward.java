public class PowerForward extends PlayerPosition{
	
	public PowerForward() { 
		
		// Took the average of each category for the 50 highest Forwards of each labeled stat on stats.nba.com and rounded up or down
		// They are multiplied to be down/up weighted depending on how much I think each category should matter to that position
		
		this.averagePoints = 18 * 0.80; 				// Scoring 
		this.averageRebounds = 8 * 0.50; 				// Rebounds 
		this.averageAssists = 4 * 1.4; 					// Assists
		this.averageSteals = 1 * 3; 					// Steals 
		this.averageBlocks = 1 * 2; 					// Blocks 
		this.averageTurnovers = 2; 						// Turnover 
		this.averageFgPercentage = 0.48; 				// Scoring
		this.averageThreePercentage = 0.34; 			// Scoring
	}
}
