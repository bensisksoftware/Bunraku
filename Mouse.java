public class Mouse {
	public static float x;
	public static float y;
	public static int clicks = 0;
	public static boolean disallowSamadhi;
	
	public static void checkHUD() {
		if (!Player.holdingItem 
			&& !Animation.openingMessage 
			&& !Player.readingMessage
			&& !Player.holdingFish1
			&& !Player.holdingFish2
			&& !Animation.waiting
			&& !Animation.rewinding
			&& !Animation.fastforwarding
			&& !Player.fishing
			&& !Player.busy
			&& !Player.disableWalk
			&& !Animation.openingEyes
			&& !Animation.closingEyes
			&& !Player.inTrance
			&& !Player.leavingTods
			&& !Player.holdingRod
			&& !Player.holdingCorn
			&& !Player.examiningPlaque
			&& !Player.examiningT25WWSign
			&& !Player.examiningRedBook
			&& !Player.examiningBlackBook
			&& !Player.examiningBlueBook
			&& !Player.visualizingFish
			&& !Player.visualizingKnot
			&& !Player.visualizingLotus
			&& !Player.examiningOm
			&& !Player.examiningNi
			&& !Player.examiningGo
			&& !Player.examiningYu
			&& !Player.examiningJi
			&& !Player.examiningRa
			&& !Player.examiningShi
			&& !Player.holdingOm
			&& !Player.holdingNi
			&& !Player.holdingGo
			&& !Player.holdingYu
			&& !Player.holdingJi
			&& !Player.holdingRa
			&& !Player.holdingShi
			&& !Player.holdingGun
			&& !Player.shooting
			&& !Player.holdingDoll
			&& !Player.holdingACBook
			&& !Player.holdingRedBook
			&& !Player.holdingBlueBook
			&& !Player.holdingBlackBook
			&& !Player.examiningPaperSlip
			&& !Player.holdingGoldPaper
			&& !Player.holdingItem
			&& !Player.onPhone
			&& !Player.sipping
			&& !Player.holdingShopCase
			&& !Player.talkingToKimi
			&& !Player.checkingInventory
			&& !Player.position.equals("h11sRoom")
			&& !Player.position.equals("gTV")
			&& !Player.position.equals("hTV")
			&& !Player.position.equals("tTV")
			&& !Player.position.equals("gTVControls")
			&& !Player.position.equals("hTVControls")
			&& !Player.position.equals("tTVControls")
			&& (y < 35 || y > 375)) {
			ImagePanel.hudVisible = true;
		} else {
			ImagePanel.hudVisible = false;
		}
	}
	
	public static String getPlayerAction() {
		String s = "";
		
		if (x < 107)
			s = "left";
		
		if (x > 443)
			s = "right";
		
		if (x >= 107 && x <= 443)
			s = "center";
		
		return s;
	}
	
	public static void processClick() {
		if (!Player.meditating) // this retains oldPosition
			Player.oldPosition = Player.position;
		
		// inventory cycle left
		if (Player.checkingInventory 
		&& Animation.cyclingInventoryCenter
		&& Player.inventoryList.size() > 1
		&& Mouse.x > 39 && Mouse.x < 99 && Mouse.y > 169 && Mouse.y < 252)
			Item.cycleLeft();
			
		// inventory cycle right
		if (Player.checkingInventory 
		&& Animation.cyclingInventoryCenter
		&& Player.inventoryList.size() > 1
		&& Mouse.x > 445 && Mouse.x < 505 && Mouse.y > 175 && Mouse.y < 247)
			Item.cycleRight();
			
		// inventory Close
		if (Player.checkingInventory
		&& Mouse.x > 254 && Mouse.x < 287 && Mouse.y > 369 && Mouse.y < 405) {
			Item.closeInventory();
		}
		
		// inventory click item
		if (Player.checkingInventory && Mouse.x > 103 && Mouse.x < 440 && Mouse.y > 101 && Mouse.y < 315) {
			Item.clickedItem = true;
			Item.closeInventory();
		}
		
		// Process Item (such as reel rod)
		if (Player.holdingItem()) {
			Item.processItem();
		}
		
		// click fish2
		if (Player.holdingFish2 && !Animation.raisingFish && !Animation.loweringFish&& !Animation.waiting) {
			if (Player.symbolsMemorized.contains("fish")) {
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.loweringFish = true;
			} else {
				Player.symbolsMemorized.add(Item.fish);
				Player.memorizedFish = true;
				Audio.startMemorized();
				Animation.setWait(60,23);
			}
		} 
		
		// click fish1
		if (Player.holdingFish1	&& !Animation.raisingFish && !Animation.loweringFish && !Animation.waiting) {
			Player.holdingFish1 = false;
			Player.holdingFish2 = true;
		}
		
		// TURN LEFT
		if (getPlayerAction().equals("left") && !ImagePanel.hudVisible && !Player.disableWalk)
			ClickLeft.turnLeft();
		
		// TURN RIGHT
		if (getPlayerAction().equals("right") && !ImagePanel.hudVisible && !Player.disableWalk)
			ClickRight.turnRight();
		
		// CLICK CENTER
		if (getPlayerAction().equals("center") && !ImagePanel.hudVisible && !Player.disableWalk) {
			ClickCenter.clickCenter();
		}
		
		// MEDITATE
		if (ImagePanel.hudVisible && x > 234 && x < 310 && y < 50)
			Player.meditate();
		
		// OPEN INVENTORY
		if (ImagePanel.hudVisible && x > 247 && x < 297 && y > 350) {
			if (Item.closingInventory) {
				Item.closingInventory = false;
			} else {
				Player.openInventory(); 
			}
		}
		
		if (Player.position.equals("gameOver")) {
			Data.wipeGame();
		}
		
		// this happens after everything else. call control center
		Data.printData();
	}
}