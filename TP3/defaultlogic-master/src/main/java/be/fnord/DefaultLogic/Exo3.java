package be.fnord.DefaultLogic ;



import a.e;
import be.fnord.util.logic.DefaultReasoner ;
import be.fnord.util.logic.WFF ;
import be.fnord.util.logic.defaultLogic.DefaultRule ; 
import be.fnord.util.logic.defaultLogic.RuleSet ; 
import be.fnord.util.logic.defaultLogic.WorldSet ;

import java.util.HashSet ;
public  class  Exo3 {
public static void solution () {

        RuleSet rules = new RuleSet(); // pour mettre les defauts
        DefaultRule  d =  new  DefaultRule();  // creation  d'un  defaut  d1
        d.setPrerequisite("A&B"); 
        d.setJustificatoin("~C");
        d.setConsequence("~C");
        
        
        rules.addRule(d);

        WorldSet w1 = new WorldSet ();
        w1.addFormula ("A");
        w1.addFormula (" B");

        WorldSet w2 = new WorldSet ();
        w2.addFormula ("A");
        w2.addFormula ("B");
        w2.addFormula ("C");

        /* *************** execution world 1 *********** */
        try {
            a.e.println (" /**************** execution World 1 ************/\n\n\n");
            DefaultReasoner r = new DefaultReasoner ( w1 , rules ); // cration du raisonneur


            HashSet<String> scenarios  = r.getPossibleScenarios();  // faire  l' extension
            a.e.println (" W1 :\n\t { " + w1.toString() + " }\nD:\n\t {" + rules.toString() +" }");
            a.e.println (" Par clture  dductive et minimalit , cette thorie admet une  extension ");
            for ( String c : scenarios ) {
            a.e.println ("\t E: Th( W U (" + c + "))");
            // Added closure operator
            a.e.incIndent ();
            WFF world_and_ext = new WFF("(( " + w1.getWorld () + " ) & ("
            + c + "))");
            a.e.println(" = " + world_and_ext.getClosure ());
            a.e.decIndent ();
            }
            a.e.println ("");
        } catch ( Exception e){

        }

        /* *************** execution world 2 *********** */
        try {
                a.e.println (" /**************** execution World 2 ************/\n\n\n");
                DefaultReasoner r = new DefaultReasoner ( w2 , rules ); // c r a t i o n du raisonneur


                HashSet<String>  scenarios  = r.getPossibleScenarios();  // faire  l' extension
                a.e.println (" W1 : \n\t { " + w2.toString ()+ " }\n D:\n\t {" + rules.toString () +" }");
                a.e.println (" Par clture  dductive et minimalit , cette thorie admet une extension ");
                for ( String c : scenarios ) {
	                a.e.println("\t E: Th(W U (" + c + "))");
	                // Added closure operator
	                a.e.incIndent ();
	                WFF world_and_ext = new WFF ("(( " + w2.getWorld () + " ) & (" + c + "))");
	                a.e.println (" = " + world_and_ext.getClosure ());
	                a.e.decIndent ();
                }
                a.e.println ("");
            } catch ( Exception e){
                    
                    }
                    
                }	
                    
     		
		}	

