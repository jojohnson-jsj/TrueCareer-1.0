import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class InOutXML {

		// Takes an XML File and returns an ArrayList of players with the correct stats from the file
		public static ArrayList<Player> readPlayers(String xmlFile) {
			int i;
			ArrayList<Player> players = new ArrayList<Player>();
			
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(xmlFile);
				
				NodeList playerList = doc.getElementsByTagName("Player"); 
				
				// For-loop for getting through all of the saved players
				for (i = 0; i < playerList.getLength(); i++) {
					
					// Adding each new player to an ArrayList of player objects named "players"	
					players.add(new Player());

					if (playerList.item(i).getNodeType() == Node.ELEMENT_NODE) {
						Element el = (Element) playerList.item(i);
			            if (el.getNodeName().contains("Player")) {
			            	
			            	// Reading and setting each player's name, position, and xp
							players.get(i).setName(((Element) playerList.item(i)).getAttribute("name"));
							players.get(i).setPosition(el.getElementsByTagName("Position").item(0).getTextContent());
							players.get(i).setXp(Double.parseDouble(el.getElementsByTagName("xp").item(0).getTextContent()));
							
						// Reading and setting all Attributes	
							// Offense
							players.get(i).setStandingLayup(Integer.parseInt(el.getElementsByTagName("StandingLayup").item(0).getTextContent()));
							players.get(i).setDrivingLayup(Integer.parseInt(el.getElementsByTagName("DrivingLayup").item(0).getTextContent()));
							players.get(i).setPostFadeaway(Integer.parseInt(el.getElementsByTagName("PostFadeaway").item(0).getTextContent()));
							players.get(i).setPostHook(Integer.parseInt(el.getElementsByTagName("PostHook").item(0).getTextContent()));
							players.get(i).setPostControl(Integer.parseInt(el.getElementsByTagName("PostControl").item(0).getTextContent()));
							players.get(i).setDrawFoul(Integer.parseInt(el.getElementsByTagName("DrawFoul").item(0).getTextContent()));
							players.get(i).setShotClose(Integer.parseInt(el.getElementsByTagName("ShotClose").item(0).getTextContent()));
							players.get(i).setContestedShotMid(Integer.parseInt(el.getElementsByTagName("ContestedShotMid").item(0).getTextContent()));
							players.get(i).setOpenShotMid(Integer.parseInt(el.getElementsByTagName("OpenShotMid").item(0).getTextContent()));
							players.get(i).setOffDribbleShotMid(Integer.parseInt(el.getElementsByTagName("OffDribbleShotMid").item(0).getTextContent()));
							players.get(i).setContestedThree(Integer.parseInt(el.getElementsByTagName("ContestedThree").item(0).getTextContent()));
			            	players.get(i).setOpenThree(Integer.parseInt(el.getElementsByTagName("OpenThree").item(0).getTextContent()));
			            	players.get(i).setOffDribbleThree(Integer.parseInt(el.getElementsByTagName("OffDribbleThree").item(0).getTextContent()));
			            	players.get(i).setFreeThrow(Integer.parseInt(el.getElementsByTagName("FreeThrow").item(0).getTextContent()));
			            	players.get(i).setBallControl(Integer.parseInt(el.getElementsByTagName("BallControl").item(0).getTextContent()));
			            	players.get(i).setPassingVision(Integer.parseInt(el.getElementsByTagName("PassingVision").item(0).getTextContent()));
			            	players.get(i).setPassingIQ(Integer.parseInt(el.getElementsByTagName("PassingIQ").item(0).getTextContent()));
			            	players.get(i).setPassingAccuracy(Integer.parseInt(el.getElementsByTagName("PassingAccuracy").item(0).getTextContent()));
							players.get(i).setOffensiveRebound(Integer.parseInt(el.getElementsByTagName("OffensiveRebound").item(0).getTextContent()));
							players.get(i).setStandingDunk(Integer.parseInt(el.getElementsByTagName("StandingDunk").item(0).getTextContent()));
							players.get(i).setDrivingDunk(Integer.parseInt(el.getElementsByTagName("DrivingDunk").item(0).getTextContent()));
							players.get(i).setContactDunk(Integer.parseInt(el.getElementsByTagName("ContactDunk").item(0).getTextContent()));
							players.get(i).setShotIQ(Integer.parseInt(el.getElementsByTagName("ShotIQ").item(0).getTextContent()));
							players.get(i).setHands(Integer.parseInt(el.getElementsByTagName("Hands").item(0).getTextContent()));
							
							// Defense
							players.get(i).setDefensiveRebound(Integer.parseInt(el.getElementsByTagName("DefensiveRebound").item(0).getTextContent()));
							players.get(i).setBlock(Integer.parseInt(el.getElementsByTagName("Block").item(0).getTextContent()));
							players.get(i).setShotContest(Integer.parseInt(el.getElementsByTagName("ShotContest").item(0).getTextContent()));
							players.get(i).setSteal(Integer.parseInt(el.getElementsByTagName("Steal").item(0).getTextContent()));
			            	players.get(i).setOnBallDefenseIQ(Integer.parseInt(el.getElementsByTagName("OnBallDefenseIQ").item(0).getTextContent()));
			            	players.get(i).setLowPostDefenseIQ(Integer.parseInt(el.getElementsByTagName("LowPostDefenseIQ").item(0).getTextContent()));
			            	players.get(i).setReactionTime(Integer.parseInt(el.getElementsByTagName("ReactionTime").item(0).getTextContent()));
			            	
			            	// Athleticism
			            	players.get(i).setBoxout(Integer.parseInt(el.getElementsByTagName("Boxout").item(0).getTextContent()));
			            	players.get(i).setLateralQuickness(Integer.parseInt(el.getElementsByTagName("LateralQuickness").item(0).getTextContent()));
			            	players.get(i).setSpeed(Integer.parseInt(el.getElementsByTagName("Speed").item(0).getTextContent()));
			             	players.get(i).setSpeedWithBall(Integer.parseInt(el.getElementsByTagName("SpeedWithBall").item(0).getTextContent()));
			            	players.get(i).setAcceleration(Integer.parseInt(el.getElementsByTagName("Acceleration").item(0).getTextContent()));
			            	players.get(i).setVertical(Integer.parseInt(el.getElementsByTagName("Vertical").item(0).getTextContent()));
			             	players.get(i).setStrength(Integer.parseInt(el.getElementsByTagName("Strength").item(0).getTextContent()));
			            	players.get(i).setStamina(Integer.parseInt(el.getElementsByTagName("Stamina").item(0).getTextContent()));
			            	players.get(i).setHustle(Integer.parseInt(el.getElementsByTagName("Hustle").item(0).getTextContent()));
			            	
			            	// Durability
			            	players.get(i).setHeadDurability(Integer.parseInt(el.getElementsByTagName("HeadDurability").item(0).getTextContent()));
			            	players.get(i).setNeckDurability(Integer.parseInt(el.getElementsByTagName("NeckDurability").item(0).getTextContent()));
			            	players.get(i).setBackDurability(Integer.parseInt(el.getElementsByTagName("BackDurability").item(0).getTextContent()));
			            	players.get(i).setLeftShoulderDurability(Integer.parseInt(el.getElementsByTagName("LeftShoulderDurability").item(0).getTextContent()));
			            	players.get(i).setRightShoulderDurability(Integer.parseInt(el.getElementsByTagName("RightShoulderDurability").item(0).getTextContent()));
			            	players.get(i).setLeftElbowDurability(Integer.parseInt(el.getElementsByTagName("LeftElbowDurability").item(0).getTextContent()));
			            	players.get(i).setRightElbowDurability(Integer.parseInt(el.getElementsByTagName("RightElbowDurability").item(0).getTextContent()));
			            	players.get(i).setLeftHipDurability(Integer.parseInt(el.getElementsByTagName("LeftHipDurability").item(0).getTextContent()));
			            	players.get(i).setRightHipDurability(Integer.parseInt(el.getElementsByTagName("RightHipDurability").item(0).getTextContent()));
			            	players.get(i).setLeftKneeDurability(Integer.parseInt(el.getElementsByTagName("LeftKneeDurability").item(0).getTextContent()));
			            	players.get(i).setRightKneeDurability(Integer.parseInt(el.getElementsByTagName("RightKneeDurability").item(0).getTextContent()));
			            	players.get(i).setLeftAnkleDurability(Integer.parseInt(el.getElementsByTagName("LeftAnkleDurability").item(0).getTextContent()));
			            	players.get(i).setRightAnkleDurability(Integer.parseInt(el.getElementsByTagName("RightAnkleDurability").item(0).getTextContent()));
			            	players.get(i).setLeftFootDurability(Integer.parseInt(el.getElementsByTagName("LeftFootDurability").item(0).getTextContent()));
			            	players.get(i).setRightFootDurability(Integer.parseInt(el.getElementsByTagName("RightFootDurability").item(0).getTextContent()));
			            	players.get(i).setMiscellaneousDurability(Integer.parseInt(el.getElementsByTagName("MiscellaneousDurability").item(0).getTextContent()));
			            	
			            	// Mental
			            	players.get(i).setPassPerception(Integer.parseInt(el.getElementsByTagName("PassPerception").item(0).getTextContent()));
			            	players.get(i).setDefensiveConsistency(Integer.parseInt(el.getElementsByTagName("DefensiveConsistency").item(0).getTextContent()));
			            	players.get(i).setPickAndRollDefenseIQ(Integer.parseInt(el.getElementsByTagName("PickAndRollDefenseIQ").item(0).getTextContent()));
			            	players.get(i).setHelpDefensiveIQ(Integer.parseInt(el.getElementsByTagName("HelpDefensiveIQ").item(0).getTextContent()));
			            	players.get(i).setOffensiveConsistency(Integer.parseInt(el.getElementsByTagName("OffensiveConsistency").item(0).getTextContent()));
			            	
			            	// Misc
			            	players.get(i).setIntangibles(Integer.parseInt(el.getElementsByTagName("Intangibles").item(0).getTextContent()));
			            	players.get(i).setPotential(Integer.parseInt(el.getElementsByTagName("Potential").item(0).getTextContent()));
			            	
			            // Reading and setting all Badges	
			            	
			            	// Personality
			            	players.get(i).setAlphaDog(Boolean.parseBoolean(el.getElementsByTagName("AlphaDog").item(0).getTextContent()));
			            	players.get(i).setClutchPerformer(Boolean.parseBoolean(el.getElementsByTagName("ClutchPerformer").item(0).getTextContent()));
			            	players.get(i).setWildcard(Boolean.parseBoolean(el.getElementsByTagName("Wildcard").item(0).getTextContent()));
			            	players.get(i).setSparkPlug(Boolean.parseBoolean(el.getElementsByTagName("SparkPlug").item(0).getTextContent()));
			            	players.get(i).setEnforcer(Boolean.parseBoolean(el.getElementsByTagName("Enforcer").item(0).getTextContent()));
			            	players.get(i).setChampionshipDNA(Boolean.parseBoolean(el.getElementsByTagName("ChampionshipDNA").item(0).getTextContent()));
			            	players.get(i).setMicrowave(Boolean.parseBoolean(el.getElementsByTagName("Microwave").item(0).getTextContent()));
			            	players.get(i).setFloorGeneral(Boolean.parseBoolean(el.getElementsByTagName("FloorGeneral").item(0).getTextContent()));
			            	players.get(i).setDefensiveAnchor(Boolean.parseBoolean(el.getElementsByTagName("DefensiveAnchor").item(0).getTextContent()));
			            	players.get(i).setHardened(Boolean.parseBoolean(el.getElementsByTagName("Hardened").item(0).getTextContent()));
			            	players.get(i).setReserved(Boolean.parseBoolean(el.getElementsByTagName("Reserved").item(0).getTextContent()));
			            	players.get(i).setFriendly(Boolean.parseBoolean(el.getElementsByTagName("Friendly").item(0).getTextContent()));
			            	players.get(i).setTeamPlayer(Boolean.parseBoolean(el.getElementsByTagName("TeamPlayer").item(0).getTextContent()));
			            	players.get(i).setExtremelyConfident(Boolean.parseBoolean(el.getElementsByTagName("ExtremelyConfident").item(0).getTextContent()));
			            	players.get(i).setHighWorkEthic(Boolean.parseBoolean(el.getElementsByTagName("HighWorkEthic").item(0).getTextContent()));
			            	players.get(i).setLegendaryWorkEthic(Boolean.parseBoolean(el.getElementsByTagName("LegendaryWorkEthic").item(0).getTextContent()));
			            	players.get(i).setKeepItReal(Boolean.parseBoolean(el.getElementsByTagName("KeepItReal").item(0).getTextContent()));
			            	players.get(i).setPatMyBack(Boolean.parseBoolean(el.getElementsByTagName("PatMyBack").item(0).getTextContent()));
			            	players.get(i).setExpressive(Boolean.parseBoolean(el.getElementsByTagName("Expressive").item(0).getTextContent()));
			            	players.get(i).setUnpredictable(Boolean.parseBoolean(el.getElementsByTagName("Unpredictable").item(0).getTextContent()));
			            	players.get(i).setLaidBack(Boolean.parseBoolean(el.getElementsByTagName("LaidBack").item(0).getTextContent()));
			            	
			            	// Inside Scoring
			            	players.get(i).setAcrobat(Boolean.parseBoolean(el.getElementsByTagName("Acrobat").item(0).getTextContent()));
			            	players.get(i).setTearDropper(Boolean.parseBoolean(el.getElementsByTagName("TearDropper").item(0).getTextContent()));
			            	players.get(i).setPutbackKing(Boolean.parseBoolean(el.getElementsByTagName("PutbackKing").item(0).getTextContent()));
			            	players.get(i).setPickAndRoller(Boolean.parseBoolean(el.getElementsByTagName("PickAndRoller").item(0).getTextContent()));
			            	players.get(i).setRelentlessFinisher(Boolean.parseBoolean(el.getElementsByTagName("RelentlessFinisher").item(0).getTextContent()));
			            	players.get(i).setPostSpinTechnician(Boolean.parseBoolean(el.getElementsByTagName("PostSpinTechnician").item(0).getTextContent()));
			            	players.get(i).setDropStepper(Boolean.parseBoolean(el.getElementsByTagName("DropStepper").item(0).getTextContent()));
			            	players.get(i).setUpAndUnderSpecialist(Boolean.parseBoolean(el.getElementsByTagName("UpAndUnderSpecialist").item(0).getTextContent()));
			            	
			            	// Outside Scoring
			            	players.get(i).setCornerSpecialist(Boolean.parseBoolean(el.getElementsByTagName("CornerSpecialist").item(0).getTextContent()));
			            	players.get(i).setMidRangeDeadeye(Boolean.parseBoolean(el.getElementsByTagName("MidRangeDeadeye").item(0).getTextContent()));
			            	players.get(i).setDeepRangeDeadeye(Boolean.parseBoolean(el.getElementsByTagName("DeepRangeDeadeye").item(0).getTextContent()));
			            	players.get(i).setLimitlessRange(Boolean.parseBoolean(el.getElementsByTagName("LimitlessRange").item(0).getTextContent()));
			            	players.get(i).setDifficultShots(Boolean.parseBoolean(el.getElementsByTagName("DifficultShots").item(0).getTextContent()));
			            	players.get(i).setPickAndPopper(Boolean.parseBoolean(el.getElementsByTagName("PickAndPopper").item(0).getTextContent()));
			            	players.get(i).setTirelessScorer(Boolean.parseBoolean(el.getElementsByTagName("TirelessScorer").item(0).getTextContent()));
			            	players.get(i).setCatchAndShoot(Boolean.parseBoolean(el.getElementsByTagName("CatchAndShoot").item(0).getTextContent()));

			            	// Playmaking
			            	players.get(i).setAnkleBreaker(Boolean.parseBoolean(el.getElementsByTagName("AnkleBreaker").item(0).getTextContent()));
			            	players.get(i).setFlashyPasser(Boolean.parseBoolean(el.getElementsByTagName("FlashyPasser").item(0).getTextContent()));
			            	players.get(i).setBreakStarter(Boolean.parseBoolean(el.getElementsByTagName("BreakStarter").item(0).getTextContent()));
			            	players.get(i).setPickAndRollMaestro(Boolean.parseBoolean(el.getElementsByTagName("PickAndRollMaestro").item(0).getTextContent()));
			            	players.get(i).setLobCityPasser(Boolean.parseBoolean(el.getElementsByTagName("LobCityPasser").item(0).getTextContent()));
			            	players.get(i).setDimer(Boolean.parseBoolean(el.getElementsByTagName("Dimer").item(0).getTextContent()));
			            	
			            	// Defending
			            	players.get(i).setDefensiveStopper(Boolean.parseBoolean(el.getElementsByTagName("DefensiveStopper").item(0).getTextContent()));
			            	players.get(i).setChargeCard(Boolean.parseBoolean(el.getElementsByTagName("ChargeCard").item(0).getTextContent()));
			            	players.get(i).setPickDodger(Boolean.parseBoolean(el.getElementsByTagName("PickDodger").item(0).getTextContent()));
			            	players.get(i).setPickPocket(Boolean.parseBoolean(el.getElementsByTagName("PickPocket").item(0).getTextContent()));
			            	players.get(i).setRimProtector(Boolean.parseBoolean(el.getElementsByTagName("RimProtector").item(0).getTextContent()));
			            	players.get(i).setChaseDownArtist(Boolean.parseBoolean(el.getElementsByTagName("ChaseDownArtist").item(0).getTextContent()));
			            	
			            	// Athleticism
			            	players.get(i).setLobCityFinisher(Boolean.parseBoolean(el.getElementsByTagName("LobCityFinisher").item(0).getTextContent()));
			            	players.get(i).setPosterizer(Boolean.parseBoolean(el.getElementsByTagName("Posterizer").item(0).getTextContent()));
			            	players.get(i).setBruiser(Boolean.parseBoolean(el.getElementsByTagName("Bruiser").item(0).getTextContent()));
			            	players.get(i).setBrickWall(Boolean.parseBoolean(el.getElementsByTagName("BrickWall").item(0).getTextContent()));
			            	players.get(i).setOneManFastBreak(Boolean.parseBoolean(el.getElementsByTagName("OneManFastBreak").item(0).getTextContent()));
			            	
			            	// Rebounding
			            	players.get(i).setHustleRebounder(Boolean.parseBoolean(el.getElementsByTagName("HustleRebounder").item(0).getTextContent()));
			            }
					}	
				}
				
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return players;
		}
		
		// Takes and ArrayList of players and returns/creates an XML File with the correct stats
		public static void writePlayers(ArrayList<Player> playerList, String xmlFile) {
			int i;
			
			// OVERWRITE WITH YOUR OWN FILEPATH
			String xmlFilePath = "H:\\Desktop\\TrueCareer\\" + xmlFile;
			
			 try {
				 	// Setting up to create a document
		            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
		            Document document = documentBuilder.newDocument();
		            
		            // Root element
		            Element root = document.createElement("PlayerData");
		            document.appendChild(root);
		            
		            // Looping through the entire ArrayList looking for players
		            for (i = 0; i < playerList.size(); i++) {
		            
			            // Player element
			            Element player = document.createElement("Player");
			            root.appendChild(player);
			            
			            // Set Player name
			            Attr attr = document.createAttribute("name");
			            attr.setValue(playerList.get(i).getName());
			            player.setAttributeNode(attr);
			            
			            // Position element
			            Element Position = document.createElement("Position");
			            Position.appendChild(document.createTextNode(playerList.get(i).getPosition("P")));
			            player.appendChild(Position);
			            
			            // XP element
			            Element xp = document.createElement("xp");
			            xp.appendChild(document.createTextNode(Double.toString(playerList.get(i).getXp())));
			            player.appendChild(xp);
			            
			         // Attributes
			            
			            // Offense
			            Element StandingLayup = document.createElement("StandingLayup");
			            StandingLayup.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getStandingLayup())));
			            player.appendChild(StandingLayup);
			            
			            Element DrivingLayup = document.createElement("DrivingLayup");
			            DrivingLayup.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getDrivingLayup())));
			            player.appendChild(DrivingLayup);
			            
			            Element PostFadeaway = document.createElement("PostFadeaway");
			            PostFadeaway.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPostFadeaway())));
			            player.appendChild(PostFadeaway);
			            
			            Element PostHook = document.createElement("PostHook");
			            PostHook.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPostHook())));
			            player.appendChild(PostHook);
			            
			            Element PostControl = document.createElement("PostControl");
			            PostControl.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPostControl())));
			            player.appendChild(PostControl);
			            
			            Element DrawFoul = document.createElement("DrawFoul");
			            DrawFoul.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getDrawFoul())));
			            player.appendChild(DrawFoul);
			            
			            Element ShotClose = document.createElement("ShotClose");
			            ShotClose.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getShotClose())));
			            player.appendChild(ShotClose);
			            
			            Element ContestedShotMid = document.createElement("ContestedShotMid");
			            ContestedShotMid.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getContestedShotMid())));
			            player.appendChild(ContestedShotMid);
			            
			            Element OpenShotMid = document.createElement("OpenShotMid");
			            OpenShotMid.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOpenShotMid())));
			            player.appendChild(OpenShotMid);
			            
			            Element OffDribbleShotMid = document.createElement("OffDribbleShotMid");
			            OffDribbleShotMid.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOffDribbleShotMid())));
			            player.appendChild(OffDribbleShotMid);
			            
			            Element ContestedThree = document.createElement("ContestedThree");
			            ContestedThree.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getContestedThree())));
			            player.appendChild(ContestedThree);
			            
			            Element OpenThree = document.createElement("OpenThree");
			            OpenThree.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOpenThree())));
			            player.appendChild(OpenThree);
			            
			            Element OffDribbleThree = document.createElement("OffDribbleThree");
			            OffDribbleThree.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOffDribbleThree())));
			            player.appendChild(OffDribbleThree);
			            
			            Element FreeThrow = document.createElement("FreeThrow");
			            FreeThrow.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getFreeThrow())));
			            player.appendChild(FreeThrow);
			            
			            Element BallControl = document.createElement("BallControl");
			            BallControl.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getBallControl())));
			            player.appendChild(BallControl);
			            
			            Element PassingVision = document.createElement("PassingVision");
			            PassingVision.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPassingVision())));
			            player.appendChild(PassingVision);
			            
			            Element PassingIQ = document.createElement("PassingIQ");
			            PassingIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPassingIQ())));
			            player.appendChild(PassingIQ);
			            
			            Element PassingAccuracy = document.createElement("PassingAccuracy");
			            PassingAccuracy.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPassingAccuracy())));
			            player.appendChild(PassingAccuracy);
			            
			            Element OffensiveRebound = document.createElement("OffensiveRebound");
			            OffensiveRebound.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOffensiveRebound())));
			            player.appendChild(OffensiveRebound);
			            
			            Element StandingDunk = document.createElement("StandingDunk");
			            StandingDunk.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getStandingDunk())));
			            player.appendChild(StandingDunk);
			            
			            Element DrivingDunk = document.createElement("DrivingDunk");
			            DrivingDunk.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getDrivingDunk())));
			            player.appendChild(DrivingDunk);
			            
			            Element ContactDunk = document.createElement("ContactDunk");
			            ContactDunk.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getContactDunk())));
			            player.appendChild(ContactDunk);
			            
			            Element ShotIQ = document.createElement("ShotIQ");
			            ShotIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getShotIQ())));
			            player.appendChild(ShotIQ);
			            
			            Element Hands = document.createElement("Hands");
			            Hands.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getHands())));
			            player.appendChild(Hands);
			            
			            // Defense
			            Element DefensiveRebound = document.createElement("DefensiveRebound");
			            DefensiveRebound.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getDefensiveRebound())));
			            player.appendChild(DefensiveRebound);
			            
			            Element Block = document.createElement("Block");
			            Block.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getBlock())));
			            player.appendChild(Block);
			            
			            Element ShotContest = document.createElement("ShotContest");
			            ShotContest.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getShotContest())));
			            player.appendChild(ShotContest);
			            
			            Element Steal = document.createElement("Steal");
			            Steal.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getSteal())));
			            player.appendChild(Steal);
			            
			            Element OnBallDefenseIQ = document.createElement("OnBallDefenseIQ");
			            OnBallDefenseIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOnBallDefenseIQ())));
			            player.appendChild(OnBallDefenseIQ);
			            
			            Element LowPostDefenseIQ = document.createElement("LowPostDefenseIQ");
			            LowPostDefenseIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLowPostDefenseIQ())));
			            player.appendChild(LowPostDefenseIQ);
			            
			            Element ReactionTime = document.createElement("ReactionTime");
			            ReactionTime.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getReactionTime())));
			            player.appendChild(ReactionTime);
			            
			            // Athleticism
			            Element Boxout = document.createElement("Boxout");
			            Boxout.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getBoxout())));
			            player.appendChild(Boxout);
			            
			            Element LateralQuickness = document.createElement("LateralQuickness");
			            LateralQuickness.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLateralQuickness())));
			            player.appendChild(LateralQuickness);
			            
			            Element Speed = document.createElement("Speed");
			            Speed.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getSpeed())));
			            player.appendChild(Speed);
			            
			            Element SpeedWithBall = document.createElement("SpeedWithBall");
			            SpeedWithBall.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getSpeedWithBall())));
			            player.appendChild(SpeedWithBall);
			            
			            Element Acceleration = document.createElement("Acceleration");
			            Acceleration.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getAcceleration())));
			            player.appendChild(Acceleration);
			            
			            Element Vertical = document.createElement("Vertical");
			            Vertical.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getVertical())));
			            player.appendChild(Vertical);
			            
			            Element Strength = document.createElement("Strength");
			            Strength.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getStrength())));
			            player.appendChild(Strength);
			            
			            Element Stamina = document.createElement("Stamina");
			            Stamina.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getStamina())));
			            player.appendChild(Stamina);
			            
			            Element Hustle = document.createElement("Hustle");
			            Hustle.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getHustle())));
			            player.appendChild(Hustle);
			            
			            // Durability
			            Element HeadDurability = document.createElement("HeadDurability");
			            HeadDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getHeadDurability())));
			            player.appendChild(HeadDurability);
			            
			            Element NeckDurability = document.createElement("NeckDurability");
			            NeckDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getNeckDurability())));
			            player.appendChild(NeckDurability);
			            
			            Element BackDurability = document.createElement("BackDurability");
			            BackDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getBackDurability())));
			            player.appendChild(BackDurability);
			            
			            Element LeftShoulderDurability = document.createElement("LeftShoulderDurability");
			            LeftShoulderDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftShoulderDurability())));
			            player.appendChild(LeftShoulderDurability);
			            
			            Element RightShoulderDurability = document.createElement("RightShoulderDurability");
			            RightShoulderDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightShoulderDurability())));
			            player.appendChild(RightShoulderDurability);
			            
			            Element LeftElbowDurability = document.createElement("LeftElbowDurability");
			            LeftElbowDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftElbowDurability())));
			            player.appendChild(LeftElbowDurability);
			            
			            Element RightElbowDurability = document.createElement("RightElbowDurability");
			            RightElbowDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightElbowDurability())));
			            player.appendChild(RightElbowDurability);
			            
			            Element LeftHipDurability = document.createElement("LeftHipDurability");
			            LeftHipDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftHipDurability())));
			            player.appendChild(LeftHipDurability);
			            
			            Element RightHipDurability = document.createElement("RightHipDurability");
			            RightHipDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightHipDurability())));
			            player.appendChild(RightHipDurability);
			            
			            Element LeftKneeDurability = document.createElement("LeftKneeDurability");
			            LeftKneeDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftKneeDurability())));
			            player.appendChild(LeftKneeDurability);
			            
			            Element RightKneeDurability = document.createElement("RightKneeDurability");
			            RightKneeDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightKneeDurability())));
			            player.appendChild(RightKneeDurability);
			            
			            Element LeftAnkleDurability = document.createElement("LeftAnkleDurability");
			            LeftAnkleDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftAnkleDurability())));
			            player.appendChild(LeftAnkleDurability);
			            
			            Element RightAnkleDurability = document.createElement("RightAnkleDurability");
			            RightAnkleDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightAnkleDurability())));
			            player.appendChild(RightAnkleDurability);
			            
			            Element LeftFootDurability = document.createElement("LeftFootDurability");
			            LeftFootDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getLeftFootDurability())));
			            player.appendChild(LeftFootDurability);
			            
			            Element RightFootDurability = document.createElement("RightFootDurability");
			            RightFootDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getRightFootDurability())));
			            player.appendChild(RightFootDurability);
			            
			            Element MiscellaneousDurability = document.createElement("MiscellaneousDurability");
			            MiscellaneousDurability.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getMiscellaneousDurability())));
			            player.appendChild(MiscellaneousDurability);
			            
			            // Mental
			            Element PassPerception = document.createElement("PassPerception");
			            PassPerception.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPassPerception())));
			            player.appendChild(PassPerception);
			            
			            Element DefensiveConsistency = document.createElement("DefensiveConsistency");
			            DefensiveConsistency.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getDefensiveConsistency())));
			            player.appendChild(DefensiveConsistency);
			            
			            Element PickAndRollDefenseIQ = document.createElement("PickAndRollDefenseIQ");
			            PickAndRollDefenseIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPickAndRollDefenseIQ())));
			            player.appendChild(PickAndRollDefenseIQ);
			            
			            Element HelpDefensiveIQ = document.createElement("HelpDefensiveIQ");
			            HelpDefensiveIQ.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getHelpDefensiveIQ())));
			            player.appendChild(HelpDefensiveIQ);
			            
			            Element OffensiveConsistency = document.createElement("OffensiveConsistency");
			            OffensiveConsistency.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getOffensiveConsistency())));
			            player.appendChild(OffensiveConsistency);
			            
			            // Misc
			            Element Intangibles = document.createElement("Intangibles");
			            Intangibles.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getIntangibles())));
			            player.appendChild(Intangibles);
			            
			            Element Potential = document.createElement("Potential");
			            Potential.appendChild(document.createTextNode(Integer.toString(playerList.get(i).getPotential())));
			            player.appendChild(Potential);
			            
			         // Badges
			            
			            // Personality
			            Element AlphaDog = document.createElement("AlphaDog");
			            AlphaDog.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getAlphaDog())));
			            player.appendChild(AlphaDog);
			            
			            Element ClutchPerformer = document.createElement("ClutchPerformer");
			            ClutchPerformer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getClutchPerformer())));
			            player.appendChild(ClutchPerformer);
			            
			            Element Wildcard = document.createElement("Wildcard");
			            Wildcard.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getWildcard())));
			            player.appendChild(Wildcard);
			            
			            Element SparkPlug = document.createElement("SparkPlug");
			            SparkPlug.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getSparkPlug())));
			            player.appendChild(SparkPlug);
			            
			            Element Enforcer = document.createElement("Enforcer");
			            Enforcer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getEnforcer())));
			            player.appendChild(Enforcer);
			            
			            Element ChampionshipDNA = document.createElement("ChampionshipDNA");
			            ChampionshipDNA.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getChampionshipDNA())));
			            player.appendChild(ChampionshipDNA);
			            
			            Element Microwave = document.createElement("Microwave");
			            Microwave.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getMicrowave())));
			            player.appendChild(Microwave);
			            
			            Element FloorGeneral = document.createElement("FloorGeneral");
			            FloorGeneral.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getFloorGeneral())));
			            player.appendChild(FloorGeneral);
			            
			            Element DefensiveAnchor = document.createElement("DefensiveAnchor");
			            DefensiveAnchor.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDefensiveAnchor())));
			            player.appendChild(DefensiveAnchor);
			            
			            Element Hardened = document.createElement("Hardened");
			            Hardened.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getHardened())));
			            player.appendChild(Hardened);
			            
			            Element Reserved = document.createElement("Reserved");
			            Reserved.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getReserved())));
			            player.appendChild(Reserved);
			            
			            Element Friendly = document.createElement("Friendly");
			            Friendly.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getFriendly())));
			            player.appendChild(Friendly);
			            
			            Element TeamPlayer = document.createElement("TeamPlayer");
			            TeamPlayer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getTeamPlayer())));
			            player.appendChild(TeamPlayer);
			            
			            Element ExtremelyConfident = document.createElement("ExtremelyConfident");
			            ExtremelyConfident.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getExtremelyConfident())));
			            player.appendChild(ExtremelyConfident);
			            
			            Element HighWorkEthic = document.createElement("HighWorkEthic");
			            HighWorkEthic.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getHighWorkEthic())));
			            player.appendChild(HighWorkEthic);
			            
			            Element LegendaryWorkEthic = document.createElement("LegendaryWorkEthic");
			            LegendaryWorkEthic.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getLegendaryWorkEthic())));
			            player.appendChild(LegendaryWorkEthic);
			            
			            Element KeepItReal = document.createElement("KeepItReal");
			            KeepItReal.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getKeepItReal())));
			            player.appendChild(KeepItReal);
			            
			            Element PatMyBack = document.createElement("PatMyBack");
			            PatMyBack.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPatMyBack())));
			            player.appendChild(PatMyBack);
			            
			            Element Expressive = document.createElement("Expressive");
			            Expressive.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getExpressive())));
			            player.appendChild(Expressive);
			            
			            Element Unpredictable = document.createElement("Unpredictable");
			            Unpredictable.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getUnpredictable())));
			            player.appendChild(Unpredictable);
			            
			            Element LaidBack = document.createElement("LaidBack");
			            LaidBack.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getLaidBack())));
			            player.appendChild(LaidBack);
			            
			            // Inside Scoring
			            Element Acrobat = document.createElement("Acrobat");
			            Acrobat.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getAcrobat())));
			            player.appendChild(Acrobat);
			            
			            Element TearDropper = document.createElement("TearDropper");
			            TearDropper.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getTearDropper())));
			            player.appendChild(TearDropper);
			            
			            Element PutbackKing = document.createElement("PutbackKing");
			            PutbackKing.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPutbackKing())));
			            player.appendChild(PutbackKing);
			            
			            Element PickAndRoller = document.createElement("PickAndRoller");
			            PickAndRoller.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPickAndRoller())));
			            player.appendChild(PickAndRoller);
			            
			            Element RelentlessFinisher = document.createElement("RelentlessFinisher");
			            RelentlessFinisher.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getRelentlessFinisher())));
			            player.appendChild(RelentlessFinisher);
			            
			            Element PostSpinTechnician = document.createElement("PostSpinTechnician");
			            PostSpinTechnician.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPostSpinTechnician())));
			            player.appendChild(PostSpinTechnician);
			            
			            Element DropStepper = document.createElement("DropStepper");
			            DropStepper.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDropStepper())));
			            player.appendChild(DropStepper);
			            
			            Element UpAndUnderSpecialist = document.createElement("UpAndUnderSpecialist");
			            UpAndUnderSpecialist.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getUpAndUnderSpecialist())));
			            player.appendChild(UpAndUnderSpecialist);
			            
			            // Outside Scoring
			            Element CornerSpecialist = document.createElement("CornerSpecialist");
			            CornerSpecialist.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getCornerSpecialist())));
			            player.appendChild(CornerSpecialist);
			            
			            Element MidRangeDeadeye = document.createElement("MidRangeDeadeye");
			            MidRangeDeadeye.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getMidRangeDeadeye())));
			            player.appendChild(MidRangeDeadeye);
			            
			            Element DeepRangeDeadeye = document.createElement("DeepRangeDeadeye");
			            DeepRangeDeadeye.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDeepRangeDeadeye())));
			            player.appendChild(DeepRangeDeadeye);
			            
			            Element LimitlessRange = document.createElement("LimitlessRange");
			            LimitlessRange.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getLimitlessRange())));
			            player.appendChild(LimitlessRange);
			            
			            Element DifficultShots = document.createElement("DifficultShots");
			            DifficultShots.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDifficultShots())));
			            player.appendChild(DifficultShots);
			            
			            Element PickAndPopper = document.createElement("PickAndPopper");
			            PickAndPopper.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPickAndPopper())));
			            player.appendChild(PickAndPopper);
			            
			            Element TirelessScorer = document.createElement("TirelessScorer");
			            TirelessScorer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getTirelessScorer())));
			            player.appendChild(TirelessScorer);
			            
			            Element CatchAndShoot = document.createElement("CatchAndShoot");
			            CatchAndShoot.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getCatchAndShoot())));
			            player.appendChild(CatchAndShoot);
			            
			            // Playmaking
			            Element AnkleBreaker = document.createElement("AnkleBreaker");
			            AnkleBreaker.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getAnkleBreaker())));
			            player.appendChild(AnkleBreaker);
			            
			            Element FlashyPasser = document.createElement("FlashyPasser");
			            FlashyPasser.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getFlashyPasser())));
			            player.appendChild(FlashyPasser);
			            
			            Element BreakStarter = document.createElement("BreakStarter");
			            BreakStarter.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getBreakStarter())));
			            player.appendChild(BreakStarter);
			            
			            Element PickAndRollMaestro = document.createElement("PickAndRollMaestro");
			            PickAndRollMaestro.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPickAndRollMaestro())));
			            player.appendChild(PickAndRollMaestro);
			            
			            Element LobCityPasser = document.createElement("LobCityPasser");
			            LobCityPasser.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getLobCityPasser())));
			            player.appendChild(LobCityPasser);
			            
			            Element Dimer = document.createElement("Dimer");
			            Dimer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDimer())));
			            player.appendChild(Dimer);
			            
			            // Defending
			            Element DefensiveStopper = document.createElement("DefensiveStopper");
			            DefensiveStopper.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getDefensiveStopper())));
			            player.appendChild(DefensiveStopper);
			            
			            Element ChargeCard = document.createElement("ChargeCard");
			            ChargeCard.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getChargeCard())));
			            player.appendChild(ChargeCard);
			            
			            Element PickDodger = document.createElement("PickDodger");
			            PickDodger.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPickDodger())));
			            player.appendChild(PickDodger);
			            
			            Element PickPocket = document.createElement("PickPocket");
			            PickPocket.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPickPocket())));
			            player.appendChild(PickPocket);
			            
			            Element RimProtector = document.createElement("RimProtector");
			            RimProtector.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getRimProtector())));
			            player.appendChild(RimProtector);
			            
			            Element ChaseDownArtist = document.createElement("ChaseDownArtist");
			            ChaseDownArtist.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getChaseDownArtist())));
			            player.appendChild(ChaseDownArtist);

			            // Athleticism
			            Element LobCityFinisher = document.createElement("LobCityFinisher");
			            LobCityFinisher.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getLobCityFinisher())));
			            player.appendChild(LobCityFinisher);
			            
			            Element Posterizer = document.createElement("Posterizer");
			            Posterizer.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getPosterizer())));
			            player.appendChild(Posterizer);
			            
			            Element Bruiser = document.createElement("Bruiser");
			            Bruiser.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getBruiser())));
			            player.appendChild(Bruiser);
			            
			            Element BrickWall = document.createElement("BrickWall");
			            BrickWall.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getBrickWall())));
			            player.appendChild(BrickWall);
			            
			            Element OneManFastBreak = document.createElement("OneManFastBreak");
			            OneManFastBreak.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getOneManFastBreak())));
			            player.appendChild(OneManFastBreak);
			            
			            // Rebounding
			            Element HustleRebounder = document.createElement("HustleRebounder");
			            HustleRebounder.appendChild(document.createTextNode(Boolean.toString(playerList.get(i).getHustleRebounder())));
			            player.appendChild(HustleRebounder);
		            }
		            
		            
		            // Creating the xml file
		            //transform the DOM Object to an XML File
		            TransformerFactory transformerFactory = TransformerFactory.newInstance();
		            Transformer transformer = transformerFactory.newTransformer();
		            DOMSource domSource = new DOMSource(document);
		            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
		            
		            
		            transformer.transform(domSource, streamResult);
		            
		            System.out.println("Done creating XML File");
		            
			 } catch (ParserConfigurationException pce) {
		            pce.printStackTrace();
		        } catch (TransformerException tfe) {
		            tfe.printStackTrace();
		        }
		}
}