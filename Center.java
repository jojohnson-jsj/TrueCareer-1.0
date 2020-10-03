public class Center extends PlayerPosition{
	
	public Center() { 
		
		// Took the average of each category for the 50 highest Centers of each labeled stat on stats.nba.com and rounded up or down
		// They are multiplied to be down/up weighted depending on how much I think each category should matter to that position
		
		this.averagePoints = 13; 						// Scoring 
		this.averageRebounds = 8 * 0.50; 				// Rebounds 
		this.averageAssists = 2 * 2; 					// Assists
		this.averageSteals = 1 * 3; 					// Steals 
		this.averageBlocks = 1 * 0.9; 					// Blocks 
		this.averageTurnovers = 2; 						// Turnover 
		this.averageFgPercentage = 0.54; 				// Scoring
		this.averageThreePercentage = 0.27; 			// Scoring
	}
}
