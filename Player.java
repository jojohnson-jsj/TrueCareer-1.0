import java.util.*;

public class Player extends PlayerBase{
	
	private Game game = new Game();
	
	public Player() {
		
	}
	
	
	public void useXP()
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String attribute = "";
		Integer enteredAtt = null;
		int numPoints = 0;
		int oldStat = 0;
		Map<String, Integer> statMap;
		
		System.out.println("Every 5 points of XP are one point you can use to uprgade and attribute");
		
		if (this.getXp() > 1.00)
		{
			statMap = createStatMap();
			
			while (true)
			{
				System.out.printf("%s currently has %.02f XP, resulting in %d points available for upgrades", this.getName(), this.getXp(), (int)Math.floor(this.getXp() / 5));
				System.out.println("\nEnter the attribute you want to upgrade, or enter 'exit' to exit");
				attribute = scan.nextLine();
				if (attribute.equals("exit") || attribute.equals("Exit"))
					break;
				
				enteredAtt = statMap.get(attribute);
				
				if (enteredAtt != null)
				{
					 while (true)
					 {
						 System.out.println("How many points do you want to use to upgrade this attribute?");
					 	 numPoints = Integer.parseInt(scan.nextLine()) * 5;
					 	 
					 	 if (this.getXp() - numPoints < 0)
					 		 System.out.println("You must enter a valid amount. 5 XP points are one attribute upgrade point");
					 	 else
					 		 break;
					 }
					 
					 numPoints /= 5;
					 
					 switch (enteredAtt)
						{	
							case 3 : 
								oldStat = this.getStandingLayup();
								this.setStandingLayup(oldStat + numPoints);
								System.out.printf("Standing Layup went from %d to %d\n", oldStat, this.getStandingLayup());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 4 : 
								oldStat = this.getPostFadeaway();
								this.setPostFadeaway(oldStat + numPoints);
								System.out.printf("Post Fadeaway went from %d to %d\n", oldStat, this.getPostFadeaway());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 5 : 
								oldStat = this.getPostHook();
								this.setPostHook(oldStat + numPoints);
								System.out.printf("Post Hook went from %d to %d\n", oldStat, this.getPostHook());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 6 : 
								oldStat = this.getPostControl();
								this.setPostControl(oldStat + numPoints);
								System.out.printf("Post Control went from %d to %d\n", oldStat, this.getPostControl());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 7 : 
								oldStat = this.getDrawFoul();
								this.setDrawFoul(oldStat + numPoints);
								System.out.printf("Draw Foul went from %d to %d\n", oldStat, this.getDrawFoul());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 8 : 
								oldStat = this.getShotClose();
								this.setShotClose(oldStat + numPoints);
								System.out.printf("Shot Close went from %d to %d\n", oldStat, this.getShotClose());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 9 : 
								oldStat = this.getContestedShotMid();
								this.setContestedShotMid(oldStat + numPoints);
								System.out.printf("Contested Shot Mid went from %d to %d\n", oldStat, this.getContestedShotMid());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 10 : 
								oldStat = this.getOpenShotMid();
								this.setOpenShotMid(oldStat + numPoints);
								System.out.printf("Open Shot Mid went from %d to %d\n", oldStat, this.getOpenShotMid());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 11 : 
								oldStat = this.getOffDribbleShotMid();
								this.setOffDribbleShotMid(oldStat + numPoints);
								System.out.printf("Off Dribble Shot Mid went from %d to %d\n", oldStat, this.getOffDribbleShotMid());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 12 : 
								oldStat = this.getContestedThree();
								this.setContestedThree(oldStat + numPoints);
								System.out.printf("Contested Three went from %d to %d\n", oldStat, this.getContestedThree());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 13 : 
								oldStat = this.getOpenThree();
								this.setOpenThree(oldStat + numPoints);
								System.out.printf("Open Three went from %d to %d\n", oldStat, this.getOpenThree());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 14 : 
								oldStat = this.getOffDribbleThree();
								this.setOffDribbleThree(oldStat + numPoints);
								System.out.printf("Off Dribble Three went from %d to %d\n", oldStat, this.getOffDribbleThree());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 15 : 
								oldStat = this.getFreeThrow();
								this.setFreeThrow(oldStat + numPoints);
								System.out.printf("Free Throw went from %d to %d\n", oldStat, this.getFreeThrow());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 16 : 
								oldStat = this.getBallControl();
								this.setBallControl(oldStat + numPoints);
								System.out.printf("Ball Control went from %d to %d\n", oldStat, this.getBallControl());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 17 : 
								oldStat = this.getPassingVision();
								this.setPassingVision(oldStat + numPoints);
								System.out.printf("Passing Vision went from %d to %d\n", oldStat, this.getPassingVision());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 18 : 
								oldStat = this.getPassingIQ();
								this.setPassingIQ(oldStat + numPoints);
								System.out.printf("Passing IQ went from %d to %d\n", oldStat, this.getPassingIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 19 : 
								oldStat = this.getPassingAccuracy();
								this.setPassingAccuracy(oldStat + numPoints);
								System.out.printf("Passing Accuracy went from %d to %d\n", oldStat, this.getPassingAccuracy());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 20 : 
								oldStat = this.getOffensiveRebound();
								this.setOffensiveRebound(oldStat + numPoints);
								System.out.printf("Offensive Rebound went from %d to %d\n", oldStat, this.getOffensiveRebound());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 21 : 
								oldStat = this.getStandingDunk();
								this.setStandingDunk(oldStat + numPoints);
								System.out.printf("Standing Dunk went from %d to %d\n", oldStat, this.getStandingDunk());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 22 : 
								oldStat = this.getDrivingDunk();
								this.setDrivingDunk(oldStat + numPoints);
								System.out.printf("Driving Dunk went from %d to %d\n", oldStat, this.getDrivingDunk());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 23 : 
								oldStat = this.getContactDunk();
								this.setContactDunk(oldStat + numPoints);
								System.out.printf("Contact Dunk went from %d to %d\n", oldStat, this.getContactDunk());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 24 : 
								oldStat = this.getShotIQ();
								this.setShotIQ(oldStat + numPoints);
								System.out.printf("Shot IQ went from %d to %d\n", oldStat, this.getShotIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
							
							case 25 : 
								oldStat = this.getHands();
								this.setHands(oldStat + numPoints);
								System.out.printf("Hands went from %d to %d\n", oldStat, this.getHands());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 26 : 
								oldStat = this.getDefensiveRebound();
								this.setDefensiveRebound(oldStat + numPoints);
								System.out.printf("Defensive Rebound went from %d to %d\n", oldStat, this.getDefensiveRebound());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 27 : 
								oldStat = this.getBlock();
								this.setBlock(oldStat + numPoints);
								System.out.printf("Block went from %d to %d\n", oldStat, this.getBlock());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 28 : 
								oldStat = this.getShotContest();
								this.setShotContest(oldStat + numPoints);
								System.out.printf("Shot Contest went from %d to %d\n", oldStat, this.getShotContest());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 29 : 
								oldStat = this.getSteal();
								this.setSteal(oldStat + numPoints);
								System.out.printf("Steal went from %d to %d\n", oldStat, this.getSteal());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 30 : 
								oldStat = this.getOnBallDefenseIQ();
								this.setOnBallDefenseIQ(oldStat + numPoints);
								System.out.printf("On Ball Defense IQ went from %d to %d\n", oldStat, this.getOnBallDefenseIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 31 : 
								oldStat = this.getLowPostDefenseIQ();
								this.setLowPostDefenseIQ(oldStat + numPoints);
								System.out.printf("Low Post Defense IQ went from %d to %d\n", oldStat, this.getLowPostDefenseIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 32 : 
								oldStat = this.getReactionTime();
								this.setReactionTime(oldStat + numPoints);
								System.out.printf("Reaction Time went from %d to %d\n", oldStat, this.getReactionTime());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 33 : 
								oldStat = this.getBoxout();
								this.setBoxout(oldStat + numPoints);
								System.out.printf("Boxout went from %d to %d\n", oldStat, this.getBoxout());
								this.setXp(this.getXp() - numPoints * 5);
								break;
							
							case 34 : 
								oldStat = this.getLateralQuickness();
								this.setLateralQuickness(oldStat + numPoints);
								System.out.printf("Lateral Quickness went from %d to %d\n", oldStat, this.getLateralQuickness());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 35 : 
								oldStat = this.getSpeed();
								this.setSpeed(oldStat + numPoints);
								System.out.printf("Speed went from %d to %d\n", oldStat, this.getSpeed());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 36 : 
								oldStat = this.getSpeedWithBall();
								this.setSpeedWithBall(oldStat + numPoints);
								System.out.printf("Speed With Ball went from %d to %d\n", oldStat, this.getSpeedWithBall());
								this.setXp(this.getXp() - numPoints * 5);
								break;
							
							case 37 : 
								oldStat = this.getAcceleration();
								this.setAcceleration(oldStat + numPoints);
								System.out.printf("Acceleration went from %d to %d\n", oldStat, this.getAcceleration());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 38 : 
								oldStat = this.getVertical();
								this.setVertical(oldStat + numPoints);
								System.out.printf("Vertical went from %d to %d\n", oldStat, this.getVertical());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 39 : 
								oldStat = this.getStrength();
								this.setStrength(oldStat + numPoints);
								System.out.printf("Strength went from %d to %d\n", oldStat, this.getStrength());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 40 : 
								oldStat = this.getStamina();
								this.setStamina(oldStat + numPoints);
								System.out.printf("Stamina went from %d to %d\n", oldStat, this.getStamina());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 41 : 
								oldStat = this.getHustle();
								this.setHustle(oldStat + numPoints);
								System.out.printf("Hustle went from %d to %d\n", oldStat, this.getHustle());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 42 : 
								oldStat = this.getHeadDurability();
								this.setHeadDurability(oldStat + numPoints);
								System.out.printf("Head Durability went from %d to %d\n", oldStat, this.getHeadDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 43 : 
								oldStat = this.getNeckDurability();
								this.setNeckDurability(oldStat + numPoints);
								System.out.printf("Neck Durability ent from %d to %d\n", oldStat, this.getNeckDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 44 : 
								oldStat = this.getBackDurability();
								this.setBackDurability(oldStat + numPoints);
								System.out.printf("Back Durability went from %d to %d\n", oldStat, this.getBackDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 45 : 
								oldStat = this.getLeftShoulderDurability();
								this.setLeftShoulderDurability(oldStat + numPoints);
								System.out.printf("Left Shoulder Durability went from %d to %d\n", oldStat, this.getLeftShoulderDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 46 : 
								oldStat = this.getRightShoulderDurability();
								this.setRightShoulderDurability(oldStat + numPoints);
								System.out.printf("Right Shoulder Durability went from %d to %d\n", oldStat, this.getRightShoulderDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 47 : 
								oldStat = this.getLeftElbowDurability();
								this.setLeftElbowDurability(oldStat + numPoints);
								System.out.printf("Left Elbow Durability went from %d to %d\n", oldStat, this.getLeftElbowDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 48 : 
								oldStat = this.getRightElbowDurability();
								this.setRightElbowDurability(oldStat + numPoints);
								System.out.printf("Right Elbow Durability went from %d to %d\n", oldStat, this.getRightElbowDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 49 : 
								oldStat = this.getLeftHipDurability();
								this.setLeftHipDurability(oldStat + numPoints);
								System.out.printf("Left Hip Durability went from %d to %d\n", oldStat, this.getLeftHipDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 50 : 
								oldStat = this.getRightHipDurability();
								this.setRightHipDurability(oldStat + numPoints);
								System.out.printf("Right Hip Durability went from %d to %d\n", oldStat, this.getRightHipDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 51 : 
								oldStat = this.getLeftKneeDurability();
								this.setLeftKneeDurability(oldStat + numPoints);
								System.out.printf("Left Knee Durability went from %d to %d\n", oldStat, this.getLeftKneeDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 52 : 
								oldStat = this.getRightKneeDurability();
								this.setRightKneeDurability(oldStat + numPoints);
								System.out.printf("Right Knee Durability went from %d to %d\n", oldStat, this.getRightKneeDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 53 : 
								oldStat = this.getLeftAnkleDurability();
								this.setLeftAnkleDurability(oldStat + numPoints);
								System.out.printf("Left Ankle Durability went from %d to %d\n", oldStat, this.getLeftAnkleDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 54 : 
								oldStat = this.getRightAnkleDurability();
								this.setRightAnkleDurability(oldStat + numPoints);
								System.out.printf("Right Ankle Durability went from %d to %d\n", oldStat, this.getRightAnkleDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 55 : 
								oldStat = this.getLeftFootDurability();
								this.setLeftFootDurability(oldStat + numPoints);
								System.out.printf("Left Foot Durability went from %d to %d\n", oldStat, this.getLeftFootDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 56 : 
								oldStat = this.getRightFootDurability();
								this.setRightFootDurability(oldStat + numPoints);
								System.out.printf("Right Foot Durability went from %d to %d\n", oldStat, this.getRightFootDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 57 : 
								oldStat = this.getMiscellaneousDurability();
								this.setMiscellaneousDurability(oldStat + numPoints);
								System.out.printf("Miscellaneous Durability went from %d to %d\n", oldStat, this.getMiscellaneousDurability());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 58 : 
								oldStat = this.getPassPerception();
								this.setPassPerception(oldStat + numPoints);
								System.out.printf("Pass Perception went from %d to %d\n", oldStat, this.getPassPerception());
								this.setXp(this.getXp() - numPoints * 5);
								break;
							
							case 59 : 
								oldStat = this.getDefensiveConsistency();
								this.setDefensiveConsistency(oldStat + numPoints);
								System.out.printf("Defensive Consistency went from %d to %d\n", oldStat, this.getDefensiveConsistency());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 60 : 
								oldStat = this.getPickAndRollDefenseIQ();
								this.setPickAndRollDefenseIQ(oldStat + numPoints);
								System.out.printf("Pick And Roll Defense IQ went from %d to %d\n", oldStat, this.getPickAndRollDefenseIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 61 : 
								oldStat = this.getHelpDefensiveIQ();
								this.setHelpDefensiveIQ(oldStat + numPoints);
								System.out.printf("Help Defensive IQ went from %d to %d\n", oldStat, this.getHelpDefensiveIQ());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 62 : 
								oldStat = this.getOffensiveConsistency();
								this.setOffensiveConsistency(oldStat + numPoints);
								System.out.printf("Offensive Consistency went from %d to %d\n", oldStat, this.getOffensiveConsistency());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 63 : 
								oldStat = this.getIntangibles();
								this.setIntangibles(oldStat + numPoints);
								System.out.printf("Intangibles went from %d to %d\n", oldStat, this.getIntangibles());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 64 : 
								oldStat = this.getPotential();
								this.setPotential(oldStat + numPoints);
								System.out.printf("Potential went from %d to %d\n", oldStat, this.getPotential());
								this.setXp(this.getXp() - numPoints * 5);
								break;
								
							case 120 : 
								oldStat = this.getDrivingLayup();
								this.setDrivingLayup(oldStat + numPoints);
								System.out.printf("Driving Layup went from %d to %d\n", oldStat, this.getDrivingLayup());
								this.setXp(this.getXp() - numPoints * 5);
								break;
						}
				}
				else
					System.out.println("\nThe attribute you entered does not exist.");
			}
		}
		else
			System.out.printf("At this point, %s does not have enough XP to uprgade any attributes\n", this.getName());
	}
	
	public void createPlayer()
	{
		int newStat = 0;
		boolean newVal = false;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the following player stats: ");
		
		System.out.println("Name");
		String newName = scan.nextLine();
		this.setName(newName);
	
		System.out.println("Position");
		String newPosition = scan.nextLine();
		this.setPosition(newPosition);
			 
		System.out.println("XP");
		double newXP = Double.parseDouble(scan.nextLine());
		this.setXp(newXP);
		 
		// Attributes 
		System.out.println("Standing Layup");
		newStat = Integer.parseInt(scan.nextLine());
		this.setStandingLayup(newStat);
		
		System.out.println("Driving Layup");
		newStat = Integer.parseInt(scan.nextLine());
		this.setDrivingLayup(newStat);
		
		System.out.println("Post Fadeaway");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPostFadeaway(newStat);
		 
		System.out.println("Post Hook");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPostHook(newStat);
		
		System.out.println("Post Control");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPostControl(newStat);
		
		System.out.println("Draw Foul");
		newStat = Integer.parseInt(scan.nextLine());
		this.setDrawFoul(newStat);
		 
		System.out.println("Shot Close");
		newStat = Integer.parseInt(scan.nextLine());
		this.setShotClose(newStat);
		
		System.out.println("Contested Shot Mid");
		newStat = Integer.parseInt(scan.nextLine());
		this.setContestedShotMid(newStat);
		 
		System.out.println("Open Shot Mid");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOpenShotMid(newStat);
		
		System.out.println("Off Dribble Shot Mid");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOffDribbleShotMid(newStat);
		 
		System.out.println("Contested Three");
		newStat = Integer.parseInt(scan.nextLine());
		this.setContestedThree(newStat);
		 
		System.out.println("Open Three");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOpenThree(newStat);
		
		System.out.println("Off Dribble Three");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOffDribbleThree(newStat);
		 
		System.out.println("Free Throw");
		newStat = Integer.parseInt(scan.nextLine());
		this.setFreeThrow(newStat);
		 
		System.out.println("Ball Control");
		newStat = Integer.parseInt(scan.nextLine());
		this.setBallControl(newStat);
		
		System.out.println("Passing Vision");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPassingVision(newStat);
		
		System.out.println("Passing IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPassingIQ(newStat);
		
		System.out.println("Passing Accuracy");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPassingAccuracy(newStat);
		
		System.out.println("Offensive Rebound");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOffensiveRebound(newStat);
		
		System.out.println("Standing Dunk");
		newStat = Integer.parseInt(scan.nextLine());
		this.setStandingDunk(newStat);
		
		System.out.println("Driving Dunk");
		newStat = Integer.parseInt(scan.nextLine());
		this.setDrivingDunk(newStat);
		
	
 		System.out.println("Contact Dunk");
		newStat = Integer.parseInt(scan.nextLine());
		this.setContactDunk(newStat);
		 
		System.out.println("Shot IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setShotIQ(newStat);
	
		System.out.println("Hands");
		newStat = Integer.parseInt(scan.nextLine());
		this.setHands(newStat);
		
		System.out.println("Defensive Rebound");
		newStat = Integer.parseInt(scan.nextLine());
		this.setDefensiveRebound(newStat);
		 
		System.out.println("Block");
		newStat = Integer.parseInt(scan.nextLine());
		this.setBlock(newStat);
		
		System.out.println("Shot Contest");
		newStat = Integer.parseInt(scan.nextLine());
		this.setShotContest(newStat);
		 
		System.out.println("Steal");
		newStat = Integer.parseInt(scan.nextLine());
		this.setSteal(newStat);
		 
		System.out.println("On Ball Defense IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOnBallDefenseIQ(newStat);
		
		System.out.println("Low Post Defense IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLowPostDefenseIQ(newStat);
		 
		System.out.println("Reaction Time");
		newStat = Integer.parseInt(scan.nextLine());
		this.setReactionTime(newStat);
		 
		System.out.println("Boxout");
		newStat = Integer.parseInt(scan.nextLine());
		this.setBoxout(newStat);
	 
		System.out.println("Lateral Quickness");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLateralQuickness(newStat);
		 
		System.out.println("Speed");
		newStat = Integer.parseInt(scan.nextLine());
		this.setSpeed(newStat);
		
		System.out.println("Speed With Ball");
		newStat = Integer.parseInt(scan.nextLine());
		this.setSpeedWithBall(newStat);
	 
		System.out.println("Acceleration");
		newStat = Integer.parseInt(scan.nextLine());
		this.setAcceleration(newStat);
		 
		System.out.println("Vertical");
		newStat = Integer.parseInt(scan.nextLine());
		this.setVertical(newStat);
		 
		System.out.println("Strength");
		newStat = Integer.parseInt(scan.nextLine());
		this.setStrength(newStat);
		 
		System.out.println("Stamina");
		newStat = Integer.parseInt(scan.nextLine());
		this.setStamina(newStat);
		 
		System.out.println("Hustle");
		newStat = Integer.parseInt(scan.nextLine());
		this.setHustle(newStat);
		
		System.out.println("Head Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setHeadDurability(newStat);
		
		System.out.println("Neck Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setNeckDurability(newStat);
		
		System.out.println("Back Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setBackDurability(newStat);
		 
		System.out.println("Left Shoulder Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftShoulderDurability(newStat);
		 
		System.out.println("Right Shoulder Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightShoulderDurability(newStat);
		
		System.out.println("Left Elbow Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftElbowDurability(newStat);
		
		System.out.println("Right Elbow Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightElbowDurability(newStat);
		
		System.out.println("Left Hip Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftHipDurability(newStat);
	 
		System.out.println("Right Hip Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightHipDurability(newStat);

		System.out.println("Left Knee Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftKneeDurability(newStat);
 
		System.out.println("Right Knee Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightKneeDurability(newStat);
	 
		System.out.println("Left Ankle Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftAnkleDurability(newStat);
	 
		System.out.println("Right Ankle Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightAnkleDurability(newStat);
	
		System.out.println("Left Foot Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setLeftFootDurability(newStat);

	
		System.out.println("Right Foot Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setRightFootDurability(newStat);
	
		System.out.println("Miscellaneous Durability");
		newStat = Integer.parseInt(scan.nextLine());
		this.setMiscellaneousDurability(newStat);
	
		System.out.println("Pass Perception");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPassPerception(newStat);
		
		System.out.println("Defensive Consistency");
		newStat = Integer.parseInt(scan.nextLine());
		this.setDefensiveConsistency(newStat);
		
		System.out.println("Pick And Roll Defense IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPickAndRollDefenseIQ(newStat);
	
		System.out.println("Help Defense IQ");
		newStat = Integer.parseInt(scan.nextLine());
		this.setHelpDefensiveIQ(newStat);

		System.out.println("Offensive Consistency");
		newStat = Integer.parseInt(scan.nextLine());
		this.setOffensiveConsistency(newStat);
	
		System.out.println("Intangibles");
		newStat = Integer.parseInt(scan.nextLine());
		this.setIntangibles(newStat);
	
		System.out.println("Potential");
		newStat = Integer.parseInt(scan.nextLine());
		this.setPotential(newStat);
		 
		// Badges
		System.out.println("For the following badges, enter true if you have them and false otherwise");
		
		System.out.println("Alpha Dog");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setAlphaDog(newVal);
		
		System.out.println("Clutch Performer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setClutchPerformer(newVal);
		
		System.out.println("Wildcard");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setWildcard(newVal);
		
		System.out.println("SparkPlug");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setSparkPlug(newVal);
		
		System.out.println("Enforcer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setEnforcer(newVal);
		
		System.out.println("Championship DNA");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setChampionshipDNA(newVal);
		
		System.out.println("Microwave");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setMicrowave(newVal);
		 
		System.out.println("Floor General");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setFloorGeneral(newVal);
		
		System.out.println("Defensive Anchor");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDefensiveAnchor(newVal);
		
		System.out.println("Hardened");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setHardened(newVal);
		
		System.out.println("Reserved");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setReserved(newVal);
		
		System.out.println("Friendly");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setFriendly(newVal);
		
		System.out.println("Team Player");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setTeamPlayer(newVal);
		 
		System.out.println("Extremely Confident");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setExtremelyConfident(newVal);
		 
		System.out.println("High Work Ethic");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setHighWorkEthic(newVal);
		 
		System.out.println("Legendary Work Ethic");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setLegendaryWorkEthic(newVal);
		
		System.out.println("Keep It Real");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setKeepItReal(newVal);
		
		System.out.println("Pat My Back");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPatMyBack(newVal);
		 
		System.out.println("Expressive");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setExpressive(newVal);
		
		System.out.println("Unpredictable");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setUnpredictable(newVal);
		
		System.out.println("Laid Back");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setLaidBack(newVal);
		
		System.out.println("Acrobat");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setAcrobat(newVal);
		 
		System.out.println("Tear Dropper");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setTearDropper(newVal);
		
		System.out.println("Putback King");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPutbackKing(newVal);
		 
		System.out.println("Pick And Roller");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPickAndRoller(newVal);
		 
		System.out.println("Relentless Finisher");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setRelentlessFinisher(newVal);
		
		System.out.println("Post Spin Technician");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPostSpinTechnician(newVal);
		
		System.out.println("Drop Stepper");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDropStepper(newVal);
		
		System.out.println("Up And Under Specialist");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setUpAndUnderSpecialist(newVal);
		 
		System.out.println("Corner Specialist");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setCornerSpecialist(newVal);
		
		System.out.println("Mid Range Deadeye");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setMidRangeDeadeye(newVal);
		
		System.out.println("Deep Range Deadeye");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDeepRangeDeadeye(newVal);
		 
		System.out.println("Limitless Range");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setLimitlessRange(newVal);
		 
		System.out.println("Difficult Shots");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDifficultShots(newVal);
		 
		System.out.println("Pick And Popper");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPickAndPopper(newVal);
		 
		System.out.println("Tireless Scorer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setTirelessScorer(newVal);
		 
		System.out.println("Catch And Shoot");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setCatchAndShoot(newVal);
		 
		System.out.println("Ankle Breaker");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setAnkleBreaker(newVal);
		 
		System.out.println("Flashy Passer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setFlashyPasser(newVal);
		 
		System.out.println("Break Starter");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setBreakStarter(newVal);
		 
		System.out.println("Pick And Roll Maestro");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPickAndRollMaestro(newVal);
		
		System.out.println("Lob City Passer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setLobCityPasser(newVal);
		 
		System.out.println("Dimer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDimer(newVal);
		
		System.out.println("Defensive Stopper");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setDefensiveStopper(newVal);
		
		System.out.println("Charge Card");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setChargeCard(newVal);
		 
		System.out.println("Pick Dodger");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPickDodger(newVal);
		 
		System.out.println("Pick Pocket");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPickPocket(newVal);
		 
		System.out.println("Rim Protector");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setRimProtector(newVal);
		
		System.out.println("Chase Down Artist");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setChaseDownArtist(newVal);
		
		System.out.println("Lob City Finisher");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setLobCityFinisher(newVal);
		 
		System.out.println("Posterizer");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setPosterizer(newVal);
		 
		System.out.println("Bruiser");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setBruiser(newVal);
		
		System.out.println("Brick Wall");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setBrickWall(newVal);
		
		System.out.println("One Man Fast Break");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setOneManFastBreak(newVal);
		
		System.out.println("Hustle Rebounder");
		newVal = Boolean.parseBoolean(scan.nextLine());
		this.setHustleRebounder(newVal);
	}
	
	// Called by the main Interface function. Edits any stat the player has based on user input.
	public void editPlayer()
	{
		int newStat = 0;
		int numEdits = 0;
		boolean newVal = false;
		String editStat = "";
		Integer statChoice = null;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> statMap = createStatMap();
		
		System.out.println("How many player attributes do you want to edit?");
		numEdits = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < numEdits; i++)
		{
			System.out.println("Enter the stat you want to edit");
			editStat = scan.nextLine();
			
			statChoice = statMap.get(editStat);
			
			if (statChoice != null)
			{
				switch (statChoice)
				{
					case 0 :
						System.out.println("What do you want to change the name to?");
						String newName = scan.nextLine();
						this.setName(newName);
						System.out.println("Name has been changed");
						break;
					
					case 1 : 
						System.out.println("What do you want to change the position to?");
						String newPosition = scan.nextLine();
						this.setPosition(newPosition);
						System.out.println("Position has been changed");
						break;
							
					case 2 : 
						System.out.println("What do you want to change the XP to?");
						double newXP = Double.parseDouble(scan.nextLine());
						this.setXp(newXP);
						System.out.println("XP has been changed");
						break;
						
					case 3 : 
						System.out.println("What do you want to change Standing Layup to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setStandingLayup(newStat);
						System.out.println("Standing Layup has been changed");
						break;
						
					case 4 : 
						System.out.println("What do you want to change Post Fadeaway to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPostFadeaway(newStat);
						System.out.println("Post Fadeaway has been changed");
						break;
						
					case 5 : 
						System.out.println("What do you want to change Post Hook to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPostHook(newStat);
						System.out.println("Post Hook has been changed");
						break;
						
					case 6 : 
						System.out.println("What do you want to change Post Control to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPostControl(newStat);
						System.out.println("Post Control has been changed");
						break;
						
					case 7 : 
						System.out.println("What do you want to change Draw Foul to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setDrawFoul(newStat);
						System.out.println("Draw Foul has been changed");
						break;
						
					case 8 : 
						System.out.println("What do you want to change Shot Close to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setShotClose(newStat);
						System.out.println("Shot Close has been changed");
						break;
						
					case 9 : 
						System.out.println("What do you want to change Contested Shot Mid to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setContestedShotMid(newStat);
						System.out.println("Contested Shot Mid has been changed");
						break;
						
					case 10 : 
						System.out.println("What do you want to change Open Shot Mid to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOpenShotMid(newStat);
						System.out.println("Open Shot Mid has been changed");
						break;
						
					case 11 : 
						System.out.println("What do you want to change Off Dribble Shot Mid to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOffDribbleShotMid(newStat);
						System.out.println("Off Dribble Shot Mid has been changed");
						break;
						
					case 12 : 
						System.out.println("What do you want to change Contested Three to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setContestedThree(newStat);
						System.out.println("Contested Three has been changed");
						break;
						
					case 13 : 
						System.out.println("What do you want to change Open Three to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOpenThree(newStat);
						System.out.println("Open Three has been changed");
						break;
						
					case 14 : 
						System.out.println("What do you want to change Off Dribble Three to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOffDribbleThree(newStat);
						System.out.println("Off Dribble Three has been changed");
						break;
						
					case 15 : 
						System.out.println("What do you want to change Free Throw to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setFreeThrow(newStat);
						System.out.println("Free Throw has been changed");
						break;
						
					case 16 : 
						System.out.println("What do you want to change Ball Control to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setBallControl(newStat);
						System.out.println("Ball Control has been changed");
						break;
						
					case 17 : 
						System.out.println("What do you want to change Passing Vision to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPassingVision(newStat);
						System.out.println("Passing Vision has been changed");
						break;
						
					case 18 : 
						System.out.println("What do you want to change Passing IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPassingIQ(newStat);
						System.out.println("Passing IQ has been changed");
						break;
						
					case 19 : 
						System.out.println("What do you want to change Passing Accuracy to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPassingAccuracy(newStat);
						System.out.println("Passing Accuracy has been changed");
						break;
						
					case 20 : 
						System.out.println("What do you want to change Offensive Rebound to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOffensiveRebound(newStat);
						System.out.println("Offensive Rebound has been changed");
						break;
						
					case 21 : 
						System.out.println("What do you want to change Standing Dunk to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setStandingDunk(newStat);
						System.out.println("Standing Dunk has been changed");
						break;
						
					case 22 : 
						System.out.println("What do you want to change Driving Dunk to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setDrivingDunk(newStat);
						System.out.println("Driving Dunk has been changed");
						break;
						
					case 23 : 
						System.out.println("What do you want to change Contact Dunk to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setContactDunk(newStat);
						System.out.println("Contact Dunk has been changed");
						break;
						
					case 24 : 
						System.out.println("What do you want to change Shot IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setShotIQ(newStat);
						System.out.println("Shot IQ has been changed");
						break;
					
					case 25 : 
						System.out.println("What do you want to change Hands to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setHands(newStat);
						System.out.println("Hands has been changed");
						break;
						
					case 26 : 
						System.out.println("What do you want to change Defensive Rebound to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setDefensiveRebound(newStat);
						System.out.println("Defensive Rebound has been changed");
						break;
						
					case 27 : 
						System.out.println("What do you want to change Block to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setBlock(newStat);
						System.out.println("Block has been changed");
						break;
						
					case 28 : 
						System.out.println("What do you want to change Shot Contest to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setShotContest(newStat);
						System.out.println("Shot Contest has been changed");
						break;
						
					case 29 : 
						System.out.println("What do you want to change Steal to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setSteal(newStat);
						System.out.println("Steal has been changed");
						break;
						
					case 30 : 
						System.out.println("What do you want to change On Ball Defense IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOnBallDefenseIQ(newStat);
						System.out.println("On Ball Defense IQ has been changed");
						break;
						
					case 31 : 
						System.out.println("What do you want to change Low Post Defense IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLowPostDefenseIQ(newStat);
						System.out.println("Low Post Defense IQ has been changed");
						break;
						
					case 32 : 
						System.out.println("What do you want to change Reaction Time to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setReactionTime(newStat);
						System.out.println("Reaction Time has been changed");
						break;
						
					case 33 : 
						System.out.println("What do you want to change Boxout to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setBoxout(newStat);
						System.out.println("Boxout has been changed");
						break;
					
					case 34 : 
						System.out.println("What do you want to change Lateral Quickness to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLateralQuickness(newStat);
						System.out.println("Lateral Quickness has been changed");
						break;
						
					case 35 : 
						System.out.println("What do you want to change Speed to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setSpeed(newStat);
						System.out.println("Speed has been changed");
						break;
						
					case 36 : 
						System.out.println("What do you want to change Speed With Ball to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setSpeedWithBall(newStat);
						System.out.println("Speed With Ball has been changed");
						break;
					
					case 37 : 
						System.out.println("What do you want to change Acceleration to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setAcceleration(newStat);
						System.out.println("Acceleration has been changed");
						break;
						
					case 38 : 
						System.out.println("What do you want to change Vertical to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setVertical(newStat);
						System.out.println("Vertical has been changed");
						break;
						
					case 39 : 
						System.out.println("What do you want to change Strength to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setStrength(newStat);
						System.out.println("Strength has been changed");
						break;
						
					case 40 : 
						System.out.println("What do you want to change Stamina to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setStamina(newStat);
						System.out.println("Stamina has been changed");
						break;
						
					case 41 : 
						System.out.println("What do you want to change Hustle to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setHustle(newStat);
						System.out.println("Hustle has been changed");
						break;
						
					case 42 : 
						System.out.println("What do you want to change Head Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setHeadDurability(newStat);
						System.out.println("Head Durability has been changed");
						break;
						
					case 43 : 
						System.out.println("What do you want to change Neck Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setNeckDurability(newStat);
						System.out.println("Neck Durability has been changed");
						break;
						
					case 44 : 
						System.out.println("What do you want to change Back Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setBackDurability(newStat);
						System.out.println("Back Durability has been changed");
						break;
						
					case 45 : 
						System.out.println("What do you want to change Left Shoulder Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftShoulderDurability(newStat);
						System.out.println("Left Shoulder Durability has been changed");
						break;
						
					case 46 : 
						System.out.println("What do you want to change Right Shoulder Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightShoulderDurability(newStat);
						System.out.println("Right Shoulder Durability has been changed");
						break;
						
					case 47 : 
						System.out.println("What do you want to change Left Elbow Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftElbowDurability(newStat);
						System.out.println("Left Elbow Durability has been changed");
						break;
						
					case 48 : 
						System.out.println("What do you want to change Right Elbow Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightElbowDurability(newStat);
						System.out.println("Right Elbow Durability has been changed");
						break;
						
					case 49 : 
						System.out.println("What do you want to change Left Hip Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftHipDurability(newStat);
						System.out.println("Left Hip Durability has been changed");
						break;
						
					case 50 : 
						System.out.println("What do you want to change Right Hip Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightHipDurability(newStat);
						System.out.println("Right Hip Durability has been changed");
						break;
						
					case 51 : 
						System.out.println("What do you want to change Left Knee Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftKneeDurability(newStat);
						System.out.println("Left Knee Durability has been changed");
						break;
						
					case 52 : 
						System.out.println("What do you want to change Right Knee Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightKneeDurability(newStat);
						System.out.println("Right Knee Durability has been changed");
						break;
						
					case 53 : 
						System.out.println("What do you want to change Left Ankle Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftAnkleDurability(newStat);
						System.out.println("Left Ankle Durability has been changed");
						break;
						
					case 54 : 
						System.out.println("What do you want to change Right Ankle Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightAnkleDurability(newStat);
						System.out.println("Right Ankle Durability has been changed");
						break;
						
					case 55 : 
						System.out.println("What do you want to change Left Foot Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setLeftFootDurability(newStat);
						System.out.println("Left Foot Durability has been changed");
						break;
						
					case 56 : 
						System.out.println("What do you want to change Right Foot Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setRightFootDurability(newStat);
						System.out.println("Right Foot Durability has been changed");
						break;
						
					case 57 : 
						System.out.println("What do you want to change Miscellaneous Durability to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setMiscellaneousDurability(newStat);
						System.out.println("Miscellaneous Durability has been changed");
						break;
						
					case 58 : 
						System.out.println("What do you want to change Pass Perception to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPassPerception(newStat);
						System.out.println("Pass Perception has been changed");
						break;
					
					case 59 : 
						System.out.println("What do you want to change Defensive Consistency to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setDefensiveConsistency(newStat);
						System.out.println("Defensive Consistency has been changed");
						break;
						
					case 60 : 
						System.out.println("What do you want to change Pick And Roll Defense IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPickAndRollDefenseIQ(newStat);
						System.out.println("Pick And Roll Defense IQ has been changed");
						break;
						
					case 61 : 
						System.out.println("What do you want to change Help Defense IQ to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setHelpDefensiveIQ(newStat);
						System.out.println("Help Defense IQ has been changed");
						break;
						
					case 62 : 
						System.out.println("What do you want to change Offensive Consistency to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setOffensiveConsistency(newStat);
						System.out.println("Offensive Consistency has been changed");
						break;
						
					case 63 : 
						System.out.println("What do you want to change Intangibles to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setIntangibles(newStat);
						System.out.println("Intangibles has been changed");
						break;
						
					case 64 : 
						System.out.println("What do you want to change Potential to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setPotential(newStat);
						System.out.println("Potential has been changed");
						break;
						
					case 120 : 
						System.out.println("What do you want to change Driving Layup to?");
						newStat = Integer.parseInt(scan.nextLine());
						this.setDrivingLayup(newStat);
						System.out.println("Driving Layup has been changed");
						break;
						
					case 65 : 
						System.out.println("What do you want to change Alpha Dog to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setAlphaDog(newVal);
						System.out.println("Alpha Dog has been changed");
						break;
						
					case 66 : 
						System.out.println("What do you want to change Clutch Performer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setClutchPerformer(newVal);
						System.out.println("Clutch Performer has been changed");
						break;
						
					case 67 : 
						System.out.println("What do you want to change Wildcard to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setWildcard(newVal);
						System.out.println("Wildcard has been changed");
						break;
						
					case 68 : 
						System.out.println("What do you want to change SparkPlug to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setSparkPlug(newVal);
						System.out.println("SparkPlug has been changed");
						break;
						
					case 69 : 
						System.out.println("What do you want to change Enforcer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setEnforcer(newVal);
						System.out.println("Enforcer has been changed");
						break;
						
					case 70 : 
						System.out.println("What do you want to change Championship DNA to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setChampionshipDNA(newVal);
						System.out.println("Championship DNA has been changed");
						break;
						
					case 71 : 
						System.out.println("What do you want to change Microwave to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setMicrowave(newVal);
						System.out.println("Microwave has been changed");
						break;
						
					case 72 : 
						System.out.println("What do you want to change Floor General to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setFloorGeneral(newVal);
						System.out.println("Floor General has been changed");
						break;
						
					case 73 : 
						System.out.println("What do you want to change Defensive Anchor to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDefensiveAnchor(newVal);
						System.out.println("Defensive Anchor has been changed");
						break;
						
					case 74 : 
						System.out.println("What do you want to change Hardened to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setHardened(newVal);
						System.out.println("Hardened has been changed");
						break;
						
					case 75 : 
						System.out.println("What do you want to change Reserved to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setReserved(newVal);
						System.out.println("Reserved has been changed");
						break;
						
					case 76 : 
						System.out.println("What do you want to change Friendly to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setFriendly(newVal);
						System.out.println("Friendly has been changed");
						break;
						
					case 77 : 
						System.out.println("What do you want to change Team Player to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setTeamPlayer(newVal);
						System.out.println("Team Player has been changed");
						break;
						
					case 78 : 
						System.out.println("What do you want to change Extremely Confident to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setExtremelyConfident(newVal);
						System.out.println("Extremely Confident has been changed");
						break;
						
					case 79 : 
						System.out.println("What do you want to change High Work Ethic to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setHighWorkEthic(newVal);
						System.out.println("High Work Ethic has been changed");
						break;
					
					case 80 : 
						System.out.println("What do you want to change Legendary Work Ethic to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setLegendaryWorkEthic(newVal);
						System.out.println("Legendary Work Ethic has been changed");
						break;
						
					case 81 : 
						System.out.println("What do you want to change Keep It Real to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setKeepItReal(newVal);
						System.out.println("Keep It Real has been changed");
						break;
						
					case 82 : 
						System.out.println("What do you want to change Pat My Back to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPatMyBack(newVal);
						System.out.println("Pat My Back has been changed");
						break;
						
					case 83 : 
						System.out.println("What do you want to change Expressive to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setExpressive(newVal);
						System.out.println("Expressive has been changed");
						break;
						
					case 84 : 
						System.out.println("What do you want to change Unpredictable to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setUnpredictable(newVal);
						System.out.println("Unpredictable has been changed");
						break;
						
					case 85 : 
						System.out.println("What do you want to change Laid Back to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setLaidBack(newVal);
						System.out.println("Laid Back has been changed");
						break;
						
					case 86 : 
						System.out.println("What do you want to change Acrobat to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setAcrobat(newVal);
						System.out.println("Acrobat has been changed");
						break;
						
					case 87 : 
						System.out.println("What do you want to change Tear Dropper to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setTearDropper(newVal);
						System.out.println("Tear Dropper has been changed");
						break;
						
					case 88 : 
						System.out.println("What do you want to change Putback King to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPutbackKing(newVal);
						System.out.println("Putback King has been changed");
						break;
						
					case 89 : 
						System.out.println("What do you want to change Pick And Roller to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPickAndRoller(newVal);
						System.out.println("Pick And Roller has been changed");
						break;
						
					case 90 : 
						System.out.println("What do you want to change Relentless Finisher to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setRelentlessFinisher(newVal);
						System.out.println("Relentless Finisher has been changed");
						break;
						
					case 91 : 
						System.out.println("What do you want to change Post Spin Technician to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPostSpinTechnician(newVal);
						System.out.println("Post Spin Technician has been changed");
						break;
						
					case 92 : 
						System.out.println("What do you want to change Drop Stepper to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDropStepper(newVal);
						System.out.println("Drop Stepper has been changed");
						break;
						
					case 93 : 
						System.out.println("What do you want to change Up And Under Specialist to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setUpAndUnderSpecialist(newVal);
						System.out.println("Up And Under Specialist has been changed");
						break;
						
					case 94 : 
						System.out.println("What do you want to change Corner Specialist to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setCornerSpecialist(newVal);
						System.out.println("Corner Specialist has been changed");
						break;
						
					case 95 : 
						System.out.println("What do you want to change Mid Range Deadeye to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setMidRangeDeadeye(newVal);
						System.out.println("Mid Range Deadeye has been changed");
						break;
						
					case 96 : 
						System.out.println("What do you want to change Deep Range Deadeye to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDeepRangeDeadeye(newVal);
						System.out.println("Deep Range Deadeye has been changed");
						break;
						
					case 97 : 
						System.out.println("What do you want to change Limitless Range to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setLimitlessRange(newVal);
						System.out.println("Limitless Range has been changed");
						break;
						
					case 98 : 
						System.out.println("What do you want to change Difficult Shots to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDifficultShots(newVal);
						System.out.println("Difficult Shots has been changed");
						break;
						
					case 99 : 
						System.out.println("What do you want to change Pick And Popper to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPickAndPopper(newVal);
						System.out.println("Pick And Popper has been changed");
						break;
						
					case 100 : 
						System.out.println("What do you want to change Tireless Scorer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setTirelessScorer(newVal);
						System.out.println("Tireless Scorer has been changed");
						break;
						
					case 101 : 
						System.out.println("What do you want to change Catch And Shoot to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setCatchAndShoot(newVal);
						System.out.println("Catch And Shoot has been changed");
						break;
						
					case 102 : 
						System.out.println("What do you want to change Ankle Breaker to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setAnkleBreaker(newVal);
						System.out.println("Ankle Breaker has been changed");
						break;
						
					case 103 : 
						System.out.println("What do you want to change Flashy Passer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setFlashyPasser(newVal);
						System.out.println("Flashy Passer has been changed");
						break;
						
					case 104 : 
						System.out.println("What do you want to change Break Starter to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setBreakStarter(newVal);
						System.out.println("Break Starter has been changed");
						break;
						
					case 105 : 
						System.out.println("What do you want to change Pick And Roll Maestro to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPickAndRollMaestro(newVal);
						System.out.println("Pick And Roll Maestro has been changed");
						break;
						
					case 106 : 
						System.out.println("What do you want to change Lob City Passer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setLobCityPasser(newVal);
						System.out.println("Lob City Passer has been changed");
						break;
						
					case 107 : 
						System.out.println("What do you want to change Dimer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDimer(newVal);
						System.out.println("Dimer has been changed");
						break;
						
					case 108 : 
						System.out.println("What do you want to change Defensive Stopper to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setDefensiveStopper(newVal);
						System.out.println("Defensive Stopper has been changed");
						break;
						
					case 109 : 
						System.out.println("What do you want to change Charge Card to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setChargeCard(newVal);
						System.out.println("Charge Card has been changed");
						break;
						
					case 110 : 
						System.out.println("What do you want to change Pick Dodger to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPickDodger(newVal);
						System.out.println("Pick Dodger has been changed");
						break;
						
					case 111 : 
						System.out.println("What do you want to change Pick Pocket to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPickPocket(newVal);
						System.out.println("Pick Pocket has been changed");
						break;
						
					case 112 : 
						System.out.println("What do you want to change Rim Protector to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setRimProtector(newVal);
						System.out.println("Rim Protector has been changed");
						break;
						
					case 113 : 
						System.out.println("What do you want to change Chase Down Artist to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setChaseDownArtist(newVal);
						System.out.println("Chase Down Artist has been changed");
						break;
						
					case 114 : 
						System.out.println("What do you want to change Lob City Finisher to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setLobCityFinisher(newVal);
						System.out.println("Lob City Finisher has been changed");
						break;
						
					case 115 : 
						System.out.println("What do you want to change Posterizer to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setPosterizer(newVal);
						System.out.println("Posterizer has been changed");
						break;
						
					case 116 : 
						System.out.println("What do you want to change Bruiser to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setBruiser(newVal);
						System.out.println("Bruiser has been changed");
						break;
						
					case 117 : 
						System.out.println("What do you want to change Brick Wall to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setBrickWall(newVal);
						System.out.println("Brick Wall has been changed");
						break;
						
					case 118 : 
						System.out.println("What do you want to change One Man Fast Break to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setOneManFastBreak(newVal);
						System.out.println("One Man Fast Break has been changed");
						break;
						
					case 119 : 
						System.out.println("What do you want to change Hustle Rebounder to? True or false?");
						newVal = Boolean.parseBoolean(scan.nextLine());
						this.setHustleRebounder(newVal);
						System.out.println("Hustle Rebounder has been changed");
						break;
				}
			}
		}
	}
	
	// Called by various functions. Creates and returns a HashMap containing all possible stat names as Key strings and maps them to an int. 
	// Can be used to ask the user for input as a string, and translate it into an int to be used for data manipulation. 
	public Map<String, Integer> createStatMap()
	{
		Map<String, Integer> statMap = new HashMap<>();
		
		statMap.put("name", 0);
		statMap.put("Name", 0);
		
		statMap.put("Position", 1);
		statMap.put("position", 1);
		
		statMap.put("Xp", 2);
		statMap.put("XP", 2);
		statMap.put("xp", 2);
		
		statMap.put("Standing Layup", 3);
		statMap.put("standing layup", 3);
		statMap.put("Standing layup", 3);
		
		statMap.put("Post Fadeaway", 4);
		statMap.put("post fadeaway", 4);
		statMap.put("Post fadeaway", 4);
		
		statMap.put("Post Hook", 5);
		statMap.put("post hook", 5);
		statMap.put("Post hook", 5);
		
		statMap.put("Post Control", 6);
		statMap.put("post control", 6);
		statMap.put("Post control", 6);
		
		statMap.put("Draw Foul", 7);
		statMap.put("draw foul", 7);
		statMap.put("Draw foul", 7);

		statMap.put("Shot Close", 8);
		statMap.put("shot close", 8);
		statMap.put("Shot close", 8);
		
		statMap.put("Contested Shot Mid", 9);
		statMap.put("contested shot mid", 9);
		statMap.put("Contested shot mid", 9);
		
		statMap.put("Open Shot Mid", 10);
		statMap.put("open shot mid", 10);
		statMap.put("Open shot mid", 10);
		
		statMap.put("Off Dribble Shot Mid", 11);
		statMap.put("off dribble shot mid", 11);
		statMap.put("Off dribble shot mid", 11);
		
		statMap.put("Contested Three", 12);
		statMap.put("contested three", 12);
		statMap.put("Contested three", 12);
		
		statMap.put("Open Three", 13);
		statMap.put("open three", 13);
		statMap.put("Open three", 13);
		
		statMap.put("Off Dribble Three", 14);
		statMap.put("off dribble three", 14);
		statMap.put("Off dribble three", 14);
		
		statMap.put("Free Throw", 15);
		statMap.put("free throw", 15);
		statMap.put("Free throw", 15);
		
		statMap.put("Ball Control", 16);
		statMap.put("ball control", 16);
		statMap.put("Ball control", 16);
		
		statMap.put("Passing Vision", 17);
		statMap.put("passing vision", 17);
		statMap.put("Passing vision", 17);
		
		statMap.put("Passing IQ", 18);
		statMap.put("passing iq", 18);
		statMap.put("Passing iq", 18);
		statMap.put("passing IQ", 18);
		
		statMap.put("Passing Accuracy", 19);
		statMap.put("passing accuracy", 19);
		statMap.put("Passing accuracy", 19);
		
		statMap.put("Offensive Rebound", 20);
		statMap.put("offensive rebound", 20);
		statMap.put("Offensive rebound", 20);
		
		statMap.put("Standing Dunk", 21);
		statMap.put("standing dunk", 21);
		statMap.put("Standing dunk", 21);
		
		statMap.put("Driving Dunk", 22);
		statMap.put("driving dunk", 22);
		statMap.put("Driving dunk", 22);
		
		statMap.put("Contact Dunk", 23);
		statMap.put("contact dunk", 23);
		statMap.put("Contact dunk", 23);
		
		statMap.put("Shot IQ", 24);
		statMap.put("shot iq", 24);
		statMap.put("Shot iq", 24);
		statMap.put("shot IQ", 24);
		
		statMap.put("Hands", 25);
		statMap.put("hands", 25);
				
		statMap.put("Defensive Rebound", 26);
		statMap.put("defensive rebound", 26);
		statMap.put("Defensive rebound", 26);
		
		statMap.put("Block", 27);
		statMap.put("block", 27);
		
		statMap.put("Shot Contest", 28);
		statMap.put("shot contest", 28);
		statMap.put("Shot contest", 28);
		
		statMap.put("Steal", 29);
		statMap.put("steal", 29);
		
		statMap.put("On Ball Defense IQ", 30);
		statMap.put("on ball defense iq", 30);
		statMap.put("On ball defense iq", 30);
		statMap.put("on ball defense IQ", 30);
		statMap.put("On ball defense IQ", 30);
		
		statMap.put("Low Post Defense IQ", 31);
		statMap.put("low post defense iq", 31);
		statMap.put("Low post defense iq", 31);
		statMap.put("low post defense IQ", 31);
		statMap.put("Low post defense IQ", 31);
		
		statMap.put("Reaction Time", 32);
		statMap.put("reaction time", 32);
		statMap.put("Reaction time", 32);
		
		statMap.put("Boxout", 33);
		statMap.put("boxout", 33);
		
		statMap.put("Lateral Quickness", 34);
		statMap.put("lateral quickness", 34);
		statMap.put("Lateral Quickness", 34);
		
		statMap.put("Speed", 35);
		statMap.put("speed", 35);
		
		statMap.put("Speed With Ball", 36);
		statMap.put("speed with ball", 36);
		statMap.put("Speed with ball", 36);
		
		statMap.put("Acceleration", 37);
		statMap.put("acceleration", 37);
		
		statMap.put("Vertical", 38);
		statMap.put("vertical", 38);
		
		statMap.put("Strength", 39);
		statMap.put("strength", 39);
		
		statMap.put("Stamina", 40);
		statMap.put("stamina", 40);
		
		statMap.put("Hustle", 41);
		statMap.put("hustle", 41);

		statMap.put("Head Durability", 42);
		statMap.put("head durability", 42);
		statMap.put("Head durability", 42);
		
		statMap.put("Neck Durability", 43);
		statMap.put("neck durability", 43);
		statMap.put("Neck durability", 43);
		
		statMap.put("Back Durability", 44);
		statMap.put("back durability", 44);
		statMap.put("Back durability", 44);
		
		statMap.put("Left Shoulder Durability", 45);
		statMap.put("left shoulder durability", 45);
		statMap.put("Left shoulder durability", 45);
		
		statMap.put("Right Shoulder Durability", 46);
		statMap.put("right shoulder durability", 46);
		statMap.put("Right shoulder durability", 46);
		
		statMap.put("Left Elbow Durability", 47);
		statMap.put("left elbow durability", 47);
		statMap.put("Left elbow durability", 47);
		
		statMap.put("Right Elbow Durability", 48);
		statMap.put("right elbow durability", 48);
		statMap.put("Right elbow durability", 48);
		
		statMap.put("Left Hip Durability", 49);
		statMap.put("left hip durability", 49);
		statMap.put("Left hip durability", 49);
		
		statMap.put("Right Hip Durability", 50);
		statMap.put("right hip durability", 50);
		statMap.put("Right hip durability", 50);
		
		statMap.put("Left Knee Durability", 51);
		statMap.put("left knee durability", 51);
		statMap.put("Left knee durability", 51);
		
		statMap.put("Right Knee Durability", 52);
		statMap.put("right knee durability", 52);
		statMap.put("Right knee durability", 52);
		
		statMap.put("Left Ankle Durability", 53);
		statMap.put("left ankle durability", 53);
		statMap.put("Left ankle durability", 53);
		
		statMap.put("Right Ankle Durability", 54);
		statMap.put("right ankle durability", 54);
		statMap.put("Right ankle durability", 54);
		
		statMap.put("Left Foot Durability", 55);
		statMap.put("left foot durability", 55);
		statMap.put("Left foot durability", 55);
		
		statMap.put("Right Foot Durability", 56);
		statMap.put("right foot durability", 56);
		statMap.put("Right foot durability", 56);
		
		statMap.put("Miscellaneous Durability", 57);
		statMap.put("miscellaneous durability", 57);
		statMap.put("Miscellaneous durability", 57);
		
		statMap.put("Pass Perception", 58);
		statMap.put("pass perception", 58);
		statMap.put("Pass perception", 58);
		
		statMap.put("Defensive Consistency", 59);
		statMap.put("defensive consistency", 59);
		statMap.put("Defensive consistency", 59);
		
		statMap.put("Pick And Roll Defense IQ", 60);
		statMap.put("pick and roll defense iq", 60);
		statMap.put("Pick and Roll Defense IQ", 60);
		statMap.put("Pick and roll defense IQ", 60);
		
		statMap.put("Help Defensive IQ", 61);
		statMap.put("help defensive iq", 61);
		statMap.put("Help defensive IQ", 61);
		statMap.put("help defensive IQ", 61);
		
		statMap.put("Offensive Consistency", 62);
		statMap.put("offensive consistency", 62);
		statMap.put("Offensive consistency", 62);
		
		statMap.put("Intangibles", 63);
		statMap.put("intangibles", 63);
		
		statMap.put("Potential", 64);
		statMap.put("potential", 64);
		
		statMap.put("Alpha Dog", 65);
		statMap.put("alpha dog", 65);
		statMap.put("Alpha dog", 65);
		
		statMap.put("Clutch Performer", 66);
		statMap.put("clutch performer", 66);
		statMap.put("Clutch performer", 66);
		
		statMap.put("Wildcard", 67);
		statMap.put("wildcard", 67);
		
		statMap.put("Sparkplug", 68);
		statMap.put("sparkplug", 68);
		
		statMap.put("Enforcer", 69);
		statMap.put("enforcer", 69);

		statMap.put("Championship DNA", 70);
		statMap.put("championship dna", 70);
		statMap.put("Championship dna", 70);
		statMap.put("championship DNA", 70);
		
		statMap.put("Microwave", 71);
		statMap.put("microwave", 71);
		
		statMap.put("Floor General", 72);
		statMap.put("floor general", 72);
		statMap.put("Floor general", 72);
		
		statMap.put("Defensive Anchor", 73);
		statMap.put("defensive anchor", 73);
		statMap.put("Defensive anchor", 73);
		
		statMap.put("Hardened", 74);
		statMap.put("hardened", 74);
		
		statMap.put("Reserved", 75);
		statMap.put("reserved", 75);
		
		statMap.put("Friendly", 76);
		statMap.put("friendly", 76);
		
		statMap.put("Team Player", 77);
		statMap.put("team player", 77);
		statMap.put("Team player", 77);
		
		statMap.put("Exteremely Confident", 78);
		statMap.put("extremely confident", 78);
		statMap.put("Extremely confident", 78);
		
		statMap.put("High Work Ethic", 79);
		statMap.put("high work ethic", 79);
		statMap.put("High work ethic", 79);
		
		statMap.put("Legendary Work Ethic", 80);
		statMap.put("legendary work ethic", 80);
		statMap.put("Legendary work ethic", 80);
		
		statMap.put("Keep It Real", 81);
		statMap.put("keep it real", 81);
		statMap.put("Keep it real", 81);
		
		statMap.put("Pat My Back", 82);
		statMap.put("pat my back", 82);
		statMap.put("Pat my back", 82);
		
		statMap.put("Expressive", 83);
		statMap.put("expressive", 83);
		
		statMap.put("Unpredictable", 84);
		statMap.put("unpredictable", 84);
		
		statMap.put("Laid Back", 85);
		statMap.put("laid back", 85);
		statMap.put("Laid back", 85);

		statMap.put("Acrobat", 86);
		statMap.put("acrobat", 86);
		
		statMap.put("Tear Dropper", 87);
		statMap.put("tear dropper", 87);
		statMap.put("Tear dropper", 87);
		
		statMap.put("Putback King", 88);
		statMap.put("putback king", 88);
		statMap.put("Putback king", 88);
		
		statMap.put("Pick And Roller", 89);
		statMap.put("Pick and Roller", 89);
		statMap.put("pick and roller", 89);
		statMap.put("Pick and roller", 89);
		
		statMap.put("Relentless Finisher", 90);
		statMap.put("relentless finisher", 90);
		statMap.put("Relentless finisher", 90);
		
		statMap.put("Post Spin Technician", 91);
		statMap.put("post spin technician", 91);
		statMap.put("Post spin technician", 91);
		
		statMap.put("Drop Stepper", 92);
		statMap.put("drop stepper", 92);
		statMap.put("Drop stepper", 92);
		
		statMap.put("Up And Under Specialist", 93);
		statMap.put("Up and Under Specialist", 93);
		statMap.put("up and under specialist", 93);
		statMap.put("Up and under specialist", 93);
		
		statMap.put("Corner Specialist", 94);
		statMap.put("corner specialist", 94);
		statMap.put("Corner specialist", 94);
		
		statMap.put("Mid Range Deadeye", 95);
		statMap.put("mid range deadeye", 95);
		statMap.put("Mid range deadeye", 95);
		
		statMap.put("Deep Range Deadeye", 96);
		statMap.put("deep range deadeye", 96);
		statMap.put("Deep range deadeye", 96);
		
		statMap.put("Limitless Range", 97);
		statMap.put("limitless range", 97);
		statMap.put("Limitless range", 97);
		
		statMap.put("Difficult Shots", 98);
		statMap.put("difficult shots", 98);
		statMap.put("Difficult shots", 98);
		
		statMap.put("Pick And Popper", 99);
		statMap.put("pick and popper", 99);
		statMap.put("Pick and popper", 99);
		statMap.put("Pick and Popper", 99);
		
		statMap.put("Tireless Scorer", 100);
		statMap.put("tireless scorer", 100);
		statMap.put("Tireless scorer", 100);
		
		statMap.put("Catch And Shoot", 101);
		statMap.put("Catch and Shoot", 101);
		statMap.put("catch and shoot", 101);
		statMap.put("Catch and shoot", 101);
		
		statMap.put("Ankle Breaker", 102);
		statMap.put("ankle breaker", 102);
		statMap.put("Ankle breaker", 102);
		
		statMap.put("Flashy Passer", 103);
		statMap.put("flashy passer", 103);
		statMap.put("Flashy passer", 103);
		
		statMap.put("Break Starter", 104);
		statMap.put("break starter", 104);
		statMap.put("Break starter", 104);
		
		statMap.put("Pick And Roll Maestro", 105);
		statMap.put("Pick and Roll Maestro", 105);
		statMap.put("pick and roll maestro", 105);
		statMap.put("Pick and roll maestro", 105);
		
		statMap.put("Lob City Passer", 106);
		statMap.put("Lob-City Passer", 106);
		statMap.put("lob city passer", 106);
		statMap.put("lob-city passer", 106);
		statMap.put("Lob-city passer", 106);
		statMap.put("Lob city passer", 106);
		
		statMap.put("Dimer", 107);
		statMap.put("dimer", 107);
		
		statMap.put("Defensive Stopper", 108);
		statMap.put("defensive stopper", 108);
		statMap.put("Defensive stopper", 108);
		
		statMap.put("Charge Card", 109);
		statMap.put("charge card", 109);
		statMap.put("Charge card", 109);
		
		statMap.put("Pick Dodger", 110);
		statMap.put("pick dodger", 110);
		statMap.put("Pick dodger", 110);
		
		statMap.put("Pick Pocket", 111);
		statMap.put("pick pocket", 111);
		statMap.put("Pick pocket", 111);
		
		statMap.put("Rim Protector", 112);
		statMap.put("rim protector", 112);
		statMap.put("Rim protector", 112);
		
		statMap.put("Chase Down Artist", 113);
		statMap.put("chase down artist", 113);
		statMap.put("Chase down artist", 113);
		
		statMap.put("Lob City Finisher", 114);
		statMap.put("Lob-City Finisher", 114);
		statMap.put("lob city finisher", 114);
		statMap.put("lob-city finisher", 114);
		statMap.put("Lob city finisher", 114);
		statMap.put("Lob-city finisher", 114);
		
		statMap.put("Posterizer", 115);
		statMap.put("posterizer", 115);
		
		statMap.put("Bruiser", 116);
		statMap.put("bruiser", 116);
		
		statMap.put("Brick Wall", 117);
		statMap.put("brick wall", 117);
		statMap.put("Brick wall", 117);
		
		statMap.put("One Man Fast Break", 118);
		statMap.put("one man fast break", 118);
		statMap.put("One man fast break", 118);
		
		statMap.put("Hustle Rebounder", 119);
		statMap.put("hustle rebounder", 119);
		statMap.put("Hustle rebounder", 119);
		
		statMap.put("Driving Layup", 120);
		statMap.put("driving layup", 120);
		statMap.put("Driving layup", 120);
		
		return statMap;
	}
	
	// Called by the main Interface function. Displays various player stats as desired by the user.
	// Called by the main Interface function. Displays player stats by categories based on user input.
	public void viewStats()
	{
		int choice = 0;
		
		boolean xpStat = false;
		boolean offensiveAttributes = false;
		boolean defensiveAttributes = false;
		boolean athleticAttributes = false;
		boolean durabilityAttributes = false;
		boolean mentalAttributes = false;
		boolean miscAttributes = false;
		boolean personalityBadges = false;
		boolean insideScoringBadges = false;
		boolean outsideScoringBadges = false;
		boolean playmakingBadges = false;
		boolean defensiveBadges = false;
		boolean athleticBadges = false;
		boolean reboundingBadges = false;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to view all stats or a specific set?\nEnter 0 for all stats and 1 for a specific set of stats");
		
		choice = Integer.parseInt(scan.nextLine());
		
		if (choice == 0)
		{
			xpStat = true;
			offensiveAttributes = true;
			defensiveAttributes = true;
			athleticAttributes = true;
			durabilityAttributes = true;
			mentalAttributes = true;
			miscAttributes = true;
			personalityBadges = true;
			insideScoringBadges = true;
			outsideScoringBadges = true;
			playmakingBadges = true;
			defensiveBadges = true;
			athleticBadges = true;
			reboundingBadges = true;
		}
		else
		{
			while (true)
			{
				System.out.println("Would you like to view xp, attributes, badges, or a combination of them?");
				System.out.println("Enter 0 for XP, 1 for attributes, 2 for badges, or 3 for a combination");
			
				choice = Integer.parseInt(scan.nextLine());
				
				if (choice >= 0 || choice <= 3)
					break;
			}
			
			if (choice == 0)
			{
				System.out.println("Would you like to view the current XP? (1 for yes, 0 for no)");
			
			choice = Integer.parseInt(scan.nextLine());
			if (choice == 1)
				xpStat = true;
			}
			else if (choice == 1)
			{
				System.out.println("For the following questions, enter 1 if you would like to view these attributes and 0 if not");
				System.out.println("Offensive Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					offensiveAttributes = true;
				
				System.out.println("Defensive Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					defensiveAttributes = true;
				
				System.out.println("Athleticism Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					athleticAttributes = true;
				
				System.out.println("Durability Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					durabilityAttributes = true;
				
				System.out.println("Mental Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					mentalAttributes = true;
				
				System.out.println("Miscellaneous Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					miscAttributes = true;
				
			}
			else if (choice == 2)
			{
				System.out.println("For the following questions, enter 1 if you would like to view these badges and 0 if not");
				System.out.println("Personality Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					personalityBadges = true;
				
				System.out.println("Inside Scoring Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					insideScoringBadges = true;
				
				System.out.println("Outside Scoring Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					outsideScoringBadges = true;
				
				System.out.println("Playmaking Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					playmakingBadges = true;
				
				System.out.println("Defensive Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					defensiveBadges = true;
				
				System.out.println("Athleticism Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					athleticBadges = true;
				
				System.out.println("Rebounding Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					reboundingBadges = true;
			}
			else
			{
				System.out.println("For the following questions, enter 1 if you would like to view these stats and 0 if not");
				System.out.println("Player XP (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					xpStat = true;
				
				System.out.println("Offensive Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					offensiveAttributes = true;
				
				System.out.println("Defensive Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					defensiveAttributes = true;
				
				System.out.println("Athleticism Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					athleticAttributes = true;
				
				System.out.println("Durability Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					durabilityAttributes = true;
				
				System.out.println("Mental Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					mentalAttributes = true;
				
				System.out.println("Miscellaneous Attributes (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					miscAttributes = true;
				
				System.out.println("Personality Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					personalityBadges = true;
				
				System.out.println("Inside Scoring Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					insideScoringBadges = true;
				
				System.out.println("Outside Scoring Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					outsideScoringBadges = true;
				
				System.out.println("Playmaking Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					playmakingBadges = true;
				
				System.out.println("Defensive Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					defensiveBadges = true;
				
				System.out.println("Athleticism Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					athleticBadges = true;
				
				System.out.println("Rebounding Badges (1 for yes, 0 for no)");
				
				choice = Integer.parseInt(scan.nextLine());
				if (choice == 1)
					reboundingBadges = true;
			}
			
		}
		
		if (xpStat)
			System.out.printf("%s's current XP is %.2f\n", this.getName(), this.getXp());
		
		if (offensiveAttributes)
		{
			if (xpStat)
				System.out.println();
			
			System.out.printf("%s's Offensive Attributes are as follows:\n", this.getName());
			System.out.printf("Standing Layup: %d\n", this.getStandingLayup());
			System.out.printf("Driving Layup: %d\n", this.getDrivingLayup());
			System.out.printf("Post Fadeaway: %d\n", this.getPostFadeaway());
			System.out.printf("Post Hook: %d\n", this.getPostHook());
			System.out.printf("Post Control: %d\n", this.getPostControl());
			System.out.printf("Draw Fowl: %d\n", this.getDrawFoul());
			System.out.printf("Driving Layup: %d\n", this.getDrivingLayup());
			System.out.printf("Shot Close: %d\n", this.getShotClose());
			System.out.printf("Contested Shot Mid: %d\n", this.getContestedShotMid());
			System.out.printf("Open Shot Mid: %d\n", this.getOpenShotMid());
			System.out.printf("Off-Dribble Shot Mid: %d\n", this.getOffDribbleShotMid());
			System.out.printf("Contested Three: %d\n", this.getContestedThree());
			System.out.printf("Open Three: %d\n", this.getOpenThree());
			System.out.printf("Off-Dribble Three: %d\n", this.getOffDribbleThree());
			System.out.printf("Free Throw: %d\n", this.getFreeThrow());
			System.out.printf("Ball Control: %d\n", this.getBallControl());
			System.out.printf("Passing Vision: %d\n", this.getPassingVision());
			System.out.printf("Passing IQ: %d\n", this.getPassingIQ());
			System.out.printf("Passing Accuracy: %d\n", this.getPassingAccuracy());
			System.out.printf("Offensive Rebound: %d\n", this.getOffensiveRebound());
			System.out.printf("Standing Dunk: %d\n", this.getStandingDunk());
			System.out.printf("Driving Dunk: %d\n", this.getDrivingDunk());
			System.out.printf("Contact Dunk: %d\n", this.getContactDunk());
			System.out.printf("Shot IQ: %d\n", this.getShotIQ());
			System.out.printf("Hands: %d\n", this.getHands());
		}
		if (defensiveAttributes)
		{	
			if (xpStat || offensiveAttributes)
				System.out.println();
			
			System.out.printf("%s's Defensive Attributes are as follows:\n", this.getName());
			System.out.printf("Defensive Rebound%d\n", this.getDefensiveRebound());
			System.out.printf("Block: %d\n", this.getBlock());
			System.out.printf("Shot Contest: %d\n", this.getShotContest());
			System.out.printf("Steal: %d\n", this.getSteal());
			System.out.printf("On-Ball Defense IQ: %d\n", this.getOnBallDefenseIQ());
			System.out.printf("Low Post Defense IQ: %d\n", this.getLowPostDefenseIQ());
			System.out.printf("Reaction Time: %d\n", this.getReactionTime());
		}
		if (athleticAttributes)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes)
				System.out.println();
			
			System.out.printf("%s's Athleticism Attributes are as follows:\n", this.getName());
			System.out.printf("Boxout: %d\n", this.getBoxout());
			System.out.printf("Lateral Quickness: %d\n", this.getLateralQuickness());
			System.out.printf("Speed: %d\n", this.getSpeed());
			System.out.printf("Speed With Ball: %d\n", this.getSpeedWithBall());
			System.out.printf("Acceleration: %d\n", this.getAcceleration());
			System.out.printf("Vertical: %d\n", this.getVertical());
			System.out.printf("Strength: %d\n", this.getStrength());
			System.out.printf("Stamina: %d\n", this.getStamina());
			System.out.printf("Hustle: %d\n", this.getHustle());
		}
		if (durabilityAttributes)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes || athleticAttributes)
				System.out.println();
			
			System.out.printf("%s's Durability Attributes are as follows:\n", this.getName());
			System.out.printf("Head Durability: %d\n", this.getHeadDurability());
			System.out.printf("Neck Durability: %d\n", this.getNeckDurability());
			System.out.printf("Back Durability: %d\n", this.getBackDurability());
			System.out.printf("Left Shoulder Durability: %d\n", this.getLeftShoulderDurability());
			System.out.printf("Right Shoulder Durability: %d\n", this.getRightShoulderDurability());
			System.out.printf("Left Elbow Durability: %d\n", this.getLeftElbowDurability());
			System.out.printf("Right Elbow Durability: %d\n", this.getRightElbowDurability());
			System.out.printf("Left Hip Durability: %d\n", this.getLeftHipDurability());
			System.out.printf("Right Hip Durability: %d\n", this.getRightHipDurability());
			System.out.printf("Left Knee Durability: %d\n", this.getLeftKneeDurability());
			System.out.printf("Right Knee Durability: %d\n", this.getRightKneeDurability());
			System.out.printf("Left Ankle Durability: %d\n", this.getLeftAnkleDurability());
			System.out.printf("Right Ankle Durability: %d\n", this.getRightAnkleDurability());
			System.out.printf("Left Foot Durability: %d\n", this.getLeftFootDurability());
			System.out.printf("Right Foot Durability: %d\n", this.getRightFootDurability());
			System.out.printf("Miscellaneous Durability: %d\n", this.getMiscellaneousDurability());
		}
		if (mentalAttributes)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes || athleticAttributes || durabilityAttributes)
				System.out.println();
			
			System.out.printf("%s's Mental Attributes are as follows:\n", this.getName());
			System.out.printf("Pass Perception: %d\n", this.getPassPerception());
			System.out.printf("Defensive Consistency: %d\n", this.getDefensiveConsistency());
			System.out.printf("Pick And Roll Defense IQ Durability: %d\n", this.getPickAndRollDefenseIQ());
			System.out.printf("Help Defense IQ: %d\n", this.getHelpDefensiveIQ());
			System.out.printf("Offensive Consistency: %d\n\n", this.getOffensiveConsistency());
		}
		if (miscAttributes)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes || athleticAttributes || durabilityAttributes || mentalAttributes)
				System.out.println();
			
			System.out.printf("%s's Miscellaneous Attributes are as follows:\n", this.getName());
			System.out.printf("Intangibles: %d\n", this.getIntangibles());
			System.out.printf("Potential: %d\n", this.getPotential());
		}
		if (personalityBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes || athleticAttributes || durabilityAttributes || mentalAttributes || miscAttributes)
				System.out.println();
			
			System.out.printf("%s's Personality Badges are as follows:\n", this.getName());
			if (this.getAlphaDog())
				System.out.println("Alpha Dog");
			if (this.getClutchPerformer())
				System.out.println("Clutch Performer");
			if (this.getWildcard())
				System.out.println("Wildcard");
			if (this.getSparkPlug())
				System.out.println("Spark Plug");
			if (this.getEnforcer())
				System.out.println("Enforcer");
			if (this.getChampionshipDNA())
				System.out.println("Championship DNA");
			if (this.getMicrowave())
				System.out.println("Microwave");
			if (this.getFloorGeneral())
				System.out.println("Floor General");
			if (this.getDefensiveAnchor())
				System.out.println("Defensive Anchor");
			if (this.getHardened())
				System.out.println("Hardened");
			if (this.getReserved())
				System.out.println("Reserved");
			if (this.getFriendly())
				System.out.println("Friendly");
			if (this.getTeamPlayer())
				System.out.println("Team Player");
			if (this.getExtremelyConfident())
				System.out.println("Extremely Confident");
			if (this.getHighWorkEthic())
				System.out.println("High Work Ethic");
			if (this.getLegendaryWorkEthic())
				System.out.println("Legendary Work Ethic");
			if (this.getKeepItReal())
				System.out.println("Keep It Real");
			if (this.getPatMyBack())
				System.out.println("Pat My Back");
			if (this.getExpressive())
				System.out.println("Expressive");
			if (this.getUnpredictable())
				System.out.println("Unpredictable");
			if (this.getLaidBack())
				System.out.println("Laid Back");
		}
		if (insideScoringBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes || athleticAttributes || durabilityAttributes || mentalAttributes || miscAttributes || personalityBadges)
				System.out.println();
			
			System.out.printf("%s's Inside Scoring Badges are as follows:\n", this.getName());
			if (this.getAcrobat())
				System.out.println("Acrobat");
			if (this.getTearDropper())
				System.out.println("Tear Dropper");
			if (this.getPutbackKing())
				System.out.println("Putback King");
			if (this.getPickAndRoller())
				System.out.println("Pick And Roller");
			if (this.getRelentlessFinisher())
				System.out.println("Relentless Finisher");
			if (this.getPostSpinTechnician())
				System.out.println("Post Spin Technician");
			if (this.getDropStepper())
				System.out.println("Drop Stepper");
			if (this.getUpAndUnderSpecialist())
				System.out.println("Up And Under Specialist");
		}
		if (outsideScoringBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes 
				|| athleticAttributes || durabilityAttributes || mentalAttributes 
				|| miscAttributes || personalityBadges || insideScoringBadges)
				System.out.println();
			
			System.out.printf("%s's Outside Scoring Badges are as follows:\n", this.getName());
			if (this.getCornerSpecialist())
				System.out.println("Corner Specialist");
			if (this.getMidRangeDeadeye())
				System.out.println("Mid-Range Deadeye");
			if (this.getDeepRangeDeadeye())
				System.out.println("Deep-Range Deadeye");
			if (this.getLimitlessRange())
				System.out.println("Limitless Range");
			if (this.getDifficultShots())
				System.out.println("Difficult Shots");
			if (this.getPickAndPopper())
				System.out.println("Pick And Popper");
			if (this.getTirelessScorer())
				System.out.println("Tireless Scorer");
			if (this.getCatchAndShoot())
				System.out.println("Catch And Shoot");
		}
		if (playmakingBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes 
				|| athleticAttributes || durabilityAttributes || mentalAttributes 
				|| miscAttributes || personalityBadges || insideScoringBadges 
				|| outsideScoringBadges)
				System.out.println();
	
			System.out.printf("%s's Playmaking Badges are as follows:\n", this.getName());
			if (this.getAnkleBreaker())
				System.out.println("Ankle Breaker");
			if (this.getFlashyPasser())
				System.out.println("Flashy Passer");
			if (this.getBreakStarter())
				System.out.println("Break Starter");
			if (this.getPickAndRollMaestro())
				System.out.println("Pick And Roll Maestro");
			if (this.getLobCityPasser())
				System.out.println("Lob-City Passer");
			if (this.getDimer())
				System.out.println("Dimer");
		}
		if (defensiveBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes 
				|| athleticAttributes || durabilityAttributes || mentalAttributes 
				|| miscAttributes || personalityBadges || insideScoringBadges 
				|| outsideScoringBadges || playmakingBadges)
				System.out.println();
	
			System.out.printf("%s's Defensive Badges are as follows:\n", this.getName());
			if (this.getDefensiveStopper())
				System.out.println("Defensive Stopper");
			if (this.getChargeCard())
				System.out.println("Charge Card");
			if (this.getPickDodger())
				System.out.println("Pick Dodger");
			if (this.getPickPocket())
				System.out.println("Pick-Pocket");
			if (this.getRimProtector())
				System.out.println("Rim Protector");
			if (this.getChaseDownArtist())
				System.out.println("Chase-Down Artist");
		}
		if (athleticBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes 
				|| athleticAttributes || durabilityAttributes || mentalAttributes 
				|| miscAttributes || personalityBadges || insideScoringBadges 
				|| outsideScoringBadges || playmakingBadges || defensiveBadges)
				System.out.println();

			System.out.printf("%s's Athleticism Badges are as follows:\n", this.getName());
			if (this.getLobCityFinisher())
				System.out.println("Lob-City Finisher");
			if (this.getPosterizer())
				System.out.println("Posterizer");
			if (this.getBruiser())
				System.out.println("Bruiser");
			if (this.getBrickWall())
				System.out.println("Brick Wall");
			if (this.getOneManFastBreak())
				System.out.println("One Man Fast Break");
		}
		if (reboundingBadges)
		{
			if (xpStat || offensiveAttributes || defensiveAttributes 
				|| athleticAttributes || durabilityAttributes || mentalAttributes 
				|| miscAttributes || personalityBadges || insideScoringBadges 
				|| outsideScoringBadges || playmakingBadges || defensiveBadges 
				|| athleticBadges)
				System.out.println();

			System.out.printf("%s's Rebounding Badges are as follows:\n", this.getName());
			if (this.getHustleRebounder())
				System.out.println("Hustle Rebounder");
		}
	}
	

	
	// Used by playGame(). Takes the instance object game. Prints out the box score and asks the user to confirm whether it's accurate or not. Returns true or false.
	public Boolean confirmGame(Game game) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String answer;
		
		System.out.println("This was your box score: \n");
		
		System.out.printf("(1) You %s the game\n", game.getWon() ? "won" : "lost");
		System.out.printf("(2) You played %d minutes\n", game.getMinutes());
		System.out.printf("(3) You scored %d points\n", game.getPoints());
		System.out.printf("(4) You grabbed %d rebounds\n", game.getRebounds());
		System.out.printf("(5) You had %d assists\n", game.getAssists());
		System.out.printf("(6) You had %d steals\n", game.getSteals());
		System.out.printf("(7) You had %d blocks\n", game.getBlocks());
		System.out.printf("(8) You had %d turnovers\n", game.getTurnovers());
		System.out.printf("(9) You made %d shots\n", game.getFgMade());
		System.out.printf("(10) You attempted %d shots, for a FG percentage of %.0f%%\n", game.getFgAttempted(), game.getFgPercentage() == -1 ? 100 : 100 * game.getFgPercentage());
		System.out.printf("(11) You made %d threes\n", game.getThreesMade());
		System.out.printf("(12) You attempted %d threes, for a 3-point percentage of %.0f%%\n", game.getThreesAttempted(), game.getThreePercentage() == -1 ? 100 : 100 * game.getThreePercentage());
		
		System.out.println("Is this correct? (Y/N)");
		
		
		while (true) {
			
			answer = scan.nextLine();
			if (answer.equals("Y") || answer.equals("y")) {
				return true;
			}
			
			else if (answer.equals("N") || answer.equals("n")) {
				return false;
			}
			
			else {
				System.out.println("Please enter 'Y' or 'N'");
				continue;
			}
		}
	}
	
	// Used by playGame(). If confirmGame() returns false, this function is called, taking the instance object game and modifying the game stats to be accurate. 
	
	public void editGame(Game game) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String answer;
		int answerN;
		
		System.out.println("Enter the number of the line of the stat you want to change");
		
		
		while (true) {
		
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 1 || answerN > 12) {
				System.out.println("Please enter a number greater between 1 and 12");
				continue;
			}
	
			else {
				break;
			}
		}
		
		switch (answerN) {
		
		case 1: 
			System.out.println("Did you win the game? (Y/N)");

			while (true) {
				
				answer = scan.nextLine();
				if (answer.equals("Y") || answer.equals("y")) {
					game.setWon(true);
					return;
				}
				
				else if (answer.equals("N") || answer.equals("n")) {
					game.setWon(false);
					return;
				}
				
				else {
					System.out.println("Please enter 'Y' or 'N'");
					continue;
				}
			}
		
		case 2:
			System.out.println("How many minutes did you play?");
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN <= 0) {
					System.out.println("Please enter a number greater than 0");
					continue;
				}
				
				else if (answerN > 48) {
					System.out.println("Please enter a number smaller than 49");
					continue;
				}
				
				else {
					game.setMinutes(answerN);
					return;
				}
			}
			
		case 3: 
			System.out.println("How many points did you score?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setPoints(answerN);
					return;
				}
			}
			
		case 4:  
			System.out.println("How many rebounds did you grab?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setRebounds(answerN);
					return;
				}
			}
		
		case 5:
			System.out.println("How many assists did you dish out?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setAssists(answerN);
					return;
				}
			}
		
		case 6:
			System.out.println("How many steals did you have?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setSteals(answerN);
					return;
				}
			}
		
		case 7: 
			System.out.println("How many shots did you swat away?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setBlocks(answerN);
					return;
				}
			}
			
		case 8:
			System.out.println("How many turnovers did you have?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setTurnovers(answerN);
					return;
				}
			}
		
		case 9:
			System.out.println("How many shots did you make?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setFgMade(answerN);
					game.setFgPercentage();
					return;
				}
			}
			
		case 10:
			System.out.println("How many shots did you attempt?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < game.getFgMade()) {
					System.out.println("Please enter at least as many shots as those made");
					continue;
				}
		
				else {
					game.setFgAttempted(answerN);
					game.setFgPercentage();
					return;
				}
			}
			
		case 11:
			System.out.println("How many threes did you make?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < 0) {
					System.out.println("Please enter a number greater than or equal to 0");
					continue;
				}
		
				else {
					game.setThreesMade(answerN);
					game.setThreePercentage();
					return;
				}
			}
		
		case 12:	
			System.out.println("How many threes did you attempt?");
			
			
			while (true) {
				
				answerN = Integer.parseInt(scan.nextLine());
				if (answerN < game.getThreesMade()) {
					System.out.println("Please enter at least as many shots as those made");
					continue;
				}
		
				else {
					game.setThreesAttempted(answerN);
					game.setThreePercentage();
					return;
				}
			}
		}
		
	}
	
	// Takes no arguments. Asks the user for their box score stats and saves them the instance game object. Prints out "All Stats Confirmed" once done.
	
	public void playGame() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String answer;
		int answerN;
		
		System.out.println("\nDid you win the game? (Y/N)");
		
		
		while (true) {
			
			answer = scan.nextLine();
			if (answer.equals("Y") || answer.equals("y")) {
				game.setWon(true);
				break;
			}
			
			else if (answer.equals("N") || answer.equals("n")) {
				game.setWon(false);
				break;
			}
			
			else {
				System.out.println("Please enter 'Y' or 'N'");
				continue;
			}
		}
		
		System.out.println("What difficulty did you play on?\nEnter:\nRookie\nPro\nAll-Star\nSuperstar\nor\nHall of fame");
		
		
		while (true) {
			
			answer = scan.nextLine();
			if (answer.equals("Rookie") || answer.equals("rookie")) {
				game.setDifficulty("Rookie");
				break;
			}
		
			else if (answer.equals("Pro") || answer.equals("pro")) {
				game.setDifficulty("Pro");
				break;
			}
			
			else if (answer.equals("All-Star") || answer.equals("all-star") || answer.equals("All Star") || 
					 answer.equals("all star") || answer.equals("All-star") || answer.equals("All star")) {
				game.setDifficulty("All Star");
				break;
			}
			
			else if (answer.equals("Superstar") || answer.equals("superstar")) {
				game.setDifficulty("Superstar");
				break;
			}
			
			else if (answer.equals("Hall of Fame") || answer.equals("hall of fame") || answer.equals("Hall of fame")) {
				game.setDifficulty("Hall of Fame");
				break;
			}
			
			else {
				System.out.println("Please enter a valid difficulty");
				continue;
			}
		}
		
		System.out.println("How many minutes did you play?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN <= 0) {
				System.out.println("Please enter a number greater than 0");
				continue;
			}
			
			else if (answerN > 48) {
				System.out.println("Please enter a number smaller than 49");
				continue;
			}
			
			else {
				game.setMinutes(answerN);
				break;
			}
		}
		
		System.out.println("How many points did you score?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setPoints(answerN);
				break;
			}
		}
		
		System.out.println("How many rebounds did you grab?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setRebounds(answerN);
				break;
			}
		}
		
		System.out.println("How many assists did you dish out?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setAssists(answerN);
				break;
			}
		}
		
		System.out.println("How many steals did you have?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setSteals(answerN);
				break;
			}
		}
		
		System.out.println("How many shots did you swat away?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setBlocks(answerN);
				break;
			}
		}
		
		System.out.println("How many turnovers did you have?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setTurnovers(answerN);
				break;
			}
		}
		
		System.out.println("How many shots did you make?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setFgMade(answerN);
				break;
			}
		}
		
		System.out.println("How many shots did you attempt?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < game.getFgMade()) {
				System.out.println("Please enter at least as many shots as those made");
				continue;
			}
	
			else {
				game.setFgAttempted(answerN);
				break;
			}
		}
		
		System.out.println("How many threes did you make?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < 0) {
				System.out.println("Please enter a number greater than or equal to 0");
				continue;
			}
	
			else {
				game.setThreesMade(answerN);
				break;
			}
		}
		
		System.out.println("How many threes did you attempt?");
		
		
		while (true) {
			
			answerN = Integer.parseInt(scan.nextLine());
			if (answerN < game.getThreesMade()) {
				System.out.println("Please enter at least as many shots as those made");
				continue;
			}
	
			else {
				game.setThreesAttempted(answerN);
				break;
			}
		}
		
		game.setFgPercentage();
		game.setThreePercentage();
		
		if (!confirmGame(game)) {

			while (true) {
				editGame(game);
				if(confirmGame(game))
					break;
				else
					continue;
			}
		}
		
		System.out.println("\nYour game stats have been recorded.");
		earnXp(game);
	}

	public void earnXp(Game game) {
		double earnedXp = 0;
		
		if (game.getWon())
			earnedXp += 0.5;
		
		earnedXp += (double) game.getPoints() / playerPosition.getAveragePoints();
		earnedXp += (double) game.getRebounds() / playerPosition.getAverageRebounds();
		earnedXp += (double) game.getAssists() / playerPosition.getAverageAssists();
		earnedXp += (double) game.getSteals() / playerPosition.getAverageSteals();
		earnedXp += (double) game.getPoints() / playerPosition.getAveragePoints();
		earnedXp += (double) game.getBlocks() / playerPosition.getAverageBlocks();
		earnedXp += 1 - (double) game.getTurnovers() / playerPosition.getAverageTurnovers();
		if (game.getFgPercentage() != -1)
			earnedXp += 0.5 * (double) game.getFgPercentage() / playerPosition.getAverageFgPercentage();
		if (game.getThreePercentage() != -1)
			earnedXp += 0.5 * (double) game.getThreePercentage() / playerPosition.getAverageThreePercentage();
		
		if (game.getDifficulty().equals("Rookie"))
			setXp(getXp() + 0.3 * earnedXp);
		
		else if (game.getDifficulty().equals("Pro"))
			setXp(getXp() + 0.5 * earnedXp);
		
		else if (game.getDifficulty().equals("All Star"))
			setXp(getXp() + 0.6 * earnedXp);
		
		else if (game.getDifficulty().equals("Supestar"))
			setXp(getXp() + 0.8 * earnedXp);
		
		else 
			setXp(getXp() + earnedXp);
		
		System.out.printf("You have earned %.2f XP\n", earnedXp);
		System.out.printf("You now have a total of %.2f XP\n", getXp());
	}
	
	// toString()
	
	public String toString() {
		return this.getName();
	}
}