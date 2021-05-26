import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Data {
	private static String[] data = new String[160];
	public static String[] credits = new String[82];
	public static int xCoord1;
	public static int xCoord2;
	public static int yCoord1;
	public static int yCoord2;
	public static int year = -2137459457;
	
	public static boolean cheating;
	public static boolean button3Pressed;
	public static boolean startedGame;
	
	public static ArrayList<String> samadhiImages = new ArrayList();
	public static ArrayList<String> bannedSamadhiImages = new ArrayList();
	public static ArrayList<String> monkAnswerList = new ArrayList();

	public static void newGame() {
		startedGame = true;
		Player.setBusy(true);
		Player.setDisableWalk(true);
		Audio.stopTitle();
		
		if (!Audio.loadedAudio)
			Audio.loadAudio();
		
		Data.setPostRadiusYear();
		Audio.startZen();
		//ImagePanel.setFadeIntro();
		Player.position = "g1n";
		World.orangeAlive = true;
		World.greenAlive = true;
		World.purpleAlive = true;
		World.resetBulbs();
		World.setShrines();
		setsamadhiImages();
		//World.lightFadeOn = true;
		Animation.openingEyes = true;
		
		/** Testing Section */
		//Cheat.testStart();
	}
	
	public static void loadGame() {
		System.out.println("Data.loadGame()");
		
		if (Player.position.equals("title") || Player.position.equals("loading")) {
			Audio.stopTitle();
			
			if (!Audio.loadedAudio)
				Audio.loadAudio();
		}
		
		Player.setBusy(true);
		Player.setDisableWalk(true);
		
		try {
			File file = new File("resources/saveData/BunrakuSaveData.txt");
			Scanner input = new Scanner(file);
		
			// Read data from file
			for (int i = 0; i < 160; i++) {
				data[i] = input.nextLine();
			}
			
			input.close();
		} catch (Exception ex) {
			System.out.println("Data.loadGame() error");
		}
		
		ImagePanel.image1X = Integer.parseInt(data[0]);
		ImagePanel.image1Y = Integer.parseInt(data[1]);
		ImagePanel.image2X = Integer.parseInt(data[2]);
		ImagePanel.image2Y = Integer.parseInt(data[3]);
		ImagePanel.image3X = Integer.parseInt(data[4]);
		ImagePanel.image3Y = Integer.parseInt(data[5]);
		ImagePanel.image4X = Integer.parseInt(data[6]);
		ImagePanel.image4Y = Integer.parseInt(data[7]);
		ImagePanel.image5X = Integer.parseInt(data[8]);
		ImagePanel.image5Y = Integer.parseInt(data[9]);
		ImagePanel.image6X = Integer.parseInt(data[10]);
		ImagePanel.image6Y = Integer.parseInt(data[11]);
		ImagePanel.image7X = Integer.parseInt(data[12]);
		ImagePanel.image7Y = Integer.parseInt(data[13]);
		ImagePanel.image8X = Integer.parseInt(data[14]);
		ImagePanel.image8Y = Integer.parseInt(data[15]);
		ImagePanel.image9X = Integer.parseInt(data[16]);
		ImagePanel.image9Y = Integer.parseInt(data[17]);
		ImagePanel.image10X = Integer.parseInt(data[18]);
		ImagePanel.image10Y = Integer.parseInt(data[19]);
		ImagePanel.image1Width = Integer.parseInt(data[20]);
		ImagePanel.image1Height = Integer.parseInt(data[21]);
		ImagePanel.image2Width = Integer.parseInt(data[22]);
		ImagePanel.image2Height = Integer.parseInt(data[23]);
		ImagePanel.image3Width = Integer.parseInt(data[24]);
		ImagePanel.image3Height = Integer.parseInt(data[25]);
		ImagePanel.image4Width = Integer.parseInt(data[26]);
		ImagePanel.image4Height = Integer.parseInt(data[27]);
		ImagePanel.image5Width = Integer.parseInt(data[28]);
		ImagePanel.image5Height = Integer.parseInt(data[29]);
		ImagePanel.image6Width = Integer.parseInt(data[30]);
		ImagePanel.image6Height = Integer.parseInt(data[31]);
		ImagePanel.image7Width = Integer.parseInt(data[32]);
		ImagePanel.image7Height = Integer.parseInt(data[33]);
		ImagePanel.image8Width = Integer.parseInt(data[34]);
		ImagePanel.image8Height = Integer.parseInt(data[35]);
		ImagePanel.image9Width = Integer.parseInt(data[36]);
		ImagePanel.image9Height = Integer.parseInt(data[37]);
		ImagePanel.image10Width = Integer.parseInt(data[37]);
		ImagePanel.image10Height = Integer.parseInt(data[38]);
		ImagePanel.imageOutgoing1X = Integer.parseInt(data[40]);
		ImagePanel.imageOutgoing1Y = Integer.parseInt(data[41]);
		ImagePanel.imageOutgoing2X = Integer.parseInt(data[42]);
		ImagePanel.imageOutgoing2Y = Integer.parseInt(data[43]);
		ImagePanel.imageOutgoing3X = Integer.parseInt(data[44]);
		ImagePanel.imageOutgoing3Y = Integer.parseInt(data[45]);
		ImagePanel.imageOutgoing4X = Integer.parseInt(data[46]);
		ImagePanel.imageOutgoing4Y = Integer.parseInt(data[47]);
		ImagePanel.imageOutgoing5X = Integer.parseInt(data[48]);
		ImagePanel.imageOutgoing5Y = Integer.parseInt(data[49]);
		ImagePanel.imageOutgoing6X = Integer.parseInt(data[50]);
		ImagePanel.imageOutgoing6Y = Integer.parseInt(data[51]);
		ImagePanel.imageOutgoing1Width = Integer.parseInt(data[52]);
		ImagePanel.imageOutgoing1Height = Integer.parseInt(data[53]);
		ImagePanel.imageOutgoing2Width = Integer.parseInt(data[54]);
		ImagePanel.imageOutgoing2Height = Integer.parseInt(data[55]);
		ImagePanel.imageOutgoing3Width = Integer.parseInt(data[56]);
		ImagePanel.imageOutgoing3Height = Integer.parseInt(data[57]);
		ImagePanel.imageOutgoing4Width = Integer.parseInt(data[58]);
		ImagePanel.imageOutgoing4Height = Integer.parseInt(data[59]);
		ImagePanel.imageOutgoing5Width = Integer.parseInt(data[60]);
		ImagePanel.imageOutgoing5Height = Integer.parseInt(data[61]);
		ImagePanel.imageOutgoing6Width = Integer.parseInt(data[62]);
		ImagePanel.imageOutgoing6Height = Integer.parseInt(data[63]);
		Player.position = data[64];
		Player.meditating = false;
		if(data[66].equals("true")){Player.dreaming=true;}else{Player.dreaming=false;}
		if(data[67].equals("true")){Player.spokeToClan=true;}else{Player.spokeToClan=false;}
		if(data[68].equals("true")){Player.memorizedOm=true;}else{Player.memorizedOm=false;}
		if(data[69].equals("true")){Player.memorizedJi=true;}else{Player.memorizedJi=false;}
		if(data[70].equals("true")){Player.memorizedGo=true;}else{Player.memorizedGo=false;}
		if(data[71].equals("true")){Player.memorizedYu=true;}else{Player.memorizedYu=false;}
		if(data[72].equals("true")){Player.memorizedNi=true;}else{Player.memorizedNi=false;}
		if(data[73].equals("true")){Player.memorizedRa=true;}else{Player.memorizedRa=false;}
		if(data[74].equals("true")){Player.memorizedShi=true;}else{Player.memorizedShi=false;}
		if(data[75].equals("true")){Player.memorizedLotus=true;}else{Player.memorizedLotus=false;}
		if(data[76].equals("true")){Player.memorizedKnot=true;}else{Player.memorizedKnot=false;}
		if(data[77].equals("true")){Player.memorizedFish=true;}else{Player.memorizedFish=false;}
		if(data[78].equals("true")){Player.hasOm=true;}else{Player.hasOm=false;}
		if(data[79].equals("true")){Player.hasJi=true;}else{Player.hasJi=false;}
		if(data[80].equals("true")){Player.hasGo=true;}else{Player.hasGo=false;}
		if(data[81].equals("true")){Player.hasYu=true;}else{Player.hasYu=false;}
		if(data[82].equals("true")){Player.hasNi=true;}else{Player.hasNi=false;}
		if(data[83].equals("true")){Player.hasRa=true;}else{Player.hasRa=false;}
		if(data[84].equals("true")){Player.hasShi=true;}else{Player.hasShi=false;}
		if(data[85].equals("true")){Player.caughtFish=true;}else{Player.caughtFish=false;}
		if(data[86].equals("true")){Player.hasCorn=true;}else{Player.spokeToClan=false;}
		if(data[87].equals("true")){Player.hasRod=true;}else{Player.hasRod=false;}
		if(data[88].equals("true")){Player.hasGoldPaper=true;}else{Player.hasGoldPaper=false;}
		if(data[89].equals("true")){Player.sawReaper1=true;}else{Player.sawReaper1=false;}
		if(data[90].equals("true")){Player.hadCorn=true;}else{Player.hadCorn=false;}
		if(data[91].equals("true")){Player.sipped=true;}else{Player.sipped=false;}
		if(data[92].equals("true")){Player.ateCorn=true;}else{Player.ateCorn=false;}
		if(data[93].equals("true")){Player.bodhisattva=true;}else{Player.bodhisattva=false;}
		if(data[94].equals("true")){Player.knowsYear=true;}else{Player.knowsYear=false;}
		Player.trancesTranced = Integer.parseInt(data[95]);
		if(data[96].equals("true"))Player.symbolsMemorized.add("fish");
		if(data[97].equals("true"))Player.symbolsMemorized.add("lotus");
		if(data[98].equals("true"))Player.symbolsMemorized.add("knot");
		if(data[99].equals("true"))Player.wordsMemorized.add("om");
		if(data[100].equals("true"))Player.wordsMemorized.add("ni");
		if(data[101].equals("true"))Player.wordsMemorized.add("go");
		if(data[102].equals("true"))Player.wordsMemorized.add("yu");
		if(data[103].equals("true"))Player.wordsMemorized.add("ji");
		if(data[104].equals("true"))Player.wordsMemorized.add("ra");
		if(data[105].equals("true"))Player.wordsMemorized.add("shi");
		if(data[106].equals("true"))Player.inventoryList.add("om");
		if(data[107].equals("true"))Player.inventoryList.add("ni");
		if(data[108].equals("true"))Player.inventoryList.add("go");
		if(data[109].equals("true"))Player.inventoryList.add("yu");
		if(data[110].equals("true"))Player.inventoryList.add("ji");
		if(data[111].equals("true"))Player.inventoryList.add("ra");
		if(data[112].equals("true"))Player.inventoryList.add("shi");
		if(data[113].equals("true"))Player.inventoryList.add("corn");
		if(data[114].equals("true"))Player.inventoryList.add("rod");
		if(data[115].equals("true"))Player.inventoryList.add("paper");
		if(data[116].equals("true")){World.orangeAlive=true;}else{World.orangeAlive=false;}
		if(data[117].equals("true")){World.greenAlive=true;}else{World.greenAlive=false;}
		if(data[118].equals("true")){World.purpleAlive=true;}else{World.purpleAlive=false;}
		if(data[119].equals("true")){World.orangeAtTV=true;}else{World.orangeAtTV=false;}
		if(data[120].equals("true")){World.greenAtTV=true;}else{World.greenAtTV=false;}
		if(data[121].equals("true")){World.purpleAtTV=true;}else{World.purpleAtTV=false;}
		if(data[122].equals("true")){World.prepHReaper=true;}else{World.prepHReaper=false;}
		if(data[123].equals("true")){World.OOO=true;}else{World.OOO=false;}
		if(data[124].equals("true")){World.OOX=true;}else{World.OOX=false;}
		if(data[125].equals("true")){World.OXO=true;}else{World.OXO=false;}
		if(data[126].equals("true")){World.OXX=true;}else{World.OXX=false;}
		if(data[127].equals("true")){World.XOO=true;}else{World.XOO=false;}
		if(data[128].equals("true")){World.XOX=true;}else{World.XOX=false;}
		if(data[129].equals("true")){World.XXO=true;}else{World.XXO=false;}
		if(data[130].equals("true")){World.open=true;}else{World.open=false;}
		if(data[131].equals("true")){World.htapeStart=true;}else{World.htapeStart=false;}
		if(data[132].equals("true")){World.htapeEnd=true;}else{World.htapeEnd=false;}
		if(data[133].equals("true")){World.dark=true;}else{World.dark=false;}
		if(data[134].equals("true")){World.raDropped=true;}else{World.raDropped=false;}
		if(data[135].equals("true")){World.safeOpened=true;}else{World.safeOpened=false;}
		if(data[136].equals("true")){World.h18eOnStart=true;}else{World.h18eOnStart=false;}
		if(data[137].equals("true")){World.t5nOpened=true;}else{World.t5nOpened=false;}
		if(data[138].equals("true")){World.hrTVOn=true;}else{World.hrTVOn=false;}
		if(data[139].equals("true")){World.t48eGateOpen=true;}else{World.t48eGateOpen=false;}
		if(data[140].equals("true")){World.shopCaseOpen=true;}else{World.shopCaseOpen=false;}
		if(data[141].equals("true")){World.kimiScheduled=true;}else{World.kimiScheduled=false;}
		if(data[142].equals("true")){World.g9DoorOpen=true;}else{World.g9DoorOpen=false;}
		Data.year = Integer.parseInt(data[143]);
		if(data[144].equals("true")){Item.cornOnRod=true;}else{Item.cornOnRod=false;}
		Message.textMonkAnswer = data[145];
		Message.textPostRadiusYear = data[146];
		if(data[147].equals("true")){Player.sawReflection=true;}else{Player.sawReflection=false;}
		if(data[148].equals("true")){Player.spokeToMonk=true;}else{Player.spokeToMonk=false;}
		if(data[149].equals("true")){Player.knowsGotShi=true;}else{Player.knowsGotShi=false;}
		if(data[150].equals("true")){World.darkDoorOpen=true;}else{World.darkDoorOpen=false;}
		if(data[111].equals("true"))Player.orangeSavedInventory.add("om");
		if(data[112].equals("true"))Player.greenSavedInventory.add("ni");
		if(data[113].equals("true"))Player.purpleSavedInventory.add("go");
		if(data[114].equals("true"))Player.purpleSavedInventory.add("yu");
		if(data[115].equals("true"))Player.orangeSavedInventory.add("ji");
		if(data[116].equals("true"))Player.greenSavedInventory.add("ra");
		if(data[117].equals("true"))Player.purpleSavedInventory.add("shi");
		if(data[118].equals("true"))Player.greenSavedInventory.add("corn");
		if(data[119].equals("true"))Player.greenSavedInventory.add("rod");
		if(data[120].equals("true"))Player.greenSavedInventory.add("paper");
		
		Message.setTextSpeed(Message.defaultTextSpeed);
		
		if (!startedGame) {
			World.setShrines();
			setsamadhiImages();
		}
		
		Player.loading = false;
		Audio.startZen();
		Animation.openingEyes = true;
	}
	
	public static void saveGame() {
		System.out.println("Data.saveGame()");
		
		Audio.startSave();
		
		try {
			File file = new File("resources/saveData/BunrakuSaveData.txt");		
			PrintWriter output = new PrintWriter(file);
	
			
			// Write data
			output.println(ImagePanel.image1X);
			output.println(ImagePanel.image1Y);
			output.println(ImagePanel.image2X);
			output.println(ImagePanel.image2Y);
			output.println(ImagePanel.image3X);
			output.println(ImagePanel.image3Y);
			output.println(ImagePanel.image4X);
			output.println(ImagePanel.image4Y);
			output.println(ImagePanel.image5X);
			output.println(ImagePanel.image5Y);
			output.println(ImagePanel.image6X);
			output.println(ImagePanel.image6Y);
			output.println(ImagePanel.image7X);
			output.println(ImagePanel.image7Y);
			output.println(ImagePanel.image8X);
			output.println(ImagePanel.image8Y);
			output.println(ImagePanel.image9X);
			output.println(ImagePanel.image9Y);
			output.println(ImagePanel.image10X);
			output.println(ImagePanel.image10Y);
			output.println(ImagePanel.image1Width);
			output.println(ImagePanel.image1Height);
			output.println(ImagePanel.image2Width);
			output.println(ImagePanel.image2Height);
			output.println(ImagePanel.image3Width);
			output.println(ImagePanel.image3Height);
			output.println(ImagePanel.image4Width);
			output.println(ImagePanel.image4Height);
			output.println(ImagePanel.image5Width);
			output.println(ImagePanel.image5Height);
			output.println(ImagePanel.image6Width);
			output.println(ImagePanel.image6Height);
			output.println(ImagePanel.image7Width);
			output.println(ImagePanel.image7Height);
			output.println(ImagePanel.image8Width);
			output.println(ImagePanel.image8Height);
			output.println(ImagePanel.image9Width);
			output.println(ImagePanel.image9Height);
			output.println(ImagePanel.image10Width);
			output.println(ImagePanel.image10Height);
			output.println(ImagePanel.imageOutgoing1X);
			output.println(ImagePanel.imageOutgoing1Y);
			output.println(ImagePanel.imageOutgoing2X);
			output.println(ImagePanel.imageOutgoing2Y);
			output.println(ImagePanel.imageOutgoing3X);
			output.println(ImagePanel.imageOutgoing3Y);
			output.println(ImagePanel.imageOutgoing4X);
			output.println(ImagePanel.imageOutgoing4Y);
			output.println(ImagePanel.imageOutgoing5X);
			output.println(ImagePanel.imageOutgoing5Y);
			output.println(ImagePanel.imageOutgoing6X);
			output.println(ImagePanel.imageOutgoing6Y);
			output.println(ImagePanel.imageOutgoing1Width);
			output.println(ImagePanel.imageOutgoing1Height);
			output.println(ImagePanel.imageOutgoing2Width);
			output.println(ImagePanel.imageOutgoing2Height);
			output.println(ImagePanel.imageOutgoing3Width);
			output.println(ImagePanel.imageOutgoing3Height);
			output.println(ImagePanel.imageOutgoing4Width);
			output.println(ImagePanel.imageOutgoing4Height);
			output.println(ImagePanel.imageOutgoing5Width);
			output.println(ImagePanel.imageOutgoing5Height);
			output.println(ImagePanel.imageOutgoing6Width);
			output.println(ImagePanel.imageOutgoing6Height);
			
			output.println(Player.oldPosition);
			output.println(Player.meditating);
			output.println(Player.dreaming);
			output.println(Player.spokeToClan);
			output.println(Player.memorizedOm);
			output.println(Player.memorizedJi);
			output.println(Player.memorizedGo);
			output.println(Player.memorizedYu);
			output.println(Player.memorizedNi);
			output.println(Player.memorizedRa);
			output.println(Player.memorizedShi);
			output.println(Player.memorizedLotus);
			output.println(Player.memorizedKnot);
			output.println(Player.memorizedFish);
			output.println(Player.hasOm);
			output.println(Player.hasJi);
			output.println(Player.hasGo);
			output.println(Player.hasYu);
			output.println(Player.hasNi);
			output.println(Player.hasRa);
			output.println(Player.hasShi);
			output.println(Player.caughtFish);
			output.println(Player.hasCorn);
			output.println(Player.hasRod);
			output.println(Player.hasGoldPaper); 
			output.println(Player.sawReaper1);
			output.println(Player.hadCorn);
			output.println(Player.sipped);
			output.println(Player.ateCorn);
			output.println(Player.bodhisattva);
			output.println(Player.knowsYear);
			output.println(Player.trancesTranced);
			
			output.println(Player.symbolsMemorized.contains("fish"));
			output.println(Player.symbolsMemorized.contains("lotus"));
			output.println(Player.symbolsMemorized.contains("knot"));
			
			output.println(Player.wordsMemorized.contains("om"));
			output.println(Player.wordsMemorized.contains("ni"));
			output.println(Player.wordsMemorized.contains("go"));
			output.println(Player.wordsMemorized.contains("yu"));
			output.println(Player.wordsMemorized.contains("ji"));
			output.println(Player.wordsMemorized.contains("ra"));
			output.println(Player.wordsMemorized.contains("shi"));
			
			output.println(Player.inventoryList.contains("om"));
			output.println(Player.inventoryList.contains("ni"));
			output.println(Player.inventoryList.contains("go"));
			output.println(Player.inventoryList.contains("yu"));
			output.println(Player.inventoryList.contains("ji"));
			output.println(Player.inventoryList.contains("ra"));
			output.println(Player.inventoryList.contains("shi"));
			output.println(Player.inventoryList.contains("corn"));
			output.println(Player.inventoryList.contains("rod"));
			output.println(Player.inventoryList.contains("paper"));
			
			output.println(World.orangeAlive);
			output.println(World.greenAlive);
			output.println(World.purpleAlive);
			output.println(World.orangeAtTV);
			output.println(World.greenAtTV);
			output.println(World.purpleAtTV);
			output.println(World.prepHReaper);
			output.println(World.OOO);
			output.println(World.OOX);
			output.println(World.OXO);
			output.println(World.OXX);
			output.println(World.XOO);
			output.println(World.XOX);
			output.println(World.XXO);
			output.println(World.open);
			output.println(World.htapeStart);
			output.println(World.htapeEnd);
			output.println(World.dark);
			output.println(World.raDropped);
			output.println(World.safeOpened);
			output.println(World.h18eOnStart);
			output.println(World.t5nOpened);
			output.println(World.hrTVOn);
			output.println(World.t48eGateOpen);
			output.println(World.shopCaseOpen);
			output.println(World.kimiScheduled);
			output.println(World.g9DoorOpen);
			
			output.println(Data.year);
			
			output.println(Item.cornOnRod);
			
			output.println(Message.textMonkAnswer);
			output.println(Message.textPostRadiusYear);
			
			output.println(Player.sawReflection);
			output.println(Player.spokeToMonk);
			output.println(Player.knowsGotShi);
			output.println(World.darkDoorOpen);
			
			output.println(Player.orangeSavedInventory.contains("om"));
			output.println(Player.greenSavedInventory.contains("ni"));
			output.println(Player.purpleSavedInventory.contains("go"));
			output.println(Player.purpleSavedInventory.contains("yu"));
			output.println(Player.orangeSavedInventory.contains("ji"));
			output.println(Player.greenSavedInventory.contains("ra"));
			output.println(Player.purpleSavedInventory.contains("shi"));
			output.println(Player.greenSavedInventory.contains("corn"));
			output.println(Player.greenSavedInventory.contains("rod"));
			output.println(Player.greenSavedInventory.contains("paper"));
			
			/**
			for (int i = 0; i < Data.monkAnswerList.size(); i++) {
				output.println(Data.monkAnswerList.get(i));
			}
			*/
		
			output.close();
			
			Player.saving = false;
			Message.readMeditating1();
		} catch (Exception ex) {
			System.out.println("Save error.");
		}
	}
	
	public static void loadCredits() {
		System.out.println("Data.loadCredits()");
		
		try {
			File file = new File("resources/credits/credits.txt");
			Scanner input = new Scanner(file);
		
			// Read data from file
			for (int i = 0; i < 81; i++) {
				credits[i] = input.nextLine();
			}
			
			input.close();
		} catch (Exception ex) {
			System.out.println("Data.loadCredits() error");
		}
		
		Message.credits1 = credits[0];
		Message.credits2 = credits[1];
		Message.credits3 = credits[2];
		Message.credits4 = credits[3];
		Message.credits5 = credits[4];
		Message.credits6 = credits[5];
		Message.credits7 = credits[6];
		Message.credits8 = credits[7];
		Message.credits9 = credits[8];
		Message.credits10 = credits[9];
		Message.credits11 = credits[10];
		Message.credits12 = credits[11];
		Message.credits13 = credits[12];
		Message.credits14 = credits[13];
		Message.credits15 = credits[14];
		Message.credits16 = credits[15];
		Message.credits17 = credits[16];
		Message.credits18 = credits[17];
		Message.credits19 = credits[18];
		Message.credits20 = credits[19];
		Message.credits21 = credits[20];
		Message.credits22 = credits[21];
		Message.credits23 = credits[22];
		Message.credits24 = credits[23];
		Message.credits25 = credits[24];
		Message.credits26 = credits[25];
		Message.credits27 = credits[26];
		Message.credits28 = credits[27];
		Message.credits29 = credits[28];
		Message.credits30 = credits[29];
		Message.credits31 = credits[30];
		Message.credits32 = credits[31];
		Message.credits33 = credits[32];
		Message.credits34 = credits[33];
		Message.credits35 = credits[34];
		Message.credits36 = credits[35];
		Message.credits37 = credits[36];
		Message.credits38 = credits[37];
		Message.credits39 = credits[38];
		Message.credits40 = credits[39];
		Message.credits41 = credits[40];
		Message.credits42 = credits[41];
		Message.credits43 = credits[42];
		Message.credits44 = credits[43];
		Message.credits45 = credits[44];
		Message.credits46 = credits[45];
		Message.credits47 = credits[46];
		Message.credits48 = credits[47];
		Message.credits49 = credits[48];
		Message.credits50 = credits[49];
		Message.credits51 = credits[50];
		Message.credits52 = credits[51];
		Message.credits53 = credits[52];
		Message.credits54 = credits[53];
		Message.credits55 = credits[54];
		Message.credits56 = credits[55];
		Message.credits57 = credits[56];
		Message.credits58 = credits[57];
		Message.credits59 = credits[58];
		Message.credits60 = credits[59];
		Message.credits61 = credits[60];
		Message.credits62 = credits[61];
		Message.credits63 = credits[62];
		Message.credits64 = credits[63];
		Message.credits65 = credits[64];
		Message.credits66 = credits[65];
		Message.credits67 = credits[66];
		Message.credits68 = credits[67];
		Message.credits69 = credits[68];
		Message.credits70 = credits[69];
		Message.credits71 = credits[70];
		Message.credits72 = credits[71];
		Message.credits73 = credits[72];
		Message.credits74 = credits[73];
		Message.credits75 = credits[74];
	}
	
	public static void saveOrangeInventory() {
		Player.orangeSavedInventory.clear();
		
		for (int i = 0; i < Player.inventoryList.size(); i++) {
			Player.orangeSavedInventory.add(Player.inventoryList.get(i));
		}
	}
	
	public static void restoreOrangeInventory() {
		System.out.println("Data.restoreOrangeInventory()");
		Player.inventoryList.clear();
		
		for (int i = 0; i < Player.orangeSavedInventory.size(); i++) {
			Player.inventoryList.add(Player.orangeSavedInventory.get(i));
		}
	}
	
	public static void saveGreenInventory() {
		System.out.println("Data.saveGreenInventory()");
		Player.greenSavedInventory.clear();
		
		for (int i = 0; i < Player.inventoryList.size(); i++) {
			Player.greenSavedInventory.add(Player.inventoryList.get(i));
		}
	}
	
	public static void restoreGreenInventory() {
		System.out.println("Data.restoreGreenInventory()");
		Player.inventoryList.clear();
		
		for (int i = 0; i < Player.greenSavedInventory.size(); i++) {
			Player.inventoryList.add(Player.greenSavedInventory.get(i));
		}
	}
	
	public static void savePurpleInventory() {
		Player.purpleSavedInventory.clear();
		
		for (int i = 0; i < Player.inventoryList.size(); i++) {
			Player.purpleSavedInventory.add(Player.inventoryList.get(i));
		}
	}
	
	public static void restorePurpleInventory() {
		System.out.println("Data.restorePurpleInventory()");
		Player.inventoryList.clear();
		
		for (int i = 0; i < Player.purpleSavedInventory.size(); i++) {
			Player.inventoryList.add(Player.purpleSavedInventory.get(i));
		}
	}
	
	/** Confirmation Dialogue Box Methods */
	public static void showConfirmDialogNew() {		
		int input = JOptionPane.showConfirmDialog(null, "You are about to start a new game.\nAny unsaved progress will be lost.\nContinue?", "Confirmation Request", 0);
		
		if (input == 0)
			newGame();
	}
	
	public static void showConfirmDialogSave() {
		int input = JOptionPane.showConfirmDialog(null, "Overwrite existing save data?", "Confirmation Request", 0);
		
		if (input == 0) {
			saveGame();
		} else {
			Player.saving = false;
			Message.readMeditating1();
		}
	}
	
	public static void showConfirmDialogLoad() {
		int input = JOptionPane.showConfirmDialog(null, "You are about to load a saved game state.\nAny unsaved progress will be lost.\nContinue?", "Confirmation Request", 0);
		
		if (input == 0) {
			Player.position = "loading";
			loadGame();
		} else {
			Player.loading = false;
			
			if (Player.meditating)
				Message.readMeditating1();
		}
	}
	
	public static void showDialogLoadError() {
		JOptionPane.showMessageDialog(null, "Bunraku save data not found.");
		
		Player.loading = false;
		
		if (Player.meditating)
			Message.readMeditating1();
	}
	
	public static void showConfirmDialogExit() {
		System.out.println("Data said exit");
		int input = JOptionPane.showConfirmDialog(null, "You are about to exit the game.\nAny unsaved progress will be lost.\nContinue?", "Confirmation Request", 0);
		
		if (input == 0) {
			System.exit(0);
		} else {
			Player.exiting = false;
			
			if (Player.meditating)
				Message.readMeditating1();
		}
	}
	
	public static void checkSave() {
		File f = new File("resources/saveData/BunrakuSaveData.txt");
		
		if(f.exists()) { 
			showConfirmDialogSave();
		} else {
			saveGame();
		}
	}
	
	
	public static void checkLoad() {
		File f = new File("resources/saveData/BunrakuSaveData.txt");
		
		if(f.exists()) { 
			if (Player.position.equals("title")) {
				Player.position = "loading";
				loadGame();
			} else {
				showConfirmDialogLoad();
			}
		} else {
			showDialogLoadError();
		}
	}
	
	public static void setPostRadiusYear() {
		year = (int)(Math.random() * 5998 + 1);
		
		//System.out.println(year);
		yearToString();
		
		// resets year to desired range
		while ((year > 1861 && year < 2200)	|| (year < 100)) {
			System.out.println("Data.setPostRadiusYear contained undesirable number");
			year = (int)(Math.random() * 5998 + 1);
			yearToString();
		}
		
		// resets year if monk previously guessed it
		while (monkAnswerList.contains(yearToString())) {
			System.out.println("Data.setPostRadiusYear contained previous monk answer");
			year = (int)(Math.random() * 5998 + 1);
			yearToString();
		}
		
		String y = String.valueOf(year);
		Message.postRadiusYear.setLength(0);
		Message.postRadiusYear.append(Message.quotationMark);
		Message.postRadiusYear.append(y);
		Message.postRadiusYear.append(Message.period.toString());
		Message.postRadiusYear.append(Message.quotationMark.toString());
		Message.textPostRadiusYear = Message.postRadiusYear.toString();
		
		//System.out.println(year);
		//System.out.println(Message.textPostRadiusYear);
	}
	
	private static String yearToString() {
		String s = Integer.toString(year);
		
		return s;
	}
	
	private static void setsamadhiImages() {
		samadhiImages.add("s1");
		samadhiImages.add("s2");
		samadhiImages.add("s3");
		samadhiImages.add("s4");
		samadhiImages.add("s5");
		samadhiImages.add("s6");
		samadhiImages.add("s7");
		samadhiImages.add("s8");
		samadhiImages.add("s9");
		samadhiImages.add("s10");
		samadhiImages.add("s11");
		samadhiImages.add("s12");
		samadhiImages.add("s13");
		samadhiImages.add("s14");
		samadhiImages.add("s15");
		samadhiImages.add("s16");
		samadhiImages.add("s17");
		samadhiImages.add("s18");
		samadhiImages.add("s19");
		samadhiImages.add("s20");
		samadhiImages.add("s21");
		samadhiImages.add("s22");
		samadhiImages.add("s23");
		samadhiImages.add("s24");
		samadhiImages.add("s25");
		samadhiImages.add("s26");
		samadhiImages.add("s27");
		samadhiImages.add("s28");
		samadhiImages.add("s29");
		samadhiImages.add("s30");
		samadhiImages.add("s31");
		samadhiImages.add("s32");
		samadhiImages.add("s33");
		samadhiImages.add("s34");
		samadhiImages.add("s35");
		samadhiImages.add("s36");
		samadhiImages.add("s37");
		samadhiImages.add("s38");
		samadhiImages.add("s39");
		samadhiImages.add("s40");
		samadhiImages.add("s41");
		samadhiImages.add("s42");
		samadhiImages.add("s43");
		samadhiImages.add("s44");
		samadhiImages.add("s45");
		samadhiImages.add("s46");
		samadhiImages.add("s47");
		samadhiImages.add("s48");
		samadhiImages.add("s49");
		samadhiImages.add("s50");
		samadhiImages.add("s51");
		samadhiImages.add("s52");
		samadhiImages.add("s53");
		samadhiImages.add("s54");
		samadhiImages.add("s55");
		samadhiImages.add("s56");
		samadhiImages.add("s57");
		samadhiImages.add("s58");
		samadhiImages.add("s59");
		samadhiImages.add("s60");
		samadhiImages.add("s61");
		samadhiImages.add("s62");
		
		//bannedSamadhiImages.add("s39");
		//bannedSamadhiImages.add("s41");
	}
	
	public static void endGame() {
		Animation.faded = false;
		Animation.fadingOut = false;
		ImagePanel.opacity = 0;
		Animation.movingSpace = false;
		Animation.displayingSpace = false;
		wipeGame();
	}
	
	public static void wipeGame() {
		System.out.println("Data.wipeGame()");
		ImagePanel.resetImages();
		Player.meditating = false;
		Player.dreaming = false;
		Animation.todSipping1 = false;
		Animation.todSipping2 = false;
		Animation.todSipping3 = false;
		Animation.todSipped = false;
		Player.spokeToMonk = false;
		World.g9DoorOpen = false;
		Player.spokeToClan = false;
		Player.memorizedOm = false;
		Player.memorizedJi = false;
		Player.memorizedGo = false;
		Player.memorizedYu = false;
		Player.memorizedNi = false;
		Player.memorizedRa = false;
		Player.memorizedShi = false;
		Player.memorizedLotus = false;
		Player.memorizedKnot = false;
		Player.memorizedFish = false;
		Player.hasOm = false;
		Player.hasJi = false;
		Player.hasGo = false;
		Player.hasYu = false;
		Player.hasNi = false;
		Player.hasRa = false;
		Player.hasShi = false;
		Player.caughtFish = false;
		Player.hasCorn = false;
		Player.hasRod = false;
		Player.hasGoldPaper = false; 
		Player.sawReaper1 = false;
		Player.hadCorn = false;
		Player.sipped = false;
		Player.ateCorn = false;
		Player.bodhisattva = false;
		Player.knowsYear = false;
		Player.trancesTranced = 0;
		ImagePanel.bladeDegree = 0;
		ImagePanel.hBladeX = 0;
		Player.symbolsMemorized.clear();
		Player.wordsMemorized.clear();
		Player.inventoryList.clear();
		World.orangeAlive = false;
		World.greenAlive = false;
		World.purpleAlive = false;
		World.orangeAtTV = false;
		World.greenAtTV = false;
		World.purpleAtTV = false;
		World.prepHReaper = false;
		World.OOO = false;
		World.OOX = false;
		World.OXO = false;
		World.OXX = false;
		World.XOO = false;
		World.XOX = false;
		World.XXO = false;
		World.open = false;
		World.htapeStart = false;
		World.htapeEnd = false;
		World.dark = false;
		World.raDropped = false;
		World.safeOpened = false;
		World.h18eOnStart = false;
		World.t5nOpened = false;
		World.hrTVOn = false;
		World.t48eGateOpen = false;
		World.shopCaseOpen = false;
		World.kimiScheduled = false;
		World.darkDoorOpen = false;
		Data.year = -2137459457;
		Item.cornOnRod = false;
		Message.textMonkAnswer = "";
		Message.textPostRadiusYear = "";
		Data.monkAnswerList.clear();
		Player.sawReflection = false;
		Player.knowsGotShi = false;
		Player.orangeSavedInventory.clear();
		Player.greenSavedInventory.clear();
		Player.purpleSavedInventory.clear();
		
		Animation.fadingIn = false;
		Animation.fadingOut = false;
		Animation.faded = false;
		Animation.eyesClosed = false;
		Animation.closingEyes = false;
		Animation.openingEyes = false;
		Audio.stopSquarepusher();
		Player.position = "title";
		Audio.loadTitle();
		Audio.startTitle();
		Player.setBusy(false);
		Player.setDisableWalk(false);
	}
	
	public static void printCoords() {
		System.out.println("Data.printCoords()");
		try {
			File file = new File("coords.txt");		
			PrintWriter output = new PrintWriter(file);
	
			output.println("Mouse.x > " + xCoord1 + " && Mouse.x < " + xCoord2 + " && Mouse.y > " + yCoord1 + " && Mouse.y < " + yCoord2);
		
			output.close();
		} catch (Exception ex) {
			System.out.println("print error.");
		}
	}
	
	public static void printData() {
		
		System.out.println("\n#" + Mouse.clicks + " (x = " + Mouse.x + ", y = " + Mouse.y + ")" + "\nPlayer.oldPosition = " + Player.oldPosition + "\nPlayer.position = " + Player.position);
	}
}