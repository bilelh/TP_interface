package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzaService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MenuService liste = new ListerPizzaService () ;
		MenuService ajout = new AjouterPizzaService () ;
		MenuService modif = new ModifierPizzaService () ;
		MenuService Suppr = new SupprimerPizzaService () ;
		
		
		
		
		
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
				System.out.println("Liste des pizzas  ");
				
				for ( int i = 0 ; i < listPizza.length ; i++) {
					
					System.out.println(listPizza [i].id + " _ " + listPizza [i].code + " -> " + listPizza [i].libelle + " ( " + String.format("%.2f" , listPizza [i].prix) + "€ )");
				
				}
							
							// CHOIX 2. AJOUT D'UNE PIZZA
			} else if ( user_choice == 2) { 
				System.out.println("Ajout d'une nouvelle pizza  ");
				
				System.out.println("Veuillez saisir le code:  ");
				questionUser.nextLine();
				String newCode = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le nom (sans espace):  ");
				String newLibelle = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le prix (avec une virgule):  ");
				double newPrix = questionUser.nextDouble();
				
				Pizza [] newListPizza = new Pizza[listPizza.length + 1] ;
				
				for (int i = 0 ; i<listPizza.length ; i++) {
					newListPizza[i] = listPizza[i];
				}
				
				newListPizza [newListPizza.length - 1] = new Pizza (newCode , newLibelle , newPrix) ;
				listPizza  = newListPizza  ;
				listPizza[listPizza.length-1].id = listPizza.length-1 ;
				
				
							// CHOIX 3. MODIFICATION D'UNE PIZZA
			} else if ( user_choice == 3) {
				System.out.println("Mise à jour d'une pizza  ");
				
				System.out.println("Veuillez choisir le code de la pizza à modifier:  ");
				questionUser.nextLine();
				String modif_code = questionUser.nextLine();
				
				boolean modif_reussite = false ;
				
				for ( int i = 0 ; i < listPizza.length ; i++ ) {
					if (listPizza [i].code.compareTo(modif_code) == 0) { //pour comparer des String
						
						System.out.println("Veuillez saisir le nouveau code:  ");
						String newCode = questionUser.nextLine();
						
						System.out.println("Veuillez saisir le nouveau nom (sans espace):  ");
						String newLibelle = questionUser.nextLine();
						
						System.out.println("Veuillez saisir le nouveau prix (avec une virgule):  ");
						double newPrix = questionUser.nextDouble();
						
						listPizza [i] = new Pizza(i, newCode , newLibelle , newPrix) ;
						
						modif_reussite = true ;
						
				
					}
				}
				if (modif_reussite) {
					System.out.println("La modification a été prise en compte");
				} else {
					System.out.println("Le code n'existe pas");
				}
				
							// CHOIX 4. SUPPRESSION D'UNE PIZZA
			} else if ( user_choice == 4) {
				System.out.println("Suppression d'une pizza ");
				
				
				System.out.println("Veuillez choisir le code de la pizza à supprimer:  ");
				questionUser.nextLine();
				String suppr_code = questionUser.nextLine();
				
				boolean suppr_reussite = false ;
				
				for ( int i = 0 ; i < listPizza.length ; i++ ) {
					if (listPizza [i].code.compareTo(suppr_code) == 0) { //pour comparer des String
						
						Pizza [] newListPizza = new Pizza[listPizza.length -1] ;
						
						for (int j = i ; j < listPizza.length - 1 ; j++) {
							
							listPizza[j] = listPizza[j+1] ;
							listPizza[j].id = listPizza[j+1].id -1 ;
						
						}
						for (int j = 0 ; j < newListPizza.length ; j++) {
							
							newListPizza[j] = listPizza[j] ;
						
						}
						
						listPizza  = newListPizza  ;
						
						suppr_reussite = true ;
					
					}
				}
				if (suppr_reussite) {
					
					System.out.println("La modification a été prise en compte");
					
				} else {
					
					System.out.println("Le code n'existe pas");
					
				}
				
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
