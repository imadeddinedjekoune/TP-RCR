package be.fnord.DefaultLogic ;
import a.e;
import be.fnord.util.logic.DefaultReasoner ;
import be.fnord.util.logic.WFF ;
import be.fnord.util.logic.defaultLogic.DefaultRule ;
import be.fnord.util.logic.defaultLogic.RuleSet ;
import be.fnord.util.logic.defaultLogic.WorldSet ;

import java.util.HashSet ; 
public class Exo2 
{

    public static void solution () {
                    RuleSet rules = new RuleSet(); // pour mettre les dfauts 
                    DefaultRule d =  new  DefaultRule ();  // c r a t i o n  d' un  d  f a u t  d1 d.set Prerequisite (" A");
                    d.setJustificatoin ( e.NOT +" B"); d.setConsequence ("B"); rules.addRule(d);

                    WorldSet w= new WorldSet (); w.addFormula ("A");

                    /* *************** execution *********** */ try {
                    a.e.println (" /**************** execution World ************/\n\n\n"); 
                    DefaultReasoner r = new DefaultReasoner(w, rules ); // cration du raisonneur

                    HashSet < String >  scenarios  = r.getPossibleScenarios();  // faire  l'extension 
                    a.e.println (" W1 : \n\t { " + w.toString ()+ " }\n D: \n\t {" + rules.toString () +" }");
                    a.e.println (" Par clture dductive et minimalit Extensions :  ");
                    for ( String c : scenarios ) {
                    a.e.println ("\t E: Th( W U (" + c + "))");
                    // Added closure operator
                    a.e.incIndent ();
                    WFF world_and_ext = new WFF ("(( " + w.getWorld() + " ) & ("
                    + c + "))");
                    a.e.println (" = " + world_and_ext.getClosure());
                    a.e.decIndent();
                    }
                    a.e.println ("");
                    } catch ( Exception e){
                    }

    }
			
            
}	