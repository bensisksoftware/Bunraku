public class ClickLeft {
	public static void turnLeft() {
		if (!World.satchelOpen 
		&& Player.position != "h11sRoom"
		&& Player.position != "h11s") {
			if (World.open) {
				Audio.startSafeShut();
				System.out.println("ClickLeft.turnLeft() close safe (top of class)");
				World.open = false;
			}
		}
		
		// Prepare pan (if in panable position)
		if (World.positionPannable()) {
			Player.setBusy(true);
			Animation.panningLeft = true;
			ImagePanel.image1X = -544;
			ImagePanel.image2X = -544;
			ImagePanel.image3X = -544;
			ImagePanel.image4X = -544;
			ImagePanel.image5X = -544;
			ImagePanel.image6X = -544;
			ImagePanel.imageOutgoing1X = 0;
			ImagePanel.imageOutgoing2X = 0;
			ImagePanel.imageOutgoing3X = 0;
			ImagePanel.imageOutgoing4X = 0;
			ImagePanel.imageOutgoing5X = 0;
			ImagePanel.imageOutgoing6X = 0;
		}
			
		/** GARDEN Turn Left */
		switch (Player.position) {
			case "g1n":
				Player.position = "g1w";
				break;
			case "g1e":
				Player.position = "g1n";
				break;
			case "g1s":
				Player.position = "g1e";
				break;
			case "g1w":
				Player.position = "g1s";
				break;
			case "g2n":
				Player.position = "g2w";
				break;
			case "g2e":
				Player.position = "g2n";
				break;
			case "g2s":
				Player.position = "g2e";
				break;
			case "g2w":
				Player.position = "g2s";
				break;
			case "g3n":
				Player.position = "g3w";
				break;
			case "g3e":
				Player.position = "g3n";
				break;
			case "g3s":
				Player.position = "g3e";
				break;
			case "g3w":
				Player.position = "g3s";
				break;
			case "g4e":
				Player.position = "g4w";
				break;
			case "g4w":
				Player.position = "g4e";
				break;
			case "g5s":
				Player.position = "g5e";
				break;
			case "g5w":
				Player.position = "g5s";
				break;
			case "g5n":
				Player.position = "g5w";
				break;
			case "g5e":
				Player.position = "g5n";
				break;
			case "g6w":
				Player.position = "g6e";
				break;
			case "g6n":
				if (Player.holdingACBook && !Animation.loweringBook) {
					Item.bookPage = 0;
					Animation.loweringBook = true;
					Player.setDisableWalk(true);
					Audio.startEquip2();
				} else {
					Player.position = "g6w";
				}
				break;
			case "g6e":
				Player.position = "g6n";
				break;
			case "g7w":
				Player.position = "g7e";
				break;
			case "g7n":
				Player.position = "g7w";
				break;
			case "g7e":
				Player.position = "g7n";
				break;
			case "g8e":
				Player.position = "g8w";
				break;
			case "g8w":
				Player.position = "g8e";
				break;
			case "g9s":
				Player.position = "g9e";
				break;
			case "g9w":
				Player.position = "g9s";
				break;
			case "g9n":
				Player.position = "g9w";
				break;
			case "g9e":
				Player.position = "g9n";
				break;
			case "g9rs":
				Player.position = "g9re";
				break;
			case "g9rw":
				if (Player.holdingDoll) {
					Audio.startEquip2();
					Animation.loweringDoll = true;
				} else if (World.satchelOpen) {
					World.satchelOpen = false;
					Audio.startEquip2();
				} else {
					Player.position = "g9rs";
				}
				break;
			case "g9rn":
				Player.position = "g9rw";
				break;
			case "g9re":
				Player.position = "g9rn";
				break;
			case "gTV":
				Player.position = "g9rs";
				break;
			case "gTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263) {
					World.pressRewind();
				} else {
					Player.position = "gTV";
				}
				break;
			case "g10s":
				Player.position = "g10e";
				break;
			case "g10w":
				Player.position = "g10s";
				break;
			case "g10n":
				Player.position = "g10w";
				break;
			case "g10e":
				Player.position = "g10n";
				break;
			case "g11w":
				Player.position = "g11e";
				break;
			case "g11e":
				Player.position = "g11w";
				break;
			case "g12s":
				Player.position = "g12e";
				break;
			case "g12w":
				Player.position = "g12s";
				break;
			case "g12n":
				Player.position = "g12w";
				break;
			case "g12e":
				Player.position = "g12n";
				break;
			case "g13s":
				Player.position = "g13e";
				break;
			case "g13w":
				Player.position = "g13s";
				break;
			case "g13n":
				Player.position = "g13w";
				break;
			case "g13e":
				Player.position = "g13n";
				break;
			case "g14s":
				Player.position = "g14se";
				break;
			case "g14w":
				Player.position = "g14s";
				break;
			case "g14n":
				Player.position = "g14w";
				break;
			case "g14e":
				Player.position = "g14n";
				break;
			case "g14se":
				Player.position = "g14e";
				break;
			case "g15s":
				Player.position = "g15e";
				break;
			case "g15w":
				Player.position = "g15s";
				break;
			case "g15n":
				Player.position = "g15w";
				break;
			case "g15e":
				Player.position = "g15n";
				break;
			case "g16s":
				Player.position = "g16e";
				break;
			case "g16w":
				Player.position = "g16s";
				break;
			case "g16n":
				Player.position = "g16w";
				break;
			case "g16e":
				Player.position = "g16n";
				break;
			case "g17s":
				Player.position = "g17e";
				break;
			case "g17w":
				Player.position = "g17s";
				break;
			case "g17n":
				Player.position = "g17w";
				break;
			case "g17e":
				Player.position = "g17n";
				break;
			case "g18s":
				Player.position = "g18e";
				break;
			case "g18w":
				Player.position = "g18s";
				break;
			case "g18n":
				Player.position = "g18w";
				break;
			case "g18e":
				Player.position = "g18n";
				break;
			case "g19s":
				Player.position = "g19e";
				break;
			case "g19w":
				Player.position = "g19s";
				break;
			case "g19n":
				Player.position = "g19w";
				break;
			case "g19e":
				Player.position = "g19n";
				break;
			case "g20s":
				Player.position = "g20e";
				break;
			case "g20w":
				Player.position = "g20s";
				break;
			case "g20n":
				Player.position = "g20w";
				break;
			case "g20e":
				Player.position = "g20n";
				break;
			case "g21s":
				Player.position = "g21e";
				break;
			case "g21w":
				Player.position = "g21sw";
				break;
			case "g21sw":
				Player.position = "g21s";
				break;
			case "g21n":
				Player.position = "g21w";
				break;
			case "g21e":
				Player.position = "g21n";
				break;
			case "g22s":
				Player.position = "g22e";
				break;
			case "g22w":
				Player.position = "g22s";
				break;
			case "g22n":
				Player.position = "g22w";
				break;
			case "g22e":
				Player.position = "g22n";
				break;
			case "g23s":
				Player.position = "g23e";
				break;
			case "g23n":
				Player.position = "g23s";
				break;
			case "g23e":
				Player.position = "g23n";
				break;
			case "g24w":
				Player.position = "g24s";
				break;
			case "g24n":
				Player.position = "g24w";
				break;
			case "g24e":
				Player.position = "g24n";
				break;
			case "g24s":
				Player.position = "g24e";
				break;
			case "g25s":
				Player.position = "g25e";
				break;
			case "g25w":
				Player.position = "g25s";
				break;
			case "g25n":
				Player.position = "g25w";
				break;
			case "g25e":
				Player.position = "g25n";
				break;
			case "g26s":
				Player.position = "g26e";
				break;
			case "g26w":
				Player.position = "g26s";
				break;
			case "g26n":
				Player.position = "g26w";
				break;
			case "g26e":
				Player.position = "g26n";
				break;
			case "g27s":
				Player.position = "g27e";
				break;
			case "g27w":
				Player.position = "g27s";
				break;
			case "g27n":
				Player.position = "g27w";
				break;
			case "g27e":
				Player.position = "g27n";

				if (!Player.sawReaper1 && !Player.dreaming) {
					Player.setBusy(true);
					Player.setDisableWalk(true);
					Animation.setWait(Animation.reaper1WalkAwayDelay,19);
				}
				break;
			case "g28s":
				Player.position = "g28n";
				break;
			case "g28w":
				Player.position = "g28s";
				break;
			case "g28n":
				Player.position = "g28w";
				break;
			case "g29s":
				Player.position = "g29n";
				break;
			case "g29w":
				Player.position = "g29s";
				break;
			case "g29n":
				Player.position = "g29w";
				break;
			case "g30s":
				Player.position = "g30e";
			
				break;
			case "g30w":
				Player.position = "g30s";
				break;
			case "g30n":
				Player.position = "g30w";
				break;
			case "g30e":
				Player.position = "g30n";
				break;
			case "g31s":
				Player.position = "g31e";
				break;
			case "g31w":
				Player.position = "g31s";
				break;
			case "g31n":
				Player.position = "g31w";
				break;
			case "g31e":
				Player.position = "g31n";
				break;
			case "g32s":
				Player.position = "g32e";
				break;
			case "g32w":
				Player.position = "g32s";
				break;
			case "g32n":
				Player.position = "g32w";
				break;
			case "g32e":
				Player.position = "g32n";
				break;
			case "g33s":
				Player.position = "g33e";
				break;
			case "g33w":
				Player.position = "g33s";
				break;
			case "g33n":
				Player.position = "g33w";
				break;
			case "g33e":
				Player.position = "g33n";
				break;
			case "g34s":
				Player.position = "g34e";
				break;
			case "g34w":
				Player.position = "g34s";
				break;
			case "g34n":
				Player.position = "g34w";
				break;
			case "g34e":
				Player.position = "g34n";
				break;
			case "g35s":
				Player.position = "g35e";
				break;
			case "g35w":
				Player.position = "g35s";
				break;
			case "g35n":
				Player.position = "g35w";
				break;
			case "g35e":
				Player.position = "g35n";
				break;
			case "g36s":
				Player.position = "g36e";
				break;
			case "g36w":
				Player.position = "g36s";
				break;
			case "g36n":
				Player.position = "g36w";
				break;
			case "g36e":
				Player.position = "g36n";
				break;
			case "g37s":
				Player.position = "g37e";
				break;
			case "g37w":
				Player.position = "g37s";
				break;
			case "g37n":
				Player.position = "g37w";
				break;
			case "g37e":
				Player.position = "g37n";
				break;	
			
			/** HOUSE Turn Left */		
			case "h1n":
				if (World.darkDoorOpen) {
					Audio.startDoorShut();
					World.darkDoorOpen = false;
				}
				Player.position = "h1w";
				break;
			case "h1e":
				Player.position = "h1n";
				break;
			case "h1s":
				Player.position = "h1e";
				break;
			case "h1w":
				Player.position = "h1s";
				break;
			case "h2n":
				Player.position = "h2w";
				break;
			case "h2e":
				Player.position = "h2n";
				break;
			case "h2s":
				Player.position = "h2e";
				break;
			case "h2w":
				Player.position = "h2sw";
				break;
			case "h2sw":
				Player.position = "h2s";
				break;
			case "h3n":
				Player.position = "h3w";
				break;
			case "h3e":
				Player.position = "h3n";
				break;
			case "h3s":
				Player.position = "h3e";
				break;
			case "h3w":
				Player.position = "h3s";
				break;
			case "h4n":
				Player.position = "h4s";
				break;
			case "h4s":
				Player.position = "h4n";
				break;
			case "h5s":
				Player.position = "h5e";
				break;
			case "h5w":
				Player.position = "h5s";
				break;
			case "h5n":
				Player.position = "h5w";
				break;
			case "h5e":
				Player.position = "h5n";
				break;
			case "h6s":
				Player.position = "h6e";
				break;
			case "h6w":
				Player.position = "h6s";
				break;
			case "h6n":
				Player.position = "h6w";
				break;
			case "h6e":
				Player.position = "h6n";
				break;
			case "h7s":
				Player.position = "h7e";
				break;
			case "h7w":
				Player.position = "h7s";
				break;
			case "h7n":
				Player.position = "h7w";
				break;
			case "h7e":
				Player.position = "h7n";
				break;
			case "h8s":
				Player.position = "h8e";
				break;
			case "h8w":
				Player.position = "h8s";
				break;
			case "h8n":
				Player.position = "h8w";
				break;
			case "h8e":
				Player.position = "h8n";
				break;
			case "h9s":
				Player.position = "h9e";
				break;
			case "h9w":
				Player.position = "h9s";
				break;
			case "h9e":
				Player.position = "h9w";
				break;
			case "h10s":
				Player.position = "h10e";
				break;
			case "h10w":
				Player.position = "h10s";
				break;
			case "h10e":
				Player.position = "h10w";
				break;
			case "h11s":
				if (Mouse.x > 90 && Mouse.x < 167 && Mouse.y > 216 && Mouse.y < 287) {
					// clicked plaque when turning left
					if (World.open) {
						Audio.startDoorShut();
						World.open = false;
					} else {
						Player.examiningPlaque = true;
					}
				} else {
					Player.position = "h11e";
					if (World.open) {
						Audio.startDoorShut();
						World.open = false;
					}
				}
				break;
			case "h11sRoom":
				Player.position = "h11s";
				break;
			case "h11w":
				Player.position = "h11s";
				break;
			case "h11n":
				Player.position = "h11w";
				break;
			case "h11e":
				Player.position = "h11n";
				break;
			case "h12s":
				Player.position = "h12e";
				break;
			case "h12w":
				Player.position = "h12s";
				break;
			case "h12n":
				Player.position = "h12w";
				break;
			case "h12e":
				if (Mouse.x > 25 && Mouse.x < 191 && Mouse.y > 131 && Mouse.y < 317) {
					// click sign
					Message.readH12E();
				} else {
					Player.position = "h12n";
				}
				break;
			case "h13s":
				Player.position = "h13e";
				break;
			case "h13w":
				Player.position = "h13s";
				break;
			case "h13n":
				Player.position = "h13w";
				break;
			case "h13e":
				Player.position = "h13n";
				break;
			case "h14s":
				Player.position = "h14e";
				break;
			case "h14w":
				Player.position = "h14s";
				break;
			case "h14n":
				//ImagePanel.resetImages();
				Player.position = "h14w";
				
				if (World.raDropped)
					ImagePanel.imageOutgoing2X = -80;
				break;
			case "h14e":
				if (World.raDropped)
					ImagePanel.image2X = -80;
				
				Player.position = "h14n";
				break;
			case "h15w":
				Player.position = "h15e";
				break;
			case "h15n":
				if (!Player.onPhone && Mouse.x > 5 && Mouse.x < 99 && Mouse.y > 160 && Mouse.y < 299) {
					Message.readH15N();
				} else if (!Keyboard.typingInput && !Player.readingMessage && Player.onPhone) {
					Item.wipePhoneNumber();
					Item.ringing = false;
					Audio.stopPhone();
					Animation.loweringPhone = true;
				} else {
					Player.position = "h15w";
				}
				break;
			case "h15e":
				Player.position = "h15n";
				break;
			case "h16s":
				Player.position = "h16e";
				break;
			case "h16w":
				Player.position = "h16s";
				break;
			case "h16n":
				Player.position = "h16w";
				break;
			case "h16e":
				Player.position = "h16n";
				break;
			case "h17s":
				Player.position = "h17e";
				break;
			case "h17w":
				Player.position = "h17s";
				break;
			case "h17n":
				Player.position = "h17w";
				break;
			case "h17e":
				Player.position = "h17n";
				break;
			case "h18s":
				if (Player.holdingRedBook || Player.holdingBlackBook || Player.holdingBlueBook) {
					if (Item.bookPage > 1 && Mouse.x > 26 && Mouse.x < 192 && Mouse.y > 74 && Mouse.y < 322) {
						Item.bookTurnPage();
					} else {
						if (!Animation.loweringBook) {
							Item.bookPage = 0;
							Animation.loweringBook = true;
							Player.setDisableWalk(true);
							Audio.startEquip2();
						}
					}
				} else {
					Player.position = "h18e";
				}
				break;
			case "h18w":
				Player.position = "h18s";
				break;
			case "h18n":
				Player.position = "h18w";
				break;
			case "h18e":
				Player.position = "h18n";
				break;
			case "hTV":
				Player.position = "h18e";
				break;
			case "hTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263) {
					World.pressRewind();
				} else {
					Player.position = "hTV";
				}
				break;
			case "hr1n":
				Player.position = "hr1w";
				break;
			case "hr1e":
				Player.position = "hr1n";
				break;
			case "hr1s":
				Player.position = "hr1e";
				break;
			case "hr1w":
				Player.position = "hr1s";
				break;
			case "hr2n":
				Player.position = "hr2w";
				break;
			case "hr2e":
				Player.position = "hr2n";
				break;
			case "hr2s":
				Player.position = "hr2e";
				break;
			case "hr2w":
				Player.position = "hr2s";
				break;
			case "hr3n":
				Player.position = "hr3w";
				break;
			case "hr3e":
				Player.position = "hr3n";
				break;
			case "hr3s":
				Player.position = "hr3e";
				break;
			case "hr3w":
				Player.position = "hr3s";
				break;
			case "hr4n":
				Player.position = "hr4w";
				break;
			case "hr4s":
				Player.position = "hr4e";
				break;
			case "hrTV":
				Player.position = "hr4s";
				break;
			case "hrTVControls":
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263) {
					World.pressRewind();
				} else {
					Player.position = "hrTV";
				}
				break;
			case "hr4e":
				Player.position = "hr4n";
				break;
			case "hr4w":
				Player.position = "hr4s";
				break;
			
			/** TEMPLE Turn Left */
			case "t1n":
				Player.position = "t1w";
				break;
			case "t1e":
				Player.position = "t1n";
				break;
			case "t1s":
				Player.position = "t1e";
				break;
			case "t1w":
				Player.position = "t1s";
				break;
			case "t2n":
				Player.position = "t2w";
				break;
			case "t2e":
				Player.position = "t2n";
				break;
			case "t2s":
				Player.position = "t2e";
				break;
			case "t2w":
				Player.position = "t2s";
				break;
			case "t3n":
				Player.position = "t3w";
				break;
			case "t3e":
				Player.position = "t3n";
				break;
			case "t3s":
				Player.position = "t3e";
				break;
			case "t3w":
				Player.position = "t3s";
				break;
			case "t4n":
				Player.position = "t4w";
				break;
			case "t4e":
				Player.position = "t4n";
				break;
			case "t4w":
				Player.position = "t4s";
				break;
			case "t4s":
				Player.position = "t4e";
				break;
			case "t5s":
				Player.position = "t5e";
				break;
			case "t5w":
				Player.position = "t5s";
				break;
			case "t5n":
				if (Player.examiningGo && World.scrollCloseable) {
					Animation.closingScroll = true;
				} else {
					//ImagePanel.resetImages();
					Player.position = "t5w";
				
					if (World.t5nOpened)
						ImagePanel.imageOutgoing3Y = Bunraku.height;
				}
				break;
			case "t5e":
				ImagePanel.image3Y = 0;
				World.t5nOpened = false;
				Player.position = "t5n";
				break;
			case "t6s":
				Player.position = "t6e";
				break;
			case "t6w":
				if (Player.examiningPaperSlip) {
					Audio.startEquip3();
					Player.setBusy(true);
					Animation.loweringPaperSlip = true;
				} else {
					Player.position = "t6s";
				}
				break;
			case "t6n":
				Player.position = "t6w";
				break;
			case "t6e":
				Player.position = "t6n";
				break;
			case "t7w":
				Player.position = "t7se";
				break;
			case "t7n":
				Player.position = "t7w";
				break;
			case "t7n shrine":
				Player.position = "t7n";
				break;
			case "t7e":
				Player.position = "t7n";
				break;
			case "t7se":
				Player.position = "t7e";
				break;
			case "t8se":
				Player.position = "t8e";
				break;
			case "t8sw":
				Player.position = "t8se";
				break;
			case "t8w":
				Player.position = "t8sw";
				break;
			case "t8n":
				Player.position = "t8w";
				break;
			case "t8e":
				Player.position = "t8n";
				break;
			case "t9s":
				Player.position = "t9e";
				break;
			case "t9w":
				Player.position = "t9s";
				break;
			case "t9n":
				Player.position = "t9w";
				break;
			case "t9n shop":
				if (!Player.holdingShopCase) {
					if (!World.shopkeeperPresent)
						Player.position = "t9n";
				} else {
					Animation.loweringShopCase = true;
				}
				break;
			case "t9e":
				Player.position = "t9n";
				break;
			case "t10s":
				Player.position = "t10e";
				break;
			case "t10se":
				Player.position = "t10e";
				break;
			case "t10ne":
				Player.position = "t10nw";
				break;
			case "t10w":
				Player.position = "t10s";
				break;
			case "t10n":
				Player.position = "t10w";
				break;
			case "t10nw":
				Player.position = "t10se";
				break;
			case "t10e":
				Player.position = "t10ne";
				break;
			case "t11se":
				Player.position = "t11ne";
				break;
			case "t11w":
				Player.position = "t11sw";
				break;
			case "t11sw":
				Player.position = "t11se";
				break;
			case "t11nw":
				Player.position = "t11w";
				break;
			case "t11ne":
				Player.position = "t11nw";
				break;
			case "t12s":
				Player.position = "t12e";
				break;
			case "t12nw":
				Player.position = "t12s";
				break;
			case "t12ne":
				Player.position = "t12n";
				break;
			case "t12n":
				Player.position = "t12nw";
				break;
			case "t12e":
				Player.position = "t12ne";
				break;
			case "t13s":
				Player.position = "t13e";
				break;
			case "t13w":
				Player.position = "t13s";
				break;
			case "t13n":
				Player.position = "t13w";
				break;
			case "t13e":
				Player.position = "t13ne";
				break;
			case "t13ne":
				Player.position = "t13n";
				break;
			case "t14s":
				Player.position = "t14e";
				break;
			case "t14w":
				Player.position = "t14s";
				break;
			case "t14n":
				Player.position = "t14w";
				break;
			case "t14e":
				Player.position = "t14n";
				break;
			case "t15s":
				Player.position = "t15e";
				break;
			case "t15w":
				Player.position = "t15s";
				break;
			case "t15n":
				Player.position = "t15w";
				break;
			case "t15e":
				Player.position = "t15n";
				break;
			case "t16s":
				Player.position = "t16e";
				break;
			case "t16w":
				Player.position = "t16s";
				break;
			case "t16n":
				Player.position = "t16w";
				break;
			case "t16e":
				Player.position = "t16n";
				break;
			case "t17s":
				Player.position = "t17e";
				break;
			case "t17w":
				Player.position = "t17s";
				break;
			case "t17n":
				Player.position = "t17w";
				break;
			case "t17e":
				Player.position = "t17n";
				break;
			case "t18s":
				Player.position = "t18e";
				break;
			case "t18w":
				Player.position = "t18s";
				break;
			case "t18n":
				Player.position = "t18w";
				break;
			case "t18e":
				Player.position = "t18n";
				break;
			case "t19s":
				Player.position = "t19e";
				break;
			case "t19w":
				Player.position = "t19s";
				break;
			case "t19n":
				Player.position = "t19w";
				break;
			case "t19e":
				Player.position = "t19n";
				break;
			case "t20s":
				Player.position = "t20e";
				break;
			case "t20w":
				Player.position = "t20s";
				break;
			case "t20n":
				Player.position = "t20w";
				break;
			case "t20e":
				Player.position = "t20n";
				break;
			case "t21s":
				Player.position = "t21e";
				break;
			case "t21w":
				Player.position = "t21s";
				break;
			case "t21n":
				Player.position = "t21w";
				break;
			case "t21e":
				Player.position = "t21n";
				break;
			case "t22s":
				Player.position = "t22e";
				break;
			case "t22w":
				Player.position = "t22s";
				break;
			case "t22n":
				Player.position = "t22w";
				break;
			case "t22e":
				Player.position = "t22n";
				break;
			case "t23s":
				Player.position = "t23e";
				break;
			case "t23w":
				Player.position = "t23s";
				break;
			case "t23n":
				Player.position = "t23w";
				break;
			case "t23e":
				Player.position = "t23n";
				break;
			case "t24s":
				Player.position = "t24n";
				break;
			case "t24n":
				Player.position = "t24s";
				break;
			case "t25s":
				Player.position = "t25e";
				break;
			case "t25w":
				Player.position = "t25s";
				break;
			case "t25ww":
				if (Player.examiningT25WWSign && !Player.cantLeaveKnot) {
					Player.examiningT25WWSign = false;
				} else {
					Player.position = "t25w";
				}
				break;
			case "t25n":
				Player.position = "t25w";
				break;
			case "t25e":
				Player.position = "t25n";
				break;
			case "t26s":
				Player.position = "t26e";
				break;
			case "t26w":
				Player.position = "t26s";
				break;
			case "t26n":
				Player.position = "t26w";
				break;
			case "t26e":
				Player.position = "t26n";
				break;
			case "t27s":
				Player.position = "t27n";
				break;
			case "t27n":
				Player.position = "t27s";
				break;
			case "t28s":
				Player.position = "t28e";
				break;
			case "t28w":
				Player.position = "t28s";
				break;
			case "t28n":
				Player.position = "t28w";
				break;
			case "t28e":
				Player.position = "t28n";
				break;
			case "t29s":
				Player.position = "t29n";
				break;
			case "t29n":
				Player.position = "t29s";
				break;
			case "t30s":
				Player.position = "t30e";
				break;
			case "t30w":
				Player.position = "t30s";
				break;
			case "t30n":
				Player.position = "t30w";
				break;
			case "t30e":
				Player.position = "t30n";
				break;
			case "t31s":
				Player.position = "t31n";
				break;
			case "t31n":
				Player.position = "t31s";
				break;
			case "t32s":
				Player.position = "t32n";
				break;
			case "t32n":
				Player.position = "t32s";
				break;
			case "t33s":
				Player.position = "t33n";
				break;
			case "t33n":
				Player.position = "t33s";
				break;
			case "t34s":
				Player.position = "t34n";
				break;
			case "t34n":
				Player.position = "t34s";
				break;
			case "t35s":
				Player.position = "t35n";
				break;
			case "t35n":
				Player.position = "t35s";
				break;
			case "t36s":
				Player.position = "t36n";
				break;
			case "t36n":
				Player.position = "t36s";
				break;
			case "t37s":
				Player.position = "t37n";
				break;
			case "t37n":
				Player.position = "t37s";
				break;
			case "t38s":
				Player.position = "t38n";
				break;
			case "t38n":
				Player.position = "t38s";
				break;
			case "t39s":
				Player.position = "t38n";
				break;
			case "t39n":
				Player.position = "t39s";
				break;
			case "t40s":
				Player.position = "t40e";
				break;
			case "t40w":
				Player.position = "t40s";
				break;
			case "t40n":
				Player.position = "t40w";
				break;
			case "t40e":
				Player.position = "t40n";
				break;
			case "t41s":
				Player.position = "t41n";
				break;
			case "t41n":
				Player.position = "t41s";
				break;
			case "t42s":
				Player.position = "t42n";
				break;
			case "t42n":
				Player.position = "t42s";
				break;
			case "t43s":
				Player.position = "t43n";
				break;
			case "t43n":
				Player.position = "t43s";
				break;
			case "t44s":
				Player.position = "t44n";
				break;
			case "t44n":
				Player.position = "t44s";
				break;
			case "t45s":
				Player.position = "t45n";
				break;
			case "t45n":
				Player.position = "t45s";
				break;
			case "t46s":
				Player.position = "t46e";
				break;
			case "t46w":
				Player.position = "t46s";
				break;
			case "t46n":
				Player.position = "t46w";
				break;
			case "t46e":
				Player.position = "t46n";
				break;
			case "t47s":
				Player.position = "t47e";
				break;
			case "t47w":
				Player.position = "t47s";
				break;
			case "t47n":
				Player.position = "t47w";
				break;
			case "t47e":
				Player.position = "t47n";
				break;
			case "t48s":
				ImagePanel.image2Y = 0;
				Player.position = "t48e";
				break;
			case "t48w":
				Player.position = "t48s";
				break;
			case "t48n":
				//ImagePanel.resetImages();
				Player.position = "t48w";
				ImagePanel.imageOutgoing2Y = -155;
				ImagePanel.image2Y = 0;
				break;
			case "t48e":
				if (World.t48eGateOpen) {
					World.t48eGateOpen = false;
					ImagePanel.imageOutgoing2Y = World.tGateLimit;
				}
				ImagePanel.image2Y = -155; // this may happen too soon
				Player.position = "t48n";
				break;
			case "tTV":
				ImagePanel.resetImages();
				ImagePanel.image2Y = World.tGateLimit;
				Player.position = "t48e";
				break;
			case "tTVControls":
				// rewind
				if (Mouse.x > 60 && Mouse.x < 130 && Mouse.y > 199 && Mouse.y < 263) {
					World.pressRewind();
				} else {
					Player.position = "tTV";
				}
				break;
			default:
				System.out.println("Click.turnLeft() error");
				break;
		}
	}
}