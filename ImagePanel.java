import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.Graphics2D;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel implements ActionListener {	
	Timer timer = new Timer(22, this); // Draws image every x miliseconds. 5 is good
	
	private static Font customFont;
	
	public static boolean hudVisible;
	public static boolean displayingInputUnderscore;
	public static int opacity = 255;
	public static int redValue = 0;
	public static int greenValue = 0;
	public static int blueValue = 0;
	public static int eyelid1Y;
	public static int eyelid2Y;
	public static int image1X;
	public static int image1Y;
	public static int image2X;
	public static int image2Y;
	public static int image3X;
	public static int image3Y;
	public static int image4X;
	public static int image4Y;
	public static int image5X;
	public static int image5Y;
	public static int image6X;
	public static int image6Y;
	public static int image7X;
	public static int image7Y;
	public static int image8X;
	public static int image8Y;
	public static int image9X;
	public static int image9Y;
	public static int image10X;
	public static int image10Y;
	public static int image1Width;
	public static int image1Height;
	public static int image2Width;
	public static int image2Height;
	public static int image3Width;
	public static int image3Height;
	public static int image4Width;
	public static int image4Height;
	public static int image5Width;
	public static int image5Height;
	public static int image6Width;
	public static int image6Height;
	public static int image7Width;
	public static int image7Height;
	public static int image8Width;
	public static int image8Height;
	public static int image9Width;
	public static int image9Height;
	public static int image10Width;
	public static int image10Height;
	public static int imageOutgoing1X;
	public static int imageOutgoing1Y;
	public static int imageOutgoing2X;
	public static int imageOutgoing2Y;
	public static int imageOutgoing3X;
	public static int imageOutgoing3Y;
	public static int imageOutgoing4X;
	public static int imageOutgoing4Y;
	public static int imageOutgoing5X;
	public static int imageOutgoing5Y;
	public static int imageOutgoing6X;
	public static int imageOutgoing6Y;
	public static int scrollY = -250;
	public static int hBladeX = 0;
	public static int imageOutgoing1Width;
	public static int imageOutgoing1Height;
	public static int imageOutgoing2Width;
	public static int imageOutgoing2Height;
	public static int imageOutgoing3Width;
	public static int imageOutgoing3Height;
	public static int imageOutgoing4Width;
	public static int imageOutgoing4Height;
	public static int imageOutgoing5Width;
	public static int imageOutgoing5Height;
	public static int imageOutgoing6Width;
	public static int imageOutgoing6Height;
	public static int spaceX;
	public static int spaceWidth;
	public static int symbol1X;
	public static int symbol2X;
	public static int symbol1Y;
	public static int imageItemX;
	public static int imageItemY;
	public static int imageMessageX = 417;
	public static int imageMessageY;
	public static int textSize = 16;
	public static int textX = 56;
	public static int textLine1Y = 330;
	public static int textLine2Y = textLine1Y + 16;
	public static int textLine3Y = textLine2Y + 16;
	public static int textLine4Y = textLine3Y + 16;
	public static int inputX;
	public static int inputY;
	public static int inputWidth;
	public static int inputHeight;
	public static int inputBoxX = 100;
	public static int inputBoxY = 250;
	public static int inputScrollX = Bunraku.width;
	public static int keyboardInputTextSize = 36;
	public static int inputScrollXTarget;
	public static final int inputScrollXANCHOR = 350;
	public static final int keyboardInputTextXANCHOR = 476;
	public static int keyboardInputTextX = 476;
	public static int keyboardInputTextY = 270;
	public static int inputUnderscoreX1 = 475;
	public static int inputUnderscoreY1 = 274;
	public static int inputUnderscoreX2 = 503;
	public static int inputUnderscoreY2 = 274;
	public static int inputUnderscoreLength = inputUnderscoreX2 - inputUnderscoreX1;
	public static int inputBoxWidth = 355;
	public static int inputBoxHeight = 50;
	public static int cyclingItemX = 0;
	public static int cyclingItemY = 0;
	public static int cyclingItemWidth = 544;
	public static int cyclingItemHeight = 416;
	public static int fractalDegree = 45;
	public static int bladeDegree = 0;
	public static int creditsX = 15;
	public static int creditsY = 416 + 40;
	public static int creditsSpacing = 25;
	public static int creditsSize = 22;
	public static int creditsLength = -1890;
	
	Image title = new ImageIcon("resources/images/title.png").getImage();	
	Image hud = new ImageIcon("resources/images/hud.png").getImage();	
	Image gameOver = new ImageIcon("resources/images/gameOver.png").getImage();	
	Image eyelid1 = new ImageIcon("resources/images/eyelid1.png").getImage();	
	Image eyelid2 = new ImageIcon("resources/images/eyelid2.png").getImage();	
	Image ac0 = new ImageIcon("resources/images/ac0.png").getImage();
	Image ac1 = new ImageIcon("resources/images/ac1.png").getImage();
	Image ac2 = new ImageIcon("resources/images/ac2.png").getImage();
	Image ac3 = new ImageIcon("resources/images/ac3.png").getImage();
	Image ac4 = new ImageIcon("resources/images/ac4.png").getImage();
	Image ac5 = new ImageIcon("resources/images/ac5.png").getImage();
	Image ac6 = new ImageIcon("resources/images/ac6.png").getImage();
	Image ac7 = new ImageIcon("resources/images/ac7.png").getImage();
	Image ac8 = new ImageIcon("resources/images/ac8.png").getImage();
	Image ac9 = new ImageIcon("resources/images/ac9.png").getImage();
	Image ac10 = new ImageIcon("resources/images/ac10.png").getImage();
	Image ac11 = new ImageIcon("resources/images/ac11.png").getImage();
	Image ac12 = new ImageIcon("resources/images/ac12.png").getImage();
	Image ac13 = new ImageIcon("resources/images/ac13.png").getImage();
	Image ac14 = new ImageIcon("resources/images/ac14.png").getImage();
	Image ac15 = new ImageIcon("resources/images/ac15.png").getImage();
	Image ac16 = new ImageIcon("resources/images/ac16.png").getImage();
	Image bulbGold = new ImageIcon("resources/images/bulb gold.png").getImage();
	Image bulbOOOg9 = new ImageIcon("resources/images/bulb OOO g9.png").getImage();
	Image bulbOOOg18 = new ImageIcon("resources/images/bulb OOO g18.png").getImage();
	Image bulbOOOh1 = new ImageIcon("resources/images/bulb OOO h1.png").getImage();
	Image bulbOOOh11 = new ImageIcon("resources/images/bulb OOO h11.png").getImage();
	Image bulbOOOh14 = new ImageIcon("resources/images/bulb OOO h14.png").getImage();
	Image bulbOOOh17 = new ImageIcon("resources/images/bulb OOO h17.png").getImage();
	Image bulbOOOt5 = new ImageIcon("resources/images/bulb OOO t5.png").getImage();
	Image bulbOOOt23 = new ImageIcon("resources/images/bulb OOO t23.png").getImage();
	Image bulbOOOt35 = new ImageIcon("resources/images/bulb OOO t35.png").getImage();
	Image bulbOOXg9 = new ImageIcon("resources/images/bulb OOX g9.png").getImage();
	Image bulbOOXg18 = new ImageIcon("resources/images/bulb OOX g18.png").getImage();
	Image bulbOOXh1 = new ImageIcon("resources/images/bulb OOX h1.png").getImage();
	Image bulbOOXh11 = new ImageIcon("resources/images/bulb OOX h11.png").getImage();
	Image bulbOOXh14 = new ImageIcon("resources/images/bulb OOX h14.png").getImage();
	Image bulbOOXh17 = new ImageIcon("resources/images/bulb OOX h17.png").getImage();
	Image bulbOXOg9 = new ImageIcon("resources/images/bulb OXO g9.png").getImage();
	Image bulbOXOg18 = new ImageIcon("resources/images/bulb OXO g18.png").getImage();
	Image bulbOXOt5 = new ImageIcon("resources/images/bulb OXO t5.png").getImage();
	Image bulbOXOt23 = new ImageIcon("resources/images/bulb OXO t23.png").getImage();
	Image bulbOXOt35 = new ImageIcon("resources/images/bulb OXO t35.png").getImage();
	Image bulbOXXg9 = new ImageIcon("resources/images/bulbOXX g9.png").getImage();
	Image bulbOXXg18 = new ImageIcon("resources/images/bulb OXX g9.png").getImage();
	Image bulbXOOh1 = new ImageIcon("resources/images/bulb XOO h1.png").getImage();
	Image bulbXOOh11 = new ImageIcon("resources/images/bulb XOO h11.png").getImage();
	Image bulbXOOh14 = new ImageIcon("resources/images/bulb XOO h14.png").getImage();
	Image bulbXOOh17 = new ImageIcon("resources/images/bulb XOO h17.png").getImage();
	Image bulbXOOt5 = new ImageIcon("resources/images/bulb XOO t5.png").getImage();
	Image bulbXOOt23 = new ImageIcon("resources/images/bulb XOO t23.png").getImage();
	Image bulbXOOt35 = new ImageIcon("resources/images/bulb XOO t35.png").getImage();
	Image bulbXOXh1 = new ImageIcon("resources/images/bulb XOX h1.png").getImage();
	Image bulbXOXh11 = new ImageIcon("resources/images/bulb XOX h11.png").getImage();
	Image bulbXOXh14 = new ImageIcon("resources/images/bulb XOX h14.png").getImage();
	Image bulbXOXh17 = new ImageIcon("resources/images/bulb XOX h17.png").getImage();
	Image bulbXXOt5 = new ImageIcon("resources/images/bulb XXO t5.png").getImage();
	Image bulbXXOt23 = new ImageIcon("resources/images/bulb XXO t23.png").getImage();
	Image bulbXXOt35 = new ImageIcon("resources/images/bulb XXO t35.png").getImage();
	Image fishingRodBent = new ImageIcon("resources/images/fishing rod bent.png").getImage();
	Image fishingRod = new ImageIcon("resources/images/fishing rod.png").getImage();
	Image fishingPole = new ImageIcon("resources/images/fishing_Pole.png").getImage();
	Image g1e = new ImageIcon("resources/images/g1e.png").getImage();
	Image g1n = new ImageIcon("resources/images/g1n.png").getImage();
	Image g1s = new ImageIcon("resources/images/g1s.png").getImage();
	Image g1w = new ImageIcon("resources/images/g1w.png").getImage();
	Image g2e = new ImageIcon("resources/images/g2e.png").getImage();
	Image g2n = new ImageIcon("resources/images/g2n.png").getImage();
	Image g2s = new ImageIcon("resources/images/g2s.png").getImage();
	Image g2w = new ImageIcon("resources/images/g2w.png").getImage();
	Image g3e = new ImageIcon("resources/images/g3e.png").getImage();
	Image g3n = new ImageIcon("resources/images/g3n.png").getImage();
	Image g3s = new ImageIcon("resources/images/g3s.png").getImage();
	Image g3w = new ImageIcon("resources/images/g3w.png").getImage();
	Image g4e = new ImageIcon("resources/images/g4e.png").getImage();
	Image g4w = new ImageIcon("resources/images/g4w.png").getImage();
	Image g5e = new ImageIcon("resources/images/g5e.png").getImage();
	Image g5n = new ImageIcon("resources/images/g5n.png").getImage();
	Image g5s = new ImageIcon("resources/images/g5s.png").getImage();
	Image g5w = new ImageIcon("resources/images/g5w.png").getImage();
	Image g6e = new ImageIcon("resources/images/g6e.png").getImage();
	Image g6nBook = new ImageIcon("resources/images/g6n book.png").getImage();
	Image g6n = new ImageIcon("resources/images/g6n.png").getImage();
	Image g6w = new ImageIcon("resources/images/g6w.png").getImage();
	Image g7e = new ImageIcon("resources/images/g7e.png").getImage();
	Image g7n = new ImageIcon("resources/images/g7n.png").getImage();
	Image g7w = new ImageIcon("resources/images/g7w.png").getImage();
	Image g7s = new ImageIcon("resources/images/g7s.png").getImage();
	Image g8e = new ImageIcon("resources/images/g8e.png").getImage();
	Image g8w = new ImageIcon("resources/images/g8w.png").getImage();
	Image g9e = new ImageIcon("resources/images/g9e.png").getImage();
	Image g9sOpenEnd = new ImageIcon("resources/images/g9n open END.png").getImage();
	Image g9sOpenStart = new ImageIcon("resources/images/g9n open start.png").getImage();
	Image g9rsShrineEnd = new ImageIcon("resources/images/g9n shrine END.png").getImage();
	Image g9rsShrineStart = new ImageIcon("resources/images/g9n shrine START.png").getImage();
	Image g9n = new ImageIcon("resources/images/g9n.png").getImage();
	Image g9reOOO = new ImageIcon("resources/images/g9re OOO.png").getImage();
	Image g9reOOX = new ImageIcon("resources/images/g9re OOX.png").getImage();
	Image g9reOpen = new ImageIcon("resources/images/g9re Open.png").getImage();
	Image g9reOXO = new ImageIcon("resources/images/g9re OXO.png").getImage();
	Image g9reOXX = new ImageIcon("resources/images/g9re OXX.png").getImage();
	Image g9rnOOO = new ImageIcon("resources/images/g9rn OOO.png").getImage();
	Image g9rnOOX = new ImageIcon("resources/images/g9rn OOX.png").getImage();
	Image g9rnOXO = new ImageIcon("resources/images/g9rn OXO.png").getImage();
	Image g9rnOXX = new ImageIcon("resources/images/g9rn OXX.png").getImage();
	Image g9rwClosed = new ImageIcon("resources/images/g9rw closed.png").getImage();
	Image g9rwExamineDoll = new ImageIcon("resources/images/g9rw examine doll.png").getImage();
	Image g9rwOpenDoll = new ImageIcon("resources/images/g9rw open doll.png").getImage();
	Image g9rwOpenEmpty = new ImageIcon("resources/images/g9rw open empty.png").getImage();
	Image g9sSign = new ImageIcon("resources/images/g9s sign.png").getImage();
	Image g9s = new ImageIcon("resources/images/g9s.png").getImage();
	Image g9sOOO = new ImageIcon("resources/images/g9sOOO.png").getImage();
	Image g9sOOX = new ImageIcon("resources/images/g9sOOX.png").getImage();
	Image g9sOXO = new ImageIcon("resources/images/g9sOXO.png").getImage();
	Image g9sOXX = new ImageIcon("resources/images/g9sOXX.png").getImage();
	Image g9w = new ImageIcon("resources/images/g9w.png").getImage();
	Image g10e = new ImageIcon("resources/images/g10e.png").getImage();
	Image g10n = new ImageIcon("resources/images/g10n.png").getImage();
	Image g10s = new ImageIcon("resources/images/g10s.png").getImage();
	Image g10wDream = new ImageIcon("resources/images/g10w dream.png").getImage();
	Image g10w = new ImageIcon("resources/images/g10w.png").getImage();
	Image g11e = new ImageIcon("resources/images/g11e.png").getImage();
	Image g11wDream = new ImageIcon("resources/images/g11w dream.png").getImage();
	Image g11w = new ImageIcon("resources/images/g11w.png").getImage();
	Image g12e = new ImageIcon("resources/images/g12e.png").getImage();
	Image g12n = new ImageIcon("resources/images/g12n.png").getImage();
	Image g12s = new ImageIcon("resources/images/g12s.png").getImage();
	Image g12wDream = new ImageIcon("resources/images/g12w dream.png").getImage();
	Image g12w = new ImageIcon("resources/images/g12w.png").getImage();
	Image g13e = new ImageIcon("resources/images/g13e.png").getImage();
	Image g13n = new ImageIcon("resources/images/g13n.png").getImage();
	Image g13s = new ImageIcon("resources/images/g13s.png").getImage();
	Image g13w = new ImageIcon("resources/images/g13w.png").getImage();
	Image g14e = new ImageIcon("resources/images/g14e.png").getImage();
	Image g14n = new ImageIcon("resources/images/g14n.png").getImage();
	Image g14s = new ImageIcon("resources/images/g14s.png").getImage();
	Image g14se = new ImageIcon("resources/images/g14se.png").getImage();
	Image g14w = new ImageIcon("resources/images/g14w.png").getImage();
	Image g15e = new ImageIcon("resources/images/g15e.png").getImage();
	Image g15nDream = new ImageIcon("resources/images/g15n dream.png").getImage();
	Image g15n = new ImageIcon("resources/images/g15n.png").getImage();
	Image g15s = new ImageIcon("resources/images/g15s.png").getImage();
	Image g15w = new ImageIcon("resources/images/g15w.png").getImage();
	Image g16e = new ImageIcon("resources/images/g16e.png").getImage();
	Image g16n = new ImageIcon("resources/images/g16n.png").getImage();
	Image g16s = new ImageIcon("resources/images/g16s.png").getImage();
	Image g16w = new ImageIcon("resources/images/g16w.png").getImage();
	Image g17n = new ImageIcon("resources/images/g17n.png").getImage();
	Image g17s = new ImageIcon("resources/images/g17s.png").getImage();
	Image g17wOOO = new ImageIcon("resources/images/g17w OOO.png").getImage();
	Image g17wOOX = new ImageIcon("resources/images/g17w OOX.png").getImage();
	Image g17wOXO = new ImageIcon("resources/images/g17w OXO.png").getImage();
	Image g17wOXX = new ImageIcon("resources/images/g17w OXX.png").getImage();
	Image g17w = new ImageIcon("resources/images/g17w.png").getImage();
	Image g17e = new ImageIcon("resources/images/g17e.png").getImage();
	Image g18e = new ImageIcon("resources/images/g18e.png").getImage();
	Image g18n = new ImageIcon("resources/images/g18n.png").getImage();
	Image g18s = new ImageIcon("resources/images/g18s.png").getImage();
	Image g18wHandleClosed = new ImageIcon("resources/images/g18w handle closed.png").getImage();
	Image g18wHandleOpen = new ImageIcon("resources/images/g18w handle open.png").getImage();
	Image g18wScroll = new ImageIcon("resources/images/g18w scroll.png").getImage();
	Image g18wOOO = new ImageIcon("resources/images/g18w OOO.png").getImage();
	Image g18wOOX = new ImageIcon("resources/images/g18w OOX.png").getImage();
	Image g18wOpen = new ImageIcon("resources/images/g18w open.png").getImage();
	Image g18wOXO = new ImageIcon("resources/images/g18w OXO.png").getImage();
	Image g18wOXX = new ImageIcon("resources/images/g18w OXX.png").getImage();
	Image g19e = new ImageIcon("resources/images/g19e.png").getImage();
	Image g19nSwitch = new ImageIcon("resources/images/g19n switch.png").getImage();
	Image g19n = new ImageIcon("resources/images/g19n.png").getImage();
	Image g19s = new ImageIcon("resources/images/g19s.png").getImage();
	Image g19w = new ImageIcon("resources/images/g19w.png").getImage();
	Image g20e = new ImageIcon("resources/images/g20e.png").getImage();
	Image g20n = new ImageIcon("resources/images/g20n.png").getImage();
	Image g20s = new ImageIcon("resources/images/g20s.png").getImage();
	Image g20w = new ImageIcon("resources/images/g20w.png").getImage();
	Image g21e = new ImageIcon("resources/images/g21e.png").getImage();
	Image g21n = new ImageIcon("resources/images/g21n.png").getImage();
	Image g21s = new ImageIcon("resources/images/g21s.png").getImage();
	Image g21sw = new ImageIcon("resources/images/g21sw.png").getImage();
	Image g21w = new ImageIcon("resources/images/g21w.png").getImage();
	Image g22e = new ImageIcon("resources/images/g22e.png").getImage();
	Image g22n = new ImageIcon("resources/images/g22n.png").getImage();
	Image g22s = new ImageIcon("resources/images/g22s.png").getImage();
	Image g22w = new ImageIcon("resources/images/g22w.png").getImage();
	Image g23e = new ImageIcon("resources/images/g23e.png").getImage();
	Image g23n = new ImageIcon("resources/images/g23n.png").getImage();
	Image g23s = new ImageIcon("resources/images/g23s.png").getImage();
	Image g24e = new ImageIcon("resources/images/g24e.png").getImage();
	Image g24w = new ImageIcon("resources/images/g24w.png").getImage();
	Image g24n = new ImageIcon("resources/images/g24n.png").getImage();
	Image g24s = new ImageIcon("resources/images/g24s.png").getImage();
	Image g25e = new ImageIcon("resources/images/g25e.png").getImage();
	Image g25n = new ImageIcon("resources/images/g25n.png").getImage();
	Image g25s = new ImageIcon("resources/images/g25s.png").getImage();
	Image g25w = new ImageIcon("resources/images/g25w.png").getImage();
	Image g26e = new ImageIcon("resources/images/g26e.png").getImage();
	Image g26n = new ImageIcon("resources/images/g26n.png").getImage();
	Image g26s = new ImageIcon("resources/images/g26s.png").getImage();
	Image g26w = new ImageIcon("resources/images/g26w.png").getImage();
	Image g27e = new ImageIcon("resources/images/g27e.png").getImage();
	Image g27nMonk = new ImageIcon("resources/images/g27n monk.png").getImage();
	Image g27nOverlap = new ImageIcon("resources/images/g27n overlap.png").getImage();
	Image g27n = new ImageIcon("resources/images/g27n.png").getImage();
	Image g27s = new ImageIcon("resources/images/g27s.png").getImage();
	Image g27w = new ImageIcon("resources/images/g27w.png").getImage();
	Image g28n = new ImageIcon("resources/images/g28n.png").getImage();
	Image g28s = new ImageIcon("resources/images/g28s.png").getImage();
	Image g28w = new ImageIcon("resources/images/g28w.png").getImage();
	Image g29n = new ImageIcon("resources/images/g29n.png").getImage();
	Image g29s = new ImageIcon("resources/images/g29s.png").getImage();
	Image g29w = new ImageIcon("resources/images/g29w.png").getImage();
	Image g30eFlash = new ImageIcon("resources/images/g30e flash.png").getImage();
	Image g30eMonkClose = new ImageIcon("resources/images/g30e monk close.png").getImage();
	Image g30eMonkFar = new ImageIcon("resources/images/g30e monk far.png").getImage();
	Image g30eMonkGun = new ImageIcon("resources/images/g30e monk gun.png").getImage();
	Image g30eMonkSnatch = new ImageIcon("resources/images/g30e monk snatch.png").getImage();
	Image g30eOverlay = new ImageIcon("resources/images/g30e overlay.png").getImage();
	Image g30e = new ImageIcon("resources/images/g30e.png").getImage();
	Image g30n = new ImageIcon("resources/images/g30n.png").getImage();
	Image g30s = new ImageIcon("resources/images/g30s.png").getImage();
	Image g30w = new ImageIcon("resources/images/g30w.png").getImage();
	Image g31e = new ImageIcon("resources/images/g31e.png").getImage();
	Image g31n = new ImageIcon("resources/images/g31n.png").getImage();
	Image g31s = new ImageIcon("resources/images/g31s.png").getImage();
	Image g31wMonk = new ImageIcon("resources/images/g31w monk.png").getImage();
	Image g31w = new ImageIcon("resources/images/g31w.png").getImage();
	Image g32e = new ImageIcon("resources/images/g32e.png").getImage();
	Image g32n = new ImageIcon("resources/images/g32n.png").getImage();
	Image g32s = new ImageIcon("resources/images/g32s.png").getImage();
	Image g32wMonk = new ImageIcon("resources/images/g32w monk.png").getImage();
	Image g32w = new ImageIcon("resources/images/g32w.png").getImage();
	Image g33e = new ImageIcon("resources/images/g33e.png").getImage();
	Image g33n = new ImageIcon("resources/images/g33n.png").getImage();
	Image g33s = new ImageIcon("resources/images/g33s.png").getImage();
	Image g33w = new ImageIcon("resources/images/g33w.png").getImage();
	Image g34e = new ImageIcon("resources/images/g34e.png").getImage();
	Image g34n = new ImageIcon("resources/images/g34n.png").getImage();
	Image g34s = new ImageIcon("resources/images/g34s.png").getImage();
	Image g34w = new ImageIcon("resources/images/g34w.png").getImage();
	Image g35e = new ImageIcon("resources/images/g35e.png").getImage();
	Image g35n = new ImageIcon("resources/images/g35n.png").getImage();
	Image g35s = new ImageIcon("resources/images/g35s.png").getImage();
	Image g35w = new ImageIcon("resources/images/g35w.png").getImage();
	Image g36e = new ImageIcon("resources/images/g36e.png").getImage();
	Image g36n = new ImageIcon("resources/images/g36n.png").getImage();
	Image g36s = new ImageIcon("resources/images/g36s.png").getImage();
	Image g36w = new ImageIcon("resources/images/g36w.png").getImage();
	Image g37e = new ImageIcon("resources/images/g37e.png").getImage();
	Image g37n = new ImageIcon("resources/images/g37n.png").getImage();
	Image g37s = new ImageIcon("resources/images/g37s.png").getImage();
	Image g37w = new ImageIcon("resources/images/g37w.png").getImage();
	Image goldPaperDark = new ImageIcon("resources/images/gold paper dark.png").getImage();
	Image goldPaperLight = new ImageIcon("resources/images/gold paper light.png").getImage();
	Image gtapeBackMonk = new ImageIcon("resources/images/gtape back monk.png").getImage();
	Image gtapeBackdrop = new ImageIcon("resources/images/gtape backdrop.png").getImage();
	Image gtapeDieMonk = new ImageIcon("resources/images/gtape diemonk.png").getImage();
	Image gtapeFrontMonk = new ImageIcon("resources/images/gtape front monk.png").getImage();
	Image gtapeOffClose = new ImageIcon("resources/images/gtape off close.png").getImage();
	Image gtapeOverlay = new ImageIcon("resources/images/gtape overlay.png").getImage();
	Image gtapePaperCranes = new ImageIcon("resources/images/gtape paper cranes.png").getImage();
	Image gtapeReaperLeave = new ImageIcon("resources/images/gtape reaper leave.png").getImage();
	Image gtapeReaper = new ImageIcon("resources/images/gtape reaper.png").getImage();
	Image gtapeRightMonk = new ImageIcon("resources/images/gtape right monk.png").getImage();
	Image hTVOff = new ImageIcon("resources/images/h_TV_off.png").getImage();
	Image h1e = new ImageIcon("resources/images/h1e.png").getImage();
	Image h1nDoor = new ImageIcon("resources/images/h1n door.png").getImage();
	Image h1nOOO = new ImageIcon("resources/images/h1n OOO.png").getImage();
	Image h1nOOXopen = new ImageIcon("resources/images/h1n OOX open.png").getImage();
	Image h1nOOX = new ImageIcon("resources/images/h1n OOX.png").getImage();
	Image h1nOpen2 = new ImageIcon("resources/images/h1n open2.png").getImage();
	Image h1nXOO = new ImageIcon("resources/images/h1n XOO.png").getImage();
	Image h1nXOX = new ImageIcon("resources/images/h1n XOX.png").getImage();
	Image h1n = new ImageIcon("resources/images/h1n.png").getImage();
	Image h1s = new ImageIcon("resources/images/h1s.png").getImage();
	Image h1w = new ImageIcon("resources/images/h1w.png").getImage();
	Image h2e = new ImageIcon("resources/images/h2e.png").getImage();
	Image h2n = new ImageIcon("resources/images/h2n.png").getImage();
	Image h2s = new ImageIcon("resources/images/h2s.png").getImage();
	Image h2sw = new ImageIcon("resources/images/h2sw.png").getImage();
	Image h2wBlade = new ImageIcon("resources/images/h2w blade.png").getImage();
	Image h2wOverlay = new ImageIcon("resources/images/h2w overlay.png").getImage();
	Image h2wReaperUnarmed = new ImageIcon("resources/images/h2w reaper unarmed.png").getImage();
	Image h2wReaper1 = new ImageIcon("resources/images/h2w reaper1.png").getImage();
	Image h2wSword = new ImageIcon("resources/images/h2w sword.png").getImage();
	Image h2w = new ImageIcon("resources/images/h2w.png").getImage();
	Image h3e = new ImageIcon("resources/images/h3e.png").getImage();
	Image h3n = new ImageIcon("resources/images/h3n.png").getImage();
	Image h3s = new ImageIcon("resources/images/h3s.png").getImage();
	Image h3w = new ImageIcon("resources/images/h3w.png").getImage();
	Image h4n = new ImageIcon("resources/images/h4n.png").getImage();
	Image h4s = new ImageIcon("resources/images/h4s.png").getImage();
	Image h5e = new ImageIcon("resources/images/h5e.png").getImage();
	Image h5n = new ImageIcon("resources/images/h5n.png").getImage();
	Image h5s = new ImageIcon("resources/images/h5s.png").getImage();
	Image h5w = new ImageIcon("resources/images/h5w.png").getImage();
	Image h6e = new ImageIcon("resources/images/h6e.png").getImage();
	Image h6n = new ImageIcon("resources/images/h6n.png").getImage();
	Image h6s = new ImageIcon("resources/images/h6s.png").getImage();
	Image h6w = new ImageIcon("resources/images/h6w.png").getImage();
	Image h7e = new ImageIcon("resources/images/h7e.png").getImage();
	Image h7n = new ImageIcon("resources/images/h7n.png").getImage();
	Image h7s = new ImageIcon("resources/images/h7s.png").getImage();
	Image h7w = new ImageIcon("resources/images/h7w.png").getImage();
	Image h8e = new ImageIcon("resources/images/h8e.png").getImage();
	Image h8n = new ImageIcon("resources/images/h8n.png").getImage();
	Image h8s = new ImageIcon("resources/images/h8s.png").getImage();
	Image h8w = new ImageIcon("resources/images/h8w.png").getImage();
	Image h9e = new ImageIcon("resources/images/h9e.png").getImage();
	Image h9s = new ImageIcon("resources/images/h9s.png").getImage();
	Image h9w = new ImageIcon("resources/images/h9w.png").getImage();
	Image h10e = new ImageIcon("resources/images/h10e.png").getImage();
	Image h10s = new ImageIcon("resources/images/h10s.png").getImage();
	Image h10w = new ImageIcon("resources/images/h10w.png").getImage();
	Image h11e = new ImageIcon("resources/images/h11e.png").getImage();
	Image h11n = new ImageIcon("resources/images/h11n.png").getImage();
	Image h11sOOO = new ImageIcon("resources/images/h11s OOO.png").getImage();
	Image h11sOOX = new ImageIcon("resources/images/h11s OOX.png").getImage();
	Image h11sOpen = new ImageIcon("resources/images/h11s open.png").getImage();
	Image h11sXOX = new ImageIcon("resources/images/h11s XOX.png").getImage();
	Image h11sRoomCorn = new ImageIcon("resources/images/h11s room corn.png").getImage();
	Image h11sRoomScroll = new ImageIcon("resources/images/h11sRoomScroll.png").getImage();
	Image h11sRoom = new ImageIcon("resources/images/h11s room.png").getImage();
	Image h11sXOO = new ImageIcon("resources/images/h11s XOO.png").getImage();
	Image h11s = new ImageIcon("resources/images/h11s.png").getImage();
	Image h11w = new ImageIcon("resources/images/h11w.png").getImage();
	Image h12e = new ImageIcon("resources/images/h12e.png").getImage();
	Image h12n = new ImageIcon("resources/images/h12n.png").getImage();
	Image h12s = new ImageIcon("resources/images/h12s.png").getImage();
	Image h12w = new ImageIcon("resources/images/h12w.png").getImage();
	Image h13e = new ImageIcon("resources/images/h13e.png").getImage();
	Image h13n = new ImageIcon("resources/images/h13n.png").getImage();
	Image h13nw = new ImageIcon("resources/images/h13nw.png").getImage();
	Image h13s = new ImageIcon("resources/images/h13s.png").getImage();
	Image h13sw = new ImageIcon("resources/images/h13sw.png").getImage();
	Image h13w = new ImageIcon("resources/images/h13w.png").getImage();
	Image h14e = new ImageIcon("resources/images/h14e.png").getImage();
	Image h14nBack = new ImageIcon("resources/images/h14n back.png").getImage();
	Image h14nButton = new ImageIcon("resources/images/h14n button.png").getImage();
	Image h14nOOOButton = new ImageIcon("resources/images/h14n OOO button.png").getImage();
	Image h14nOOO = new ImageIcon("resources/images/h14n OOO.png").getImage();
	Image h14nOOXButton = new ImageIcon("resources/images/h14n OOX button.png").getImage();
	Image h14nOOX = new ImageIcon("resources/images/h14n OOX.png").getImage();
	Image h14nShelf = new ImageIcon("resources/images/h14nShelf.png").getImage();
	Image h14nScroll = new ImageIcon("resources/images/h14nScroll.png").getImage();
	Image h14nXOOButton = new ImageIcon("resources/images/h14n XOO button.png").getImage();
	Image h14nXOO = new ImageIcon("resources/images/h14n XOO.png").getImage();
	Image h14nXOXButton = new ImageIcon("resources/images/h14n XOX button.png").getImage();
	Image h14nXOX = new ImageIcon("resources/images/h14n XOX.png").getImage();
	Image h14n = new ImageIcon("resources/images/h14n.png").getImage();
	Image h14nwOOX = new ImageIcon("resources/images/h14nw OOX.png").getImage();
	Image h14nwXOO = new ImageIcon("resources/images/h14nw XOO.png").getImage();
	Image h14nwXOX = new ImageIcon("resources/images/h14nw XOX.png").getImage();
	Image h14nw = new ImageIcon("resources/images/h14nw.png").getImage();
	Image h14s = new ImageIcon("resources/images/h14s.png").getImage();
	Image h14w = new ImageIcon("resources/images/h14w.png").getImage();
	Image h15e = new ImageIcon("resources/images/h15e.png").getImage();
	Image h15nMessage = new ImageIcon("resources/images/h15n message.png").getImage();
	Image h15nPhone = new ImageIcon("resources/images/h15n phone.png").getImage();
	Image h15n = new ImageIcon("resources/images/h15n.png").getImage();
	Image h15nw = new ImageIcon("resources/images/h15nw.png").getImage();
	Image h15se = new ImageIcon("resources/images/h15se.png").getImage();
	Image h15sw = new ImageIcon("resources/images/h15sw.png").getImage();
	Image h15w = new ImageIcon("resources/images/h15w.png").getImage();
	Image h16e = new ImageIcon("resources/images/h16e.png").getImage();
	Image h16n = new ImageIcon("resources/images/h16n.png").getImage();
	Image h16ne = new ImageIcon("resources/images/h16ne.png").getImage();
	Image h16nw = new ImageIcon("resources/images/h16nw.png").getImage();
	Image h16sFpoleInv = new ImageIcon("resources/images/h16s fpole inv.png").getImage();
	Image h16sFpoleWall = new ImageIcon("resources/images/h16s fpole wall.png").getImage();
	Image h16w = new ImageIcon("resources/images/h16w.png").getImage();
	Image h17e = new ImageIcon("resources/images/h17e.png").getImage();
	Image h17nHandleClosed = new ImageIcon("resources/images/h17n handle closed.png").getImage();
	Image h17nHandleOpen = new ImageIcon("resources/images/h17n handle open.png").getImage();
	Image h17nOOO = new ImageIcon("resources/images/h17n OOO.png").getImage();
	Image h17nOOX = new ImageIcon("resources/images/h17n OOX.png").getImage();
	Image h17nOpen = new ImageIcon("resources/images/h17n open.png").getImage();
	Image h17nXOO = new ImageIcon("resources/images/h17n XOO.png").getImage();
	Image h17nXOX = new ImageIcon("resources/images/h17n XOX.png").getImage();
	Image h17n = new ImageIcon("resources/images/h17n.png").getImage();
	Image h17nScroll = new ImageIcon("resources/images/h17n scroll.png").getImage();
	Image h17sFpoleInv = new ImageIcon("resources/images/h17s fpole inv.png").getImage();
	Image h17sFpoleWall = new ImageIcon("resources/images/h17s fpole wall.png").getImage();
	Image h17s = new ImageIcon("resources/images/h17s.png").getImage();
	Image h17w = new ImageIcon("resources/images/h17w.png").getImage();
	Image h18eOff = new ImageIcon("resources/images/h18e_OFF.png").getImage();
	Image h18eOnEnd = new ImageIcon("resources/images/h18e_ON_END.png").getImage();
	Image h18eOnStart = new ImageIcon("resources/images/h18e_ON_START.png").getImage();
	Image h18n = new ImageIcon("resources/images/h18n.png").getImage();
	Image h18sBlack0 = new ImageIcon("resources/images/h18s black0.png").getImage();
	Image h18sBlack1 = new ImageIcon("resources/images/h18s black1.png").getImage();
	Image h18sBlack2 = new ImageIcon("resources/images/h18s black2.png").getImage();
	Image h18sBlack3 = new ImageIcon("resources/images/h18s black3.png").getImage();
	Image h18sBlack4 = new ImageIcon("resources/images/h18s black4.png").getImage();
	Image h18sBlack5 = new ImageIcon("resources/images/h18s black5.png").getImage();
	Image h18sBlack6 = new ImageIcon("resources/images/h18s black6.png").getImage();
	Image h18sBlack7 = new ImageIcon("resources/images/h18s black7.png").getImage();
	Image h18sBlue0 = new ImageIcon("resources/images/h18s blue0.png").getImage();
	Image h18sBlue1 = new ImageIcon("resources/images/h18s blue1.png").getImage();
	Image h18sBlue2 = new ImageIcon("resources/images/h18s blue2.png").getImage();
	Image h18sBlue3 = new ImageIcon("resources/images/h18s blue3.png").getImage();
	Image h18sBlue4 = new ImageIcon("resources/images/h18s blue4.png").getImage();
	Image h18sBlue5 = new ImageIcon("resources/images/h18s blue5.png").getImage();
	Image h18sBlue6 = new ImageIcon("resources/images/h18s blue6.png").getImage();
	Image h18sFpoleInv = new ImageIcon("resources/images/h18s fpole inv.png").getImage();
	Image h18sFpoleWall = new ImageIcon("resources/images/h18s fpole wall.png").getImage();
	Image h18sRed0 = new ImageIcon("resources/images/h18s red0.png").getImage();
	Image h18sRed1 = new ImageIcon("resources/images/h18s red1.png").getImage();
	Image h18sRed2 = new ImageIcon("resources/images/h18s red2.png").getImage();
	Image h18sRed3 = new ImageIcon("resources/images/h18s red3.png").getImage();
	Image h18sRed4 = new ImageIcon("resources/images/h18s red4.png").getImage();
	Image h18sRed5 = new ImageIcon("resources/images/h18s red5.png").getImage();
	Image h18sTakeBlack = new ImageIcon("resources/images/h18s take black.png").getImage();
	Image h18sTakeBlue = new ImageIcon("resources/images/h18s take blue.png").getImage();
	Image h18sTakeRed = new ImageIcon("resources/images/h18s take red.png").getImage();
	Image h18s = new ImageIcon("resources/images/h18s.png").getImage();
	Image h18w = new ImageIcon("resources/images/h18w.png").getImage();
	Image hr1e = new ImageIcon("resources/images/hr1e.png").getImage();
	Image hr1n = new ImageIcon("resources/images/hr1n.png").getImage();
	Image hr1s = new ImageIcon("resources/images/hr1s.png").getImage();
	Image hr1w = new ImageIcon("resources/images/hr1w.png").getImage();
	Image hr2e = new ImageIcon("resources/images/hr2e.png").getImage();
	Image hr2nPaper = new ImageIcon("resources/images/hr2n paper.png").getImage();
	Image hr2n = new ImageIcon("resources/images/hr2n.png").getImage();
	Image hr2s = new ImageIcon("resources/images/hr2s.png").getImage();
	Image hr2w = new ImageIcon("resources/images/hr2w.png").getImage();
	Image hr3e = new ImageIcon("resources/images/hr3e.png").getImage();
	Image hr3n = new ImageIcon("resources/images/hr3n.png").getImage();
	Image hr3s = new ImageIcon("resources/images/hr3s.png").getImage();
	Image hr3w = new ImageIcon("resources/images/hr3w.png").getImage();
	Image hr4e = new ImageIcon("resources/images/hr4e.png").getImage();
	Image hr4n = new ImageIcon("resources/images/hr4n.png").getImage();
	Image hrTVBackdrop = new ImageIcon("resources/images/hr4s TV backdrop.png").getImage();
	Image hrTVKiyoshi = new ImageIcon("resources/images/hr4s TV Kiyoshi.png").getImage();
	Image hrTVOff = new ImageIcon("resources/images/hr4s TV off.png").getImage();
	Image hrTVOverlay = new ImageIcon("resources/images/hr4s TV overlay.png").getImage();
	Image hrTVclose = new ImageIcon("resources/images/hrTVclose.png").getImage();
	Image hr4s = new ImageIcon("resources/images/hr4s.png").getImage();
	Image hr4w = new ImageIcon("resources/images/hr4w.png").getImage();
	Image htapeDie1 = new ImageIcon("resources/images/htape die1.png").getImage();
	Image htapeDie2 = new ImageIcon("resources/images/htape die2.png").getImage();
	Image htapeDie3 = new ImageIcon("resources/images/htape die3.png").getImage();
	Image htapeDie4 = new ImageIcon("resources/images/htape die4.png").getImage();
	Image htapel1base = new ImageIcon("resources/images/htape l1 base.png").getImage();
	Image htapel2monk1 = new ImageIcon("resources/images/htape l2 monk.png").getImage();
	Image htapel2monk2 = new ImageIcon("resources/images/htape l2 monk2.png").getImage();
	Image htapel2reaper1 = new ImageIcon("resources/images/htape l2 reaper1.png").getImage();
	Image htapel2reaper2 = new ImageIcon("resources/images/htape l2 reaper2.png").getImage();
	Image htapel3gate = new ImageIcon("resources/images/htape l3 gate.png").getImage();
	Image htapel3wall = new ImageIcon("resources/images/htape l3 wall2.png").getImage();
	Image htapel4static = new ImageIcon("resources/images/htape l4 static.png").getImage();
	Image htapel5TV = new ImageIcon("resources/images/htape l5 TV.png").getImage();
	Image htapeStaticBlock = new ImageIcon("resources/images/htape static block2.png").getImage();
	Image htapeEnd = new ImageIcon("resources/images/htapeEND.png").getImage();
	Image htapeStart = new ImageIcon("resources/images/htapeSTART.png").getImage();
	Image itemCorn = new ImageIcon("resources/images/item_corn.png").getImage();
	Image itemGPaperd = new ImageIcon("resources/images/item_gpaperd.png").getImage();
	Image itemGPaperl = new ImageIcon("resources/images/item_gpaperl.png").getImage();
	Image itemPistol = new ImageIcon("resources/images/item_pistol.png").getImage();
	Image itemRod = new ImageIcon("resources/images/item_rod.png").getImage();
	Image itemScroll = new ImageIcon("resources/images/item_scroll.png").getImage();
	Image invArrows = new ImageIcon("resources/images/invArrows.png").getImage();
	Image koi1 = new ImageIcon("resources/images/koi1.png").getImage();
	Image koi2 = new ImageIcon("resources/images/koi2.png").getImage();
	Image mask = new ImageIcon("resources/images/mask.png").getImage();
	Image medsymGo = new ImageIcon("resources/images/medsym go.png").getImage();
	Image medsymJi = new ImageIcon("resources/images/medsym ji.png").getImage();
	Image medsymNi = new ImageIcon("resources/images/medsym ni.png").getImage();
	Image medsymOm = new ImageIcon("resources/images/medsym om.png").getImage();
	Image medsymRa = new ImageIcon("resources/images/medsym ra.png").getImage();
	Image medsymShi = new ImageIcon("resources/images/medsym shi.png").getImage();
	Image medsymYu = new ImageIcon("resources/images/medsym yu.png").getImage();
	Image paperCranesWest = new ImageIcon("resources/images/papercranes west.png").getImage();
	Image pistolPov = new ImageIcon("resources/images/pistolpov.png").getImage();
	Image pistolPovShoot = new ImageIcon("resources/images/pistolpovshoot.png").getImage();
	Image s1 = new ImageIcon("resources/images/s1.png").getImage();
	Image s2 = new ImageIcon("resources/images/s2.png").getImage();
	Image s3 = new ImageIcon("resources/images/s3.png").getImage();
	Image s4 = new ImageIcon("resources/images/s4.png").getImage();
	Image s5 = new ImageIcon("resources/images/s5.png").getImage();
	Image s6 = new ImageIcon("resources/images/s6.png").getImage();
	Image s7 = new ImageIcon("resources/images/s7.png").getImage();
	Image s8 = new ImageIcon("resources/images/s8.png").getImage();
	Image s9 = new ImageIcon("resources/images/s9.png").getImage();
	Image s10 = new ImageIcon("resources/images/s10.png").getImage();
	Image s11 = new ImageIcon("resources/images/s11.png").getImage();
	Image s12 = new ImageIcon("resources/images/s12.png").getImage();
	Image s13 = new ImageIcon("resources/images/s13.png").getImage();
	Image s14 = new ImageIcon("resources/images/s14.png").getImage();
	Image s15 = new ImageIcon("resources/images/s15.png").getImage();
	Image s16 = new ImageIcon("resources/images/s16.png").getImage();
	Image s17 = new ImageIcon("resources/images/s17.png").getImage();
	Image s18 = new ImageIcon("resources/images/s18.png").getImage();
	Image s19 = new ImageIcon("resources/images/s19.png").getImage();
	Image s20 = new ImageIcon("resources/images/s20.png").getImage();
	Image s21 = new ImageIcon("resources/images/s21.png").getImage();
	Image s22 = new ImageIcon("resources/images/s22.png").getImage();
	Image s23 = new ImageIcon("resources/images/s23.png").getImage();
	Image s24 = new ImageIcon("resources/images/s24.png").getImage();
	Image s25 = new ImageIcon("resources/images/s25.png").getImage();
	Image s26 = new ImageIcon("resources/images/s26.png").getImage();
	Image s27 = new ImageIcon("resources/images/s27.png").getImage();
	Image s28 = new ImageIcon("resources/images/s28.png").getImage();
	Image s29 = new ImageIcon("resources/images/s29.png").getImage();
	Image s30 = new ImageIcon("resources/images/s30.png").getImage();
	Image s31 = new ImageIcon("resources/images/s31.png").getImage();
	Image s32 = new ImageIcon("resources/images/s32.png").getImage();
	Image s33 = new ImageIcon("resources/images/s33.png").getImage();
	Image s34 = new ImageIcon("resources/images/s34.png").getImage();
	Image s35 = new ImageIcon("resources/images/s35.png").getImage();
	Image s36 = new ImageIcon("resources/images/s36.png").getImage();
	Image s37 = new ImageIcon("resources/images/s37.png").getImage();
	Image s38 = new ImageIcon("resources/images/s38.png").getImage();
	Image s39 = new ImageIcon("resources/images/s39.png").getImage();
	Image s40 = new ImageIcon("resources/images/s40.png").getImage();
	Image s41 = new ImageIcon("resources/images/s41.png").getImage();
	Image s42 = new ImageIcon("resources/images/s42.png").getImage();
	Image s43 = new ImageIcon("resources/images/s43.png").getImage();
	Image s44 = new ImageIcon("resources/images/s44.png").getImage();
	Image s45 = new ImageIcon("resources/images/s45.png").getImage();
	Image s46 = new ImageIcon("resources/images/s46.png").getImage();
	Image s47 = new ImageIcon("resources/images/s47.png").getImage();
	Image s48 = new ImageIcon("resources/images/s48.png").getImage();
	Image s49 = new ImageIcon("resources/images/s49.png").getImage();
	Image s50 = new ImageIcon("resources/images/s50.png").getImage();
	Image s51 = new ImageIcon("resources/images/s51.png").getImage();
	Image s52 = new ImageIcon("resources/images/s52.png").getImage();
	Image s53 = new ImageIcon("resources/images/s53.png").getImage();
	Image s54 = new ImageIcon("resources/images/s54.png").getImage();
	Image s55 = new ImageIcon("resources/images/s55.png").getImage();
	Image s56 = new ImageIcon("resources/images/s56.png").getImage();
	Image s57 = new ImageIcon("resources/images/s57.png").getImage();
	Image s58 = new ImageIcon("resources/images/s58.png").getImage();
	Image s59 = new ImageIcon("resources/images/s59.png").getImage();
	Image s60 = new ImageIcon("resources/images/s60.png").getImage();
	Image s61 = new ImageIcon("resources/images/s61.png").getImage();
	Image s62 = new ImageIcon("resources/images/s62.png").getImage();
	Image scrollGo = new ImageIcon("resources/images/scroll go.png").getImage();
	Image scrollJi = new ImageIcon("resources/images/scroll ji.png").getImage();
	Image scrollNi = new ImageIcon("resources/images/scroll ni.png").getImage();
	Image scrollOm = new ImageIcon("resources/images/scroll om.png").getImage();
	Image scrollRa = new ImageIcon("resources/images/scroll ra.png").getImage();
	Image scrollSealed = new ImageIcon("resources/images/scroll sealed.png").getImage();
	Image scrollShi = new ImageIcon("resources/images/scroll shi.png").getImage();
	Image scrollTop = new ImageIcon("resources/images/scroll top.png").getImage();
	Image scrollYu = new ImageIcon("resources/images/scroll yu.png").getImage();
	Image scue = new ImageIcon("resources/images/scue.png").getImage();
	Image space = new ImageIcon("resources/images/space.png").getImage();
	Image space2 = new ImageIcon("resources/images/space2.png").getImage();
	Image symbolKnot = new ImageIcon("resources/images/symbol endless knot.png").getImage();
	Image symbolFish = new ImageIcon("resources/images/symbol golden fish.png").getImage();
	Image symbolLotus = new ImageIcon("resources/images/symbol lotus.png").getImage();
	Image symbolPKnot = new ImageIcon("resources/images/symbol P endless knot.png").getImage();
	Image symbolPFish = new ImageIcon("resources/images/symbol P golden fish.png").getImage();
	Image symbolPLotus = new ImageIcon("resources/images/symbol P lotus.png").getImage();
	Image symbols = new ImageIcon("resources/images/symbols.png").getImage();
	Image t1eReaper1 = new ImageIcon("resources/images/t1e reaper1.png").getImage();
	Image t1eReaper2 = new ImageIcon("resources/images/t1e reaper2.png").getImage();
	Image t1eShoot = new ImageIcon("resources/images/t1e shoot.png").getImage();
	Image t1e = new ImageIcon("resources/images/t1e.png").getImage();
	Image t1n = new ImageIcon("resources/images/t1n.png").getImage();
	Image t1s = new ImageIcon("resources/images/t1s.png").getImage();
	Image t1w = new ImageIcon("resources/images/t1w.png").getImage();
	Image t2e = new ImageIcon("resources/images/t2e.png").getImage();
	Image t2n = new ImageIcon("resources/images/t2n.png").getImage();
	Image t2s = new ImageIcon("resources/images/t2s.png").getImage();
	Image t2w = new ImageIcon("resources/images/t2w.png").getImage();
	Image t3e = new ImageIcon("resources/images/t3e.png").getImage();
	Image t3n = new ImageIcon("resources/images/t3n.png").getImage();
	Image t3s = new ImageIcon("resources/images/t3s.png").getImage();
	Image t3w = new ImageIcon("resources/images/t3w.png").getImage();
	Image t4e = new ImageIcon("resources/images/t4e.png").getImage();
	Image t4n = new ImageIcon("resources/images/t4n.png").getImage();
	Image t4s = new ImageIcon("resources/images/t4s.png").getImage();
	Image t4w = new ImageIcon("resources/images/t4w.png").getImage();
	Image t5e = new ImageIcon("resources/images/t5e.png").getImage();
	Image t5nBox = new ImageIcon("resources/images/t5n box.png").getImage();
	Image t5nOOOButton = new ImageIcon("resources/images/t5n OOO button.png").getImage();
	Image t5nOOO = new ImageIcon("resources/images/t5n OOO.png").getImage();
	Image t5nOXO = new ImageIcon("resources/images/t5n OXO.png").getImage();
	Image t5nPlank = new ImageIcon("resources/images/t5n plank.png").getImage();
	Image t5nScroll = new ImageIcon("resources/images/t5nScroll.png").getImage();
	Image t5nXOO = new ImageIcon("resources/images/t5n XOO.png").getImage();
	Image t5nXXO = new ImageIcon("resources/images/t5n XXO.png").getImage();
	Image t5n = new ImageIcon("resources/images/t5n.png").getImage();
	Image t5s = new ImageIcon("resources/images/t5s.png").getImage();
	Image t5w = new ImageIcon("resources/images/t5w.png").getImage();
	Image t6e = new ImageIcon("resources/images/t6e.png").getImage();
	Image t6n = new ImageIcon("resources/images/t6n.png").getImage();
	Image t6s = new ImageIcon("resources/images/t6s.png").getImage();
	Image t6wKimiPaper = new ImageIcon("resources/images/t6w kimi paper.png").getImage();
	Image t6w = new ImageIcon("resources/images/t6w.png").getImage();
	Image t7e = new ImageIcon("resources/images/t7e.png").getImage();
	Image t7nShrine = new ImageIcon("resources/images/t7n shrine.png").getImage();
	Image t7n = new ImageIcon("resources/images/t7n.png").getImage();
	Image t7se = new ImageIcon("resources/images/t7se.png").getImage();
	Image t7w = new ImageIcon("resources/images/t7w.png").getImage();
	Image t8e = new ImageIcon("resources/images/t8e.png").getImage();
	Image t8n = new ImageIcon("resources/images/t8n.png").getImage();
	Image t8se = new ImageIcon("resources/images/t8se.png").getImage();
	Image t8sw = new ImageIcon("resources/images/t8sw.png").getImage();
	Image t8w = new ImageIcon("resources/images/t8w.png").getImage();
	Image t9e = new ImageIcon("resources/images/t9e.png").getImage();
	Image t9nShopCaseClosedOOO = new ImageIcon("resources/images/t9n shop case closed OOO.png").getImage();
	Image t9nShopCaseClosedOXO = new ImageIcon("resources/images/t9n shop case closed OXO.png").getImage();
	Image t9nShopCaseClosedXOO = new ImageIcon("resources/images/t9n shop case closed XOO.png").getImage();
	Image t9nShopCaseClosedXXO = new ImageIcon("resources/images/t9n shop case closed XXO.png").getImage();
	Image t9nShopCaseOpen = new ImageIcon("resources/images/t9n shop case open.png").getImage();
	Image t9nshopKeeper = new ImageIcon("resources/images/t9n shop keeper.png").getImage();
	Image t9nShopOverlay = new ImageIcon("resources/images/t9n shop overlay.png").getImage();
	Image t9nShopScroll = new ImageIcon("resources/images/t9n shop scroll.png").getImage();
	Image t9nShop = new ImageIcon("resources/images/t9n shop.png").getImage();
	Image t9n = new ImageIcon("resources/images/t9n.png").getImage();
	Image t9s = new ImageIcon("resources/images/t9s.png").getImage();
	Image t9w = new ImageIcon("resources/images/t9w.png").getImage();
	Image t10e = new ImageIcon("resources/images/t10e.png").getImage();
	Image t10ne = new ImageIcon("resources/images/t10ne.png").getImage();
	Image t10nw = new ImageIcon("resources/images/t10nw.png").getImage();
	Image t10se = new ImageIcon("resources/images/t10se.png").getImage();
	Image t11ne = new ImageIcon("resources/images/t11ne.png").getImage();
	Image t11nw = new ImageIcon("resources/images/t11nw.png").getImage();
	Image t11sw = new ImageIcon("resources/images/t11sw.png").getImage();
	Image t11se = new ImageIcon("resources/images/t11se.png").getImage();
	Image t11w = new ImageIcon("resources/images/t11w.png").getImage();
	Image t12e = new ImageIcon("resources/images/t12e.png").getImage();
	Image t12n = new ImageIcon("resources/images/t12n.png").getImage();
	Image t12ne = new ImageIcon("resources/images/t12ne.png").getImage();
	Image t12nw = new ImageIcon("resources/images/t12nw.png").getImage();
	Image t12s = new ImageIcon("resources/images/t12s.png").getImage();
	Image t13e = new ImageIcon("resources/images/t13e.png").getImage();
	Image t13n = new ImageIcon("resources/images/t13n.png").getImage();
	Image t13ne = new ImageIcon("resources/images/t13ne.png").getImage();
	Image t13s = new ImageIcon("resources/images/t13s.png").getImage();
	Image t13w = new ImageIcon("resources/images/t13w.png").getImage();
	Image t14e = new ImageIcon("resources/images/t14e.png").getImage();
	Image t14n = new ImageIcon("resources/images/t14n.png").getImage();
	Image t14s = new ImageIcon("resources/images/t14s.png").getImage();
	Image t14w = new ImageIcon("resources/images/t14w.png").getImage();
	Image t15e = new ImageIcon("resources/images/t15e.png").getImage();
	Image t15n = new ImageIcon("resources/images/t15n.png").getImage();
	Image t15s = new ImageIcon("resources/images/t15s.png").getImage();
	Image t15w = new ImageIcon("resources/images/t15w.png").getImage();
	Image t16e = new ImageIcon("resources/images/t16e.png").getImage();
	Image t16n = new ImageIcon("resources/images/t16n.png").getImage();
	Image t16s = new ImageIcon("resources/images/t16s.png").getImage();
	Image t16w = new ImageIcon("resources/images/t16w.png").getImage();
	Image t17e = new ImageIcon("resources/images/t17e.png").getImage();
	Image t17n = new ImageIcon("resources/images/t17n.png").getImage();
	Image t17s = new ImageIcon("resources/images/t17s.png").getImage();
	Image t17w = new ImageIcon("resources/images/t17w.png").getImage();
	Image t18e = new ImageIcon("resources/images/t18e.png").getImage();
	Image t18n = new ImageIcon("resources/images/t18n.png").getImage();
	Image t18s = new ImageIcon("resources/images/t18s.png").getImage();
	Image t18w = new ImageIcon("resources/images/t18w.png").getImage();
	Image t19e = new ImageIcon("resources/images/t19e.png").getImage();
	Image t19n = new ImageIcon("resources/images/t19n.png").getImage();
	Image t19s = new ImageIcon("resources/images/t19s.png").getImage();
	Image t19w = new ImageIcon("resources/images/t19w.png").getImage();
	Image t20e = new ImageIcon("resources/images/t20e.png").getImage();
	Image t20n = new ImageIcon("resources/images/t20n.png").getImage();
	Image t20s = new ImageIcon("resources/images/t20s.png").getImage();
	Image t20w = new ImageIcon("resources/images/t20w.png").getImage();
	Image t21e = new ImageIcon("resources/images/t21e.png").getImage();
	Image t21n = new ImageIcon("resources/images/t21n.png").getImage();
	Image t21s = new ImageIcon("resources/images/t21s.png").getImage();
	Image t21w = new ImageIcon("resources/images/t21w.png").getImage();
	Image t22e = new ImageIcon("resources/images/t22e.png").getImage();
	Image t22n = new ImageIcon("resources/images/t22n.png").getImage();
	Image t22s = new ImageIcon("resources/images/t22s.png").getImage();
	Image t22w = new ImageIcon("resources/images/t22w.png").getImage();
	Image t23e = new ImageIcon("resources/images/t23e.png").getImage();
	Image t23n = new ImageIcon("resources/images/t23n.png").getImage();
	Image t23s = new ImageIcon("resources/images/t23s.png").getImage();
	Image t23wEnter2 = new ImageIcon("resources/images/t23w enter2.png").getImage();
	Image t23wOOO = new ImageIcon("resources/images/t23w OOO.png").getImage();
	Image t23wOverlay = new ImageIcon("resources/images/t23w overlay.png").getImage();
	Image t23wOXO = new ImageIcon("resources/images/t23w OXO.png").getImage();
	Image t23wTJbackdrop = new ImageIcon("resources/images/t23w tjbackdrop.png").getImage();
	Image t23wTodContent = new ImageIcon("resources/images/t23w tod content.png").getImage();
	Image t23wTodInvite = new ImageIcon("resources/images/t23w tod invite.png").getImage();
	Image t23wTodPeak = new ImageIcon("resources/images/t23w tod peak.png").getImage();
	Image t23wTodTalk1 = new ImageIcon("resources/images/t23w tod talk1.png").getImage();
	Image t23wTodThink = new ImageIcon("resources/images/t23w tod think.png").getImage();
	Image t23wTodWalkEnter = new ImageIcon("resources/images/t23w tod walk enter.png").getImage();
	Image t23wXOO = new ImageIcon("resources/images/t23w XOO.png").getImage();
	Image t23wXXO = new ImageIcon("resources/images/t23w XXO.png").getImage();
	Image t23w = new ImageIcon("resources/images/t23w.png").getImage();
	Image t24n = new ImageIcon("resources/images/t24n.png").getImage();
	Image t24s = new ImageIcon("resources/images/t24s.png").getImage();
	Image t25e = new ImageIcon("resources/images/t25e.png").getImage();
	Image t25n = new ImageIcon("resources/images/t25n.png").getImage();
	Image t25s = new ImageIcon("resources/images/t25s.png").getImage();
	Image t25w = new ImageIcon("resources/images/t25w.png").getImage();
	Image t25wwSign = new ImageIcon("resources/images/t25ww sign.png").getImage();
	Image t25ww = new ImageIcon("resources/images/t25ww.png").getImage();
	Image t26e = new ImageIcon("resources/images/t26e.png").getImage();
	Image t26n = new ImageIcon("resources/images/t26n.png").getImage();
	Image t26s = new ImageIcon("resources/images/t26s.png").getImage();
	Image t26w = new ImageIcon("resources/images/t26w.png").getImage();
	Image t27n = new ImageIcon("resources/images/t27n.png").getImage();
	Image t27s = new ImageIcon("resources/images/t27s.png").getImage();
	Image t28e = new ImageIcon("resources/images/t28e.png").getImage();
	Image t28n = new ImageIcon("resources/images/t28n.png").getImage();
	Image t28s = new ImageIcon("resources/images/t28s.png").getImage();
	Image t28w = new ImageIcon("resources/images/t28w.png").getImage();
	Image t29n = new ImageIcon("resources/images/t29n.png").getImage();
	Image t29s = new ImageIcon("resources/images/t29s.png").getImage();
	Image t30e = new ImageIcon("resources/images/t30e.png").getImage();
	Image t30n = new ImageIcon("resources/images/t30n.png").getImage();
	Image t30s = new ImageIcon("resources/images/t30s.png").getImage();
	Image t30w = new ImageIcon("resources/images/t30w.png").getImage();
	Image t31n = new ImageIcon("resources/images/t31n.png").getImage();
	Image t31s = new ImageIcon("resources/images/t31s.png").getImage();
	Image t32n = new ImageIcon("resources/images/t32n.png").getImage();
	Image t32s = new ImageIcon("resources/images/t32s.png").getImage();
	Image t33n = new ImageIcon("resources/images/t33n.png").getImage();
	Image t33s = new ImageIcon("resources/images/t33s.png").getImage();
	Image t34n = new ImageIcon("resources/images/t34n.png").getImage();
	Image t34s = new ImageIcon("resources/images/t34s.png").getImage();
	Image t35n = new ImageIcon("resources/images/t35n.png").getImage();
	Image t35s = new ImageIcon("resources/images/t35s.png").getImage();
	Image t36n = new ImageIcon("resources/images/t36n.png").getImage();
	Image t36s = new ImageIcon("resources/images/t36s.png").getImage();
	Image t36w = new ImageIcon("resources/images/t36w.png").getImage();
	Image t37n = new ImageIcon("resources/images/t37n.png").getImage();
	Image t37s = new ImageIcon("resources/images/t37s.png").getImage();
	Image t38n = new ImageIcon("resources/images/t38n.png").getImage();
	Image t38s = new ImageIcon("resources/images/t38s.png").getImage();
	Image t39n = new ImageIcon("resources/images/t39n.png").getImage();
	Image t39s = new ImageIcon("resources/images/t39s.png").getImage();
	Image t40e = new ImageIcon("resources/images/t40e.png").getImage();
	Image t40n = new ImageIcon("resources/images/t40n.png").getImage();
	Image t40s = new ImageIcon("resources/images/t40s.png").getImage();
	Image t40w = new ImageIcon("resources/images/t40w.png").getImage();
	Image t41n = new ImageIcon("resources/images/t41n.png").getImage();
	Image t41s = new ImageIcon("resources/images/t41s.png").getImage();
	Image t42n = new ImageIcon("resources/images/t42n.png").getImage();
	Image t42s = new ImageIcon("resources/images/t42s.png").getImage();
	Image t43n = new ImageIcon("resources/images/t43n.png").getImage();
	Image t43s = new ImageIcon("resources/images/t43s.png").getImage();
	Image t44n = new ImageIcon("resources/images/t44n.png").getImage();
	Image t44s = new ImageIcon("resources/images/t44s.png").getImage();
	Image t45n = new ImageIcon("resources/images/t45n.png").getImage();
	Image t45s = new ImageIcon("resources/images/t45s.png").getImage();
	Image t46e = new ImageIcon("resources/images/t46e.png").getImage();
	Image t46n = new ImageIcon("resources/images/t46n.png").getImage();
	Image t46s = new ImageIcon("resources/images/t46s.png").getImage();
	Image t46w = new ImageIcon("resources/images/t46w.png").getImage();
	Image t47e = new ImageIcon("resources/images/t47e.png").getImage();
	Image t47n = new ImageIcon("resources/images/t47n.png").getImage();
	Image t47s = new ImageIcon("resources/images/t47s.png").getImage();
	Image t47w = new ImageIcon("resources/images/t47w.png").getImage();
	Image t48eOff = new ImageIcon("resources/images/t48e OFF.png").getImage();
	Image t48eOnEnd = new ImageIcon("resources/images/t48e ON END.png").getImage();
	Image t48eOnStart = new ImageIcon("resources/images/t48e ON START.png").getImage();
	Image t48nTassel = new ImageIcon("resources/images/t48n tassel.png").getImage();
	Image t48e = new ImageIcon("resources/images/t48e.png").getImage();
	Image t48eGate = new ImageIcon("resources/images/t48gate.png").getImage();
	Image t48n = new ImageIcon("resources/images/t48n.png").getImage();
	Image t48s = new ImageIcon("resources/images/t48s.png").getImage();
	Image t48w = new ImageIcon("resources/images/t48w.png").getImage();
	Image test = new ImageIcon("resources/images/test.png").getImage();
	Image todConfused = new ImageIcon("resources/images/tod confused.png").getImage();
	Image todContent = new ImageIcon("resources/images/tod content.png").getImage();
	Image todEnter = new ImageIcon("resources/images/tod enter.png").getImage();
	Image todMyCup1 = new ImageIcon("resources/images/tod my cup1.png").getImage();
	Image todSelfSip = new ImageIcon("resources/images/tod self sip.png").getImage();
	Image todSip1 = new ImageIcon("resources/images/tod sip1.png").getImage();
	Image todSip2 = new ImageIcon("resources/images/tod sip2.png").getImage();
	Image todSip3 = new ImageIcon("resources/images/tod sip3.png").getImage();
	Image todSitting = new ImageIcon("resources/images/tod sitting.png").getImage();
	Image todTable = new ImageIcon("resources/images/tod table.png").getImage();
	Image todTalk = new ImageIcon("resources/images/tod talk.png").getImage();
	Image todTodsCup1 = new ImageIcon("resources/images/tod tod's cup 1.png").getImage();
	Image toonOrange1 = new ImageIcon("resources/images/toonorange1.png").getImage();
	Image TVCRbleed1 = new ImageIcon("resources/images/TVCR bleed 1.png").getImage();
	Image TVCRbleed2 = new ImageIcon("resources/images/TVCR bleed2.png").getImage();
	Image TVCRframe = new ImageIcon("resources/images/TVCR frame.png").getImage();
	Image TVCRmonkDie1 = new ImageIcon("resources/images/TVCR monk die1.png").getImage();
	Image TVCRmonkDie2 = new ImageIcon("resources/images/TVCR monk die2.png").getImage();
	Image TVCRmonkFront = new ImageIcon("resources/images/TVCR monk front.png").getImage();
	Image TVCRmonkLeft = new ImageIcon("resources/images/TVCR monk left.png").getImage();
	Image TVCRmonkRight = new ImageIcon("resources/images/TVCR monk right.png").getImage();
	Image TVCRoverhang = new ImageIcon("resources/images/TVCR overhang.png").getImage();
	Image TVCRoverlay = new ImageIcon("resources/images/TVCR overlay.png").getImage();
	Image TVCRreaperBack = new ImageIcon("resources/images/TVCR reaper back.png").getImage();
	Image TVCRreaperLeft = new ImageIcon("resources/images/TVCR reaper left.png").getImage();
	Image TVCRbase = new ImageIcon("resources/images/TVCRbase.png").getImage();
	Image rodIcon = new ImageIcon("resources/images/rodIcon.png").getImage();
	Image cornIcon = new ImageIcon("resources/images/cornIcon.png").getImage();
	Image message = new ImageIcon("resources/images/message.png").getImage();
	Image invClose = new ImageIcon("resources/images/invClose.png").getImage();
	Image inputScroll = new ImageIcon("resources/images/inputScroll.png").getImage();
	Image g_tvClose = new ImageIcon("resources/images/g_tvClose.png").getImage();
	Image h_tvClose = new ImageIcon("resources/images/h_tvClose.png").getImage();
	Image t_tvClose = new ImageIcon("resources/images/t_tvClose.png").getImage();
	Image loading = new ImageIcon("resources/images/loading.png").getImage();
	//Image credits = new ImageIcon("resources/images/credits.png").getImage();
		
	/** Sets up Image */
	public ImagePanel() {
		timer.start();
		
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/fonts/luximr.ttf")).deriveFont(16f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resources/fonts/luximr.ttf")));
		} catch (IOException | FontFormatException e) {
			System.out.println("ImagePanel constructor font error");
		}
	}
	
	/** PAINT COMPONENT METHOD */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/** Draw black background */
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		/** Draw images (layered) */
		g.drawImage(getImage1(), image1X, image1Y, image1Width, image1Height, this);
		g.drawImage(getImage2(), image2X, image2Y, image2Width, image2Height, this);
		g.drawImage(getImage3(), image3X, image3Y, image3Width, image3Height, this);
		g.drawImage(getImage4(), image4X, image4Y, image4Width, image4Height, this);
		g.drawImage(getImage5(), image5X, image5Y, image5Width, image5Height, this);
		g.drawImage(getImage6(), image6X, image6Y, image6Width, image6Height, this);
		g.drawImage(getImage7(), image7X, image7Y, image7Width, image7Height, this);
		g.drawImage(getImage8(), image8X, image8Y, image8Width, image8Height, this);
		g.drawImage(getImage9(), image9X, image9Y, image9Width, image9Height, this);
		g.drawImage(getImage10(), image10X, image10Y, image10Width, image10Height, this);
		
		if (Animation.panningLeft || Animation.panningRight) {
			g.drawImage(getOutgoingImage1(), imageOutgoing1X, imageOutgoing1Y, imageOutgoing1Width, imageOutgoing1Height, this);
		
			g.drawImage(getOutgoingImage2(), imageOutgoing2X, imageOutgoing2Y, imageOutgoing2Width, imageOutgoing2Height, this);
			
			g.drawImage(getOutgoingImage3(), imageOutgoing3X, imageOutgoing3Y, imageOutgoing3Width, imageOutgoing3Height, this);
			
			g.drawImage(getOutgoingImage4(), imageOutgoing4X, imageOutgoing4Y, imageOutgoing4Width, imageOutgoing4Height, this);
			
			g.drawImage(getOutgoingImage5(), imageOutgoing5X, imageOutgoing5Y, imageOutgoing5Width, imageOutgoing5Height, this);
					
			g.drawImage(getOutgoingImage6(), imageOutgoing6X, imageOutgoing6Y, imageOutgoing6Width, imageOutgoing6Height, this);
		}		
		
		// draw scrolls when examining
		if (Player.examiningOm
			|| Player.examiningNi 
			|| Player.examiningGo 
			|| Player.examiningYu 
			|| Player.examiningJi 
			|| Player.examiningRa 
			|| Player.examiningShi) 
			g.drawImage(getScrollImage(), 0, scrollY, getWidth(), getHeight(), this);
		
		// draw Scroll top when examining
		if (Player.examiningOm
			|| Player.examiningNi
			|| Player.examiningGo
			|| Player.examiningYu
			|| Player.examiningJi
			|| Player.examiningRa
			|| Player.examiningShi) 
				g.drawImage(getScrollTop(), 0, 0, getWidth(), getHeight(), this);
		
		// draw item
		g.drawImage(getImageItem(), imageItemX, imageItemY, getWidth(), getHeight(), this);
		
		/** Draw HUD */
		if (hudVisible 
		&& Player.position != "title" 
		&& !Player.busy 
		&& !Player.meditating 
		&& !Player.checkingInventory)
			g.drawImage(hud, 0, 0, getWidth(), getHeight(), this);
		
		// Blood
		if (Animation.bloody) {
			/** Draw red rectangle */
			g.setColor(new Color(redValue, greenValue, blueValue, opacity));
			g.fillRect(0, 0, getWidth(), getHeight());
		}
		
		
		// draw fractal
		if (Animation.rotatingFractal) {
			BufferedImage fractal = loadFractal("resources/images/fractal2.png");
			
			AffineTransform at = AffineTransform.getTranslateInstance(-100,50);
			at.rotate(Math.toRadians(fractalDegree), fractal.getWidth()/2, fractal.getHeight()/2);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(fractal, at, null);
		}
		
		// draw h blade
		if (Animation.movingHBlade) {
			BufferedImage h2wBlade = loadBlade("resources/images/h2w blade.png");
			
			AffineTransform at = AffineTransform.getTranslateInstance(hBladeX,0);
			at.rotate(Math.toRadians(bladeDegree), 0, 0);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(h2wBlade, at, null);
		}
		
		// samadhi
		if (Player.position.equals("samadhi")) {
			g.drawImage(getSamadhiImage(), 0, 0, Bunraku.width, Bunraku.height, this);
			
		}
		
		// Fade Black
		if (Animation.fadingOut || Animation.fadingIn || Animation.faded) {
			/** Draw black rectangle */
			g.setColor(new Color(redValue, greenValue, blueValue, opacity));
			g.fillRect(0, 0, getWidth(), getHeight());
			
			//System.out.println("fadingOut " + Animation.fadingOut + " fadingIn " + Animation.fadingIn + " faded " + Animation.faded);
		}
		
		if (Animation.displayingSpace) {
			if (Player.position.equals("samadhi")) {
				g.drawImage(space2, spaceX, 0, 6455, Bunraku.height, this);
				g.drawImage(space2, spaceX + 6455, 0, 6455, Bunraku.height, this);
			} else {
				g.drawImage(space, spaceX, 0, 6455, Bunraku.height, this);
				g.drawImage(space, spaceX + 6455, 0, 6455, Bunraku.height, this);
			}
		}
		
		if (Animation.displayingCredits) {
			g.setColor(new Color(255, 255, 255, 255));
			g.setFont(new Font("serif", Font.PLAIN, creditsSize)); 
			g.drawString(Message.credits1, creditsX, creditsY + creditsSpacing);
			g.drawString(Message.credits2, creditsX, creditsY + creditsSpacing * 2);
			g.drawString(Message.credits3, creditsX, creditsY + creditsSpacing * 3);
			g.drawString(Message.credits4, creditsX, creditsY + creditsSpacing * 4);
			g.drawString(Message.credits5, creditsX, creditsY + creditsSpacing * 5);
			g.drawString(Message.credits6, creditsX, creditsY + creditsSpacing * 6);
			g.drawString(Message.credits7, creditsX, creditsY + creditsSpacing * 7);
			g.drawString(Message.credits8, creditsX, creditsY + creditsSpacing * 8);
			g.drawString(Message.credits9, creditsX, creditsY + creditsSpacing * 9);
			g.drawString(Message.credits10, creditsX, creditsY + creditsSpacing * 10);
			g.drawString(Message.credits12, creditsX, creditsY + creditsSpacing * 11);
			g.drawString(Message.credits13, creditsX, creditsY + creditsSpacing * 12);
			g.drawString(Message.credits14, creditsX, creditsY + creditsSpacing * 13);
			g.drawString(Message.credits15, creditsX, creditsY + creditsSpacing * 14);
			g.drawString(Message.credits16, creditsX, creditsY + creditsSpacing * 15);
			g.drawString(Message.credits17, creditsX, creditsY + creditsSpacing * 16);
			g.drawString(Message.credits18, creditsX, creditsY + creditsSpacing * 17);
			g.drawString(Message.credits19, creditsX, creditsY + creditsSpacing * 18);
			g.drawString(Message.credits20, creditsX, creditsY + creditsSpacing * 19);
			g.drawString(Message.credits21, creditsX, creditsY + creditsSpacing * 20);
			g.drawString(Message.credits22, creditsX, creditsY + creditsSpacing * 21);
			g.drawString(Message.credits23, creditsX, creditsY + creditsSpacing * 22);
			g.drawString(Message.credits24, creditsX, creditsY + creditsSpacing * 23);
			g.drawString(Message.credits25, creditsX, creditsY + creditsSpacing * 24);
			g.drawString(Message.credits26, creditsX, creditsY + creditsSpacing * 25);
			g.drawString(Message.credits27, creditsX, creditsY + creditsSpacing * 26);
			g.drawString(Message.credits28, creditsX, creditsY + creditsSpacing * 27);
			g.drawString(Message.credits29, creditsX, creditsY + creditsSpacing * 28);
			g.drawString(Message.credits30, creditsX, creditsY + creditsSpacing * 29);
			g.drawString(Message.credits31, creditsX, creditsY + creditsSpacing * 30);
			g.drawString(Message.credits32, creditsX, creditsY + creditsSpacing * 31);
			g.drawString(Message.credits33, creditsX, creditsY + creditsSpacing * 32);
			g.drawString(Message.credits34, creditsX, creditsY + creditsSpacing * 33);
			g.drawString(Message.credits35, creditsX, creditsY + creditsSpacing * 34);
			g.drawString(Message.credits36, creditsX, creditsY + creditsSpacing * 35);
			g.drawString(Message.credits37, creditsX, creditsY + creditsSpacing * 36);
			g.drawString(Message.credits38, creditsX, creditsY + creditsSpacing * 37);
			g.drawString(Message.credits39, creditsX, creditsY + creditsSpacing * 38);
			g.drawString(Message.credits40, creditsX, creditsY + creditsSpacing * 39);
			g.drawString(Message.credits41, creditsX, creditsY + creditsSpacing * 40);
			g.drawString(Message.credits42, creditsX, creditsY + creditsSpacing * 41);
			g.drawString(Message.credits43, creditsX, creditsY + creditsSpacing * 42);
			g.drawString(Message.credits44, creditsX, creditsY + creditsSpacing * 43);
			g.drawString(Message.credits45, creditsX, creditsY + creditsSpacing * 44);
			g.drawString(Message.credits46, creditsX, creditsY + creditsSpacing * 45);
			g.drawString(Message.credits47, creditsX, creditsY + creditsSpacing * 46);
			g.drawString(Message.credits48, creditsX, creditsY + creditsSpacing * 47);
			g.drawString(Message.credits49, creditsX, creditsY + creditsSpacing * 48);
			g.drawString(Message.credits50, creditsX, creditsY + creditsSpacing * 49);
			g.drawString(Message.credits51, creditsX, creditsY + creditsSpacing * 50);
			g.drawString(Message.credits52, creditsX, creditsY + creditsSpacing * 51);
			g.drawString(Message.credits53, creditsX, creditsY + creditsSpacing * 52);
			g.drawString(Message.credits54, creditsX, creditsY + creditsSpacing * 53);
			g.drawString(Message.credits55, creditsX, creditsY + creditsSpacing * 54);
			g.drawString(Message.credits56, creditsX, creditsY + creditsSpacing * 55);
			g.drawString(Message.credits57, creditsX, creditsY + creditsSpacing * 56);
			g.drawString(Message.credits58, creditsX, creditsY + creditsSpacing * 57);
			g.drawString(Message.credits59, creditsX, creditsY + creditsSpacing * 58);
			g.drawString(Message.credits60, creditsX, creditsY + creditsSpacing * 59);
			g.drawString(Message.credits61, creditsX, creditsY + creditsSpacing * 60);
			g.drawString(Message.credits62, creditsX, creditsY + creditsSpacing * 61);
			g.drawString(Message.credits63, creditsX, creditsY + creditsSpacing * 62);
			g.drawString(Message.credits64, creditsX, creditsY + creditsSpacing * 63);
			g.drawString(Message.credits65, creditsX, creditsY + creditsSpacing * 64);
			g.drawString(Message.credits66, creditsX, creditsY + creditsSpacing * 65);
			g.drawString(Message.credits67, creditsX, creditsY + creditsSpacing * 66);
			g.drawString(Message.credits68, creditsX, creditsY + creditsSpacing * 67);
			g.drawString(Message.credits69, creditsX, creditsY + creditsSpacing * 68);
			g.drawString(Message.credits70, creditsX, creditsY + creditsSpacing * 69);
			g.drawString(Message.credits71, creditsX, creditsY + creditsSpacing * 70);
			g.drawString(Message.credits72, creditsX, creditsY + creditsSpacing * 71);
			g.drawString(Message.credits73, creditsX, creditsY + creditsSpacing * 72);
			g.drawString(Message.credits74, creditsX, creditsY + creditsSpacing * 73);
			g.drawString(Message.credits75, creditsX, creditsY + creditsSpacing * 74);
		}
		
		// light hue fade
		if (World.lightFadeOn) {
			/** Draw white rectangle */
			g.setColor(new Color(redValue, greenValue, blueValue, opacity));
			g.fillRect(0, 0, getWidth(), getHeight());
			
			//System.out.println("fadingOut " + Animation.fadingOut + " fadingIn " + Animation.fadingIn + " faded " + Animation.faded);
		}

		// draw eyelids
		if (Animation.openingEyes || Animation.closingEyes || (!Player.meditating && Animation.eyesClosed)) {
			g.drawImage(eyelid1, 0, eyelid1Y, getWidth(), getHeight(), this);
			g.drawImage(eyelid2, 0, eyelid2Y, getWidth(), getHeight(), this);
		} 
		
		if (Player.visualizingFish) {
			if (Animation.movingSymbolIn || Animation.movingSymbolOut) {
				g.drawImage(symbolPFish, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolPFish, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			} else if (Animation.loweringSymbol) {
				g.drawImage(symbolPFish, 0, symbol1Y, Bunraku.width, Bunraku.height, this);
			} else {
				g.drawImage(symbolFish, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolFish, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			}
		}
		
		if (Player.visualizingLotus) {
			if (Animation.movingSymbolIn || Animation.movingSymbolOut) {
				g.drawImage(symbolPLotus, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolPLotus, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			} else if (Animation.loweringSymbol) {
				g.drawImage(symbolPLotus, 0, symbol1Y, Bunraku.width, Bunraku.height, this);
			} else {
				g.drawImage(symbolLotus, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolLotus, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			}
		}
		
		if (Player.visualizingKnot) {
			if (Animation.movingSymbolIn || Animation.movingSymbolOut) {
				g.drawImage(symbolPKnot, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolPKnot, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			} else if (Animation.loweringSymbol) {
				g.drawImage(symbolPKnot, 0, symbol1Y, Bunraku.width, Bunraku.height, this);
			} else {
				g.drawImage(symbolKnot, symbol1X, 0, Bunraku.width, Bunraku.height, this);
				g.drawImage(symbolKnot, symbol2X, 0, Bunraku.width, Bunraku.height, this);
			}
		}
		
		// draw chant
		if (Animation.displayingOm)
			g.drawImage(medsymOm, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingNi)
			g.drawImage(medsymNi, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingGo)
			g.drawImage(medsymGo, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingYu)
			g.drawImage(medsymYu, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingJi)
			g.drawImage(medsymJi, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingRa)
			g.drawImage(medsymRa, 0, 0, Bunraku.width, Bunraku.height, this);
		
		if (Animation.displayingShi)
			g.drawImage(medsymShi, 0, 0, Bunraku.width, Bunraku.height, this);
		
		// draw chant overlay
		if (Animation.chantFadingIn || Animation.chantFadingOut) {
			/** Draw black rectangle */
			g.setColor(new Color(0, 0, 0, opacity));
			g.fillRect(0, 264, 164, Bunraku.height - 264);
		}
		
		// draw message scroll
		if (!Player.inTrance) {
			g.drawImage(getImageMessage(), imageMessageX, imageMessageY, getWidth(), getHeight(), this);	
		}
		
		// Draw cyclingItem
		if (Animation.cyclingInventoryInLeft 
		|| Animation.cyclingInventoryOutLeft 
		|| Animation.cyclingInventoryInRight 
		|| Animation.cyclingInventoryOutRight 
		|| Animation.cyclingInventoryCenter) {
			switch (Player.inventoryList.get(0)) {
				case "rod":
					g.drawImage(itemRod, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "corn":
					g.drawImage(itemCorn, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "gun":
					g.drawImage(itemPistol, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "paper":
					if (World.dark) {
						g.drawImage(itemGPaperd, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					} else {
						g.drawImage(itemGPaperl, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					}
					break;
				case "om":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "ni":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "go":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "yu":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "ji":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "ra":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				case "shi":
					g.drawImage(itemScroll, cyclingItemX, cyclingItemY, cyclingItemWidth, cyclingItemHeight, this);
					break;
				default:
					System.out.println("draw cyclingItem error");
					break;
			}
			
			if (Player.inventoryList.size() > 1)
				g.drawImage(invArrows, 0, 0, Bunraku.width, Bunraku.height, this);
			
			g.drawImage(invClose, 0, 0, Bunraku.width, Bunraku.height, this);
		}
		
		/** Draw message text */
		if (Message.displayingText) {
			if (Player.inTrance)
				g.setColor(new Color(255, 255, 255, 255));
			
			g.setFont(customFont); 
			g.drawString(Message.textLine1, textX, textLine1Y);
			g.drawString(Message.textLine2, textX, textLine2Y);
			g.drawString(Message.textLine3, textX, textLine3Y);
			g.drawString(Message.textLine4, textX, textLine4Y);
		}	
		
		/** Input drawings */
		if (Keyboard.typingInput) {
			//g.setColor(Color.BLUE);
			//g.fillRect(inputBoxX, inputBoxY, inputBoxWidth, inputBoxHeight);
			g.drawImage(inputScroll, inputScrollX, 0, Bunraku.width, Bunraku.height, this);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Monospaced", Font.PLAIN, keyboardInputTextSize)); 
			g.drawString(Keyboard.keyboardInputString, keyboardInputTextX, keyboardInputTextY);
			
			if (displayingInputUnderscore && !Animation.openingInputScroll)
				g.drawLine(inputUnderscoreX1, inputUnderscoreY1, inputUnderscoreX2, inputUnderscoreY2);
		}
	}
	
	private BufferedImage loadFractal(String fileName) { 
		BufferedImage img = new BufferedImage(Bunraku.width,Bunraku.height, BufferedImage.TYPE_INT_RGB);;
		
		try {
			img = ImageIO.read(new File(fileName));
		} catch(IOException e) {
			System.out.println("ImagePanel.loadFractal() exception");
		}
		
		return img;
	}
	
	private BufferedImage loadBlade(String fileName) { 
		BufferedImage img3 = new BufferedImage(Bunraku.width,Bunraku.height, BufferedImage.TYPE_INT_RGB);;
		
		try {
			img3 = ImageIO.read(new File(fileName));
		} catch(IOException e) {
			System.out.println("ImagePanel.loadBlade() exception");
		}
		
		return img3;
	}
	
	private Image getImage1() {
		switch (Player.position) {
			case "title":
				return title;
			case "loading":
				return loading;
			case "gameOver":
				return gameOver;
			case "g1n":
				return g1n;
			case "g1e":
				return g1e;
			case "g1s":
				return g1s;
			case "g1w":
				return g1w;
			case "g2n":
				return g2n;
			case "g2e":
				return g2e;
			case "g2s":
				return g2s;
			case "g2w":
				return g2w;
			case "g3n":
				return g3n;
			case "g3e":
				return g3e;
			case "g3s":
				return g3s;
			case "g3w":
				return g3w;
			case "g4e":
				return g4e;
			case "g4w":
				return g4w;
			case "g5s":
				return g5s;
			case "g5w":
				return g5w;
			case "g5n":
				return g5n;
			case "g5e":
				return g5e;
			case "g6w":
				return g6w;
			case "g6n":
				return g6n;
			case "g6e":
				return g6e;
			case "g7w":
				return g7w;
			case "g7n":
				return g7n;
			case "g7e":
				return g7e;
			case "g7s":
				return g7s;
			case "g8w":
				return g8w;
			case "g8e":
				return g8e;
			case "g9s":
				if (World.g9DoorOpen) {
					if (World.purpleAlive) {
						return g9sOpenStart;
					} else {
						return g9sOpenEnd;
					}
				} else {
					if (World.OOO)
						return g9sOOO;
					if (World.OOX && !World.g9DoorOpen)
						return g9sOOX;
					if (World.OXO)
						return g9sOXO;
					if (World.OXX)
						return g9sOXX;
				}
			case "g9w":
				return g9w;
			case "g9n":
				return g9n;
			case "g9e":
				return g9e;
			case "g9rs":
				if (World.purpleAlive) {
					return g9rsShrineStart;
				} else {
					return g9rsShrineEnd;
				}
			case "gTV":
				return gtapeBackdrop;
			case "gTVControls":
				return g_tvClose;
			case "g9rw":
				if (!World.satchelOpen) {
					return g9rwClosed;
				} else if (!Player.holdingDoll) {
					return g9rwOpenDoll;
				} else {
					return g9rwOpenEmpty;
				}
			case "g9rn":
				if (World.OOO)
					return g9rnOOO;
				if (World.OOX)
					return g9rnOOX;
				if (World.OXO)
					return g9rnOXO;
				if (World.OXX)
					return g9rnOXX;
			case "g9re":
				if (World.open) {
					return g9reOpen;
				} else if (World.OOX) {
					return g9reOOX;
				} else if (World.OXO) {
					return g9reOXO;
				} else if (World.OXX) {
					return g9reOXX;
				} else if (World.OOO) {
					return g9reOOO;
				} else {
					return null;
				}
			case "g10s":
				return g10s;
			case "g10w":
				if (Player.dreaming) {
					return g10wDream;
				} else {
					return g10w;
				}
			case "g10n":
				return g10n;
			case "g10e":
				return g10e;
			case "g11e":
				return g11e;
			case "g11w":
				if (Player.dreaming) {
					return g11wDream;
				} else {
					return g11w;
				}
			case "g12s":
				return g12s;
			case "g12w":
				if (Player.dreaming) {
					return g12wDream;
				} else {
					return g12w;
				}
			case "g12n":
				return g12n;
			case "g12e":
				return g12e;
			case "g13s":
				return g13s;
			case "g13w":
				return g13w;
			case "g13n":
				return g13n;
			case "g13e":
				return g13e;
			case "g14s":
				return g14s;
			case "g14w":
				return g14w;
			case "g14n":
				return g14n;
			case "g14e":
				return g14e;
			case "g14se":
				return g14se;
			case "g15s":
				return g15s;
			case "g15w":
				return g15w;
			case "g15n":
				if (Player.dreaming) {
					return g15nDream;
				} else {
					return g15n;
				}
			case "g15e":
				return g15e;
			case "g16s":
				return g16s;
			case "g16w":
				return g16w;
			case "g16n":
				return g16n;
			case "g16e":
				return g16e;
			case "g17s":
				return g17s;
			case "g17w":
				if (World.OOO)
					return g17wOOO;
				if (World.OOX)
					return g17wOOX;
				if (World.OXO)
					return g17wOXO;
				if (World.OXX)
					return g17wOXX;
			case "g17n":
				return g17n;
			case "g17e":
				return g17e;
			case "g18s":
				return g18s;
			case "g18n":
				return g18n;
			case "g18e":
				return g18e;
			case "g18w":	
				if (World.OOO)
					return g18wOOO;
				if (World.OOX && !World.open)
					return g18wOOX;
				if (World.OXO)
					return g18wOXO;
				if (World.OXX)
					return g18wOXX;
				if (World.open)
					return g18wOpen;
			case "g19s":
				return g19s;
			case "g19w":
				return g19w;
			case "g19n":
				return g19n;
			case "g19e":
				return g19e;
			case "g20s":
				return g20s;
			case "g20w":
				return g20w;
			case "g20n":
				return g20n;
			case "g20e":
				return g20e;
			case "g21s":
				return g21s;
			case "g21w":
				return g21w;
			case "g21n":
				return g21n;
			case "g21e":
				return g21e;
			case "g21sw":
				return g21sw;
			case "g22s":
				return g22s;
			case "g22w":
				return g22w;
			case "g22n":
				return g22n;
			case "g22e":
				return g22e;
			case "g23s":
				return g23s;
			case "g23n":
				return g23n;
			case "g23e":
				return g23e;
			case "g24w":
				return g24w;
			case "g24e":
				return g24e;
			case "g24n":
				return g24n;
			case "g24s":
				return g24s;
			case "g25s":
				return g25s;
			case "g25w":
				return g25w;
			case "g25n":
				return g25n;
			case "g25e":
				return g25e;
			case "g26s":
				return g26s;
			case "g26w":
				return g26w;
			case "g26n":
				return g26n;
			case "g26e":
				return g26e;
			case "g27s":
				return g27s;
			case "g27w":
				return g27w;
			case "g27n":
				return g27n;
			case "g27e":
				return g27e;
			case "g28s":
				return g28s;
			case "g28w":
				return g28w;
			case "g28n":
				return g28n;
			case "g29s":
				return g29s;
			case "g29w":
				return g29w;
			case "g29n":
				return g29n;
			case "g30s":
				return g30s;
			case "g30w":
				return g30w;
			case "g30n":
				return g30n;
			case "g30e":
				return g30e;
			case "g31s":
				return g31s;
			case "g31w":
				return g31w;
			case "g31n":
				return g31n;
			case "g31e":
				return g31e;
			case "g32s":
				return g32s;
			case "g32w":
				return g32w;
			case "g32n":
				return g32n;
			case "g32e":
				return g32e;
			case "g33s":
				return g33s;
			case "g33w":
				return g33w;
			case "g33n":
				return g33n;
			case "g33e":
				return g33e;
			case "g34s":
				return g34s;
			case "g34w":
				return g34w;
			case "g34n":
				return g34n;
			case "g34e":
				return g34e;
			case "g35s":
				return g35s;
			case "g35w":
				return g35w;
			case "g35n":
				return g35n;
			case "g35e":
				return g35e;
			case "g36s":
				return g36s;
			case "g36w":
				return g36w;
			case "g36n":
				return g36n;
			case "g36e":
				return g36e;
			case "g37s":
				return g37s;
			case "g37w":
				return g37w;
			case "g37n":
				return g37n;
			case "g37e":
				return g37e;	
			case "h1n":
				return h1nOpen2;
			case "h1e":
				return h1e;
			case "h1s":
				return h1s;
			case "h1w":
				return h1w;
			case "h2n":
				return h2n;
			case "h2e":
				return h2e;
			case "h2s":
				return h2s;
			case "h2sw":
				return h2sw;
			case "h2w":
				return h2w;
			case "h3n":
				return h3n;
			case "h3e":
				return h3e;
			case "h3s":
				return h3s;
			case "h3w":
				return h3w;
			case "h4s":
				return h4s;
			case "h4n":
				return h4n;
			case "h5s":
				return h5s;
			case "h5w":
				return h5w;
			case "h5n":
				return h5n;
			case "h5e":
				return h5e;
			case "h6s":
				return h6s;
			case "h6w":
				return h6w;
			case "h6n":
				return h6n;
			case "h6e":
				return h6e;
			case "h7s":
				return h7s;
			case "h7w":
				return h7w;
			case "h7n":
				return h7n;
			case "h7e":
				return h7e;
			case "h8s":
				return h8s;
			case "h8w":
				return h8w;
			case "h8n":
				return h8n;
			case "h8e":
				return h8e;
			case "h9s":
				return h9s;
			case "h9w":
				return h9w;
			case "h9e":
				return h9e;
			case "h10s":
				return h10s;
			case "h10w":
				return h10w;
			case "h10e":
				return h10e;
			case "h11s":
				if (World.OOO) 
					return h11sOOO;
				
				if (World.OOX) 
					return h11sOOX;
				
				if (World.XOX) 
					return h11sXOX;

				if (World.open && World.XOO) 
					return h11sOpen;
				
				if (!World.open && World.XOO) 
					return h11sXOO;

				
			case "h11sRoom":
				return h11sRoom;
			case "h11w":
				return h11w;
			case "h11n":
				return h11n;
			case "h11e":
				return h11e;
			case "h12s":
				return h12s;
			case "h12w":
				return h12w;
			case "h12n":
				return h12n;
			case "h12e":
				return h12e;
			case "h13s":
				return h13s;
			case "h13w":
				return h13w;
			case "h13n":
				return h13n;
			case "h13e":
				return h13e;
			case "h14s":
				return h14s;
			case "h14w":
				return h14w;
			case "h14n":
				return h14nBack;
			case "h14e":
				return h14e;
			case "h15w":
				return h15w;
			case "h15n":
				return h15n;
			case "h15e":
				return h15e;
			case "h16w":
				return h16w;
			case "h16n":
				return h16n;
			case "h16e":
				return h16e;
			case "h16s":
				if (Player.hasRod) {
					return h16sFpoleInv;
				} else {
					return h16sFpoleWall;
				}
			case "h17s":
				if (Player.hasRod) {
					return h17sFpoleInv;
				} else {
					return h17sFpoleWall;
				}
			case "h17w":
				return h17w;
			case "h17n":
				if (World.OOO)
					return h17nOOO;
				if (World.OOX)
					return h17nOOX;
				if (World.XOX && !World.open)
					return h17nXOX;
				if (World.XOO)
					return h17nXOO;
				if (World.open)
					return h17nOpen;
			case "h17e":
				return h17e;
			case "h18s":
				if (!Player.holdingRedBook && !Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sFpoleInv;
				} else if (Player.holdingRedBook && !Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sTakeRed;
				} else if (!Player.holdingRedBook && Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sTakeBlue;
				} else if (!Player.holdingRedBook && !Player.holdingBlueBook && Player.holdingBlackBook) {
					return h18sTakeBlack;
				} else {
					return null;
				}
			case "h18w":
				return h18w;
			case "h18n":
				return h18n;
			case "h18e":
				if (World.orangeAlive) {
					return h18eOnStart;
				} else {
					return h18eOnEnd;
				}
			case "hTV":
				return htapel1base;
			case "hTVControls":
				return h_tvClose;
			case "hr1n":
				return hr1n;
			case "hr1e":
				return hr1e;
			case "hr1s":
				return hr1s;
			case "hr1w":
				return hr1w;
			case "hr2n":
				return hr2n;
			case "hr2e":
				return hr2e;
			case "hr2s":
				return hr2s;
			case "hr2w":
				return hr2w;
			case "hr3n":
				return hr3n;
			case "hr3e":
				return hr3e;
			case "hr3s":
				return hr3s;
			case "hr3w":
				return hr3w;
			case "hr4n":
				return hr4n;
			case "hr4s":
				return hr4s;
			case "hrTV":
				if (!World.hrTVOn) {
					return hrTVOff;
				} else {
					return hrTVBackdrop;
				}
			case "hrTVControls":
				return hrTVclose;
			case "hr4e":
				return hr4e;
			case "hr4w":
				return hr4w;
			case "t1n":
				return t1n;
			case "t1e":
				return t1e;
			case "t1s":
				return t1s;
			case "t1w":
				return t1w;
			case "t2n":
				return t2n;
			case "t2e":
				return t2e;
			case "t2s":
				return t2s;
			case "t2w":
				return t2w;
			case "t3n":
				return t3n;
			case "t3e":
				return t3e;
			case "t3s":
				return t3s;
			case "t3w":
				return t3w;
			case "t4e":
				return t4e;
			case "t4w":
				return t4w;
			case "t4n":
				return t4n;
			case "t4s":
				return t4s;
			case "t5s":
				return t5s;
			case "t5w":
				return t5w;
			case "t5n":
				return t5nBox;
			case "t5e":
				return t5e;
			case "t6s":
				return t6s;
			case "t6w":
				return t6w;
			case "t6n":
				return t6n;
			case "t6e":
				return t6e;
			case "t7w":
				return t7w;
			case "t7n":
				return t7n;
			case "t7n shrine":
				return t7nShrine;
			case "t7e":
				return t7e;
			case "t7se":
				return t7se;
			case "t8w":
				return t8w;
			case "t8n":
				return t8n;
			case "t8se":
				return t8se;
			case "t8e":
				return t8e;
			case "t8sw":
				return t8sw;
			case "t9s":
				return t9s;
			case "t9w":
				return t9w;
			case "t9n":
				return t9n;
			case "t9n shop":
				return t9nShop;
			case "t9e":
				return t9e;
			case "t10e":
				return t10e;
			case "t10ne":
				return t10ne;
			case "t10nw":
				return t10nw;
			case "t10se":
				return t10se;
			case "t11w":
				return t11w;
			case "t11ne":
				return t11ne;
			case "t11nw":
				return t11nw;
			case "t11sw":
				return t11sw;
			case "t11se":
				return t11se;
			case "t12s":
				return t12s;
			case "t12n":
				return t12n;
			case "t12nw":
				return t12nw;
			case "t12ne":
				return t12ne;
			case "t12e":
				return t12e;
			case "t13s":
				return t13s;
			case "t13w":
				return t13w;
			case "t13n":
				return t13n;
			case "t13e":
				return t13e;
			case "t13ne":
				return t13ne;
			case "t14s":
				return t14s;
			case "t14w":
				return t14w;
			case "t14n":
				return t14n;
			case "t14e":
				return t14e;
			case "t15s":
				return t15s;
			case "t15w":
				return t15w;
			case "t15n":
				return t15n;
			case "t15e":
				return t15e;
			case "t16s":
				return t16s;
			case "t16w":
				return t16w;
			case "t16n":
				return t16n;
			case "t16e":
				return t16e;
			case "t17s":
				return t17s;
			case "t17w":
				return t17w;
			case "t17n":
				return t17n;
			case "t17e":
				return t17e;
			case "t18s":
				return t18s;
			case "t18w":
				return t18w;
			case "t18n":
				return t18n;
			case "t18e":
				return t18e;
			case "t19s":
				return t19s;
			case "t19w":
				return t19w;
			case "t19n":
				return t19n;
			case "t19e":
				return t19e;
			case "t20s":
				return t20s;
			case "t20w":
				return t20w;
			case "t20n":
				return t20n;
			case "t20e":
				return t20e;
			case "t21s":
				return t21s;
			case "t21w":
				return t21w;
			case "t21n":
				return t21n;
			case "t21e":
				return t21e;
			case "t22s":
				return t22s;
			case "t22w":
				return t22w;
			case "t22n":
				return t22n;
			case "t22e":
				return t22e;
			case "t23s":
				return t23s;
			case "t23w":
				if (World.OOO)
					return t23wOOO;
				if (World.OXO)
					return t23wOXO;
				if (World.XOO)
					return t23wXOO;
				if (World.XXO)
					return t23wXXO;
			case "t23n":
				return t23n;
			case "t23e":
				return t23e;
			case "t24s":
				return t24s;
			case "t24n":
				return t24n;
			case "t25s":
				return t25s;
			case "t25w":
				return t25w;
			case "t25ww":
				return t25ww;
			case "t25n":
				return t25n;
			case "t25e":
				return t25e;
			case "t26s":
				return t26s;
			case "t26w":
				return t26w;
			case "t26n":
				return t26n;
			case "t26e":
				return t26e;
			case "t27s":
				return t27s;
			case "t27n":
				return t27n;
			case "t28s":
				return t28s;
			case "t28w":
				return t28w;
			case "t28n":
				return t28n;
			case "t28e":
				return t28e;
			case "t29s":
				return t29s;
			case "t29n":
				return t29n;
			case "t30s":
				return t30s;
			case "t30w":
				return t30w;
			case "t30n":
				return t30n;
			case "t30e":
				return t30e;
			case "t31s":
				return t31s;
			case "t31n":
				return t31n;
			case "t32s":
				return t32s;
			case "t32n":
				return t32n;
			case "t33s":
				return t33s;
			case "t33n":
				return t33n;
			case "t34s":
				return t34s;
			case "t34n":
				return t34n;
			case "t35s":
				return t35s;
			case "t35n":
				return t35n;
			case "t36s":
				return t36s;
			case "t36n":
				return t36n;
			case "t37s":
				return t37s;
			case "t37n":
				return t37n;
			case "t38s":
				return t38s;
			case "t38n":
				return t38n;
			case "t39s":
				return t39s;
			case "t39n":
				return t39n;
			case "t40s":
				return t40s;
			case "t40w":
				return t40w;
			case "t40n":
				return t40n;
			case "t40e":
				return t40e;
			case "t41s":
				return t41s;
			case "t41n":
				return t41n;
			case "t42s":
				return t42s;
			case "t42n":
				return t42n;
			case "t43s":
				return t43s;
			case "t43n":
				return t43n;
			case "t44s":
				return t44s;
			case "t44n":
				return t44n;
			case "t45s":
				return t45s;
			case "t45n":
				return t45n;
			case "t46s":
				return t46s;
			case "t46w":
				return t46w;
			case "t46n":
				return t46n;
			case "t46e":
				return t46e;
			case "t47s":
				return t47s;
			case "t47w":
				return t47w;
			case "t47n":
				return t47n;
			case "t47e":
				return t47e;
			case "t48s":
				return t48s;
			case "t48w":
				return t48w;
			case "t48n":
				return t48n;
			case "t48e":
				if (World.greenAlive) {
					return t48eOnStart;
				} else {
					return t48eOnEnd;
				}
			case "tTV":
				if (Animation.displayingTVCRbleed1) {
					return TVCRbleed1;
				} else if (Animation.displayingTVCRbleed2) {
					return TVCRbleed2;
				} else if (Animation.displayingTVCRbase) {
					return TVCRbase;
				} else {
					return null;
				}
			case "tTVControls":
				return t_tvClose;
			case "tod":
				return t23wTJbackdrop;
			default:
				return null;
		}
	}	
	
	private Image getOutgoingImage1() {
		switch (Player.oldPosition) {
			case "title":
				return title;
			case "g1n":
				return g1n;
			case "g1e":
				return g1e;
			case "g1s":
				return g1s;
			case "g1w":
				return g1w;
			case "g2n":
				return g2n;
			case "g2e":
				return g2e;
			case "g2s":
				return g2s;
			case "g2w":
				return g2w;
			case "g3n":
				return g3n;
			case "g3e":
				return g3e;
			case "g3s":
				return g3s;
			case "g3w":
				return g3w;
			case "g4e":
				return g4e;
			case "g4w":
				return g4w;
			case "g5s":
				return g5s;
			case "g5w":
				return g5w;
			case "g5n":
				return g5n;
			case "g5e":
				return g5e;
			case "g6w":
				return g6w;
			case "g6n":
				return g6n;
			case "g6e":
				return g6e;
			case "g7w":
				return g7w;
			case "g7n":
				return g7n;
			case "g7e":
				return g7e;
			case "g7s":
				return g7s;
			case "g8w":
				return g8w;
			case "g8e":
				return g8e;
			case "g9s":
				if (World.g9DoorOpen) {
					if (World.purpleAlive) {
						return g9sOpenStart;
					} else {
						return g9sOpenEnd;
					}
				} else {
					if (World.OOO)
						return g9sOOO;
					if (World.OOX && !World.g9DoorOpen)
						return g9sOOX;
					if (World.OXO)
						return g9sOXO;
					if (World.OXX)
						return g9sOXX;
				}
			case "g9w":
				return g9w;
			case "g9n":
				return g9n;
			case "g9e":
				return g9e;
			case "g9rs":
				if (World.purpleAlive) {
					return g9rsShrineStart;
				} else {
					return g9rsShrineEnd;
				}
			case "g9rw":
				if (!World.open) {
					return g9rwClosed;
				} else if (!Player.holdingDoll) {
					return g9rwOpenDoll;
				} else {
					return g9rwOpenEmpty;
				}
			case "g9rn":
				if (World.OOO)
					return g9rnOOO;
				if (World.OOX)
					return g9rnOOX;
				if (World.OXO)
					return g9rnOXO;
				if (World.OXX)
					return g9rnOXX;
			case "g9re":
				if (World.OOO) {
					return g9reOOO;
				} else if (World.OOX) {
					return g9reOOX;
				} else if (World.OXO) {
					return g9reOXO;
				} else if (World.OXX) {
					return g9reOXX;
				} else if (World.open) {
					return g9reOpen;
				} else {
					return null;
				}
			case "g10s":
				return g10s;
			case "g10w":
				if (Player.dreaming) {
					return g10wDream;
				} else {
					return g10w;
				}
			case "g10n":
				return g10n;
			case "g10e":
				return g10e;
			case "g11e":
				return g11e;
			case "g11w":
				if (Player.dreaming) {
					return g11wDream;
				} else {
					return g11w;
				}
			case "g12s":
				return g12s;
			case "g12w":
				if (Player.dreaming) {
					return g12wDream;
				} else {
					return g12w;
				}
			case "g12n":
				return g12n;
			case "g12e":
				return g12e;
			case "g13s":
				return g13s;
			case "g13w":
				return g13w;
			case "g13n":
				return g13n;
			case "g13e":
				return g13e;
			case "g14s":
				return g14s;
			case "g14w":
				return g14w;
			case "g14n":
				return g14n;
			case "g14e":
				return g14e;
			case "g14se":
				return g14se;
			case "g15s":
				return g15s;
			case "g15w":
				return g15w;
			case "g15n":
				if (Player.dreaming) {
					return g15nDream;
				} else {
					return g15n;
				}
			case "g15e":
				return g15e;
			case "g16s":
				return g16s;
			case "g16w":
				return g16w;
			case "g16n":
				return g16n;
			case "g16e":
				return g16e;
			case "g17s":
				return g17s;
			case "g17w":
				if (World.OOO)
					return g17wOOO;
				if (World.OOX)
					return g17wOOX;
				if (World.OXO)
					return g17wOXO;
				if (World.OXX)
					return g17wOXX;
			case "g17n":
				return g17n;
			case "g17e":
				return g17e;
			case "g18s":
				return g18s;
			case "g18n":
				return g18n;
			case "g18e":
				return g18e;
			case "g18w":	
				if (World.OOO)
					return g18wOOO;
				if (World.OOX && !World.open)
					return g18wOOX;
				if (World.OXO)
					return g18wOXO;
				if (World.OXX)
					return g18wOXX;
				if (World.open)
					return g18wOpen;
			case "g19s":
				return g19s;
			case "g19w":
				return g19w;
			case "g19n":
				return g19n;
			case "g19e":
				return g19e;
			case "g20s":
				return g20s;
			case "g20w":
				return g20w;
			case "g20n":
				return g20n;
			case "g20e":
				return g20e;
			case "g21s":
				return g21s;
			case "g21w":
				return g21w;
			case "g21n":
				return g21n;
			case "g21e":
				return g21e;
			case "g21sw":
				return g21sw;
			case "g22s":
				return g22s;
			case "g22w":
				return g22w;
			case "g22n":
				return g22n;
			case "g22e":
				return g22e;
			case "g23s":
				return g23s;
			case "g23n":
				return g23n;
			case "g23e":
				return g23e;
			case "g24w":
				return g24w;
			case "g24e":
				return g24e;
			case "g24n":
				return g24n;
			case "g24s":
				return g24s;
			case "g25s":
				return g25s;
			case "g25w":
				return g25w;
			case "g25n":
				return g25n;
			case "g25e":
				return g25e;
			case "g26s":
				return g26s;
			case "g26w":
				return g26w;
			case "g26n":
				return g26n;
			case "g26e":
				return g26e;
			case "g27s":
				return g27s;
			case "g27w":
				return g27w;
			case "g27n":
				return g27n;
			case "g27e":
				return g27e;
			case "g28s":
				return g28s;
			case "g28w":
				return g28w;
			case "g28n":
				return g28n;
			case "g29s":
				return g29s;
			case "g29w":
				return g29w;
			case "g29n":
				return g29n;
			case "g30s":
				return g30s;
			case "g30w":
				return g30w;
			case "g30n":
				return g30n;
			case "g30e":
				return g30e;
			case "g31s":
				return g31s;
			case "g31w":
				return g31w;
			case "g31n":
				return g31n;
			case "g31e":
				return g31e;
			case "g32s":
				return g32s;
			case "g32w":
				return g32w;
			case "g32n":
				return g32n;
			case "g32e":
				return g32e;
			case "g33s":
				return g33s;
			case "g33w":
				return g33w;
			case "g33n":
				return g33n;
			case "g33e":
				return g33e;
			case "g34s":
				return g34s;
			case "g34w":
				return g34w;
			case "g34n":
				return g34n;
			case "g34e":
				return g34e;
			case "g35s":
				return g35s;
			case "g35w":
				return g35w;
			case "g35n":
				return g35n;
			case "g35e":
				return g35e;
			case "g36s":
				return g36s;
			case "g36w":
				return g36w;
			case "g36n":
				return g36n;
			case "g36e":
				return g36e;
			case "g37s":
				return g37s;
			case "g37w":
				return g37w;
			case "g37n":
				return g37n;
			case "g37e":
				return g37e;	
			case "h1n":
				return h1nOpen2;
			case "h1e":
				return h1e;
			case "h1s":
				return h1s;
			case "h1w":
				return h1w;
			case "h2n":
				return h2n;
			case "h2e":
				return h2e;
			case "h2s":
				return h2s;
			case "h2sw":
				return h2sw;
			case "h2w":
				return h2w;
			case "h3n":
				return h3n;
			case "h3e":
				return h3e;
			case "h3s":
				return h3s;
			case "h3w":
				return h3w;
			case "h4s":
				return h4s;
			case "h4n":
				return h4n;
			case "h5s":
				return h5s;
			case "h5w":
				return h5w;
			case "h5n":
				return h5n;
			case "h5e":
				return h5e;
			case "h6s":
				return h6s;
			case "h6w":
				return h6w;
			case "h6n":
				return h6n;
			case "h6e":
				return h6e;
			case "h7s":
				return h7s;
			case "h7w":
				return h7w;
			case "h7n":
				return h7n;
			case "h7e":
				return h7e;
			case "h8s":
				return h8s;
			case "h8w":
				return h8w;
			case "h8n":
				return h8n;
			case "h8e":
				return h8e;
			case "h9s":
				return h9s;
			case "h9w":
				return h9w;
			case "h9e":
				return h9e;
			case "h10s":
				return h10s;
			case "h10w":
				return h10w;
			case "h10e":
				return h10e;
			case "h11s":
				if (World.OOO) 
					return h11sOOO;
				
				if (World.OOX) 
					return h11sOOX;
				
				if (World.XOX) 
					return h11sXOX;

				if (World.open && World.XOO) 
					return h11sOpen;
				
				if (!World.open && World.XOO) 
					return h11sXOO;

				
			case "h11sRoom":
				return h11sRoom;
			case "h11w":
				return h11w;
			case "h11n":
				return h11n;
			case "h11e":
				return h11e;
			case "h12s":
				return h12s;
			case "h12w":
				return h12w;
			case "h12n":
				return h12n;
			case "h12e":
				return h12e;
			case "h13s":
				return h13s;
			case "h13w":
				return h13w;
			case "h13n":
				return h13n;
			case "h13e":
				return h13e;
			case "h14s":
				return h14s;
			case "h14w":
				return h14w;
			case "h14n":
				return h14nBack;
			case "h14e":
				return h14e;
			case "h15w":
				return h15w;
			case "h15n":
				return h15n;
			case "h15e":
				return h15e;
			case "h16w":
				return h16w;
			case "h16n":
				return h16n;
			case "h16e":
				return h16e;
			case "h16s":
				if (Player.hasRod) {
					return h16sFpoleInv;
				} else {
					return h16sFpoleWall;
				}
			case "h17s":
				if (Player.hasRod) {
					return h17sFpoleInv;
				} else {
					return h17sFpoleWall;
				}
			case "h17w":
				return h17w;
			case "h17n":
				if (World.OOO)
					return h17nOOO;
				if (World.OOX)
					return h17nOOX;
				if (World.XOX && !World.open)
					return h17nXOX;
				if (World.XOO)
					return h17nXOO;
				if (World.open)
					return h17nOpen;
			case "h17e":
				return h17e;
			case "h18s":
				if (!Player.holdingRedBook && !Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sFpoleInv;
				} else if (Player.holdingRedBook && !Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sTakeRed;
				} else if (!Player.holdingRedBook && Player.holdingBlueBook && !Player.holdingBlackBook) {
					return h18sTakeBlue;
				} else if (!Player.holdingRedBook && !Player.holdingBlueBook && Player.holdingBlackBook) {
					return h18sTakeBlack;
				} else {
					return null;
				}
			case "h18w":
				return h18w;
			case "h18n":
				return h18n;
			case "h18e":
				if (World.h18eOnStart) {
					return h18eOnStart;
				} else {
					return h18eOnEnd;
				}
			case "hr1n":
				return hr1n;
			case "hr1e":
				return hr1e;
			case "hr1s":
				return hr1s;
			case "hr1w":
				return hr1w;
			case "hr2n":
				return hr2n;
			case "hr2e":
				return hr2e;
			case "hr2s":
				return hr2s;
			case "hr2w":
				return hr2w;
			case "hr3n":
				return hr3n;
			case "hr3e":
				return hr3e;
			case "hr3s":
				return hr3s;
			case "hr3w":
				return hr3w;
			case "hr4n":
				return hr4n;
			case "hr4s":
				return hr4s;
			case "hrTV":
				if (!World.hrTVOn) {
					return hrTVOff;
				} else {
					return hrTVBackdrop;
				}
			case "hr4e":
				return hr4e;
			case "hr4w":
				return hr4w;
			case "t1n":
				return t1n;
			case "t1e":
				return t1e;
			case "t1s":
				return t1s;
			case "t1w":
				return t1w;
			case "t2n":
				return t2n;
			case "t2e":
				return t2e;
			case "t2s":
				return t2s;
			case "t2w":
				return t2w;
			case "t3n":
				return t3n;
			case "t3e":
				return t3e;
			case "t3s":
				return t3s;
			case "t3w":
				return t3w;
			case "t4e":
				return t4e;
			case "t4w":
				return t4w;
			case "t4n":
				return t4n;
			case "t4s":
				return t4s;
			case "t5s":
				return t5s;
			case "t5w":
				return t5w;
			case "t5n":
				return t5nBox;
			case "t5e":
				return t5e;
			case "t6s":
				return t6s;
			case "t6w":
				return t6w;
			case "t6n":
				return t6n;
			case "t6e":
				return t6e;
			case "t7w":
				return t7w;
			case "t7n":
				return t7n;
			case "t7n shrine":
				return t7nShrine;
			case "t7e":
				return t7e;
			case "t7se":
				return t7se;
			case "t8w":
				return t8w;
			case "t8n":
				return t8n;
			case "t8se":
				return t8se;
			case "t8e":
				return t8e;
			case "t8sw":
				return t8sw;
			case "t9s":
				return t9s;
			case "t9w":
				return t9w;
			case "t9n":
				return t9n;
			case "t9n shop":
				return t9nShop;
			case "t9e":
				return t9e;
			case "t10e":
				return t10e;
			case "t10ne":
				return t10ne;
			case "t10nw":
				return t10nw;
			case "t10se":
				return t10se;
			case "t11w":
				return t11w;
			case "t11ne":
				return t11ne;
			case "t11nw":
				return t11nw;
			case "t11sw":
				return t11sw;
			case "t11se":
				return t11se;
			case "t12s":
				return t12s;
			case "t12n":
				return t12n;
			case "t12nw":
				return t12nw;
			case "t12ne":
				return t12ne;
			case "t12e":
				return t12e;
			case "t13s":
				return t13s;
			case "t13w":
				return t13w;
			case "t13n":
				return t13n;
			case "t13e":
				return t13e;
			case "t13ne":
				return t13ne;
			case "t14s":
				return t14s;
			case "t14w":
				return t14w;
			case "t14n":
				return t14n;
			case "t14e":
				return t14e;
			case "t15s":
				return t15s;
			case "t15w":
				return t15w;
			case "t15n":
				return t15n;
			case "t15e":
				return t15e;
			case "t16s":
				return t16s;
			case "t16w":
				return t16w;
			case "t16n":
				return t16n;
			case "t16e":
				return t16e;
			case "t17s":
				return t17s;
			case "t17w":
				return t17w;
			case "t17n":
				return t17n;
			case "t17e":
				return t17e;
			case "t18s":
				return t18s;
			case "t18w":
				return t18w;
			case "t18n":
				return t18n;
			case "t18e":
				return t18e;
			case "t19s":
				return t19s;
			case "t19w":
				return t19w;
			case "t19n":
				return t19n;
			case "t19e":
				return t19e;
			case "t20s":
				return t20s;
			case "t20w":
				return t20w;
			case "t20n":
				return t20n;
			case "t20e":
				return t20e;
			case "t21s":
				return t21s;
			case "t21w":
				return t21w;
			case "t21n":
				return t21n;
			case "t21e":
				return t21e;
			case "t22s":
				return t22s;
			case "t22w":
				return t22w;
			case "t22n":
				return t22n;
			case "t22e":
				return t22e;
			case "t23s":
				return t23s;
			case "t23w":
				if (World.OOO)
					return t23wOOO;
				if (World.OXO)
					return t23wOXO;
				if (World.XOO)
					return t23wXOO;
				if (World.XXO)
					return t23wXXO;
			case "t23n":
				return t23n;
			case "t23e":
				return t23e;
			case "t24s":
				return t24s;
			case "t24n":
				return t24n;
			case "t25s":
				return t25s;
			case "t25w":
				return t25w;
			case "t25ww":
				return t25ww;
			case "t25n":
				return t25n;
			case "t25e":
				return t25e;
			case "t26s":
				return t26s;
			case "t26w":
				return t26w;
			case "t26n":
				return t26n;
			case "t26e":
				return t26e;
			case "t27s":
				return t27s;
			case "t27n":
				return t27n;
			case "t28s":
				return t28s;
			case "t28w":
				return t28w;
			case "t28n":
				return t28n;
			case "t28e":
				return t28e;
			case "t29s":
				return t29s;
			case "t29n":
				return t29n;
			case "t30s":
				return t30s;
			case "t30w":
				return t30w;
			case "t30n":
				return t30n;
			case "t30e":
				return t30e;
			case "t31s":
				return t31s;
			case "t31n":
				return t31n;
			case "t32s":
				return t32s;
			case "t32n":
				return t32n;
			case "t33s":
				return t33s;
			case "t33n":
				return t33n;
			case "t34s":
				return t34s;
			case "t34n":
				return t34n;
			case "t35s":
				return t35s;
			case "t35n":
				return t35n;
			case "t36s":
				return t36s;
			case "t36n":
				return t36n;
			case "t37s":
				return t37s;
			case "t37n":
				return t37n;
			case "t38s":
				return t38s;
			case "t38n":
				return t38n;
			case "t39s":
				return t39s;
			case "t39n":
				return t39n;
			case "t40s":
				return t40s;
			case "t40w":
				return t40w;
			case "t40n":
				return t40n;
			case "t40e":
				return t40e;
			case "t41s":
				return t41s;
			case "t41n":
				return t41n;
			case "t42s":
				return t42s;
			case "t42n":
				return t42n;
			case "t43s":
				return t43s;
			case "t43n":
				return t43n;
			case "t44s":
				return t44s;
			case "t44n":
				return t44n;
			case "t45s":
				return t45s;
			case "t45n":
				return t45n;
			case "t46s":
				return t46s;
			case "t46w":
				return t46w;
			case "t46n":
				return t46n;
			case "t46e":
				return t46e;
			case "t47s":
				return t47s;
			case "t47w":
				return t47w;
			case "t47n":
				return t47n;
			case "t47e":
				return t47e;
			case "t48s":
				return t48s;
			case "t48w":
				return t48w;
			case "t48n":
				return t48n;
			case "t48e":
				if (World.greenAlive) {
					return t48eOnStart;
				} else {
					return t48eOnEnd;
				}
			case "t48eTV":
				return null;
			case "tod":
				return t23wTJbackdrop;
			default:
				return null;
		}
	}	
	
	private Image getImage2() {
		switch (Player.position) {
			case "wakingUp":
				return eyelid1;
			case "g6n":
				if (!Player.holdingACBook) {
					return g6nBook;
				} else {
					switch (Item.bookPage) {
						case 0:
							return ac0; 
						case 1:
							return ac1; 
						case 2:
							return ac2; 
						case 3:
							return ac3; 
						case 4:
							return ac4; 
						case 5:
							return ac5; 
						case 6:
							return ac6; 
						case 7:
							return ac7; 
						case 8:
							return ac8; 
						case 9:
							return ac9; 
						case 10:
							return ac10; 
						case 11:
							return ac11; 
						case 12:
							return ac12; 
						case 13:
							return ac13; 
						case 14:
							return ac14; 
						case 15:
							return ac15; 
						case 16:
							return ac16;  
					}
				}
			case "g9s":
				return g9sSign;
			case "g9rn":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg9;
					if (World.OOX)
						return bulbOOXg9;
					if (World.OXO)
						return bulbOXOg9;
					if (World.OXX)
						return bulbOXXg9;
				} else {
					return null;
				}
			case "g9re":
				if (!Animation.openingSafe && !World.open) {
					return h17nHandleClosed;
				} else if (Animation.openingSafe && !World.open) {
					return h17nHandleOpen;
				} else if (World.open && !Player.hasJi) {
					return h17nScroll;
				} else {
					return null;
				}
			case "g9rw":
				if (Player.holdingDoll) {
					return g9rwExamineDoll;
				} else {
					return null;
				}
			case "gTV":
				if (Animation.displayingGTVreaperGun) {
					return gtapeReaper;
				} else if (Animation.displayingGTVreaperLeave) {
					return gtapeReaperLeave;
				} else {
					return null;
				}
			case "g18w":
				if (!Animation.openingSafe && !World.open) {
					return g18wHandleClosed;
				} else if (Animation.openingSafe && !World.open) {
					return g18wHandleOpen;
				} else if (World.open && !Player.hasOm) {
					return g18wScroll;
				} else {
					return null;
				}
			case "g27n":
				if (!Player.sawReaper1 && !Player.dreaming) {
					return g27nMonk;
				} else {
					return null;
				}
			case "g30e":
				if (Animation.reaper1WalkingLeft) {
					return g30eMonkFar;
				} else if (Animation.reaper1Approaching || World.reaper1Standing) {
					return g30eMonkClose;
				} else {
					return null;
				}
			case "g31w":
				if (Player.spokeToClan) {
					return g31wMonk;
				} else {
					return null;
				}
			case "g32w":
				if (Player.spokeToClan) {
					return g32wMonk;
				} else {
					return null;
				}
			case "h1n":
				return h1nDoor;
			case "h2w":
				if (Animation.displayingHReaper1) {
					return h2wReaper1;
				} else if (Animation.displayingHReaperUnarmed) {
					return h2wReaperUnarmed;
				} else {
					return null;
				}
			case "h8s":
				if (Player.holdingFish1) {
					return koi1;
				} else if (Player.holdingFish2) {
					return koi2;
				} else {
					return null;
				}
			case "hr2n":
				if (!Player.hasGoldPaper) {
					return hr2nPaper;
				} else {
					return null;
				}
			case "hrTV":
				if (World.hrTVOn) {
					return hrTVKiyoshi;
				} else {
					return null;
				}
			case "h11s":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh11;
					if (World.OOX)
						return bulbOOXh11;
					if (World.XOO)
						return bulbXOOh11;
					if (World.XOX)
						return bulbXOXh11;
				} else {
					return null;
				}
			case "h11sRoom":
				if (!Player.hasCorn) {
					return h11sRoomCorn;
				} else {
					return null;
				}
			case "h14n":
				if (!World.raDropped) {
					return h14nShelf;
				} else {
					return null;
				}
			case "h15n":
				if (Player.onPhone) {
					return h15nPhone;
				} else {
					return null;
				}
			case "h17n":
				if (!Animation.openingSafe && !World.open) {
					return h17nHandleClosed;
				} else if (Animation.openingSafe && !World.open) {
					return h17nHandleOpen;
				} else if (World.open && !Player.hasNi) {
					return h17nScroll;
				} else {
					return null;
				}
			case "h18s":
				if (!Player.hasRod) {
					return h18sFpoleWall;
				} else {
					return null;
				}
			case "hTV":
				if (Animation.displayingHTapeReaper1) {
					return htapel2reaper1;
				} else if (Animation.displayingHTapeReaper2) {
					return htapel2reaper2;
				} else {
					return null;
				}
			case "t1w":
				return paperCranesWest;
			case "t1e":
				if (World.displayingTReaper1) {
					return t1eReaper1;
				} else {
					return null;
				}
			case "t5n":
				if (!Player.hasGo) {
					return t5nScroll;
				} else {
					return null;
				}
			case "t6w":
				if (Player.examiningPaperSlip) {
					return t6wKimiPaper;
				} else {
					return null;
				}
			case "t9n shop":
				return t9nshopKeeper;
			case "t23w":
				if (Animation.todAppears)
					return t23wTodPeak;
				if (Animation.todWalking1)
					return t23wTodWalkEnter;
				if (Animation.todWalking2)
					return t23wEnter2;
				if (Animation.todContent)
					return t23wTodContent;
				if (Animation.todTalking1)
					return t23wTodTalk1;
				if (Animation.todThinking1)
					return t23wTodThink;
				if (Animation.todInviting)
					return t23wTodInvite;
			case "t25ww":
				if (Player.examiningT25WWSign) {
					return t25wwSign;
				} else {
					return null;
				}
			case "t48n":
				return t48nTassel;
			case "t48e":
				return t48eGate;
			case "tTV":
				if (Animation.displayingTVCRmonkFront) {
					return TVCRmonkFront;
				} else {
					return null;
				}
			case "tod":
				switch (World.todStatus) {
					case "confused":
						return todConfused;
					case "content":
						return todContent;
					case "entering":
						return todEnter;
					case "sipping1":
						return todSip1;
					case "sipping2":
						return todSip2;
					case "sipping3":
						return todSip3;
					case "sitting":
						return todSitting;
					case "talking":
						return todTalk;
					default:
						System.out.println("ImagePanel tod error");
						break;
				}
			default:
				return null;
		}
	}
	
	private Image getOutgoingImage2() {
		switch (Player.oldPosition) {
			case "wakingUp":
				return eyelid1;
			case "g6n":
				if (!Player.holdingACBook) {
					return g6nBook;
				} else {
					switch (Item.bookPage) {
						case 0:
							return ac0; 
						case 1:
							return ac1; 
						case 2:
							return ac2; 
						case 3:
							return ac3; 
						case 4:
							return ac4; 
						case 5:
							return ac5; 
						case 6:
							return ac6; 
						case 7:
							return ac7; 
						case 8:
							return ac8; 
						case 9:
							return ac9; 
						case 10:
							return ac10; 
						case 11:
							return ac11; 
						case 12:
							return ac12; 
						case 13:
							return ac13; 
						case 14:
							return ac14; 
						case 15:
							return ac15; 
						case 16:
							return ac16;  
					}
				}
			case "g9s":
				return g9sSign;
			case "g9re":
				return h17nHandleClosed;
			case "g9rn":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg9;
					if (World.OOX)
						return bulbOOXg9;
					if (World.OXO)
						return bulbOXOg9;
					if (World.OXX)
						return bulbOXXg9;
				} else {
					return null;
				}
			case "g9rw":
				if (Player.holdingDoll) {
					return g9rwExamineDoll;
				} else {
					return null;
				}
			case "g18w":
				if (!Animation.openingSafe && !World.open) {
					return g18wHandleClosed;
				} else if (Animation.openingSafe && !World.open) {
					return g18wHandleOpen;
				} else if (World.open && !Player.hasOm) {
					return g18wScroll;
				} else {
					return null;
				}
			case "g31w":
				if (Player.spokeToClan) {
					return g31wMonk;
				} else {
					return null;
				}
			case "g32w":
				if (Player.spokeToClan) {
					return g32wMonk;
				} else {
					return null;
				}
			case "h1n":
				return h1nDoor;
			case "hr2n":
				if (!Player.hasGoldPaper) {
					return hr2nPaper;
				} else {
					return null;
				}
			case "hrTV":
				if (World.hrTVOn) {
					return hrTVKiyoshi;
				} else {
					return null;
				}
			case "h11s":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh11;
					if (World.OOX)
						return bulbOOXh11;
					if (World.XOO)
						return bulbXOOh11;
					if (World.XOX)
						return bulbXOXh11;
				} else {
					return null;
				}
			case "h11sRoom":
				if (!Player.hasCorn) {
					return h11sRoomCorn;
				} else {
					return null;
				}
			case "h14n":
				if (!World.raDropped) {
					return h14nShelf;
				} else {
					return null;
				}
			case "h15n":
				if (Player.onPhone) {
					return h15nPhone;
				} else {
					return null;
				}
			case "h17n":
				if (!Animation.openingSafe && !World.open) {
					return h17nHandleClosed;
				} else if (Animation.openingSafe && !World.open) {
					return h17nHandleOpen;
				} else if (World.open && !Player.hasNi) {
					return h17nScroll;
				} else {
					return null;
				}
			case "h18s":
				if (!Player.hasRod) {
					return h18sFpoleWall;
				} else {
					return null;
				}
			case "t1w":
				return paperCranesWest;
			case "t5n":
				if (!Player.hasGo) {
					return t5nScroll;
				} else {
					return null;
				}
			case "t6w":
				if (Player.examiningPaperSlip) {
					return t6wKimiPaper;
				} else {
					return null;
				}
			case "t9n shop":
				return t9nshopKeeper;
			case "t23w":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOt23;
					if (World.OXO)
						return bulbOXOt23;
					if (World.XOO)
						return bulbXOOt23;
					if (World.XXO)
						return bulbXXOt23;
				} else {
					return null;
				}
			case "t25ww":
				if (Player.examiningT25WWSign) {
					return t25wwSign;
				} else {
					return null;
				}
			case "t48n":
				return t48nTassel;
			case "t48e":
				return t48eGate;
			case "tod":
				switch (World.todStatus) {
					case "confused":
						return todConfused;
					case "content":
						return todContent;
					case "entering":
						return todEnter;
					case "sipping1":
						return todSip1;
					case "sipping2":
						return todSip2;
					case "sipping3":
						return todSip3;
					case "sitting":
						return todSitting;
					case "talking":
						return todTalk;
					default:
						System.out.println("ImagePanel tod error");
						break;
				}
			default:
				return null;
		}
	}
	
	private Image getImage3() {
		switch (Player.position) {
			case "g9s":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg9;
					if (World.OOX)
						return bulbOOXg9;
					if (World.OXO)
						return bulbOXOg9;
					if (World.OXX)
						return bulbOXXg9;
				} else {
					return null;
				}
			case "gTV":
				if (Animation.displayingGTVmonkFront) {
					return gtapeFrontMonk;
				} else if (Animation.displayingGTVmonkRight) {
					return gtapeRightMonk;
				} else if (Animation.displayingGTVmonkBack) {
					return gtapeBackMonk;
				} else if (Animation.displayingGTVmonkDie) {
					return gtapeDieMonk;
				} else {
					return null;
				}
			case "g9re":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg18;
					if (World.OOX)
						return bulbOOXg18;
					if (World.OXO)
						return bulbOXOg18;
					if (World.OXX)
						return bulbOXXg18;
				} 
			case "g18w":
				if (!World.open & Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg9;
					if (World.OOX)
						return bulbOOXg9;
					if (World.OXO)
						return bulbOXOg9;
					if (World.OXX)
						return bulbOXXg9;
				} else {
					return null;
				}
			case "g27n":
				return g27nOverlap;
			case "g30e":
				if (Animation.reaper1WalkingLeft) {
					return g30eOverlay;
				} else if (Animation.reaper1Snatching) {
					return g30eMonkSnatch; 
				} else {
					return null;
				}
			case "h1n":
				if (World.OOO) {
					return h1nOOO;
				} else if (World.OOX) {
					return h1nOOXopen;
				} else if (World.XOO) {
					return h1nXOO;
				} else if (World.XOX) {
					return h1nXOX;
				} else {
					return null;
				}
			case "h2w":
				if (Animation.displayingHReaperSword) {
					return h2wSword;
				} else {
					return null;
				}
			case "h11sRoom":
				if (!Player.hasRa && World.raDropped && !Player.examiningRa) {
					return h11sRoomScroll;
				} else {
					return null;
				}
			case "h14n":
				if (!World.raDropped) {
					return h14nScroll;
				} else {
					return null;
				}
			case "h17n":
				if (!World.open & Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh17;
					if (World.OOX)
						return bulbOOXh17;
					if (World.XOO)
						return bulbXOOh17;
					if (World.XOX)
						return bulbXOXh17;
				} else {
					return null;
				}
			case "h18s":
				if (Player.holdingRedBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sRed0; 
						case 1:
							return h18sRed1; 
						case 2:
							return h18sRed2; 
						case 3:
							return h18sRed3; 
						case 4:
							return h18sRed4; 
						case 5:
							return h18sRed5; 
					}
				} else if (Player.holdingBlackBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sBlack0; 
						case 1:
							return h18sBlack1; 
						case 2:
							return h18sBlack2; 
						case 3:
							return h18sBlack3; 
						case 4:
							return h18sBlack4; 
						case 5:
							return h18sBlack5;
						case 6:
							return h18sBlack6;
						case 7:
							return h18sBlack7;		
					}
				} else if (Player.holdingBlueBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sBlue0; 
						case 1:
							return h18sBlue1; 
						case 2:
							return h18sBlue2; 
						case 3:
							return h18sBlue3; 
						case 4:
							return h18sBlue4; 
						case 5:
							return h18sBlue5;
						case 6:
							return h18sBlue6;	
					}
				} else {
					return null;
				}
			case "hrTV":
				if (World.hrTVOn) {
					return hrTVOverlay;
				} else {
					return null;
				}
			case "hTV":
				if (World.orangeAlive 
				&& !Animation.rewinding 
				&& !Animation.fastforwarding 
				&& !Animation.displayingHTapeMonk1) {
					return htapeStart;
				} else if (!World.orangeAlive && !Animation.rewinding && !Animation.fastforwarding && !Animation.displayingHTapeMonk1) {
					return htapeEnd;
				} else {
					return null;
				}
			case "t1e":
				if (World.displayingTReaper2) {
					return t1eReaper2;
				} else if (World.displayingTReaperShoot) {
					return t1eShoot;
				} else {
					return null;
				}
			case "t5n":
				return t5nPlank;
			case "t9n shop":
				return t9nShopOverlay;
			case "t23w":
				return t23wOverlay;
			case "t48e":
				return t48e;
			case "tTV":
				return TVCRoverhang;
			case "tod":
				return todTable;
			default:
				return null;
		}
	}
	
	private Image getOutgoingImage3() {
		switch (Player.oldPosition) {
			case "wakingUp":
				return eyelid2;
			case "g9re":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg18;
					if (World.OOX)
						return bulbOOXg18;
					if (World.OXO)
						return bulbOXOg18;
					if (World.OXX)
						return bulbOXXg18;
				} 
			case "g18w":
				if (!World.open & Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOg9;
					if (World.OOX)
						return bulbOOXg9;
					if (World.OXO)
						return bulbOXOg9;
					if (World.OXX)
						return bulbOXXg9;
				} else {
					return null;
				}
			case "g27n":
				return g27nOverlap;
			case "g30e":
				if (Animation.reaper1WalkingLeft) {
					return g30eOverlay;
				} else if (World.reaper1PulledGun) {
					return g30eMonkGun; 
				} else {
					return null;
				}
			case "h1n":
				if (World.OOO) {
					return h1nOOO;
				} else if (World.OOX) {
					return h1nOOXopen;
				} else if (World.XOO) {
					return h1nXOO;
				} else if (World.XOX) {
					return h1nXOX;
				} else {
					return null;
				}
			case "h11sRoom":
				if (!Player.hasRa && World.raDropped) {
					return h11sRoomScroll;
				} else {
					return null;
				}
			case "h14n":
				if (!World.raDropped) {
					return h14nScroll;
				} else {
					return null;
				}
			case "h17n":
				if (!World.open & Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh17;
					if (World.OOX)
						return bulbOOXh17;
					if (World.OXO)
						return bulbXOOh17;
					if (World.XOX)
						return bulbXOXh17;
				} else {
					return null;
				}
			case "h18s":
				if (Player.holdingRedBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sRed0; 
						case 1:
							return h18sRed1; 
						case 2:
							return h18sRed2; 
						case 3:
							return h18sRed3; 
						case 4:
							return h18sRed4; 
						case 5:
							return h18sRed5; 
					}
				} else if (Player.holdingBlackBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sBlack0; 
						case 1:
							return h18sBlack1; 
						case 2:
							return h18sBlack2; 
						case 3:
							return h18sBlack3; 
						case 4:
							return h18sBlack4; 
						case 5:
							return h18sBlack5;
						case 6:
							return h18sBlack6;
						case 7:
							return h18sBlack7;		
					}
				} else if (Player.holdingBlueBook) {
					switch (Item.bookPage) {
						case 0:
							return h18sBlue0; 
						case 1:
							return h18sBlue1; 
						case 2:
							return h18sBlue2; 
						case 3:
							return h18sBlue3; 
						case 4:
							return h18sBlue4; 
						case 5:
							return h18sBlue5;
						case 6:
							return h18sBlue6;	
					}
				} else {
					return null;
				}
			case "hrTV":
				if (World.hrTVOn) {
					return hrTVOverlay;
				} else {
					return null;
				}
			case "t5n":
				return t5nPlank;
			case "t9n shop":
				return t9nShopOverlay;
			case "t48e":
				return t48e;
			case "tod":
				return todTable;
			default:
				return null;
		}
	}
	
	private Image getImage4() {
		switch (Player.position) {
			case "g30e":
				if (Animation.reaper1WalkingLeft) {
					return g30eOverlay;
				} else if (World.reaper1PulledGun) {
					return g30eMonkGun; 
				} else {
					return null;
				}
			case "gTV":
				if (Animation.displayingGTVpaperCranes) {
					return gtapePaperCranes;
				} else {
					return null;
				}
			case "h1n":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh1;
					if (World.OOX)
						return bulbOOXh1;
					if (World.XOO)
						return bulbXOOh1;
					if (World.XOX)
						return bulbXOXh1;
				} else {
					return null;
				}
			case "h2w":
				return h2wOverlay;
			case "h14n":
				if (World.OOO) 
					if (World.buttonPushed) {
						return h14nOOOButton;
					} else {
						return h14nOOO;
					}
				if (World.OOX)
					if (World.buttonPushed) {
						return h14nOOXButton;
					} else {
						return h14nOOX;
					}
				if (World.XOX)
					if (World.buttonPushed) {
						return h14nXOXButton;
					} else {
						return h14nXOX;
					}
				if (World.XOO)
					if (World.buttonPushed) {
						return h14nXOOButton;
					} else {
						return h14nXOO;
					}
			case "hTV":
				if (Animation.displayingHTapeMonk1) {
					return htapel2monk1;
				} else if (Animation.displayingHTapeMonk2) {
					return htapel2monk2;
				} else if (Animation.displayingHTapeDie1) {
					return htapeDie1;
				} else if (Animation.displayingHTapeDie2) {
					return htapeDie2;
				} else if (Animation.displayingHTapeDie3) {
					return htapeDie3;
				} else if (Animation.displayingHTapeDie4) {
					return htapeDie4;
				}else {
					return null;
				}
			case "t5n":
				if (World.OOO)
					return t5nOOO;
				if (World.OXO)
					return t5nOXO;
				if (World.XOO)
					return t5nXOO;
				if (World.XXO)
					return t5nXXO;
			case "t9n shop":
				if (Player.holdingShopCase) {
					if (World.OOO) {
						return t9nShopCaseClosedOOO;
					} else if (World.OXO) {
						return t9nShopCaseClosedOXO;
					} else if (World.XOO) {
						return t9nShopCaseClosedXOO;
					} else if (World.XXO) { 
						if (World.shopCaseOpen) {
							return t9nShopCaseOpen;
						} else {
							return t9nShopCaseClosedXXO;
						}
					}
				} else {
					return null;
				}
			case "tTV":
				if (Animation.displayingTVCRmonkLeft) {
					return TVCRmonkLeft;
				} else if (Animation.displayingTVCRmonkRight) {
					return TVCRmonkRight;
				} else if (Animation.displayingTVCRmonkDie1) {
					return TVCRmonkDie1;
				} else if (Animation.displayingTVCRmonkDie2) {
					return TVCRmonkDie2;
				} else {
					return null;
				}
			case "tod":
				return todMyCup1;
			default:
				return null;
		}
	}
	
	private Image getOutgoingImage4() {
		switch (Player.oldPosition) {
			case "h1n":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOh1;
					if (World.OOX)
						return bulbOOXh1;
					if (World.XOO)
						return bulbXOOh1;
					if (World.XOX)
						return bulbXOXh1;
				} else {
					return null;
				}
			case "h14n":
				if (World.OOO) 
					if (World.buttonPushed) {
						return h14nOOOButton;
					} else {
						return h14nOOO;
					}
				if (World.OOX)
					if (World.buttonPushed) {
						return h14nOOXButton;
					} else {
						return h14nOOX;
					}
				if (World.XOX)
					if (World.buttonPushed) {
						return h14nXOXButton;
					} else {
						return h14nXOX;
					}
				if (World.XOO)
					if (World.buttonPushed) {
						return h14nXOOButton;
					} else {
						return h14nXOO;
					}
			case "t5n":
				if (World.OOO)
					return t5nOOO;
				if (World.OXO)
					return t5nOXO;
				if (World.XOO)
					return t5nXOO;
				if (World.XXO)
					return t5nXXO;
			case "t9n shop":
				if (Player.holdingShopCase) {
					if (World.OOO) 
						return t9nShopCaseClosedOOO;
					if (World.OXO) 
						return t9nShopCaseClosedOXO;
					if (World.XOO) 
						return t9nShopCaseClosedXOO;
					if (World.XXO) 
						return t9nShopCaseClosedXXO;
				} else {
					return null;
				}
			default:
				return null;
		}
	}
	
	private Image getImage5() {
		switch (Player.position) {
			case "g30e":
				if (Animation.reaper1Shooting) {
					return g30eFlash;
				} else {
					return null;
				}
			case "h14n":
				if (Player.examiningPlaque) {
					if (World.OOO) 
						return bulbOOOh14;
					if (World.OOX)
						return bulbOOXh14;
					if (World.XOO)
						return bulbXOOh14;
					if (World.XOX)
						return bulbXOXh14;
				} else {
					return null;
				}
			case "hTV":
				if (!Animation.movingHTapeMonk1) {
					return htapel3wall;
				} else {
					return null;
				}
			case "t5n":
				if (Player.examiningPlaque && !Player.examiningGo) {
					if (World.OOO)
						return bulbOOOt5;
					if (World.OXO)
						return bulbOXOt5;
					if (World.XOO)
						return bulbXOOt5;
					if (World.XXO)
						return bulbXXOt5;
				} else {
					return null;
				}
			case "t9n shop":
				if (World.shopCaseOpen && !Player.hasYu) {
					return t9nShopScroll;
				} else {
					return null;
				}
			case "tTV":
				if (Animation.displayingTVCRreaperLeft) {
					return TVCRreaperLeft;
				} else {
					return null;
				}
			case "tod":
				if (World.todStatus.equals("sipping2")
					|| World.todStatus.equals("sipping3")) {
						return null;
				} else {
					return todTodsCup1;
				}
			default:
				return null;
		}
	}
	
	private Image getOutgoingImage5() {
		switch (Player.oldPosition) {
			case "h14n":
				if (Player.examiningPlaque) {
					if (World.OOO) 
						return bulbOOOh14;
					if (World.OOX)
						return bulbOOXh14;
					if (World.XOO)
						return bulbXOOh14;
					if (World.XOX)
						return bulbXOXh14;
				} else {
					return null;
				}
			case "t5n":
				if (Player.examiningPlaque && !Player.examiningGo) {
					if (World.OOO)
						return bulbOOOt5;
					if (World.OXO)
						return bulbOXOt5;
					if (World.XOO)
						return bulbXOOt5;
					if (World.XXO)
						return bulbXXOt5;
				} else {
					return null;
				}
			case "t9n shop":
				// if scroll
				
				return null;
				
			case "tod":
				return todTodsCup1;
			default:
				return null;
		}
	}
	
	private Image getImage6() {
		switch (Player.position) {
			case "hTV":
				return htapel3gate;
			case "t5n":
				if (World.buttonPushed)
					return t5nOOOButton;
			case "t23w":
				if (Player.examiningPlaque) {
					if (World.OOO)
						return bulbOOOt23;
					if (World.OXO)
						return bulbOXOt23;
					if (World.XOO)
						return bulbXOOt23;
					if (World.XXO)
						return bulbXXOt23;
				} else {
					return null;
				}
			case "tTV":
				return TVCRframe;
			case "tod":
				if (Player.sipping)
					return todSelfSip;
			default:
				return null;
		}
	}
	
	private Image getOutgoingImage6() {
		switch (Player.oldPosition) {
			case "t5n":
				if (World.buttonPushed)
					return t5nOOOButton;
			default:
				return null;
		}
	}
	
	private Image getImage7() {
		switch (Player.position) {
			case "tTV":
				if (Animation.displayingTVCRreaperBack) {		
					return TVCRreaperBack;
				} else {
					return null;
				}
			default:
				return null;
		}
	}
	
	private Image getImage8() {
		switch (Player.position) {
			case "gTV":
				if (Animation.rewinding || Animation.fastforwarding) {
					return htapel4static;
				} else {
					return null;
				}
			case "hTV":
				if (Animation.rewinding || Animation.fastforwarding) {
					return htapel4static;
				} else {
					return null;
				}
			case "tTV":
				if (Animation.rewinding || Animation.fastforwarding) {
					return htapel4static;
				} else {
					return null;
				}
			default:
				return null;
		}
	}
	
	private Image getImage9() {
		switch (Player.position) {
			case "gTV":
					if (Animation.rewinding || Animation.fastforwarding) {
						return htapel4static;
					} else {
						return null;
					}
			case "hTV":
				if (Animation.rewinding || Animation.fastforwarding) {
					return htapel4static;
				} else {
					return null;
				}
			case "tTV":
				if (Animation.rewinding || Animation.fastforwarding) {
					return htapel4static;
				} else {
					return null;
				}
			default:
				return null;
		}	
	}
	
	private Image getImage10() {
		switch (Player.position) {
			case "hTV":
				return htapeStaticBlock;
			case "tTV":
				return TVCRoverlay;
			case "gTV":
				return gtapeOverlay;
			default:
				return null;
		}
	}
	
	private Image getScrollImage() {
		if (Player.examiningOm) {
			return scrollOm;
		} else if (Player.examiningNi) {
			return scrollNi;
		} else if (Player.examiningGo) {
			return scrollGo;
		} else if (Player.examiningYu) {
			return scrollYu;
		} else if (Player.examiningJi) {
			return scrollJi;
		} else if (Player.examiningRa) {
			return scrollRa;
		} else if (Player.examiningShi) {
			return scrollShi;
		} else {
			System.out.println("ImagePanel.getScrollImage() error");
			return null;
		}
	}
	
	private Image getScrollTop() {
		return scrollTop;
	}
	
	private Image getImageItem() {
		if (Player.holdingGoldPaper) {
			if (World.dark) {
				return goldPaperDark;
			} else {
				return goldPaperLight;
			}
		} else if (Player.holdingRod) {
			if (Item.fishingRodBent) {
				return fishingRodBent;
			} else {
				return fishingRod;
			}
		} else if (Player.holdingCorn) {
			return itemCorn;
		} else if (Player.shooting) {
			return pistolPovShoot;
		} else if (Player.holdingGun) {
			return pistolPov;
		} else {
			return null;
		}
	}
	
	private Image getImageMessage() {
		if (Player.readingMessage) {
			return message;
		} else {
			return null;
		}
	}
	
	private Image getSamadhiImage() {
		switch (Animation.samadhiSelect) {
			case "s1": return s1;
			case "s2": return s2;
			case "s3": return s3;
			case "s4": return s4;
			case "s5": return s5;
			case "s6": return s6;
			case "s7": return s7;
			case "s8": return s8;
			case "s9": return s9;
			case "s10": return s10;
			case "s11": return s11;
			case "s12": return s12;
			case "s13": return s13;
			case "s14": return s14;
			case "s15": return s15;
			case "s16": return s16;
			case "s17": return s17;
			case "s18": return s18;
			case "s19": return s19;
			case "s20": return s20;
			case "s21": return s21;
			case "s22": return s22;
			case "s23": return s23;
			case "s24": return s24;
			case "s25": return s25;
			case "s26": return s26;
			case "s27": return s27;
			case "s28": return s28;
			case "s29": return s29;
			case "s30": return s30;
			case "s31": return s31;
			case "s32": return s32;
			case "s33": return s33;
			case "s34": return s34;
			case "s35": return s35;
			case "s36": return s36;
			case "s37": return s37;
			case "s38": return s38;
			case "s39": return s39;
			case "s40": return s40;
			case "s41": return s41;
			case "s42": return s42;
			case "s43": return s43;
			case "s44": return s44;
			case "s45": return s45;
			case "s46": return s46;
			case "s47": return s47;
			case "s48": return s48;
			case "s49": return s49;
			case "s50": return s50;
			case "s51": return s51;
			case "s52": return s52;
			case "s53": return s53;
			case "s54": return s54;
			case "s55": return s55;
			case "s56": return s56;
			case "s57": return s57;
			case "s58": return s58;
			case "s59": return s59;
			case "s60": return s60;
			case "s61": return s61;
			case "s62": return s62;
			default: 
				System.out.println("ImagePanel samadhi error");
				return null;
		}
	}
	
	public static void resetImages() {
		//System.out.println("ImagePanel.resetImages();");
		eyelid1Y = 0;
		eyelid2Y = 0;
		image1X = 0;
		image1Y = 0;
		image2X = 0;
		image2Y = 0;
		image3X = 0;
		image3Y = 0;
		image4X = 0;
		image4Y = 0;
		image5X = 0;
		image5Y = 0;
		image6X = 0;
		image6Y = 0;
		image7X = 0;
		image7Y = 0;
		image8X = 0;
		image8Y = 0;
		image9X = 0;
		image9Y = 0;
		image10X = 0;
		image10Y = 0;
		image1Width = Bunraku.width;
		image2Width = Bunraku.width;
		image3Width = Bunraku.width;
		image4Width = Bunraku.width;
		image5Width = Bunraku.width;
		image6Width = Bunraku.width;
		image7Width = Bunraku.width;
		image8Width = Bunraku.width;
		image9Width = Bunraku.width;
		image10Width = Bunraku.width;
		image1Height = Bunraku.height;
		image2Height = Bunraku.height;
		image3Height = Bunraku.height;
		image4Height = Bunraku.height;
		image5Height = Bunraku.height;
		image6Height = Bunraku.height;
		image7Height = Bunraku.height;
		image8Height = Bunraku.height;
		image9Height = Bunraku.height;
		image10Height = Bunraku.height;
		imageOutgoing1X = 0;
		imageOutgoing1Y = 0;
		imageOutgoing2X = 0;
		imageOutgoing2Y = 0;
		imageOutgoing3X = 0;
		imageOutgoing3Y = 0;
		imageOutgoing4X = 0;
		imageOutgoing4Y = 0;
		imageOutgoing5X = 0;
		imageOutgoing5Y = 0;
		imageOutgoing6X = 0;
		imageOutgoing6Y = 0;
		imageOutgoing1Width = Bunraku.width;
		imageOutgoing2Width = Bunraku.width;
		imageOutgoing3Width = Bunraku.width;
		imageOutgoing4Width = Bunraku.width;
		imageOutgoing5Width = Bunraku.width;
		imageOutgoing6Width = Bunraku.width;
		imageOutgoing1Height = Bunraku.height;
		imageOutgoing2Height = Bunraku.height;
		imageOutgoing3Height = Bunraku.height;
		imageOutgoing4Height = Bunraku.height;
		imageOutgoing5Height = Bunraku.height;
		imageOutgoing6Height = Bunraku.height;
		scrollY = 0;
		imageItemX = 0;
		imageItemY = 0;
		imageMessageX = 417;
		imageMessageY = 0;
	}
	
	public static void resetColorValues() {
		ImagePanel.opacity = 255;
		ImagePanel.redValue = 0;
		ImagePanel.greenValue = 0;
		ImagePanel.blueValue = 0;
	}
	
	public static void setColorValues(int r, int g, int b, int o) {
		redValue = r;
		greenValue = g;
		blueValue = b;
		opacity = o;
		
		if (redValue < 0 || redValue > 255 || greenValue < 0 || greenValue > 255 || blueValue < 0 || blueValue > 255 || opacity < 0 || opacity > 255) {
			System.out.println("ImagePanel.setColorValues() error: value out of range");
			resetColorValues();
		}
	}
	
	public static void setFadeOrange() {
		//setColorValues(255,186,104,255); // original opacity 189
	}
	
	public static void setFadeGreen() {
		//setColorValues(175,255,90,255); // original opacity 120
	}
	
	public static void setFadePurple() {
		//setColorValues(255,72,255,255); // original opacity 165
	}
	
	public static void setFadeIntro() {
		setColorValues(255,255,255,200); 
	}
	
	public static void bleed() {
		setColorValues(255, 0, 0, 255);
		Animation.bloody = true;
	}
	
	public static void printColors() {
		System.out.println(redValue + " " + greenValue + " " + blueValue + " " + opacity);
	}
	
	//resets image positions after pan in last location
	//may not be necessary to check positions if i can just reset ever time
	public static void resetImagesAfterPan() {
		System.out.println("ImagePanel.resetImagesAfterPan()");
		
		switch (Player.oldPosition) {
			case "h14n":
				resetImages();
			case "t5n":
				if (!Player.examiningGo)
					resetImages();
			default:
				break;
		}
	}
	
	public static boolean imageResetPermission() {
		switch (Player.position) {
			case "h14n":
				if (World.raDropped) {
					ImagePanel.image2X = -80;
					return false;
				} else {
					return true;
				}
			case "t5n":
				if (World.t5nOpened) {
					return false;
				} else {
					return true;
				}
			case "t48e":
				image2X = 0;
				image3X = 0;
				return false;
			case "tod":
				return false;
			default:
				return true;
		}
	}
	
	private static void update() {
		Animation.animate(); 
		//System.out.println(inputScrollX);
	}
	
	public void actionPerformed(ActionEvent e) {	
		update();
		repaint();
	}
}