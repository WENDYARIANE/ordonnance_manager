package co.kozao.ordonnance_manager;

import java.util.Scanner;

public class App {
	
	public static Scanner scan = new Scanner(System.in);
    public static void main( String[] args )
    {
    	int choix = 0;
        
        while(choix != 4){

        	System.out.println("=====================GESTION ORDONNANCE====================");
        	System.out.println("=====================MEDECIN====================");
        	System.out.println("");
        	System.out.println("1. Creer une ordonnace");
        	System.out.println("2. Modifier une ordonnance");
        	System.out.println("3. Retour");
        	System.out.println("4. Quitter");
        	System.out.println("");
        	System.out.println("=====================MENU PATIENT====================");
        	System.out.println("5. Consulter mes ordonnaces");
        	System.out.println("6. Télécharger mon ordonnace");
        	System.out.println("7. Retour");
        	System.out.println("4. Quitter");
        	System.out.println("");
        	System.out.println("=====================PHARMACIEN====================");
        	System.out.println("5. consulter les ordonnances");
        	System.out.println("6. télécharger mon ordonnace");
        	System.out.println("7. Retour");
        	System.out.println("8. Quitter");
        	System.out.println("");
        	System.out.println("===============================================================");

        	System.out.println("Entrer votre choix :");
        	
        	if (scan.hasNextInt()) {
        		choix = scan.nextInt();
        		scan.nextLine(); 
       
        		
        	switch(choix) {
	        	case 1 :
	        		menuMedecin();
	        	break;
	        	case 2 :
	        		menuPatient();
	        	break;
	        	case 3 :
	        		menuPharmacien();
	        	break;
	        	case 4 :
	        		System.out.println("Fermeture du programme GESTION D'ORDONNANCE !");
	        		System.exit(0);
	        	break;
	        	
	          	default :
	          		System.out.println("Error, choisissez un nombre entre [1, 2, 3, 4]");
	          			
	            	}
	            	
        	}
        	else {
        		System.out.println("choisissez un nombre entre [1, 2, 3, 4]");
        		scan.next();
        	}
  
        	
        }
	}
    }

