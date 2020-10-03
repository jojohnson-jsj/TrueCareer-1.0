public class ShootingGuard extends PlayerPosition{
	
	public ShootingGuard() { 
		
		// Took the average of each category for the 50 highest Guards of each labeled stat on stats.nba.com and rounded up or down
		// They are multiplied to be down/up weighted depending on how much I think each category should matter to that position
		
		this.averagePoints = 25 * 0.45; 				// Scoring 
		this.averageRebounds = 5 * 1.5; 				// Rebounds 
		this.averageAssists = 6 * 1.25; 				// Assists
		this.averageSteals = 1 * 4; 					// Steals 
		this.averageBlocks = 1 * 4; 					// Blocks 
		this.averageTurnovers = 3 * 0.75; 				// Turnover 
		this.averageFgPercentage = 0.45; 				// Scoring
		this.averageThreePercentage = 0.44; 			// Scoring
	}
}
