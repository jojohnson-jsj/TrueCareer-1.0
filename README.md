# TrueCareer-1.0
Jo Johnson
Fall, 2020
For NBA 2k19

TrueCareer 1.0 is the first iteration of my TrueCareer Project. NBA 2k's MyCareer gamemode can, at times, feel severely limited in functionality. Luckily, the MyLeague gamemode also allows for player creation and many have created custom players and used them through MyLeague instead due to its vastly more powerful customization. However, the downside is that there is less guidance when it comes to upgrading your created player, and it can be hard to keep track of all the attributes and badges across saves. 

TrueCareer attempts to solve these problems. By executing UserInterface.java, you are able to create custom player saves that keep track of every stat and attribute in 2k19. You are able to write this information to xml files that act as backups and that can be later loaded up through UserInterface.java to edit the player, enter played games in order to calculate experience (XP) gained, and uprgade the players.

Depending on the position and game difficulty, a player can earn XP by entering stats for games played in 2k19. These XP points add up to serve as attribute upgrade points that can be used to improve each individual player. Every 5 XP points serves as 1 attribute point, and TrueCareer keeps track of all of it and allows you to directly upgrade the attributes of your saves to direct the status of your 2k19 player.

Not only does the algorithm I've written calculate an appropriate amount of XP based on the player's position, the game difficulty, and the player's in game performance, TrueCareer also serves as a backup of a player's key attributes and badges in case a 2k19 save is corrupted or wiped and you need to transfer your player's progression to a new save.

TrueCareer is an ongoing project, hence the "1.0", but included in this repository are .java files for all 5 NBA positions, InOutXML.java, which handles the reading and writing of player data to local xml files, Game.java, which defines all the statistical elements of an NBA game and is used to calculate experience gained per match, as well as Player.java, PlayerBase.java, and PlayerPosition.java, all files that build up an individual player object. 

In order to use these files, ensure that the file path in InOutXML.java is accurate for your pc and compile and run UserInterface.java.

