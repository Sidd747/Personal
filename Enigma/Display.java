
public class Display {
	
	private String b1text;
	private String b2text;
	private String b3text;
	private String b4text;
	VladimirDmitryV5 v5 = new VladimirDmitryV5();
	private String[] end;
	private String[] initialResearch;
	private String[] optionsToContinue;
    private String[] policeReport;
	private String[] researchCriminals;
	private String[] suspectConversation;
	private String[] suspectInterview;
	private String[] victimResearch;
	private String[] witnessTalk;
	private String[] crimeSceneVisit;
	private String[] returnvalue;
	private String[] returnmainv;
	
	
	public Display() {
		
		b1text = "";
		b2text = "";
		b3text = "";
		b4text = "";
		
		/////Preparing the V5
		v5.init();
		crimeSceneVisit = v5.getCrimeSceneVisit();
		end = v5.getEnd();
		initialResearch = v5.getInitialResearch();
		optionsToContinue = v5.getOptionsToContinue();
		policeReport = v5.getPoliceReport();
		researchCriminals = v5.getResearchCriminals();
		suspectConversation = v5.getSuspectConversation();
		suspectInterview = v5.getSuspectInterview();
		victimResearch = v5.getVictimResearch();
		witnessTalk = v5.getWitnessTalk();
		
		
		
	
	}
	
	public String[] getDisText( int bopt,String tb1text,String tb2text, String tb3text, String tb4text ) {
		b1text = tb1text;
		b2text = tb2text;
		b3text = tb3text;
		b4text = tb4text;
		
		
		if (bopt == 1) {
			returnmainv = getb1text();
		} else if(bopt ==2) {
			returnmainv = getb2text();
		} else if(bopt ==3) {
			returnmainv = getb3text();
		} else {
			returnmainv = getb4text();
		}
		
		return returnmainv;
		
	}
	
	public String[] getb1text() {
		if(b1text.equals("Option A: Which hotel did this take place in? ")) {
			returnvalue = policeReport;
		}else if (b1text.equals("Option A: Go talk to Sergei Barchev ")) {
			returnvalue = witnessTalk;
		} 
		
		return returnvalue;
	}
	
	public String[] getb2text() {
		if(b2text.equals("Option B: Did Dmitry have any enemies? ")) {
			returnvalue = victimResearch;
		} else if (b2text.equals("Option B: Talk to the enemies of Dmitry ")) {
			returnvalue = suspectConversation;
		} else if(b2text.equals("Option B: Compare descriptions with the CIA ")){
			returnvalue = researchCriminals;
		}
		
		return returnvalue;
	}
	
	
	
	
	public String[] getb3text() {
		if(b3text.equals("Option C: No, I'll go home to do research. ")) {
			returnvalue = initialResearch;
		} else {
			System.out.println("no");
		}
		
		return returnvalue;
		
	}
	
	public String[] getb4text() {
		if(b4text.equals("Option D: Yes, when do I start? ")) {
			returnvalue = optionsToContinue;
		} else if(b4text.equals("Option D: Go to the Hotel Metropol to investigate ")) {
			returnvalue = crimeSceneVisit;
		} else if(b4text.equals("Option D: Go to Molotov Brothers plumbing ")) {
			returnvalue = suspectInterview;
		} 
		return returnvalue;
	}
	
	
	
}
