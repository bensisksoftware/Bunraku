import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Audio {
	public static ArrayList<Clip> clips = new ArrayList();
	
	public static boolean loadedAudio;
	
	public static Clip title;
	public static Clip zen;
	public static Clip gunshot;
	public static Clip acid;
	public static Clip raDrop;
	public static Clip breathe;
	public static Clip tomita;
	public static Clip om;
	public static Clip ni;
	public static Clip go;
	public static Clip yu;
	public static Clip ji;
	public static Clip ra;
	public static Clip shi;
	public static Clip safeOpen;
	public static Clip handle;
	public static Clip safeShut;
	public static Clip caseOpen;
	public static Clip bookOpen;
	public static Clip openTiny;
	public static Clip kimi;
	public static Clip save;
	public static Clip ligeti;
	public static Clip locked;
	public static Clip myst;
	public static Clip autechre;
	public static Clip phoneFail;
	public static Clip phoneButton0;
	public static Clip phoneButton1;
	public static Clip phoneButton2;
	public static Clip phoneButton3;
	public static Clip phoneButton4;
	public static Clip phoneButton5;
	public static Clip phoneButton6;
	public static Clip phoneButton7;
	public static Clip phoneButton8;
	public static Clip phoneButton9;
	public static Clip phoneButtonRed;
	public static Clip splash;
	public static Clip squarepusher;
	public static Clip tapeSet;
	public static Clip sip;
	public static Clip teaSet;
	public static Clip tvButton;
	public static Clip slash;
	public static Clip doorShut;
	public static Clip doorOpen;
	public static Clip turnPage;
	public static Clip equip1;
	public static Clip equip2;
	public static Clip equip3;
	public static Clip equip4;
	public static Clip equip5;
	public static Clip rope;
	public static Clip beep;
	public static Clip woodCreak;
	public static Clip vcr;
	
	public static void loadZen() {
		final Clip clip = getAudio("main");
		zen = clip;
	}
	
	public static void loadTitle() {
		final Clip clip = getAudio("titleAnother");
		title = clip;
	}

	public static void loadBreathe() {
		final Clip clip = getAudio("breathe");
		breathe = clip;
	}
	
	public static void loadRaDrop() {
		final Clip clip = getAudio("raDrop");
		raDrop = clip;
	}
	
	public static void loadGunshot() {
		final Clip clip = getAudio("gunshot");
		gunshot = clip;
	}
	
	public static void loadHandle() {
		final Clip clip = getAudio("handle");
		handle = clip;
	}
	
	public static void loadOm() {
		final Clip clip = getAudio("OM");
		om = clip;
	}
	
	public static void loadNi() {
		final Clip clip = getAudio("NI");
		ni = clip;
	}
	
	public static void loadGo() {
		final Clip clip = getAudio("GO");
		go = clip;
	}
	
	public static void loadYu() {
		final Clip clip = getAudio("YU");
		yu = clip;
	}
	
	public static void loadJi() {
		final Clip clip = getAudio("JI");
		ji = clip;
	}
	
	public static void loadRa() {
		final Clip clip = getAudio("RA");
		ra = clip;
	}
	
	public static void loadShi() {
		final Clip clip = getAudio("SHI");
		shi = clip;
	}
	
	public static void loadVCR() {
		final Clip clip = getAudio("vcr");
		vcr = clip;
	}
	
	public static void loadSplash() {
		final Clip clip = getAudio("splash");
		splash = clip;
	}
	
	public static void loadSlash() {
		final Clip clip = getAudio("slash");
		slash = clip;
	}
	
	public static void loadDoorShut() {
		final Clip clip = getAudio("doorShut");
		doorShut = clip;
	}
	
	public static void loadDoorOpen() {
		final Clip clip = getAudio("doorOpen");
		doorOpen = clip;
	}
	
	public static void loadSafeOpen() {
		final Clip clip = getAudio("safeOpen");
		safeOpen = clip;
	}
	
	public static void loadTurnPage() {
		final Clip clip = getAudio("turnPage");
		turnPage = clip;
	}
	
	public static void loadEquip1() {
		final Clip clip = getAudio("equip1");
		equip1 = clip;
	}
	
	public static void loadEquip2() {
		final Clip clip = getAudio("equip2");
		equip2 = clip;
	}
	
	public static void loadEquip3() {
		final Clip clip = getAudio("equip3");
		equip3 = clip;
	}
	
	public static void loadEquip4() {
		final Clip clip = getAudio("equip4");
		equip4 = clip;
	}
	
	public static void loadEquip5() {
		final Clip clip = getAudio("equip5");
		equip5 = clip;
	}
	
	public static void loadRope() {
		final Clip clip = getAudio("rope");
		rope = clip;
	}
	
	public static void loadKimi() {
		final Clip clip = getAudio("kimi");
		kimi = clip;
	}
	
	public static void loadLocked() {
		final Clip clip = getAudio("locked");
		locked = clip;
	}
	
	public static void loadBeep() {
		final Clip clip = getAudio("beep");
		beep = clip;
	}
	
	public static void loadMemorized() {
		final Clip clip = getAudio("myst");
		myst = clip;
	}
	
	public static void loadCreak() {
		final Clip clip = getAudio("wood creak");
		woodCreak = clip;
	}
	
	public static void loadSave() {
		final Clip clip = getAudio("save");
		save = clip;
	}
	
	public static void loadPhoneButton0() {
		final Clip clip = getAudio("phoneButton0");
		phoneButton0 = clip;
	}
	
	public static void loadPhoneButton1() {
		final Clip clip = getAudio("phoneButton1");
		phoneButton1 = clip;
	}
	
	public static void loadPhoneButton2() {
		final Clip clip = getAudio("phoneButton2");
		phoneButton2 = clip;
	}
	
	public static void loadPhoneButton3() {
		final Clip clip = getAudio("phoneButton3");
		phoneButton3 = clip;
	}
	
	public static void loadPhoneButton4() {
		final Clip clip = getAudio("phoneButton4");
		phoneButton4 = clip;
	}
	
	public static void loadPhoneButton5() {
		final Clip clip = getAudio("phoneButton5");
		phoneButton5 = clip;
	}
	
	public static void loadPhoneButton6() {
		final Clip clip = getAudio("phoneButton6");
		phoneButton6 = clip;
	}
	
	public static void loadPhoneButton7() {
		final Clip clip = getAudio("phoneButton7");
		phoneButton7 = clip;
	}
	
	public static void loadPhoneButton8() {
		final Clip clip = getAudio("phoneButton8");
		phoneButton8 = clip;
	}
	
	public static void loadPhoneButton9() {
		final Clip clip = getAudio("phoneButton9");
		phoneButton9 = clip;
	}
	
	public static void loadPhoneButtonRed() {
		final Clip clip = getAudio("phoneButtonRed");
		phoneButtonRed = clip;
	}
	
	public static void loadAcid() {
		final Clip clip = getAudio("acid");
		acid = clip;
	}
	
	public static void loadPhoneFail() {
		final Clip clip = getAudio("phone fail");
		phoneFail = clip;
	}
	
	public static void loadSip() {
		final Clip clip = getAudio("sip");
		sip = clip;
	}
	
	public static void loadTeaSet() {
		final Clip clip = getAudio("teaSet");
		teaSet = clip;
	}
	
	public static void loadTomita() {
		final Clip clip = getAudio("tomita");
		tomita = clip;
	}
	
	public static void loadLigeti() {
		final Clip clip = getAudio("ligeti");
		ligeti = clip;
	}
	
	public static void loadMyst() {
		final Clip clip = getAudio("myst chant");
		myst = clip;
	}
	
	public static void loadTVButton() {
		final Clip clip = getAudio("tvButton");
		tvButton = clip;
	}
	
	public static void loadOpenTiny() {
		final Clip clip = getAudio("openTiny");
		openTiny = clip;
	}
	
	public static void loadAutechre() {
		final Clip clip = getAudio("autechre");
		autechre = clip;
	}
	
	public static void loadSquarepusher() {
		final Clip clip = getAudio("squarepusher");
		squarepusher = clip;
	}
	
	public static void loadTapeSet() {
		final Clip clip = getAudio("tapeSet");
		tapeSet = clip;
	}
	
	public static void loadCaseOpen() {
		final Clip clip = getAudio("caseOpen");
		caseOpen = clip;
	}
	
	public static void loadBookOpen() {
		final Clip clip = getAudio("bookOpen");
		bookOpen = clip;
	}
	
	public static void loadSafeShut() {
		final Clip clip = getAudio("safeShut");
		safeShut = clip;
	}
	
	public static void startBreathe() {
		breathe.stop();
		breathe.setMicrosecondPosition(0);
		breathe.start();
	}
	
	public static void startBreatheLoop() {
		breathe.stop();
		breathe.setMicrosecondPosition(0);
		breathe.start();
		breathe.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void startOm() {
		startMemorized();
		om.stop();
		om.setMicrosecondPosition(0);
		om.start();
	}
	
	public static void startNi() {
		startMemorized();
		ni.stop();
		ni.setMicrosecondPosition(0);
		ni.start();
	}
	
	public static void startGo() {
		startMemorized();
		go.stop();
		go.setMicrosecondPosition(0);
		go.start();
	}
	
	public static void startYu() {
		startMemorized();
		yu.stop();
		yu.setMicrosecondPosition(0);
		yu.start();
	}
	
	public static void startJi() {
		startMemorized();
		ji.stop();
		ji.setMicrosecondPosition(0);
		ji.start();
	}
	
	public static void startRa() {
		startMemorized();
		ra.stop();
		ra.setMicrosecondPosition(0);
		ra.start();
	}
	
	public static void startShi() {
		startMemorized();
		shi.stop();
		shi.setMicrosecondPosition(0);
		shi.start();
	}
	
	public static void startVCR() {
		vcr.stop();
		vcr.setMicrosecondPosition(0);
		vcr.start();
	}
	
	public static void startSafeShut() {
		safeShut.stop();
		safeShut.setMicrosecondPosition(0);
		safeShut.start();
	}
	
	public static void startReel() {
		rope.stop();
		rope.setMicrosecondPosition(0);
		rope.start();
	}
	
	public static void startRaDrop() {
		raDrop.stop();
		raDrop.setMicrosecondPosition(0);
		raDrop.start();
	}
	
	public static void startSplash() {
		splash.stop();
		splash.setMicrosecondPosition(0);
		splash.start();
	}
	
	public static void startBookOpen() {
		bookOpen.stop();
		bookOpen.setMicrosecondPosition(0);
		bookOpen.start();
	}
	
	public static void startSlash() {
		slash.stop();
		slash.setMicrosecondPosition(0);
		slash.start();
	}
	
	public static void startDoorShut() {
		doorShut.stop();
		doorShut.setMicrosecondPosition(0);
		doorShut.start();
	}
	
	public static void startDoorOpen() {
		doorOpen.stop();
		doorOpen.setMicrosecondPosition(0);
		doorOpen.start();
	}
	
	public static void startTurnPage() {
		turnPage.stop();
		turnPage.setMicrosecondPosition(0);
		turnPage.start();
	}
	
	public static void startEquip2() {
		System.out.println("Audio.startEquip2");
		equip2.stop();
		equip2.setMicrosecondPosition(0);
		equip2.start();
		
	}
	
	public static void startEquip3() {
		System.out.println("Audio.startEquip3");
		equip3.stop();
		equip3.setMicrosecondPosition(0);
		equip3.start();
	}
	
	public static void startRope() {
		rope.stop();
		rope.setMicrosecondPosition(0);
		rope.start();
	}
	
	public static void startLocked() {
		locked.stop();
		locked.setMicrosecondPosition(0);
		locked.start();
	}

	public static void startScroll() {
		bookOpen.stop();
		bookOpen.setMicrosecondPosition(0);
		bookOpen.start();
	}
	
	public static void startSafeOpen() {
		safeOpen.stop();
		safeOpen.setMicrosecondPosition(0);
		safeOpen.start();
	}
	
	public static void startCaseOpen() {
		caseOpen.stop();
		caseOpen.setMicrosecondPosition(0);
		caseOpen.start();
	}
	
	public static void startSave() {
		save.stop();
		save.setMicrosecondPosition(0);
		save.start();
	}
	
	public static void startBeep() {
		beep.stop();
		beep.setMicrosecondPosition(0);
		beep.start();
	}
	
	public static void startMemorized() {
		myst.stop();
		myst.setMicrosecondPosition(0);
		myst.start();
	}
	
	public static void startCreak() {
		woodCreak.stop();
		woodCreak.setMicrosecondPosition(0);
		woodCreak.start();
	}
	
	public static void startPhoneButton(int n) {
		switch (n) {
			case 0:
				phoneButton0.stop();
				phoneButton0.setMicrosecondPosition(0);
				phoneButton0.start();
				break;
			case 1:
				phoneButton1.stop();
				phoneButton1.setMicrosecondPosition(0);
				phoneButton1.start();
				break;
			case 2:
				phoneButton2.stop();
				phoneButton2.setMicrosecondPosition(0);
				phoneButton2.start();
				break;
			case 3:
				phoneButton3.stop();
				phoneButton3.setMicrosecondPosition(0);
				phoneButton3.start();
				break;
			case 4:
				phoneButton4.stop();
				phoneButton4.setMicrosecondPosition(0);
				phoneButton4.start();
				break;
			case 5:
				phoneButton5.stop();
				phoneButton5.setMicrosecondPosition(0);
				phoneButton5.start();
				break;
			case 6:
				phoneButton6.stop();
				phoneButton6.setMicrosecondPosition(0);
				phoneButton6.start();
				break;
			case 7:
				phoneButton7.stop();
				phoneButton7.setMicrosecondPosition(0);
				phoneButton7.start();
				break;
			case 8:
				phoneButton8.stop();
				phoneButton8.setMicrosecondPosition(0);
				phoneButton8.start();
				break;
			case 9:
				phoneButton9.stop();
				phoneButton9.setMicrosecondPosition(0);
				phoneButton9.start();
				break;
			default:
				System.out.println("startPhoneButton error");
				break;
		}
	}
	
	public static void startPhoneButtonRed() {
		phoneButtonRed.stop();
		phoneButtonRed.setMicrosecondPosition(0);
		phoneButtonRed.start();
	}
	
	public static void startAcid() {
		acid.stop();
		acid.setMicrosecondPosition(0);
		acid.start();
	}
	
	public static void startPhoneFail() {
		phoneFail.stop();
		phoneFail.setMicrosecondPosition(0);
		phoneFail.start();
	}
	
	public static void startKimi() {
		kimi.stop();
		kimi.setMicrosecondPosition(0);
		kimi.start();
	}
	
	public static void startTVButton() {
		tvButton.stop();
		tvButton.setMicrosecondPosition(0);
		tvButton.start();
	}
	
	public static void startOpenTiny() {
		openTiny.stop();
		openTiny.setMicrosecondPosition(0);
		openTiny.start();
	}
	
	public static void startEquip1() {
		System.out.println("Audio.startEquip1");
		equip1.stop();
		equip1.setMicrosecondPosition(0);
		equip1.start();
	}
	
	public static void startEquip4() {
		System.out.println("Audio.startEquip4");
		equip4.stop();
		equip4.setMicrosecondPosition(0);
		equip4.start();
	}
	
	public static void startEquip5() {
		System.out.println("Audio.startEquip5");
		equip5.stop();
		equip5.setMicrosecondPosition(0);
		equip5.start();
	}
	
	public static void startHandle() {
		handle.stop();
		handle.setMicrosecondPosition(0);
		handle.start();
	}
	
	public static void startSip() {
		sip.stop();
		sip.setMicrosecondPosition(0);
		sip.start();
	}
	
	public static void startTeaSet() {
		teaSet.stop();
		teaSet.setMicrosecondPosition(0);
		teaSet.start();
	}
	
	public static void startTapeSet() {
		tapeSet.stop();
		tapeSet.setMicrosecondPosition(0);
		tapeSet.start();
	}
	
	public static void startTitle() {
		title.stop();
		title.setMicrosecondPosition(0);
		title.start();
		title.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void startLigeti() {
		ligeti.stop();
		ligeti.setMicrosecondPosition(0);
		ligeti.start();
		ligeti.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void stopLigeti() {
		ligeti.stop();
		ligeti.close();
	}
	
	public static void stopTitle() {
		title.stop();
		title.close();
	}
	
	public static void startZen() {
		zen.stop();
		zen.setMicrosecondPosition(0);
		zen.start();
		zen.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void startSquarepusher() {
		squarepusher.stop();
		squarepusher.setMicrosecondPosition(0);
		squarepusher.start();
		squarepusher.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void startAutechre() {
		autechre.start();
		autechre.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void startTomita() {
		tomita.start();
		tomita.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public static void stopBreatheLoop() {
		breathe.stop();
	}
	
	public static void stopZen() {
		zen.stop();
		//zen.close(); 
		// had issues: closing prevents replaying afterwards. prob can fix by reloading if necessary
	}
	
	public static void stopAutechre() {
		autechre.stop();
		autechre.close();
	}
	
	public static void stopTomita() {
		tomita.stop();
		tomita.close();
	}
	
	public static void stopPhone() {
		phoneFail.stop();
		kimi.stop();
	}
	
	public static void stopVCR() {
		vcr.stop();
	}
	
	public static void stopSquarepusher() {
		squarepusher.stop();
		//squarepusher.close();
	}
	
	public static void startGun() {
		gunshot.stop();
		gunshot.setMicrosecondPosition(0);
		gunshot.start();
	}
	
	public static void stopAudio() {
		
	}
	
	public static void loadAudio() {
		loadZen();
		loadGunshot();
		loadAcid();
		loadRaDrop();
		loadBreathe();
		loadOm();
		loadNi();
		loadGo();
		loadYu();
		loadJi();
		loadRa();
		loadShi();
		loadSafeOpen();
		loadSafeShut();
		loadCaseOpen();
		loadBookOpen();
		loadOpenTiny();
		loadKimi();
		loadSave();
		loadLocked();
		loadMyst();
		loadPhoneFail();
		loadPhoneButton0();
		loadPhoneButton1();
		loadPhoneButton2();
		loadPhoneButton3();
		loadPhoneButton4();
		loadPhoneButton5();
		loadPhoneButton6();
		loadPhoneButton7();
		loadPhoneButton8();
		loadPhoneButton9();
		loadPhoneButtonRed();
		loadHandle();
		loadVCR();
		loadSplash();
		loadSquarepusher();
		loadTapeSet();
		loadSip();
		loadTeaSet();
		loadTVButton();
		loadSlash();
		loadDoorShut();
		loadDoorOpen();
		loadTurnPage();
		loadEquip1();
		loadEquip2();
		loadEquip3();
		loadEquip4();
		loadEquip5();
		loadRope();
		loadBeep();
		loadCreak();
		
		loadedAudio = true;
	}
	
	public static Clip getAudio(String fileName) {
		try {
			File soundPath = new File("resources/audio/" + fileName + ".wav");
			
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			System.out.println("Loading Audio frameLength " + clip.getFrameLength());
			
			return clip;
		} catch (Exception ex) {
			System.out.println("audio error.");
			ex.printStackTrace();
			return null;
		}
	}
}

