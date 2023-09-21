package be.fnord.DefaultLogic ;
import a.e;
import be.fnord.util.logic.DefaultReasoner ;
import be.fnord.util.logic.WFF ;
import be.fnord.util.logic.defaultLogic.DefaultRule ;
import be.fnord.util.logic.defaultLogic.RuleSet ;
import be.fnord.util.logic.defaultLogic.WorldSet ;
import java.util.HashSet ;

public class Exo1 {

 public static void solution (){

	 RuleSet rules = new RuleSet (); // pour mettre les dfault
	
	DefaultRule d1 = new DefaultRule (); // cration d'un dfault d1
	/* ****************** Difinition dun dfault d1 ******************** */
	 d1.setPrerequisite ("A");
	
	 d1.setJustificatoin ("B");
	d1.setConsequence ("C");
	 rules.addRule (d1);
	
	
	 DefaultRule d2 = new DefaultRule (); // cration d'un dfault d2
	 /* ****************** Difinition dun dfault d2 ******************** */
	 d2.setPrerequisite ("A");
	d2.setJustificatoin (e.NOT +"C");
	d2.setConsequence ("D");
	rules.addRule (d2);
	
	
	
	/* ****************** Difinition dun monde w1 ******************** */
	WorldSet w1= new WorldSet();
	w1.addFormula (e.NOT +"A");
	
	
	
	/* ****************** Difinition dun monde w2 ******************** */
	 WorldSet w2= new WorldSet();
	 w2.addFormula ("A");
	 w2.addFormula (e.NOT +"B");
	
	/* ****************** Difinition dun monde w3 ******************** */
	WorldSet w3= new WorldSet();
	w3.addFormula ("A");
	w3.addFormula ("("+e.NOT +"C"+ e.OR+e.NOT +"D)");
	
	
	/* ****************** Difinition dun monde w4 ******************** */
	WorldSet w4= new WorldSet();
	w4.addFormula ("A");
	w4.addFormula ("("+e.NOT +"B"+ e.AND +"C)");
	
	
	
	
	 /* *************** execution W1 *********** */
	 try {
	 a.e.println("/**************** execution World 1 ************/\n\n\n");
	 DefaultReasoner r = new DefaultReasoner (w1 , rules ); // cration du raisonneur
	
	
	 HashSet < String > scenarios = r.getPossibleScenarios (); // faire l'extension
	 a.e.println ("W1 : \n\t { " + w1.toString ()+ " }\n D: \n\t {" + rules.toString () +" }");
	 a.e.println ("Par clture  dductive et minimalit ");
	 for ( String c : scenarios ) {
	 a.e.println ("\t E: Th(W U (" + c + "))");
	 // Added closure operator
	 a.e.incIndent ();
	 WFF world_and_ext = new WFF ("(( " + w1.getWorld () + " ) & ("
	 + c + "))");
	 a.e.println ("= " + world_and_ext.getClosure ());
	 a.e.decIndent ();
	 }
	 a.e.println ("");
	 } catch ( Exception e){
	
	 }
	
	 /* *************** execution W2 *********** */
	 try {
	 a.e.println (" /**************** execution World 2 ************/\n\n\n");
	 DefaultReasoner r = new DefaultReasoner (w2 , rules );
	 HashSet < String > scenarios = r.getPossibleScenarios ();
	 a.e.println ("W1 : \n\t { " + w2.toString ()
	 + " }\n D: \n\t {" + rules.toString () +" }");
	 a.e.println ("Par clture  dductive et minimalit");
	 for ( String c : scenarios ) {
	 a.e.println ("\t E: Th(W U (" + c + "))");
	 // Added closure operator
	 a.e.incIndent ();
	 WFF world_and_ext = new WFF ("(( " + w2.getWorld () + " ) & ("
	+ c + "))");
	 a.e.println ("= " + world_and_ext.getClosure ());
	 a.e.decIndent();
	 }
	 a.e.println ("");
	 } catch ( Exception e){
	 }
	
	 /* *************** execution W3 *********** */
	 try {
	 a.e.println (" /**************** execution World 3 ************/\n\n\n");
	 DefaultReasoner r = new DefaultReasoner (w3 , rules );
	 HashSet < String > scenarios = r.getPossibleScenarios ();
	 a.e.println ("W1 : \n\t { " + w3.toString ()
	 + " }\n D: \n\t {" + rules.toString () +" }");
	 a.e.println ("Par clture  dductive et minimalit ");
	 for ( String c : scenarios ) {
	 a.e.println ("\t E: Th(W U (" + c + "))");
	 // Added closure operator
	 a.e.incIndent ();
	 WFF world_and_ext = new WFF ("(( " + w3.getWorld () + " ) & ("
	 + c + "))");
	 a.e.println ("= " + world_and_ext.getClosure ());
	 a.e.decIndent ();
	 }
	 a.e.println ("");
	 } catch ( Exception e){
	 }
	
	 /* *************** execution W4 *********** */
	 try {
	 a.e.println (" /**************** execution World 4 ************\n\n\n");
	 DefaultReasoner r = new DefaultReasoner (w4 , rules );
	
	 HashSet < String > scenarios = r.getPossibleScenarios ();
	 a.e.println ("W1 : \n\t { " + w4.toString ()
	 + " }\n D: \n\t {" + rules.toString () +" }");
	 a.e.println ("Par clture  dductive et minimalit ");
	 for ( String c : scenarios ) {
	 a.e.println ("\t E: Th(W U (" + c + "))");
	 // Added closure operator
	a.e.incIndent ();
	 WFF world_and_ext = new WFF ("(( " + w4.getWorld () + " ) & ("
	 + c + "))");
	 a.e.println ("= " + world_and_ext.getClosure ());
	 a.e.decIndent ();
	
	 }
	 a.e.println ("");
	
	 } catch ( Exception e){
	
	 }

 }


 }