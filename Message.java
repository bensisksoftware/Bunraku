public class Message extends Thread {
	public static boolean displayingText;
	public static boolean waiting = false;
	public static boolean typing;
	public static boolean lastText;
	public static boolean readingMeditating1;
	public static boolean readingMeditating2;
	public static boolean readingMeditating3;
	public static boolean readingMeditating4;
	public static boolean readingMeditating5;
	public static boolean readingMeditating6;
	public static boolean readingMeditating7;
	public static boolean readingMeditating8;
	public static boolean readingKnot;
	public static boolean readingTrance1;
	public static boolean readingTrance2;
	public static boolean readingTrance3;
	public static boolean readingTrance4;
	public static boolean readingTrance5;
	public static boolean readingTrance6;
	public static boolean readingTrance7;
	public static boolean readingTrance8;
	public static boolean readingTrance9;
	public static boolean readingTrance10;
	public static boolean readingTrance11;
	public static boolean readingTrance12;
	public static boolean readingTrance13;
	public static boolean readingTrance14;
	public static boolean readingTrance15;
	public static boolean readingTrance16;
	public static boolean readingTrance17;
	public static boolean readingTrance18;
	public static boolean readingTrance19;
	public static boolean readingTrance20;
	public static boolean readingTrance21;
	public static boolean readingScroll;
	public static boolean readingTooDarkPaper;
	public static boolean readingError;
	public static boolean readingErrorChant;
	public static boolean readingDead;
	public static boolean readingCorn1;
	public static boolean readingG1N;
	public static boolean readingG1N2;
	public static boolean readingG9N;
	public static boolean readingMirror1;
	public static boolean readingReaper1;
	public static boolean readingReaperUnknown;
	public static boolean readingReaper2;
	public static boolean readingReaper3;
	public static boolean readingReaper4;
	public static boolean readingShopBye;
	public static boolean readingShop11;
	public static boolean readingShop12;
	public static boolean readingShop13;
	public static boolean readingShop12b;
	public static boolean readingShop13b;
	public static boolean readingShop2;
	public static boolean readingShop3;
	public static boolean readingShopTemple1;
	public static boolean readingShopTemple2;
	public static boolean readingShopTemple3;
	public static boolean readingShopTemple4;
	public static boolean readingShopTemple5;
	public static boolean readingShopTemple9;
	public static boolean readingShopTemple13;
	public static boolean readingKimi1;
	public static boolean readingKimi2;
	public static boolean readingKimiWrongNumber;
	public static boolean readingKimiBooked;
	public static boolean readingKimiR;
	public static boolean readingKimi3;
	public static boolean readingKimi7;
	public static boolean readingKimi9;
	public static boolean readingKimi12;
	public static boolean readingKimi14;
	public static boolean readingKimi17;
	public static boolean readingKimi20;
	public static boolean readingKimi24;
	public static boolean readingKimi28;
	public static boolean readingKimi32;
	public static boolean readingKimi36;
	public static boolean readingKimi40;
	public static boolean readingKimi44;
	public static boolean readingKimi48;
	public static boolean readingKimi52;
	public static boolean readingKimi56;
	public static boolean readingKimi60;
	public static boolean dewaMata;
	public static boolean readingShopSorry1;
	public static boolean readingShopSorry2;
	public static boolean readingShopHelp;
	public static boolean readingTod1;
	public static boolean readingTod2;
	public static boolean readingTod4a;
	public static boolean readingTod7;
	public static boolean readingTod8;
	public static boolean readingTod11;
	public static boolean readingTod15;
	public static boolean readingTod17;
	public static boolean readingTod21;
	public static boolean readingTod24;
	public static boolean readingTod28;
	public static boolean readingTod30;
	public static boolean readingTod34;
	public static boolean readingTod38;
	public static boolean readingTod42;
	public static boolean readingTod45;
	public static boolean readingTod46b;
	public static boolean readingTod47;
	public static boolean readingTod50;
	public static boolean readingTod50a;
	public static boolean readingTod51;
	public static boolean readingTod51a;
	public static boolean readingTod53;
	public static boolean readingTod53a;
	public static boolean readingTod54;
	public static boolean readingTod54a;
	public static boolean readingTod54b;
	public static boolean readingTod55;
	public static boolean readingTod56;
	public static boolean readingTod59;
	public static boolean readingTod60;
	public static boolean readingTod61;
	public static boolean readingTod63;
	public static boolean readingTod64;
	public static boolean readingTod72;
	public static boolean readingTod74;
	public static boolean readingTod75;
	public static boolean readingTod67;
	public static boolean readingTod71;
	public static boolean readingTod79;
	public static boolean readingTod;
	public static boolean readingDream1;
	public static boolean readingMonkAnswer;
	public static boolean readingShingon1;
	public static boolean readingShingon2;
	public static boolean readingShingon3;
	public static boolean readingShingon4;
	public static boolean readingShingon5;
	public static boolean readingShingon6;
	public static boolean readingShingon7;
	public static boolean readingShingon8;
	public static boolean readingShingon9;
	public static boolean readingShingon10;
	public static boolean readingSamadhi1;
	public static boolean readingSamadhi2;
	
	public static int textSpeed = 38; 
	public static int defaultTextSpeed = 38; 
	public static int currentMessage = 1;
	public static int currentLine = 1;
	public static int messageLength;
	private static int numberOfMessages;
	
	public static StringBuilder textStringBuilder1 = new StringBuilder("");
	public static StringBuilder textStringBuilder2 = new StringBuilder("");
	public static StringBuilder textStringBuilder3 = new StringBuilder("");
	public static StringBuilder textStringBuilder4 = new StringBuilder("");
	
	
	public static String textLine1 = "";
	public static String textLine2 = "";
	public static String textLine3 = "";
	public static String textLine4 = "";
	
	public static final int LINE_LIMIT = 48;

	private static char[] textArray1 = new char[0];
	private static char[] textArray2 = new char[0];
	private static char[] textArray3 = new char[0];
	private static char[] textArray4 = new char[0];
	
	private static String text = "The"; // this exists for copy/paste coding purposes
	
	// G1N
	private static String textG1N1 = "The celebrated White Gravel and Pine Tree Garden";
	private static String textG1N2 = "of the Adachi Bigutsukan expands before you.";
	private static String textG1N3 = "Part of you yearns to stroll through the sand,"; 
	private static String textG1N4 = "but you know better than to disturb the"; 
	private static String textG1N5 = "cherished landscape.";

	// Mirror
	private static String textMirror1 = "The Chippendale mirror casts your reflection"; 
	private static String textMirror2 = "back at you. Your loosely kept beard fits your";
	private static String textMirror3Orange = "faded orange robe.";
	private static String textMirror3Purple = "faded purple robe.";
	private static String textMirrorDream1 = "back at you.";
	private static String textMirrorDream2 = "The glass casts your reflection back at you.";
	
	private static String textG9S = "The sign reads: \"Avalokitesvara Shrine.\"";
	
	private static String textG16N = "The sign reads: \"This is not an entrance.\"";
	
	private static String textG18WSign1 = "The sign reads: \"Please check both sides before"; 
	private static String textG18WSign2 = "resting on the sofa.\"";
	
	private static String textG27S1 = "A masked woman in a blue kimono standing behind";
	private static String textG27S2 = "the glass stares at you. Her stillness is";
	private static String textG27S3 = "inhuman, almost like a mannequin. You feel a";
	private static String textG27S4 = "strong sense of foreboding from the sight of her.";
	
	private static String textReaper1 = "\"What year did Palu write Post Radius?\"";
	private static String textReaper2 = "\"...Incorrect.\"";
	private static String textReaper3 = "\"How unfortunate.\"";
	private static String textReaper4 = "You feel a tap on your shoulder.";
	
	private static String textH1EBanner = "The banner reads: \"Altar of Samantabhadra.\"";
	
	private static String textH2N1 = "A strong feeling of foreboding discourages you"; 
	private static String textH2N2 = "from approaching the woman.";
	
	private static String textHouseGlass1 = "The glass casts your reflection back at you. Your";
	private static String textHouseGlass2 = "loosely kept beard fits your faded green robe.";
	
	private static String textH12E = "The sign reads: \"Fubakuan, tea ceremony room.\"";
	
	private static String textH15N1 = "The sign reads: \"Would you like some green tea?";
	private static String textH15N2 = "Please don't hesitate to ask. 300 yen.\"";
	
	private static String textT40W1 = "The stone carving reads: \"Commemoration: 2800";
	private static String textT40W2 = "years of service.\"";
	
	private static String textT38N1 = "The stone carving reads: \"The 33rd Stone";
	private static String textT38N2 = "Monument.\"";
	
	private static String textT28E = "You washed the statue.";
	
	private static String textLotus1 = "The sacred symbol of the 'Lotus Flower' is now";
	private static String textLotus2 = "memorized and available to visualize while";
	private static String textLotus3 = "meditating.";
	
	private static String textKnot1 = "The sacred symbol of the 'Endless Knot' is now";
	private static String textKnot2 = "memorized and available to visualize while"; 
	private static String textKnot3 = "meditating.";
	
	private static String textFish1 = "The sacred symbol of the 'Golden Fish' is now";
	private static String textFish2 = "memorized and available to visualize while"; 
	private static String textFish3 = "meditating.";
	
	private static String textT12N1 = "The stone reads: \"Tanigumisan\" (Kegon-ji"; 
	private static String textT12N2 = "Temple)";
	
	private static String textShop11 = "\"Ohayo gozaimasu. Welcome to our small Keon-ji";
	private static String textShop12 = "trinket shop.\"";
	
	private static String textShop13 = "\"Unfortunately, you've caught us during the off-";
	private static String textShop14 = "season. The only trinket we have in supply is a";
	private static String textShop15 = "broken scroll case. But I'll tell you what. If";
	private static String textShop16 = "you can figure out how to open the darn thing, I";
	
	private static String textShop17 = "will let you keep whatever you find inside. What"; 
	private static String textShop18 = "do you say?\"";
	
	private static String textShopSorry1 = "\"I'm sorry I can't help you.\"";
	private static String textShopTemple1 = "\"Is this your last temple, or are you going in";
	private static String textShopTemple2 = "reverse order? Are you not undertaking the";
	private static String textShopTemple3 = "Saigoku Kannon Pilgrimage? This is Kegon-ji, the"; 
	private static String textShopTemple4 = "thirty-third and final temple in the Pilgrimage."; 
	private static String textShopTemple5 = "The path after the main gate leading to the"; 
	private static String textShopTemple6 = "Hondo is quite long, and there are two smaller"; 
	private static String textShopTemple7 = "paths branching off from it. One path near the"; 
	private static String textShopTemple8 = "hondo leads to the residents' quarters, and the"; 
	private static String textShopTemple9 = "other leads to a smaller shrine near the main"; 
	private static String textShopTemple10 = "gate. Before you pray at the shrine in the"; 
	private static String textShopTemple11 = "Hondo, you can appreciate the carvings, our"; 
	private static String textShopTemple12 = "small shop, and some things that other pilgrims"; 
	private static String textShopTemple13 = "have left behind, such as the colorful paper"; 
	private static String textShopTemple14 = "cranes.\"";
	private static String textShopTempleHelp = "\"Is there anything else I can help you with?\"";
	private static String textShopSorry2a = "\"I'm sorry but your question is too broad for me"; 
	private static String textShopSorry2b = "to answer.\"";
	private static String textShopSayonara = "\"Sayonara.\"";
	private static String textShop21 = "\"I admit I am surprised to see you've managed to";
	private static String textShop22 = "open that contraption. I was going to ask how";
	private static String textShop23 = "you did it, but I'd rather figure it out myself";
	private static String textShop24 = "now. Feel free to keep that old scroll.\"";
	private static String textShop31 = "\"I'm not surprised you couldn't open that";
	private static String textShop32 = "contraption either. I mean, if I couldn't do it";
	private static String textShop33 = "after trying for three days, how could I expect";
	private static String textShop34 = "you to?\"";
	
	private static String textT45S1 = "A cold wind howls from this direction. You feel";
	private static String textT45S2 = "there is no purpose for you to walk down this";
	private static String textT45S3 = "street.";
	
	private static String textOk = "O.K.";
	
	private static String textNo = "No thanks.";
	
	private static String textOm1 = "The sacred word 'Om' is now memorized and";
	private static String textOm2 = "available to chant while meditating.";
	
	private static String textNi1 = "The sacred word 'Ni' is now memorized and";
	private static String textNi2 = "available to chant while meditating.";
	
	private static String textGo1 = "The sacred word 'Go' is now memorized and"; 
	private static String textGo2 = "available to chant while meditating.";
	
	private static String textYu1 = "The sacred word 'Yu' is now memorized and"; 
	private static String textYu2 = "available to chant while meditating.";
	
	private static String textJi1 = "The sacred word 'Ji' is now memorized and";
	private static String textJi2 = "available to chant while meditating.";
	
	private static String textRa1 = "The sacred word 'Ra' is now memorized and";
	private static String textRa2 = "available to chant while meditating.";
	
	private static String textShi1 = "The sacred word 'Shi' is now memorized and";
	private static String textShi2 = "available to chant while meditating.";
	
	private static String textT7N = "The sign reads: \"Butsudan of Kannon.\"";
	
	private static String textPhoneIncorrect1 = "\"We're sorry; we are unable to complete your";
	private static String textPhoneIncorrect2 = "call as dialed. Please check the number and dial";
	private static String textPhoneIncorrect3 = "again, or call your operator for assistance.\"";
	
	private static String textKimi1 = "\"Moshi moshi. This is Kimi, therapist and";
	private static String textKimi2 = "meditation instructor. What can I do for you?\"";
	private static String textKimi3 = "\"Haha. Is this a business call or a personal"; 
	private static String textKimi4 = "one?\"";
	private static String textKimi5 = "\"Then you've called the right number! Is it a";
	private static String textKimi6 = "remedy you seek? Or knowledge?\"";
	private static String textKimiR = "\"Is it a remedy you seek? Or knowledge?\"";
	private static String textKimi7 = "\"You're in luck! I provide a variety of";
	private static String textKimi8 = "therapies. Which one suits your needs?\"";
	private static String textKimi9 = "\"Excellent! Of course you need to schedule an";
	private static String textKimi10 = "appointment for this therapy. Does that work for"; 
	private static String textKimi11 = "you?\"";
	private static String textKimi12 = "\"OK, I have an opening next Sunday at noon. Does";
	private static String textKimi13 = "that work for you?\"";
	private static String textKimi14 = "\"OK, you're all set for a session next Sunday.";
	private static String textKimi15 = "Is there anything else I can help you with";
	private static String textKimi16 = "today?\"";
	private static String textKimi17 = "\"I'm sorry, but there's probably not much we can"; 
	private static String textKimi18 = "get done over the phone for that service. Is"; 
	private static String textKimi19 = "there anything else I can help you with today?\"";
	private static String textKimi20 = "\"Excellent. It's never too late to gain control"; 
	private static String textKimi21 = "over your mind. Were you calling to schedule an"; 
	private static String textKimi22 = "appointment for an in-depth lesson, or for a"; 
	private static String textKimi23 = "free phone consultation?\"";
	private static String textKimi24 = "\"Very well. I am always eager to share this"; 
	private static String textKimi25 = "treasured wisdom. As a henro of Saigoku Kannon,"; 
	private static String textKimi26 = "I can only speak of the tradition I know. For"; 
	private static String textKimi27 = "today's consultation, I'll brief you on our"; 
	private static String textKimi28 = "method of meditation. There are countless"; 
	private static String textKimi29 = "methods, but Sensei Kukai systematized the"; 
	private static String textKimi30 = "process and focused on the core elements in"; 
	private static String textKimi31 = "order to produce a result similar to what is"; 
	private static String textKimi32 = "written in the Amitayurdhyana Sutra. Those core"; 
	private static String textKimi33 = "elements are the breath, visualization, and the"; 
	private static String textKimi34 = "spoken mantra. Do not underestimate the value of"; 
	private static String textKimi35 = "any of the three elements, as they are all"; 
	private static String textKimi36 = "critical to shaping your mind to recieve the"; 
	private static String textKimi37 = "image Kukai writes so much about. You will find"; 
	private static String textKimi38 = "that breathing must always be consistent to"; 
	private static String textKimi39 = "allow your visualizations and mantras to dance"; 
	private static String textKimi40 = "freely. The powerful combination a symbol and a"; 
	private static String textKimi41 = "mantra will open the gates of your mind and"; 
	private static String textKimi42 = "reveal to you what was hiding behind the"; 
	private static String textKimi43 = "curtain. The Shingon are also particular about"; 
	private static String textKimi44 = "which visualization and mantra should be"; 
	private static String textKimi45 = "meditated upon at each temple. For example, a"; 
	private static String textKimi46 = "henro will chant the Heart Sutra at an altar of"; 
	private static String textKimi47 = "Samantabhadra, the Mantra of Light at a batsudan"; 
	private static String textKimi48 = "of Kannon, and the Gohogo Mantra at an"; 
	private static String textKimi49 = "Avalokitesvara shrine. These are the rites of a"; 
	private static String textKimi50 = "Shingon henro, and when practiced with"; 
	private static String textKimi51 = "sincerety, the henro will be one step closer"; 
	private static String textKimi52 = "towards enlightenment. I would be happy to speak"; 
	private static String textKimi53 = "more about this with you in person, but"; 
	private static String textKimi54 = "unfortunately I don't have anymore openings for"; 
	private static String textKimi55 = "an appointment. Is there anything else I can"; 
	private static String textKimi56 = "help you with today?\"";
	private static String textKimi57 = "\"Hmm. You might have the wrong number. I offer"; 
	private static String textKimi58 = "healing and learning services. If this is not"; 
	private static String textKimi59 = "what you called for, I'm sorry.\"";
	private static String textKimi60 = "\"Dewa mata.\"";
	private static String textKimiBooked1 = "\"Unfortunately I don't have anymore openings.";
	private static String textKimiBooked2 = "Is there anything else I can help you with";
	private static String textKimiBooked3 = "today?\"";
	
	private static String textDead1 = "There is no available ningyo to recieve your";
	private static String textDead2 = "spirit.";
	
	private static String textTod1 = "\"What the heck did you do?\"";
	private static String textTod2 = "\"My power has been out for three days, but"; 
	private static String textTod3 = "suddenly it turns back on when you show up at my"; 
	private static String textTod4 = "door.\""; 
	private static String textTod4a = "\"Well.. if you didn't do anything, this remains"; 
	private static String textTod5 = "quite a mystery. Maybe you have just brought good"; 
	private static String textTod6 = "luck to me!\""; 
	private static String textTod7 = "\"Please, come in to my home and let me make you a";
	private static String textTod7a = "cup of tea.\"";
	private static String textTod8 = "\"The tea should have cooled off by now. It's"; 
	private static String textTod9 = "nice to have some company over every now and"; 
	private static String textTod10 = "then. My name is Hisachi Ichiro, by the way.\"";
	private static String textTod11 = "\"Upon finishing my journey as a henro, I felt a"; 
	private static String textTod12 = "deep connection to the woods here at Kegon-Ji. I"; 
	private static String textTod13 = "suppose I felt that it was the purpose of my life"; 
	private static String textTod14 = "to remain here and maintain this temple."; 
	private static String textTod15 = "This simple life has brought me peace, and I am";
	private static String textTod16 = "happy.\"";
	private static String textTod17 = "\"Curiously, three days ago my power had been cut"; 
	private static String textTod18 = "off. That same morning, I noticed that someone"; 
	private static String textTod19 = "had installed a wooden post beside my slate with"; 
	private static String textTod20 = "a strange metal plaque. The correlation was"; 
	private static String textTod21 = "obvious. The device was somehow interfering with"; 
	private static String textTod22 = "my electricity. None of the other residents were";
	private static String textTod23 = "much help with solving this conundrum."; 
	private static String textTod24 = "There was also a scroll I found at my door that"; 
	private static String textTod25 = "day. Although it seems irrelevant, it still adds"; 
	private static String textTod26 = "to my confusion. But with your appearance today,"; 
	private static String textTod27 = "suddenly my lights turned back on, and my heater"; 
	private static String textTod28 = "started humming again. Curious, indeed.\""; 
	private static String textTod29 = "";
	private static String textTod30 = "\"It was left at my door three days ago. It seems"; 
	private static String textTod31 = "to be a Shingon scroll portraying a sacred"; 
	private static String textTod32 = "syllable for a mantra. I have derived no meaning"; 
	private static String textTod33 = "from it but I keep it regardless. I see your"; 
	private static String textTod34 = "interest in the scroll. Perhaps you will find a"; 
	private static String textTod35 = "better use with it than I, but I will not part"; 
	private static String textTod36 = "with it so quickly. Perhaps you would do me one"; 
	private static String textTod37 = "last favor in exchange for the scroll? Apart"; 
	private static String textTod38 = "from maintaining the temple grounds, I aspire to"; 
	private static String textTod39 = "help Shingon disciples to reach a greater depth"; 
	private static String textTod40 = "in their mind during their medatative practice,"; 
	private static String textTod41 = "namely by the use of hypnosis. A light sedative,"; 
	private static String textTod42 = "which I have used as an ingredient in the tea"; 
	private static String textTod43 = "that you've been neglecting, goes a little way in"; 
	private static String textTod43a = "that you've been enjoying, goes a little way in"; 
	private static String textTod44 = "helping my hypnosis kick off.\""; 
	private static String textTod45 = "\"Will you allow me to put you in a light trance";
	private static String textTod46 = "so I can test my method? In return, you may have";
	private static String textTod46a = "the scroll.\"";
	private static String textTod46b = "\"Excellent. Now, if I could just have you close";
	private static String textTod46c = "your eyes for me.\"";
	private static String textTod47 = "\"Good. Now I want you to focus on my voice. I am"; 
	private static String textTod48 = "going to count to five. When I get to five, you"; 
	private static String textTod49 = "will settle into a deep meditative dream state.\""; 
	private static String textTod50 = "\"One.\""; 
	private static String textTod50a = "\"You feel yourself starting to slip away.\"";
	private static String textTod51 = "\"Two.\""; 
	private static String textTod51a = "\"You still hear my voice, but you feel you are"; 
	private static String textTod52 = "moving very far away.\""; 
	private static String textTod53 = "\"Three...\"";
	private static String textTod53a = "\"You are very far away.\"";
	private static String textTod54 = "\"Four...\""; 
	private static String textTod54a = "\"Everything is black. You are removed.\""; 
	private static String textTod54b = "\"Five...\"";
	private static String textTod55 = "\"You're late.\"";
	private static String textTod56 = "\"Luckily for us, our target has followed you";
	private static String textTod57 = "here. Ambushes are always easier to execute than";
	private static String textTod58 = "a hunt.\"";
	private static String textTod59 = "\"This guy is all yours. Here, take this.\"";
	private static String textTod60 = "Obtained pistol.";
	private static String textTod61 = "\"One last thing. Check to make sure that he is";
	private static String textTod62 = "not a bodhisattva before you finish him.\"";
	private static String textTod63 = "\"Now go.\"";
	private static String textTod64 = "\"The chest won't open until you complete this"; 
	private static String textTod65 = "job.\"";
	private static String textTod66 = "\"Now go.\"";
	private static String textTod67 = "\"Hmm. That's not right. You woke up prematurely."; 
	private static String textTod68 = "And you looked pretty uncomfortable throughout"; 
	private static String textTod69 = "the hypnosis also. Understand that whatever you"; 
	private static String textTod70 = "just went through wasn't real.\"";
	private static String textTod71 = "\"I do apologize if you experienced anything";
	private static String textTod76 = "unpleasant. I suppose my experiment served its";
	private static String textTod77 = "purpose, although I have some improvements to";
	private static String textTod78 = "make.\"";
	private static String textTod79 = "\"Here's the scroll. I hope you somehow find it";
	private static String textTod80 = "useful. Thank you again for all of your help.\"";
	private static String textTod72 = "\"Ah, have you run out of time? Thank you kindly";
	private static String textTod73 = "for your visit.\"";
	private static String textTod74 = "\"I apologize. It was inappropriate of me to ask.\"";
	private static String textTod75 = "\"I can't claim to know what you are talking about.\"";
	
	private static String textDream1 = "You hear yourself ask, \"What year did Paul write";
	private static String textDream2 = "Post Radius?\"";
	
	public static String textMonkAnswer = "";
	public static String textPostRadiusYear = "";
	public static StringBuilder monkAnswer = new StringBuilder("");
	public static StringBuilder postRadiusYear = new StringBuilder("");
	public static String quotationMark = "\"";
	public static String period = ".";
	
	private static String textDarkness1 = "It's difficult to see in the darkness, but you";
	private static String textDarkness2 = "may have seen some movement behind the wooden";
	private static String textDarkness3 = "frame.";
	
	private static String textShingon1 = "\"Konnichiwa. My name is Kiyoshi Mikami. This is";
	private static String textShingon2 = "my introduction to Shingon video.\"";
	
	private static String textShingon3 = "\"The name 'Shingon' means 'true word,' referring";
	private static String textShingon4 = "to the mantra or the chanting that's used in the";
	private static String textShingon5 = "practice.\"";
	
	private static String textShingon6 = "\"Shingon was first brought to Japan from China";
	private static String textShingon7 = "in 804 A.D. by Kukai. One fundamental principle";
	private static String textShingon8 = "is the belief that you can attain buddahood in";
	private static String textShingon9 = "this life without reincarnation.\"";
	
	private static String textShingon10 = "\"The idea is to break down the mental barrier";
	private static String textShingon11 = "between yourself and the universe and realize";
	private static String textShingon12 = "oneness. All of the strength and wisdom of the"; 
	private static String textShingon13 = "universe becomes yours after this realization.\"";
	
	private static String textShingon14 = "\"The practice of prana, mandala, and mantra is";
	private static String textShingon15 = "called sanmitsu. Prana is the breath, which";
	private static String textShingon16 = "must precede all else. Mandala is the concept of"; 
	private static String textShingon17 = "visualization, and mantra is chanting.\"";
	
	private static String textShingon18 = "\"Bring those three together as one. Pair"; 
	private static String textShingon19 = "mandalas to their sister mantra to enhance their"; 
	private static String textShingon20 = "power. Traditional pairings include the Conch";
	private static String textShingon21 = "Shell with the Celestial Sutra, the Golden Fish";
	
	private static String textShingon22 = "with the Mantra of Light, the Endless Knot with"; 
	private static String textShingon23 = "the Gohogo Mantra, the Wheel of Dharma with the"; 
	private static String textShingon24 = "Mantra of Jambi, the Lotus Flower with the Heart"; 
	private static String textShingon25 = "Sutra... The list goes on.\"";
	
	private static String textShingon26 = "\"This is the process to achieve oneness and to"; 
	private static String textShingon27 = "recieve the aid from your deity. You must"; 
	private static String textShingon28 = "destroy parts of yourself at times if you are to"; 
	private static String textShingon29 = "maintain inner balance.\"";
	
	private static String textShingon30 = "\"You will start to merge with it and become one"; 
	private static String textShingon31 = "with it, and from there, you merge with the"; 
	private static String textShingon32 = "universe.\"";
	
	private static String textShingon33 = "\"Thank you and namaste.\"";

	private static String textMeditating1 = "You are now meditating."; 
	private static String textMeditating2 = "Do you wish to breathe, visualize, or chant?";
	private static String textMeditating3 = "You can also save, load, or exit the game."; 
	private static String textMeditating4 = "Say \"stop\" to open your eyes."; 
	
	private static String textMeditating5 = "What symbol do you wish to visualize?"; 
	private static String textMeditating6 = "You haven't memorized any sacred symbols."; 
	private static String textMeditating7 = "What do you wish to chant?"; 
	private static String textMeditating8 = "You haven't memorized any sacred words."; 

	private static String textInventoryEmpty = "There are no items in your inventory."; 
	private static String textInventoryDark = "It's too dark to adequately examine your inventory."; 
	
	private static String textError1 = "Invalid entry."; 
	private static String textErrorChant = "You haven't memorized that word."; 

	private static String textTVPlaying = "The VCR is already playing."; 
	private static String textTVRW1 = "The tape has finished rewinding."; 
	private static String textTVRW2 = "The tape is already at the beginning."; 
	private static String textTVFF1 = "The tape has finished fast-forwarding."; 
	private static String textTVFF2 = "Nothing happens."; 
	
	private static String textCorn1 = "What do you want to do with the corn?"; 
	private static String textCorn2 = "It tastes like corn."; 
	private static String textCorn3 = "It smells corny."; 
	private static String textCorn4 = "You attach the corn to the fishing rod."; 
	
	private static String textGetScroll = "Obtained scroll."; 
	private static String textGetRod = "Obtained fishing rod."; 
	private static String textGetPaper = "Obtained gold paper."; 
	private static String textGetCorn = "Obtained corn."; 
	private static String textTooDarkPaper = "It's too dark to adequately examine this paper."; 
	private static String textDarkMan1 = "It's difficult to see in the darkness, but it";
	private static String textDarkMan2 = "looks like a mannequin dressed in traditional";
	private static String textDarkMan3 = "Chinese clothing is positioned here."; 
	private static String textDarkMan4 = "It's difficult to see in the darkness, but it";
	private static String textDarkMan5 = "looks like mannequins dressed in traditional";
	private static String textDarkMan6 = "Chinese clothing are positioned here."; 
	
	private static String textTrance1 = "\"How is it when a practitioner goes along a";
	private static String textTrance2 = "narrow path?\"";
	private static String textTrance3 = "\"You will meet a deadly snake on the great road.";
	private static String textTrance4 = "I advise you not to run into it.\"";
	private static String textTrance5 = "\"What if I do run into it?\"";
	private static String textTrance6 = "\"You will lose your life.\"";
	private static String textTrance7 = "\"What if I don't run into it?\"";
	private static String textTrance8 = "\"You have no place to escape from it.\"";
	private static String textTrance9 = "\"Precisely at such a time, what then?\"";
	private static String textTrance10 = "\"It is lost.\"";
	private static String textTrance11 = "\"I wonder where it is gone.\"";
                                         	
	private static String textTrance12 = "\"What will happen when the leaves fall and the";
	private static String textTrance13 = "trees become bare?\"";
	private static String textTrance14 = "\"The golden wind.\"";
	private static String textTrance15 = "\"What do you mean?\"";
	private static String textTrance16 = "\"The trunk becomes visible in the autumn wind.\"";
                                         		
	private static String textTrance17 = "\"Where are you going?\"";
	private static String textTrance18 = "\"I am on pilgrimage, following the wind.\"";
	private static String textTrance19 = "\"What are you on pilgrimage for?\"";
	private static String textTrance20 = "\"I don't know.\"";
	private static String textTrance21 = "\"Non-knowing is most intimate.\"";
	private static String textTrance22 = "\"What year did Palu write Post Radius?\"";
	
	private static String textSamadhi1 = "\"Moushiwake arimasen. My upmost apologies. Only";
	private static String textSamadhi2 = "a bodhisattva could have found the answer within";
	private static String textSamadhi3 = "themself.\"";
	
	private static String textSamadhi4 = "\"I believe you and I may walk parallel paths.";
	private static String textSamadhi5 = "Let us perform sanmitsu together, and strive to";
	private static String textSamadhi6 = "reach the end of this journey. Close your eyes,"; 
	private static String textSamadhi7 = "and I will guide you to samadhi.\"";
	private static String textSamadhi8 = "Press and hold to focus.";
	
	public static String credits1 = "";
	public static String credits2 = "";
	public static String credits3 = "";
	public static String credits4 = "";
	public static String credits5 = "";
	public static String credits6 = "";
	public static String credits7 = "";
	public static String credits8 = "";
	public static String credits9 = "";
	public static String credits10 = "";
	public static String credits11 = "";
	public static String credits12 = "";
	public static String credits13 = "";
	public static String credits14 = "";
	public static String credits15 = "";
	public static String credits16 = "";
	public static String credits17 = "";
	public static String credits18 = "";
	public static String credits19 = "";
	public static String credits20 = "";
	public static String credits21 = "";
	public static String credits22 = "";
	public static String credits23 = "";
	public static String credits24 = "";
	public static String credits25 = "";
	public static String credits26 = "";
	public static String credits27 = "";
	public static String credits28 = "";
	public static String credits29 = "";
	public static String credits30 = "";
	public static String credits31 = "";
	public static String credits32 = "";
	public static String credits33 = "";
	public static String credits34 = "";
	public static String credits35 = "";
	public static String credits36 = "";
	public static String credits37 = "";
	public static String credits38 = "";
	public static String credits39 = "";
	public static String credits40 = "";
	public static String credits41 = "";
	public static String credits42 = "";
	public static String credits43 = "";
	public static String credits44 = "";
	public static String credits45 = "";
	public static String credits46 = "";
	public static String credits47 = "";
	public static String credits48 = "";
	public static String credits49 = "";
	public static String credits50 = "";
	public static String credits51 = "";
	public static String credits52 = "";
	public static String credits53 = "";
	public static String credits54 = "";
	public static String credits55 = "";
	public static String credits56 = "";
	public static String credits57 = "";
	public static String credits58 = "";
	public static String credits59 = "";
	public static String credits60 = "";
	public static String credits61 = "";
	public static String credits62 = "";
	public static String credits63 = "";
	public static String credits64 = "";
	public static String credits65 = "";
	public static String credits66 = "";
	public static String credits67 = "";
	public static String credits68 = "";
	public static String credits69 = "";
	public static String credits70 = "";
	public static String credits71 = "";
	public static String credits72 = "";
	public static String credits73 = "";
	public static String credits74 = "";
	public static String credits75 = "";
	
	public static void readMessage() {
		Animation.openingMessage = true;
		Player.readingMessage = true;
	}
	
	private static void prepText() {
		displayingText = true;
		
		wipeText();		
	}
	
	private static void wipeText() {
		textStringBuilder1.setLength(0); 
		textStringBuilder2.setLength(0); 
		textStringBuilder3.setLength(0); 
		textStringBuilder4.setLength(0); 
		textLine1 = ""; 
		textLine2 = ""; 
		textLine3 = ""; 
		textLine4 = ""; 
		textArray1 = new char[0];
		textArray2 = new char[0];
		textArray3 = new char[0];
		textArray4 = new char[0];
	}
	
	/** Prepares the next text */
	public static void nextText() {
		if (!typing && (currentMessage == numberOfMessages)) {
			closeMessage();
		}
		
		if (!typing && !Player.busy && (currentMessage <= numberOfMessages)) {
			currentMessage++;
			
			// THESE MUST ALL BE IN REVERSE ORDER, otherwise I get "pplleeaassee"
			
			if (readingMeditating4 || readingMeditating6) {
				readMeditating1();
			}
			
			if (readingSamadhi1) {
				readingSamadhi1 = false;
				readSamadhi2();
			}
			
			if (readingTrance20) {
				readingTrance20 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay * 2,98);
			}
			
			if (readingTrance19) {
				readingTrance19 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay * 2,97);
			}
			
			if (readingTrance18) {
				readingTrance18 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,96);
			}
			
			if (readingTrance17) {
				readingTrance17 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,95);
			}
			
			if (readingTrance16) {
				readingTrance16 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,94);
			}
			
			if (readingTrance15) {
				readingTrance15 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,93);
			}
			
			if (readingTrance13) {
				readingTrance13 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,91);
			}
			
			if (readingTrance12) {
				readingTrance12 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,90);
			}
			
			if (readingTrance11) {
				readingTrance11 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,89);
			}
			
			if (readingTrance8) {
				readingTrance8 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,87);
			}
			
			if (readingTrance7) {
				readingTrance7 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,86);
			}
			
			if (readingTrance6) {
				readingTrance6 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,85);
			}
			
			if (readingTrance5) {
				readingTrance5 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,84);
			}
			
			if (readingTrance4) {
				readingTrance4 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,83);
			}
			
			if (readingTrance3) {
				readingTrance3 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,82);
			}
			
			if (readingTrance2) {
				readingTrance2 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,81);
			}
			
			if (readingTrance1) {
				readingTrance1 = false;
				displayingText = false;
				Player.setBusy(true);
				Animation.setWait(World.tranceDelay,80);
			}
			
			if (readingG1N) {
				readG1N2();
				readingG1N = false;
			}
			
			if (readingShopSorry1 || readingShopSorry2) {
				readingShopSorry1 = false;
				readingShopSorry2 = false;
				readShopTempleHelp();
			}
			
			if (readingShingon9) {
				readShingon10();
				readingShingon9 = false;
			}
			
			if (readingShingon8) {
				readShingon9();
				readingShingon8 = false;
			}
			
			if (readingShingon7) {
				readShingon8();
				readingShingon7 = false;
			}
			
			if (readingShingon6) {
				readShingon7();
				readingShingon6 = false;
			}
			
			if (readingShingon5) {
				readShingon6();
				readingShingon5 = false;
			}
			
			if (readingShingon4) {
				readShingon5();
				readingShingon4 = false;
			}
			
			if (readingShingon3) {
				readShingon4();
				readingShingon3 = false;
			}
			
			if (readingShingon2) {
				readShingon3();
				readingShingon2 = false;
			}
			
			if (readingShingon1) {
				readShingon2();
				readingShingon1 = false;
			}
			
			if (readingMirror1){
				//readMirror1();
			}
			
			if (Player.meditating && readingError){
				readingError = false;
				readMeditating1();
			}
			
			if (Player.meditating && readingErrorChant){
				readingErrorChant = false;
				readMeditating1();
			}
			
			if (readingShop12b) {
				readShop13b();
				readingShop12b = false;
			}
			
			if (readingShop12) {
				readShop13();
				readingShop12 = false;
			}
			
			if (readingShop11) {
				readShop12();
				readingShop11 = false;
			}
			
			if (readingShopTemple13) {
				readingShopTemple13 = false;
				readShopTempleHelp();
			}
			
			if (readingShopTemple9) {
				readingShopTemple9 = false;
				readShopTemple13();
			}
			
			if (readingShopTemple5) {
				readingShopTemple5 = false;
				readShopTemple9();
			}
			
			if (readingShopTemple1) {
				readingShopTemple1 = false;
				readShopTemple5();
			}
			
			if (readingKimiWrongNumber) {
				readKimiR();
				readingKimiWrongNumber = false;
			}
			
			if (readingKimi52) {
				readKimi56();
				readingKimi52 = false;
			}
			
			if (readingKimi48) {
				readKimi52();
				readingKimi48 = false;
			}
			
			if (readingKimi44) {
				readKimi48();
				readingKimi44 = false;
			}
			
			if (readingKimi40) {
				readKimi44();
				readingKimi40 = false;
			}
			
			if (readingKimi36) {
				readKimi40();
				readingKimi36 = false;
			}
			
			if (readingKimi32) {
				readKimi36();
				readingKimi32 = false;
			}
			
			if (readingKimi28) {
				readKimi32();
				readingKimi28 = false;
			}
			
			if (readingKimi24) {
				readKimi28();
				readingKimi24 = false;
			}
			
			if (readingTod71) {
				readTod79();
				readingTod71 = false;
			}
			
			if (readingTod67) {
				readTod71();
				readingTod67 = false;
			}
			if (readingTod64) {
				readTod66();
				readingTod64 = false;
			}
			
			if (readingTod61) {
				readTod63();
				readingTod61 = false;
			}
			
			if (readingTod60) {
				Player.inventoryList.add(Item.gun);
				readTod61();
				readingTod60 = false;
			}
			
			if (readingTod59) {
				readTod60();
				Audio.startEquip2();
				readingTod59 = false;
			}
			
			if (readingTod56) {
				readTod59();
				readingTod56 = false;
			}
			
			if (readingTod55) {
				readTod56();
				readingTod55 = false;
			}
			
			if (readingTod54a) {
				readTod54b();
				readingTod54a = false;
			}
			
			if (readingTod54) {
				readTod54a();
				readingTod54 = false;
			}
			
			if (readingTod53a) {
				readTod54();
				readingTod53a = false;
			}
			
			if (readingTod53) {
				readTod53a();
				readingTod53 = false;
			}
			
			if (readingTod51a) {
				readTod53();
				readingTod51a = false;
			}
			
			if (readingTod51) {
				readTod51a();
				readingTod51 = false;
			}
			
			if (readingTod50a) {
				readTod51();
				readingTod50a = false;
			}
			
			if (readingTod50) {
				readTod50a();
				readingTod50 = false;
			}
			
			if (readingTod47) {
				readTod50();
				readingTod47 = false;
			}
			
			if (readingTod38) {
				readTod42();
				readingTod38 = false;
			}
			
			if (readingTod34) {
				readTod38();
				readingTod34 = false;
			}
			
			if (readingTod30) {
				readTod34();
				readingTod30 = false;
			}
			
			if (readingTod24) {
				readTod28();
				readingTod24 = false;
			}
			
			if (readingTod21) {
				readTod24();
				readingTod21 = false;
			}
			
			if (readingTod17) {
				readTod21();
				readingTod17 = false;
			}
			
			if (readingTod11) {
				readTod15();
				readingTod11 = false;
			}
			
			if (readingTod4a) {
				readTod7();
				readingTod4a = false;
			}

			if (readingTod2) {
				readTod4a();
				readingTod2 = false;
			}
			
			
		}
		
		if (Keyboard.typingInput) 
			closeMessage();
			
		if (typing && !Player.inTrance && !readingTod53 && !readingTod54 && !readingTod54b) 
			skipText();
	}
	
	public static void skipText() {
		setTextSpeed(1);
	}
	
	public static void closeMessage() {
		displayingText = false;
		currentMessage = 1;
		// turn off all booleans
		readingG1N = false;
		readingG1N2= false;
		readingMirror1 = false;
		readingReaper1 = false;
		readingReaperUnknown = false;
		World.todStatus = "content";
		
		// only in tod's house do we allow typingInput after closeMessage... for now
		if (!Player.position.equals("tod")) {
			Keyboard.typingInput = false;
		}
		
		//System.out.println("closeMessage() may Keyboard.wipeKeyboardInput()");
		Keyboard.wipeKeyboardInput();
		lastText = false;
		currentMessage = 1;
		numberOfMessages = 0;
		
		Animation.closingMessage = true;
		
		if (dewaMata) {
			Item.wipePhoneNumber();
			Item.ringing = false;
			Audio.stopPhone();				
			Animation.loweringPhone = true;
			dewaMata = false;
		}
		
		if (readingTod1) {
			readingTod1 = false;
			Animation.todAppears = false;
			Animation.todPeaking = false;
			Animation.todWalking1 = true;
			ImagePanel.image2Height = (int)(Bunraku.height * .8);
			ImagePanel.image2Width = (int)(Bunraku.width * .8);
			ImagePanel.image2X = -100;
			ImagePanel.image2Y = 22;
			Animation.tick = 1;
			Animation.setMovement(2, 0, 0, Bunraku.width, Bunraku.height, 777);
		}
		
		if (readingTod7) {
			readingTod7 = false;
			Animation.todInviting = false;
			Animation.todContent = true;
			Animation.setFadeRate(2);
			ImagePanel.opacity = 0;
			Animation.fadingOut = true;
			Player.setBusy(true);
		}
		
		if (readingTod8) {
			readingTod8 = false;
		}
	}

	public static int getCurrentLineSize() {
		switch (currentLine) {
			case 1:
				return textStringBuilder1.length();
			case 2:
				return textStringBuilder2.length();
			case 3:
				return textStringBuilder3.length();
			case 4:
				return textStringBuilder4.length();
			default:
				return 0;
		}
	}
	
	public static void setCurrentLine() {
		
		if (currentLine == 5)
			currentLine = 1;
		
		//scanForSpace();
	}
	
	public static void setTextSpeed(int s) {
		textSpeed = s;
	}
	
	public static void appendArray() {
		//append StringBuilder with array and assign to String to be displayed in ImagePanel
		while (typing && (currentMessage <= numberOfMessages)) {
			// types first line
			for (int i = 0; i < textArray1.length; i++) {
				textStringBuilder1.append(textArray1[i]);
				textLine1 = textStringBuilder1.toString();
						
				try {
					Thread.sleep(textSpeed); // Controls text typing delay/speed
				} catch (InterruptedException e) { 
					Thread.currentThread().interrupt();
				}
			} 
					
			// types the second line		
			for (int i = 0; i < textArray2.length; i++) {
				textStringBuilder2.append(textArray2[i]);
				
				textLine2 = textStringBuilder2.toString();
						
						
				try {
					Thread.sleep(textSpeed); // Controls text typing delay/speed
				} catch (InterruptedException e) { 
					Thread.currentThread().interrupt();
				}
			}
					
			// types third line
			for (int i = 0; i < textArray3.length; i++) {
				textStringBuilder3.append(textArray3[i]);
				
				textLine3 = textStringBuilder3.toString();
				
				
				try {
					Thread.sleep(textSpeed); // Controls text typing delay/speed
				} catch (InterruptedException e) { 
					Thread.currentThread().interrupt();
				}
			}
			
			// types fourth line
			for (int i = 0; i < textArray4.length; i++) {
				textStringBuilder4.append(textArray4[i]);
				
				textLine4 = textStringBuilder4.toString();
							
				try {
					Thread.sleep(textSpeed); // Controls text typing delay/speed
				} catch (InterruptedException e) { 
					Thread.currentThread().interrupt();
				}
			}
			
			typing = false;
			//System.out.println("message done");
			
			// does what needs to be done when message ends, depending on circumstances
			eventAfterMessage();
			
		}			
	}
	
	public static void eventAfterMessage() {
		if (readingKimi1
			|| readingKimi2
			|| readingKimi3
			|| readingKimiR
			|| readingKimiBooked
			|| readingKimi9
			|| readingKimi12
			|| readingKimi14
			|| readingKimi17
			|| readingKimi20
			|| readingKimi56
			|| readingReaper1
			|| readingTod45
			|| readingMeditating1
			|| readingMeditating3
			|| readingMeditating5
			|| readingCorn1
			|| readingShopHelp
			|| readingShop13) {
				//System.out.println("event after message");
				Keyboard.startInput();
		}
	}
	
	public static void eventAfterCloseMessage() {
		World.scrollCloseable = true;
		
		if (Player.onPhone)
			Player.setDisableWalk(false);
		
		if (Player.saving) {
			ImagePanel.imageMessageX = Bunraku.width;
			Player.readingMessage = false;
			Animation.setWait(25,108);
		}
		
		if (Player.loading) {
			ImagePanel.imageMessageX = Bunraku.width;
			Player.readingMessage = false;
			Animation.setWait(25,112);
		}
		
		if (Player.exiting) {
			ImagePanel.imageMessageX = Bunraku.width;
			Player.readingMessage = false;
			System.out.println("Message said exit");
			Animation.setWait(25,113);
		}
		
		if (readingKnot) {
			readingKnot = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			Player.cantLeaveKnot = false;
		}
		
		if (Player.examiningOm) {
			Player.memorizedOm = true;
		}
		
		if (Player.examiningNi) {
			Player.memorizedNi = true;
		}
		
		if (Player.examiningGo) {
			Player.memorizedGo = true;
		}
		
		if (Player.examiningYu) {
			Player.memorizedYu = true;
		}
		
		if (Player.examiningJi) {
			Player.memorizedJi = true;
		}
		
		if (Player.examiningRa) {
			Player.memorizedRa = true;
		}
		
		if (Player.examiningShi) {
			Player.memorizedShi = true;
		}
		
		if (Player.breathing) {
			Player.setBusy(true);
			Audio.startBreathe();
			Animation.setWait(180,20);
		}
			
		if (readingReaper4) {
			// turn to temple reaper
			readingReaper4 = false;
			World.reaperTapped = true;
			ClickLeft.turnLeft();
			ImagePanel.imageOutgoing2X = 400;
			ImagePanel.image2X = 0;
		}
		
		if (readingReaper2 || readingReaper3 || Animation.reaperAngry) {
			// incorrect bang
			readingReaper2 = false;
			Message.readingReaper3 = false;
			Animation.reaperAngry = false;
			
			if (Player.position.equals("h2w")) {
				Animation.setWait(20,77);
			} else {
				Animation.setWait(20,13);
			}
		}
		
		if (readingScroll) {
			readingScroll = false;
			Player.setDisableWalk(false);
		}
		
		if (readingTod79) {
			readingTod79 = false;
			Player.setBusy(true);
			Player.setDisableWalk(true);
			ImagePanel.opacity = 0;
			Animation.setFadeRate(3);
			Animation.fadingOut = true;
			Player.leavingTods = true;
			Data.restorePurpleInventory();
			Player.hasShi = true;
			Player.inventoryList.add(Item.shi);
			
			while (!Player.inventoryList.get(0).equals(Item.shi)) {
				System.out.println(Player.inventoryList);
				Item.inventoryShiftRight();
			}
			
			System.out.println(Player.inventoryList);
			
			ImagePanel.resetImages();
			World.XOO = true;
			World.resetBulbs();
		}
		
		if (Message.readingDead) {
			Message.readingDead = false;
			Animation.setWait(25,16);
		}
		
		if (readingShop3) {
			Message.readingShop3 = false;
			Animation.shopKeeperLeaving = true;
		}
		
		if (readingShopBye) {
			Message.readingShopBye = false;
			Animation.shopKeeperLeaving = true;
		}
		
		if (Message.readingShop2) {
			Message.readingShop2 = false;
			Animation.shopKeeperLeaving = true;
		}
		
		if (Player.position.equals("tod")) {
			if (!Message.readingTod42 && !Player.dreaming){
				Keyboard.startInput();
			}
		}
		
		if (Message.readingTod42) {
			Message.readingTod42 = false;
			World.todStatus = "sipping1";
			Animation.todSipping1 = true;
		}
		
		if (Message.readingTod46b) {
			Message.readingTod46b = false;
			Keyboard.typingInput = false;
			ImagePanel.eyelid1Y = -416;
			ImagePanel.eyelid2Y = 416;
			Animation.closingEyes = true;
		}
		
		if (Message.readingTod54b) {
			Message.readingTod54b = false;
			Keyboard.typingInput = false;
			
			Animation.setWait(80,12);
		}
		
		if (Message.readingTod72) {
			Message.readingTod72 = false;
			Player.leavingTods = true;
			Animation.setFadeRate(2);
			ImagePanel.opacity = 0;
			Keyboard.typingInput = false;
			Animation.fadingOut = true;
		}
		
		if (readingDream1) {
			readingDream1 = false;
			Animation.setWait(35,64);
		}
		
		if (readingMonkAnswer) {
			readingMonkAnswer = false;
			Player.setBusy(false);
			Player.setDisableWalk(false);
			//Animation.setWait(35,67);
		}
		
		if (Message.readingTooDarkPaper) {
			Message.readingTooDarkPaper = false;
			Animation.loweringGoldPaper = true;
		}
		
		if (readingShingon10) {
			readingShingon10 = false;
			Animation.movingKiyoshiRight = true;
		}
	
		if (readingTrance9) {
			displayingText = false;
			readingTrance9 = false;
			Animation.setFadeRate(1);
			Player.setBusy(true);
			Animation.setWait(World.tranceDelay,88);
		}
		
		if (readingTrance14) {
			readingTrance14 = false;
			displayingText = false;
			Player.setBusy(true);
			Animation.setWait(World.tranceDelay,92);
		}
		
		if (readingTrance21) {
			displayingText = false;
			readingTrance21 = false;
			Animation.setFadeRate(1);
			Player.setBusy(true);
			Animation.setWait(World.tranceDelay,88);
		}
		
		if (readingSamadhi2) {
			readingSamadhi2 = false;
			Animation.setWait(60,102);
		}
		
		if (!Keyboard.typingInput)
			Keyboard.justSubmitedInput = false;
	}
	
	public static void startThread() {
		Thread thread = new Message();
		thread.start();	
	}
	
	/** Run text */
	public static void readMeditating1() {
		setTextSpeed(defaultTextSpeed);
		Player.readingMessage = true;
		readingMeditating1 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textMeditating1.toCharArray();
		textArray2 = textMeditating2.toCharArray();
		textArray3 = textMeditating3.toCharArray();
		textArray4 = textMeditating4.toCharArray();
	}
	
	public static void readMeditating3() {
		Player.readingMessage = true;
		readingMeditating3 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textMeditating5.toCharArray();
	}
	
	public static void readMeditating4() {
		Player.readingMessage = true;
		readingMeditating4 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage =1;
	
		textArray1 = textMeditating6.toCharArray();
	}
	
	public static void readMeditating5() {
		setTextSpeed(1);
		Player.readingMessage = true;
		readingMeditating5 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textMeditating7.toCharArray();
	}
	
	public static void readMeditating6() {
		Player.readingMessage = true;
		readingMeditating6 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage =1;
	
		textArray1 = textMeditating8.toCharArray();
	}
	
	public static void readTooDarkPaper() {
		Player.readingMessage = true;
		readingTooDarkPaper = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTooDarkPaper.toCharArray();
	}
	
	public static void readDarkMan1() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textDarkMan1.toCharArray();
		textArray2 = textDarkMan2.toCharArray();
		textArray3 = textDarkMan3.toCharArray();
	}
	
	public static void readDarkMan2() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textDarkMan4.toCharArray();
		textArray2 = textDarkMan5.toCharArray();
		textArray3 = textDarkMan6.toCharArray();
	}
	
	public static void readGetScroll() {
		Player.readingMessage = true;
		prepText();
		readingScroll = true;
		Audio.startEquip2();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textGetScroll.toCharArray();
	}
	
	public static void readGetRod() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textGetRod.toCharArray();
	}
	
	public static void readGetPaper() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textGetPaper.toCharArray();
	}
	
	public static void readGetCorn() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textGetCorn.toCharArray();
	}

	public static void readTVPlaying() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTVPlaying.toCharArray();
	}
	
	public static void readTVRW1() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTVRW1.toCharArray();
	}
	
	public static void readTVRW2() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTVRW2.toCharArray();
	}
	
	public static void readTVFF1() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTVFF1.toCharArray();
	}
	
	public static void readTVFF2() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTVFF2.toCharArray();
	}
	
	public static void readShopTempleHelp() {
		Player.readingMessage = true;
		System.out.println("Message.readShopTempleHelp");
		readingShopHelp = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textShopTempleHelp.toCharArray();
	}
	
	public static void readG1N() {
		Player.readingMessage = true;
		readingG1N = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage =1;
	
		textArray1 = textG1N1.toCharArray();
		textArray2 = textG1N2.toCharArray();
		textArray3 = textG1N3.toCharArray();
		textArray4 = textG1N4.toCharArray();		
	}
	
	public static void readG1N2() {
		readingG1N2 = true;
		prepText();
		
		currentMessage =2;
	
		textArray1 = textG1N5.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readSamadhi1() {
		Player.readingMessage = true;
		readingSamadhi1 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage =1;
	
		textArray1 = textSamadhi1.toCharArray();
		textArray2 = textSamadhi2.toCharArray();
		textArray3 = textSamadhi3.toCharArray();
	}
	
	public static void readSamadhi2() {
		readingSamadhi2 = true;
		prepText();
		
		currentMessage =2;
	
		textArray1 = textSamadhi4.toCharArray();
		textArray2 = textSamadhi5.toCharArray();
		textArray3 = textSamadhi6.toCharArray();
		textArray4 = textSamadhi7.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}

	public static void readShingon1() {
		Player.readingMessage = true;
		readingShingon1 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 10;
		currentMessage = 1;
	
		textArray1 = textShingon1.toCharArray();
		textArray2 = textShingon2.toCharArray();
	}
	
	public static void readShingon2() {
		readingShingon2 = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textShingon3.toCharArray();
		textArray2 = textShingon4.toCharArray();
		textArray3 = textShingon5.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon3() {
		readingShingon3 = true;
		prepText();
		
		currentMessage = 3;
	
		textArray1 = textShingon6.toCharArray();
		textArray2 = textShingon7.toCharArray();
		textArray3 = textShingon8.toCharArray();
		textArray4 = textShingon9.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon4() {
		readingShingon4 = true;
		prepText();
		
		currentMessage = 4;
	
		textArray1 = textShingon10.toCharArray();
		textArray2 = textShingon11.toCharArray();
		textArray3 = textShingon12.toCharArray();
		textArray4 = textShingon13.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon5() {
		readingShingon5 = true;
		prepText();
		
		currentMessage = 5;
	
		textArray1 = textShingon14.toCharArray();
		textArray2 = textShingon15.toCharArray();
		textArray3 = textShingon16.toCharArray();
		textArray4 = textShingon17.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon6() {
		readingShingon6 = true;
		prepText();
		
		currentMessage = 6;
	
		textArray1 = textShingon18.toCharArray();
		textArray2 = textShingon19.toCharArray();
		textArray3 = textShingon20.toCharArray();
		textArray4 = textShingon21.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon7() {
		readingShingon7 = true;
		prepText();
		
		currentMessage = 7;
	
		textArray1 = textShingon22.toCharArray();
		textArray2 = textShingon23.toCharArray();
		textArray3 = textShingon24.toCharArray();
		textArray4 = textShingon25.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon8(){
		readingShingon8 = true;
		prepText();
		
		currentMessage = 8;
	
		textArray1 = textShingon26.toCharArray();
		textArray2 = textShingon27.toCharArray();
		textArray3 = textShingon28.toCharArray();
		textArray4 = textShingon29.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon9() {
		readingShingon9 = true;
		prepText();
		
		currentMessage = 9;
	
		textArray1 = textShingon30.toCharArray();
		textArray2 = textShingon31.toCharArray();
		textArray3 = textShingon32.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readShingon10() {
		readingShingon10 = true;
		prepText();
		
		currentMessage = 10;
	
		textArray1 = textShingon33.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readMirror1() {
		Player.readingMessage = true;
		readingMirror1 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;

		textArray1 = textMirror1.toCharArray();
		textArray2 = textMirror2.toCharArray();
		textArray3 = textMirror3Orange.toCharArray();
	}
	
	public static void readMirror2() {
		Player.readingMessage = true;
		//readingMirror1 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;

		textArray1 = textMirror1.toCharArray();
		textArray2 = textMirror2.toCharArray();
		textArray3 = textMirror3Purple.toCharArray();
	}
	
	public static void readMirrorDream1() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;

		textArray1 = textMirror1.toCharArray();
		textArray2 = textMirrorDream1.toCharArray();
	}
	
	public static void readMirrorDream2() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;

		textArray1 = textMirrorDream2.toCharArray();
	}
	
	public static void readSamadhiHint() {
		Player.readingMessage = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;

		textArray1 = textSamadhi8.toCharArray();
	}
	
	public static void readG16N() {
		Player.readingMessage = true;
		//readingG16N = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textG16N.toCharArray();	
	}
	
	public static void readG9RS() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textG9S.toCharArray();	
	}
	
	public static void readG18WSign() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textG18WSign1.toCharArray();
		textArray2 = textG18WSign2.toCharArray();
	}
	
	public static void readDead() {
		Player.readingMessage = true;
		readingDead = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textDead1.toCharArray();
		textArray2 = textDead2.toCharArray();
	}
	
	public static void readReaper1() {
		Player.readingMessage = true;
		readingReaper1 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textReaper1.toCharArray();
	}
	
	public static void readReaper2() {
		Player.readingMessage = true;
		readingReaper2 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textReaper2.toCharArray();
	}
	
	public static void readReaper3() {
		Player.readingMessage = true;
		readingReaper3 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textReaper3.toCharArray();
	}
	
	public static void readReaper4() {
		Player.readingMessage = true;
		readingReaper4 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textReaper4.toCharArray();
	}
	
	public static void readInventoryEmpty() {
		Player.readingMessage = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textInventoryEmpty.toCharArray();
	}
	
	public static void readInventoryDark() {
		Player.readingMessage = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textInventoryDark.toCharArray();
	}
	
	public static void readError() {
		Player.readingMessage = true;
		readingError = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 2;
		currentMessage =1;
		textArray1 = textError1.toCharArray();
	}
	
	public static void readErrorChant() {
		Player.readingMessage = true;
		readingErrorChant = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 2;
		currentMessage =1;
		textArray1 = textErrorChant.toCharArray();
	}
	
	public static void readCorn1() {
		Player.readingMessage = true;
		readingCorn1 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textCorn1.toCharArray();
	}
	
	public static void readCorn2() {
		Player.readingMessage = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textCorn2.toCharArray();
	}
	
	public static void readCorn3() {
		Player.readingMessage = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textCorn3.toCharArray();
	}
	
	public static void readCorn4() {
		Player.readingMessage = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textCorn4.toCharArray();
	}
	
	public static void readH1EBanner() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textH1EBanner.toCharArray();
	}
	
	public static void readH2N() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textH2N1.toCharArray();
		textArray2 = textH2N2.toCharArray();
	}
	
	public static void readH12E() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textH12E.toCharArray();
	}
	
	public static void readH15N() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textH15N1.toCharArray();
		textArray2 = textH15N2.toCharArray();
	}
	
	public static void readT40W() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT40W1.toCharArray();
		textArray2 = textT40W2.toCharArray();
	}
	
	public static void readT38N() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT38N1.toCharArray();
		textArray2 = textT38N2.toCharArray();	
	}
	
	public static void readT28E() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT28E.toCharArray();
	}
	
	public static void readLotus() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textLotus1.toCharArray();
		textArray2 = textLotus2.toCharArray();
		textArray3 = textLotus3.toCharArray();	
	}
	
	public static void readKnot() {
		Player.readingMessage = true;
		readingKnot = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKnot1.toCharArray();
		textArray2 = textKnot2.toCharArray();
		textArray3 = textKnot3.toCharArray();
	}
	
	public static void readFish() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textFish1.toCharArray();
		textArray2 = textFish2.toCharArray();
		textArray3 = textFish3.toCharArray();
	}
	
	public static void readT12N() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT12N1.toCharArray();
		textArray2 = textT12N2.toCharArray();
	}
	
	public static void readShop11() {
		Player.readingMessage = true;
		readingShop11 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 3;
		currentMessage = 1;
		textArray1 = textShop11.toCharArray();
		textArray2 = textShop12.toCharArray();

	}
	
	public static void readShop12() {
		Player.readingMessage = true;
		readingShop12 = true;
		prepText();
		
		currentMessage = 2;
	
		textArray1 = textShop13.toCharArray();
		textArray2 = textShop14.toCharArray();
		textArray3 = textShop15.toCharArray();
		textArray4 = textShop16.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShop13() {
		readingShop13 = true;
		prepText();
		
		currentMessage = 3;
	
		textArray1 = textShop17.toCharArray();
		textArray2 = textShop18.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShop12b() {
		Player.readingMessage = true;
		readingShop12b = true;
		prepText();
		
		numberOfMessages = 2;
		currentMessage = 1;
	
		textArray1 = textShop13.toCharArray();
		textArray2 = textShop14.toCharArray();
		textArray3 = textShop15.toCharArray();
		textArray4 = textShop16.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShop13b() {
		readingShop13b = true;
		prepText();
		
		currentMessage = 2;
	
		textArray1 = textShop17.toCharArray();
		textArray2 = textShop18.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShop2() {
		Player.readingMessage = true;
		readingShop2 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textShop21.toCharArray();
		textArray2 = textShop22.toCharArray();
		textArray3 = textShop23.toCharArray();
		textArray4 = textShop24.toCharArray();	
	}
	
	public static void readShop3() {
		Player.readingMessage = true;
		readingShop3 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textShop31.toCharArray();
		textArray2 = textShop32.toCharArray();
		textArray3 = textShop33.toCharArray();
		textArray4 = textShop34.toCharArray();	
	}
	
	public static void readOm() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textOm1.toCharArray();
		textArray2 = textOm2.toCharArray();
	}
	
	public static void readNi() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textNi1.toCharArray();
		textArray2 = textNi2.toCharArray();
	}
	
	public static void readGo() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textGo1.toCharArray();
		textArray2 = textGo2.toCharArray();
	}
	
	public static void readYu() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textYu1.toCharArray();
		textArray2 = textYu2.toCharArray();
	}
	
	public static void readJi() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textJi1.toCharArray();
		textArray2 = textJi2.toCharArray();
	}
	
	public static void readRa() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textRa1.toCharArray();
		textArray2 = textRa2.toCharArray();
	}
	
	public static void readShi() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textShi1.toCharArray();
		textArray2 = textShi2.toCharArray();
	}
	
	public static void readShopBye() {
		Player.readingMessage = true;
		readingShopBye = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textShopSayonara.toCharArray();
	}
	
	public static void readShopTemple1() {
		Player.readingMessage = true;
		readingShopTemple1 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 5;
		currentMessage =1;
		textArray1 = textShopTemple1.toCharArray();
		textArray2 = textShopTemple2.toCharArray();
		textArray3 = textShopTemple3.toCharArray();
		textArray4 = textShopTemple4.toCharArray();	
	}
	
	public static void readShopTemple5() {
		System.out.println("Message.readShopTemple2()");
		readingShopTemple5 = true;
		prepText();
		
		currentMessage =2;
	
		textArray1 = textShopTemple5.toCharArray();
		textArray2 = textShopTemple6.toCharArray();
		textArray3 = textShopTemple7.toCharArray();
		textArray4 = textShopTemple8.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShopTemple9() {
		System.out.println("Message.readShopTemple2()");
		readingShopTemple9 = true;
		prepText();
		
		currentMessage =3;
	
		textArray1 = textShopTemple9.toCharArray();
		textArray2 = textShopTemple10.toCharArray();
		textArray3 = textShopTemple11.toCharArray();
		textArray4 = textShopTemple12.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShopTemple13() {
		System.out.println("Message.readShopTemple2()");
		readingShopTemple13 = true;
		prepText();
		
		currentMessage =4;
	
		textArray1 = textShopTemple13.toCharArray();
		textArray2 = textShopTemple14.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShopSorry1() {
		prepText();
		System.out.println("Message.readShopSorry1()");
		readingShopSorry1 = true;
		numberOfMessages = 2;
		currentMessage = 1;
		
		textArray1 = textShopSorry1.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readShopSorry2() {
		prepText();
		System.out.println("Message.readShopSorry2()");
		readingShopSorry2 = true;
		numberOfMessages = 2;
		currentMessage = 1;
		
		textArray1 = textShopSorry2a.toCharArray();
		textArray2 = textShopSorry2b.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readT7N() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT7N.toCharArray();	
	}
	
	public static void readH3W() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textHouseGlass1.toCharArray();
		textArray2 = textHouseGlass2.toCharArray();	
	}
	
	public static void readT45S() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textT45S1.toCharArray();
		textArray2 = textT45S2.toCharArray();
		textArray3 = textT45S3.toCharArray();
		
	}
	
	public static void readG27S() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textG27S1.toCharArray();
		textArray2 = textG27S2.toCharArray();
		textArray3 = textG27S3.toCharArray();
		textArray4 = textG27S4.toCharArray();	
	}
	
	public static void readDarkness() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textDarkness1.toCharArray();
		textArray2 = textDarkness2.toCharArray();
		textArray3 = textDarkness3.toCharArray();
	}
	
	public static void readPhoneIncorrect() {
		Player.readingMessage = true;
		//reading = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textPhoneIncorrect1.toCharArray();
		textArray2 = textPhoneIncorrect2.toCharArray();
		textArray3 = textPhoneIncorrect3.toCharArray();
	}
	
	public static void readKimi1() {
		Player.readingMessage = true;
		readingKimi1 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi1.toCharArray();
		textArray2 = textKimi2.toCharArray();
	}
	
	public static void readKimi2() {
		Player.readingMessage = true;
		readingKimi2 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi3.toCharArray();
		textArray2 = textKimi4.toCharArray();
	}
	
	public static void readKimiWrongNumber() {
		Player.readingMessage = true;
		readingKimiWrongNumber = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 2;
		currentMessage =1;
		textArray1 = textKimi57.toCharArray();
		textArray2 = textKimi58.toCharArray();
		textArray3 = textKimi59.toCharArray();
		// then goes to KimiR
	}
	
	public static void readKimi3() {
		Player.readingMessage = true;
		readingKimi3 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi5.toCharArray();
		textArray2 = textKimi6.toCharArray();
	}
	
	public static void readKimiR() {
		Player.readingMessage = true;
		readingKimiR = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimiR.toCharArray();
		
		System.out.println("kimi R");
	}
	
	public static void readKimi9() {
		Player.readingMessage = true;
		readingKimi9 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi9.toCharArray();
		textArray2 = textKimi10.toCharArray();
		textArray3 = textKimi11.toCharArray();
	}
	
	
	public static void readKimi12() {
		Player.readingMessage = true;
		readingKimi12 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi12.toCharArray();
		textArray2 = textKimi13.toCharArray();
	}
	
	public static void readKimi14() {
		Player.readingMessage = true;
		readingKimi14 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi14.toCharArray();
		textArray2 = textKimi15.toCharArray();
		textArray3 = textKimi16.toCharArray();
	}
	
	public static void readKimi17() {
		Player.readingMessage = true;
		readingKimi17 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi17.toCharArray();
		textArray2 = textKimi18.toCharArray();
		textArray3 = textKimi19.toCharArray();
	}
	
	public static void readKimi20() {
		Player.readingMessage = true;
		readingKimi20 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi20.toCharArray();
		textArray2 = textKimi21.toCharArray();
		textArray3 = textKimi22.toCharArray();
		textArray4 = textKimi23.toCharArray();	
	}

	public static void readKimi24() {
		Player.readingMessage = true;
		readingKimi24 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 9;
		currentMessage =1;
		textArray1 = textKimi24.toCharArray();
		textArray2 = textKimi25.toCharArray();
		textArray3 = textKimi26.toCharArray();
		textArray4 = textKimi27.toCharArray();	
	}
	
	public static void readKimi28() {
		Player.readingMessage = true;
		readingKimi28 = true;
		prepText();
		currentMessage = 2;
		textArray1 = textKimi28.toCharArray();
		textArray2 = textKimi29.toCharArray();
		textArray3 = textKimi30.toCharArray();
		textArray4 = textKimi31.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi32() {
		Player.readingMessage = true;
		readingKimi32 = true;
		prepText();
		currentMessage = 3;
		textArray1 = textKimi32.toCharArray();
		textArray2 = textKimi33.toCharArray();
		textArray3 = textKimi34.toCharArray();
		textArray4 = textKimi35.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi36() {
		Player.readingMessage = true;
		readingKimi36 = true;
		prepText();
		currentMessage = 4;
		textArray1 = textKimi36.toCharArray();
		textArray2 = textKimi37.toCharArray();
		textArray3 = textKimi38.toCharArray();
		textArray4 = textKimi39.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi40() {
		Player.readingMessage = true;
		readingKimi40 = true;
		prepText();
		currentMessage = 5;
		textArray1 = textKimi40.toCharArray();
		textArray2 = textKimi41.toCharArray();
		textArray3 = textKimi42.toCharArray();
		textArray4 = textKimi43.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi44() {
		Player.readingMessage = true;
		readingKimi44 = true;
		prepText();
		currentMessage = 6;
		textArray1 = textKimi44.toCharArray();
		textArray2 = textKimi45.toCharArray();
		textArray3 = textKimi46.toCharArray();
		textArray4 = textKimi47.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi48() {
		Player.readingMessage = true;
		readingKimi48 = true;
		prepText();
		currentMessage = 7;
		textArray1 = textKimi48.toCharArray();
		textArray2 = textKimi49.toCharArray();
		textArray3 = textKimi50.toCharArray();
		textArray4 = textKimi51.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi52() {
		Player.readingMessage = true;
		readingKimi52 = true;
		prepText();
		currentMessage = 8;
		textArray1 = textKimi52.toCharArray();
		textArray2 = textKimi53.toCharArray();
		textArray3 = textKimi54.toCharArray();
		textArray4 = textKimi55.toCharArray();	
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi56() {
		Player.readingMessage = true;
		readingKimi56 = true;
		prepText();
		currentMessage = 9;
		textArray1 = textKimi56.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readKimi60() {
		Player.readingMessage = true;
		readingKimi60 = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimi60.toCharArray();
		dewaMata = true;
	}
	
	public static void readKimiBooked() {
		Player.readingMessage = true;
		readingKimiBooked = true;
		prepText();
		Animation.openingMessage = true;
		numberOfMessages = 1;
		currentMessage =1;
		textArray1 = textKimiBooked1.toCharArray();
		textArray2 = textKimiBooked2.toCharArray();
		textArray3 = textKimiBooked3.toCharArray();
	}
	
	public static void readTod1() {
		Player.readingMessage = true;
		prepText();
		
		readingTod1 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod1.toCharArray();	
	}
	
	public static void readTod2() {
		Animation.todContent = false;
		Animation.todTalking1 = true;
		Player.readingMessage = true;
		prepText();
		
		readingTod2 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 3;
		currentMessage =1;
	
		textArray1 = textTod2.toCharArray();	
		textArray2 = textTod3.toCharArray();	
		textArray3 = textTod4.toCharArray();	
	}
	
	public static void readTod4a() {
		Animation.todTalking1 = false;
		Animation.todThinking1 = true;
		readingTod4a = true;
		Player.readingMessage = true;
		prepText();
		
		currentMessage =2;
	
		textArray1 = textTod4a.toCharArray();
		textArray2 = textTod5.toCharArray();
		textArray3 = textTod6.toCharArray();
		
		//compare muting these to not muting these
		// when it's not muted, tod says tod2, then pppllleeaasssee
		// when it's muted, tod says tod2, then first line of tod7 then 2nd & 3rd of tod4a
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod7() {
		Animation.todInviting = true;
		Animation.todThinking1 = false;
		readingTod7 = true;
		Player.readingMessage = true;
		prepText();
		
		currentMessage =3;
	
		textArray1 = textTod7.toCharArray();
		textArray2 = textTod7a.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod8() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod8 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod8.toCharArray();	
		textArray2 = textTod9.toCharArray();	
		textArray3 = textTod10.toCharArray();	
	}
	
	public static void readTod11() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod11 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage =1;
	
		textArray1 = textTod11.toCharArray();	
		textArray2 = textTod12.toCharArray();	
		textArray3 = textTod13.toCharArray();
		textArray4 = textTod14.toCharArray();
	}
	
	public static void readTod15() {
		readingTod15= true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage =2;
	
		textArray1 = textTod15.toCharArray();
		textArray2 = textTod16.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod17() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod17 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 4;
		currentMessage =1;
	
		textArray1 = textTod17.toCharArray();	
		textArray2 = textTod18.toCharArray();	
		textArray3 = textTod19.toCharArray();
		textArray4 = textTod20.toCharArray();
	}
	
	public static void readTod21() {
		readingTod21= true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage =2;
	
		textArray1 = textTod21.toCharArray();
		textArray2 = textTod22.toCharArray();
		textArray3 = textTod23.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod24() {
		readingTod24= true;
		World.todStatus = "confused";
		prepText();
		
		currentMessage =3;
	
		textArray1 = textTod24.toCharArray();
		textArray2 = textTod25.toCharArray();
		textArray3 = textTod26.toCharArray();
		textArray4 = textTod27.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod28() {
		readingTod28= true;
		World.todStatus = "confused";
		prepText();
		
		currentMessage =4;
	
		textArray1 = textTod28.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod30() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod30 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 4;
		currentMessage =1;
	
		textArray1 = textTod30.toCharArray();	
		textArray2 = textTod31.toCharArray();	
		textArray3 = textTod32.toCharArray();
		textArray4 = textTod33.toCharArray();
	}
	
	public static void readTod34() {
		readingTod34= true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage =2;
	
		textArray1 = textTod34.toCharArray();
		textArray2 = textTod35.toCharArray();
		textArray3 = textTod36.toCharArray();
		textArray4 = textTod37.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod38() {
		readingTod38 = true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage =3;
	
		textArray1 = textTod38.toCharArray();
		textArray2 = textTod39.toCharArray();
		textArray3 = textTod40.toCharArray();
		textArray4 = textTod41.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod42() {
		readingTod42 = true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage =4;
	
		
		textArray1 = textTod42.toCharArray();
		if (!Player.sipped) {
			textArray2 = textTod43.toCharArray();
		} else {
			textArray2 = textTod43a.toCharArray();
		}
		textArray3 = textTod44.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod45() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod45 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod45.toCharArray();	
		textArray2 = textTod46.toCharArray();	
		textArray3 = textTod46a.toCharArray();
	}
	
	public static void readTod46b() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod46b = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod46b.toCharArray();	
		textArray2 = textTod46c.toCharArray();	
	}
	
	public static void readTod47() {
		Player.readingMessage = true;
		World.todStatus = "talking";
		prepText();
		
		readingTod47 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 10;
		currentMessage =1;
	
		textArray1 = textTod47.toCharArray();	
		textArray2 = textTod48.toCharArray();	
		textArray3 = textTod49.toCharArray();	
	}
	
	public static void readTod50() {
		readingTod50 = true;
		prepText();
		
		currentMessage =2;
	
		textArray1 = textTod50.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod50a() {
		readingTod50a = true;
		prepText();
		
		currentMessage =3;
	
		textArray1 = textTod50a.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod51() {
		readingTod51 = true;
		prepText();
		
		currentMessage =4;
	
		textArray1 = textTod51.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod51a() {
		readingTod51a = true;
		prepText();
		
		currentMessage =5;
	
		textArray1 = textTod51a.toCharArray();
		textArray2 = textTod52.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod53() {
		readingTod53 = true;
		prepText();
		
		textSpeed = 200;
		
		currentMessage =6;
	
		textArray1 = textTod53.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod53a() {
		readingTod53a = true;
		prepText();
		
		textSpeed = defaultTextSpeed;
		
		currentMessage =7;
	
		textArray1 = textTod53a.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod54() {
		readingTod54 = true;
		prepText();
		
		currentMessage =8;
		
		textSpeed = 300;
	
		textArray1 = textTod54.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod54a() {
		readingTod54a = true;
		prepText();
		
		currentMessage =9;
		
		textSpeed = defaultTextSpeed;
	
		textArray1 = textTod54a.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod54b() {
		readingTod54b = true;
		prepText();
		
		currentMessage = 10;
		
		textSpeed = 450;
	
		textArray1 = textTod54b.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTod55() {
		Player.readingMessage = true;
		readingTod55 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 6;
		currentMessage = 1;
	
		textArray1 = textTod55.toCharArray();
	}
	
	public static void readTod56() {
		readingTod56 = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTod56.toCharArray();
		textArray2 = textTod57.toCharArray();
		textArray3 = textTod58.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod59() {
		readingTod59 = true;
		prepText();
		
		currentMessage = 3;
	 
		textArray1 = textTod59.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod60() {
		readingTod60 = true;
		prepText();
		
		currentMessage = 4;
	 
		textArray1 = textTod60.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod61() {
		readingTod61 = true;
		prepText();
		
		currentMessage = 5;
	 
		textArray1 = textTod61.toCharArray();
		textArray2 = textTod62.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod63() {
		readingTod63 = true;
		prepText();
		
		currentMessage = 6;
	 
		textArray1 = textTod63.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod64() {
		Player.readingMessage = true;
		readingTod64 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 2;
		currentMessage = 1;
	
		textArray1 = textTod64.toCharArray();
		textArray2 = textTod65.toCharArray();
	}
	
	public static void readTod66() {
		Player.readingMessage = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTod66.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod67() {
		Player.readingMessage = true;
		readingTod67 = true;
		prepText();
		
		Animation.openingMessage = true;
		
		numberOfMessages = 3;
		currentMessage = 1;
	
		textArray1 = textTod67.toCharArray();
		textArray2 = textTod68.toCharArray();
		textArray3 = textTod69.toCharArray();
		textArray4 = textTod70.toCharArray();
	}
	
	public static void readTod71() {
		readingTod71 = true;
		World.todStatus = "talking";
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTod71.toCharArray();
		textArray2 = textTod76.toCharArray();
		textArray3 = textTod77.toCharArray();
		textArray4 = textTod78.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod79() {
		readingTod79 = true;
		prepText();
		
		currentMessage = 3;
	 
		textArray1 = textTod79.toCharArray();
		textArray2 = textTod80.toCharArray();
		
		Thread thread = new Message();
		thread.start();		
	}
	
	public static void readTod72() {
		Player.readingMessage = true;
		World.todStatus = "confused";
		prepText();
		
		readingTod72 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod72.toCharArray();	
		textArray2 = textTod73.toCharArray();	
	}
	
	public static void readTod74() {
		Player.readingMessage = true;
		World.todStatus = "confused";
		prepText();
		
		readingTod74 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod74.toCharArray();	
	}
	
	public static void readTod75() {
		Player.readingMessage = true;
		World.todStatus = "confused";
		prepText();
		
		readingTod75 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textTod75.toCharArray();	
	}
	
	public static void readDream1() {
		Player.readingMessage = true;
		prepText();
		
		readingDream1 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
	
		textArray1 = textDream1.toCharArray();	
		textArray2 = textDream2.toCharArray();	
	}
	
	public static void readMonkAnswer() {
		Player.spokeToMonk = true;
		Player.readingMessage = true;
		prepText();
		
		readingMonkAnswer = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 1;
		currentMessage =1;
		
		textArray1 = textMonkAnswer.toCharArray();	
	}
	
	public static void readTrance1() {
		setTextPosition("top");
		Player.readingMessage = true;
		prepText();
		
		readingTrance1 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 10;
		currentMessage =1;
	
		textArray1 = textTrance1.toCharArray();	
		textArray2 = textTrance2.toCharArray();	
	}
	
	public static void readTrance2() {
		setTextPosition("middle");
		readingTrance2 = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTrance3.toCharArray();
		textArray2 = textTrance4.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance3() {
		setTextPosition("bottom");
		readingTrance3 = true;
		prepText();
		
		currentMessage = 3;
	 
		textArray1 = textTrance5.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance4() {
		setTextPosition("top");
		readingTrance4 = true;
		prepText();
		
		currentMessage = 4;
	 
		textArray1 = textTrance6.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance5() {
		setTextPosition("middle");
		readingTrance5 = true;
		prepText();
		
		currentMessage = 5;
	 
		textArray1 = textTrance7.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance6() {
		setTextPosition("bottom");
		readingTrance6 = true;
		prepText();
		
		currentMessage = 6;
	 
		textArray1 = textTrance8.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance7() {
		setTextPosition("top");
		readingTrance7 = true;
		prepText();
		
		currentMessage = 7;
	 
		textArray1 = textTrance9.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance8() {
		setTextPosition("middle");
		readingTrance8 = true;
		prepText();
		
		currentMessage = 8;
	 
		textArray1 = textTrance10.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance9() {
		setTextPosition("bottom");
		readingTrance9 = true;
		prepText();
		
		currentMessage = 9;
	 
		textArray1 = textTrance11.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance11() {
		setTextPosition("top");
		Player.readingMessage = true;
		prepText();
		
		readingTrance11 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 5;
		currentMessage =1;
	
		textArray1 = textTrance12.toCharArray();	
		textArray2 = textTrance13.toCharArray();	
	}
	
	public static void readTrance12() {
		setTextPosition("middle");
		readingTrance12 = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTrance14.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance13() {
		setTextPosition("bottom");
		readingTrance13 = true;
		prepText();
		
		currentMessage = 3;
	 
		textArray1 = textTrance15.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance14() {
		setTextPosition("top");
		readingTrance14 = true;
		prepText();
		
		currentMessage = 4;
	 
		textArray1 = textTrance16.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance15() {
		setTextPosition("top");
		Player.readingMessage = true;
		prepText();
		
		readingTrance15 = true;
		
		Animation.openingMessage = true;
		
		numberOfMessages = 8;
		currentMessage =1;
	
		textArray1 = textTrance17.toCharArray();	
	}
	
	public static void readTrance16() {
		setTextPosition("middle");
		readingTrance16 = true;
		prepText();
		
		currentMessage = 2;
	 
		textArray1 = textTrance18.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance17() {
		setTextPosition("bottom");
		readingTrance17 = true;
		prepText();
		
		currentMessage = 3;
	 
		textArray1 = textTrance19.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance18() {
		setTextPosition("top");
		readingTrance18 = true;
		prepText();
		
		currentMessage = 4;
	 
		textArray1 = textTrance20.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance19() {
		setTextPosition("middle");
		readingTrance19 = true;
		prepText();
		
		currentMessage = 5;
	 
		textArray1 = textTrance21.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance20() {
		setTextPosition("bottom");
		readingTrance20 = true;
		prepText();
		
		currentMessage = 6;
	 
		textArray1 = textTrance22.toCharArray();
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance21() {
		System.out.println("Message.readTrance21");
		setTextPosition("top");
		readingTrance21 = true;
		Player.knowsYear = true;
		prepText();
		
		currentMessage = 7;
	 
		textArray1 = textPostRadiusYear.toCharArray();
		
		System.out.println(textArray1);
		System.out.println(textPostRadiusYear);
		
		Thread thread = new Message();
		thread.start();	
	}
	
	public static void readTrance() {
		switch (Player.trancesTranced) {
			case 0:
				Player.trancesTranced = 1;
				World.assignTranceToShrine();
				Message.readTrance1();
				break;
			case 1:
				Player.trancesTranced = 2;
				World.assignTranceToShrine();
				Message.readTrance11();
				break;
			case 2:
				Player.trancesTranced = 3;
				World.assignTranceToShrine();
				Message.readTrance15();
				break;
			default:
				System.out.println("Message.readTrance() error");
				break;
		}
	}
	
	public static void setTextPosition(String p) {
		switch (p) {
			case "top":
				ImagePanel.textSize = 16;
				ImagePanel.textX = 56;
				ImagePanel.textLine1Y = 50;
				ImagePanel.textLine2Y = ImagePanel.textLine1Y + 16;
				ImagePanel.textLine3Y = ImagePanel.textLine2Y + 16;
				ImagePanel.textLine4Y = ImagePanel.textLine3Y + 16;
				break;
			case "middle":
				ImagePanel.textSize = 16;
				ImagePanel.textX = 56;
				ImagePanel.textLine1Y = 190;
				ImagePanel.textLine2Y = ImagePanel.textLine1Y + 16;
				ImagePanel.textLine3Y = ImagePanel.textLine2Y + 16;
				ImagePanel.textLine4Y = ImagePanel.textLine3Y + 16;
				break;
			case "bottom":
				ImagePanel.textSize = 16;
				ImagePanel.textX = 56;
				ImagePanel.textLine1Y = 330;
				ImagePanel.textLine2Y = ImagePanel.textLine1Y + 16;
				ImagePanel.textLine3Y = ImagePanel.textLine2Y + 16;
				ImagePanel.textLine4Y = ImagePanel.textLine3Y + 16;
				break;
			case "default":
				ImagePanel.textSize = 16;
				ImagePanel.textX = 56;
				ImagePanel.textLine1Y = 330;
				ImagePanel.textLine2Y = ImagePanel.textLine1Y + 16;
				ImagePanel.textLine3Y = ImagePanel.textLine2Y + 16;
				ImagePanel.textLine4Y = ImagePanel.textLine3Y + 16;
				break;
			default:
				System.out.println("Message.setTextPosition() error");
				setTextPosition("default");
				break;
		}
	}
	
	/**
	* TEXT THREAD
	* Prints text one letter at a time in concurrent thread 
	*/
	public void run() {
		//System.out.println("run()");
		typing = true;
		Player.setBusy(false);
		
		appendArray();

		setTextSpeed(defaultTextSpeed);
		//Keyboard.wipeKeyboardInput();
		typing = false;		
	}	
}