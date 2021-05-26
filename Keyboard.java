public class Keyboard {
	public static boolean typingInput;
	public static boolean goingTo3OrR;
	public static int inputLimit = 17;
	public static int charWidth = 21;
	
	public static boolean justSubmitedInput;
	
	public static StringBuilder keyboardInputStringBuilder = new StringBuilder("");
	
	public static String keyboardInputString = "";
	public static String oldKeyboardInputString = "";
		
		/**
	* INPUT FUNCTIONALITY
	* Appends char typed to keyboardInput String 
	*/
	public static void keyboardInputAppend(char c) {
		if (keyboardInputStringBuilder.length() < inputLimit){
			if (!Data.cheating) {
				oldKeyboardInputString = keyboardInputString;
				
				keyboardInputStringBuilder.append(Character.toUpperCase(c));
				keyboardInputString = keyboardInputStringBuilder.toString();
				
				updateInputX();
			} else {
				keyboardInputStringBuilder.append(c);
				keyboardInputString = keyboardInputStringBuilder.toString();
			}
		}
	}
	
	/** Deletes char from keyboardInput String */
	public static void keyboardInputBackspace() {
		if (keyboardInputString.length() > 0) {
			oldKeyboardInputString = keyboardInputString;
			
			keyboardInputStringBuilder.deleteCharAt(keyboardInputStringBuilder.length() - 1);
			keyboardInputString = keyboardInputStringBuilder.toString();
			
			updateInputX();
		}
	}
	
	public static void wipeKeyboardInput() {
		keyboardInputStringBuilder.setLength(0); 
		keyboardInputString = keyboardInputStringBuilder.toString();
		
		// this only vanishes input box after message close if not at tods
		if (!Player.position.equals("tod")
			&& !Player.meditating){
			typingInput = false;
		}
				
		//System.out.println("wipeKeyboardInput()");
	}
	
	public static void startInput() {
		System.out.println("Keyboard.startInput()");
		ImagePanel.inputScrollX = Bunraku.width;
		Animation.openingInputScroll = true;
		typingInput = true;
	}
	
	private static void updateInputX() {
		int i = (keyboardInputString.length() - 1) * charWidth;
		
		ImagePanel.keyboardInputTextX = ImagePanel.keyboardInputTextXANCHOR - i;
		
		if (oldKeyboardInputString.length() < keyboardInputString.length()) {
			Animation.extendingInputScroll = true;
		} else if (ImagePanel.inputScrollX < ImagePanel.inputScrollXANCHOR) {
			Animation.unextendingInputScroll = true;
		}
	}
	
	/** Submits question for NPC to ponder */
	public static void keyboardInputSubmit() {
		if (Message.readingCorn1) {
			Message.readingCorn1 = false;
			Player.setDisableWalk(false);
			Item.putItemAway();
			
			if (keyboardInputString.equals("EAT")) {
				wipeKeyboardInput();
				typingInput = false;
				Player.inventoryList.remove("corn");
				Player.ateCorn = true;
				Message.readCorn2();
			} else if (keyboardInputString.equals("TASTE")) {
				wipeKeyboardInput();
				typingInput = false;
				Message.readCorn2();
			} else if (keyboardInputString.equals("SMELL")) {
				wipeKeyboardInput();
				typingInput = false;
				Message.readCorn3();
			} else if (keyboardInputString.equals("DROP")) {
				wipeKeyboardInput();
				typingInput = false;
				Player.inventoryList.remove("corn");
				Message.closeMessage();
			} else if (keyboardInputString.equals("ATTACH")) {
				Audio.startEquip1();
				wipeKeyboardInput();
				typingInput = false;
				Player.inventoryList.remove("corn");
				Item.cornOnRod = true;
				Message.readCorn4();
			} else {
				wipeKeyboardInput();
				typingInput = false;

				Message.readError();
			}
		} else {
			switch (Player.position) {
				case "meditating":
					if (Message.readingMeditating1) {
						Message.readingMeditating1 = false;
				
						if (keyboardInputString.equals("BREATHE")) {
								System.out.println("breathe");
								Player.breathing = true;
								Player.breathed = true;
								wipeKeyboardInput();
								typingInput = false;
								Message.closeMessage();
						} else if (keyboardInputString.equals("VISUALIZE")) {
							wipeKeyboardInput();
							typingInput = false;
							
							if (Player.memorizedKnot 
							|| Player.memorizedFish 
							|| Player.memorizedLotus) {
								Message.readingMeditating1 = false;
								Message.readMeditating3();
							} else {
								Message.readingMeditating1 = false;
								Message.readMeditating4();
							}
						} else if (keyboardInputString.equals("CHANT")) {
							wipeKeyboardInput();
							typingInput = false;
							
							if (Player.memorizedOm
							|| Player.memorizedNi
							|| Player.memorizedGo
							|| Player.memorizedYu
							|| Player.memorizedJi
							|| Player.memorizedRa
							|| Player.memorizedShi) {
								Message.readingMeditating1 = false;
								Message.readMeditating5();
							} else {
								Message.readingMeditating1 = false;
								Message.readMeditating6();
							}
						} else if (keyboardInputString.equals("SAVE")) {
							System.out.println("said save");
							wipeKeyboardInput();
							typingInput = false;
							Player.saving = true;
							Message.closeMessage();
						} else if (keyboardInputString.equals("LOAD")) {
							System.out.println("said load");
							wipeKeyboardInput();
							typingInput = false;
							Player.loading = true;
							Message.closeMessage();
						} else if (keyboardInputString.equals("EXIT")
							|| keyboardInputString.equals("EXIT GAME")
							|| keyboardInputString.equals("EXIT THE GAME")) {
							wipeKeyboardInput();
							typingInput = false;
							System.out.println("Keyboard said exit");
							Player.exiting = true;
							Message.closeMessage();
						} else if (keyboardInputString.equals("BYE")
								|| keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Message.readingMeditating1 = false;
							Player.position = Player.oldPosition;
							Player.setBusy(true);
							ImagePanel.eyelid1Y = 0;
							ImagePanel.eyelid2Y = 0;
							Animation.faded = true;
							
							if (Player.visualizingFish || Player.visualizingLotus || Player.visualizingKnot) {
								Animation.rotatingFractal = false;
								Animation.prepEyes = true;
								Animation.movingSymbolOut = true;
							} else {
								Animation.faded = false;
								Audio.startZen();
								Animation.openingEyes = true;
							}
						} else {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingMeditating1 = false;
							Message.readError();
						}
					} else if (Message.readingMeditating3) {
						if (keyboardInputString.equals("KNOT")
						|| keyboardInputString.equals("ENDLESSKNOT")
						|| keyboardInputString.equals("ENDLESS KNOT")) {
							if (Player.memorizedKnot) {
								if (Player.visualizingFish || Player.visualizingLotus) {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									Animation.prepKnot = true;
									Animation.rotatingFractal = false;
									Animation.movingSymbolOut = true;
								} else if (Player.visualizingKnot) {
									Message.readingMeditating3 = false;
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Animation.setWait(44,40);
								} else {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									ImagePanel.symbol1X = -Bunraku.width;
									ImagePanel.symbol2X = Bunraku.width;
									Player.visualizingKnot = true;
									Animation.movingSymbolIn = true;
								}
							} else {
								Message.readingMeditating3 = false;
								Message.readError();
							}
						} else if (keyboardInputString.equals("LOTUS")
						|| keyboardInputString.equals("FLOWER")
						|| keyboardInputString.equals("LOTUSFLOWER")
						|| keyboardInputString.equals("LOTUS FLOWER")) {
							if (Player.memorizedLotus) {
								if (Player.visualizingKnot || Player.visualizingFish) {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									Animation.prepLotus = true;
									Animation.rotatingFractal = false;
									Animation.movingSymbolOut = true;
								} else if (Player.visualizingLotus) {
									Message.readingMeditating3 = false;
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Animation.setWait(44,40);
								} else {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									ImagePanel.symbol1X = -Bunraku.width;
									ImagePanel.symbol2X = Bunraku.width;
									Player.visualizingLotus = true;
									Animation.movingSymbolIn = true;
								}
							} else {
								Message.readingMeditating3 = false;
								Message.readError();
							}
						} else if (keyboardInputString.equals("FISH")
						|| keyboardInputString.equals("GOLDENFISH")
						|| keyboardInputString.equals("GOLDEN FISH")) {
							if (Player.memorizedFish) {
								if (Player.visualizingKnot || Player.visualizingLotus) {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									Animation.prepFish = true;
									Animation.rotatingFractal = false;
									Animation.movingSymbolOut = true;
								} else if (Player.visualizingFish) {
									Message.readingMeditating3 = false;
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Animation.setWait(44,40);
								} else {
									wipeKeyboardInput();
									typingInput = false;
									Message.closeMessage();
									Message.readingMeditating3 = false;
									Animation.faded = true;
									ImagePanel.opacity = 255;
									ImagePanel.symbol1X = -Bunraku.width;
									ImagePanel.symbol2X = Bunraku.width;
									Player.visualizingFish = true;
									Animation.movingSymbolIn = true;
								}
							} else {
								Message.readingMeditating3 = false;
								Message.readError();
							}
						} else if (keyboardInputString.equals("BYE")
								|| keyboardInputString.equals("EXIT")
								|| keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingMeditating3 = false;
							Message.readMeditating1();
						} else {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingMeditating3 = false;
							Message.readError();
						}
					} else if (Message.readingMeditating5) {
						Message.readingMeditating5 = false;

						if (keyboardInputString.equals("OM") && Player.memorizedOm) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startOm();
							Animation.displayingOm = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("om");
						} else if (keyboardInputString.equals("NI") && Player.memorizedNi) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startNi();
							Animation.displayingNi = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("ni");
						} else if (keyboardInputString.equals("GO") && Player.memorizedGo) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startGo();
							Animation.displayingGo = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("go");
						} else if (keyboardInputString.equals("YU") && Player.memorizedYu) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startYu();
							Animation.displayingYu = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("yu");
						} else if (keyboardInputString.equals("JI") && Player.memorizedJi) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startJi();
							Animation.displayingJi = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("ji");
						} else if (keyboardInputString.equals("RA") && Player.memorizedRa) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startRa();
							Animation.displayingRa = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("ra");
						} else if (keyboardInputString.equals("SHI") && Player.memorizedShi) {
							wipeKeyboardInput();
							typingInput = false;
							Message.closeMessage();
							Audio.startShi();
							Animation.displayingShi = true;
							Animation.chantFadingIn = true;
							Player.chantInputs.add("shi");
						} else if (keyboardInputString.equals("BYE")
								|| keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingMeditating5 = false;
							Message.readMeditating1();
						} else {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingMeditating5 = false;
							Message.readErrorChant();
						}
					}
					break;
				case "t9n shop":
					if (Message.readingShop13) {
						if (keyboardInputString.equals("YES")) {
							// TRY TO OPEN CONTAINER
							ImagePanel.image4Y = 300;
							Player.holdingShopCase = true;
							ImagePanel.image4Y = 400;
							Message.readingShop13 = false;
							Message.closeMessage();
							Animation.raisingShopCase = true;
						} else if (keyboardInputString.equals("NO")) {
							Message.readingShop13 = false;
							Message.readShopSorry1();
						} else {
							Message.readingShop13 = false;
							Message.readShopSorry2();
						}
					} else if (Message.readingShopHelp) {
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingShopHelp = false;
							Message.readShopTemple1();
						} else if (keyboardInputString.equals("CASE")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingShopHelp = false;
							Message.readShop12b();
						} else if (keyboardInputString.equals("TEMPLE")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingShopHelp = false;
							Message.readShopTemple1();
						} else if (keyboardInputString.equals("BYE")
							|| keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingShopHelp = false;
							Message.readShopBye();
						} else {
							wipeKeyboardInput();
							typingInput = false;
							Message.readingShopHelp = false;
							Message.readShopSorry2();
						}
					} else {
						System.out.println("error 987");
					}
					break;
				case "g30e":
					if (Message.readingReaper1) {
						if (!Data.monkAnswerList.contains(keyboardInputString))
							setMonkAnswer();
						
						Message.readingReaper1 = false;
					}
					
					if (keyboardInputString.equals(String.valueOf(Data.year))) {
						if (Player.knowsYear) {
							//END SCENE
							typingInput = false;
							wipeKeyboardInput();
							Message.closeMessage();
							Animation.setWait(100,99);
						} else {
							// reset year
							Data.setPostRadiusYear();
							
							// incorrect
							wipeKeyboardInput();
							Message.readReaper2();
						}
					} else if (keyboardInputString.equals("IDK")
						|| keyboardInputString.equals("")) {
						// that's unfortunate.
						wipeKeyboardInput();
						Message.readReaper3();
					} else if (keyboardInputString.equals("FUCK YOU")
					|| keyboardInputString.equals("FUCK OFF")
					|| keyboardInputString.equals("FUCK")
					|| keyboardInputString.equals("GO FUCK YOURSELF")
					|| keyboardInputString.equals("FUCK YOURSELF")
					|| keyboardInputString.equals("WAIT")
					|| keyboardInputString.equals("DON'T SHOOT")
					|| keyboardInputString.equals("DONT SHOOT")
					|| keyboardInputString.equals("DONT KILL ME")
					|| keyboardInputString.equals("DON'T KILL ME")
					|| keyboardInputString.equals("DONT")
					|| keyboardInputString.equals("DON'T")
					|| keyboardInputString.equals("KILL ME")
					|| keyboardInputString.equals("DIE")
					|| keyboardInputString.equals("GO DIE")
					|| keyboardInputString.equals("I LOVE YOU")
					|| keyboardInputString.equals("I HATE YOU")
					|| keyboardInputString.equals("SHOVE IT")
					|| keyboardInputString.equals("ASS")
					|| keyboardInputString.equals("COCK")
					|| keyboardInputString.equals("PENIS")
					|| keyboardInputString.equals("DICK")
					|| keyboardInputString.equals("VAGINA")
					|| keyboardInputString.equals("SUCK MY DICK")
					|| keyboardInputString.equals("SUCK IT")
					|| keyboardInputString.equals("SUCK MY COCK")
					|| keyboardInputString.equals("SUCK MY NUTS")
					|| keyboardInputString.equals("SUCK MY NUTSACK")
					|| keyboardInputString.equals("SUCK MY NUT SACK")
					|| keyboardInputString.equals("EAT COCK")
					|| keyboardInputString.equals("EAT SHIT")
					|| keyboardInputString.equals("SUCK A DICK")
					|| keyboardInputString.equals("DIE")
					|| keyboardInputString.equals("GO DIE")
					|| keyboardInputString.equals("BITCH")
					|| keyboardInputString.equals("BITCHASS")) {
						// shoot immediately
						wipeKeyboardInput();
						Animation.reaperAngry = true;
						Message.closeMessage();
					} else {
						// incorrect
						wipeKeyboardInput();
						Message.readReaper2();
					}
					break;
				case "h2w":
					if (Message.readingReaper1) {
						Message.readingReaper1 = false;
					}
					
					if (keyboardInputString.equals(String.valueOf(Data.year))) {
						if (Player.knowsYear) {
							//END SCENE
							typingInput = false;
							wipeKeyboardInput();
							Message.closeMessage();
							Animation.setWait(100,99);
						} else {
							// reset year
							Data.setPostRadiusYear();
							
							// incorrect
							wipeKeyboardInput();
							Message.readReaper2();
						}
					} else if (keyboardInputString.equals("IDK")
						|| keyboardInputString.equals("")) {
						// that's unfortunate.
						wipeKeyboardInput();
						Message.readReaper3();
					} else if (keyboardInputString.equals("FUCK")) {
						// shoot immediately
						wipeKeyboardInput();
						Animation.reaperAngry = true;
						Message.closeMessage();
					} else {
						// incorrect
						wipeKeyboardInput();
						Message.readReaper2();
					}
					break;
				case "t1e":
					if (Message.readingReaper1) {
						Message.readingReaper1 = false;
					}
					
					if (keyboardInputString.equals(String.valueOf(Data.year))) {
						if (Player.knowsYear) {
							//END SCENE
							typingInput = false;
							wipeKeyboardInput();
							Message.closeMessage();
							Animation.setWait(100,99);
						} else {
							// reset year
							Data.setPostRadiusYear();
							
							// incorrect
							wipeKeyboardInput();
							Message.readReaper2();
						}
					} else if (keyboardInputString.equals("IDK")
						|| keyboardInputString.equals("")) {
						// that's unfortunate.
						wipeKeyboardInput();
						Message.readReaper3();
					} else if (keyboardInputString.equals("FUCK")) {
						// shoot immediately
						wipeKeyboardInput();
						Animation.reaperAngry = true;
						Message.closeMessage();
					} else {
						// incorrect
						wipeKeyboardInput();
						Message.readReaper2();
					}
					break;
				case "h15n": 
					// Kimi Phone Call 
					if (Message.readingKimi56) {
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							goingTo3OrR = true;
							Message.readKimi3();
						} else if (keyboardInputString.equals("NO")
							|| keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							Message.readKimi60();
						} else if (keyboardInputString.equals("REMEDY")) {
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							Message.readKimi9();
						} else if (keyboardInputString.equals("KNOWLEDGE")
							|| keyboardInputString.equals("TRANCE")
							|| keyboardInputString.equals("MEDITATION")) {
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							Message.readKimi20();
						} else if (keyboardInputString.equals("SCHEDULE")) {
							Message.readingKimi56 = false;
							// schedule appt
							Message.readKimi12(); 
						} else if (keyboardInputString.equals("PHONE")) {
							Message.readingKimi56 = false;
							Message.readKimi24();
						} else if (keyboardInputString.equals("BUSINESS")) {
							// SAY BUSINESS
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							Message.readKimi3();
						} else {
							wipeKeyboardInput();
							Message.readingKimi56 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi20) {
						if (keyboardInputString.equals("SCHEDULE")) {
							Message.readingKimi20 = false;
							// schedule appt
							if (World.kimiScheduled) {
								Message.readKimiBooked();
							} else {
								Message.readKimi12();
							}
						} else if (keyboardInputString.equals("PHONE")) {
							Message.readingKimi20 = false;
							Message.readKimi24();
						} else if (keyboardInputString.equals("NO")
							|| keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi20 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi20 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi17) {
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi17 = false;
							Message.readKimi3();
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							Message.readingKimi17 = false;
							Message.readKimi60();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi17 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi17 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi14){
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi14 = false;
							Message.readKimiR();
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							Message.readingKimi14 = false;
							Message.readKimi60();
						} else if (keyboardInputString.equals("REMEDY")) {
							wipeKeyboardInput();
							Message.readingKimi14 = false;
							Message.readKimi9();
						} else if (keyboardInputString.equals("KNOWLEDGE")
							|| keyboardInputString.equals("TRANCE")
							|| keyboardInputString.equals("MEDITATION")) {
							wipeKeyboardInput();
							Message.readingKimi14 = false;
							Message.readKimi20();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi14 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi14 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi12) {
						if (keyboardInputString.equals("YES")) {
							World.kimiScheduled = true;
							wipeKeyboardInput();
							Message.readingKimi12 = false;
							Message.readKimi14();
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							Message.readingKimi12 = false;
							Message.readKimiWrongNumber();
							
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi12 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi12 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi9) {
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi9 = false;
							
							if (World.kimiScheduled) {
								Message.readKimiBooked();
							} else {
								Message.readKimi12();
							}
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							Message.readingKimi9 = false;
							Message.readKimi17();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi9 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi9 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi7) {
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi7 = false;
							Message.readKimi12();
						} else if (keyboardInputString.equals("NO")) {
								wipeKeyboardInput();
								Message.readingKimi7 = false;
								Message.readKimiWrongNumber();
						}  else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi7 = false;
							Message.readKimi60();
						} else {
							Message.readingKimi7 = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi3 || Message.readingKimiR) {
						if (keyboardInputString.equals("REMEDY")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi9();
						} else if (keyboardInputString.equals("KNOWLEDGE")
							|| keyboardInputString.equals("TRANCE")
							|| keyboardInputString.equals("MEDITATION")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi20();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi60();
						} else {
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimiBooked) {
						if (keyboardInputString.equals("REMEDY")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi9();
						} else if (keyboardInputString.equals("KNOWLEDGE")
							|| keyboardInputString.equals("TRANCE")
							|| keyboardInputString.equals("MEDITATION")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi20();
						} else if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi3();
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimiWrongNumber();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimi60();
						} else {
							Message.readingKimi3 = false;
							Message.readingKimiR = false;
							Message.readingKimiBooked = false;
							Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi2) {
						if (keyboardInputString.equals("BUSINESS")) {
								// SAY BUSINESS
								wipeKeyboardInput();
								Message.readingKimi2 = false;
								Message.readKimi3();
						} else {
								// SAY PERSONAL
								wipeKeyboardInput();
								Message.readingKimi2 = false;
								Message.readKimiWrongNumber();
						}
					} else if (Message.readingKimi1) {
						Message.readingKimi1 = false;
						
						if (keyboardInputString.equals("BUSINESS")) {
							// SAY BUSINESS
							wipeKeyboardInput();
							Message.readKimi3();
						} else if (keyboardInputString.equals("PERSONAL")
							|| keyboardInputString.equals("PERSONAL ONE")) {
							// SAY PERSONAL
							wipeKeyboardInput();
							Message.readKimiWrongNumber();
						} else if (keyboardInputString.equals("DANCE")
							|| keyboardInputString.equals("REIKI")
							|| keyboardInputString.equals("THERAPY")
							|| keyboardInputString.equals("NARRATIVE")) {
							wipeKeyboardInput();
							Message.readKimi9();
						} else if (keyboardInputString.equals("INSTRUCTION")
							|| keyboardInputString.equals("INSTRUCTIONS")) {
							wipeKeyboardInput();
							Message.readKimi3();
						} else if (keyboardInputString.equals("REMEDY")) {
							wipeKeyboardInput();
							Message.readKimi9();
						}  else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							Message.readKimi60();
						} else {
							Message.readKimi2();
						}
					}
					break;
				case "tod":
					if (Message.readingTod45) {
						Message.readingTod45 = false;
						if (keyboardInputString.equals("YES")) {
							wipeKeyboardInput();
							typingInput = false;
							
							// hypnosis
							Message.readTod46b();
						} else if (keyboardInputString.equals("NO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod74();
						} else {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod75();
						}
					} else {
						if (keyboardInputString.equals("TEA")) {
							wipeKeyboardInput();
							Animation.takingCup = true;
							Audio.startSip();
							typingInput = false;
						} else if (keyboardInputString.equals("ICHIRO")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod11();
						} else if (keyboardInputString.equals("POWER")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod17();
						} else if (keyboardInputString.equals("SCROLL")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod30();
						} else if (keyboardInputString.equals("BYE")) {
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod72();
						} else {
							System.out.println("tod else");
							wipeKeyboardInput();
							typingInput = false;
							Message.readTod75();
						}
					
					}
					
					break;
				default:
					System.out.println("Keyboard.keyboardInputSubmit / Player.position error");
			}
		} 
	
		
		
		
		// cheating warp
		if (Data.cheating) {
			Player.position = keyboardInputString;
			System.out.println(keyboardInputString);
			Data.cheating = false;
			wipeKeyboardInput();
		}
		
		wipeKeyboardInput();
	}
	
	// simplifies input variations
	public static void keyboardInputDecypher() {
		if (keyboardInputString.equals("OK")
		|| keyboardInputString.equals("OKAY")
		|| keyboardInputString.equals("K")
		|| keyboardInputString.equals("KAY")
		|| keyboardInputString.equals("KK")
		|| keyboardInputString.equals("ALRIGHT")
		|| keyboardInputString.equals("FINE")
		|| keyboardInputString.equals("SURE")
		|| keyboardInputString.equals("SURE THING")
		|| keyboardInputString.equals("SURE THANG")
		|| keyboardInputString.equals("YES")
		|| keyboardInputString.equals("YEAH")
		|| keyboardInputString.equals("YEA")
		|| keyboardInputString.equals("YE")
		|| keyboardInputString.equals("Y")
		|| keyboardInputString.equals("YA")
		|| keyboardInputString.equals("ALLRIGHT")
		|| keyboardInputString.equals("AFFIRMATIVE")
		|| keyboardInputString.equals("ALL RIGHT")
		|| keyboardInputString.equals("VERY WELL")
		|| keyboardInputString.equals("BY ALL MEANS")
		|| keyboardInputString.equals("CERTAINLY")
		|| keyboardInputString.equals("ABSOLUTELY")
		|| keyboardInputString.equals("INDEED")
		|| keyboardInputString.equals("AGREED")
		|| keyboardInputString.equals("ROGER")
		|| keyboardInputString.equals("AYE")
		|| keyboardInputString.equals("AY")
		|| keyboardInputString.equals("AYE AYE")
		|| keyboardInputString.equals("YAH")
		|| keyboardInputString.equals("YEP")
		|| keyboardInputString.equals("YUP")
		|| keyboardInputString.equals("RIGHTO")
		|| keyboardInputString.equals("WHY NOT")
		|| keyboardInputString.equals("SURELY")) {
			keyboardInputString = "YES";
			System.out.println("input = yes = " + keyboardInputString);
		}
					
		if (keyboardInputString.equals("NO")
		|| keyboardInputString.equals("NO INDEED")
		|| keyboardInputString.equals("ABSOLUTELY NOT")
		|| keyboardInputString.equals("MOST CERTAINLY NOT")
		|| keyboardInputString.equals("OF COURSE NOT")
		|| keyboardInputString.equals("UNDER NO CIRCUMSTANCES")
		|| keyboardInputString.equals("BY NO MEANS")
		|| keyboardInputString.equals("NOT AT ALL")
		|| keyboardInputString.equals("NEGATIVE")
		|| keyboardInputString.equals("NEGATIVO")
		|| keyboardInputString.equals("NEVER")
		|| keyboardInputString.equals("NOT REALLY")
		|| keyboardInputString.equals("NO THANKS")
		|| keyboardInputString.equals("NAE")
		|| keyboardInputString.equals("NOPE")
		|| keyboardInputString.equals("NA")
		|| keyboardInputString.equals("NAH")
		|| keyboardInputString.equals("NOT ON YOUR LIFE")
		|| keyboardInputString.equals("NO WAY")
		|| keyboardInputString.equals("NO WAY JOSE")
		|| keyboardInputString.equals("NOT ON YOUR NELLY")
		|| keyboardInputString.equals("NO SIR")
		|| keyboardInputString.equals("NO SIREE")
		|| keyboardInputString.equals("NAW")
		|| keyboardInputString.equals("NOTHING")
		|| keyboardInputString.equals("NAY")) {
			keyboardInputString = "NO";
		}
		
		if (keyboardInputString.equals("BUSINESS")
		|| keyboardInputString.equals("BUSINESS CALL")
		|| keyboardInputString.equals("BUSINESS ONE")
		|| keyboardInputString.equals("BIZ")) {
			keyboardInputString = "BUSINESS";
		}
		
		if (keyboardInputString.equals("SCHEDULE")
		|| keyboardInputString.equals("APPOINTMENT")
		|| keyboardInputString.equals("APT")
		|| keyboardInputString.equals("APPT")
		|| keyboardInputString.equals("LESSON")
		|| keyboardInputString.equals("FORMER")
		|| keyboardInputString.equals("THE FORMER")
		|| keyboardInputString.equals("IN DEPTH")
		|| keyboardInputString.equals("INDEPTH")
		|| keyboardInputString.equals("INDEPTH LESSON")
		|| keyboardInputString.equals("IN DEPTH LESSON")
		|| keyboardInputString.equals("SCHEDULE LESSON")) {
			keyboardInputString = "SCHEDULE";
		}
		
		if (keyboardInputString.equals("FREE PHONE")
		|| keyboardInputString.equals("FREE")
		|| keyboardInputString.equals("PHONE")
		|| keyboardInputString.equals("LATTER")
		|| keyboardInputString.equals("THE LATTER")
		|| keyboardInputString.equals("FREE PHONE CONSULT")
		|| keyboardInputString.equals("PHONE CONSULT")
		|| keyboardInputString.equals("FREE CONSULT")
		|| keyboardInputString.equals("CONSULT")
		|| keyboardInputString.equals("CONSULTATION")) {
			keyboardInputString = "PHONE";
		}
		
		if (keyboardInputString.equals("BYE")
		|| keyboardInputString.equals("GOOD BYE")
		|| keyboardInputString.equals("GOODBYE")
		|| keyboardInputString.equals("GOOD DAY")
		|| keyboardInputString.equals("CYA")
		|| keyboardInputString.equals("SEEYA")
		|| keyboardInputString.equals("SEE YA")
		|| keyboardInputString.equals("SAYONARA")
		|| keyboardInputString.equals("LATER")
		|| keyboardInputString.equals("LEAVE")
		|| keyboardInputString.equals("STOP")
		|| keyboardInputString.equals("END")
		|| keyboardInputString.equals("STOP MEDITATING")
		|| keyboardInputString.equals("STOP MEDITATION")
		|| keyboardInputString.equals("EXIT MEDITATING")
		|| keyboardInputString.equals("EXIT MEDITATION")
		|| keyboardInputString.equals("LEAVE MEDITATING")
		|| keyboardInputString.equals("LEAVE MEDITATION")
		|| keyboardInputString.equals("END MEDITATING")
		|| keyboardInputString.equals("END MEDITATION")
		|| keyboardInputString.equals("FINISHED")
		|| keyboardInputString.equals("WAKE UP")
		|| keyboardInputString.equals("OPEN EYES")
		|| keyboardInputString.equals("OPEN MY EYES")
		|| keyboardInputString.equals("DONE")
		|| keyboardInputString.equals("ALL DONE")
		|| keyboardInputString.equals("FINISH")
		|| keyboardInputString.equals("DEWA MATA")) {
			keyboardInputString = "BYE";
		}
		
		if (keyboardInputString.equals("TEA")
		|| keyboardInputString.equals("TAKE TEA")
		|| keyboardInputString.equals("CUP")
		|| keyboardInputString.equals("TAKE CUP")
		|| keyboardInputString.equals("TAKE THE CUP")
		|| keyboardInputString.equals("TAKE A DRINK FROM CUP")
		|| keyboardInputString.equals("TAKE A CUP")
		|| keyboardInputString.equals("TAKE A SIP")
		|| keyboardInputString.equals("TAKE THE SIP")
		|| keyboardInputString.equals("SIP TEA")
		|| keyboardInputString.equals("SIP THE TEA")
		|| keyboardInputString.equals("TAKE SIP")
		|| keyboardInputString.equals("SIP THE CUP")
		|| keyboardInputString.equals("SIP ON CUP")
		|| keyboardInputString.equals("SIP DRINK")
		|| keyboardInputString.equals("DRINK CUP")
		|| keyboardInputString.equals("DRINK THE CUP")
		|| keyboardInputString.equals("DRINK THE TEA")
		|| keyboardInputString.equals("DRINK MY TEA")
		|| keyboardInputString.equals("SIP MY TEA")
		|| keyboardInputString.equals("MY TEA")
		|| keyboardInputString.equals("MY DRINK")
		|| keyboardInputString.equals("MY SIP")
		|| keyboardInputString.equals("GIVE ME A DRINK")
		|| keyboardInputString.equals("GRAB CUP")
		|| keyboardInputString.equals("GRAB TEA")
		|| keyboardInputString.equals("POUR TEA")
		|| keyboardInputString.equals("POUR SOME TEA")
		|| keyboardInputString.equals("GRAB DRINK")
		|| keyboardInputString.equals("DRINK IT")
		|| keyboardInputString.equals("DRINK")
		|| keyboardInputString.equals("DRINK TEA")
		|| keyboardInputString.equals("TAKE DRINK")
		|| keyboardInputString.equals("TAKE A DRINK")
		|| keyboardInputString.equals("TAKE A DRINK OF TEA")
		|| keyboardInputString.equals("SIP")) {
			keyboardInputString = "TEA";
		}
		
		if (keyboardInputString.equals("ICHIRO")
		|| keyboardInputString.equals("YOU")
		|| keyboardInputString.equals("HOW ARE YOU")
		|| keyboardInputString.equals("HOW ARE YA")
		|| keyboardInputString.equals("HOW R U")
		|| keyboardInputString.equals("HRU")
		|| keyboardInputString.equals("HOW R YOU")
		|| keyboardInputString.equals("HOW ARE U")
		|| keyboardInputString.equals("SUP")
		|| keyboardInputString.equals("SUP DOG")
		|| keyboardInputString.equals("SUP DAWG")
		|| keyboardInputString.equals("WHADDUP")
		|| keyboardInputString.equals("ASK")
		|| keyboardInputString.equals("WHAT UP")
		|| keyboardInputString.equals("WHATS UP")
		|| keyboardInputString.equals("OGENKIDESUKA")
		|| keyboardInputString.equals("TALK ABOUT YOU")
		|| keyboardInputString.equals("ICHIRO")
		|| keyboardInputString.equals("HISACHI")
		|| keyboardInputString.equals("HISACHI ICHIRO")
		|| keyboardInputString.equals("YOURSELF")
		|| keyboardInputString.equals("WHO ARE YOU")
		|| keyboardInputString.equals("WHAT DO YOU DO")
		|| keyboardInputString.equals("U")
		|| keyboardInputString.equals("COMO ESTAS")
		|| keyboardInputString.equals("TOD")) {
			keyboardInputString = "ICHIRO";
		}
		
		if (keyboardInputString.equals("POWER")
		|| keyboardInputString.equals("OUTAGE")
		|| keyboardInputString.equals("POWER OUTAGE")
		|| keyboardInputString.equals("ELECTRICITY")
		|| keyboardInputString.equals("LIGHTS")
		|| keyboardInputString.equals("HEAT")
		|| keyboardInputString.equals("AIR CONDITIONING")
		|| keyboardInputString.equals("AIR CONDITIONER")
		|| keyboardInputString.equals("AC")
		|| keyboardInputString.equals("AC UNIT")
		|| keyboardInputString.equals("BULB")
		|| keyboardInputString.equals("BULBS")
		|| keyboardInputString.equals("LIGHT BULBS")
		|| keyboardInputString.equals("PLAQUE")
		|| keyboardInputString.equals("PLAQUES")
		|| keyboardInputString.equals("WOODEN POST")
		|| keyboardInputString.equals("POST")
		|| keyboardInputString.equals("SLATE")
		|| keyboardInputString.equals("METAL PLAQUE")
		|| keyboardInputString.equals("STRANGE PLAQUE")
		|| keyboardInputString.equals("WHAT HAPPENED")
		|| keyboardInputString.equals("HELP")) {
			keyboardInputString = "POWER";
		}
		
		if (keyboardInputString.equals("SCROLL")
		|| keyboardInputString.equals("SCROLLS")
		|| keyboardInputString.equals("GIVE SCROLL")
		|| keyboardInputString.equals("GIVE SCROLLS")
		|| keyboardInputString.equals("I WANT SCROLL")
		|| keyboardInputString.equals("I WANT SCROLLS")
		|| keyboardInputString.equals("I WANT THE SCROLL")
		|| keyboardInputString.equals("I WANT THE SCROLLS")
		|| keyboardInputString.equals("GIVE THE SCROLL")
		|| keyboardInputString.equals("GIVE THE SCROLLS")
		|| keyboardInputString.equals("GIVE ME SCROLL")
		|| keyboardInputString.equals("GIVE ME SCROLLS")
		|| keyboardInputString.equals("GIVE ME THE SCROLLS")
		|| keyboardInputString.equals("GIVE ME THE SCROLL")) {
			keyboardInputString = "SCROLL";
		}
		
		if (keyboardInputString.equals("FUCK YOU")
		|| keyboardInputString.equals("FUCK OFF")
		|| keyboardInputString.equals("FUCK")
		|| keyboardInputString.equals("GO FUCK YOURSELF")
		|| keyboardInputString.equals("FUCK YOURSELF")
		|| keyboardInputString.equals("WAIT")
		|| keyboardInputString.equals("DON'T SHOOT")
		|| keyboardInputString.equals("DONT SHOOT")
		|| keyboardInputString.equals("DONT KILL ME")
		|| keyboardInputString.equals("DON'T KILL ME")
		|| keyboardInputString.equals("DONT")
		|| keyboardInputString.equals("DON'T")
		|| keyboardInputString.equals("KILL ME")
		|| keyboardInputString.equals("DIE")
		|| keyboardInputString.equals("GO DIE")
		|| keyboardInputString.equals("I LOVE YOU")
		|| keyboardInputString.equals("I HATE YOU")
		|| keyboardInputString.equals("SHOVE IT")
		|| keyboardInputString.equals("ASS")
		|| keyboardInputString.equals("COCK")
		|| keyboardInputString.equals("PENIS")
		|| keyboardInputString.equals("DICK")
		|| keyboardInputString.equals("VAGINA")
		|| keyboardInputString.equals("SUCK MY DICK")
		|| keyboardInputString.equals("SUCK IT")
		|| keyboardInputString.equals("SUCK MY COCK")
		|| keyboardInputString.equals("SUCK MY NUTS")
		|| keyboardInputString.equals("SUCK MY NUTSACK")
		|| keyboardInputString.equals("SUCK MY NUT SACK")
		|| keyboardInputString.equals("EAT COCK")
		|| keyboardInputString.equals("EAT SHIT")
		|| keyboardInputString.equals("SUCK A DICK")
		|| keyboardInputString.equals("DIE")
		|| keyboardInputString.equals("GO DIE")
		|| keyboardInputString.equals("BITCH")
		|| keyboardInputString.equals("BITCHASS")) {
			keyboardInputString = "FUCK";
		}
		
		if (keyboardInputString.equals("IDK")
		|| keyboardInputString.equals("I DON'T KNOW")
		|| keyboardInputString.equals("I DONT KNOW")
		|| keyboardInputString.equals("DONT KNOW")
		|| keyboardInputString.equals("NO IDEA")
		|| keyboardInputString.equals("NO CLUE")
		|| keyboardInputString.equals("NO DAMN CLUE")
		|| keyboardInputString.equals("NO FUCKIN CLUE")
		|| keyboardInputString.equals("NO FUCKING CLUE")
		|| keyboardInputString.equals("NOT A CLUE")
		|| keyboardInputString.equals("IDFK")
		|| keyboardInputString.equals("NOT SURE")) {
			keyboardInputString = "IDK";
		}
		
		if (keyboardInputString.equals("EAT")
		|| keyboardInputString.equals("EAT CORN")
		|| keyboardInputString.equals("EAT THE CORN")
		|| keyboardInputString.equals("EAT IT")
		|| keyboardInputString.equals("SWALLOW")
		|| keyboardInputString.equals("SWALLOW CORN")
		|| keyboardInputString.equals("SWALLOW THE CORN")
		|| keyboardInputString.equals("SWALLOW IT")
		|| keyboardInputString.equals("CONSUME")) {
			keyboardInputString = "EAT";
		}
		
		if (keyboardInputString.equals("TASTE")
		|| keyboardInputString.equals("TASTE CORN")
		|| keyboardInputString.equals("TASTE THE CORN")
		|| keyboardInputString.equals("TASTE IT")
		|| keyboardInputString.equals("LICK")
		|| keyboardInputString.equals("LICK CORN")
		|| keyboardInputString.equals("LICK THE CORN")
		|| keyboardInputString.equals("LICK IT")) {
			keyboardInputString = "TASTE";
		}
		
		if (keyboardInputString.equals("SMELL")
		|| keyboardInputString.equals("SMELL CORN")
		|| keyboardInputString.equals("SMELL THE CORN")
		|| keyboardInputString.equals("SMELL IT")
		|| keyboardInputString.equals("SNIFF")
		|| keyboardInputString.equals("SNIFF CORN")
		|| keyboardInputString.equals("SNIFF THE CORN")
		|| keyboardInputString.equals("SNIFF IT")) {
			keyboardInputString = "SMELL";
		}
		
		if (keyboardInputString.equals("DROP")
		|| keyboardInputString.equals("DROP CORN")
		|| keyboardInputString.equals("DROP THE CORN")
		|| keyboardInputString.equals("DROP IT")
		|| keyboardInputString.equals("THROW")
		|| keyboardInputString.equals("THROW CORN")
		|| keyboardInputString.equals("THROW THE CORN")
		|| keyboardInputString.equals("THROW IT")
		|| keyboardInputString.equals("TOSS")
		|| keyboardInputString.equals("TOSS CORN")
		|| keyboardInputString.equals("TOSS THE CORN")
		|| keyboardInputString.equals("TOSS IT")) {
			keyboardInputString = "DROP";
		}
		
		if (keyboardInputString.equals("ATTACH")
		|| keyboardInputString.equals("ATTACH CORN")
		|| keyboardInputString.equals("ATTACH THE CORN")
		|| keyboardInputString.equals("ATTACH IT")
		|| keyboardInputString.equals("ATTACH TO ROD")
		|| keyboardInputString.equals("ATTACH TO POLE")
		|| keyboardInputString.equals("ATTACH TO FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH TO FISHINGROD")
		|| keyboardInputString.equals("ATTACH TO FISHING POLE")
		|| keyboardInputString.equals("ATTACH TO FISHING ROD")
		|| keyboardInputString.equals("ATTACH IT")
		|| keyboardInputString.equals("ATTACH IT TO ROD")
		|| keyboardInputString.equals("ATTACH IT TO POLE")
		|| keyboardInputString.equals("ATTACH IT TO FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH IT TO FISHINGROD")
		|| keyboardInputString.equals("ATTACH IT TO FISHING POLE")
		|| keyboardInputString.equals("ATTACH IT TO FISHING ROD")
		|| keyboardInputString.equals("ATTACH IT ON ROD")
		|| keyboardInputString.equals("ATTACH IT ON POLE")
		|| keyboardInputString.equals("ATTACH IT ON FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH IT ON FISHINGROD")
		|| keyboardInputString.equals("ATTACH IT ON FISHING POLE")
		|| keyboardInputString.equals("ATTACH IT ON FISHING ROD")
		|| keyboardInputString.equals("ATTACH CORN TO ROD")
		|| keyboardInputString.equals("ATTACH CORN TO POLE")
		|| keyboardInputString.equals("ATTACH CORN TO FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH CORN TO FISHINGROD")
		|| keyboardInputString.equals("ATTACH CORN TO FISHING POLE")
		|| keyboardInputString.equals("ATTACH CORN TO FISHING ROD")
		|| keyboardInputString.equals("ATTACH CORN ON ROD")
		|| keyboardInputString.equals("ATTACH CORN ON POLE")
		|| keyboardInputString.equals("ATTACH CORN ON FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH CORN ON FISHINGROD")
		|| keyboardInputString.equals("ATTACH CORN ON FISHING POLE")
		|| keyboardInputString.equals("ATTACH CORN ON FISHING ROD")
		|| keyboardInputString.equals("BAIT")
		|| keyboardInputString.equals("HOOK")
		|| keyboardInputString.equals("HOOK CORN")
		|| keyboardInputString.equals("HOOK THE CORN")
		|| keyboardInputString.equals("HOOK IT")
		|| keyboardInputString.equals("HOOK TO ROD")
		|| keyboardInputString.equals("HOOK TO POLE")
		|| keyboardInputString.equals("HOOK TO FISHINGPOLE")
		|| keyboardInputString.equals("HOOK TO FISHINGROD")
		|| keyboardInputString.equals("HOOK TO FISHING POLE")
		|| keyboardInputString.equals("HOOK TO FISHING ROD")
		|| keyboardInputString.equals("HOOK IT TO ROD")
		|| keyboardInputString.equals("HOOK IT TO POLE")
		|| keyboardInputString.equals("HOOK IT TO FISHINGPOLE")
		|| keyboardInputString.equals("HOOK IT TO FISHINGROD")
		|| keyboardInputString.equals("HOOK IT TO FISHING POLE")
		|| keyboardInputString.equals("HOOK IT TO FISHING ROD")
		|| keyboardInputString.equals("HOOK CORN TO ROD")
		|| keyboardInputString.equals("HOOK CORN TO POLE")
		|| keyboardInputString.equals("HOOK CORN TO FISHINGPOLE")
		|| keyboardInputString.equals("HOOK CORN TO FISHINGROD")
		|| keyboardInputString.equals("HOOK CORN TO FISHING POLE")
		|| keyboardInputString.equals("HOOK CORN TO FISHING ROD")
		|| keyboardInputString.equals("HOOK ON")
		|| keyboardInputString.equals("HOOK ON ROD")
		|| keyboardInputString.equals("HOOK ON POLE")
		|| keyboardInputString.equals("HOOK ON FISHINGPOLE")
		|| keyboardInputString.equals("HOOK ON FISHINGROD")
		|| keyboardInputString.equals("HOOK ON FISHING POLE")
		|| keyboardInputString.equals("HOOK ON FISHING ROD")
		|| keyboardInputString.equals("HOOK IT ON ROD")
		|| keyboardInputString.equals("HOOK IT ON POLE")
		|| keyboardInputString.equals("HOOK IT ON FISHINGPOLE")
		|| keyboardInputString.equals("HOOK IT ON FISHINGROD")
		|| keyboardInputString.equals("HOOK IT ON FISHING POLE")
		|| keyboardInputString.equals("HOOK IT ON FISHING ROD")
		|| keyboardInputString.equals("HOOK CORN ON ROD")
		|| keyboardInputString.equals("HOOK CORN ON POLE")
		|| keyboardInputString.equals("HOOK CORN ON FISHINGPOLE")
		|| keyboardInputString.equals("HOOK CORN ON FISHINGROD")
		|| keyboardInputString.equals("HOOK CORN ON FISHING POLE")
		|| keyboardInputString.equals("HOOK CORN ON FISHING ROD")
		|| keyboardInputString.equals("PUT ON ROD")
		|| keyboardInputString.equals("PUT ON POLE")
		|| keyboardInputString.equals("PUT ON FISHINGPOLE")
		|| keyboardInputString.equals("PUT ON FISHINGROD")
		|| keyboardInputString.equals("PUT ON FISHING POLE")
		|| keyboardInputString.equals("PUT ON FISHING ROD")
		|| keyboardInputString.equals("PUT ON ROD")
		|| keyboardInputString.equals("PUT ON ROD")
		|| keyboardInputString.equals("PUT CORN ON ROD")
		|| keyboardInputString.equals("PUT CORN ON POLE")
		|| keyboardInputString.equals("PUT CORN ON FISHINGPOLE")
		|| keyboardInputString.equals("PUT CORN ON FISHINGROD")
		|| keyboardInputString.equals("PUT CORN ON FISHING POLE")
		|| keyboardInputString.equals("PUT CORN ON FISHING ROD")
		|| keyboardInputString.equals("PUT CORN ON ROD")
		|| keyboardInputString.equals("PUT CORN ON ROD")
		|| keyboardInputString.equals("CORN ROD")
		|| keyboardInputString.equals("CORN POLE")
		|| keyboardInputString.equals("CORN FISHINGPOLE")
		|| keyboardInputString.equals("CORN FISHINGROD")
		|| keyboardInputString.equals("CORN FISHING POLE")
		|| keyboardInputString.equals("CORN FISHING ROD")
		|| keyboardInputString.equals("ROD")
		|| keyboardInputString.equals("POLE")
		|| keyboardInputString.equals("BAIT ROD")
		|| keyboardInputString.equals("BAIT POLE")
		|| keyboardInputString.equals("BAIT HOOK")
		|| keyboardInputString.equals("BAIT FISHINGPOLE")
		|| keyboardInputString.equals("BAIT FISHINGROD")
		|| keyboardInputString.equals("BAIT FISHING POLE")
		|| keyboardInputString.equals("BAIT FISHING ROD")
		|| keyboardInputString.equals("CORN POLE")
		|| keyboardInputString.equals("CORN ROD")
		|| keyboardInputString.equals("CORN FISHINGPOLE")
		|| keyboardInputString.equals("CORN FISHINGROD")
		|| keyboardInputString.equals("CORN FISHING POLE")
		|| keyboardInputString.equals("CORN FISHING ROD")
		|| keyboardInputString.equals("ATTACH TO HOOK")
		|| keyboardInputString.equals("ATTACH IT TO HOOK")
		|| keyboardInputString.equals("ATTACH IT ON HOOK")
		|| keyboardInputString.equals("ATTACH CORN TO HOOK")
		|| keyboardInputString.equals("ATTACH CORN ON HOOK")
		|| keyboardInputString.equals("HOOK TO HOOK")
		|| keyboardInputString.equals("HOOK IT TO HOOK")
		|| keyboardInputString.equals("HOOK CORN TO HOOK")
		|| keyboardInputString.equals("HOOK ON")
		|| keyboardInputString.equals("HOOK ON HOOK")
		|| keyboardInputString.equals("HOOK IT ON HOOK")
		|| keyboardInputString.equals("HOOK CORN ON HOOK")
		|| keyboardInputString.equals("PUT ON HOOK")
		|| keyboardInputString.equals("PUT CORN ON HOOK")
		|| keyboardInputString.equals("ATTACH BAIT")
		|| keyboardInputString.equals("ATTACH THE BAIT")
		|| keyboardInputString.equals("ATTACH BAIT")
		|| keyboardInputString.equals("ATTACH BAIT TO ROD")
		|| keyboardInputString.equals("ATTACH BAIT TO POLE")
		|| keyboardInputString.equals("ATTACH BAIT TO FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH BAIT TO FISHINGROD")
		|| keyboardInputString.equals("ATTACH BAIT TO FISHING POLE")
		|| keyboardInputString.equals("ATTACH BAIT TO FISHING ROD")
		|| keyboardInputString.equals("ATTACH BAIT ON ROD")
		|| keyboardInputString.equals("ATTACH BAIT ON POLE")
		|| keyboardInputString.equals("ATTACH BAIT ON FISHINGPOLE")
		|| keyboardInputString.equals("ATTACH BAIT ON FISHINGROD")
		|| keyboardInputString.equals("ATTACH BAIT ON FISHING POLE")
		|| keyboardInputString.equals("ATTACH BAIT ON FISHING ROD")
		|| keyboardInputString.equals("HOOK BAIT")
		|| keyboardInputString.equals("HOOK THE BAIT")
		|| keyboardInputString.equals("HOOK BAIT TO ROD")
		|| keyboardInputString.equals("HOOK BAIT TO POLE")
		|| keyboardInputString.equals("HOOK BAIT TO FISHINGPOLE")
		|| keyboardInputString.equals("HOOK BAIT TO FISHINGROD")
		|| keyboardInputString.equals("HOOK BAIT TO FISHING POLE")
		|| keyboardInputString.equals("HOOK BAIT TO FISHING ROD")
		|| keyboardInputString.equals("HOOK BAIT ON ROD")
		|| keyboardInputString.equals("HOOK BAIT ON POLE")
		|| keyboardInputString.equals("HOOK BAIT ON FISHINGPOLE")
		|| keyboardInputString.equals("HOOK BAIT ON FISHINGROD")
		|| keyboardInputString.equals("HOOK BAIT ON FISHING POLE")
		|| keyboardInputString.equals("HOOK BAIT ON FISHING ROD")
		|| keyboardInputString.equals("PUT BAIT ON ROD")
		|| keyboardInputString.equals("PUT BAIT ON POLE")
		|| keyboardInputString.equals("PUT BAIT ON FISHINGPOLE")
		|| keyboardInputString.equals("PUT BAIT ON FISHINGROD")
		|| keyboardInputString.equals("PUT BAIT ON FISHING POLE")
		|| keyboardInputString.equals("PUT BAIT ON FISHING ROD")
		|| keyboardInputString.equals("PUT BAIT ON ROD")
		|| keyboardInputString.equals("PUT BAIT ON ROD")
		|| keyboardInputString.equals("BAIT ROD")
		|| keyboardInputString.equals("BAIT POLE")
		|| keyboardInputString.equals("BAIT FISHINGPOLE")
		|| keyboardInputString.equals("BAIT FISHINGROD")
		|| keyboardInputString.equals("BAIT FISHING POLE")
		|| keyboardInputString.equals("BAIT FISHING ROD")
		|| keyboardInputString.equals("BAIT ROD")
		|| keyboardInputString.equals("BAIT POLE")
		|| keyboardInputString.equals("BAIT HOOK")
		|| keyboardInputString.equals("ATTACH TO HOOK")
		|| keyboardInputString.equals("ATTACH IT TO HOOK")
		|| keyboardInputString.equals("ATTACH IT ON HOOK")
		|| keyboardInputString.equals("ATTACH BAIT TO HOOK")
		|| keyboardInputString.equals("ATTACH BAIT ON HOOK")
		|| keyboardInputString.equals("HOOK BAIT TO HOOK")
		|| keyboardInputString.equals("HOOK ON")
		|| keyboardInputString.equals("HOOK ON HOOK")
		|| keyboardInputString.equals("HOOK IT ON HOOK")
		|| keyboardInputString.equals("HOOK BAIT ON HOOK")
		|| keyboardInputString.equals("PUT ON HOOK")
		|| keyboardInputString.equals("PUT BAIT ON HOOK")
		|| keyboardInputString.equals("FISHINGROD")
		|| keyboardInputString.equals("FISHINGPOLE")
		|| keyboardInputString.equals("FISHING ROD")
		|| keyboardInputString.equals("FISHING POLE")) {
			keyboardInputString = "ATTACH";
		}
		
		if (keyboardInputString.equals("TEMPLE")
		|| keyboardInputString.equals("TEMPLE GROUNDS")
		|| keyboardInputString.equals("HERE")
		|| keyboardInputString.equals("PLACE")
		|| keyboardInputString.equals("LOCATION")
		|| keyboardInputString.equals("WHERE AM I")
		|| keyboardInputString.equals("WHERE AM I?")
		|| keyboardInputString.equals("HELP")
		|| keyboardInputString.equals("PATH")
		|| keyboardInputString.equals("PATHS")
		|| keyboardInputString.equals("CLUE")
		|| keyboardInputString.equals("HINT")
		|| keyboardInputString.equals("GIVE ME A HINT")
		|| keyboardInputString.equals("GIVE ME A CLUE")
		|| keyboardInputString.equals("I NEED HELP")
		|| keyboardInputString.equals("IM STUCK")
		|| keyboardInputString.equals("I'M STUCK")
		|| keyboardInputString.equals("IM LOST")
		|| keyboardInputString.equals("I'M LOST")
		|| keyboardInputString.equals("WHAT DO I DO")
		|| keyboardInputString.equals("WHAT DO I DO?")
		|| keyboardInputString.equals("HELP ME")
		|| keyboardInputString.equals("PLEASE HELP")
		|| keyboardInputString.equals("PLEASE HELP ME")
		|| keyboardInputString.equals("WHAT NEXT")
		|| keyboardInputString.equals("MAP")
		|| keyboardInputString.equals("WORLD")
		|| keyboardInputString.equals("SHRINE")
		|| keyboardInputString.equals("HONDO")
		|| keyboardInputString.equals("WORLD")
		|| keyboardInputString.equals("GIVE ME A MAP")
		|| keyboardInputString.equals("HERE")) {
			keyboardInputString = "TEMPLE";
		}
		
		if (keyboardInputString.equals("SAVE")
		|| keyboardInputString.equals("SAVE THE GAME")
		|| keyboardInputString.equals("SAVE DA GAME")
		|| keyboardInputString.equals("SAVE DER GAME")
		|| keyboardInputString.equals("SAVE MY GAME")
		|| keyboardInputString.equals("SAVE BUNRAKU")
		|| keyboardInputString.equals("SAVE GAME")) {
			keyboardInputString = "SAVE";
		}
		
		if (keyboardInputString.equals("CASE")
		|| keyboardInputString.equals("TRINKET")
		|| (keyboardInputString.equals("SCROLL CASE") && Player.position.equals("t9n shop"))
		|| (keyboardInputString.equals("SCROLL") && Player.position.equals("t9n shop"))
		|| (keyboardInputString.equals("SCROLLS") && Player.position.equals("t9n shop"))
		|| keyboardInputString.equals("OPEN")
		|| keyboardInputString.equals("FIX")
		|| keyboardInputString.equals("TRY AGAIN")
		|| keyboardInputString.equals("LET ME HELP")) {
			keyboardInputString = "CASE";
		}
		
		// TEMPLATE
		if (keyboardInputString.equals("1")
		|| keyboardInputString.equals("2")
		|| keyboardInputString.equals("3")) {
			keyboardInputString = "1";
		}
		
		keyboardInputSubmit();
	}
	
	public static void setMonkAnswer() {
		// save monk answers so the year will not be set to something player already guessed
		Data.monkAnswerList.add(keyboardInputString);
		System.out.println(Data.monkAnswerList);
		
		// save monk answer to be used in dream sequence
		Message.monkAnswer.setLength(0);
		Message.monkAnswer.append(Message.quotationMark);
		
		if (keyboardInputString.equals("")) {
			Message.monkAnswer.append("..");
		} else {
			Message.monkAnswer.append(keyboardInputString);
		}
		
		Message.monkAnswer.append(Message.period.toString());
		Message.monkAnswer.append(Message.quotationMark.toString());
		Message.textMonkAnswer = Message.monkAnswer.toString();
	}
	
	public static void checkInput(char c) {
		if (Character.isLetter(c) || Character.isDigit(c) || Character.isWhitespace(c)) {
			keyboardInputAppend(c);
		} else {
			System.out.println("Keyboard.checkInput() illegal char");
		}
	}
}