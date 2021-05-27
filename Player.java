import java.util.ArrayList;

public class Player {
	public static String position;
	public static String oldPosition;
	public static boolean busy;
	public static boolean meditating;
	public static boolean breathing;
	public static boolean breathed;
	public static boolean inTrance;
	public static boolean fishing;
	public static boolean readingMessage;
	public static boolean leavingTods;
	public static boolean holdingRod;
	public static boolean holdingCorn;
	public static boolean examiningPlaque;
	public static boolean examiningT25WWSign;
	public static boolean examiningRedBook;
	public static boolean examiningBlackBook;
	public static boolean examiningBlueBook;
	public static boolean dreaming;
	public static boolean spokeToClan;
	public static boolean visualizingFish;
	public static boolean visualizingKnot;
	public static boolean visualizingLotus;
	public static boolean examiningOm;
	public static boolean examiningNi;
	public static boolean examiningGo;
	public static boolean examiningYu;
	public static boolean examiningJi;
	public static boolean examiningRa;
	public static boolean examiningShi;
	public static boolean memorizedOm;
	public static boolean memorizedJi;
	public static boolean memorizedGo;
	public static boolean memorizedYu;
	public static boolean memorizedNi;
	public static boolean memorizedRa;
	public static boolean memorizedShi;
	public static boolean memorizedLotus;
	public static boolean memorizedKnot;
	public static boolean memorizedFish;
	public static boolean hasOm;
	public static boolean hasJi;
	public static boolean hasGo;
	public static boolean hasYu;
	public static boolean hasNi;
	public static boolean hasRa;
	public static boolean hasShi;
	public static boolean holdingOm;
	public static boolean holdingNi;
	public static boolean holdingGo;
	public static boolean holdingYu;
	public static boolean holdingJi;
	public static boolean holdingRa;
	public static boolean holdingShi;
	public static boolean holdingGun;
	public static boolean shooting;
	public static boolean caughtFish;
	public static boolean holdingFish1;
	public static boolean holdingFish2;
	public static boolean hasCorn;
	public static boolean hasRod;
	public static boolean hasGoldPaper; 
	public static boolean holdingDoll;
	public static boolean holdingACBook;
	public static boolean holdingRedBook;
	public static boolean holdingBlueBook;
	public static boolean holdingBlackBook;
	public static boolean examiningPaperSlip;
	public static boolean holdingGoldPaper;
	public static boolean holdingItem;
	public static boolean onPhone;
	public static boolean sipping;
	public static boolean sawReaper1;
	public static boolean holdingShopCase;
	public static boolean hadCorn;
	public static boolean talkingToKimi;
	public static boolean disableWalk;
	public static boolean sipped;
	public static boolean checkingInventory;
	public static boolean ateCorn;
	public static boolean bodhisattva;
	public static boolean knowsYear;
	public static boolean saving;
	public static boolean loading;
	public static boolean exiting;
	public static boolean sawReflection;
	public static boolean cantLeaveKnot;
	public static boolean spokeToMonk;
	public static boolean knowsGotShi;
	public static boolean checkingYuFromInventory;
	
	public static int trancesTranced = 0;
	
	public static ArrayList<String> symbolsMemorized = new ArrayList();
	public static ArrayList<String> wordsMemorized = new ArrayList();
	public static ArrayList<String> inventoryList = new ArrayList();
	public static ArrayList<String> backupInventoryList = new ArrayList();
	public static ArrayList<String> chantInputs = new ArrayList();
	public static ArrayList<String> orangeSavedInventory = new ArrayList();
	public static ArrayList<String> greenSavedInventory = new ArrayList();
	public static ArrayList<String> purpleSavedInventory = new ArrayList();
	
	public static void setBusy(boolean b) {
		busy = b;
		
		//System.out.println("Player.setBusy(" + busy + ")");
	}
	
	public static void meditate() {
		System.out.println("meditate()");
		meditating = true;
		ImagePanel.hudVisible = false;
		Player.setBusy(true);
		setDisableWalk(true);
		ImagePanel.eyelid1Y = -Bunraku.height;
		ImagePanel.eyelid2Y = Bunraku.height;
		Animation.closingEyes = true;
	}
	
	public static void trance() {
		// stop music
		// play trance music
		Audio.stopZen();
		Audio.loadAutechre();
		Audio.startAutechre();
		ImagePanel.setColorValues(0, 0, 0, 128);
		World.lightFadeOn = true;
		Animation.rotatingFractal = false;
		Animation.loweringSymbol = true;
	}
	
	public static void setDisableWalk(boolean d) {
		disableWalk = d;
		
		//System.out.println("Player.setDisableWalk(" + disableWalk + ")");
	}
	
	public static boolean holdingItem() {
		if (holdingRod || holdingCorn || holdingGoldPaper) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void openInventory() {
		Animation.heardSound = false;
		
		if (inventoryList.isEmpty()) {
			Message.readInventoryEmpty();
		} else if ((World.dark) && (!inventoryList.contains(Item.paper)	|| (inventoryList.contains(Item.paper) && (inventoryList.size() > 1))))	{
			Message.readInventoryDark();	
		} else {
			setDisableWalk(true);
			checkingInventory = true;
			ImagePanel.opacity = 0;
			Animation.setFadeRate(4);
			Animation.fadingOut = true;
		}
	}
	
	public static boolean examiningScroll() {
		if (examiningOm
		|| examiningNi
		|| examiningGo 
		|| examiningYu 
		|| examiningJi 
		|| examiningRa 
		|| examiningShi) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void die() {
		if (position.equals("g30e")) {
			if (World.greenAlive) {
				Animation.reaper1Shooting = false;
				Animation.reaper1Snatching= false;
				World.wipeOrange();
				World.resetBulbs();
				Animation.bloody = false;
				Animation.faded = false;
				ImagePanel.resetImages();
				ImagePanel.setFadeGreen();
				Animation.openingEyes = true;
				
				if (World.greenAtTV) {
					Data.restoreGreenInventory();
					Player.position = "h18e";
				} else {
					Player.inventoryList.clear();
					Player.position = "h1e";
				}
			} else {
				Message.readDead();
			}
		}
		
		if (position.equals("h2w")) {
			if (World.purpleAlive) {
				World.wipeGreen();
				World.resetBulbs();
				Animation.bloody = false;
				Animation.faded = false;
				ImagePanel.resetImages();
				ImagePanel.setFadePurple();
				Animation.openingEyes = true;
				
				if (World.purpleAtTV) {
					Data.restorePurpleInventory();
					ImagePanel.image2Y = World.tGateLimit;
					Player.position = "t48e";
				} else {
					Player.inventoryList.clear();
					Player.position = "t45n";
				}
			} else {
				Message.readDead();
			}
		}
		
		if (position.equals("t1e")) {
			if (World.orangeAlive) {
				Animation.reaper1Shooting = false;
				World.wipePurple();
				World.resetBulbs();
				Animation.faded = false;
				ImagePanel.resetImages();
				ImagePanel.setFadeOrange();
				Animation.openingEyes = true;
				
				if (World.orangeAtTV) {
					Data.restoreOrangeInventory();
					Player.position = "g9rs";
				} else {
					Player.inventoryList.clear();
					Player.position = "g1n";
				}
			} else {
				Message.readDead();
			}
		}
	}
}