package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzaService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.PizzaMemoDao;
import fr.pizzeria.service.SupprimerPizzaService;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PizzaMemoDao pizza = new PizzaMemoDao() ;
		pizza.initialisation();
		MenuService liste = new ListerPizzaService () ;
		MenuService ajout = new AjouterPizzaService () ;
		MenuService modif = new ModifierPizzaService () ;
		MenuService suppr = new SupprimerPizzaService () ;
		
		
		
							// SCANNER QUI PERMET DE RECUPERER LA SAISIE CLAVIER
		Scanner questionUser = new Scanner(System.in);

							// AFFICHAGE DE LA LISTE DES OPTIONS
		System.out.println("***** Pizzeria Administration *****  " );
		System.out.println("1. Lister les pizzas  ");
		System.out.println("2. Ajouter une nouvelle pizza  ");
		System.out.println("3. Mettre à jour une pizza  ");
		System.out.println("4. Supprimer une pizza  ");
		System.out.println("99. Sortir  ");
		
		System.out.println("Veuillez faire votre choix");
		int user_choice = questionUser.nextInt();
		
		while (user_choice != 99) {
		
							// CHOIX 1. AFFICHAGE DE LA LISTE DE PIZZAS
			if (user_choice == 1) {     
				
				liste.executeUC(pizza);
				
							
							// CHOIX 2. AJOUT D'UNE PIZZA
			} else if ( user_choice == 2) { 
				
				ajout.executeUC(pizza);
				
							// CHOIX 3. MODIFICATION D'UNE PIZZA
			} else if ( user_choice == 3) {
				
				modif.executeUC(pizza);
				
							// CHOIX 4. SUPPRESSION D'UNE PIZZA
			} else if ( user_choice == 4) {
				
				suppr.executeUC(pizza);
				
							// MESSAGE POUR LE CAS OU L'OPTION SAISIE N'EST PAS DISPONIBLE
			} else {
				
				System.out.println("Je n'ai pas compris, Veuillez recommencer ");
				
			}
			
							// AFFICHAGE DE LA LISTE DES OPTIONS 
			System.out.println("***** Pizzeria Administration *****  ");
			System.out.println("1. Lister les pizzas  ");
			System.out.println("2. Ajouter une nouvelle pizza  ");
			System.out.println("3. Mettre à jour une pizza  ");
			System.out.println("4. Supprimer une pizza  ");
			System.out.println("99. Sortir  ");
			
			System.out.println("Veuillez faire votre choix");
			user_choice = questionUser.nextInt();
			
		}
		
							// MESSAGE DE FIN POUR LE CHOIX 99.
		System.out.println("Aurevoir :(  ");
		
	}

}
