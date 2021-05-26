public class ClickCenter {
	public static void clickCenter() {
		switch (Player.position) {
			case "title":
				if (Mouse.x > 243 && Mouse.x < 319 && Mouse.y > 297 && Mouse.y < 332) {
					Player.position = "loading";
					Animation.setWait(5,107);
				}
				
				if (Mouse.x > 243 && Mouse.x < 319 && Mouse.y > 332 && Mouse.y < 376) {
					Data.checkLoad();
				}
				break;
				
			/** GARDEN */
			case "g1s":
				Player.position = "g2s";
				break;
			case "g1n":
				Message.readG1N();
				break;
			case "g2n":
				Player.position = "g1n";
				break;
			case "g2e":
				Player.position = "g7e";
				break;
			case "g2s":
				Player.position = "g10s";
				break;
			case "g2w":
				Player.position = "g3w";
				break;
			case "g3e":
				Player.position = "g2e";
				break;
			case "g3s":
				Player.position = "g10s";
				break;
			case "g3n":
				Player.position = "g1n";
				break;
			case "g3w":
				Player.position = "g4w";
				break;
			case "g4e":
				Player.position = "g3e";
				break;
			case "g4w":
				if (Mouse.x > 346) {
					Player.position = "g5w";
				}
				break;
			case "g5w":
				Player.position = "g6w";
				break;
			case "g5e":
				Player.position = "g4e";
				break;
			case "g6e":
				Player.position = "g5e";
				break;
			case "g6n":
				//TEST
				if (Mouse.x > 342 && Mouse.x < 410 && Mouse.y > 218 && Mouse.y < 249) {
					//System.out.println("Animation.setMovement() & Animation.moveImage()");
					//Animation.setMovement(2,300,-300,50);
				}
				
				if (!Player.holdingACBook && Mouse.x > 208 && Mouse.x < 327 && Mouse.y > 314 && Mouse.y < 384) {
					// pick up AC book
					Audio.startEquip3();
					Player.setBusy(true); 
					ImagePanel.image2Y = 375;
					Player.holdingACBook = true;
					Animation.raisingBook = true;
				} else if (Player.holdingACBook && Mouse.x < 426 && Mouse.y > 70 && Mouse.y < 361) {
					if (Item.bookPage == 0 && Mouse.x < 214) {
						// put AC book down (if not opened)
						if (!Animation.loweringBook) {
							Player.setBusy(true); 
							Animation.loweringBook = true;
							Player.setDisableWalk(true);
							Audio.startEquip2(); 
						}
					} else {
						// turn page of AC book
						Item.bookTurnPage();
					}
				} else if (Player.holdingACBook && !Animation.loweringBook) {
					// put AC book down
					Player.setBusy(true); 
					Animation.loweringBook = true;
					Player.setDisableWalk(true);
					Audio.startEquip2();
				}
				break;	
			case "g7w":
				Player.position = "g2w";
				break;
			case "g7e":
				Player.position = "g8e";
				break;
			case "g8w":
				Player.position = "g7w";
				break;
			case "g8e":
				Player.position = "g9e";
				break;
			case "g9s":
				if (Mouse.x > 109 && Mouse.x < 170 && Mouse.y > 109 && Mouse.y < 227) {
					Message.readG9RS();
				}
				
				if (!World.g9DoorOpen && Mouse.x > 280 && Mouse.x < 318 && Mouse.y > 135 && Mouse.y < 178) {
					Player.examiningPlaque = true;
				} else if (!World.g9DoorOpen && !World.OOX && Mouse.x > 238 && Mouse.x < 354 && Mouse.y > 93 && Mouse.y < 369) {
					// locked door notif
					Audio.startLocked();
				} else if (!World.g9DoorOpen && World.OOX && Mouse.x > 238 && Mouse.x < 354 && Mouse.y > 93 && Mouse.y < 369) {
					World.g9DoorOpen = true;
					Audio.startDoorOpen();
				} else if (World.g9DoorOpen && Mouse.x > 238 && Mouse.x < 354 && Mouse.y > 93 && Mouse.y < 369) {
					Player.position = "g9rs";
					
					if (World.purpleAlive)
						Animation.displayingGTVpaperCranes = true;
				}
				break;
			case "g9w":
				Player.position = "g8w";
				break;
			case "g9rn":
				Player.position = "g9n";
				break;
			case "g9rw":
				if (!World.satchelOpen && Mouse.x > 153 && Mouse.x < 342 && Mouse.y > 195 && Mouse.y < 339) {
					// open satchel
					World.satchelOpen = true;
					Audio.startEquip5();
				} else if (World.satchelOpen && Mouse.x > 153 && Mouse.x < 341 && Mouse.y > 193 && Mouse.y < 258 && !Player.holdingDoll) {
					// examine doll
					Player.setBusy(true);
					ImagePanel.image2Y = 375;
					Player.holdingDoll = true;
					Animation.raisingDoll = true;
					Audio.startEquip3();
				} else if (Player.holdingDoll) {
					// put doll away
					Animation.loweringDoll = true;
					Audio.startEquip2();
				}
				break;	
			case "g9re":
				if (Player.examiningJi) {
					Animation.closingScroll = true;
				} else if (!World.open && Mouse.x > 232 && Mouse.x < 295 && Mouse.y > 49 && Mouse.y < 109) {
					// examine plaque
					Player.examiningPlaque = true;
				} else if (!World.open && !World.OXO && Mouse.x > 186 && Mouse.x < 253 && Mouse.y > 118 && Mouse.y < 143) {
					// click locked safe handle
					Audio.startLocked();
				} else if (!World.open && World.OXO && Mouse.x > 186 && Mouse.x < 253 && Mouse.y > 118 && Mouse.y < 143) {
					// open safe
					Animation.setDelay(); // begins timer for pushing down button
					Animation.openingSafe = true;
				} else if (World.open && !Player.hasJi && Mouse.x > 200 && Mouse.x < 327 && Mouse.y > 170 && Mouse.y < 202) {
					// click ji scroll
					Item.getScroll();
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.scrollY = -250;
					Player.examiningJi = true;
					Animation.openingScroll = true;
					Audio.startScroll();
					Player.hasJi = true;
					Audio.startScroll();
				} else if (World.open && Mouse.x > 338 && Mouse.x < 500 && Mouse.y > 44 && Mouse.y < 223) {
					// close safe
					World.open = false;
					Audio.startSafeShut(); 
				}
				break;
			case "g9rs":
				if (Mouse.x > 202 && Mouse.x < 312 && Mouse.y > 298 && Mouse.y < 400) {
					Player.position = "gTV";
					
					if (World.purpleAlive) {
						Animation.displayingGTVpaperCranes = true;
					} else {
						Animation.displayingGTVpaperCranes = false;
					}
				}
				if (Mouse.x > 255 && Mouse.x < 285 && Mouse.y > 219 && Mouse.y < 294)
					Message.readG9RS();
				break;
			case "gTV":
				if (Mouse.x > 181 && Mouse.x < 309 && Mouse.y > 330 && Mouse.y < 374)
					Player.position = "gTVControls";
				break;
			case "gTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263)
					World.pressRewind();
				
				// play
				if (Mouse.x > 143 && Mouse.x < 216 && Mouse.y > 200 && Mouse.y < 262)
					World.pressPlay();
				
				// fastforward
				if (Mouse.x > 232 && Mouse.x < 301 && Mouse.y > 200 && Mouse.y < 261)
					World.pressFastforward();
				
				// pause
				if (Mouse.x > 321 && Mouse.x < 388 && Mouse.y > 199 && Mouse.y < 261)
					World.pressPause();
				
				// stop
				if (Mouse.x > 411 && Mouse.x < 477 && Mouse.y > 201 && Mouse.y < 259)
					World.pressStop();
				break;
			case "g10n":
				Player.position = "g2n";
				break;
			case "g10e":
				Player.position = "g11e";
				break;
			case "g10w":
				//click mirror
				if (Mouse.x > 165 && Mouse.x < 335 && Mouse.y > 57 && Mouse.y < 393) {
					if (Player.dreaming) {
						Message.readMirrorDream1();
					} else {
						Message.readMirror1();
					}
				}
				break;
			case "g11w":
				if (Player.dreaming && !Player.sawReflection) {
					Audio.startAcid();
					Player.sawReflection = true;
				}
				Player.position = "g10w";
				break;
			case "g11w dream":
				Player.position = "g10w dream";
				break;
			case "g11e":
				Player.position = "g12e";
				break;
			case "g12s":
				Player.position = "g13s";
				break;
			case "g12w":
				Player.position = "g11w";
				break;
			case "g12w dream":
				Player.position = "g12w dream";
				break;
			case "g13s":
				Player.position = "g14s";
				break;
			case "g13n":
				Player.position = "g12n";
				break;
			case "g14w":
				Player.position = "g15w";
				break;
			case "g14n":
				Player.position = "g13n";
				break;
			case "g14se":
				Player.position = "g23e";
				break;
			case "g15n":
				if (Player.dreaming) {
					Message.readMirrorDream2();
				} else {
					Message.readMirror1();
				}
				break;
			case "g15w":
				Player.position = "g16w";
				break;
			case "g15e":
				Player.position = "g14e";
				break;
			case "g16s":
				Player.position = "g17s";
				break;
			case "g16n":
				if (!ImagePanel.hudVisible && Mouse.x > 174 && Mouse.x < 378 && Mouse.y > 307 && Mouse.y < 402) {
					Message.readG16N();
				}
				break;
			case "g16e":
				Player.position = "g15e";
				break;
			case "g17s":
				Player.position = "g19s";
				break;
			case "g17w":
				Player.position = "g18w";
				break;
			case "g17n":
				Player.position = "g16n";
				break;
			case "g18e":
				Player.position = "g17e";
				break;
			case "g18w":
				if (!ImagePanel.hudVisible && !World.open && Mouse.x > 167 && Mouse.x < 226 && Mouse.y > 25 && Mouse.y < 81) {
					// click plaque
					Player.examiningPlaque = true;
				} else if (!World.open && !World.OOX && Mouse.x > 119 && Mouse.x < 187 && Mouse.y > 94 && Mouse.y < 122) {
					// click locked safe
					Audio.startLocked();
				} else if (!World.open && World.OOX && Mouse.x > 119 && Mouse.x < 187 && Mouse.y > 94 && Mouse.y < 122) {
					// open safe
					Animation.setDelay(); // begins timer for pushing down button
					Animation.openingSafe = true;
				} else if (!Player.hasOm && World.open && Mouse.x > 135 && Mouse.x < 257 && Mouse.y > 142 && Mouse.y < 175) {
					// click scroll
					Item.getScroll();
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.scrollY = -250;
					Player.examiningOm = true;
					Animation.openingScroll = true;
					Audio.startScroll();
					Player.hasOm = true;
					Audio.startScroll();
				} else if (World.open && Mouse.x > 270 && Mouse.x < 438 && Mouse.y > 13 && Mouse.y < 179) {
					// close safe
					World.open = false;
					Animation.openingSafe = false;
					Audio.startSafeShut(); 			
				} else if (Player.examiningOm) {
					// get scroll after memorizing
					//Item.getScroll();
				} else if (Mouse.x > 393 && Mouse.x < 538 && Mouse.y > 7 && Mouse.y < 113 && !ImagePanel.hudVisible) {
					// read sign
					Message.readG18WSign();
				}

				break;
			case "g19s":
				Player.position = "g20s";
				break;
			case "g19n":
				Player.position = "g17n";
				break;
			case "g20n":
				Player.position = "g19n";
				break;
			case "g20e":
				Player.position = "g21e";
				break;
			case "g21sw":
				Player.position = "g20w";
				break;
			case "g21e":
				Player.position = "g22e";
				break;
			case "g21n":
				Player.position = "g22n";
				break;
			case "g22s":
				Player.position = "g21s";
				break;
			case "g22n":
				Player.position = "g23n";
				break;
			case "g23n":
				Player.position = "g14n";
				break;
			case "g23e":
				Player.position = "g24e";
				break;
			case "g23s":
				Player.position = "g22s";
				break;
			case "g24w":
				Player.position = "g23s";
				break;
			case "g24e":
				Player.position = "g25e";
				break;
			case "g25w":
				Player.position = "g24w";
				break;
			case "g25e":
				Player.position = "g26e";
				break;
			case "g26w":
				Player.position = "g25w";
				break;
			case "g26e":
				Player.position = "g27e";
				break;
			case "g27s":
				if (Mouse.x > 147 && Mouse.x < 259 && Mouse.y > 171 && Mouse.y < 348) {
					Message.readG27S();
				}
				break;
			case "g27w":
				Player.position = "g26w";
				break;
			case "g27n":
				Player.position = "g28n";
				break;
			case "g28s":
				Player.position = "g27s";
				break;
			case "g28n":
				Player.position = "g29n";
				break;
			case "g29s":
				Player.position = "g28s";
				break;
			case "g29n":
				Player.position = "g30n";
				break;
			case "g30s":
				Player.position = "g29s";
				break;
			case "g30e":
				if (Player.dreaming) {
					Player.position = "g31e";
				}					
				break;
			case "g31w":
				if (Player.holdingGun && Mouse.x > 211 && Mouse.x < 307 && Mouse.y > 84 && Mouse.y < 283) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Player.shooting = true;
					Audio.startGun();
					Animation.setWait(5,65);
				}
				break;
			case "g31e":
				Player.position = "g32e";
				break;
			case "g32s":
				Player.position = "g33s";
				break;
			case "g32w":
				Player.position = "g31w";
				if (Player.holdingGun && !Player.spokeToMonk) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Animation.setWait(25,63);
				}
				break;
			case "g33s":
				Player.position = "g34s";
				break;
			case "g33n":
				Player.position = "g32n";
				break;
			case "g34s":
				Player.position = "g35s";
				break;
			case "g34n":
				Player.position = "g33n";
				break;
			case "g35s":
				Player.position = "g36s";
				break;
			case "g35n":
				Player.position = "g34n";
				break;
			case "g36s":
				Player.position = "g37s";
				
				if (!Player.spokeToClan) {
					Player.setBusy(true);
					Animation.setWait(25,62);
				}
				break;
			case "g36n":
				Player.position = "g35n";
				break;
			case "g37s":
				if (Player.holdingGun) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Player.shooting = true;
					Audio.startGun();
					Animation.setWait(5,65);
				} else {
					Message.readTod64();
				}
				break;
			case "g37n":
				Player.position = "g36n";
				break;
			
			/** HOUSE */
			case "h1n":
				// click door
				if (Mouse.x > 217 && Mouse.x < 367 && Mouse.y > 100 && Mouse.y < 382) {
					if (World.darkDoorOpen) {
						Player.position = "hr1n";
						World.dark = true;
						ImagePanel.resetImages();
						World.prepHReaper = false;
						Audio.stopZen();
						Audio.startBreatheLoop();
					} else if (World.OOX) {
						Player.setBusy(true);
						Player.setDisableWalk(true);
						Animation.openingH1n = true;
						Audio.startCreak();
					} else {
						//Audio.startLocked(); // i like it quiet
					}
				}
				
				// click plaque
				if (Mouse.x > 369 && Mouse.x < 414 && Mouse.y > 151 && Mouse.y < 197) {
					Player.examiningPlaque = true;
				}
				break;
			case "h1e":
				Message.readH1EBanner();
				break;
			case "h1w":
				Player.position = "h2w";
				
				if (World.prepHReaper) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Animation.setWait(20,76);
				}
				break;
			case "h2n":
				Message.readH2N();
				break;
			case "h2e":
				Player.position = "h1e";
				ImagePanel.resetImages();
				World.prepHReaper = true;
				break;
			case "h2w":
				Player.position = "h3w";
				break;
			case "h2sw":
				Player.position = "h3s";
				break;
			case "h3e":
				Player.position = "h2e";
				break;
			case "h3w":
				Message.readH3W();
				break;
			case "h3n":
				Player.position = "h2n";
				break;
			case "h3s":
				Player.position = "h4s";
				break;
			case "h4n":
				Player.position = "h3n";
				break;
			case "h4s":
				Player.position = "h5s";
				break;
			case "h5s":
				Player.position = "h8s";
				break;
			case "h5w":
				Player.position = "h6w";
				break;
			case "h5n":
				Player.position = "h4n";
				break;
			case "h6s":
				Player.position = "h7s";
				break;
			case "h6e":
				Player.position = "h5e";
				break;
			case "h7n":
				Player.position = "h6n";
				break;
			case "h7e":
				Player.position = "h8e";
				break;
			case "h8w":
				Player.position = "h7w";
				break;
			case "h8n":
				Player.position = "h5n";
				break;
			case "h8e":
				Player.position = "h9e";
				break;
			case "h8s":
				if (Player.holdingFish1) {
					Player.holdingFish1 = false;
					Player.holdingFish2 = true;
				}
				
				if (Player.holdingFish2) {
					Player.memorizedFish = true;
					Audio.startMemorized();
					//Messenge.readMessenge();
					
					if (!Player.symbolsMemorized.contains(Item.fish)) {
						Player.symbolsMemorized.add(Item.fish);
					}
					
					System.out.println(Player.symbolsMemorized);
					
					Animation.setWait(25,23);
				}
				break;
			case "h9w":
				Player.position = "h8w";
				break;
			case "h9e":
				Player.position = "h10e";
				break;
			case "h10w":
				Player.position = "h9w";
				break;
			case "h10e":
				Player.position = "h11e";
				break;
			case "h11s":
				if (!World.XOO && Mouse.x > 168 && Mouse.x < 448) {
					Audio.startLocked();
				} else if (World.XOO && !World.open && Mouse.x > 168 && Mouse.x < 448) {
					World.open = true;
					Audio.startDoorOpen();
				
				} else if (World.XOO && World.open && Mouse.x > 168 && Mouse.x < 448) {
					ImagePanel.resetImages();
					Player.position = "h11sRoom";
				}
				
				// click plaque
				if (!World.open && Mouse.x > 90 && Mouse.x < 167 && Mouse.y > 216 && Mouse.y < 287) {	
					Player.examiningPlaque = true;
				}
				
				break;
			case "h11sRoom":
				// click corn
				if (!Player.hadCorn && Mouse.x > 241 && Mouse.x < 275 && Mouse.y > 366 && Mouse.y < 395) {
					Audio.startEquip2();
					Player.hadCorn = true;
					Player.hasCorn = true;
					Player.inventoryList.add(Item.corn);
					
					Message.readGetCorn();
				} 

				if (Player.examiningRa) {
					Animation.closingScroll = true;
				}
				
				// click ra scroll
				if (World.raDropped && !Player.hasRa && Mouse.x > 225 && Mouse.x < 291 && Mouse.y > 309 && Mouse.y < 361) {
					// click ra scroll
					Animation.heardSound = false;
					Item.getScroll();
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.image3Y = -250;	
					ImagePanel.scrollY = ImagePanel.image3Y;
					Player.examiningRa = true;
					Animation.openingScroll = true;
					Audio.startScroll();
					Player.hasRa = true;
					Audio.startScroll();
				}
				

				break;
			case "h11w":
				Player.position = "h10w";
				break;
			case "h11e":
				Player.position = "h12e";
				break;
			case "h12s":
				Player.position = "h13s";
				break;
			case "h12e":
				if (Mouse.x > 25 && Mouse.x < 191 && Mouse.y > 131 && Mouse.y < 317) {	
					Message.readH12E();
				}
				break;
			case "h12w":
				Player.position = "h11w";
				break;
			case "h13w":
				Player.position = "h14w";
				break;
			case "h13n":
				Player.position = "h12n";
				break;
			case "h14w":
				Player.position = "h15w";
				break;
			case "h14n":
				if (Mouse.x > 202 && Mouse.x < 277 && Mouse.y > 171 && Mouse.y < 238) {
					Player.examiningPlaque = true;
				}
				
				if (Mouse.x > 284 && Mouse.x < 305 && Mouse.y > 144 && Mouse.y < 161) {
					System.out.println("click button");
					Audio.startBeep();
					Animation.setDelay(); // begins timer for pushing down button
					Animation.pushingButton = true;
				}
				break;
			case "h14e":
				Player.position = "h13e";
				break;
			case "h15w":
				ImagePanel.resetImages();
				Player.position = "h16w";
				break;
			case "h15n":
				if (!Player.onPhone && Mouse.x > 186 && Mouse.x < 275 && Mouse.y > 243 && Mouse.y < 287) {
					// click phone
					ImagePanel.image2Y = 300;
					Animation.raisingPhone = true;
				}
				
				if (Player.onPhone && !Player.readingMessage && !Keyboard.typingInput && !Item.ringing) {
					// click numbers
					if (Mouse.x > 155 && Mouse.x < 182 && Mouse.y > 242 && Mouse.y < 264) {
						// click 1
						Item.dialPhone(1);
					} else if (Mouse.x > 183 && Mouse.x < 207 && Mouse.y > 246 && Mouse.y < 269) {
						// click 2
						Item.dialPhone(2);
					} else if (Mouse.x > 211 && Mouse.x < 233 && Mouse.y > 254 && Mouse.y < 272) {
						// click 3
						Item.dialPhone(3);
					} else if (Mouse.x > 151 && Mouse.x < 172 && Mouse.y > 265 && Mouse.y < 285) {
						// click 4
						Item.dialPhone(4);
					} else if (Mouse.x > 176 && Mouse.x < 200 && Mouse.y > 269 && Mouse.y < 290) {
						// click 5
						Item.dialPhone(5);
					} else if (Mouse.x > 206 && Mouse.x < 225 && Mouse.y > 275 && Mouse.y < 294) {
						// click 6
						Item.dialPhone(6);
					} else if (Mouse.x > 144 && Mouse.x < 165 && Mouse.y > 288 && Mouse.y < 305) {
						// click 7
						Item.dialPhone(7);
					} else if (Mouse.x > 170 && Mouse.x < 192 && Mouse.y > 292 && Mouse.y < 309) {
						// click 8
						Item.dialPhone(8);
					} else if (Mouse.x > 197 && Mouse.x < 217 && Mouse.y > 297 && Mouse.y < 315) {
						// click 9
						Item.dialPhone(9);
					} else if (Mouse.x > 161 && Mouse.x < 187 && Mouse.y > 314 && Mouse.y < 333) {
						// click 0
						Item.dialPhone(0);
					} else if (Mouse.x > 223 && Mouse.x < 257 && Mouse.y > 200 && Mouse.y < 231) {
						// click red
						Audio.startPhoneButtonRed();
						Item.wipePhoneNumber();
					} else if (!Keyboard.typingInput && !Message.typing && !(Mouse.x > 113 && Mouse.x < 312 && Mouse.y > 20 && Mouse.y < 357)) {
						// click outside
						Item.wipePhoneNumber();
						Item.ringing = false;
						Audio.stopPhone();
						Animation.loweringPhone = true;
					}
				}
				break;
			case "h15e":
				Player.position = "h14e";
				break;
			case "h16w":
				Message.readH3W();
				break;
			case "h16s":
				Player.position = "h18s";
				break;
			case "h16n":
				Player.position = "h17n";
				break;
			case "h16e":
				Player.position = "h15e";
				break;
			case "h17s":
				if (Mouse.x > 65 && Mouse.x < 244) {
					Player.position = "h16s";
				}
				break;
			case "h17n":
				if (Player.examiningNi) {
					Animation.closingScroll = true;
				} else if (!World.open && Mouse.x > 232 && Mouse.x < 295 && Mouse.y > 49 && Mouse.y < 109) {
					// examine plaque
					Player.examiningPlaque = true;
				} else if (!World.open && !World.XOX && Mouse.x > 186 && Mouse.x < 253 && Mouse.y > 118 && Mouse.y < 143) {
					// click locked safe handle
					Audio.startLocked();
				} else if (!World.open && World.XOX && Mouse.x > 186 && Mouse.x < 253 && Mouse.y > 118 && Mouse.y < 143) {
					// open safe
					Animation.setDelay(); // begins timer for pushing down button
					Animation.openingSafe = true;
				} else if (World.open && !Player.hasNi && Mouse.x > 200 && Mouse.x < 327 && Mouse.y > 170 && Mouse.y < 202) {
					// click ni scroll
					Item.getScroll();
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.scrollY = -250;
					Player.examiningNi = true;
					Animation.openingScroll = true;
					Audio.startScroll();
					Player.hasNi = true;
					Audio.startScroll();
				} else if (World.open && Mouse.x > 338 && Mouse.x < 500 && Mouse.y > 44 && Mouse.y < 223) {
					// close safe
					World.open = false;
					Audio.startSafeShut(); 
				}
				break;
			case "h18s":
				/** Click Red Book */
				if (!Player.holdingRedBook && !Player.holdingBlackBook && !Player.holdingBlueBook && Mouse.x > 192 && Mouse.x < 229 && Mouse.y > 164 && Mouse.y < 285) {
					// click red book
					Audio.startEquip3();
					Player.setBusy(true); 
					ImagePanel.image3Y = 375; // puts book below eyelevel
					Player.holdingRedBook = true;
					Player.examiningRedBook = true;
					Animation.raisingBook = true;
				} else if (Player.holdingRedBook && Mouse.x > 30 && Mouse.x < 373 && Mouse.y > 69 && Mouse.y < 319) {
					if (Item.bookPage == 0 && Mouse.x < 197 && !Animation.loweringBook) {
						// put red book down (if not opened)
						Player.setBusy(true); 
						Animation.loweringBook = true;
						Player.setDisableWalk(true);
						Audio.startEquip2(); 
					} else {
						// turn page of red book
						Item.bookTurnPage();
					}
				} else if (Player.holdingRedBook && !Animation.loweringBook) {
					// put red book down
					Player.setBusy(true); 
					Animation.loweringBook = true;
					Player.setDisableWalk(true);
					Audio.startEquip2();
				}

				/** Click Black Book */
				if (!Player.holdingRedBook && !Player.holdingBlackBook && !Player.holdingBlueBook && Mouse.x >= 295 && Mouse.x < 364 && Mouse.y > 179 && Mouse.y < 288) {
					// click black book
					Audio.startEquip3();
					Player.setBusy(true); 
					ImagePanel.image3Y = 375; // puts book below eyelevel
					Player.holdingBlackBook = true;
					Player.examiningBlackBook = true;
					Animation.raisingBook = true;
				} else if (Player.holdingBlackBook && Mouse.x > 30 && Mouse.x < 373 && Mouse.y > 69 && Mouse.y < 319) {
					if (Item.bookPage == 0 && Mouse.x < 197 && !Animation.loweringBook) {
						// put black book down (if not opened)
						Audio.startEquip3();
						Player.setBusy(true); 
						Animation.loweringBook = true;
						Player.setDisableWalk(true);
						Audio.startEquip2(); 
					} else {
						// turn page of black book
						Item.bookTurnPage();
					}
				} else if (Player.holdingBlackBook) {
					// put black book down
					Player.setBusy(true); 
					Animation.loweringBook = true;
					Player.setDisableWalk(true);
					Audio.startEquip2();
				}
				
				/** Click Blue Book */
				if (!Player.holdingRedBook && !Player.holdingBlackBook && !Player.holdingBlueBook && Mouse.x >= 229 && Mouse.x < 295 && Mouse.y > 173 && Mouse.y < 286) {
					// click blue book
					Audio.startEquip3();
					Player.setBusy(true); 
					ImagePanel.image3Y = 375; // puts book below eyelevel
					Player.holdingBlueBook = true;
					Player.examiningBlueBook = true;
					Animation.raisingBook = true;
				} else if (Player.holdingBlueBook && Mouse.x > 30 && Mouse.x < 373 && Mouse.y > 69 && Mouse.y < 319) {
					if (Item.bookPage == 0 && Mouse.x < 197 && !Animation.loweringBook) {
						// put Blue book down (if not opened)
						Player.setBusy(true); 
						Animation.loweringBook = true;
						Player.setDisableWalk(true);
						Audio.startEquip2(); 
					} else {
						// turn page of Blue book
						Item.bookTurnPage();
					}
				} else if (Player.holdingBlueBook) {
					// put Blue book down
					Player.setBusy(true); 
					Animation.loweringBook = true;
					Player.setDisableWalk(true);
					Audio.startEquip2();
				}
				
				if (!Player.examiningRedBook && !Player.examiningBlackBook && !Player.examiningBlueBook && !ImagePanel.hudVisible && Mouse.y < 107) {
					// click rod
					if (!Player.hasRod) {
						Audio.startEquip3();
						Player.hasRod = true;
						Player.inventoryList.add(Item.rod);
						Message.readGetRod();
					}
				}
				break;
			case "h18n":
				ImagePanel.resetImages();
				Player.position = "h16n";
				break;
			case "h18e":
				if (Mouse.x > 220 && Mouse.x < 336 && Mouse.y > 164 && Mouse.y < 277) {
					Player.position = "hTV";
				}
				break;
			case "hTV":
				if (Mouse.x > 181 && Mouse.x < 309 && Mouse.y > 330 && Mouse.y < 374)
					Player.position = "hTVControls";
				break;
			case "hTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263)
					World.pressRewind();
				
				// play
				if (Mouse.x > 143 && Mouse.x < 216 && Mouse.y > 200 && Mouse.y < 262)
					World.pressPlay();
				
				// fastforward
				if (Mouse.x > 232 && Mouse.x < 301 && Mouse.y > 200 && Mouse.y < 261) {
					System.out.println("FF " + Mouse.x + " " + Mouse.y);
					World.pressFastforward();
				}
				
				// pause
				if (Mouse.x > 321 && Mouse.x < 388 && Mouse.y > 199 && Mouse.y < 261)
					World.pressPause();
				
				// stop
				if (Mouse.x > 411 && Mouse.x < 477 && Mouse.y > 201 && Mouse.y < 259)
					World.pressStop();
				break;
			case "hr1n":
				if (Mouse.x > 380 && Mouse.x < 481 && Mouse.y > 153 && Mouse.y < 362) {
					Message.readDarkMan1();
				}
				break;
			case "hr1e":
				Player.position = "hr2e";
				break;
			case "hr1s":
				if (Mouse.x > 199 && Mouse.x < 349 && Mouse.y > 112 && Mouse.y < 387) {
					Player.position = "h1s";
					World.dark = false;
					World.darkDoorOpen = false;
					Audio.startDoorShut();
					Audio.stopBreatheLoop();
					Audio.startZen();
				}				
				break;
			case "hr1w":
				Message.readDarkMan2();
				break;
			case "hr2n":
				if (!Player.hasGoldPaper && Mouse.x > 265 && Mouse.x < 352 && Mouse.y > 232 && Mouse.y < 298) {
					// click gold paper
					Audio.startEquip2();
					Player.hasGoldPaper = true;
					Player.inventoryList.add(Item.paper);
					
					Message.readGetPaper();
				}
				break;
			case "hr2e":
				Message.readDarkMan2();
				break;
			case "hr2s":
				Player.position = "hr3s";
				break;
			case "hr2w":
				Player.position = "hr1w";
				break;
			case "hr3n":
				Player.position = "hr2n";
				break;
			case "hr3e":
				Message.readDarkMan2();
				break;
			case "hr3s":
				Player.position = "hr4s";
				if (Mouse.x > 380 && Mouse.x < 481 && Mouse.y > 153 && Mouse.y < 362) {
					Message.readDarkMan2();
				}
				break;
			case "hr3w":
				Message.readDarkness();
				break;
			case "hr4n":
				Player.position = "hr3n";
				break;
			case "hr4s":
				if (Mouse.x > 264 && Mouse.x < 364 && Mouse.y > 155 && Mouse.y < 262) {
					// click TV
					Player.position = "hrTV";
				}
				break;
			case "hrTV":
				if (Mouse.x > 256 && Mouse.x < 361 && Mouse.y > 348 && Mouse.y < 381) {
					Player.position = "hrTVControls";
				}
				break;
			case "hrTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263)
					World.pressRewind();
				
				// play
				if (Mouse.x > 143 && Mouse.x < 216 && Mouse.y > 200 && Mouse.y < 262)
					World.pressPlay();
				
				// fastforward
				if (Mouse.x > 232 && Mouse.x < 301 && Mouse.y > 200 && Mouse.y < 261) {
					System.out.println("FF " + Mouse.x + " " + Mouse.y);
					World.pressFastforward();
				}
				
				// pause
				if (Mouse.x > 321 && Mouse.x < 388 && Mouse.y > 199 && Mouse.y < 261)
					World.pressPause();
				
				// stop
				if (Mouse.x > 411 && Mouse.x < 477 && Mouse.y > 201 && Mouse.y < 259)
					World.pressStop();
				break;
			case "hr4w":
				Message.readDarkMan2();
				break;
			
			/** TEMPLE */
			case "t1n":
				if (Mouse.x > 435 && Mouse.x < 507 && Mouse.y > 116 && Mouse.y < 325) {
					// click mirror
					
					Animation.openingMessage = true;
					Player.readingMessage = true;
				}
				break;
			case "t1e":
				Player.position = "t2e";
				break;
			case "t1w":
				// click cranes
				World.displayingTReaper1 = true;
				Player.setBusy(true);
				Player.setDisableWalk(true);
				Animation.movingCranes = true;
				Audio.startEquip4(); // what sound for cranes
				break;
			case "t2e":
				Player.position = "t3e";
				break;
			case "t2w":
				Player.position = "t1w";
				break;
			case "t3s":
				Player.position = "t4s";
				break;
			case "t3w":
				Player.position = "t2w";
				break;
			case "t4w":
				Player.position = "t5w";
				break;
			case "t4n":
				Player.position = "t3n";
				break;
			case "t5s":
				Player.position = "t6s";
				break;
			case "t5n":
				if (Player.examiningGo) {
					if (World.scrollCloseable) {
						// get scroll after memorizing
						Animation.closingScroll = true;
					}
				} else if (!ImagePanel.hudVisible && Mouse.x > 232 && Mouse.x < 329 && Mouse.y > 304 && Mouse.y < 404) {
					// click plaque
					Player.examiningPlaque = true;
				} else if (Mouse.x > 373 && Mouse.x < 401 && Mouse.y > 338 && Mouse.y < 367) {
					// click button
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Audio.startBeep();
					Animation.setDelay(); // begins timer for pushing down button
					Animation.pushingButton = true;
				} else if (World.t5nOpened && !Player.hasGo && Mouse.x > 129 && Mouse.x < 233 && Mouse.y > 247 && Mouse.y < 278) {
					// click scroll
					Item.getScroll();
					Player.setBusy(true);
					Player.setDisableWalk(true);
					ImagePanel.scrollY = -250;
					Player.examiningGo = true;
					Animation.openingScroll = true;
					Audio.startScroll();
					Player.hasGo = true;
					Audio.startScroll();
				}
				break;
			case "t5e":
				Player.position = "t4e";
				break;
			case "t6w":
				// click paper slip
				if (!Player.examiningPaperSlip) {
					Audio.startBookOpen();
					Player.setBusy(true);
					ImagePanel.image2Y = 300;
					Player.examiningPaperSlip = true;
					Animation.raisingPaperSlip = true;
				} else {
					Audio.startEquip3();
					Player.setBusy(true);
					Animation.loweringPaperSlip = true;
				}
				break;
			case "t6n":
				Player.position = "t5n";
				break;
			case "t6e":
				Player.position = "t7e";
				break;
			case "t7se":
				Player.position = "t10se";
				break;
			case "t7w":
				Player.position = "t6w";
				break;
			case "t7n":
				if (Mouse.x > 101 && Mouse.x < 415 && Mouse.y > 11 && Mouse.y < 373) {
					Player.position = "t7n shrine";
				}
				
				// also in click right
				if (Mouse.x > 420 && Mouse.x < 532 && Mouse.y > 164 && Mouse.y < 306) {
					Message.readT7N();
				}
				break;
			case "t7e":
				Player.position = "t8e";
				break;
			case "t8se":
				Player.position = "t11se";
				break;
			case "t8sw":
				Player.position = "t10se";
				break;
			case "t8w":
				Player.position = "t7w";
				break;
			case "t8e":
				Player.position = "t9e";
				break;
			case "t9s":
				Player.position = "t13s";
				break;
			case "t9w":
				Player.position = "t8w";
				break;
			case "t9n":
				Player.position = "t9n shop";
				Player.setBusy(true);
				ImagePanel.image2X = -500;
				Animation.shopKeeperApproaching = true;
				World.shopkeeperPresent = true;
				break;
			case "t9n shop":
				if (Player.holdingShopCase) {
					// click case
					if (Player.examiningYu) {
						Animation.closingScroll = true;
					} else if (!World.shopCaseOpen) {
						if (Mouse.x > 160 && Mouse.x < 307) {
							if (World.XXO) {
								// open case
								Audio.startEquip1();
								World.shopCaseOpen = true;
							} else {
								// locked
								Audio.startLocked();
							}	
						} else {
							Animation.loweringShopCase = true;
						}
						
					} else if (World.shopCaseOpen) {
						if (Mouse.x > 251 && Mouse.x < 315 && Mouse.y > 149 && Mouse.y < 366) {
							// click scroll
							Item.getScroll();
							Player.setBusy(true);
							Player.setDisableWalk(true);
							ImagePanel.scrollY = -250;
							Player.examiningYu = true;
							Animation.openingScroll = true;
							Audio.startScroll();
							Player.hasYu = true;
							Audio.startScroll();
						} else {
							// click outside scroll
							World.shopCaseOpen = false;
							Audio.startEquip1();
							//Animation.loweringShopCase = true;
						}
						
					} else {
						// click outside case
						Animation.loweringShopCase = true;
					}
				} else {

				}
				break;
			case "t10se":
				Player.position = "t12s";
				break;
			case "t10nw":
				if (Mouse.x > 331) {
					Player.position = "t7n";
				} else {
					Player.position = "t7w";
				}
				break;
			case "t10ne":
				Player.position = "t8n";
				break;
			case "t10e":
				Player.position = "t11se";
				break;
			case "t11sw":
				Player.position = "t12s";
				break;
			case "t11se":
				Player.position = "t13e";
				break;
			case "t11w":
				Player.position = "t10nw";
				break;
			case "t11nw":
				Player.position = "t8n";
				break;
			case "t11ne":
				Player.position = "t9e";
				break;
			case "t12n":
				if (Mouse.x > 132 && Mouse.x < 397 && Mouse.y > 249 && Mouse.y < 412) {
					Message.readT12N();
				}
				
				break;
			case "t12s":
				Player.position = "t14s";
				break;
			case "t12nw":
				Player.position = "t10nw";
				break;
			case "t12ne":
				Player.position = "t11ne";
				break;
			case "t12e":
				Player.position = "t13e";
				break;
			case "t13w":
				Player.position = "t12nw";
				break;
			case "t13n":
				Player.position = "t9n";
				break;
			case "t14s":
				Player.position = "t15s";
				break;
			case "t14n":
				Player.position = "t12n";
				break;
			case "t15s":
				Player.position = "t24s";
				break;
			case "t15w":
				Player.position = "t16w";
				break;
			case "t15n":
				Player.position = "t14n";
				break;
			case "t16w":
				Player.position = "t17w";
				break;
			case "t16e":
				Player.position = "t15e";
				break;
			case "t17w":
				Player.position = "t18w";
				break;
			case "t17e":
				Player.position = "t16e";
				break;
			case "t18w":
				Player.position = "t19w";
				break;
			case "t18e":
				Player.position = "t17e";
				break;
			case "t19s":
				Player.position = "t20s";
				break;
			case "t19e":
				Player.position = "t18e";
				break;
			case "t20w":
				Player.position = "t21w";
				break;
			case "t20n":
				Player.position = "t19n";
				break;
			case "t21w":
				Player.position = "t22w";
				break;
			case "t21e":
				Player.position = "t20e";
				break;
			case "t22w":
				Player.position = "t23w";
				ImagePanel.resetImages();
				if (World.XOO && !Player.inventoryList.contains(Item.shi)) {
					ImagePanel.image2X = -88;
					Player.setBusy(true);
					Animation.todAppears = true;
				}
				break;
			case "t22e":
				Player.position = "t21e";
				break;
			case "t23w":
				if (Mouse.x > 159 && Mouse.x < 196 && Mouse.y > 239 && Mouse.y < 277) {
					Player.examiningPlaque = true;
				}
				break;
			case "t23e":
				Player.position = "t22e";
				break;
			case "t24s":
				Player.position = "t25s";
				break;
			case "t24n":
				Player.position = "t15n";
				break;
			case "t25s":
				Player.position = "t26s";
				break;
			case "t25n":
				Player.position = "t24n";
				break;
			case "t25w":
				Player.position = "t25ww";
				break;
			case "t25ww":
				if (!Player.examiningT25WWSign && Mouse.x > 239 && Mouse.x < 323 && Mouse.y > 181 && Mouse.y < 286) {
					// click sign
					Player.cantLeaveKnot = true;
					Player.setBusy(true);
					//Player.setDisableWalk(true);
					Player.examiningT25WWSign = true;
					
					if (!Player.symbolsMemorized.contains(Item.knot)) {
						Animation.setWait(25,106);
					} else {
						Player.cantLeaveKnot = false;
						Player.setBusy(false);
					}
				}
				
				if (Player.examiningT25WWSign && !Player.cantLeaveKnot)
					Player.examiningT25WWSign = false;
				break;	
			case "t26s":
				Player.position = "t27s";
				break;
			case "t26n":
				Player.position = "t25n";
				break;
			case "t27s":
				Player.position = "t28s";
				break;
			case "t27n":
				Player.position = "t26n";
				break;
			case "t28s":
				Player.position = "t29s";
				break;
			case "t28n":
				Player.position = "t27n";
				break;
			case "t28e":
				System.out.println("clicked statue");
				break;
			case "t29s":
				Player.position = "t30s";
				break;
			case "t29n":
				Player.position = "t28n";
				break;
			case "t30s":
				Player.position = "t31s";
				break;
			case "t30n":
				Player.position = "t29n";
				break;
			case "t31s":
				Player.position = "t32s";
				break;
			case "t31n":
				Player.position = "t30n";
				break;
			case "t32s":
				Player.position = "t33s";
				break;
			case "t32n":
				Player.position = "t31n";
				break;
			case "t33s":
				Player.position = "t34s";
				break;
			case "t33n":
				Player.position = "t32n";
				break;
			case "t34s":
				Player.position = "t35s";
				break;
			case "t34n":
				Player.position = "t33n";
				break;
			case "t35s":
				Player.position = "t36s";
				break;
			case "t35n":
				Player.position = "t34n";
				break;
			case "t36s":
				Player.position = "t37s";
				break;
			case "t36n":
				Player.position = "t35n";
				break;
			case "t37s":
				Player.position = "t38s";
				break;
			case "t37n":
				Player.position = "t36n";
				break;
			case "t38s":
				Player.position = "t39s";
				break;
			case "t38n":
				if (Mouse.x > 210 && Mouse.x < 244 && Mouse.y > 210 && Mouse.y < 367) {
					Message.readT38N();
				} else {
					Player.position = "t37n";
				}
				break;
			case "t39s":
				Player.position = "t40s";
				break;
			case "t39n":
				Player.position = "t38n";
				break;
			case "t40s":
				Player.position = "t41s";
				break;
			case "t40n":
				ImagePanel.resetImages();
				Player.position = "t39n";
				break;
			case "t40e":
				Player.position = "t46e";
				break;
			case "t40w":
				if (Mouse.x > 231 && Mouse.x < 322 && Mouse.y > 112 && Mouse.y < 309) {
					Message.readT40W();
				}
				break;
			case "t41s":
				Player.position = "t42s";
				break;
			case "t41n":
				Player.position = "t40n";
				break;
			case "t42s":
				Player.position = "t43s";
				break;
			case "t42n":
				Player.position = "t41n";
				break;
			case "t43s":
				Player.position = "t44s";
				break;
			case "t43n":
				Player.position = "t42n";
				break;
			case "t44s":
				Player.position = "t45s";
				break;
			case "t44n":
				Player.position = "t43n";
				break;
			case "t45s":
				Message.readT45S();
				break;
			case "t45n":
				Player.position = "t44n";
				break;
			case "t46s":
				Player.position = "t46s";
				break;
			case "t46e":
				Player.position = "t47e";
				break;
			case "t46w":
				Player.position = "t40w";
				break;
			case "t46n":
				Player.position = "t46n";
				break;
			case "t47s":
				Player.position = "t47s";
				break;
			case "t47n":
				Player.position = "t47n";
				break;
			case "t47e":
				Player.position = "t48e";
				break;
			case "t47w":
				Player.position = "t46w";
				break;
			case "t48w":
				Player.position = "t47w";
				break;
			case "t48n":
				if (Mouse.x > 421 && Mouse.x < 466 && Mouse.y > 38 && Mouse.y < 190) {
					Player.setBusy(true);
					Audio.startRope();
					Animation.loweringTassel = true;
				}
				break;
			case "t48e":
				if (World.t48eGateOpen && Mouse.x > 218 && Mouse.x < 327 && Mouse.y > 212 && Mouse.y < 316) {
					// click tv
					Player.position = "tTV";
					ImagePanel.resetImages();
					
					if (World.greenAlive) {
						Animation.displayingTVCRbase = true;
					} else {
						Animation.displayingTVCRbleed2 = true;
					}
				}
				break;
			case "tTV":
				if (Mouse.x > 181 && Mouse.x < 309 && Mouse.y > 330 && Mouse.y < 374)
					Player.position = "tTVControls";
				break;
			case "tTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263)
					World.pressRewind();
				
				// play
				if (Mouse.x > 143 && Mouse.x < 216 && Mouse.y > 200 && Mouse.y < 262)
					World.pressPlay();
				
				// fastforward
				if (Mouse.x > 232 && Mouse.x < 301 && Mouse.y > 200 && Mouse.y < 261)
					World.pressFastforward();
				
				// pause
				if (Mouse.x > 321 && Mouse.x < 388 && Mouse.y > 199 && Mouse.y < 261)
					World.pressPause();
				
				// stop
				if (Mouse.x > 411 && Mouse.x < 477 && Mouse.y > 201 && Mouse.y < 259)
					World.pressStop();
				break;
			default:
				System.out.println("Click.clickCenter() error");
				break;
		}
	}
}