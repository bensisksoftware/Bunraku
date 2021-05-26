import java.util.Arrays;

public class Item {
	public static boolean fishingRodBent;
	public static boolean closingInventory;
	public static boolean clickedItem;
	public static boolean cornOnRod;
	public static boolean ringing;
	
	public static int bookPage = 0;
	public static int numberTimesClickedPhone = 0;
	public static int dialToneTime = 880;
	public static int[] phoneNumber = {1,9,6,7,0,8,6,4};
	public static int[] phoneInputs = new int[8];
	public static String[] inventory = new String[8];
	
	public static String lotus = "lotus";
	public static String knot  = "knot";
	public static String fish = "fish";
	public static String om = "om";
	public static String ni = "ni";
	public static String go = "go";
	public static String yu = "yu";
	public static String ji = "ji";
	public static String ra = "ra";
	public static String shi = "shi";
	public static String rod = "rod";
	public static String corn = "corn";
	public static String gun = "gun";
	public static String paper = "paper";
	
	public static void processItem() {
		Animation.heardSound = false;
		if (Player.holdingRod) {
			Audio.startReel();
			
			if (fishingRodBent) {
				Player.caughtFish = true;
			}
			
			Animation.heardSound = false;
			Player.fishing = false;
			Animation.setWait(22,22);
		}
		
		if (Player.holdingCorn) {
			if (!Message.readingCorn1)
				Message.readCorn1();
		}
		
		if (Player.holdingGoldPaper) {
			if (!World.dark) {
				if (!Player.memorizedLotus) {
					Audio.startMemorized();
					Player.memorizedLotus = true;
					Player.setBusy(true);
					Animation.setWait(60,60);
				} else {
					Player.setBusy(true);
					Animation.loweringGoldPaper = true;
					Audio.startBookOpen();
				}
			} else {
				Message.readTooDarkPaper();
			}
		}
		
		if (Player.holdingOm) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningOm = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingNi) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningNi = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingGo) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningGo = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingYu) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningYu = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingJi) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningJi = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingRa) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningRa = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
		
		if (Player.holdingShi) {
			Player.setBusy(true);
			ImagePanel.scrollY = -250;
			Player.examiningShi = true;
			Animation.openingScroll = true;
			Audio.startScroll();
		}
	}
	
	public static void checkRod() {
		if (Player.caughtFish) {
			ImagePanel.image2Y = Bunraku.height;
			Player.holdingFish1 = true;
			Player.setBusy(true);
			Animation.raisingFish = true;
		} else {
			Player.setBusy(false);
			Player.setDisableWalk(false);
		}
	}
	
	public static void prepCycle() {
		ImagePanel.cyclingItemX = Bunraku.width;
		ImagePanel.cyclingItemY = 200;
		ImagePanel.cyclingItemWidth = 50;
		ImagePanel.cyclingItemHeight = 50;
		Animation.cyclingInventoryInLeft = true;
		Animation.setMovement(11, 0, 0, Bunraku.width, Bunraku.height, 70);
		System.out.println(Player.inventoryList);
	}
	
	public static void cycleLeft() {
		Animation.cyclingInventoryCenter = false;
		Animation.cyclingInventoryOutLeft = true;
		Animation.setMovement(11, 0, 200, 50, 50, 70);
	}
	
	public static void cycleRight() {
		Animation.cyclingInventoryCenter = false;
		Animation.cyclingInventoryOutRight = true;
		Animation.setMovement(11, Bunraku.width, 200, 50, 50, 70);
	}
	
	public static void resetInventoryList() {
		if (Animation.cyclingInventoryInLeft) {
			inventoryShiftLeft();
			
			ImagePanel.cyclingItemX = -50;
			ImagePanel.cyclingItemY = 200;
			ImagePanel.cyclingItemWidth = 50;
			ImagePanel.cyclingItemHeight = 50;
			Animation.tick = 1;
			Animation.setMovement(11, 0, 0, Bunraku.width, Bunraku.height, 70);
		}
		
		if (Animation.cyclingInventoryInRight) {
			inventoryShiftRight();
			ImagePanel.cyclingItemX = Bunraku.width;
			ImagePanel.cyclingItemY = 200;
			ImagePanel.cyclingItemWidth = 50;
			ImagePanel.cyclingItemHeight = 50;
			Animation.tick = 1; 
			Animation.setMovement(11, 0, 0, Bunraku.width, Bunraku.height, 70);
		}
	}
	
	public static void inventoryShiftRight() {
		//make temp variable to hold last element
		String temp = Player.inventoryList.get(Player.inventoryList.size()-1); 

		//make a loop to run through the array list
		for(int i = Player.inventoryList.size()-1; i > 0; i--)
		{
			//set the last element to the value of the 2nd to last element
			Player.inventoryList.set(i,Player.inventoryList.get(i-1)); 
		}
		//set the first element to be the last element
		Player.inventoryList.set(0, temp);  

		System.out.println(Player.inventoryList);
	}
	
	public static void inventoryShiftLeft() {
		//make temp variable to hold first element
		String temp = Player.inventoryList.get(0); 

		//make a loop to run through the array list
		for(int i = 0; i < Player.inventoryList.size()-1; i++)
		{
			//set the first element to the value of the 2nd to first element
			Player.inventoryList.set(i,Player.inventoryList.get(i+1)); 
		}
		//set the last element to be the first element
		Player.inventoryList.set(Player.inventoryList.size()-1, temp);  

		System.out.println(Player.inventoryList);
	}
	
	public static void processInventory() {
		Animation.heardSound = false;
		Player.setDisableWalk(true);
		clickedItem = false;
		switch (Player.inventoryList.get(0)) {
			case "rod":
				Audio.startEquip3();
				ImagePanel.imageItemX = 500;
				Player.setBusy(true);
				Animation.raisingItem = true;
				Player.holdingRod = true;
				break;
			case "corn":
				ImagePanel.imageItemY = 500;
				Player.setBusy(true);
				Animation.raisingItem = true;
				Player.holdingCorn = true;
				break;
			case "paper":
				ImagePanel.imageItemY = 500;
				Player.setBusy(true);
				Animation.raisingItem = true;
				Player.holdingGoldPaper = true;
				Audio.startBookOpen();
				break;
			case "gun":
				ImagePanel.imageItemY = 500;
				Player.setBusy(true);
				Animation.raisingItem = true;
				Player.holdingGun = true;
				Audio.startEquip3();
				break;
			case "om":
				Player.holdingOm = true;
				processItem();
				break;
			case "ni":
				Player.holdingNi = true;
				processItem();
				break;
			case "go":
				Player.holdingGo = true;
				processItem();
				break;
			case "yu":
				Player.holdingYu = true;
				processItem();
				break;
			case "ji":
				Player.holdingJi = true;
				processItem();
				break;
			case "ra":
				Player.holdingRa = true;
				processItem();
				break;
			case "shi":
				Player.holdingShi = true;
				processItem();
				break;
			default:
				System.out.println("Item.processInventory() error");
			break;
		}
	}

	public static void closeInventory() {
		Player.checkingInventory = false;
		Animation.cyclingInventoryCenter = false;
		Animation.cyclingInventoryInLeft = false;
		Animation.cyclingInventoryInRight = false;
		Animation.cyclingInventoryOutLeft = false;
		Animation.cyclingInventoryOutRight = false;
		Item.closingInventory = true;
		Animation.setFadeRate(5);
		Animation.fadingIn = true;
	}			
	
	public static void putItemAway() {
		Player.holdingRod = false;
		Player.holdingCorn = false;
		Player.holdingGoldPaper = false;
	}
	
	public static void bookTurnPage() {
		System.out.println("Item.bookPage = " + bookPage + " (Item.bookTurnPage()");
		
		if (Player.holdingACBook) {
			// click left page
			if (Mouse.x <= 214) {
				Audio.startTurnPage();
				bookPage--;
			}
			
			// click right page
			if (bookPage != 16 && Mouse.x > 214) {
				Audio.startTurnPage();
				bookPage++;	
			}
		}
		
		if (Player.holdingRedBook || Player.holdingBlackBook || Player.holdingBlueBook) {
			// click left page
			if (Mouse.x <= 204) {
				Audio.startTurnPage();
				bookPage--;
			}
			
			// click right page
			if (Mouse.x > 204) {
				if (Player.holdingRedBook && bookPage != 5) {
					Audio.startTurnPage();
					bookPage++;
				} else if (Player.holdingBlackBook && bookPage != 7) {
					Audio.startTurnPage();
					bookPage++;
				} else if (Player.holdingBlueBook && bookPage != 6) {
					Audio.startTurnPage();
					bookPage++;
				}
			}
		}
	}
	
	public static void dialPhone(int n) {
		numberTimesClickedPhone += 1;
		// Shift recorded phone inputs in array
		for (int i = 0; i < phoneInputs.length - 1; i++) {
			phoneInputs[i] = phoneInputs[i + 1];
		}
		
		// Add new phone input
		phoneInputs[7] = n;
		
		Audio.startPhoneButton(n);
		
		if (numberTimesClickedPhone == 8) {
			Animation.tick = 1;
			ringing = true;

			// Check if phone input matches phoneNumber
			if (Arrays.equals(Item.phoneInputs, Item.phoneNumber)) {
				// call correct
				Audio.startKimi();
				
			} else {
				// call wrong
				Audio.startPhoneFail();
			}
			
			numberTimesClickedPhone = 0;
			//Player.setBusy(true);
			//Animation.setWait(dialToneTime,1); 
		}
		
		System.out.println(Arrays.toString(phoneInputs));
	}
	
	public static void wipePhoneNumber() {
		for (int i = 0; i < phoneInputs.length; i++) {
					phoneInputs[i] = 0;
		}
		
		numberTimesClickedPhone = 0;
	}
	
	public static void getScroll() {
		switch (Player.position) {
			case "g9re":
				if (!Player.inventoryList.contains(Item.ji))
					Player.inventoryList.add(Item.ji);
				break;
			case "g18w":
				if (!Player.inventoryList.contains(Item.om))
					Player.inventoryList.add(Item.om);
				break;	
			case "h11sRoom":
				if (!Player.inventoryList.contains(Item.ra))
					Player.inventoryList.add(Item.ra);
				break;
			case "h17n":
				if (!Player.inventoryList.contains(Item.ni))
					Player.inventoryList.add(Item.ni);
				break;
			case "t5n":
				if (!Player.inventoryList.contains(Item.go))
					Player.inventoryList.add(Item.go);
				break;
			case "t9n shop":
				if (!Player.inventoryList.contains(Item.yu))
					Player.inventoryList.add(Item.yu);
				break;
			case "t23e":
				if (!Player.inventoryList.contains(Item.shi))
					Player.inventoryList.add(Item.shi);
				break;
		}
	}
	
}