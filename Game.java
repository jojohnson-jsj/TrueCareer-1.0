
public class Game {
	
	// All game stats being tracked
	private String difficulty;
	private Boolean won;
	private int minutes;
	private int points;
	private int rebounds;
	private int assists;
	private int steals;
	private int blocks;
	private int turnovers;
	private int fgMade;
	private int fgAttempted;
	private double fgPercentage;
	private int threesMade;
	private int threesAttempted;
	private double threePercentage;
	
	// All getters and setters
	
	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	public Boolean getWon() {
		return won;
	}
	public void setWon(Boolean won) {
		this.won = won;
	}
	
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getRebounds() {
		return rebounds;
	}
	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}

	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public int getSteals() {
		return steals;
	}
	public void setSteals(int steals) {
		this.steals = steals;
	}
	
	public int getBlocks() {
		return blocks;
	}
	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	public int getTurnovers() {
		return turnovers;
	}
	public void setTurnovers(int turnovers) {
		this.turnovers = turnovers;
	}

	public int getFgMade() {
		return fgMade;
	}
	public void setFgMade(int fgMade) {
		this.fgMade = fgMade;
	}

	public int getFgAttempted() {
		return fgAttempted;
	}
	public void setFgAttempted(int fgAttempted) {
		this.fgAttempted = fgAttempted;
	}

	public int getThreesMade() {
		return threesMade;
	}
	public void setThreesMade(int threesMade) {
		this.threesMade = threesMade;
	}

	public int getThreesAttempted() {
		return threesAttempted;
	}
	public void setThreesAttempted(int threesAttempted) {
		this.threesAttempted = threesAttempted;
	}

	public double getFgPercentage() {
		return fgPercentage;
	}
	public void setFgPercentage() {		
		if (fgMade == 0 && fgAttempted == 0)
			fgPercentage = -1;
		else
			fgPercentage = ((double)fgMade / fgAttempted);
	}

	public double getThreePercentage() {
		return threePercentage;
	}
	public void setThreePercentage() {
		if (threesMade == 0 && threesAttempted == 0)
			threePercentage = -1;
		else
			threePercentage = ((double)threesMade / threesAttempted);
	}
}
