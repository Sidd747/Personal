import java.io.*;

import java.util.ArrayList;
import java.util.List;







public class MurderV2 {
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
  private String[] introduction;
  private String[] negativeToRepairShopYesNoQuestion;
  private String[] userGivesItToCarlson;
  private String[] userLooksInDrawer;
  private String[] userLooksInShelf;
  private String[] userRunsInsteadOfShooting;
  private String[] userTakesItToPhoneRepairShop;
  private String[] waitPatientlyInsteadAttackMenBank;
  public void init() {
    try {
      //BufferedReader enEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//EntryEmail.txt"));
      BufferedReader aff2RepShopQuestion = new BufferedReader(new FileReader("bin//MurderScript2//AffirmativeToRepairShopQuestion.txt"));
      BufferedReader attackMenPushOutCar = new BufferedReader(new FileReader("bin//MurderScript2//AttackMenWhoPushedYouOutCar.txt"));
      BufferedReader attackMenDestroyBank = new BufferedReader(new FileReader("bin//MurderScript2//DoYouWantToAttackMenWhoWillDestroyBank.txt"));
      BufferedReader lookInCloset = new BufferedReader(new FileReader("bin//MurderScript2//IfLooksInCloset.txt"));
      BufferedReader replyDeath2Secretary = new BufferedReader(new FileReader("bin//MurderScript2//IfRepliesDeathToSecretary.txt"));
      BufferedReader tellSecretaryCarl = new BufferedReader(new FileReader("bin//MurderScript2//IfTellsSecretaryCarl.txt"));
      BufferedReader userFiresBackAfterDrawer = new BufferedReader(new FileReader("bin//MurderScript2//IfUserFiresBackAfterDrawerScene.txt"));
      BufferedReader userJumpsOffLedge = new BufferedReader(new FileReader("bin//MurderScript2//IfUserJumpsOffLedge.txt"));
      BufferedReader userSaysLawsuit = new BufferedReader(new FileReader("bin//MurderScript2//IfUserSaysLawsuit.txt"));
      BufferedReader userShootsFloda = new BufferedReader(new FileReader("bin//MurderScript2//IfUserShootsFloda.txt"));
      BufferedReader introduction = new BufferedReader(new FileReader("bin//MurderScript2//IfUserTacklesFloda.txt"));
      BufferedReader userTacklesFloda = new BufferedReader(new FileReader("bin//MurderScript2//Introduction.txt"));
      BufferedReader neg2RepShopYNQuestion = new BufferedReader(new FileReader("bin//MurderScript2//NegativeToRepairShopYesNoQuestion.txt"));
      BufferedReader userGiveToCarlson = new BufferedReader(new FileReader("bin//MurderScript2//UserGivesItToCarlson.txt"));
      BufferedReader userLookInDrawer = new BufferedReader(new FileReader("bin//MurderScript2//UserLooksInDrawer.txt"));
      BufferedReader userLookInShelf = new BufferedReader(new FileReader("bin//MurderScript2//UserLooksInShelf.txt"));
      BufferedReader runInsteadShooting = new BufferedReader(new FileReader("bin//MurderScript2//UserRunsInsteadOfShooting.txt"));
      BufferedReader takesPhoneRepairShop = new BufferedReader(new FileReader("bin//MurderScript2//UserTakesItToPhoneRepairShop.txt"));
      BufferedReader waitPatientInsteadAttack = new BufferedReader(new FileReader("bin//MurderScript2//WaitPatientlyInsteadAttackMenBank.txt"));
      String str = null;
      List<String> list = new ArrayList<String>();
      while ((str = aff2RepShopQuestion.readLine()) != null) {
        list.add(str);
        
      }
      affirmativeToRepairShopQuestion = list.toArray(new String[list.size()]);
      list.clear();
      while((str = attackMenPushOutCar.readLine()) != null){
        list.add(str);
      }
      attackMenPushedYouOutCar = list.toArray(new String[list.size()]);
      list.clear();
      while((str = attackMenDestroyBank.readLine()) != null){
        list.add(str);
      }
      doYouWantToAttackMenWhoWillDestroyBank = list.toArray(new String[list.size()]);
      list.clear();
      while((str = lookInCloset.readLine()) != null){
        list.add(str);
      }
      ifLooksInCloset = list.toArray(new String[list.size()]);
      list.clear();
      while((str = replyDeath2Secretary.readLine()) != null){
        list.add(str);
      }
      ifRepliesDeathToSecretary = list.toArray(new String[list.size()]);
      list.clear();
      while((str = tellSecretaryCarl.readLine()) != null){
        list.add(str);
      }
      ifTellsSecretaryCarl = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userFiresBackAfterDrawer.readLine()) != null){
        list.add(str);
      }
      ifUserFiresBackAfterDrawerScene = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userJumpsOffLedge.readLine()) != null){
        list.add(str);
      }
      ifUserJumpsOffLedge = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userSaysLawsuit.readLine()) != null){
        list.add(str);
      }
      ifUserSaysLawsuit = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userShootsFloda.readLine()) != null){
        list.add(str);
      }
      ifUserShootsFloda = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userTacklesFloda.readLine()) != null){
        list.add(str);
      }
      ifUserTacklesFloda = list.toArray(new String[list.size()]);
      list.clear();
      while((str = neg2RepShopYNQuestion.readLine()) != null){
        list.add(str);
      }
      negativeToRepairShopYesNoQuestion = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userGiveToCarlson.readLine()) != null){
        list.add(str);
      }
      userGivesItToCarlson = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userLookInDrawer.readLine()) != null){
        list.add(str);
      }
      userLooksInDrawer = list.toArray(new String[list.size()]);
      list.clear();
      while((str = userLookInShelf.readLine()) != null){
        list.add(str);
      }
      userLooksInShelf = list.toArray(new String[list.size()]);
      list.clear();
      while((str = runInsteadShooting.readLine()) != null){
        list.add(str);
      }
      userRunsInsteadOfShooting = list.toArray(new String[list.size()]);
      list.clear();
      while((str = takesPhoneRepairShop.readLine()) != null){
        list.add(str);
      }
      userTakesItToPhoneRepairShop = list.toArray(new String[list.size()]);
      list.clear();
      while((str = waitPatientInsteadAttack.readLine()) != null){
        list.add(str);
      }
      waitPatientlyInsteadAttackMenBank = list.toArray(new String[list.size()]);
      list.clear();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  public String[] getAffToRepairShopQuestion() {
    return affirmativeToRepairShopQuestion;
  } 
  public String[] getAttackMenWhoPushedYouOutCar() {
    return attackMenPushedYouOutCar;
  } 
  public String[] getDoYouAttackMenWhoWillDestroyBank() {
    return doYouWantToAttackMenWhoWillDestroyBank;
  } 
  public String[] getLooksInCloset() {
    return ifLooksInCloset;
  } 
  public String[] getReplyDeathToSecretary() {
    return ifRepliesDeathToSecretary;
  } 
  public String[] getTellSecretaryCarl() {
    return ifTellsSecretaryCarl;
  } 
  public String[] getUserFiresBackAfterDrawerScene() {
    return ifUserFiresBackAfterDrawerScene;
  } 
  public String[] getUserJumpsOffLedge() {
    return ifUserJumpsOffLedge;
  } 
  public String[] getUserSaysLawsuit() {
    return ifUserSaysLawsuit;
  } 
  public String[] getUserShootsFloda() {
    return ifUserShootsFloda;
  } 
  public String[] getUserTacklesFloda() {
    return ifUserTacklesFloda;
  } 
  public String[] getIntro() {
    return introduction;
  } 
  public String[] getNegToRepShopYNQuestion() {
    return negativeToRepairShopYesNoQuestion;
  } 
  public String[] getGiveToCarlson() {
    return userGivesItToCarlson;
  } 
  public String[] getLookInDrawer() {
    return userLooksInDrawer;
  } 
  public String[] getLooksInShelf() {
    return userLooksInShelf;
  } 
  public String[] getRunsInsteadShoot() {
    return userRunsInsteadOfShooting;
  } 
  public String[] getTakesToPhoneRepShop() {
    return userTakesItToPhoneRepairShop;
  } 
  public String[] getWaitInsteadAttackBank() {
    return waitPatientlyInsteadAttackMenBank;
  } 
}
