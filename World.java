import java.util.ArrayList;

public class World {
	public static boolean orangeAlive;
	public static boolean greenAlive;
	public static boolean purpleAlive;
	public static boolean orangeAtTV;
	public static boolean greenAtTV;
	public static boolean purpleAtTV;
	public static boolean lightFadeOn;
	public static boolean prepHReaper;
	public static boolean scrollCloseable;
	public static boolean shopkeeperPresent;
	public static boolean OOO;
	public static boolean OOX;
	public static boolean OXO;
	public static boolean OXX;
	public static boolean XOO;
	public static boolean XOX;
	public static boolean XXO;
	public static boolean open;
	public static boolean htapeStart;
	public static boolean htapeEnd;
	public static boolean buttonPushed;
	public static boolean dark;
	public static boolean raDropped;
	public static boolean reaperTapped;
	public static boolean safeOpened;
	public static boolean h18eOnStart;
	public static boolean t5nOpened;
	public static boolean hrTVOn;
	public static boolean t48eGateOpen;
	public static boolean displayingTReaper1;
	public static boolean displayingTReaper2;
	public static boolean displayingTReaperShoot;
	public static boolean reaper1PulledGun;
	public static boolean reaper1Standing;
	public static boolean shopCaseOpen;
	public static boolean kimiScheduled;
	public static boolean g9DoorOpen;
	public static boolean satchelOpen;
	public static boolean darkDoorOpen;
	
	public static int fishWaitTime = 400;
	public static int fishWindow = 122;
	public static int tGateLimit = -290;
	public static int gShrineTrance = -1;
	public static int hShrineTrance = -1;
	public static int tShrineTrance = -1;
	public static int tranceDelay = 80; // 80 is perf
	
	public static ArrayList<String> gChant = new ArrayList();
	public static ArrayList<String> hChant = new ArrayList();
	public static ArrayList<String> tChant = new ArrayList();
	
	public static String todStatus = "";
	
	public static void setShrines() {
		gChant.add("ni");
		gChant.add("yu");
		gChant.add("ji");
		gChant.add("om");
		gChant.add("om");
		gChant.add("shi");
		gChant.add("shi");
		gChant.add("ji");
		gChant.add("shi");
		gChant.add("ra");
		gChant.add("om");
		gChant.add("go");
		gChant.add("shi");
		gChant.add("shi");
		
		hChant.add("go");
		hChant.add("ji");
		hChant.add("go");
		hChant.add("ji");
		hChant.add("yu");
		hChant.add("ra");
		hChant.add("shi");
		hChant.add("om");
		hChant.add("ji");
		hChant.add("go");
		hChant.add("ji");
		hChant.add("ni");
		hChant.add("ra");
		hChant.add("shi");
		
		tChant.add("om");
		tChant.add("ra");
		tChant.add("yu");
		tChant.add("ni");
		tChant.add("shi");
		tChant.add("yu");
		tChant.add("ra");
		tChant.add("go");
		tChant.add("ni");
		tChant.add("yu");
		tChant.add("ji");
		tChant.add("shi");
		tChant.add("yu");
		tChant.add("ra");
		
	}
	
	public static void checkShrine() {
		// shift chants in arraylist to the left if list > max
		if (Player.chantInputs.size() > 14) {
			for(int i = 0; i < Player.chantInputs.size()-1; i++) {
				Player.chantInputs.set(i, Player.chantInputs.get(i+1)); 
			}
			
			Player.chantInputs.remove(Player.chantInputs.size() -1);
		}
		
		System.out.println(Player.chantInputs);
		
		if (Player.breathed) {
			System.out.println("Player breathed");
		} else {
			System.out.println("Player did NOT breathe");
		}
		
		if (Player.visualizingKnot) {
			System.out.println("Player is visualizing knot");
		} else if (Player.visualizingFish) {
			System.out.println("Player is visualizing fish");
		} else if (Player.visualizingLotus) {
			System.out.println("Player is visualizing lotus");
		} else {
			System.out.println("Player is NOT visualizing");
		}
		
		if (Player.chantInputs.equals(gChant) || Player.chantInputs.equals(hChant) || Player.chantInputs.equals(tChant)) {
			System.out.println("chant is correct");
		} else {
			System.out.println("chant is NOT correct");
		}
		
		System.out.println("pChant " + Player.chantInputs);
		System.out.println("gChant " + gChant);
		System.out.println("hChant " + hChant);
		System.out.println("tChant " + tChant);
		System.out.println("old pos " + Player.oldPosition);
		
		// WHY IS THIS NOT WORKING?!
		if ((Player.oldPosition.equals("g9rs")
			&& Player.breathed
			&& Player.chantInputs.equals(gChant)
			&& Player.visualizingKnot) 
		||	(Player.oldPosition.equals("h1e")
			&& Player.breathed
			&& Player.chantInputs.equals(hChant)
			&& Player.visualizingLotus) 
		||	(Player.oldPosition.equals("t7n shrine")
			&& Player.breathed
			&& Player.chantInputs.equals(tChant)
			&& Player.visualizingFish)) {
				Player.trance();
		} else {
			Message.readMeditating5();
		}
	}
	
	public static void eventAfterOpenEyes() {
		if (Player.position.equals("tod")) {
			todStatus = "confused";
			Message.readTod67();
		}
			
	}
	
	public static void pressRewind() {
		System.out.println("World.pressRewind()");
		Audio.startTVButton();
		
		if (Player.position.equals("gTVControls")) {
			if (purpleAlive) {
				// can't rewind
				Message.readTVRW2();
			} else {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,24);
			}		
		}
		
		if (Player.position.equals("hTVControls")) {
			if (orangeAlive) {
				// can't rewind
				Message.readTVRW2();
			} else {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,24);
			}		
		}
		
		if (Player.position.equals("tTVControls")) {
			if (greenAlive) {
				// can't rewind
				Message.readTVRW2();
			} else {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,24);
			}
		}
	}
	
	public static void pressPlay() {
		System.out.println("World.pressPlay()");
		Audio.startTVButton();
		
		if (Player.position.equals("gTVControls")) {
			if (purpleAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				orangeAtTV = true;
				playPurple();
			} else {
				Message.readTVPlaying();
			}		
		}
		
		if (Player.position.equals("hTVControls")) {
			if (orangeAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				greenAtTV = true;
				playOrange();
			} else {
				Message.readTVPlaying();
			}
		}
		
		if (Player.position.equals("hrTVControls")) {
			Player.setBusy(true);
			Player.setDisableWalk(true);
			Audio.loadTomita();
			Animation.setWait(40,61);
		}
		
		if (Player.position.equals("tTVControls")) {
			if (greenAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				purpleAtTV = true;
				playGreen();
			} else {
				Message.readTVPlaying();
			}
		}
	}
	
	public static void pressFastforward() {
		System.out.println("World.pressFastforward()");
		Audio.startTVButton();
		
		if (Player.position.equals("gTVControls")) {
			if (purpleAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,25);
			} else {
				// can't fastforward
				Message.readTVFF2();
			}		
		}
		
		if (Player.position.equals("hTVControls")) {
			if (orangeAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,25);
			} else {
				// can't fastforward
				Message.readTVFF2();
			}
		}
		
		if (Player.position.equals("tTVControls")) {
			if (greenAlive) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.setWait(25,25);
			} else {
				// can't fastforward
				Message.readTVFF2();
			}
		}
	}
	
	public static void pressPause() {
		System.out.println("World.pressPause()");
		Audio.startTVButton();
	}
	
	public static void pressStop() {
		System.out.println("World.pressStop()");
		Audio.startTVButton();
	}
	
	public static void exitTV() {
		if (Player.position.equals("gTVControls")) {
			Player.position = "gTV";		
		}
		
		if (Player.position.equals("hTVControls")) {
			Player.position = "hTV";
		}
		
		if (Player.position.equals("tTVControls")) {
			Player.position = "tTV";
		}
	}
	
	public static void startRewind() {
		Player.setBusy(true);
		Player.setDisableWalk(true);
		Audio.startVCR();
		exitTV();
		ImagePanel.image8Y = 285;
		ImagePanel.image9Y = 285 * 2;
		Animation.rewinding = true;
		Animation.movingStatic = true;
		
		switch (Player.position) {
			case "gTV":
				Animation.setWait(40,52);
				break;
			case "hTV":
				Animation.displayingHTapeDie4 = true;
				Animation.setWait(40,27);
				break;
			case "tTV":
				Animation.setWait(40,47);
				break;
			default:
				System.out.println("World.startFastForward error");
				break;
		}
	}
	
	public static void startFastforward() {
		Player.setBusy(true);
		Player.setDisableWalk(true);
		Audio.startVCR();
		exitTV();
		ImagePanel.image8Y = 285; // static set
		ImagePanel.image9Y = 285 * 2;
		Animation.fastforwarding = true;
		Animation.movingStatic = true;
		
		switch (Player.position) {
			case "gTV":
				Animation.setWait(75,57);
				break;
			case "hTV":
				ImagePanel.image2X = -50;
				Animation.displayingHTapeReaper1 = true;
				Animation.setWait(40,34);
				break;
			case "tTV":
				Animation.setWait(40,41);
				break;
			default:
				System.out.println("World.startFastForward error");
				break;
		}
	}
	
	public static void endRewind() {
		if (Player.position.equals("hTV"))
			orangeAlive = true;
		
		if (Player.position.equals("tTV"))
			greenAlive = true;
		
		if (Player.position.equals("gTV"))
			purpleAlive = true;
	
		Animation.rewinding = false;
		Animation.movingStatic = false;
		Audio.startTapeSet();
		Audio.stopVCR();
		Player.setBusy(false);
		Player.setDisableWalk(false);
		resetBulbs();
		Message.readTVRW1();
		ImagePanel.resetImages();
		System.out.println("World.endRewind() & reset images");
	}
	
	public static void endFastforward() {
		if (Player.position.equals("hTV"))
			wipeOrange();
		
		if (Player.position.equals("tTV"))
			wipeGreen();
		
		if (Player.position.equals("gTV"))
			wipePurple();
		
		Animation.fastforwarding = false;
		Animation.movingStatic = false;
		Audio.startTapeSet();
		Audio.stopVCR();
		Player.setBusy(false);
		Player.setDisableWalk(false);
		resetBulbs();
		Message.readTVFF1();
		ImagePanel.resetImages();
		System.out.println("World.endFastForward() & reset images");
	}
	
	public static void playOrange() {
		Animation.faded = true;
		wipeTVImages();
		ImagePanel.resetImages();
		ImagePanel.opacity = 255;
		Data.saveGreenInventory();
		Player.inventoryList.clear();

		if (orangeAtTV) {
			if (purpleAlive)
				Animation.displayingGTVpaperCranes = true;
					
			Player.position = "g9rs";
			Data.restoreOrangeInventory();
			Animation.setWait(50, 26);
		} else {
			Player.position = "g1n";
			Animation.setWait(50, 26);
		}
	}
	
	public static void playGreen() {
		Animation.faded = true;
		wipeTVImages();
		ImagePanel.resetImages();
		ImagePanel.opacity = 255;
		Data.savePurpleInventory();
		Player.inventoryList.clear();

		if (greenAtTV) {
			Player.position = "h18e";
			Data.restoreGreenInventory();
			Animation.setWait(50, 26);
		} else {
			Player.position = "h1e";
			Animation.setWait(50, 26);
		}
	}
	
	public static void playPurple() {
		Animation.faded = true;
		wipeTVImages();
		ImagePanel.resetImages();
		ImagePanel.opacity = 255;
		Data.saveOrangeInventory();
		Player.inventoryList.clear();

		if (purpleAtTV) {
			Player.position = "t48e";
			Data.restorePurpleInventory();
			ImagePanel.image2Y = tGateLimit;
			Animation.setWait(50, 26);
		} else {
			Player.position = "t45n";
			Animation.setWait(50, 26);
		}
	}
	
	public static void wipeOrange() {
		orangeAlive = false;
		orangeAtTV = false;
		g9DoorOpen = false;
		Player.hasOm = false;
		Player.hasJi = false;
		
		if (!Player.position.equals("hTV"))
			Player.inventoryList.clear();
		
		Player.sawReaper1 = false;
		reaper1PulledGun = false;
		Animation.reaper1Snatching = false;
		Animation.reaper1WalkingLeft = false;
		Animation.reaper1Approaching = false;
		reaper1Standing = false;
		Player.orangeSavedInventory.clear();
	}
	
	public static void wipeGreen() {
		greenAlive = false;
		greenAtTV = false;
		ImagePanel.bladeDegree = 0;
		ImagePanel.hBladeX = 0;
		Player.hasNi = false;
		Player.hasRa = false;
		Player.caughtFish = false;
		Player.hasRod = false;
		Player.hasCorn = false;
		Player.hadCorn = false;
		Player.ateCorn = false;
		Player.hasGoldPaper = false;
		raDropped = false;
			
		if (!Player.position.equals("tTV"))
			Player.inventoryList.clear();
		
		Player.greenSavedInventory.clear();
	}
	
	public static void wipePurple() {
		purpleAlive = false;
		purpleAtTV = false;
		reaperTapped = false;
		safeOpened = false;
		Player.knowsGotShi = false;
		t5nOpened = false;
		Player.hasGo = false;
		Player.hasYu = false;
		Player.hasShi = false;
			
		if (!Player.position.equals("gTV"))
			Player.inventoryList.clear();
		
		Player.purpleSavedInventory.clear();
	}
	
	public static void resetBulbs() {
		if (orangeAlive && greenAlive && purpleAlive) {
			wipeBulbs();
			OOO = true;
			System.out.println("OOO");
		}
		
		if (orangeAlive && greenAlive && !purpleAlive) {
			wipeBulbs();
			OOX = true;
			System.out.println("OOX");
		}
		
		if (orangeAlive && !greenAlive && purpleAlive) {
			wipeBulbs();
			OXO = true;
			System.out.println("OXO");
		}
		
		if (!orangeAlive && greenAlive && purpleAlive) {
			wipeBulbs();
			XOO = true;
			System.out.println("XOO");
		}
		
		if (orangeAlive && !greenAlive && !purpleAlive) {
			wipeBulbs();
			OXX = true;
			System.out.println("OXX");
		}
		
		if (!orangeAlive && greenAlive && !purpleAlive) {
			wipeBulbs();
			XOX = true;
			System.out.println("XOX");
		}
		
		if (!orangeAlive && !greenAlive && purpleAlive) {
			wipeBulbs();
			XXO = true;
			System.out.println("XXO");
		}
	}
	
	public static void wipeBulbs() {
		OOO = false;
		OOX = false;
		OXO = false;
		XOO = false;
		OXX = false;
		XXO = false;
		XOX = false;
	}
	
	public static void wipeTVImages() {
		Animation.displayingGTVmonkFront = false;
		Animation.displayingGTVmonkBack = false;
		Animation.displayingGTVmonkDie = false;
		Animation.displayingGTVmonkRight = false;
		Animation.displayingGTVreaperGun = false;
		Animation.displayingGTVreaperLeave = false;
		Animation.displayingGTVpaperCranes = false;
		Animation.displayingHTapeReaper1 = false;
		Animation.displayingHTapeReaper2 = false;
		Animation.displayingHTapeMonk1 = false;
		Animation.displayingHTapeMonk2 = false;
		Animation.displayingHTapeDie1 = false;
		Animation.displayingHTapeDie2 = false;
		Animation.displayingHTapeDie3 = false;
		Animation.displayingHTapeDie4 = false;
		Animation.displayingTVCRmonkLeft = false;
		Animation.displayingTVCRmonkRight = false;
		Animation.displayingTVCRmonkFront = false;
		Animation.displayingTVCRreaperBack = false;
		Animation.displayingTVCRreaperLeft = false;
		Animation.displayingTVCRbleed1 = false;
		Animation.displayingTVCRbleed2 = false;
		Animation.displayingTVCRmonkDie1 = false;
		Animation.displayingTVCRmonkDie2 = false;
		Animation.displayingTVCRbase = false;
		Animation.movingHTapeReaper1 = false;
		Animation.movingHTapeReaper2 = false;
		Animation.movingHTapeMonk1 = false;
		Animation.movingTVCRmonkLeft = false;
		Animation.movingTVCRmonkRight = false;
		Animation.movingTVCRreaperLeft = false;
		Animation.movingTVCRreaperBack = false;
	}
	public static void assignTranceToShrine() {
		switch (Player.oldPosition) {
			case "g9rs":
				if (gShrineTrance == -1)
					gShrineTrance = Player.trancesTranced;
				break;
			case "h1e":
				if (hShrineTrance == -1)
					hShrineTrance = Player.trancesTranced;
				break;
			case "t7n shrine":
				if (tShrineTrance == -1)
					tShrineTrance = Player.trancesTranced;
				break;
			default:
				System.out.println("World.assignTranceToShrine() error");
				break;
		}
	}
	
	public static void endScene() {
		System.out.println("World.endScene()");
		
		switch (Player.position) {
			case "g30e":
				Audio.startEquip2();
				reaper1PulledGun = false;
				Animation.reaper1Snatching = true;
				Player.bodhisattva = true;
				Animation.setWait(60,100);
				break;
			case "h2w":
				Audio.startEquip2();
				Animation.displayingHReaper1 = false;
				Animation.displayingHReaperUnarmed = true;
				Player.bodhisattva = true;
				Animation.setWait(60,101);
				break;
			case "t1e":
				Audio.startEquip2();
				displayingTReaper2 = true;
				Player.bodhisattva = true;
				Animation.setWait(60,101);
				break;
			default:
				System.out.println("World.endScene() error");
				break;
		}
	}
	
	public static void eventAfterPan() {
		switch (Player.position) {
			case "g10w":
				if (Player.dreaming && !Player.sawReflection) {
					Audio.startAcid();
					Player.sawReflection = true;
				}
				break;
			case "g15n":
				if (Player.dreaming && !Player.sawReflection) {
					Audio.startAcid();
					Player.sawReflection = true;
				}
				break;
			case "g27n":
				if (!Player.sawReaper1 && !Player.dreaming) {
					Audio.startAcid();
				}
				break;
			case "g30e":
				if (!Player.dreaming) {
					Player.setBusy(true);
					ImagePanel.image2X = 120;
					Animation.reaper1WalkingLeft = true;
				}
				break;
			case "g31w":
				if (Player.holdingGun && !Player.spokeToMonk) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Animation.setWait(25,63);
				}
				break;
			case "h14e":
				ImagePanel.resetImages();
				break;
			case "h14w":
				ImagePanel.resetImages();
				break;
			case "t1s":
				if (reaperTapped) {
					Player.oldPosition = "t1s";
					reaperTapped = false;
					ImagePanel.imageOutgoing2Y = -Bunraku.height;
					ClickLeft.turnLeft();
				}
				break;
			case "t1e":
				ImagePanel.resetImages();
				Audio.startAcid();
				Animation.setWait(30,75);
				break;
			case "t5w":
				ImagePanel.imageOutgoing3Y = 0;
				ImagePanel.image3Y = 0;
				World.t5nOpened = false;
				break;
			case "t5e":
				ImagePanel.imageOutgoing3Y = 0;
				ImagePanel.image3Y = 0;
				World.t5nOpened = false;
				break;
			case "t48n":
				ImagePanel.image1Y = 0;
				ImagePanel.imageOutgoing2Y = 0;
				break;
			case "t48e":
				ImagePanel.image1Y = 0;
				ImagePanel.imageOutgoing2Y = 0;
				ImagePanel.image2X = 0;
				ImagePanel.image3X = 0;
				break;
			case "t48s":
				ImagePanel.image1Y = 0;
				ImagePanel.imageOutgoing2Y = 0;
				break;
			default:
			
			break;
		}
	}
	
	public static boolean positionPannable() {
		switch (Player.position) {
			case "title":
				return false;
			case "g4w":
				if (Mouse.x > 275) {
					return false;
				} else {
					return true;
				}
			case "g6n":
				if (Player.holdingACBook) {
					return false;
				} else {
					return true;
				}
			case "g9rw":
				if (satchelOpen) {
					return false;
				} else {
					return true;
				}
			case "g9rn":
				if (Mouse.x > 468 && Mouse.x < 544 && Mouse.y > 125 && Mouse.y < 226) {
					return false;
				} else {
					return true;
				}
			case "g9re":
				if (Player.examiningPlaque) {
					return false;
				} else {
					return true;
				}
			case "g14s":
				if (Mouse.x < 200) {
					return false;
				} else {
					return true;
				}
			case "g14se":
				if (Mouse.x > 400) {
					return false;
				} else {
					return true;
				}
			case "gTV":
				return false;
			case "gTVControls":
				return false;
			case "g18w":
				if (Mouse.x > 393 && Mouse.x < 538 && Mouse.y > 7 && Mouse.y < 113 && !ImagePanel.hudVisible) {
					return false;
				} else {
					return true;
				}
			case "h8s":
				if (Player.holdingFish1 || Player.holdingFish2) {
					return false;
				} else {
					return true;
				}
			case "h11s":
				if (Mouse.x > 90 && Mouse.x < 167 && Mouse.y > 216 && Mouse.y < 287) {
					return false;
				} else {
					return true;
				}
			case "h11sRoom":
				return false;
			case "h12e":
				if (Mouse.x > 25 && Mouse.x < 191 && Mouse.y > 131 && Mouse.y < 317) {
					return false;
				} else {
					return true;
				}
			case "h15n":
				if (Player.onPhone || (Mouse.x > 5 && Mouse.x < 99 && Mouse.y > 160 && Mouse.y < 299)) {
					System.out.println("World.positionPannable() = false");
					return false;
				} else {
					return true;
				}
			case "h18s":
				if (Player.holdingRedBook || Player.holdingBlueBook || Player.holdingBlackBook) {
					return false;
				} else {
					return true;
				}
			case "hTV":
				return false;
			case "hTVControls":
				return false;
			case "hrTV":
				return false;
			case "hrTVControls":
				return false;
			case "t1n":
				if (Mouse.x > 435 && Mouse.x < 507 && Mouse.y > 116 && Mouse.y < 325) {
					return false;
				} else {
					return true;
				}
			case "t5n":
				if (Player.examiningGo) {
					return false;
				} else {
					return true;
				}
			case "t6w":
				if (Player.examiningPaperSlip) {
					return false;
				} else {
					return true;
				}
			case "t7n":
				if (Mouse.x > 420 && Mouse.x < 532 && Mouse.y > 164 && Mouse.y < 306) {
					return false;
				} else {
					return true;
				}
			case "t7e":
				if (Mouse.x > 440) {
					return false;
				} else {
					return true;
				}
			case "t7se":
				if (Mouse.x < 110) {
					return false;
				} else {
					return true;
				}
			case "t7n shrine":
				return false;
			case "t9n shop":
				return false;
			case "t11w":
				if (Mouse.x < 107) {
					return false;
				} else {
					return true;
				}
			case "t11sw":
				if (Mouse.x > 443) {
					return false;
				} else {
					return true;
				}
			case "t12n":
				return false;
			case "t12nw":
				if (Mouse.x < 107) {
					return true;
				} else {
					return false;
				}
			case "t12ne":
				if (Mouse.x > 443) {
					return true;
				} else {
					return false;
				}
			case "t25ww":
				return false;
			case "t48n":
				if (Mouse.x > 421 && Mouse.x < 466 && Mouse.y > 38 && Mouse.y < 190) {
					return false;
				} else {
					return true;
				}
			case "tTV":
				return false;
			case "tTVControls":
				return false;
			case "tod":
				return false;
			default:
				//System.out.println("World.positionPannable() = true");
				return true;
		}
	}
}