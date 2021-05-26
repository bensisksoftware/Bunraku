 import java.util.Arrays;
 
 public class Animation {
	public static int tick;
	public static int waitTime;
	public static int waitCode;
	public static int inputUnderscoreTick = 1;
	public static int delay = -1;
	private static int image;
	private static int endX;
	private static int endY;
	private static int endWidth;
	private static int endHeight;
	public static int fadeRate = 2;
	private static int steps;
	public static int step = 1;
	public static int panSpeed = 33; // 33 default
	public static int reaper1WalkAwayDelay = 60;
	public static int inputScrollMovementSpeed = 20;
	public static int samadhiCheck = 0;
	public static int endSamadhiSequenceDelay = -1;
	public static int eyelidRate = 2; // 2 is good
	
	public static String samadhiSelect = "s1";
	
	public static boolean waiting;
	public static boolean panningLeft;
	public static boolean panningRight;
	public static boolean bloody;
	public static boolean displayingSpace;
	public static boolean chantFadingIn;
	public static boolean chantFadingOut;
	public static boolean rotatingFractal;
	public static boolean movingSymbolIn;
	public static boolean movingSymbolOut;
	public static boolean rewinding;
	public static boolean fastforwarding;
	public static boolean movingStatic;
	public static boolean openingScroll;
	public static boolean movingKiyoshiLeft;
	public static boolean movingKiyoshiRight;
	public static boolean displayingHReaper1;
	public static boolean displayingHReaperUnarmed;
	public static boolean displayingHReaperSword;
	public static boolean displayingHBlade;
	public static boolean movingHReaper;
	public static boolean movingHBlade;
	public static boolean prepEyes;
	public static boolean prepFish;
	public static boolean prepLotus;
	public static boolean prepKnot;
	public static boolean displayingOm;
	public static boolean displayingNi;
	public static boolean displayingGo;
	public static boolean displayingYu;
	public static boolean displayingJi;
	public static boolean displayingRa;
	public static boolean displayingShi;
	public static boolean loweringSymbol;
	public static boolean movingGTVreaper;
	public static boolean movingGTVmonk;
	public static boolean displayingGTVmonkFront;
	public static boolean displayingGTVmonkBack;
	public static boolean displayingGTVmonkDie;
	public static boolean displayingGTVmonkRight;
	public static boolean displayingGTVreaperGun;
	public static boolean displayingGTVreaperLeave;
	public static boolean displayingGTVpaperCranes;
	public static boolean displayingHTapeReaper1;
	public static boolean displayingHTapeReaper2;
	public static boolean displayingHTapeMonk1;
	public static boolean displayingHTapeMonk2;
	public static boolean displayingHTapeDie1;
	public static boolean displayingHTapeDie2;
	public static boolean displayingHTapeDie3;
	public static boolean displayingHTapeDie4;
	public static boolean displayingTVCRmonkLeft;
	public static boolean displayingTVCRmonkRight;
	public static boolean displayingTVCRmonkFront;
	public static boolean displayingTVCRreaperBack;
	public static boolean displayingTVCRreaperLeft;
	public static boolean displayingTVCRbleed1;
	public static boolean displayingTVCRbleed2;
	public static boolean displayingTVCRmonkDie1;
	public static boolean displayingTVCRmonkDie2;
	public static boolean displayingTVCRbase;
	public static boolean movingHTapeReaper1;
	public static boolean movingHTapeReaper2;
	public static boolean movingHTapeMonk1;
	public static boolean movingTVCRmonkLeft;
	public static boolean movingTVCRmonkRight;
	public static boolean movingTVCRreaperLeft;
	public static boolean movingTVCRreaperBack;
	public static boolean openingInputScroll;
	public static boolean extendingInputScroll;
	public static boolean unextendingInputScroll;
	public static boolean closingScroll;
	public static boolean raisingBook;
	public static boolean loweringBook;
	public static boolean loweringTassel;
	public static boolean raisingTassel;
	public static boolean loweringDoll;
	public static boolean raisingDoll;
	public static boolean openingEyes;
	public static boolean closingEyes;
	public static boolean eyesClosed;
	public static boolean slidingShelf;
	public static boolean raDropping;
	public static boolean openingSafe;
	public static boolean openingT5n;
	public static boolean raisingPaperSlip;
	public static boolean loweringPaperSlip;
	public static boolean openingH1n;
	public static boolean movingSpace;
	public static boolean raisingGoldPaper;
	public static boolean loweringGoldPaper;
	public static boolean movingCranes;
	public static boolean openingMessage;
	public static boolean closingMessage;
	public static boolean raisingT48eGate;
	public static boolean raisingPhone;
	public static boolean loweringPhone;
	public static boolean pushingButton;
	public static boolean todAppears;
	public static boolean reaper1WalkingAway;
	public static boolean reaper1WalkingLeft;
	public static boolean reaper1Approaching;
	public static boolean reaperAngry;
	public static boolean movingImage;
	public static boolean reaper1Shooting;
	public static boolean reaper1Snatching;
	public static boolean shopKeeperApproaching;
	public static boolean shopKeeperLeaving;
	public static boolean raisingShopCase;
	public static boolean loweringShopCase;
	public static boolean raisingItem;
	public static boolean loweringItem;
	public static boolean todWalking1;
	public static boolean todWalking2;
	public static boolean todWalking3;
	public static boolean todContent;
	public static boolean todTalking1;
	public static boolean todThinking1;
	public static boolean todInviting;
	public static boolean todPeaking;
	public static boolean fadingOut;
	public static boolean fadingIn;
	public static boolean faded;
	public static boolean raisingFish;
	public static boolean loweringFish;
	public static boolean raisingCup;
	public static boolean loweringCup;
	public static boolean takingCup;
	public static boolean placingCup;
	public static boolean todSipping1;
	public static boolean todSipping2;
	public static boolean todSipping3;
	public static boolean todSipped;
	public static boolean cyclingInventoryInLeft;
	public static boolean cyclingInventoryInRight;
	public static boolean cyclingInventoryOutLeft;
	public static boolean cyclingInventoryOutRight;
	public static boolean cyclingInventoryCenter;
	public static boolean cyclingSamadhi;
	public static boolean endSamadhiSequence;
	public static boolean displayingCredits;
	public static boolean rollingCredits;
	public static boolean fadeToEnd;
	public static boolean heardSound;
	
	public static void animate() {
		tick++; // keeps track of refresh rate
		
		// reset tick
		if (tick > 2000)
			tick = 1;
		
		if (panningLeft || panningRight)
			pan();
		
		if (openingEyes)
			openEyes();
		
		if (closingEyes)
			closeEyes();
		
		if (World.lightFadeOn) {
			lightFade();
		}
		
		if (Item.ringing) {
			if (tick > Item.dialToneTime) {
				setWait(1,1);
			}
		}
			
		
		if (loweringSymbol)
			lowerSymbol();
		
		if (movingGTVreaper)
			moveGTVreaper();
		
		if (movingGTVmonk)
			moveGTVmonk();
		
		if (movingHReaper)
			moveHReaper();
		
		if (movingHBlade)
			moveHBlade();
		
		if (rotatingFractal)
			rotateFractal();
		
		if (movingSpace)
			moveSpace();
		
		if (movingStatic)
			moveStatic();
		
		if (movingSymbolIn)
			moveSymbolIn();
		
		if (movingSymbolOut)
			moveSymbolOut();
		
		if (openingInputScroll)
			openInputScroll();
		
		if (Player.fishing)
			fish();
		
		if (raisingBook)
			raiseBook();
		
		if (movingKiyoshiLeft)
			moveKiyoshiLeft();
		
		if (movingKiyoshiRight)
			moveKiyoshiRight();
		
		if (movingTVCRmonkLeft)
			moveTVCRmonkLeft();
		
		if (movingTVCRmonkRight)
			moveTVCRmonkRight();
		
		if (movingTVCRreaperLeft)
			moveTVCRreaperLeft();
		
		if (movingTVCRreaperBack)
			moveTVCRreaperBack();
		
		if (raisingFish)
			raiseFish();
		
		if (loweringBook)
			lowerBook();
		
		if (loweringTassel)
			lowerTassel();
		
		if (raisingTassel)
			raiseTassel();
		
		if (loweringDoll)
			lowerDoll();
		
		if (raisingDoll)
			raiseDoll();
		
		if (raisingItem)
			raiseItem();
		
		if (loweringItem)
			lowerItem();
		
		if (openingScroll)
			openScroll();
		
		if (closingScroll)
			closeScroll();
		
		if (pushingButton)
			pushButton();
		
		if (slidingShelf)
			slideShelf();
		
		if (raDropping)
			dropRa();
		
		if (openingT5n)
			openT5n();
		
		if (raisingPaperSlip)
			raisePaperSlip();
		
		if (loweringPaperSlip)
			lowerPaperSlip();
		
		if (openingSafe)
			openSafe();
		
		if (openingH1n)
			openH1n();
		
		if (raisingGoldPaper)
			raiseGoldPaper();
		
		if (loweringGoldPaper)
			lowerGoldPaper();
		
		if (movingCranes)
			moveCranes();
		
		if (openingMessage)
			openMessage();
		
		if (closingMessage)
			closeMessage();
		
		if (raisingT48eGate)
			raiseT48eGate();
		
		if (raisingPhone)
			raisePhone();
		
		if (loweringPhone)
			lowerPhone();
		
		if (todAppears)
			todAppears();
		
		if (reaper1WalkingAway)
			reaper1WalkAway();
		
		if (reaper1WalkingLeft)
			reaper1WalkLeft();
		
		if (reaper1Approaching) {
			reaper1Approach();
		}
		
		if (reaper1Shooting)
			reaper1Shoot();
		
		if (shopKeeperApproaching)
			shopKeeperApproach();
		
		if (shopKeeperLeaving)
			shopKeeperLeave();
		
		if (raisingShopCase)
			raiseShopCase();
		
		if (loweringShopCase)
			lowerShopCase();
		
		if (todWalking1)
			todWalk1();
		
		if (todWalking2) {
			todWalk2();
		}
		
		if (todWalking3)
			todWalk3();
		
		if (World.todStatus.equals("sitting"))
			todSit();
		
		if (todSipping1)
			todSip1();
		
		if (todSipping2)
			todSip2();
		
		if (todSipping3)
			todSip3();
		
		if (fadingOut)
			fadeOut();
		
		if (fadingIn)
			fadeIn();
		
		if (raisingCup)
			raiseCup();
		
		if (loweringCup)
			lowerCup();
		
		if (takingCup)
			takeCup();
		
		if (placingCup)
			placeCup();
		
		if (loweringFish)
			lowerFish();
		
		if (movingHTapeReaper1)
			moveHTapeReaper1();
		
		if (movingHTapeReaper2)
			moveHTapeReaper2();
		
		if (movingHTapeMonk1)
			moveHTapeMonk1();
		
		if (Keyboard.typingInput) {
			inputUnderscoreTick++;
			updateInputUnderscore();
		}
		
		if (extendingInputScroll)
			extendInputScroll();
		
		if (unextendingInputScroll)
			unextendInputScroll();
		
		if (chantFadingIn)
			chantFadeIn();
		
		if (chantFadingOut)
			chantFadeOut();
		
		if (cyclingSamadhi)
			cycleSamadhi();
		
		if (endSamadhiSequence)
			endSamadhiSequence();
		
		if (rollingCredits)
			rollCredits();
		
		if (waiting)
			wait1();
		
		if (movingImage)
			moveImage(image, endX, endY, endWidth, endHeight, steps);
	}
	
	public static void setWait(int t, int c) {
		//System.out.println("setWait()");
		tick = 0;
		waitTime = t;
		waitCode = c;
		waiting = true;
	}
	
	public static void wait1() {
		//System.out.println("waiting " + tick + "/" + waitTime);
		if (tick > waitTime) {
			
			waiting = false;
			waitTime = 0;
			//System.out.println("waiting complete");
			
			// turn off other boolean if running in this class. only wait can run
			
			switch (waitCode) {
				case 1:
					// Dial Kimi Phone
					// Check if phone input matches phoneNumber
					if (Arrays.equals(Item.phoneInputs, Item.phoneNumber)) {
						// call correct
						Player.setDisableWalk(true);
						Item.wipePhoneNumber();
						Item.ringing = false;
						Message.readKimi1();
						Player.talkingToKimi = true;
					} else {
						// wrong number
						Player.setDisableWalk(true);
						Item.wipePhoneNumber();
						Item.ringing = false;
						Message.readPhoneIncorrect();
					}
					break;
				case 2:
					// Tod Peaks
					Message.readTod1();
					break;
				case 3:
					// Tod Content
					Message.readTod2();
					break;
				case 4:
					// Faded out
					movingImage = false; // kept running bc of swoopy quadratic formula
					faded = true;
					
					// if possible
					Player.die();
				
					if (Player.position.equals("t23w")) {
						setFadeRate(2);
						fadingIn = true;
						Player.position = "tod";
						World.todStatus = "entering";
						todContent = false;
						ImagePanel.image2X = Bunraku.width;
					}
					
					if (Player.leavingTods) {
						Player.leavingTods = false;
						fadingIn = true;
						Player.position = "t23e";
					}
					
					if (Player.inTrance) {
						Audio.stopAutechre();
						Audio.startZen();
						faded = false;
						Player.position = Player.oldPosition;
						ImagePanel.resetImages();
						ImagePanel.resetColorValues();
						World.lightFadeOn = false;
						Animation.openingEyes = true;
					}
					break;
				case 5:
					Message.readTod8();
					break;
				case 6:
					loweringCup = true;
					break;
				case 7:
					// tod sip 1
					todSipping1 = false;
					
					if (!todSipped) {
						todSipping2 = true;
						World.todStatus = "sipping2";
						Audio.startSip();
					} else {
						World.todStatus = "content";
						Audio.startTeaSet();
						setWait(30, 10);
					}
					break;
				case 8:
					// tod mid sip
						todSipping2 = false;
						
					if (!todSipped) {
						todSipping3 = true;
						World.todStatus = "sipping3";
					} else {
						todSipping1 = true;
						World.todStatus = "sipping1";
					}
					break;
				case 9:
					todSipped = true;
					todSipping3 = false;
					todSipping2 = true;
					World.todStatus = "sipping2";
					break;
				case 10:
					todSipped = false;
					Message.readTod45();
					break;
				case 11:
					if (Player.meditating) {
						Message.readMeditating1();
					} else if (Player.position.equals("tod")) {
						Message.readTod47();
					}
					break;
				case 12:
					// dream
					Player.dreaming = true;
					Player.setBusy(true);
					Player.setDisableWalk(true);
					World.OOO = true;
					Data.savePurpleInventory();
					Player.inventoryList.clear();
					Player.position = "g1n";
					ImagePanel.image7Y = 0;
					ImagePanel.image8Y = 0;
					openingEyes = true;
					eyesClosed = false;
					break;
				case 13:
					reaper1Shooting = true;
					World.displayingTReaperShoot = true;
					Audio.startGun();
					//setDelay(); // old delay
					setWait(3,14);
					Player.setBusy(true);
					Player.setDisableWalk(true);
					break;
				case 14:
					//blood
					ImagePanel.bleed();
					reaper1Shooting = false;
					World.displayingTReaper1 = false;
					World.displayingTReaperShoot = false;
					setWait(33,15);
					break;
				case 15:
					// fade blood
					fadingOut = true;
					break;
				case 16:
					// go to GAMEOVER
					Player.position = "gameOver";
					Audio.stopZen();
					fadingIn = true;
					faded = false;
					break;
				case 17:
					World.reaper1PulledGun = true;
					Audio.startEquip3();
					reaper1Approaching = false;
					World.reaper1Standing = true;
					setWait(30,18);
					break;
				case 18:
					Message.readReaper1();
					break;
				case 19:
					// reaper 1 walk away
					reaper1WalkingAway = true;
					break;
				case 20:
					// breathe
					Player.breathing = false;
					Message.readMeditating1();
					break;
				case 21:
					// memorized knot
					Message.readKnot();
					break;
				case 22:
					// reel rod
					loweringItem = true;
					break;
				case 23:
					// memorize fish
					Message.readFish();
					break;
				case 24:
					// rewind
					World.startRewind();
					break;
				case 25:
					// fastforward
					World.startFastforward();
					break;
				case 26:
					// tv teleport
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.image7Y = 0;
					ImagePanel.image8Y = 0;
					
					//World.lightFadeOn = true;
					faded = false;
					
					if (Player.position.equals("g1n"))
						ImagePanel.setFadeOrange();
					
					if (Player.position.equals("h1e"))
						ImagePanel.setFadeGreen();

					if (Player.position.equals("t45n"))
						ImagePanel.setFadePurple();

					openingEyes = true;
					//ImagePanel.opacity = 0;
					break;
				case 27:
					displayingHTapeDie4 = true;
					setWait(22,28);
					break;
				case 28:
					displayingHTapeDie4 = false;
					displayingHTapeDie3 = true;
					setWait(22,29);
					break;
				case 29:
					displayingHTapeDie3 = false;
					displayingHTapeDie2 = true;
					setWait(10,30);
					break;
				case 30:
					displayingHTapeDie2 = false;
					displayingHTapeDie1 = true;
					setWait(22,31);
					break;
				case 31:
					displayingHTapeDie1 = false;
					World.orangeAlive = true;
					ImagePanel.image4X = 141;
					ImagePanel.image4Y = 66;
					ImagePanel.image4Width = (int)(Bunraku.width * .4);
					ImagePanel.image4Height = (int)(Bunraku.height * .4);
					displayingHTapeMonk2 = true;
					setMovement(4, 0, 0, Bunraku.width, Bunraku.height, 55);
					break;
				case 32:
					displayingHTapeReaper1 = true;
					displayingHTapeReaper2 = false;
					movingHTapeReaper1 = true;
					break;
				case 33:
					// end rewind
					World.endRewind();
					break;
				case 34:
					// beginning ff
					movingHTapeReaper1 = true;
					break;
				case 35:
					movingHTapeMonk1 = true;
					break;
				case 36:
					displayingHTapeDie1 = false;
					displayingHTapeDie2 = true;
					setWait(10,37);
					break;
				case 37:
					displayingHTapeDie2 = false;
					displayingHTapeDie3 = true;
					setWait(22,38);
					break;
				case 38:
					displayingHTapeDie3 = false;
					displayingHTapeDie4 = true;
					setWait(44,39);
					break;
				case 39:
					World.orangeAlive = false;
					World.endFastforward();
					break;
				case 40:
					Message.readMeditating1(); // pause after symbol moves
					break;
				case 41:
					displayingTVCRmonkFront = true;
					ImagePanel.image2X = 45;
					ImagePanel.image2Y = 0;
					ImagePanel.image2Width = (int)(Bunraku.width * .7);
					ImagePanel.image2Height = (int)(Bunraku.height * .7);
					setMovement(2, 0, 0, Bunraku.width, Bunraku.height, 222);
					break;
				case 42:
					displayingTVCRmonkRight = false;
					displayingTVCRmonkDie1 = true;
					setWait(10,43);
					break;
				case 43:
					displayingTVCRmonkDie1 = false;
					displayingTVCRmonkDie2 = true;
					setWait(20,44);
					break;
				case 44:
					displayingTVCRreaperBack = false;
					displayingTVCRreaperLeft = true;
					movingTVCRreaperLeft = true;
					break;
				case 45:
					displayingTVCRbleed1 = false;
					displayingTVCRbleed2 = true;
					setWait(33,46);
					break;
				case 46:
					World.endFastforward();
					break;
				case 47:
					displayingTVCRbleed2 = false;
					displayingTVCRbleed1 = true;
					setWait(20,48);
					break;
				case 48:
					displayingTVCRbase = true;
					displayingTVCRbleed1 = false;
					displayingTVCRmonkDie2 = true;
					ImagePanel.image5X = -220;
					displayingTVCRreaperLeft = true;
					movingTVCRreaperLeft = true;
					break;
				case 49:
					displayingTVCRmonkDie2 = false;
					displayingTVCRmonkDie1 = true;
					setWait(10,50);
					break;
				case 50:
					displayingTVCRmonkDie1 = false;
					displayingTVCRmonkRight = true;
					setWait(20,51);
					break;
				case 51:
					movingTVCRreaperBack = true;
					break;
				case 52:
					ImagePanel.image2X = 200;
					ImagePanel.image2Y = 200;
					displayingGTVreaperLeave = true;
					movingGTVreaper = true;
					break;
				case 53:
					displayingGTVmonkBack = false;
					displayingGTVmonkRight = true;
					setWait(10,54);
					break;
				case 54:
					displayingGTVmonkRight = false;
					displayingGTVmonkFront = true;
					setWait(20,55);
					break;
				case 55:
					ImagePanel.image4X = -300;
					displayingGTVpaperCranes = true;
					movingCranes = true;
					break;
				case 56:
					World.endRewind();
					break;
				case 57:
					displayingGTVpaperCranes = true;
					displayingGTVreaperGun = true;
					displayingGTVmonkFront = true;
					movingCranes = true;
					break;
				case 58:
					displayingGTVmonkRight = false;
					displayingGTVmonkBack = true;
					setWait(20,59);
					break;
				case 59:
					displayingGTVmonkBack = false;
					displayingGTVmonkDie = true;
					movingGTVmonk = true;
					break;
				case 60:
					Player.setBusy(false);
					Message.readLotus();
					break;
				case 61:
					ImagePanel.setColorValues(255,255,255,255);
					Player.position = "hrTV";
					World.hrTVOn = true;
					World.lightFadeOn = true;
					ImagePanel.image2X = 200;
					Audio.stopBreatheLoop();
					Audio.startTomita();
					break;
				case 62:
					Player.spokeToClan = true;
					Message.readTod55();
					break;
				case 63:
					// see dream self
					Player.setDisableWalk(true);
					Message.readDream1();
					break;
				case 64: 
					// dream monk answers
					Message.readMonkAnswer();
					break;
				case 65:
					faded = true;
					ImagePanel.resetColorValues();
					Player.holdingGun = false;
					Player.shooting = false;
					Player.inventoryList.remove(Item.gun);
					setWait(90,66);
					break;
				case 66:
					// wake up at tods
					ImagePanel.eyelid1Y = 0;
					ImagePanel.eyelid2Y = 0;
					faded = false;
					ImagePanel.resetColorValues();
					Player.position = "tod";
					World.todStatus = "content";
					openingEyes = true;
					break;
				case 67:
					// memorize scrolls
					Message.readOm();
					break;
				case 68:
					Message.readNi();
					break;
				case 69:
					Message.readGo();
					break;
				case 70:
					Message.readYu();
					break;
				case 71:
					Message.readJi();
					break;
				case 72:
					Message.readRa();
					break;
				case 73:
					Message.readShi();
					break;
				case 74:
					Message.readReaper4();
					break;
				case 75:
					// temple reaper
					Message.readReaper1();
					break;
				case 76:
					ImagePanel.image2X = Bunraku.width - 250;
					displayingHReaper1 = true;
					movingHReaper = true;
					break;
				case 77:
					// h reaper sword
					displayingHReaper1 = false;
					displayingHReaperUnarmed = true;
					ImagePanel.hBladeX = Bunraku.width;
					movingHBlade = true;
					break;
				case 78:
					// fade to trance
					setFadeRate(1);
					fadingIn = true;
					break;
				case 79:
					// start trance text
					switch (Player.oldPosition) {
						case "g9rs":
							if (World.gShrineTrance == 1) {
								Message.readTrance1();
							} else if (World.gShrineTrance == 2) {
								Message.readTrance11();
							} else if (World.gShrineTrance == 3) {
								Message.readTrance15();
							} else {
								Message.readTrance();
							}
							break;
						case "h1e":
							if (World.hShrineTrance == 1) {
								Message.readTrance1();
							} else if (World.hShrineTrance == 2) {
								Message.readTrance11();
							} else if (World.hShrineTrance == 3) {
								Message.readTrance15();
							} else {
								Message.readTrance();
							}
							break;
						case "t7n shrine":
							if (World.tShrineTrance == 1) {
								Message.readTrance1();
							} else if (World.tShrineTrance == 2) {
								Message.readTrance11();
							} else if (World.tShrineTrance == 3) {
								Message.readTrance15();
							} else {
								Message.readTrance();
							}
							break;
						default:
							System.out.println("World.assignTranceToShrine() error");
							break;
					}
					break;
				case 80:
					Message.readTrance2();
					break;
				case 81:
					Message.readTrance3();
					break;
				case 82:
					Message.readTrance4();
					break;
				case 83:
					Message.readTrance5();
					break;
				case 84:
					Message.readTrance6();
					break;
				case 85:
					Message.readTrance7();
					break;
				case 86:
					Message.readTrance8();
					break;
				case 87:
					Message.readTrance9();
					break;
				case 88:
					Player.setBusy(true);
					faded = false;
					fadingIn = false;
					fadingOut = true;
					break;
				case 89:
					Message.readTrance12();
					break;
				case 90:
					Message.readTrance13();
					break;
				case 91:
					Message.readTrance14();
					break;
				case 92:
					Player.setBusy(true);
					faded = false;
					fadingIn = false;
					fadingOut = true;
					break;
				case 93:
					Message.readTrance16();
					break;
				case 94:
					Message.readTrance17();
					break;
				case 95:
					Message.readTrance18();
					break;
				case 96:
					Message.readTrance19();
					break;
				case 97:
					Message.readTrance20();
					break;
				case 98:
					Message.readTrance21();
					break;
				case 99:
					World.endScene();
					break;
				case 100:
					reaper1Snatching = false;
					setWait(60,101);
					break;
				case 101:
					Message.readSamadhi1();
					break;
				case 102:
					ImagePanel.eyelid1Y = -Bunraku.height;
					ImagePanel.eyelid2Y = Bunraku.height;
					closingEyes = true;
					break;
				case 103:
					// samadhi
					closingEyes = false;
					eyesClosed = false;
					
					Player.position = "black";
					Audio.stopZen();
					Audio.loadLigeti();
					Audio.startLigeti();
					Message.readSamadhiHint();
					setWait(200,110);
					break;
				case 104:
					// fade Samadhi out
					ImagePanel.setColorValues(0,0,0,0);
					fadeRate = 1;
					fadingOut = true;
					break;
				case 105:
					// end game
					Data.endGame();
					break;
				case 106:
					Player.symbolsMemorized.add(Item.knot);
					Player.memorizedKnot = true;
					Audio.startMemorized();
					Animation.setWait(60,21);
					break;
				case 107:
					Data.newGame();
					break;
				case 108:
					Data.checkSave();
					break;
				case 109:
					Data.checkLoad();
					break;
				case 110:
					Player.position = "samadhi";
					cyclingSamadhi = true;
					Animation.displayingSpace = true;
					Animation.movingSpace = true;
					break;
				case 111:
					Audio.loadSquarepusher();
					Audio.startSquarepusher();
					displayingCredits = true;
					rollingCredits = true;
					break;
				case 112:
					Data.checkLoad();
					break;
				case 113:
					System.out.println("Animation said exit");
					Data.showConfirmDialogExit();
					break;
				default:
					System.out.println("setWait waitCode error");
					break;
			}
		}
	}
	
	public static void setFadeRate(int r) {
		fadeRate = r;
	}
	
	public static void setDelay() {
		tick = 0;
		delay = tick;
	}
	
	public static void setMovement(int i, int x, int y, int w, int h, int s) {
		Player.setBusy(true);
		step = 1;
		
		image = i;
		endX = x;
		endY = y;
		endWidth = w;
		endHeight = h;
		steps = s;
		
		movingImage = true;
	}
	
	// moves image position and size
	public static void moveImage(int image, int endX, int endY, int endWidth, int endHeight, int steps) {
		//System.out.println(step);
		if (step < steps) {
			switch (image) {
				case 1:
					ImagePanel.image1X = ImagePanel.image1X + (endX - ImagePanel.image1X) * step / steps;
					ImagePanel.image1Y = ImagePanel.image1Y + (endY - ImagePanel.image1Y) * step / steps;
					break;
				case 2:
					ImagePanel.image2X = ImagePanel.image2X + (endX - ImagePanel.image2X) * step / steps;
					ImagePanel.image2Y = ImagePanel.image2Y + (endY - ImagePanel.image2Y) * step / steps;
					ImagePanel.image2Width = ImagePanel.image2Width + (endWidth - ImagePanel.image2Width) * step / steps;
					ImagePanel.image2Height = ImagePanel.image2Height + (endHeight - ImagePanel.image2Height) * step / steps;
					
					//System.out.println(ImagePanel.image2Height);
					break;
				case 3:
					ImagePanel.image3X = ImagePanel.image3X + (endX - ImagePanel.image3X) * step / steps;
					ImagePanel.image3Y = ImagePanel.image3Y + (endY - ImagePanel.image3Y) * step / steps;
					break;
				case 4:
					ImagePanel.image4X = ImagePanel.image4X + (endX - ImagePanel.image4X) * step / steps;
					ImagePanel.image4Y = ImagePanel.image4Y + (endY - ImagePanel.image4Y) * step / steps;
					ImagePanel.image4Width = ImagePanel.image4Width + (endWidth - ImagePanel.image4Width) * step / steps;
					ImagePanel.image4Height = ImagePanel.image4Height + (endHeight - ImagePanel.image4Height) * step / steps;
					break;
				case 5:
					ImagePanel.image5X = ImagePanel.image5X + (endX - ImagePanel.image5X) * step / steps;
					ImagePanel.image5Y = ImagePanel.image5Y + (endY - ImagePanel.image5Y) * step / steps;
					break;
				case 6:
					ImagePanel.image6X = ImagePanel.image6X + (endX - ImagePanel.image6X) * step / steps;
					ImagePanel.image6Y = ImagePanel.image6Y + (endY - ImagePanel.image6Y) * step / steps;
					break;
				case 11:
					ImagePanel.cyclingItemX = ImagePanel.cyclingItemX + (endX - ImagePanel.cyclingItemX) * step / steps;
					ImagePanel.cyclingItemY = ImagePanel.cyclingItemY + (endY - ImagePanel.cyclingItemY) * step / steps;
					ImagePanel.cyclingItemWidth = ImagePanel.cyclingItemWidth + (endWidth - ImagePanel.cyclingItemWidth) * step / steps;
					ImagePanel.cyclingItemHeight = ImagePanel.cyclingItemHeight + (endHeight - ImagePanel.cyclingItemHeight) * step / steps;
					break;
				default:
					System.out.println("moveImage error");
					break;
			}
			
			step += 1;
		
			moveImageCut();
		} else {
			movingImage = false;
			step = 1;
			System.out.println("done moving");
			
			if (Player.position != "g30e" && Player.position != "t23w") {
				Player.setBusy(false);
			}
			
			
			if (cyclingInventoryOutLeft) {
				cyclingInventoryOutLeft = false;
				cyclingInventoryInRight = true;
				Player.setBusy(false);
				Item.resetInventoryList();
			} else if (cyclingInventoryOutRight) {
				cyclingInventoryOutRight = false;
				cyclingInventoryInLeft = true;
				Player.setBusy(false);
				Item.resetInventoryList();
			} else if (Player.checkingInventory) {
				Animation.cyclingInventoryInLeft = false;
				Animation.cyclingInventoryInRight = false;
				Player.setBusy(false);
				Animation.cyclingInventoryCenter = true;
			}
		}	
	}
	
	private static void moveImageCut() {
		if (((cyclingInventoryOutLeft || cyclingInventoryOutRight) && (ImagePanel.cyclingItemWidth < 70)) || ((cyclingInventoryInLeft || cyclingInventoryInRight)&& (ImagePanel.cyclingItemWidth > (Bunraku.width - 4)))) {
			step = steps;
		}
		//System.out.println("moving");
		
		// htape monk cut rw
		if (rewinding && displayingHTapeMonk2 && ImagePanel.image4Y < 4) {
			step = steps;
			ImagePanel.image2X = 44;
			ImagePanel.image4X = 0;
			displayingHTapeReaper2 = true;
			movingHTapeReaper2 = true;
		}
		
		// htape monk cut ff
		if (fastforwarding && displayingHTapeMonk2 && ImagePanel.image4Y > 64) {
			step = steps;
			displayingHTapeMonk2 = false;
			displayingHTapeDie1 = true;
			ImagePanel.image4X = 0;
			ImagePanel.image4Y = 0;
			ImagePanel.image4Width = Bunraku.width;
			ImagePanel.image4Height = Bunraku.height;
			setWait(33,36);
		}
		
		// ttape monkFront cut ff
		if (fastforwarding && displayingTVCRmonkFront && step > 40) {
			step = steps;
			displayingTVCRmonkFront = false;
			displayingTVCRmonkLeft = true;
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = 0;
			ImagePanel.image4Width = Bunraku.width;
			ImagePanel.image4Height = Bunraku.height;
			movingTVCRmonkLeft = true;
		}
		
		// ttape monkFront cut rw
		if (rewinding && displayingTVCRmonkFront && step > 100) {
			step = steps;
			displayingTVCRmonkFront = false;
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = 0;
			ImagePanel.image4Width = Bunraku.width;
			ImagePanel.image4Height = Bunraku.height;
			World.endRewind();
		}
	}
	
	private static void pan() {
		if (panningLeft && ImagePanel.image1X < (0 - panSpeed)) {
			ImagePanel.image1X += panSpeed;
			ImagePanel.image2X += panSpeed;
			ImagePanel.image3X += panSpeed;
			ImagePanel.image4X += panSpeed;
			ImagePanel.image5X += panSpeed;
			ImagePanel.image6X += panSpeed;
			ImagePanel.imageOutgoing1X += panSpeed;
			ImagePanel.imageOutgoing2X += panSpeed;
			ImagePanel.imageOutgoing3X += panSpeed;
			ImagePanel.imageOutgoing4X += panSpeed;
			ImagePanel.imageOutgoing5X += panSpeed;
			ImagePanel.imageOutgoing6X += panSpeed;
		} else if (panningLeft) {
			panningLeft = false;
			
			if (ImagePanel.imageResetPermission()) {
				ImagePanel.image1X = 0;
				ImagePanel.image2X = 0;
				ImagePanel.image3X = 0;
				ImagePanel.image4X = 0;
				ImagePanel.image5X = 0;
				ImagePanel.image6X = 0;
				ImagePanel.imageOutgoing1X = 544;
				ImagePanel.imageOutgoing2X = 544;
				ImagePanel.imageOutgoing3X = 544;
				ImagePanel.imageOutgoing4X = 544;
				ImagePanel.imageOutgoing5X = 544;
				ImagePanel.imageOutgoing6X = 544;
			}
			
			Player.setBusy(false);
		
			World.eventAfterPan();
		} else if (panningRight && ImagePanel.image1X > (0 + panSpeed)) {
			ImagePanel.image1X -= panSpeed;
			ImagePanel.image2X -= panSpeed;
			ImagePanel.image3X -= panSpeed;
			ImagePanel.image4X -= panSpeed;
			ImagePanel.image5X -= panSpeed;
			ImagePanel.image6X -= panSpeed;
			ImagePanel.imageOutgoing1X -= panSpeed;
			ImagePanel.imageOutgoing2X -= panSpeed;
			ImagePanel.imageOutgoing3X -= panSpeed;
			ImagePanel.imageOutgoing4X -= panSpeed;
			ImagePanel.imageOutgoing5X -= panSpeed;
			ImagePanel.imageOutgoing6X -= panSpeed;
		} else if (panningRight) {
			panningRight = false;
			if (ImagePanel.imageResetPermission()) {
				ImagePanel.image1X = 0;
				ImagePanel.image2X = 0;
				ImagePanel.image3X = 0;
				ImagePanel.image4X = 0;
				ImagePanel.image5X = 0;
				ImagePanel.image6X = 0;
				ImagePanel.imageOutgoing1X = -544;
				ImagePanel.imageOutgoing2X = -544;
				ImagePanel.imageOutgoing3X = -544;
				ImagePanel.imageOutgoing4X = -544;
				ImagePanel.imageOutgoing5X = -544;
				ImagePanel.imageOutgoing6X = -544;
			}
			
			Player.setBusy(false);
		
			World.eventAfterPan();
		}
		
	}

	private static void openMessage() {
		if (ImagePanel.imageMessageX > 40) {
			Player.setBusy(true);
			ImagePanel.imageMessageX -= 40; // move message scroll left
		} else {
			ImagePanel.imageMessageX = 0;
			openingMessage = false; // stop movement of message scroll
			Message.typing = true;
			Message.startThread();
		}
	}
	
	private static void closeMessage() {
		if (ImagePanel.imageMessageX < 417) {
			// next message
			Player.setBusy(true);
			ImagePanel.imageMessageX += 40;
		} else {
			Message.textSpeed = Message.defaultTextSpeed;
			Player.readingMessage = false;
			
			if (!Player.meditating)
				Player.setBusy(false);
			
			closingMessage = false;
			
			// EVENTS AFTER CLOSE MESSAGE	
			Message.eventAfterCloseMessage();
		}
	}
	
	private static void updateInputUnderscore() {
		if (inputUnderscoreTick < 10) {
			ImagePanel.displayingInputUnderscore = true;
		}
		
		if (inputUnderscoreTick > 10
			&& inputUnderscoreTick < 20) {
			ImagePanel.displayingInputUnderscore = false;
		}
		
		if (inputUnderscoreTick > 30)
			inputUnderscoreTick = 1;
	}
	
	private static void moveHReaper() {
		if (ImagePanel.image2X > 5) {
			ImagePanel.image2X -= 5;
			//System.out.println(ImagePanel.image2X);
			
			if (ImagePanel.image2X == 149)
				Audio.startAcid();
		} else {
			movingHReaper = false;
			ImagePanel.image2X = 0;
			setWait(20,18);
		}
	}
	
	private static void moveHTapeReaper1() {
		if (rewinding) {
			if (ImagePanel.image2X > -50) {
				ImagePanel.image2X -= 2;
			} else {
				ImagePanel.image2X = 0;
				movingHTapeReaper1 = false;
				displayingHTapeReaper1 = false;
				setWait(55,33);
			}	
		}
		
		if (fastforwarding) {
			if (ImagePanel.image2X < -4) {
				ImagePanel.image2X += 2;
			} else {
				ImagePanel.image2X = -4;
				ImagePanel.image4X = -200;
				Animation.displayingHTapeMonk1 = true;
				displayingHTapeReaper1 = false;
				displayingHTapeReaper2 = true;
				movingHTapeReaper1 = false;
				setWait(55,35);
			}	
		}
	}
	
	private static void moveHTapeReaper2() {
		if (rewinding) {
						if (ImagePanel.image2X > -4) {
				ImagePanel.image2X -= 2;
			} else {
				ImagePanel.image2X = -4;
				movingHTapeReaper2 = false;
				displayingHTapeMonk2 = false;
				displayingHTapeMonk1 = true;
				movingHTapeMonk1 = true;
			}
		}
		
		if (fastforwarding) {
			if (ImagePanel.image2X < 44) {
				ImagePanel.image2X += 2;
			} else {
				movingHTapeReaper2 = false;
				displayingHTapeReaper2 = false;
				
				setMovement(4, 141, 66, (int)(Bunraku.width * .4), (int)(Bunraku.height * .4), 55);
			}
		}
	}
	
	private static void moveHTapeMonk1() {
		if (rewinding) {
			if (ImagePanel.image4X > -200) {
				ImagePanel.image4X -= 10;
			} else {
				displayingHTapeMonk1 = false;
				movingHTapeMonk1 = false;
				setWait(20,32);
			}
		}
		
		if (fastforwarding) {
			if (ImagePanel.image4X < -10) {
				ImagePanel.image4X += 10;
			} else {
				ImagePanel.image4X = 0;
				displayingHTapeMonk2 = true;
				displayingHTapeMonk1 = false;
				movingHTapeMonk1 = false;
				movingHTapeReaper2 = true;
			}
		}
	}
	
	private static void moveTVCRmonkLeft() {
		if (fastforwarding) {
			if (ImagePanel.image4X > -230) {
				ImagePanel.image4X -= 10;
			} else {
				displayingTVCRmonkLeft = false;
				movingTVCRmonkLeft = false;
				displayingTVCRmonkRight = true;
				movingTVCRmonkRight = true;
			}
		}
		
		if (rewinding) {
			if (ImagePanel.image4X < -10) {
				ImagePanel.image4X += 10;
			} else {
				ImagePanel.image4X = 0;
				ImagePanel.image2Y = 0;
				displayingTVCRmonkLeft = false;
				movingTVCRmonkLeft = false;
				displayingTVCRmonkFront = true;
				displayingTVCRbase = true;
				setMovement(2, 45, 0, (int)(Bunraku.width *.7), (int)(Bunraku.height *.7), 222);
			}
		}
	}
	
	private static void moveTVCRmonkRight() {
		if (fastforwarding) {
			if (ImagePanel.image4X < 0) {
				ImagePanel.image4X += 10;
			} else {
				movingTVCRmonkRight = false;
				ImagePanel.image7X = -100;
				ImagePanel.image7Y = 200;
				displayingTVCRreaperBack = true;
				movingTVCRreaperBack = true;
			}
		}
		
		if (rewinding) {
			if (ImagePanel.image4X > -220) {
				ImagePanel.image4X -= 10;
			} else {
				movingTVCRmonkRight = false;
				displayingTVCRmonkRight = false;
				displayingTVCRmonkLeft = true;
				movingTVCRmonkLeft = true;
			}
		}
	}
	
	private static void moveTVCRreaperBack() {
		if (fastforwarding) {
			if (ImagePanel.image7Y > 6) {
				ImagePanel.image7X += 3;
				ImagePanel.image7Y -= 6;
			} else {
				ImagePanel.image7X = 0;
				ImagePanel.image7Y = 0;
				movingTVCRreaperBack = false;
				setWait(22,42);
			}
		}
		
		if (rewinding) {
			if (ImagePanel.image7Y < 200) {
				ImagePanel.image7X -= 3;
				ImagePanel.image7Y += 6;
			} else {
				ImagePanel.image7X = 0;
				ImagePanel.image7Y = 0;
				movingTVCRreaperBack = false;
				displayingTVCRreaperBack = false;
				movingTVCRmonkRight = true;
			}
		}
	}
	
	private static void moveTVCRreaperLeft() {
		if (fastforwarding) {
			if (ImagePanel.image5X > -222) {
				ImagePanel.image5X -= 10;
			} else {
				ImagePanel.image5X = 0;
				displayingTVCRreaperLeft = false;
				movingTVCRreaperLeft = false;
				displayingTVCRmonkDie2 = false;
				displayingTVCRbleed1 = true;
				setWait(20,45);
			}
		}
		
		if (rewinding) {
			if (ImagePanel.image5X < -10) {
				ImagePanel.image5X += 10;
			} else {
				ImagePanel.image5X = 0;
				displayingTVCRreaperLeft = false;
				movingTVCRreaperLeft = false;
				displayingTVCRreaperBack = true;
				setWait(20,49);
			}
		}
	}
	
	private static void fadeOut() {
		Player.setBusy(true);
		Player.setDisableWalk(true);
		
		if (Player.checkingInventory) {
			if (ImagePanel.opacity < 200) {
				ImagePanel.opacity += fadeRate;
			} else {
				ImagePanel.opacity = 205;
				fadingOut = false;
				faded = true;
				Item.prepCycle();
			}
		} else if (bloody) {
			if (ImagePanel.redValue > 3) {
				ImagePanel.redValue -= 3;
			} else {
				ImagePanel.resetColorValues();
				fadingOut = false;
				bloody = false;
				faded = true;
				setWait(25,4);
			}
		} else if (Player.position.equals("samadhi") && !fadeToEnd) {
			if (ImagePanel.opacity < 238) {
				ImagePanel.opacity += 1;
			} else {
				ImagePanel.opacity = 239;
				fadingOut = false;
				faded = true;
				Data.loadCredits();
				Audio.stopLigeti();
				setWait(180,111);
			}
		} else {
			if (ImagePanel.opacity < 252) {
				ImagePanel.opacity += 3;
			} else {
				ImagePanel.opacity = 255;
				fadingOut = false;
				fadingIn = false;
				faded = true;
				movingSpace = false;
				displayingSpace = false;
				
				if (Player.inTrance) {
					setWait(80,4);
				} else {
					setWait(25,4);
				}
			}
		}
	}
	
	private static void fadeIn() {
		Player.setBusy(true);
		Player.setDisableWalk(true);
		faded = false;
		if (ImagePanel.opacity > fadeRate) {
			ImagePanel.opacity -= fadeRate;
			//System.out.println(ImagePanel.opacity);
			
			if (Player.inTrance && ImagePanel.opacity < 155) {
				ImagePanel.opacity = 154;
				fadingIn = false;
				faded = false;
				Player.setBusy(false);
				setWait(140,79);
			}
		} else {
			ImagePanel.opacity = 255;
			fadingIn = false;
			faded = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			
			if (Player.position.equals("tod")) {
				Player.setBusy(true);
				todWalking3 = true;
			}
			
			if (Player.position.equals("t23e") && Player.inventoryList.contains(Item.shi) && !Player.knowsGotShi) {
				Player.setDisableWalk(true);
				Message.readGetScroll();
				Player.knowsGotShi = true;
				Player.dreaming = false;
				Player.spokeToClan = false;
				Animation.todSipping1 = false;
				Animation.todSipping2 = false;
				Animation.todSipping3 = false;
				Animation.todSipped = false;
				Player.spokeToMonk = false;
				World.XOO = true;
			}
			
			if (Item.clickedItem)
				Item.processInventory();
			
			Item.closingInventory = false;
		}
	}
	
	private static void chantFadeIn() {
		Player.setBusy(true);
		Player.setDisableWalk(true);
		
		if (ImagePanel.opacity > 8) {
			ImagePanel.opacity -= 8;
		} else {
			ImagePanel.opacity = 0;
			chantFadingIn = false;
			chantFadingOut = true;
		}
	}
	
	private static void chantFadeOut() {
		if (ImagePanel.opacity < 247) {
			ImagePanel.opacity += 8;
		} else {
			chantFadingOut = false;
			ImagePanel.opacity = 255;
			displayingOm = false;
			displayingNi = false;
			displayingGo = false;
			displayingYu = false;
			displayingJi = false;
			displayingRa = false;
			displayingShi = false;
			
			World.checkShrine();
		}
	}
	
	private static void moveStatic() {
		ImagePanel.image8Y -= 5;
		ImagePanel.image9Y = ImagePanel.image8Y + 250;
		
		if (ImagePanel.image8Y < -185)
			ImagePanel.image8Y = ImagePanel.image9Y;
	}
	
	private static void moveSymbolIn() {
		if (ImagePanel.symbol1X < -4) {
			ImagePanel.symbol1X += 4;
			ImagePanel.symbol2X -= 4;
		} else {
			ImagePanel.symbol1X = 0;
			ImagePanel.symbol2X = 0;
			movingSymbolIn = false;
			rotatingFractal = true;
			faded = false;
			Audio.startMemorized();
			Animation.setWait(44,40);
		}
	}
	
	private static void moveSymbolOut() {
		if (ImagePanel.symbol1X > -Bunraku.width) {
			ImagePanel.symbol1X -= 4;
			ImagePanel.symbol2X += 4;
		} else {
			ImagePanel.symbol1X = 0;
			ImagePanel.symbol2X = 0;
			movingSymbolOut = false;
			Player.visualizingFish = false;
			Player.visualizingLotus = false;
			Player.visualizingKnot = false;
			rotatingFractal = false;
			faded = false;
			
			if (prepEyes) {
				prepEyes = false;
				Audio.startZen();
				Animation.openingEyes = true;
			} else {
				if (prepFish) {
					prepFish = false;
					ImagePanel.symbol1X = -Bunraku.width;
					ImagePanel.symbol2X = Bunraku.width;
					Player.visualizingFish = true;
					movingSymbolIn = true;
				}
				
				if (prepLotus) {
					prepLotus = false;
					ImagePanel.symbol1X = -Bunraku.width;
					ImagePanel.symbol2X = Bunraku.width;
					Player.visualizingLotus = true;
					movingSymbolIn = true;
				}
				
				if (prepKnot) {
					prepKnot = false;
					ImagePanel.symbol1X = -Bunraku.width;
					ImagePanel.symbol2X = Bunraku.width;
					Player.visualizingKnot = true;
					movingSymbolIn = true;
				}
			}
		}
	}
	
	private static void moveGTVreaper() {
		if (rewinding) {
			if (ImagePanel.image2X > 6) {
				ImagePanel.image2X -= 6;
				ImagePanel.image2Y -= 6;
			} else {
				ImagePanel.image2X = 0;
				ImagePanel.image2Y = 0;
				movingGTVreaper = false;
				displayingGTVreaperLeave = false;
				displayingGTVreaperGun = true;
				ImagePanel.image3Y = 160;
				displayingGTVmonkDie = true;
				movingGTVmonk = true;
			}
		}
		
		if (fastforwarding) {
			if (ImagePanel.image2X < 300) {
				ImagePanel.image2X += 6;
				ImagePanel.image2Y += 6;
			} else {
				ImagePanel.image2X = 0;
				ImagePanel.image2Y = 0;
				displayingGTVreaperLeave = false;
				movingGTVreaper = false;
				World.endFastforward();
			}
		}
	}
	
	private static void moveGTVmonk() {
		if (rewinding) {
			if (ImagePanel.image3Y > -50) {
				ImagePanel.image3Y -= 10;
			} else {
				ImagePanel.image3Y = 0;
				movingGTVmonk = false;
				displayingGTVmonkDie = false;
				displayingGTVmonkBack = true;
				setWait(20,53);
			}
		}
		
		if (fastforwarding) {
			if (ImagePanel.image3Y < 300) {
				ImagePanel.image3Y += 10;
			} else {
				ImagePanel.image3Y = 0;
				displayingGTVmonkDie = false;
				displayingGTVreaperGun = false;
				displayingGTVreaperLeave = true;
				movingGTVreaper = true;
				movingGTVmonk = false;
			}
		}
	}
	
	private static void rotateFractal() {
		ImagePanel.fractalDegree += 1;
	}
	
	private static void moveHBlade() {
		ImagePanel.hBladeX -= 26;
		ImagePanel.bladeDegree += 3;
		
		if (ImagePanel.hBladeX < 0) {
			Audio.startSlash();
			ImagePanel.hBladeX = 0;
			displayingHReaperUnarmed = false;
			movingHBlade = false;
			World.prepHReaper = false;
			ImagePanel.bleed();
			setWait(33,15);
		}
	}
	
	private static void raiseFish() {
		if (ImagePanel.image2Y > 20) {
			ImagePanel.image2Y -= 20;
		} else {
			ImagePanel.image2Y = 0;
			raisingFish = false;
			Player.setBusy(false);
		}
	}
	
	private static void lowerFish() {
		if (ImagePanel.image2Y < Bunraku.height) {
			ImagePanel.image2Y += 20;
		} else {
			loweringFish = false;
			Player.holdingFish2 = false;
			ImagePanel.image2Y = 0;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			Audio.startSplash();
			Item.cornOnRod = false;
		}
	}
	
	private static void openInputScroll() {
		if (ImagePanel.inputScrollX > ImagePanel.inputScrollXANCHOR + 10) {
			ImagePanel.inputScrollX -= 10;
		} else {
			ImagePanel.inputScrollX = ImagePanel.inputScrollXANCHOR;
			openingInputScroll = false;
		}
	}
	
	private static void extendInputScroll() {
		int i = (Keyboard.keyboardInputString.length() - 1) * Keyboard.charWidth;
		
		ImagePanel.inputScrollXTarget = ImagePanel.inputScrollXANCHOR - i;
		
		if (ImagePanel.inputScrollX >= ImagePanel.inputScrollXTarget + inputScrollMovementSpeed) {
			ImagePanel.inputScrollX -= inputScrollMovementSpeed;
		} else {
			ImagePanel.inputScrollX = ImagePanel.inputScrollXTarget;
			extendingInputScroll = false;
		}
	}
	
	private static void unextendInputScroll() {
		int i = (Keyboard.keyboardInputString.length() - 1) * Keyboard.charWidth;
		
		ImagePanel.inputScrollXTarget = ImagePanel.inputScrollXANCHOR - i;
		
		if (ImagePanel.inputScrollX <= ImagePanel.inputScrollXTarget - inputScrollMovementSpeed) {
			
			if ((ImagePanel.inputScrollXANCHOR - ImagePanel.inputScrollX) >= inputScrollMovementSpeed) {
				ImagePanel.inputScrollX += inputScrollMovementSpeed;
			} else {
				ImagePanel.inputScrollX = ImagePanel.inputScrollXANCHOR;
				unextendingInputScroll = false;
			}
		} else {
			ImagePanel.inputScrollX = ImagePanel.inputScrollXTarget;
			unextendingInputScroll = false;
		}
	}
	
	private static void openSafe() {
		openingSafe = true;
		
		if (!heardSound)
			Audio.startHandle();
		
		heardSound = true;
				
		if (tick > (delay + 25)) {
			World.open = true;
			Audio.startSafeOpen();
			openingSafe = false;
			delay = -1;
			heardSound = false;
		}
	}
	
	private static void lightFade() {
		if (Player.position.equals("g1n") || Player.position.equals("h1e") || Player.position.equals("t45n")) {
			ImagePanel.opacity -= 1;
			
			if (ImagePanel.opacity < 1) {
				ImagePanel.resetColorValues();
				World.lightFadeOn = false;
			}
		}
		
		if (Player.position.equals("hrTV")) {
			ImagePanel.opacity -= 1;
			
			if (ImagePanel.opacity < 1) {
				ImagePanel.resetColorValues();
				World.lightFadeOn = false;
				movingKiyoshiLeft = true;
			}
		}
	}
	
	private static void moveKiyoshiLeft() {
		if (ImagePanel.image2X > 2) {
			ImagePanel.image2X -= 2;
		} else {
			movingKiyoshiLeft = false;
			ImagePanel.image2X = 0;
			Message.readShingon1();
		}
	}
	
	private static void moveKiyoshiRight() {
		if (ImagePanel.image2X < 250) {
			ImagePanel.image2X += 2;
		} else {
			movingKiyoshiRight = false;
			World.hrTVOn = false;
			Audio.startTapeSet();
			ImagePanel.image2X = 0;
			// music stop and switch
			Audio.stopTomita();
			Audio.startBreatheLoop();
			Player.setBusy(false);
			Player.setDisableWalk(false);
		}
	}
	
	private static void openEyes() {
		ImagePanel.eyelid1Y -= eyelidRate;
		ImagePanel.eyelid2Y += eyelidRate;
		//System.out.println(ImagePanel.eyelid1Y);
		
		/**
		if (Player.position.equals("g1n" && ImagePanel.opacity > 1 && !Player.inTrance) {
			ImagePanel.opacity -= 1;
		}
		
		
		if (Player.position.equals("h1e" && ImagePanel.opacity > 1 && !Player.inTrance) {
			ImagePanel.opacity -= 1;
		}
		
		if (Player.position.equals("t45n" && ImagePanel.opacity > 1 && !Player.inTrance) {
			ImagePanel.opacity -= 1;
		}
		
		*/
		
		// End opening lids when off screen
		if (ImagePanel.eyelid1Y < -390) {
			
			ImagePanel.resetColorValues();
			openingEyes = false;
			eyelidRate = 3;
			Player.inTrance = false;
			ImagePanel.spaceX = 0;
			ImagePanel.textLine1Y = 330;
			ImagePanel.textLine2Y = ImagePanel.textLine1Y + 16;
			ImagePanel.textLine3Y = ImagePanel.textLine2Y + 16;
			ImagePanel.textLine4Y = ImagePanel.textLine3Y + 16;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			eyesClosed = false;
			Player.meditating = false;
			Player.chantInputs.clear();
			World.eventAfterOpenEyes();
		}
	}
	
	private static void closeEyes() {
		ImagePanel.opacity = 255;
		ImagePanel.eyelid1Y += 3;
		ImagePanel.eyelid2Y -= 3;
		
		if (ImagePanel.eyelid1Y > -3) {
			
			closingEyes = false;
			
			eyesClosed = true;
			
			if (Player.meditating){
				Player.position = "meditating";
				Audio.stopZen();
			}
			
			if (Player.bodhisattva) {
				setWait(120,103);
			} else {
				setWait(30,11);
			}
		}
	}
	
	private static void reaper1WalkAway() {
		if (ImagePanel.image2X < 31) {
			if (tick > delay + 3) {
				ImagePanel.image2X += 1;
				
				if (ImagePanel.image2X / 3 == 1)
					ImagePanel.image2Y -= 1;
				
				setDelay();
			}
			
		} else {
			delay = -1;
			reaper1WalkingAway = false;
			Player.sawReaper1 = true;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = 0;
		}
	}
	
	private static void raisePhone() {
		if (ImagePanel.image2Y > 0) {
			Player.onPhone = true;
			Player.setBusy(true);
			ImagePanel.image2Y -= 20;
		} else {
			ImagePanel.resetImages();
			raisingPhone = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
		}
	}
	
	private static void lowerPhone() {
		if (ImagePanel.image2Y < 300) {
			Player.setBusy(true);
			ImagePanel.image2Y += 20;
		} else {
			loweringPhone = false;
			Player.onPhone = false;
			Player.setBusy(false);
			Player.talkingToKimi = false;
			Player.setDisableWalk(false);
			ImagePanel.image2Y = 0;
		}
	}
	
	private static void raiseT48eGate() {
		if (ImagePanel.image2Y > World.tGateLimit) {
			Player.setBusy(true);
			ImagePanel.image2Y -= 2;
		} else {
			World.t48eGateOpen = true;
			raisingT48eGate = false;
			Player.setBusy(false);
		}
	}
	
	private static void raiseBook() {
		if (Player.position.equals("h18s")) {
			// raise red, black, and blue books
			if (ImagePanel.image3Y > 0) {
				ImagePanel.image3Y -= 18;
			} else {
				ImagePanel.resetImages();
				raisingBook = false;
				Player.setBusy(false);
			}	
		} else {
			// raise AC book
			if (ImagePanel.image2Y > 0) {
				ImagePanel.image2Y -= 18;
			} else {
				ImagePanel.resetImages();
				raisingBook = false;
				Player.setBusy(false);
			}
		}
		
	}
	
	private static void lowerBook() {
		if (Player.position.equals("h18s")) { 
			if (ImagePanel.image3Y < 375) {
				// lower red, blue, and black books
				Item.bookPage = 0;
				ImagePanel.image3Y += 18;	
			} else {
				loweringBook = false;
				Player.setDisableWalk(false);
				Player.holdingRedBook = false;
				Player.holdingBlueBook = false;
				Player.holdingBlackBook = false;
				Player.examiningRedBook = false;
				Player.examiningBlueBook = false;
				Player.examiningBlackBook = false;
				ImagePanel.resetImages();
				Player.setBusy(false);
			}
		} else if (ImagePanel.image2Y < 375) {
			// lower AC book
			Item.bookPage = 0;
			ImagePanel.image2Y += 18;
		} else {
			loweringBook = false;
			Player.setDisableWalk(false);
			Player.holdingACBook = false;
			ImagePanel.resetImages();
			Player.setBusy(false);
		}
	}
	
	private static void raiseGoldPaper() {
		if (ImagePanel.imageItemY > 0) {
			ImagePanel.imageItemY -= 10;
		} else {
			raisingGoldPaper = false;
			ImagePanel.resetImages();
			Player.setBusy(false);
		}
	}
	
	private static void lowerGoldPaper() {
		if (ImagePanel.imageItemY < 370) {
			Player.setBusy(true);
			ImagePanel.imageItemY += 10;
		} else {
			Player.setBusy(false);
			Player.setDisableWalk(false);
			Player.holdingItem = false;
			loweringGoldPaper = false;
			Player.holdingGoldPaper = false;
			ImagePanel.resetImages();
		}
	}
	
	private static void lowerTassel() {
		if (ImagePanel.image2Y < 0) {
			ImagePanel.image2Y += 5;
		} else {
			loweringTassel = false;
			raisingTassel = true;
		}
	}
	
	private static void raiseTassel() {
		if (ImagePanel.image2Y > -155) {
			ImagePanel.image2Y -= 2;
		} else {
			raisingTassel = false;
			Mouse.x = 0;
			ClickRight.turnRight();
			raisingT48eGate = true;
			Audio.startCreak();
		}
	}
	
	private static void todAppears() {
		if (ImagePanel.image2X < 0) {
			ImagePanel.image2X += 1;
		} else {
			ImagePanel.image2X = 0;
			
			//wait 3 seconds
			if (!todPeaking)
				setWait(33,2);
			
			todPeaking = true;
		}
	}
	
	private static void todWalk1() {
		if (tick > 101) {
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = -50;
			todWalking1 = false;
			todWalking2 = true;
			
			ImagePanel.image2Width = (int)(Bunraku.width * .625);
			ImagePanel.image2Height = (int)(Bunraku.height * .625);	
			ImagePanel.image2X = 110;
			ImagePanel.image2Y = 83;
		
			// makes tod approach
			tick = 1;
			setMovement(2,0,0,544,416,777);
		} 
	}
	
	private static void todWalk2() {
		//System.out.println(tick);
		if (tick > 121) {
			tick = 1;
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = 0;
			ImagePanel.image2Width = Bunraku.width;
			ImagePanel.image2Height = Bunraku.height;
			todWalking2 = false;
			todContent = true;
			
			setWait(55,3);
		}
	}
	
	private static void todWalk3() {
		if (ImagePanel.image2X > 4) {
			ImagePanel.image2X -= 4;
		} else {
			ImagePanel.image2X = 0;
			ImagePanel.image2Y = -40;
			World.todStatus = "sitting";
			todWalking3 = false;
		}
	}
	
	private static void todSit() {
		if (ImagePanel.image2Y < 30) {
			ImagePanel.image2Y += 1;
		} else {
			ImagePanel.image2Y = 0;
			Audio.startEquip4();
			World.todStatus = "content";
			
			setWait(20,5);
		}
	}
	
	private static void raiseDoll() {
		if (ImagePanel.image2Y > 0) {
			ImagePanel.image2Y -= 18;	
		} else {
			ImagePanel.resetImages();
			raisingDoll = false;
			Player.setBusy(false);
		}
	}
	
	private static void lowerDoll() {
		if (ImagePanel.image2Y < 375) {
			Item.bookPage = 0;
			ImagePanel.image2Y += 18;	
		} else {
			loweringDoll = false;
			Player.holdingDoll = false;
			ImagePanel.resetImages();
			World.open = false;
			Player.setBusy(false);
		}
	}
	
	private static void pushButton () {
		Player.setBusy(true);
		World.buttonPushed = true;
		
		if (tick > (delay + 25)) {
			World.buttonPushed = false;
			Animation.pushingButton = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			delay = -1;
			
			if (Player.position.equals("h14n") && !World.raDropped && World.OOO) {
				Audio.startCreak();
				slidingShelf = true;
			}
			
			if (Player.position.equals("t5n") && !World.t5nOpened && World.OOO) {
				openingT5n = true;
				Audio.startCreak();
			}
		}
	}
	
	private static void openH1n() {
		if (ImagePanel.image2X < 200) {
			ImagePanel.image2X += 2; 
		} else {
			openingH1n = false;
			World.darkDoorOpen = true;
			Player.setBusy(false);
			Player.setDisableWalk(false);
		}
	}
	
	private static void slideShelf() {
		//System.out.println(ImagePanel.image2X);
		Player.setBusy(true);
		
		if (ImagePanel.image2X < -70) {
			if (!heardSound)
				Audio.startRaDrop();
			
			heardSound = true;
			raDropping = true;
			
		}
		
		if (ImagePanel.image2X > -100) {
			ImagePanel.image2X -= 1;
		} else {
			slidingShelf = false;
			heardSound = false;
		}
	}
	
	private static void dropRa() {
		if (ImagePanel.image3Y < 300) {
			ImagePanel.image3Y += 5;
		} else {
			World.raDropped = true;
			heardSound = false;
			raDropping = false;
			Player.setBusy(false);
		}
	}
	
	private static void openT5n() {
		if (ImagePanel.image3Y < 400) {
			ImagePanel.image3Y += 4;
		} else {
			World.t5nOpened = true;
			openingT5n = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
		}
	}
	
	private static void raisePaperSlip() {
		if (ImagePanel.image2Y > 0) {
			ImagePanel.image2Y -= 15;
		} else {
			ImagePanel.resetImages();
			Player.setBusy(false);
			raisingPaperSlip = false;
		}
	}
	
	private static void lowerPaperSlip() {
		if (ImagePanel.image2Y < 300) {
			ImagePanel.image2Y += 15;
		} else {
			Player.examiningPaperSlip = false;
			Player.setBusy(false);
			ImagePanel.resetImages();
			loweringPaperSlip = false;
		}
	}
	
	private static void moveCranes() {
		if (rewinding) {
			if (ImagePanel.image4X < -10) {
				ImagePanel.image4X += 10;
			} else {
				ImagePanel.image4X = 0;
				movingCranes = false;
				setWait(40,56);
			}
		} else if (fastforwarding) {
			if (ImagePanel.image4X > -300) {
				ImagePanel.image4X -= 10;
			} else {
				ImagePanel.image4X = 0;
				displayingGTVpaperCranes = false;
				movingCranes = false;
				displayingGTVmonkFront = false;
				displayingGTVmonkRight = true;
				setWait(20,58);
			}
		} else {
			if (ImagePanel.image2X < 400) {
				ImagePanel.image2X += 4;
			} else {
				movingCranes = false;
				
				setWait(40,74);
			}
		}
	}
	
	private static void openScroll() {
		//System.out.println("Animation.examineScroll()");
		Player.setBusy(true);
		Player.setDisableWalk(true);
		World.scrollCloseable = false;
		
		if (!heardSound)
			Audio.startBookOpen();
		
		heardSound = true;
		
		if (ImagePanel.scrollY < -5) {
			ImagePanel.scrollY += 4;
		} else {
			Player.setBusy(false);
			ImagePanel.scrollY = 0;
			openingScroll = false;
			heardSound = false;
			
			if (Player.examiningOm) {
				if (!Player.memorizedOm) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,67);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningNi) {
				if (!Player.memorizedNi) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,68);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningGo) {
				if (!Player.memorizedGo) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,69);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningYu) {
				if (!Player.memorizedYu) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,70);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningJi) {
				if (!Player.memorizedJi) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,71);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningRa) {
				if (!Player.memorizedRa) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,72);
				} else {
					World.scrollCloseable = true;
				}
			}
			
			if (Player.examiningShi) {
				if (!Player.memorizedShi) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startMemorized();
					Animation.setWait(60,73);
				} else {
					World.scrollCloseable = true;
				}
			}
		}
	}
	
	private static void closeScroll() {
		Player.setBusy(true);
		
		if (!heardSound)
			Audio.startBookOpen();
		
		heardSound = true;
		
		//System.out.println("closeScroll()");
		
		if (ImagePanel.scrollY > -245) {
			ImagePanel.scrollY -= 15;
			//System.out.println(ImagePanel.scrollY);
		} else {
			Audio.startEquip3();
			closingScroll = false;
			ImagePanel.scrollY = 0;
			closedScroll();
			heardSound = false;
		}
	}
	
	private static void closedScroll() {
		Player.setBusy(false);
		Player.examiningOm = false;
		Player.examiningNi = false;
		Player.examiningGo = false;
		Player.examiningYu = false;
		Player.examiningJi = false;
		Player.examiningRa = false;
		Player.examiningShi = false;
		Player.holdingOm = false;
		Player.holdingNi = false;
		Player.holdingGo = false;
		Player.holdingYu = false;
		Player.holdingJi = false;
		Player.holdingRa = false;
		Player.holdingShi = false;
		World.scrollCloseable = false;
		
		Player.setDisableWalk(false);
		
		if (Player.position.equals("t9n shop")) {
			Player.setDisableWalk(true);
			World.shopCaseOpen = false;
			Audio.startEquip1();
			loweringShopCase = true;
		}
	}
	
	private static void lowerSymbol() {
		if (ImagePanel.symbol1Y < Bunraku.height) {
			ImagePanel.symbol1Y += 4;
		} else {
			loweringSymbol = false;
			ImagePanel.symbol1Y = 0;
			Player.visualizingKnot = false;
			Player.visualizingFish = false;
			Player.visualizingLotus = false;
			Player.chantInputs.clear();
			Player.breathed = false;
			ImagePanel.resetColorValues();
			Player.inTrance = true;
			displayingSpace = true;
			movingSpace = true;
			setWait(60,78);
		}
	}
	
	private static void fish() {
		if (tick > World.fishWaitTime && tick < (World.fishWaitTime + World.fishWindow)) {
			
			if (!heardSound)
				Audio.startSplash();
			
			heardSound = true;
			Item.fishingRodBent = true;
		} else {
			heardSound = false;
			Item.fishingRodBent = false;
		}
	}
	
	private static void reaper1WalkLeft() {
		if (ImagePanel.image2X > 0) {
			ImagePanel.image2X -= 1;
		} else {
			System.out.println("approach");
			Audio.startEquip5();
			reaper1WalkingLeft = false;
			reaper1Approaching = true;
			ImagePanel.image2X = 135;
			ImagePanel.image2Y = 135;
			ImagePanel.image2Width = (int)(Bunraku.width * .45);
			ImagePanel.image2Height = (int)(Bunraku.height * .45);	
		
			// makes reaper approach
			tick = 1;
			setMovement(2,0,0,544,416,700);
		}
	}
	
	private static void reaper1Approach() {
		//System.out.println(tick);
		if (tick > 122) {
			tick = 1;
			reaper1Snatching = true;
			setWait(6,17);
		}
	}
	
	private static void reaper1Shoot() {
		if (tick > (delay + 5)) {
			
			
		}
	}
	
	private static void shopKeeperApproach() {
		if (ImagePanel.image2X < 0) {
			ImagePanel.image2X += 3; // 3 is good
		} else {
			ImagePanel.image2X = 0;
			shopKeeperApproaching = false;
			
			if (Player.inventoryList.contains(Item.yu)) {
				Message.readShopTempleHelp();
			} else {
				Message.readShop11();
			}
		}
	}
	
	private static void raiseShopCase () {
		if (ImagePanel.image4Y > 0) {
			ImagePanel.image4Y -= 7;
			Player.setBusy(true);
		} else {
			Player.setBusy(false);
			raisingShopCase = false;
			ImagePanel.image4Y = 0;
		}
	}
	
	private static void lowerShopCase() {
		if (World.shopCaseOpen)
			World.shopCaseOpen = false;
		
		if (ImagePanel.image4Y < 400) {
			ImagePanel.image4Y += 7;
			Player.setBusy(true);
		} else {
			Player.setBusy(false);
			Player.setDisableWalk(false);
			loweringShopCase = false;
			Player.holdingShopCase = false;
			ImagePanel.image4Y = 0;
			
			if (Player.hasYu) {
				Message.readShop2();
			} else {
				Message.readShop3();
			}
		}
	}
	
	private static void shopKeeperLeave() {
		if (ImagePanel.image2X >-500) {
			ImagePanel.image2X -= 5;
		} else {
			shopKeeperLeaving = false;
			Player.setBusy(false);
			World.shopkeeperPresent = false;
		}
	}
	
	private static void raiseItem() {
		if (Player.holdingRod) {
			if (ImagePanel.imageItemX > 20) {
				ImagePanel.imageItemX -= 20;
			} else {
				ImagePanel.imageItemX = 0;
				raisingItem = false;
				Player.setBusy(false);
				Player.setDisableWalk(true);
				
				// start fish timer
				if (Player.position.equals("h8s")) {
					tick = 1;
					Player.fishing = true;
				}
			}
		} else {
			if (ImagePanel.imageItemY > 20) {
				ImagePanel.imageItemY -= 20;
			} else {
				ImagePanel.imageItemY = 0;
				raisingItem = false;
				Player.setBusy(false);
				
				if (Player.holdingGun) {
					Player.setDisableWalk(false);
					if (Player.position.equals("g31w")) {
						if (!Player.spokeToMonk) {
							Player.setBusy(true);
							Player.setDisableWalk(true);
							Animation.setWait(35,63);
						}
					}
				}
				
				if (Player.holdingCorn) {
					Item.processItem();
				}
			}
		}
	}
	
	private static void lowerItem() {
		if (Player.holdingRod) {
			if (ImagePanel.imageItemX < 500) {
				ImagePanel.imageItemX += 20;
			} else {
				// put away rod
				loweringItem = false;
				Item.putItemAway();
				ImagePanel.imageItemY = 0;
				Item.checkRod();
				Player.fishing = false;
				heardSound = false;
			}
		} else {
			if (ImagePanel.imageItemY < 512) {
				ImagePanel.imageItemY += 20;
			} else {
				loweringItem = false;
				Item.putItemAway();
				ImagePanel.imageItemY = 0;
			}
		}
	}
	
	private static void takeCup() {
		if (ImagePanel.image4Y < 122) {
			ImagePanel.image4Y += 3;
		} else {
			takingCup = false;
			ImagePanel.image6Y = 100;
			raisingCup = true;
			Player.sipping = true;
		}
	}
	
	private static void placeCup() {
		if (ImagePanel.image4Y > 3) {
			ImagePanel.image4Y -= 3;
		} else {
			ImagePanel.image4Y = 0;
			placingCup = false;
			Player.sipping = false;
			Audio.startTeaSet();
			Keyboard.startInput();
		}
	}
	
	private static void raiseCup() {
		if (ImagePanel.image6Y > 4) {
			ImagePanel.image6Y -= 4;
		} else {
			raisingCup = false;
			Player.sipped = true;
			setWait(30,6);
		}
	}
	
	private static void lowerCup() {
		if (ImagePanel.image6Y < 100) {
			ImagePanel.image6Y += 2;
		} else {
			loweringCup = false;
			placingCup = true;
			Player.sipping = false;
		}
	}
	
	private static void todSip1() {
		setWait(36,7);
		todSipping1 = false;
	}
	
	private static void todSip2() {
		setWait(36,8);
		todSipping2 = false;
	}
	
	private static void todSip3() {
		setWait(36,9);
		todSipping3 = false;
	}
	
	private static void moveSpace() {
		if (ImagePanel.spaceX > -6454) {
			ImagePanel.spaceX -= 1;
		} else {
			ImagePanel.spaceX = 0;
		}
	}
	
	private static void cycleSamadhi() {
		if (samadhiCheck == 61) {
			if (Mouse.disallowSamadhi && endSamadhiSequenceDelay > 0) {
				if (tick > endSamadhiSequenceDelay) {
					endSamadhiSequenceDelay++;
					tick = 0;
					samadhiCheck = 0;
				}
			} else {
				samadhiCheck = 0;
			}
		} else {
			if (Mouse.disallowSamadhi && endSamadhiSequenceDelay > 0) {
				if (tick > endSamadhiSequenceDelay) {
					
					if (endSamadhiSequenceDelay == 66) {
						cyclingSamadhi = false;
						
						setWait(250,104);
					} else if (endSamadhiSequenceDelay > 17) {
						endSamadhiSequenceDelay += 4;
					} else {
						endSamadhiSequenceDelay++;
					}
					
					System.out.println(endSamadhiSequenceDelay);
					tick = 0;
					samadhiCheck++;
				}
			} else {
				samadhiCheck++;
			}
		}
		
		// skips banned images
		while (Data.bannedSamadhiImages.contains(Data.samadhiImages.get(samadhiCheck))) {
			if (samadhiCheck == 61) {
				samadhiCheck = 0;
			} else {
				samadhiCheck++;
			}
		}
		
		samadhiSelect = Data.samadhiImages.get(samadhiCheck);
	}
	
	private static void endSamadhiSequence() {
		//System.out.println(tick);
		
		if (tick > 100) {
			endSamadhiSequenceDelay = 1;
			endSamadhiSequence = false;
		}
	}
	
	private static void rollCredits() {
		//System.out.println(ImagePanel.creditsY);
		
		if (ImagePanel.creditsY > ImagePanel.creditsLength) {
			ImagePanel.creditsY -= 2; // 2 is good
		} else {
			rollingCredits = false;
			displayingCredits = false;
			
			fadingOut = false;
			ImagePanel.opacity = 255;
			fadingOut = false;
			setWait(120,105);
		}
	}
}