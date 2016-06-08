import java.io.*;

import java.util.ArrayList;
import java.util.List;







public class VladimirDmitryV5 {
	private String[] entryEmail;
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
	    
	  public void init() {
	    try {
	      //BufferedReader enEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//EntryEmail.txt"));
	      BufferedReader fin = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue/End.txt"));
	      BufferedReader cSceneVis = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//CrimeSceneVisit.txt"));
	      BufferedReader initResearch = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//InitialResearch.txt"));
	      BufferedReader initOptionsToCont = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//OptionsToContinue.txt"));
	      BufferedReader polReport = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//PoliceReport.txt"));
	      BufferedReader resCriminals = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//ResearchCriminals.txt"));
	      BufferedReader suspConv = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//SuspectConversation.txt"));
	      BufferedReader suspInt = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//SuspectInterview.txt"));
	      BufferedReader victResear = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//VictimResearch.txt"));
	      BufferedReader witnTalk = new BufferedReader(new FileReader("bin//VladmirDmitryDialogue//WitnessTalk.txt"));
	      String str = null;
	      List<String> list = new ArrayList<String>();
	      while ((str = cSceneVis.readLine()) != null) {
	        list.add(str);
	        
	      }
	      crimeSceneVisit = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = fin.readLine()) != null){
	        list.add(str);
	      }
	      end = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = cSceneVis.readLine()) != null){
	        list.add(str);
	      }
	      
	      list.clear();
	      while((str = initResearch.readLine()) != null){
	        list.add(str);
	      }
	      initialResearch = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = initOptionsToCont.readLine()) != null){
	        list.add(str);
	      }
	      optionsToContinue = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = polReport.readLine()) != null){
	        list.add(str);
	      }
	      policeReport = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = resCriminals.readLine()) != null){
	        list.add(str);
	      }
	      researchCriminals = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = suspConv.readLine()) != null){
	        list.add(str);
	      }
	      suspectConversation = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = suspInt.readLine()) != null){
	        list.add(str);
	      }
	      suspectInterview = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = victResear.readLine()) != null){
	        list.add(str);
	      }
	      victimResearch = list.toArray(new String[list.size()]);
	      list.clear();
	      while((str = witnTalk.readLine()) != null){
	        list.add(str);
	      }
	      witnessTalk = list.toArray(new String[list.size()]);
	      list.clear();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public String[] getEnd() {
	    return end;
	  } 
	  public String[] getCrimeSceneVisit() {
	    return crimeSceneVisit;
	  } 
	  public String[] getInitialResearch() {
	    return initialResearch;
	  } 
	  public String[] getOptionsToContinue() {
	    return optionsToContinue;
	  } 
	  public String[] getPoliceReport() {
	    return policeReport;
	  } 
	  public String[] getResearchCriminals() {
	    return researchCriminals;
	  } 
	  public String[] getSuspectConversation() {
	    return suspectConversation;
	  } 
	  public String[] getSuspectInterview() {
	    return suspectInterview;
	  } 
	  public String[] getVictimResearch() {
	    return victimResearch;
	  } 
	  public String[] getWitnessTalk() {
	    return witnessTalk;
	  } 
}
