
public abstract class PlayerPosition {
	protected double averagePoints;
	protected double averageRebounds;
	protected double averageAssists;
	protected double averageSteals;
	protected double averageBlocks;
	protected double averageTurnovers;
	protected double averageFgPercentage;
	protected double averageThreePercentage;
	
	// Getters for each position's averages
	
	public double getAveragePoints() {
		return this.averagePoints;
	}

	public double getAverageRebounds() {
		return this.averageRebounds;	
	}

	public double getAverageAssists() {
		return this.averageAssists;		
	}

	public double getAverageSteals() {
		return this.averageSteals;		
	}

	public double getAverageBlocks() {
		return this.averageBlocks;		
	}

	public double getAverageTurnovers() {
		return this.averageTurnovers;		
	}

	public double getAverageFgPercentage() {
		return this.averageFgPercentage;		
	}

	public double getAverageThreePercentage() {
		return this.averageThreePercentage;		
	}
}
