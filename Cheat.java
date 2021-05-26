public class Cheat {
	public static int colorValueSelected = 1;
	public static int timesTested = 0;
	
	public static void superCheat() {
		System.out.println("\n*SuperCheat Activated* ('s')");
		
		
	}
	
	public static void changePosition() {
		Data.cheating = true;
		Keyboard.startInput();
		System.out.println("CHEATING ACTIVATED");
	}
	
	public static void changeBulb() {
		if (World.OOO) {
			World.orangeAlive = true;
			World.greenAlive = true;
			World.purpleAlive = false;
			World.resetBulbs();
		} else if (World.OOX) {
			World.orangeAlive = true;
			World.greenAlive = false;
			World.purpleAlive = true;
			World.resetBulbs();
		} else if (World.OXO) {
			World.orangeAlive = false;
			World.greenAlive = true;
			World.purpleAlive = true;
			World.resetBulbs();
		} else if (World.XOO) {
			World.orangeAlive = false;
			World.greenAlive = false;
			World.purpleAlive = true;
			World.resetBulbs();
		} else if (World.XXO) {
			World.orangeAlive = false;
			World.greenAlive = true;
			World.purpleAlive = false;
			World.resetBulbs();
		} else if (World.XOX) {
			World.orangeAlive = true;
			World.greenAlive = false;
			World.purpleAlive = false;
			World.resetBulbs();
		} else if (World.OXX) {
			World.orangeAlive = true;
			World.greenAlive = true;
			World.purpleAlive = true;
			World.resetBulbs();
		}
	}
	
	public static void printCoords() {
		System.out.println("\nPlayer.position = " + Player.position
			+ "\nImagePanel.image1X = " + ImagePanel.image1X
			+ "\nImagePanel.image1Y = " + ImagePanel.image1Y
			+ "\nImagePanel.image2X = " + ImagePanel.image2X
			+ "\nImagePanel.image2Y = " + ImagePanel.image2Y
			+ "\nImagePanel.image3Y = " + ImagePanel.image3Y
			+ "\nImagePanel.image3Y = " + ImagePanel.image3Y
			+ "\nImagePanel.image4Y = " + ImagePanel.image4Y
			+ "\nImagePanel.image4Y = " + ImagePanel.image4Y
			+ "\nImagePanel.image5Y = " + ImagePanel.image5Y
			+ "\nImagePanel.image5Y = " + ImagePanel.image5Y
			+ "\nImagePanel.image6Y = " + ImagePanel.image6Y
			+ "\nImagePanel.image6Y = " + ImagePanel.image6Y
			+ "\nImagePanel.scrollY = " + ImagePanel.scrollY
			+ "\nImagePanel.imageItemY = " + ImagePanel.imageItemY
			+ "\nImagePanel.eyelid1Y = " + ImagePanel.eyelid1Y
			+ "\nImagePanel.eyelid2Y = " + ImagePanel.eyelid2Y
			+ "\nAnimation.openingEyes = " + Animation.openingEyes
			+ "\nAnimation.faded = " + Animation.faded
			+ "\nAnimation.fadingOut = " + Animation.fadingOut
			+ "\nAnimation.chantFadingIn = " + Animation.chantFadingIn
			+ "\nAnimation.chantFadingOut = " + Animation.chantFadingOut
			+ "\nAnimation.fadingIn = " + Animation.fadingIn
			+ "\nPlayer.visualizingFish = " + Player.visualizingFish
			+ "\nPlayer.visualizingLotus = " + Player.visualizingLotus
			+ "\nPlayer.visualizingKnot = " + Player.visualizingKnot
			);
	}
	
	public static void printBooleans() {
		System.out.println("\n*Check* ('c')");
		
		
	}
	
	public static void resetBooleans() {
		System.out.println("\n*Reset* ('r')");
		
	}
	
	private static void skipSamadhi() {
		// skip samadhi images
		Data.bannedSamadhiImages.add("s1");
		Data.bannedSamadhiImages.add("s2");
		Data.bannedSamadhiImages.add("s3");
		Data.bannedSamadhiImages.add("s4");
		Data.bannedSamadhiImages.add("s5");
		Data.bannedSamadhiImages.add("s6");
		Data.bannedSamadhiImages.add("s7");
		Data.bannedSamadhiImages.add("s8");
		Data.bannedSamadhiImages.add("s9");
		Data.bannedSamadhiImages.add("s10");
		Data.bannedSamadhiImages.add("s11");
		Data.bannedSamadhiImages.add("s12");
		Data.bannedSamadhiImages.add("s13");
		Data.bannedSamadhiImages.add("s14");
		Data.bannedSamadhiImages.add("s15");
		Data.bannedSamadhiImages.add("s16");
		Data.bannedSamadhiImages.add("s17");
		Data.bannedSamadhiImages.add("s18");
		Data.bannedSamadhiImages.add("s19");
		Data.bannedSamadhiImages.add("s20");
		Data.bannedSamadhiImages.add("s21");
		Data.bannedSamadhiImages.add("s22");
		Data.bannedSamadhiImages.add("s23");
		Data.bannedSamadhiImages.add("s24");
		Data.bannedSamadhiImages.add("s25");
		Data.bannedSamadhiImages.add("s26");
		Data.bannedSamadhiImages.add("s27");
		Data.bannedSamadhiImages.add("s28");
		Data.bannedSamadhiImages.add("s29");
		Data.bannedSamadhiImages.add("s30");
		Data.bannedSamadhiImages.add("s31");
		Data.bannedSamadhiImages.add("s32");
		Data.bannedSamadhiImages.add("s33");
		Data.bannedSamadhiImages.add("s34");
		Data.bannedSamadhiImages.add("s35");
		Data.bannedSamadhiImages.add("s36");
		Data.bannedSamadhiImages.add("s37");
		Data.bannedSamadhiImages.add("s42");
		Data.bannedSamadhiImages.add("s43");
		Data.bannedSamadhiImages.add("s44");
		Data.bannedSamadhiImages.add("s45");
		Data.bannedSamadhiImages.add("s46");
		Data.bannedSamadhiImages.add("s47");
		Data.bannedSamadhiImages.add("s48");
		Data.bannedSamadhiImages.add("s49");
		Data.bannedSamadhiImages.add("s50");
		Data.bannedSamadhiImages.add("s51");
		Data.bannedSamadhiImages.add("s52");
		Data.bannedSamadhiImages.add("s53");
		Data.bannedSamadhiImages.add("s54");
		Data.bannedSamadhiImages.add("s55");
		Data.bannedSamadhiImages.add("s56");
		Data.bannedSamadhiImages.add("s57");
		Data.bannedSamadhiImages.add("s58");
		Data.bannedSamadhiImages.add("s59");
		Data.bannedSamadhiImages.add("s60");
		Data.bannedSamadhiImages.add("s61");
		Data.bannedSamadhiImages.add("s62");
	}
	
	private static void memorize() {
		Player.memorizedKnot = true;
		Player.memorizedFish = true;
		Player.memorizedLotus = true;
		Player.memorizedOm = true;
		Player.memorizedNi = true;
		Player.memorizedGo = true;
		Player.memorizedYu = true;
		Player.memorizedJi = true;
		Player.memorizedRa = true;
		Player.memorizedShi = true;
		Player.symbolsMemorized.add("knot");
		Player.symbolsMemorized.add("fish");
		Player.symbolsMemorized.add("lotus");
		Player.wordsMemorized.add("om");
		Player.wordsMemorized.add("ni");
		Player.wordsMemorized.add("go");
		Player.wordsMemorized.add("yu");
		Player.wordsMemorized.add("ji");
		Player.wordsMemorized.add("ra");
		Player.wordsMemorized.add("shi");
	}
	
	public static void test() {
		System.out.println("Cheat.test()");
		
		Data.loadCredits();
		Animation.displayingCredits = true;
		Animation.rollingCredits = true;
		

		
	}
	
	public static void test2() {
		System.out.println("Cheat.test2()");
		
		
		
	}
	
	public static void testStart() {
		System.out.println("Cheat.testStart()");
		
	}
}