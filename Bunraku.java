import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Main Class */
public class Bunraku extends JFrame {
	public static int width;
	public static int height;
	
	ImagePanel imagePanel = new ImagePanel();
	
	public Bunraku() {	
		add(imagePanel);
		
		// Set Starting Location
		Player.position = "title"; 
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {	
				Data.xCoord2 = e.getX();
				Data.yCoord2 = e.getY();
				
				if (Data.button3Pressed) {
					Data.button3Pressed = false;
					//Data.printCoords();
				}
				
				if (Player.position.equals("samadhi") && !Mouse.disallowSamadhi) {
					System.out.println(Data.bannedSamadhiImages.size() + " " + Animation.samadhiSelect + " " + Animation.samadhiCheck);
					Data.bannedSamadhiImages.add(Data.samadhiImages.get(Animation.samadhiCheck));
					Animation.cyclingSamadhi = true;
					
					if (Data.bannedSamadhiImages.size() == 59) {
						Animation.endSamadhiSequence = true;
						Mouse.disallowSamadhi = true;
						Animation.tick = 1;
					}
				}
			}
			
			@Override	
			public void mouseEntered(MouseEvent e) {
				// Nada
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Mouse.clicks += 1;
				Mouse.x = e.getX();
				Mouse.y = e.getY();
				
				//System.out.println("\n#" + Mouse.clicks + "\nClicked " + Mouse.getPlayerAction() + " at " + Player.position + "\nx = " + Mouse.x + "\ny = " + Mouse.y);
				
				if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
					if (Player.readingMessage && !Keyboard.typingInput && !Animation.openingMessage) {
						Message.nextText();
					} else if (Player.examiningPlaque && !Player.busy && !Player.disableWalk) {
						Player.examiningPlaque = false;
					} else if (Player.holdingItem) {
						Item.processItem();
					} else if (Player.examiningScroll() && !Player.busy && !Player.readingMessage && World.scrollCloseable) {
						System.out.println("Bunraku close scroll");
						Animation.closingScroll = true;
					} else if (!Player.busy && !Animation.movingImage) {
						Mouse.processClick();
					}
					
					// stops samadhi cycle
					if (Player.position.equals("samadhi") && !Mouse.disallowSamadhi) {
						Animation.cyclingSamadhi = false;
						
						// skips over end images
						while (Animation.samadhiCheck == 38 || Animation.samadhiCheck == 39 || Animation.samadhiCheck == 40 || Data.bannedSamadhiImages.contains(Data.samadhiImages.get(Animation.samadhiCheck))) {
							if (Animation.samadhiCheck == 61) {
								Animation.samadhiCheck = 0;
								
								if (!Data.bannedSamadhiImages.contains(Data.samadhiImages.get(Animation.samadhiCheck)))
									Animation.samadhiSelect = Data.samadhiImages.get(Animation.samadhiCheck);
							} else {
								Animation.samadhiCheck++;
								
								if (!Data.bannedSamadhiImages.contains(Data.samadhiImages.get(Animation.samadhiCheck)))
									Animation.samadhiSelect = Data.samadhiImages.get(Animation.samadhiCheck);
							}
						}
					}
				}
				
				if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
					Data.button3Pressed = true;
					Data.xCoord1 = e.getX();
					Data.yCoord1 = e.getY();
				}
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Mouse.x = e.getX();
				Mouse.y = e.getY();
				
				Mouse.checkHUD(); 
				
				//changes cursor. don't know how to make custom or make invisible
				//setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				Mouse.x = e.getX();
				Mouse.y = e.getY();
				
				Mouse.checkHUD();
			}
		});
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				
				// ESC No Confirm				
				if (k.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (!Player.position.equals("title")) {
						Data.showConfirmDialogExit();
					} else {
						System.exit(0);
					}
				}
				
				if (Keyboard.typingInput && !Message.typing) {
					if (k.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						Keyboard.keyboardInputBackspace();
					} else if (k.getKeyCode() == KeyEvent.VK_ENTER) {
						Keyboard.justSubmitedInput = true;
						
						if (!Player.position.equals("g30e")) {
							Keyboard.keyboardInputDecypher();
						} else {
							Keyboard.keyboardInputSubmit();
						}
					} else {
						Keyboard.checkInput(k.getKeyChar());
					}
				}
				
				// Arrow controls
				
				/**
				if (k.getKeyCode() == KeyEvent.VK_UP || k.getKeyCode() == KeyEvent.VK_DOWN || k.getKeyCode() == KeyEvent.VK_LEFT || k.getKeyCode() == KeyEvent.VK_RIGHT) {
					switch(k.getKeyCode()) { 
						case KeyEvent.VK_UP:
							// handle up
							// RGB
							switch (Cheat.colorValueSelected) {
								case 1:
									if (ImagePanel.redValue < 253)
										ImagePanel.redValue += 2;
									break;
								case 2:
									if (ImagePanel.greenValue < 253)
										ImagePanel.greenValue += 2;
									break;
								case 3:
									if (ImagePanel.blueValue < 253)
										ImagePanel.blueValue += 2;
									break;
								case 4:
									if (ImagePanel.opacity < 253)
										ImagePanel.opacity += 2;
									break;
								default:
									System.out.println("Bunraku KeyEvent color cheat error");
									break;
							}
								
							ImagePanel.printColors();
							break;
						case KeyEvent.VK_DOWN:
							// handle down 
							switch (Cheat.colorValueSelected) {
								case 1:
									if (ImagePanel.redValue > 2)
										ImagePanel.redValue -= 2;
									break;
								case 2:
									if (ImagePanel.greenValue > 2)
										ImagePanel.greenValue -= 2;
									break;
								case 3:
									if (ImagePanel.blueValue > 2)
										ImagePanel.blueValue -= 2;
									break;
								case 4:
									if (ImagePanel.opacity > 2)
										ImagePanel.opacity -= 2;
									break;
								default:
									System.out.println("Bunraku KeyEvent color cheat error");
									break;
							}
							
							ImagePanel.printColors();
							break;
						case KeyEvent.VK_LEFT:
							// handle left
							if (Cheat.colorValueSelected == 1) {
								Cheat.colorValueSelected = 4;
							} else {
								Cheat.colorValueSelected--;
							}
							
							switch (Cheat.colorValueSelected) {
								case 1:
									System.out.println("red");
									break;
								case 2:
									System.out.println("green");
									break;
								case 3:
									System.out.println("blue");
									break;
								case 4:
									System.out.println("opacity");
									break;
								default:
								
									break;
							}
							break;
						case KeyEvent.VK_RIGHT :
							// handle right
							if (Cheat.colorValueSelected == 4) {
								Cheat.colorValueSelected = 1;
							} else {
								Cheat.colorValueSelected++;
							}
							
							switch (Cheat.colorValueSelected) {
								case 1:
									System.out.println("red");
									break;
								case 2:
									System.out.println("green");
									break;
								case 3:
									System.out.println("blue");
									break;
								case 4:
									System.out.println("opacity");
									break;
								default:
								
									break;
							}
							break;
					 }
				}
				*/
				
				// keyboard skip text
				if (Player.readingMessage && !Keyboard.typingInput && !Animation.openingMessage && !Keyboard.justSubmitedInput) {
					if (k.getKeyCode() == KeyEvent.VK_ENTER || k.getKeyCode() == KeyEvent.VK_SPACE) {
						Message.nextText();
						Keyboard.justSubmitedInput = false;
					}
				} 
				
				// DEV HACKS
				if (!Message.typing && !Keyboard.typingInput) {
					// P = position cheat
					if (k.getKeyChar() == 'p') {
						//Cheat.changePosition();
					}
					
					// B = bulb cheat
					if (k.getKeyChar() == 'b') {
						//Cheat.changeBulb();
					}
					
					// X = coord print
					if (k.getKeyChar() == 'x') {
						//Cheat.printCoords();
					}
					
					// C = check booleans etc.
					if (k.getKeyChar() == 'c') {
						//Cheat.printBooleans();
					}
					
					// Supercheat -- turns on booleans
					if (k.getKeyChar() == 's') {
						//Cheat.superCheat();
					}
					
					// reset booleans
					if (k.getKeyChar() == 'r') {
						//Cheat.resetBooleans();
					}
					
					// T = test
					if (k.getKeyChar() == 't') {
						//Cheat.test();
					}
					
					// Y = test 2
					if (k.getKeyChar() == 'y') {
						//Cheat.test2();
					}
					
					// N - New Game
					if (k.getKeyChar() == 'n') {
						//Data.newGame();
						//Player.setBusy(false);
						//Player.setDisableWalk(false);
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		JFrame frame = new Bunraku();
		
		Audio.loadTitle();
		
		frame.setTitle("Bunraku");
		frame.setUndecorated(true);
		frame.setSize(544, 416);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);		
		
		width = (int)(frame.getWidth());
		height = (int)(frame.getHeight());
		
		ImagePanel.resetImages();
		
		Audio.startTitle();
	}
}