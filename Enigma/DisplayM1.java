
public class DisplayM1 {
	private String b1text;
	private String b2text;
	private String b3text;
	private String b4text;
	
	private String[] affirmativeToRepairShopQuestion;
	private String[] attackMenPushedYouOutCar;
	private String[] doYouWantToAttackMenWhoWillDestroyBank;
	private String[] ifLooksInCloset;
	private String[] ifRepliesDeathToSecretary;
    private String[] ifTellsSecretaryCarl;
	private String[] ifUserFiresBackAfterDrawerScene;
	private String[] ifUserJumpsOffLedge;
	private String[] ifUserSaysLawsuit;
	private String[] ifUserShootsFloda;
	private String[] ifUserTacklesFloda;
	
	private String[] negativeToRepairShopYesNoQuestion;
	private String[] userGivesItToCarlson;
	private String[] userLooksInDrawer;
    private String[] userLooksInShelf;
	private String[] userRunsInsteadOfShooting;
	private String[] userTakesItToPhoneRepairShop;
	private String[] waitPatientlyInsteadAttackMenBank;
	
	private String[] returnmainv;
	private String[] p1;
	
	MurderV2 m1 = new MurderV2();
	
	
	
	public DisplayM1() {
		b1text = "";
		b2text = "";
		b3text = "";
		b4text = "";
		
		affirmativeToRepairShopQuestion = m1.getAffToRepairShopQuestion();
		attackMenPushedYouOutCar = m1.getAttackMenWhoPushedYouOutCar();
		doYouWantToAttackMenWhoWillDestroyBank = m1.getDoYouAttackMenWhoWillDestroyBank();
		ifLooksInCloset = m1.getLooksInCloset();
		ifRepliesDeathToSecretary = m1.getReplyDeathToSecretary();
		ifTellsSecretaryCarl = m1.getTellSecretaryCarl();
		ifUserFiresBackAfterDrawerScene = m1.getUserFiresBackAfterDrawerScene();
		ifUserJumpsOffLedge = m1.getUserJumpsOffLedge();
		ifUserSaysLawsuit = m1.getUserSaysLawsuit();
		ifUserShootsFloda = m1.getUserShootsFloda();
		ifUserTacklesFloda = m1.getUserTacklesFloda();
		negativeToRepairShopYesNoQuestion = m1.getNegToRepShopYNQuestion();
		userGivesItToCarlson = m1.getGiveToCarlson();
		userLooksInDrawer = m1.getLookInDrawer();
		userLooksInShelf = m1.getLooksInShelf();
		userRunsInsteadOfShooting = m1.getRunsInsteadShoot();
		userTakesItToPhoneRepairShop = m1.getTakesToPhoneRepShop();
		waitPatientlyInsteadAttackMenBank = m1.getWaitInsteadAttackBank();
		
		
		
	}
	
	public String[] getDisText( int bopt,String tempb1, String tempb2, String tempb3, String tempb4)  {
		b1text = tempb1;
		b2text = tempb2;
		b3text = tempb3;
		b4text = tempb4;
		
		if (bopt ==1 ) {
			returnmainv = getb1text();
		} else if (bopt ==2) {
			returnmainv = getb2text();
		} else if (bopt ==3) {
			returnmainv = getb3text();
		} else {
			returnmainv = getb4text();
		}
		
		return returnmainv;
		
		
	}
	
	public String[] getb1text() {
		if(b1text.equals("Option A: Get it to phone repair shop ")) {
			p1 = userTakesItToPhoneRepairShop;
		} else if (b1text.equals("Option A: Yes ")) {
			p1 = affirmativeToRepairShopQuestion;
		} else if (b1text.equals("Option A: Look at inside of cabinet ")) {
			p1 = ifLooksInCloset;
		} else if (b1text.equals("Option A: Fire back ")) {
			p1 = ifUserFiresBackAfterDrawerScene;
		} else if (b1text.equals("Option A: Attack them ")) {
			p1 = attackMenPushedYouOutCar;
		} else {
			System.out.println("get b1 text method");
		}
		
		return p1;
		
	}
	
	public String[] getb2text() {
		if (b2text.equals("Option B: " + null)) {
			p1 = null;
		} else if (b2text.equals("Option B: No ")) {
			p1 = negativeToRepairShopYesNoQuestion;
		} else if (b2text.equals("Option B: Look in drawer ")) {
			p1 = userLooksInDrawer;
		} else if (b2text.equals("Option B: Leave to Sweden ")) {
			
		} else if (b2text.equals("Option B: Run away ")) {
			
		} else if (b2text.equals("Option B: Do nothing ")) {
			
		} else if (b2text.equals("Option B: Attack them ")) {
			
		} else {
			System.out.println("getb2text");
		}
		
		return p1;
		
	}
	
	public String[] getb3text() {
		if (b3text.equals("Option C: " + null)) {
			
		} else if (b3text.equals("Option C: Look in the shelf ")) {
			
		} else if (b3text.equals("Option C: Hack into the safe ")) {
			
		} else if (b3text.equals("Option C: Jump off the ledge ")) {
			
		} else {
			System.out.println("getb3text");
		}
		
		return p1;
		
	}
	
	public String[] getb4text() {
		if (b4text.equals("Option D: " + null)) {
			
		} else if (b4text.equals("Option D: Research more ")) {
			
		} else if (b4text.equals("Option D: Confront Floda ")) {
			
		} else if (b4text.equals("Option D: Shoot Floda ")) {
			
		} else if (b4text.equals("Option D: Finish ")) {
			
		} else {
			System.out.println("getb4text");
		}
		
		return p1;
		
	}
	
	
	
	
	
	
}
