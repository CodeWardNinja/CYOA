
/**
 *Program Name: CYOA
 *Author: Matthew Ward 0689107
 *Purpose: To create a viable Choose Your Own Adventure game.
 *Date Started: Sep 30, 2013
 */
import java.util.Scanner;
public class CYOA
{

	public static void main(String[] args)
	{
		//Creating Scanner.
		Scanner input = new Scanner(System.in);

		//Variables
		String lights;
		boolean light;
		String takeCheck;
		boolean vibroblade;
		boolean blaster;
		boolean medpac;
		boolean leftRoom1;
		boolean playAgain = false;
	 
	do{
		//Story Start - Lights/playAgain Loop
		System.out.println("*****Star Wars Choose Your Own Adventure*****\n\n");
		
		do{
			System.out.println("You are in a dark room and can't see a thing, but all you can hear muffled screams of agony and the sound of blaster fire.\n"
					+ "What would you like to do?");
			lights = input.nextLine().toLowerCase();
		
		
			switch (lights)
				{
				case "turn on light":
				case "turn on lights":
				case "turn lights":
				case "lights":
				case "light":
					light = true;
					System.out.println("Sweet deal, you can actually see now. It takes a moment for your eyes to adjust to the light, but when they do, you see the familiar\n"
							+ "surroundings of your room aboard the Endeavor, a cruiser class starship. Your desk is cluttered with papers and a medpac randomly sticking out the bottom drawer.\n"
							+ "Loosely slung across the back of the chair is your blaster, and in the corner propped up is your vibroblade.\n"
							+ "Beside you on your nightstand is a picture of Mom, Dad and you at the Ruins of the Jedi Temple on Coruscant.\n"
							+ "To your left is the door out to the hallways.");
					break;
		
				case "sleep":
					System.out.println("I don't think this is the time for that..");
					light = false;
					break;
		
				default:
					light = false;
					System.out.println("Don't you think you should turn on the lights first?\n");
					break;
		
				}
			}while (light == false);
		
		//Pick up weapons or leave room
		System.out.println("What would you like to do?");
		takeCheck = input.nextLine().toLowerCase();
		
		switch (takeCheck)
			{
			case "take blaster":
			case "pick up blaster":
			case "pickup blaster":
				System.out.println("You take your blaster.");
				blaster = true;
				vibroblade = false;
				medpac = false;
				leftRoom1 = false;
				break;
			
			case "take vibroblade":
			case "pickup vibroblade":
			case "pick up vibroblade":
				System.out.println("You take your vibroblade.");
				vibroblade = true;
				blaster = false;
				medpac = false;
				leftRoom1 = false;
				break;
			
			case "take medpac":
			case "pickup medpac":
			case "pick up medpac":
				System.out.println("You take the medpac.");
				medpac = true;
				blaster = false;
				vibroblade = false;
				leftRoom1 = false;
				break;
				
			case "take all":
			case "take everything":
				System.out.println("You pick up your blaster, vibroblade and medpac.");
				medpac = true;
				blaster = true;
				vibroblade = true;
				leftRoom1 = false;
				break;
			
			case "exit room":
			case "leave":
			case "leave room":
			case "open door":
			case "find door":
				System.out.println("You walk up to the door unlock it and brace for what's next...");
				leftRoom1 = true;
				blaster = false;
				vibroblade = false;
				medpac = false;
				break;
			
			case "sleep":
				System.out.println("I don't think this is the time for that..");
				blaster = false;
				vibroblade = false;
				medpac = false;
				leftRoom1 = false;
				break;
			
			default:
				System.out.println("Sorry, I didn't quite get that...");
				leftRoom1 = false;
				blaster = false;
				vibroblade = false;
				medpac = false;
				break;
			}
		
		while (leftRoom1 == false)
			{
			System.out.println("Is there anything else you need?");
			takeCheck = input.nextLine().toLowerCase();
				
				switch (takeCheck)
				{
				case "take blaster":
				case "pick up blaster":
				case "pickup blaster":
					if (blaster == false)
					{
					System.out.println("You take your blaster.");
					blaster = true;
					leftRoom1 = false;
					break;
					}
					else 
					{
					System.out.println("You already have your blaster.");
					leftRoom1 = false;
					break;
					}
					
				case "take vibroblade":
				case "pickup vibroblade":
				case "pick up vibroblade":
					if (vibroblade == false)
					{
					System.out.println("You take your vibroblade.");
					vibroblade = true;
					leftRoom1 = false;
					break;
					}
					else
					{
					System.out.println("You already have your vibroblade.");
					break;
					}
					
				case "take medpac":
				case "pickup medpac":
				case "pick up medpac":
					if (medpac == false)
					{
					System.out.println("You take the medpac.");
					medpac = true;
					leftRoom1 = false;
					break;
					}
					else
					{
					System.out.println("You already have your medpac.");
					leftRoom1 = false;
					break;
					}
					
				case "sleep":
					System.out.println("I don't think this is the time for that..");
					leftRoom1 = false;
					break;
					
				case "exit room":
				case "leave":
				case "leave room":
				case "use door":
				case "open door":
				case "find door":
				case "no":
					System.out.println("You walk up to the door unlock it and brace for what's next...");
					leftRoom1 = true;
					break;
					
				case "take all":
				case "take everything":
						if (blaster == false)
						{
							System.out.println("You take your blaster.");
							blaster = true;
						}
						if (medpac == false)
						{
							System.out.println("You take the medpac.");
							medpac = true;
						}
						if (vibroblade == false)
						{
							System.out.println("You pick up your vibroblade.");
							vibroblade = true;
						}
						break;
					
					
					default:
						System.out.println("Sorry, I didn't quite get that...");
						leftRoom1 = false;
						break;
				}//End switch
			}//End loop
			
		//Hallway Variables.
		short lightSidePts = 0;
		short darkSidePts = 0;
		String hallChoice;
		boolean leftHall = false;
		boolean deadMan = false;
		boolean escapePods = false;
		boolean bridge = false;
		String escapePodDo;
		boolean podRoomDestroy = false;
		String loopGame;
		
		
		//After leaving our room, we move into the hallway
		System.out.println("You enter the hallway, bodies are strewn about, still smoldering from the death squads' blaster fire who just stormed\n"
				+ "through here. Luckily for you, they probably thought your room belonged to one of these poor souls. In the corner lies an ally soldier, \n"
				+ "still alive, but hurt badly. The hallway goes left to the escape pods or right to the bridge.");
		hallChoice = input.nextLine().toLowerCase();
		
			switch (hallChoice)
			{
			case "kill him":
			case "kill soldier":
			case "shoot soldier":
			case "shoot him":
				if (blaster == true)
				{
					darkSidePts += 100;
					System.out.println("You pull out your blaster and shoot the soldier in the head. Hope he didn't have anything important to say,but at least \n"
					+ "he's suffering anymore. +100 Dark Points");
					leftHall = false;
					deadMan = true;
					break;
				}
			else 
				{
				System.out.println("You go to draw you blaster, but realize that you left it in your room, the soldier realizes your ill intent and with his \n"
						+ "last breath, he shoots you instead. \n\n"
						+ "Game over... Play again?");
				deadMan = false;
				loopGame = input.nextLine().toLowerCase();
				switch (loopGame)
					{
					case "yes":
					case "y":
					playAgain = true;
					leftHall = true;
					break;
					
					case "no":
					case "n":
					System.out.println("Thanks for playing :)");
					System.exit(0);
					break;
					}
				}break;
			
			case "give medpac":
			case "use medpac":
			case "heal soldier":
			case "heal him":
			if (medpac == true)
				{
				lightSidePts += 50;
				System.out.println("The soldier thanks you for saving his life, another moment and he would have been dead. Introducing himself as Lieutenant \n"
					+ "Kwintal of Havoc Squad, and continues to explain that the Imperial death squad was headed towards the bridge to assassinate \n"
					+ "the Jedi Master aboard. He urges you to follow and help him defend the ship. +50 Light Points");
				deadMan = false;
				leftHall = false;
				break;
				}
			else
				{
				System.out.println("You do not have a medpac to use. Unfortunately, the soldier dies in front of you along with any chance of intel or help.");
				deadMan = true;
				leftHall = false;
				break;
				}

			case "left":
			case "go left":
			case "escape pods":
				System.out.println("You ignore the soldier and just head towards the escape pods, hoping and praying there's still one left...");
				escapePods = true;
				deadMan = true;
				bridge = false;
				leftHall = true;
				break;
		
			case "bridge":
			case "go right":
			case "right":
				System.out.println("You head towards the bridge leaving the soldier to his fate, hopefully hopefully ready for what awaits...");
				escapePods = false;
				deadMan = true;
				bridge = true;
				leftHall = true;
				break;
		
			default:
				System.out.println("I didn't get what you wanted to do, and in your blunder... The soldier dies.");
				bridge = false;
				escapePods = false;
				leftHall = false;
				deadMan = true;
				break;
			
				
			
			}//End switch
		
		while (leftHall == false)
			{
			System.out.println("Which way would you like to go?");
			hallChoice = input.nextLine().toLowerCase();
						
			switch (hallChoice)
				{
				case "left":
				case "go left":
				case "escape pods":
					System.out.println("You head towards the escape pods, hoping and praying there's still one left...");
					escapePods = true;
					bridge = false;
					leftHall = true;
					break;
			
				case "bridge":
				case "follow":
				case "go right":
				case "right":
					System.out.println("You head towards the bridge, hopefully ready for what awaits...");
					escapePods = false;
					bridge = true;
					leftHall = true;
					break;
			
				default:
					System.out.println("I didn't get which way you wanted to go...");
					bridge = false;
					escapePods = false;
					leftHall = false;
					break;
		
				}//End Switch
			}//End loop
		
		
		//Escape pod variables
		String noYes = "";
		String leave;
		boolean podLoop1 = true;
		
		//Determining Direction.
		if (escapePods == true)
			{
			System.out.println("Jamming the panel to open the door, you're confronted by 2 \n"
					+ "Imperial Soldiers who look at you in bewilderment, but quickly draw their weapons.");
			escapePodDo = input.nextLine().toLowerCase();
			
			switch (escapePodDo)
				{
				case "shoot":
				case "shoot imp scum":
				case "shoot them":
				case "kill them":
				case "kill soldiers":
				if (blaster == true && vibroblade == false)
				{
					if (bridge == false)
					{
					System.out.println("I'm not sure if you have amazing karma or just luckier than a tauntaun's left big toe, but after several \n"
						+ "random shots, you manage to kill the imp scum in the room. Your luck weighs heavy again when you see a lonely unlaunched \n"
						+ "escape pod just beckoning you from the other side of the room. \nDo you enter the escape pod?");
					noYes = input.nextLine().toLowerCase();
					}
					break;
				}
				
				else if (blaster == false && vibroblade == true)
					{
					System.out.println("Unfortunately, now would be a great time to have your blaster. You rush the room and manage to kill one, but the other\n"
							+ "opens fire, making more holes in you than swiss cheese...\n\n"
							+ "Game Over... Play again?");
					loopGame = input.nextLine().toLowerCase();
					switch (loopGame)
						{
						case "yes":
						case "y":
							playAgain = true;
							break;
						
						case "no":
						case "n":
							System.out.println("\nThanks for playing :)");
							System.exit(0);
							break;
						}
					}
				else if (blaster == false && vibroblade == false)
					{
					System.out.println("You rush into the room, punching the closest soldier in the face. He just laughs as his buddy sticks a thermal detonator\n"
							+ "to your back, just out of reach... You go running down the hall franticly trying to remove the explosive. It's too late, the walls\n"
							+ "now share the same color red as your insides...\n\n"
							+ "Game Over... Play again?");
					loopGame = input.nextLine().toLowerCase();
					switch (loopGame)
						{
						case "yes":
						case "y":
							playAgain = true;
							break;
						
						case "no":
						case "n":
							System.out.println("\nThanks for playing :)");
							System.exit(0);
							break;
						}break;
					}
				
				if (noYes.equalsIgnoreCase("yes") )
					{
					System.out.println("You hastily climb into the escape pod, just then, you hear more Imperial soldiers rushing towards you, alerted by the sound\n"
							+ "of blaster fire. Five Imperial soldiers storm the room quickly, taking aim and shout, 'Step Out Of The Pod And surrender!' One firing a \n"
							+ "warning shot right above your head. What to do, what to do...");
					if (deadMan == false)
						{
						String shootInq;
						System.out.println("From around the corner, blaster fire drops two soldiers before you or his buddies know what happened. You go to grab your \n"
								+ "blaster just as you see two more go down, it's Lieutenant Kwintal! Probably glad you saved him now... The last soldier spins around \n"
								+ "ready to fire on Kwintal as he's reloading. Think fast... Dip out or shoot?");
							
						shootInq = input.nextLine().toLowerCase();
							
						switch (shootInq)
							{
							case "shoot":
							case "shoot soldier":
							case "shoot him":
								if (blaster == true)
									{
									System.out.println("You fire at the Imperial soldier, nailing him square in the back of the head. Kwintal gives you a quick salute \n"
											+ "and quick nod towards the bridge. What next? +50 Light Side Points.");
									lightSidePts += 50;
									leave = input.nextLine().toLowerCase();
									do 
									{
									switch(leave)
										{
										case "leave":
										case "dip":
										case "use pod":
										case "escape":
											System.out.println("Without much of a thought you hit the launch button. The outer hatch closes as you hear the hiss of the vacuum \n"
												+ "sealing the door. The computer started counting down the launch '5', '4', '3', '2'... '1!' You feel your guts enter your \n"
												+ "throat as the pod is fired out of the ship. Looking out the window, you see the Imperial and Republic fleets and fighters \n"
												+ "all zooming around. Unfortunately for you, an Imperial tie-fighter has spotted your escape pod and starts firing, but keeps \n"
												+ "missing. At the mercy of the fighter and no way of fighting back, you close your eyes and wait for the inevitability. \n\n"
												+ "BBBBB     OOOOO     OOOOO   MMM    MMM\n"
												+ "BB  BB   OOO OOO   OOO OOO  MMMM  MMMM\n"
												+ "BBBBB    OOO OOO   OOO OOO  MM MMMM MM\n"
												+ "BB  BB   OOO OOO   OOO OOO  MM  MM  MM\n"
												+ "BBBBB     OOOOO     OOOOO   MM      MM\n\n"
												+ "Game Over... Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
										
										case "stay":
										case "exit":
										case "exit pod":
										case "leave pod":
										case "follow":
											System.out.println("You climb out of the escape pod and run out into the hallway to join Kwintal.");
											bridge = true;
											podLoop1 = false;
											break;
										
										default:
											System.out.println("Sorry, I don't understand what you want to do..");
											podLoop1 = true;
											break;
										}break;//End inner-switch
									}while (podLoop1 == true);	
									}
								else if (blaster == false)
									{
									System.out.println("As you fumble for your blaster, you realize you left it back in your room... Kwintal is shot down with multiple\n"
											+ "hits to the chest. Quickly turning on you, the enemy fires and puts your lights out for good...\n\n"
											+ "Game Over... Play again?");
									loopGame = input.nextLine().toLowerCase();
									switch (loopGame)
										{
										case "yes":
										case "y":
											playAgain = true;
											break;
										
										case "no":
										case "n":
											System.out.println("Thanks for playing :)");
											System.exit(0);
											break;
										}break;
									}break;//End blaster inner if
																
								case "leave":
								case "dip":
								case "use pod":
								case "escape":
									System.out.println("Without much of a thought you hit the launch button. The outer hatch closes as you hear the hiss of the vacuum \n"
										+ "sealing the door. The computer started counting down the launch '5', '4', '3', '2'... '1!' You feel your guts enter your \n"
										+ "throat as the pod is fired out of the ship. Looking out the window, you see the Imperial and Republic fleets and fighters \n"
										+ "all zooming around. Unfortunately for you, an Imperial tie-fighter has spotted your escape pod and starts firing, but keeps \n"
										+ "missing. At the mercy of the fighter and no way of fighting back, you close your eyes and wait for the inevitability. \n\n"
										+ "BBBBB     OOOOO     OOOOO   MMM    MMM\n"
										+ "BB  BB   OOO OOO   OOO OOO  MMMM  MMMM\n"
										+ "BBBBB    OOO OOO   OOO OOO  MM MMMM MM\n"
										+ "BB  BB   OOO OOO   OOO OOO  MM  MM  MM\n"
										+ "BBBBB     OOOOO     OOOOO   MM      MM\n\n"
										+ "Game Over...Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
								
								default:
									System.out.println("Sorry, I don't understand what you want to do..");
									podLoop1 = true;
									break;
																		
							}//End shootInq switch
						}//End deadMan false-if
					if (deadMan == true)
						{
						System.out.println("With death staring you in the face, it comes down to the good old 'fight or flight'... Do you think you can take these\n"
								+ "guys on? Take your pick: fight or flight...");
						String fightFlight = input.nextLine().toLowerCase();
						
						switch (fightFlight)
							{
							case "fight":
							if (blaster == true)
								{
								System.out.println("You draw you blaster, but don't stand a chance as they open fire. They leave you a mangled corpse on the verge of escape.\n\n"
										+ "Game Over..."
										+ "Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
								}
							else if (blaster == false && vibroblade == true)
								{
								System.out.println("You jump out of the escape pod, dodging the first wave of shots. Swinging with amazing grace and nimblness, you take\n"
										+ "down the first soldier. With a quick duck and spin, you mangage to drop another, but your luck quickly runs out when you look up \n"
										+ "to the barrel of a rifle at your face... Unfortunately, that's the last thing you see.\n\n"
										+ "Game over....Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
								}
							else 
								{
								System.out.println("You don't have any weapons, but OK... No sooner do you climb out of the escape pod, you catch a blaster bolt to the face\n"
										+ "ending it all.. Who the hell doesn't even bring a vibroblade, let alone a blaster, to a gun fight? At least get some means of defense..\n\n"
										+ "Game over...Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
								}
							
							
							case "flight":
								System.out.println("You go to jam the launch button, but as you do, the soldiers open fire. You manage to get the pod launched with your head\n"
									+ "still attached, but just as your pod clears the ship, an explosion rips through the side of your pod. All the air and contents of the\n"
									+ "pod are sucked out into the vastness of space. One of the damn Imps stuck you with a thermal detonator...\n\n"
									+ "Game over...Play again?");
											loopGame = input.nextLine().toLowerCase();
											switch (loopGame)
											{
											case "yes":
											case "y":
												playAgain = true;
												break;
											
											case "no":
											case "n":
												System.out.println("\nThanks for playing :)");
												System.exit(0);
												break;
											}break;
							
							default:
								System.out.println("Please select 'fight' or 'flight'...");
								break;
							
							}//End fightFlight switch
						}//End deadMan true-if
					}//End Yes if enter pod	
					
				if (noYes.equalsIgnoreCase("no"))
					{
						System.out.println("With the escape pod just taunting you, you resist jumping in. For good reason to, just then the escape pod and surrounding\n"
								+ "wall are torn away with a spectacular explosion. The ships emergency systems kick in and the door closes in front of you. Sealing off\n"
								+ "the escape pod room. I guess there's only one place to go now...");
						podRoomDestroy = true;
						bridge = true;
					}
				}//End escapePodDo switch
			}//End escapePods true/false if
		
		
		//
		//
		//
		//Bridge Start.
		////
		///
		//
		////
		//BridgeVariables
		
		String choice;
		boolean fight;
		boolean ship;
		boolean jedi = false;
		boolean sith = false;
		boolean lightsaber = false;
		boolean badDataFlag = false;
		////
		if (bridge == true)
			{
			if (deadMan == false)
				{
				System.out.println("The lights are a blur as you both race down the hallway. With your hearts racing in anticipation as you reach the door, you \n"
												+ "try to catch your breath. The door slowly opens and you see mahyem everywhere, bodies lie about still smoldering, some still \n"
												+ "alive and screaming. At the other end of the bridge the Jedi fights an unknown assailant with a red lightsaber.");
				}
			else if (deadMan == true)
				{
				System.out.println("You slowly make you're way down the hallway, and reach the bridge door. Tucking in the corner, you hit the button to open \n"
													+ "the door. Taking a quick look, there only stand two figures on the catwalk viewing platform, locked in combat with what \n"
													+ "appear to be lightsabers!");
				}
			
			
			System.out.println("\nYou rush into the room and are faced with a decision. Join the fight or take the helm of the ship and keep it from crashing..");
			choice = input.nextLine().toLowerCase();
			switch (choice)
			{
			case "join fight":
			case "join the fight":
			case "fight":
				fight = true;
				ship = false;
				break;
				
			case "take helm":
			case "fly ship":
			case "save ship":
				fight = false;
				ship = true;
				break;
				
				default:
					fight = false;
					ship = false;
					break;
			}//End Switch
			
			
			while (fight == false && ship == false)
			{
				System.out.println("Sorry, would you like to join the fight or take the helm?");
				choice = input.nextLine().toLowerCase();
				switch (choice)
				{
				case "join fight":
				case "join the fight":
				case "fight":
					fight = true;
					ship = false;
					break;
					
				case "take helm":
				case "take the helm":
				case "fly ship":
				case "save ship":
					fight = false;
					ship = true;
					break;
					
					default:
						fight = false;
						ship = false;
						break;
				}//End Switch
			}//End while
			
			if (fight == true)
			{
				
			 if (deadMan == false)
			 {
				System.out.println("You and Kwintal jump into the fight, just as the Sith knocks the Jedi's lightsaber out of his hand. Kwintal runs for the \n"
													+ "lightsaber as the Sith knocks out the Jedi with devastating arcs of lightning from his hand.");
				if (blaster == true)
				{
					if (vibroblade == true)
					{
						System.out.println("Do you want to keep shooting or use your vibroblade?");
						choice = input.nextLine().toLowerCase();
						switch (choice)
						{
						case "shoot":
						case "keep firing":
						case "keep shooting":
							System.out.println("You keep firing at the Sith Lord, but he keeps deflecting the shots as he slowly makes his way towards you. He simply \n"
																+ "lifts his hand and suddenly you can't move a muscle. With his other hand he fires another bolt of lightning at \n"
																+ "Kwintal, now it's just you and him. With unseen force he rips the blaster out of your hand and releases the invisible \n"
																+ "hold on you. He draws a breath a says, 'I can feel the power in you boy, join my side and we'll rule the universe \n"
																+ "as Master and Apprentice'.");
							blaster = false;
							System.out.println("Do you accept his offer?");
							noYes = input.nextLine().toLowerCase();
							switch(noYes)
							{
							case "yes":
							case "y":
								System.out.println("Bowing before the Sith lord, you renounce everything that was ever good in your life and submit to the power of the \n"
																	+ "Dark Side. Hence forth, you will be known as Lord Morrdeth, the destroyer of worlds! To remove any doubt and \n"
																	+ "prove yourself in your new master's eyes, you walk over and pickup the fallen Jedi's lightsaber just as he regains \n"
																	+ "conciousness. With one quick slash, the Jedi's head rolls across the ground before he even knew what was happening.\n"
																	+ "(+250 Dark Side Points)");
								darkSidePts += 250;
								sith = true;
								jedi = false;
								break;
								
							case "no":
							case "n":
								System.out.println("Ignoring his offer, you quietly kneel before the Sith Lord to await your fate, when notice the Jedi's lightsaber just \n"
																	+ "a few feet away. Leaping toward the lightsaber, the Jedi slowly regains conciousness and climbs to his feet. You grab\n"
																	+ "the lightsaber and toss it to the Jedi. Quickly gaining ground the Jedi joins you in the assault on the Sith Lord. \n"
																	+ "With the grace of a Twi'lek dancer and the furocity of a Rancor, you and the Jedi are emerged in a flurry of red, \n"
																	+ "blue, and the silver of your own vibroblade, until at last the Sith Lord is defeated. 'We should take him to Coruscant.'\n"
																	+ "says the Jedi... Do you let him live?");
								String yesNo;
								yesNo = input.nextLine().toLowerCase();
								switch(yesNo)
								{
								case "yes":
								case "y":
									System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
									sith = true;
									jedi = true;
									lightSidePts += 100;
									break;
									
								case "no":
								case "n":
								case "kill him":
									System.out.println("You walk up and shove your vibroblade through the Sith Lords chest and watch as he chokes on his own blood.\n"
																		+ "(+100 Dark Side Points");
									jedi = true;
									sith = false;
									lightsaber = true;
									darkSidePts += 100;
									break;
									
									default:
										System.out.println("I'm sorry, I didn't understand...");
										badDataFlag = true;
										break;
								}//End yesNoSwitch
								
								while(badDataFlag == true)
								{
									System.out.println("Do you let the Sith Lord live?");
									yesNo = input.nextLine().toLowerCase();
									switch(yesNo)
									{
									case "yes":
									case "y":
										System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
										sith = true;
										jedi = true;
										badDataFlag = false;
										lightSidePts += 100;
										break;
										
									case "no":
									case "n":
									case "kill him":
										System.out.println("You walk up and shove your vibroblade through the Sith Lords chest and watch as he chokes on his own blood.\n"
																			+ "(+100 Dark Side Points");
										jedi = true;
										sith = false;
										lightsaber = true;
										badDataFlag = false;
										darkSidePts += 100;
										break;
										
										default:
											System.out.println("I'm sorry, I didn't understand...");
											badDataFlag = true;
											break;
									}//End yesNoSwitch	
								}//End badDataFlag check
								
							}//end noYes switch
							break;
							
						case "use vibroblade":
						case "use sword":
							System.out.println("The Sith lord casts you aside like a gnat with the force and lifts Kwintal up, slowly choking the life out of him. \n"
																+ "As Kwintal falls into a lifeless heap and you regain your senses, the Sith slowly makes his way over to you. With \n"
																+ "a malicious grin spread across his face, he grabs you by the throat and lifts you off your feet. 'Join my side or \n"
																+ "die, boy'... Do you accept his offer?");
							deadMan = true;
							String yesNo = input.nextLine().toLowerCase();
							if (yesNo.equals("yes"))
							{
								System.out.println("Through your gasping and grunting, you manage to say that you'll join him in his quest for universal dominance.");
								sith = true;
								jedi = false;
								badDataFlag = false;
							}
							else if (yesNo.equals("no"))
							{
								System.out.println("You spit in his face, and as a result he snaps your neck... Game Over.. Play Again?");
								loopGame = input.nextLine().toLowerCase();
								badDataFlag = false;
								switch (loopGame)
								{
								case "yes":
								case "y":
									playAgain = true;
									break;
								
								case "no":
								case "n":
									System.out.println("\nThanks for playing :)");
									System.exit(0);
									break;
									
								default: 
									System.out.println("Sorry, I didn't quite get that...");
									badDataFlag = true;
								break;
								}
								
								while (badDataFlag == true)
								{
									System.out.println("Did you want to play again?");
									loopGame = input.nextLine().toLowerCase();
									badDataFlag = false;
									switch (loopGame)
									{
									case "yes":
									case "y":
										playAgain = true;
										break;
									
									case "no":
									case "n":
										System.out.println("\nThanks for playing :)");
										System.exit(0);
										break;
										
									default: 
										System.out.println("Sorry, I didn't quite get that...");
										badDataFlag = true;
									break;
									}
								}//End while loop
							}
							break;
							
						default:
							System.out.println("Sorry, I didn't understand...");
							badDataFlag = true;
							break;
								
						}//End blaster||vibroblade atk
						
						while (badDataFlag == true)
						{
							System.out.println("Do you want to keep shooting or use your vibroblade?");
							choice = input.nextLine().toLowerCase();
							switch (choice)
							{
							case "shoot":
							case "keep firing":
							case "keep shooting":
								System.out.println("You keep firing at the Sith Lord, but he keeps deflecting the shots as he slowly makes his way towards you. He simply \n"
																	+ "lifts his hand and suddenly you can't move a muscle. With his other hand he fires another bolt of lightning at \n"
																	+ "Kwintal, now it's just you and him. With unseen force he rips the blaster out of your hand and releases the invisible \n"
																	+ "hold on you. He draws a breath a says, 'I can feel the power in you boy, join my side and we'll rule the universe \n"
																	+ "as Master and Apprentice'.");
								blaster = false;
								System.out.println("Do you accept his offer?");
								noYes = input.nextLine().toLowerCase();
								switch(noYes)
								{
								case "yes":
								case "y":
									System.out.println("Bowing before the Sith lord, you renounce everything that was ever good in your life and submit to the power of the \n"
																		+ "Dark Side. Hence forth, you will be known as Lord Morrdeth, the destroyer of worlds! To remove any doubt and \n"
																		+ "prove yourself in your new master's eyes, you walk over and pickup the fallen Jedi's lightsaber just as he regains \n"
																		+ "conciousness. With one quick slash, the Jedi's head rolls across the ground before he even knew what was happening.\n"
																		+ "(+250 Dark Side Points)");
									darkSidePts += 250;
									lightsaber = true;
									sith = true;
									jedi = false;
									break;
									
								case "no":
								case "n":
									System.out.println("Ignoring his offer, you quietly kneel before the Sith Lord to await your fate, when notice the Jedi's lightsaber just \n"
																		+ "a few feet away. Leaping toward the lightsaber, the Jedi slowly regains conciousness and climbs to his feet. You grab\n"
																		+ "the lightsaber and toss it to the Jedi. Quickly gaining ground the Jedi joins you in the assault on the Sith Lord. \n"
																		+ "With the grace of a Twi'lek dancer and the furocity of a Rancor, you and the Jedi are emerged in a flurry of red, \n"
																		+ "blue, and the silver of your own vibroblade, until at last the Sith Lord is defeated. 'We should take him to Coruscant.'\n"
																		+ "says the Jedi... Do you let him live?");
									String yesNo;
									yesNo = input.nextLine().toLowerCase();
									switch(yesNo)
									{
									case "yes":
									case "y":
										System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
										sith = true;
										jedi = true;
										lightSidePts += 100;
										break;
										
									case "no":
									case "n":
									case "kill him":
										System.out.println("You walk up and shove your vibroblade through the Sith Lords chest and watch as he chokes on his own blood.\n"
																			+ "(+100 Dark Side Points)");
										jedi = true;
										sith = false;
										darkSidePts += 100;
										break;
										
										default:
											System.out.println("I'm sorry, I didn't understand...");
											badDataFlag = true;
											break;
									}//End yesNoSwitch
									
									while(badDataFlag == true)
									{
										System.out.println("Do you let the Sith Lord live?");
										yesNo = input.nextLine().toLowerCase();
										switch(yesNo)
										{
										case "yes":
										case "y":
											System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
											sith = true;
											jedi = true;
											badDataFlag = false;
											lightSidePts += 100;
											break;
											
										case "no":
										case "n":
										case "kill him":
											System.out.println("You walk up and shove your vibroblade through the Sith Lords chest and watch as he chokes on his own blood.\n"
																				+ "(+100 Dark Side Points)");
											jedi = true;
											sith = false;
											badDataFlag = false;
											darkSidePts += 100;
											break;
											
											default:
												System.out.println("I'm sorry, I didn't understand...");
												badDataFlag = true;
												break;
										}//End yesNoSwitch	
									}//End badDataFlag check
									
								}//end noYes switch
								break;
								
							case "use vibroblade":
							case "use sword":
								System.out.println("The Sith lord casts you aside like a gnat with the force and lifts Kwintal up, slowly choking the life out of him. \n"
																	+ "As Kwintal falls into a lifeless heap and you regain your senses, the Sith slowly makes his way over to you. With \n"
																	+ "a malicious grin spread across his face, he grabs you by the throat and lifts you off your feet. 'Join my side or \n"
																	+ "die, boy'... Do you accept his offer?");
								deadMan = true;
								String yesNo = input.nextLine().toLowerCase();
								if (yesNo.equals("yes"))
								{
									System.out.println("Through your gasping and grunting, you manage to say that you'll join him in his quest for universal dominance.");
									sith = true;
									jedi = false;
									badDataFlag = false;
								}
								else if (yesNo.equals("no"))
								{
									System.out.println("You spit in his face, and as a result he snaps your neck... Game Over.. Play Again?");
									loopGame = input.nextLine().toLowerCase();
									badDataFlag = false;
									switch (loopGame)
									{
									case "yes":
									case "y":
										playAgain = true;
										break;
									
									case "no":
									case "n":
										System.out.println("\nThanks for playing :)");
										System.exit(0);
										break;
										
									default: 
										System.out.println("Sorry, I didn't quite get that...");
										badDataFlag = true;
									break;
									}
									
									while (badDataFlag == true)
									{
										System.out.println("Did you want to play again?");
										loopGame = input.nextLine().toLowerCase();
										badDataFlag = false;
										switch (loopGame)
										{
										case "yes":
										case "y":
											playAgain = true;
											break;
										
										case "no":
										case "n":
											System.out.println("\nThanks for playing :)");
											System.exit(0);
											break;
											
										default: 
											System.out.println("Sorry, I didn't quite get that...");
											badDataFlag = true;
										break;
										}
									}//End while loop
								}
								break;
								
							default:
								System.out.println("Sorry, I didn't understand...");
								badDataFlag = true;
								break;
									
							}//End blaster||vibroblade atk
						}//End blaster/vibroblade loop 
					}//End vibroblade if
					
					else //(vibroblade == false)
					{
						System.out.println("Do you want to keep shooting, or take the helm of the ship?");
						choice = input.nextLine().toLowerCase();
						switch(choice)
						{
						case "keep shooting":
						case "shoot":
							System.out.println("You keep firing at the Sith Lord, but he keeps deflecting the shots as he slowly makes his way towards you. He simply \n"
									+ "lifts his hand and suddenly you can't move a muscle. With his other hand he fires another bolt of lightning at \n"
									+ "Kwintal, now it's just you and him. With unseen force he rips the blaster out of your hand and releases the invisible \n"
									+ "hold on you. He draws a breath a says, 'I can feel the power in you boy, join my side and we'll rule the universe \n"
									+ "as Master and Apprentice'.");
							blaster = false;
							System.out.println("Do you accept his offer?");
							noYes = input.nextLine().toLowerCase();
							switch(noYes)
							{
							case "yes":
							case "y":
								System.out.println("Bowing before the Sith lord, you renounce everything that was ever good in your life and submit to the power of the \n"
										+ "Dark Side. Hence forth, you will be known as Lord Morrdeth, the destroyer of worlds! To remove any doubt and \n"
										+ "prove yourself in your new master's eyes, you walk over and pickup the fallen Jedi's lightsaber just as he regains \n"
										+ "conciousness. With one quick slash, the Jedi's head rolls across the ground before he even knew what was happening.\n"
										+ "(+250 Dark Side Points)");
								darkSidePts += 250;
								lightsaber = true;
								sith = true;
								jedi = false;
								break;
	
							case "no":
							case "n":
								System.out.println("Ignoring his offer, you quietly kneel before the Sith Lord to await your fate, when notice the Jedi's lightsaber just \n"
										+ "a few feet away. Leaping toward the lightsaber, the Jedi slowly regains conciousness and climbs to his feet. You grab\n"
										+ "the lightsaber and toss it to the Jedi. Quickly gaining ground the Jedi joins you in the assault on the Sith Lord. \n"
										+ "With the grace of a Twi'lek dancer and the furocity of a Rancor, you and the Jedi are emerged in a flurry of red, \n"
										+ "blue, and blaster bolts, until at last the Sith Lord is defeated. 'We should take him to Coruscant.'\n"
										+ "says the Jedi... Do you let him live?");
								String yesNo;
								yesNo = input.nextLine().toLowerCase();
								switch(yesNo)
								{
								case "yes":
								case "y":
									System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
									sith = true;
									jedi = true;
									lightSidePts += 100;
									break;
		
								case "no":
								case "n":
								case "kill him":
									System.out.println("You walk up and shoot the Sith Lord in the face.\n"
											+ "(+100 Dark Side Points)");
									jedi = true;
									sith = false;
									darkSidePts += 100;
									break;
		
								default:
									System.out.println("I'm sorry, I didn't understand...");
									badDataFlag = true;
									break;
								}//End yesNoSwitch
								
	
						while(badDataFlag == true)
						{
							System.out.println("Do you let the Sith Lord live?");
							yesNo = input.nextLine().toLowerCase();
							switch(yesNo)
							{
							case "yes":
							case "y":
								System.out.println("You grab a pair of manacles off a fallen soldier and shackle the Sith. (+100 Light Side Points)");
								sith = true;
								jedi = true;
								badDataFlag = false;
								lightSidePts += 100;
								break;
			
							case "no":
							case "n":
							case "kill him":
								System.out.println("You walk up and shoot the Sith Lord in the face.\n"
												+ "(+100 Dark Side Points)");
								jedi = true;
								sith = false;
								badDataFlag = false;
								darkSidePts += 100;
								break;
				
							default:
								System.out.println("I'm sorry, I didn't understand...");
								badDataFlag = true;
								break;
							}//End yesNoSwitch	
							break;
						}//End badDataFlag check
						break;
	
					}//end noYes switch
							break;	
							
						case "take helm":
						case "fly ship":
							ship = true;
							break;
							
						}//End Blaster/Ship 
					
					}//End vibroblade else
					
				}//End blaster if
				
				
				else //(blaster == false)
				{
					if (vibroblade == true)
					{
						System.out.println("STUB: UNDER CONTRUCTION-> blaster == false, but vibroblade == true");
					}//End if vbrbld == true
					else //if vibroblade == false
					{
						System.out.println("STUB: UNDER CONTRUCTION-> blaster == false && vibroblade false");
					}
				}//End else ( blaster == false)
			
			 }//End deadMan false
			 
			 
			 else//deadMan == true
			 {
				 
			 }//End inner deadMan check
			}//End fight == true
			
			
			////
			///
			//-> Fly ship start
			///
			//
			if (ship == true)
			{
				System.out.println("UNDER CONSTRUCTION");
			}
			
			}//End Bridge-if
		
		
		
		
		
		
		if (jedi == true && sith == false)
		{
			System.out.println("You travel back to Coruscant to await trial for killing the Sith Lord agaist the orders of the Jedi. You have " + lightSidePts +
					" Light Side Points and " + darkSidePts + " Dark Side Points.");
		}
		else if (jedi = true && sith == true)
		{
			System.out.println("Travelling in the company of the Jedi and the Sith Lord, you eagerly await your training on Coruscant to become a jedi.\n"
					+ "You have " + lightSidePts + " Light Side Points and " + darkSidePts + " Dark Side Points.");
		}
		else if (jedi == false && sith == true)
		{
			System.out.println("Travelling in the company of your new master, you wait patiently as you both make your way to Korriban, the Sith training \n"
					+ "world. You have " + lightSidePts + " Light Side Points and " + darkSidePts + " Dark Side Points.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*************************
 **** END OF GAME LOOP ***
 *************************/		
 
		}while (playAgain == true);	
	input.close();
	}//End Main

}//End Class
