package be.fnord.DefaultLogic;

import java.util.Scanner;

public class Main {
	
	 public static void main( String[] args )
	    {
		 Scanner sc= new Scanner(System.in); 
		 System.out.print("Entrer le numéro de l'exercice : ");
		 int choix= sc.nextInt();
		 
		 switch(choix)
		 {
		   
	       case 1: 
	           Exo1.solution();
	           break;
	   
	       case 2:
	           Exo2.solution();
	           break;
	   
	       case 3:
	           Exo3.solution();
	           break;
	       default:
	           System.out.println("Choix incorrect");
	           break;
	   }
	        
	    }

}
