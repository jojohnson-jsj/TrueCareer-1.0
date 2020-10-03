public abstract class PlayerBase {
	
	protected String name;
	protected String position;
	protected double xp;
	protected PlayerPosition playerPosition = null;
	
	// Integers for all the Attributes
	
		// Offense
		protected int StandingLayup;
		protected int DrivingLayup;
		protected int PostFadeaway;
		protected int PostHook;
		protected int PostControl;
		protected int DrawFoul;
		protected int ShotClose;
		protected int ContestedShotMid;
		protected int OpenShotMid;
		protected int OffDribbleShotMid;
		protected int ContestedThree;
		protected int OpenThree;
		protected int OffDribbleThree;
		protected int FreeThrow;
		protected int BallControl;
		protected int PassingVision;
		protected int PassingIQ;
		protected int PassingAccuracy;
		protected int OffensiveRebound;
		protected int StandingDunk;
		protected int DrivingDunk;
		protected int ContactDunk;
		protected int ShotIQ;
		protected int Hands;
		
		// Defense
		protected int DefensiveRebound;
		protected int Block;
		protected int ShotContest;
		protected int Steal;
		protected int OnBallDefenseIQ;
		protected int LowPostDefenseIQ;
		protected int ReactionTime;
		
		// Athleticism
		protected int Boxout;
		protected int LateralQuickness;
		protected int Speed;
		protected int SpeedWithBall;
		protected int Acceleration;
		protected int Vertical;
		protected int Strength;
		protected int Stamina;
		protected int Hustle;
		
		// Durability
		protected int HeadDurability;
		protected int NeckDurability;
		protected int BackDurability;
		protected int LeftShoulderDurability;
		protected int RightShoulderDurability;
		protected int LeftElbowDurability;
		protected int RightElbowDurability;
		protected int LeftHipDurability;
		protected int RightHipDurability;
		protected int LeftKneeDurability;
		protected int RightKneeDurability;
		protected int LeftAnkleDurability;
		protected int RightAnkleDurability;
		protected int LeftFootDurability;
		protected int RightFootDurability;
		protected int MiscellaneousDurability;
		
		// Mental
		protected int PassPerception;
		protected int DefensiveConsistency;
		protected int PickAndRollDefenseIQ;
		protected int HelpDefensiveIQ;
		protected int OffensiveConsistency;
		
		// Misc
		protected int Intangibles;
		protected int Potential;
	
	// Booleans for all badges
		
		// Personality
		protected Boolean AlphaDog;
		protected Boolean ClutchPerformer;
		protected Boolean Wildcard;
		protected Boolean SparkPlug;
		protected Boolean Enforcer;
		protected Boolean ChampionshipDNA;
		protected Boolean Microwave;
		protected Boolean FloorGeneral;
		protected Boolean DefensiveAnchor;
		protected Boolean Hardened;
		protected Boolean Reserved;
		protected Boolean Friendly;
		protected Boolean TeamPlayer;
		protected Boolean ExtremelyConfident;
		protected Boolean HighWorkEthic;
		protected Boolean LegendaryWorkEthic;
		protected Boolean KeepItReal;
		protected Boolean PatMyBack;
		protected Boolean Expressive;
		protected Boolean Unpredictable;
		protected Boolean LaidBack;
		
		// Inside Scoring
		protected Boolean Acrobat;
		protected Boolean TearDropper;
		protected Boolean PutbackKing;
		protected Boolean PickAndRoller;
		protected Boolean RelentlessFinisher;
		protected Boolean PostSpinTechnician;
		protected Boolean DropStepper;
		protected Boolean UpAndUnderSpecialist;
		
		// Outside Scoring
		protected Boolean CornerSpecialist;
		protected Boolean MidRangeDeadeye;
		protected Boolean DeepRangeDeadeye;
		protected Boolean LimitlessRange;
		protected Boolean DifficultShots;
		protected Boolean PickAndPopper;
		protected Boolean TirelessScorer;
		protected Boolean CatchAndShoot;
		
		// Playmaking
		protected Boolean AnkleBreaker;
		protected Boolean FlashyPasser;
		protected Boolean BreakStarter;
		protected Boolean PickAndRollMaestro;
		protected Boolean LobCityPasser;
		protected Boolean Dimer;
		
		// Defending
		protected Boolean DefensiveStopper;
		protected Boolean ChargeCard;
		protected Boolean PickDodger;
		protected Boolean PickPocket;
		protected Boolean RimProtector;
		protected Boolean ChaseDownArtist;
		
		// Athleticism
		protected Boolean LobCityFinisher;
		protected Boolean Posterizer;
		protected Boolean Bruiser;
		protected Boolean BrickWall;
		protected Boolean OneManFastBreak;
		
		// Rebounding
		protected Boolean HustleRebounder;
	
		
		
	// Universal setters and getters	
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// Overloaded getPosition to return the position string
	public String getPosition(String string) {
		return this.position;
	}
	
	// Overloaded getPosition to return the position object
	public PlayerPosition getPosition() {
		return this.playerPosition;
	}
	
	public void setPosition(String position) {
		
		if (position.equals("PG"))
			playerPosition = new PointGuard();
		
		else if (position.equals("SG"))
			playerPosition = new ShootingGuard();
		
		else if (position.equals("SF"))
			playerPosition = new SmallForward();
				
		else if (position.equals("PF"))
			playerPosition = new PowerForward();
		
		else if (position.equals("C"))
			playerPosition = new Center();
		
		else {
			playerPosition = null;
			this.position = "null";
			return;
		}
		
		this.position = position;
	}

	public double getXp() {
		return xp;
	}

	public void setXp(double xp) {
		this.xp = xp;
	}
	
	// +-------------------------------+
	// | Attribute setters and getters |
	// +-------------------------------+
	
	// Offensive Attributes

	public void setStandingLayup(int StandingLayup) {
		this.StandingLayup = StandingLayup;
	}	
	public int getStandingLayup() {
		return StandingLayup;
	}
	
	public void setDrivingLayup(int DrivingLayup) {
		this.DrivingLayup = DrivingLayup;
	}
	public int getDrivingLayup() {
		return DrivingLayup;
	}
	
	public void setPostFadeaway(int PostFadeaway) {
		this.PostFadeaway = PostFadeaway;
	}
	public int getPostFadeaway() {
		return PostFadeaway;
	}
	
	public void setPostHook(int PostHook) {
		this.PostHook = PostHook;
	}
	public int getPostHook() {
		return PostHook;
	}
	
	public void setPostControl(int PostControl) {
		this.PostControl = PostControl;
	}
	public int getPostControl() {
		return PostControl;
	}
	
	public void setDrawFoul(int DrawFoul) {
		this.DrawFoul = DrawFoul;
	}
	public int getDrawFoul() {
		return DrawFoul;
	}
	
	public void setShotClose(int ShotClose) {
		this.ShotClose = ShotClose;
	}
	public int getShotClose() {
		return ShotClose;
	}
	
	public void setContestedShotMid(int ContestedShotMid) {
		this.ContestedShotMid = ContestedShotMid;
	}
	public int getContestedShotMid() {
		return ContestedShotMid;
	}
	
	public void setOpenShotMid(int OpenShotMid) {
		this.OpenShotMid = OpenShotMid;
	}
	public int getOpenShotMid() {
		return OpenShotMid;
	}
	
	public void setOffDribbleShotMid(int OffDribbleShotMid) {
		this.OffDribbleShotMid = OffDribbleShotMid;
	}
	public int getOffDribbleShotMid() {
		return OffDribbleShotMid;
	}
	
	public void setContestedThree(int ContestedThree) {
		this.ContestedThree = ContestedThree;
	}
	public int getContestedThree() {
		return ContestedThree;
	}
	
	public void setOpenThree(int OpenThree) {
		this.OpenThree = OpenThree;
	}
	public int getOpenThree() {
		return OpenThree;
	}
	
	public void setOffDribbleThree(int OffDribbleThree) {
		this.OffDribbleThree = OffDribbleThree;
	}
	public int getOffDribbleThree() {
		return OffDribbleThree;
	}
	
	public void setFreeThrow(int FreeThrow) {
		this.FreeThrow = FreeThrow;
	}
	public int getFreeThrow() {
		return FreeThrow;
	}
	
	public void setBallControl(int BallControl) {
		this.BallControl = BallControl;
	}
	public int getBallControl() {
		return BallControl;
	}
	
	public void setPassingVision(int PassingVision) {
		this.PassingVision = PassingVision;
	}
	public int getPassingVision() {
		return PassingVision;
	}
	
	public void setPassingIQ(int PassingIQ) {
		this.PassingIQ = PassingIQ;
	}
	public int getPassingIQ() {
		return PassingIQ;
	}
		
	public void setPassingAccuracy(int PassingAccuracy) {
		this.PassingAccuracy = PassingAccuracy;
	}
	public int getPassingAccuracy() {
		return PassingAccuracy;
	}
	
	public void setOffensiveRebound(int OffensiveRebound) {
		this.OffensiveRebound = OffensiveRebound;
	}
	public int getOffensiveRebound() {
		return OffensiveRebound;
	}
	
	public void setStandingDunk(int StandingDunk) {
		this.StandingDunk = StandingDunk;
	}
	public int getStandingDunk() {
		return StandingDunk;
	}
	
	public void setDrivingDunk(int DrivingDunk) {
		this.DrivingDunk = DrivingDunk;
	}
	public int getDrivingDunk() {
		return DrivingDunk;
	}
	
	public void setContactDunk(int ContactDunk) {
		this.ContactDunk = ContactDunk;
	}
	public int getContactDunk() {
		return ContactDunk;
	}
	
	public void setShotIQ(int ShotIQ) {
		this.ShotIQ = ShotIQ;
	}
	public int getShotIQ() {
		return ShotIQ;
	}
	
	public void setHands(int Hands) {
		this.Hands = Hands;
	}
	public int getHands() {
		return Hands;
	}
	
	// Defensive Attributes
	
	public void setDefensiveRebound(int DefensiveRebound) {
		this.DefensiveRebound = DefensiveRebound;
	}
	public int getDefensiveRebound() {
		return DefensiveRebound;
	}
	
	public void setBlock(int Block) {
		this.Block = Block;
	}
	public int getBlock() {
		return Block;
	}
	
	public void setShotContest(int ShotContest) {
		this.ShotContest = ShotContest;
	}
	public int getShotContest() {
		return ShotContest;
	}

	public void setSteal(int Steal) {
		this.Steal = Steal;
	}
	public int getSteal() {
		return Steal;
	}
	
	public void setOnBallDefenseIQ(int OnBallDefenseIQ) {
		this.OnBallDefenseIQ = OnBallDefenseIQ;
	}
	public int getOnBallDefenseIQ() {
		return OnBallDefenseIQ;
	}
	
	public void setLowPostDefenseIQ(int LowPostDefenseIQ) {
		this.LowPostDefenseIQ = LowPostDefenseIQ;
	}
	public int getLowPostDefenseIQ() {
		return LowPostDefenseIQ;
	}
	
	public void setReactionTime(int ReactionTime) {
		this.ReactionTime = ReactionTime;
	}
	public int getReactionTime() {
		return ReactionTime;
	}

	// Athleticism
	
	public void setBoxout(int Boxout) {
		this.Boxout = Boxout;
	}
	public int getBoxout() {
		return Boxout;
	}
	
	public void setLateralQuickness(int LateralQuickness) {
		this.LateralQuickness = LateralQuickness;
	}
	public int getLateralQuickness() {
		return LateralQuickness;
	}
	
	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}
	public int getSpeed() {
		return Speed;
	}
	
	public void setSpeedWithBall(int SpeedWithBall) {
		this.SpeedWithBall = SpeedWithBall;
	}
	public int getSpeedWithBall() {
		return SpeedWithBall;
	}
	
	public void setAcceleration(int Acceleration) {
		this.Acceleration = Acceleration;
	}
	public int getAcceleration() {
		return Acceleration;
	}
	
	public void setVertical(int Vertical) {
		this.Vertical = Vertical;
	}
	public int getVertical() {
		return Vertical;
	}
	
	public void setStrength(int Strength) {
		this.Strength = Strength;
	}
	public int getStrength() {
		return Strength;
	}
	
	public void setStamina(int Stamina) {
		this.Stamina = Stamina;
	}
	public int getStamina() {
		return Stamina;
	}
	
	public void setHustle(int Hustle) {
		this.Hustle = Hustle;
	}
	public int getHustle() {
		return Hustle;
	}
	
	// Durability
	
	public void setHeadDurability(int HeadDurability) {
		this.HeadDurability = HeadDurability;
	}
	public int getHeadDurability() {
		return HeadDurability;
	}

	public void setNeckDurability(int NeckDurability) {
		this.NeckDurability = NeckDurability;
	}
	public int getNeckDurability() {
		return NeckDurability;
	}
	
	public void setBackDurability(int BackDurability) {
		this.BackDurability = BackDurability;
	}
	public int getBackDurability() {
		return BackDurability;
	}
	
	public void setLeftShoulderDurability(int LeftShoulderDurability) {
		this.LeftShoulderDurability = LeftShoulderDurability;
	}
	public int getLeftShoulderDurability() {
		return LeftShoulderDurability;
	}
	
	public void setRightShoulderDurability(int RightShoulderDurability) {
		this.RightShoulderDurability = RightShoulderDurability;
	}
	public int getRightShoulderDurability() {
		return RightShoulderDurability;
	}
	
	public void setLeftElbowDurability(int LeftElbowDurability) {
		this.LeftElbowDurability = LeftElbowDurability;
	}
	public int getLeftElbowDurability() {
		return LeftElbowDurability;
	}
	
	public void setRightElbowDurability(int RightElbowDurability) {
		this.RightElbowDurability = RightElbowDurability;
	}
	public int getRightElbowDurability() {
		return RightElbowDurability;
	}
	
	public void setLeftHipDurability(int LeftHipDurability) {
		this.LeftHipDurability = LeftHipDurability;
	}
	public int getLeftHipDurability() {
		return LeftHipDurability;
	}
	
	public void setRightHipDurability(int RightHipDurability) {
		this.RightHipDurability = RightHipDurability;
	}
	public int getRightHipDurability() {
		return RightHipDurability;
	}
	
	public void setLeftKneeDurability(int LeftKneeDurability) {
		this.LeftKneeDurability = LeftKneeDurability;
	}
	public int getLeftKneeDurability() {
		return LeftKneeDurability;
	}
	
	public void setRightKneeDurability(int RightKneeDurability) {
		this.RightKneeDurability = RightKneeDurability;
	}
	public int getRightKneeDurability() {
		return RightKneeDurability;
	}
	
	public void setLeftAnkleDurability(int LeftAnkleDurability) {
		this.LeftAnkleDurability = LeftAnkleDurability;
	}
	public int getLeftAnkleDurability() {
		return LeftAnkleDurability;
	}
	
	public void setRightAnkleDurability(int RightAnkleDurability) {
		this.RightAnkleDurability = RightAnkleDurability;
	}
	public int getRightAnkleDurability() {
		return RightAnkleDurability;
	}
	
	public void setLeftFootDurability(int LeftFootDurability) {
		this.LeftFootDurability = LeftFootDurability;
	}
	public int getLeftFootDurability() {
		return LeftFootDurability;
	}
	
	public void setRightFootDurability(int RightFootDurability) {
		this.RightFootDurability = RightFootDurability;
	}
	public int getRightFootDurability() {
		return RightFootDurability;
	}
	
	public void setMiscellaneousDurability(int MiscellaneousDurability) {
		this.MiscellaneousDurability = MiscellaneousDurability;
	}
	public int getMiscellaneousDurability() {
		return MiscellaneousDurability;
	}
	
	// Mental
	
	public void setPassPerception(int PassPerception) {
		this.PassPerception = PassPerception;
	}
	public int getPassPerception() {
		return PassPerception;
	}
	
	public void setDefensiveConsistency(int DefensiveConsistency) {
		this.DefensiveConsistency = DefensiveConsistency;
	}
	public int getDefensiveConsistency() {
		return DefensiveConsistency;
	}
	
	public void setPickAndRollDefenseIQ(int PickAndRollDefenseIQ) {
		this.PickAndRollDefenseIQ = PickAndRollDefenseIQ;
	}
	public int getPickAndRollDefenseIQ() {
		return PickAndRollDefenseIQ;
	}
	
	public void setHelpDefensiveIQ(int HelpDefensiveIQ) {
		this.HelpDefensiveIQ = HelpDefensiveIQ;
	}
	public int getHelpDefensiveIQ() {
		return HelpDefensiveIQ;
	}
	
	public void setOffensiveConsistency(int OffensiveConsistency) {
		this.OffensiveConsistency = OffensiveConsistency;
	}
	public int getOffensiveConsistency() {
		return OffensiveConsistency;
	}
	
	// Misc
	
	public void setIntangibles(int Intangibles) {
		this.Intangibles = Intangibles;
	}
	public int getIntangibles() {
		return Intangibles;
	}
	
	public void setPotential(int Potential) {
		this.Potential = Potential;
	}
	public int getPotential() {
		return Potential;
	}
	
	// +---------------------------+
	// | Badge setters and getters |
	// +---------------------------+
	
	// Personality
	
	public void setAlphaDog(Boolean AlphaDog) {
		this.AlphaDog = AlphaDog;
	}
	public Boolean getAlphaDog() {
		return AlphaDog;
	}
	
	public void setClutchPerformer(Boolean ClutchPerformer) {
		this.ClutchPerformer = ClutchPerformer;
	}
	public Boolean getClutchPerformer() {
		return ClutchPerformer;
	}
	
	public void setWildcard(Boolean Wildcard) {
		this.Wildcard = Wildcard;
	}
	public Boolean getWildcard() {
		return Wildcard;
	}
	
	public void setSparkPlug(Boolean SparkPlug) {
		this.SparkPlug = SparkPlug;
	}
	public Boolean getSparkPlug() {
		return SparkPlug;
	}
	
	public void setEnforcer(Boolean Enforcer) {
		this.Enforcer = Enforcer;
	}
	public Boolean getEnforcer() {
		return Enforcer;
	}
	
	public void setChampionshipDNA(Boolean ChampionshipDNA) {
		this.ChampionshipDNA = ChampionshipDNA;
	}
	public Boolean getChampionshipDNA() {
		return ChampionshipDNA;
	}
	
	public void setMicrowave(Boolean Microwave) {
		this.Microwave = Microwave;
	}
	public Boolean getMicrowave() {
		return Microwave;
	}
	
	public void setFloorGeneral(Boolean FloorGeneral) {
		this.FloorGeneral = FloorGeneral;
	}
	public Boolean getFloorGeneral() {
		return FloorGeneral;
	}
	
	public void setDefensiveAnchor(Boolean DefensiveAnchor) {
		this.DefensiveAnchor = DefensiveAnchor;
	}
	public Boolean getDefensiveAnchor() {
		return DefensiveAnchor;
	}
	
	public void setHardened(Boolean Hardened) {
		this.Hardened = Hardened;
	}
	public Boolean getHardened() {
		return Hardened;
	}
	
	public void setReserved(Boolean Reserved) {
		this.Reserved = Reserved;
	}
	public Boolean getReserved() {
		return Reserved;
	}
	
	public void setFriendly(Boolean Friendly) {
		this.Friendly = Friendly;
	}
	public Boolean getFriendly() {
		return Friendly;
	}
	
	public void setTeamPlayer(Boolean TeamPlayer) {
		this.TeamPlayer = TeamPlayer;
	}
	public Boolean getTeamPlayer() {
		return TeamPlayer;
	}
	
	public void setExtremelyConfident(Boolean ExtremelyConfident) {
		this.ExtremelyConfident = ExtremelyConfident;
	}
	public Boolean getExtremelyConfident() {
		return ExtremelyConfident;
	}
	
	public void setHighWorkEthic(Boolean HighWorkEthic) {
		this.HighWorkEthic = HighWorkEthic;
	}
	public Boolean getHighWorkEthic() {
		return HighWorkEthic;
	}
	
	public void setLegendaryWorkEthic(Boolean LegendaryWorkEthic) {
		this.LegendaryWorkEthic = LegendaryWorkEthic;
	}
	public Boolean getLegendaryWorkEthic() {
		return LegendaryWorkEthic;
	}
	
	public void setKeepItReal(Boolean KeepItReal) {
		this.KeepItReal = KeepItReal;
	}
	public Boolean getKeepItReal() {
		return KeepItReal;
	}
	
	public void setPatMyBack(Boolean PatMyBack) {
		this.PatMyBack = PatMyBack;
	}
	public Boolean getPatMyBack() {
		return PatMyBack;
	}
	
	public void setExpressive(Boolean Expressive) {
		this.Expressive = Expressive;
	}
	public Boolean getExpressive() {
		return Expressive;
	}
	
	public void setUnpredictable(Boolean Unpredictable) {
		this.Unpredictable = Unpredictable;
	}
	public Boolean getUnpredictable() {
		return Unpredictable;
	}
	
	public void setLaidBack(Boolean LaidBack) {
		this.LaidBack = LaidBack;
	}
	public Boolean getLaidBack() {
		return LaidBack;
	}
	
	// Inside Scoring
	
	public void setAcrobat(Boolean Acrobat) {
		this.Acrobat = Acrobat;
	}
	public Boolean getAcrobat() {
		return Acrobat;
	}
	
	public void setTearDropper(Boolean TearDropper) {
		this.TearDropper = TearDropper;
	}
	public Boolean getTearDropper() {
		return TearDropper;
	}
	
	public void setPutbackKing(Boolean PutbackKing) {
		this.PutbackKing = PutbackKing;
	}
	public Boolean getPutbackKing() {
		return PutbackKing;
	}
	
	public void setPickAndRoller(Boolean PickAndRoller) {
		this.PickAndRoller = PickAndRoller;
	}
	public Boolean getPickAndRoller() {
		return PickAndRoller;
	}
	
	public void setRelentlessFinisher(Boolean RelentlessFinisher) {
		this.RelentlessFinisher = RelentlessFinisher;
	}
	public Boolean getRelentlessFinisher() {
		return RelentlessFinisher;
	}
	
	public void setPostSpinTechnician(Boolean PostSpinTechnician) {
		this.PostSpinTechnician = PostSpinTechnician;
	}
	public Boolean getPostSpinTechnician() {
		return PostSpinTechnician;
	}
	
	public void setDropStepper(Boolean DropStepper) {
		this.DropStepper = DropStepper;
	}
	public Boolean getDropStepper() {
		return DropStepper;
	}
	
	public void setUpAndUnderSpecialist(Boolean UpAndUnderSpecialist) {
		this.UpAndUnderSpecialist = UpAndUnderSpecialist;
	}
	public Boolean getUpAndUnderSpecialist() {
		return UpAndUnderSpecialist;
	}
	
	// Outside Scoring
	
	public void setCornerSpecialist(Boolean CornerSpecialist) {
		this.CornerSpecialist = CornerSpecialist;
	}
	public Boolean getCornerSpecialist() {
		return CornerSpecialist;
	}
	
	public void setMidRangeDeadeye(Boolean MidRangeDeadeye) {
		this.MidRangeDeadeye = MidRangeDeadeye;
	}
	public Boolean getMidRangeDeadeye() {
		return MidRangeDeadeye;
	}
	
	public void setDeepRangeDeadeye(Boolean DeepRangeDeadeye) {
		this.DeepRangeDeadeye = DeepRangeDeadeye;
	}
	public Boolean getDeepRangeDeadeye() {
		return DeepRangeDeadeye;
	}
	
	public void setLimitlessRange(Boolean LimitlessRange) {
		this.LimitlessRange = LimitlessRange;
	}
	public Boolean getLimitlessRange() {
		return LimitlessRange;
	}
	
	public void setDifficultShots(Boolean DifficultShots) {
		this.DifficultShots = DifficultShots;
	}
	public Boolean getDifficultShots() {
		return DifficultShots;
	}
	
	public void setPickAndPopper(Boolean PickAndPopper) {
		this.PickAndPopper = PickAndPopper;
	}
	public Boolean getPickAndPopper() {
		return PickAndPopper;
	}
	
	public void setTirelessScorer(Boolean TirelessScorer) {
		this.TirelessScorer = TirelessScorer;
	}
	public Boolean getTirelessScorer() {
		return TirelessScorer;
	}
	
	public void setCatchAndShoot(Boolean CatchAndShoot) {
		this.CatchAndShoot = CatchAndShoot;
	}
	public Boolean getCatchAndShoot() {
		return CatchAndShoot;
	}
	
	// Playmaking
	
	public void setAnkleBreaker(Boolean AnkleBreaker) {
		this.AnkleBreaker = AnkleBreaker;
	}
	public Boolean getAnkleBreaker() {
		return AnkleBreaker;
	}
	
	public void setFlashyPasser(Boolean FlashyPasser) {
		this.FlashyPasser = FlashyPasser;
	}
	public Boolean getFlashyPasser() {
		return FlashyPasser;
	}
	
	public void setPickAndRollMaestro(Boolean PickAndRollMaestro) {
		this.PickAndRollMaestro = PickAndRollMaestro;
	}
	public Boolean getPickAndRollMaestro() {
		return PickAndRollMaestro;
	}
	
	public void setBreakStarter(Boolean BreakStarter) {
		this.BreakStarter = BreakStarter;
	}
	public Boolean getBreakStarter() {
		return BreakStarter;
	}
	
	public void setLobCityPasser(Boolean LobCityPasser) {
		this.LobCityPasser = LobCityPasser;
	}
	public Boolean getLobCityPasser() {
		return LobCityPasser;
	}
	
	public void setDimer(Boolean Dimer) {
		this.Dimer = Dimer;
	}
	public Boolean getDimer() {
		return Dimer;
	}
	
	// Defending
	
	public void setDefensiveStopper(Boolean DefensiveStopper) {
		this.DefensiveStopper = DefensiveStopper;
	}
	public Boolean getDefensiveStopper() {
		return DefensiveStopper;
	}
	
	public void setChargeCard(Boolean ChargeCard) {
		this.ChargeCard = ChargeCard;
	}
	public Boolean getChargeCard() {
		return ChargeCard;
	}
	
	public void setPickDodger(Boolean PickDodger) {
		this.PickDodger = PickDodger;
	}
	public Boolean getPickDodger() {
		return PickDodger;
	}
	
	public void setPickPocket(Boolean PickPocket) {
		this.PickPocket = PickPocket;
	}
	public Boolean getPickPocket() {
		return PickPocket;
	}
	
	public void setRimProtector(Boolean RimProtector) {
		this.RimProtector = RimProtector;
	}
	public Boolean getRimProtector() {
		return RimProtector;
	}
	
	public void setChaseDownArtist(Boolean ChaseDownArtist) {
		this.ChaseDownArtist = ChaseDownArtist;
	}
	public Boolean getChaseDownArtist() {
		return ChaseDownArtist;
	}

	// Athleticism
	
	public void setLobCityFinisher(Boolean LobCityFinisher) {
		this.LobCityFinisher = LobCityFinisher;
	}
	public Boolean getLobCityFinisher() {
		return LobCityFinisher;
	}
	
	public void setPosterizer(Boolean Posterizer) {
		this.Posterizer = Posterizer;
	}
	public Boolean getPosterizer() {
		return Posterizer;
	}
	
	public void setBruiser(Boolean Bruiser) {
		this.Bruiser = Bruiser;
	}
	public Boolean getBruiser() {
		return Bruiser;
	}
	
	public void setBrickWall(Boolean BrickWall) {
		this.BrickWall = BrickWall;
	}
	public Boolean getBrickWall() {
		return BrickWall;
	}
	
	public void setOneManFastBreak(Boolean OneManFastBreak) {
		this.OneManFastBreak = OneManFastBreak;
	}
	public Boolean getOneManFastBreak() {
		return OneManFastBreak;
	}
	
	// Rebounding
		
	public void setHustleRebounder(Boolean HustleRebounder) {
		this.HustleRebounder = HustleRebounder;
	}
	public Boolean getHustleRebounder() {
		return HustleRebounder;
	}

}