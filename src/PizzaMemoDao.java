
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaMemoDao implements IPizzaDao {
	
	Scanner questionUser = new Scanner(System.in);
	
	public Pizza [] listPizza = new Pizza[8] ;
	
	
	public Pizza[] findAllPizzas() {
		
		listPizza [0] = new Pizza ("PEP" , "pépéroni" , 12.50) ;
		listPizza [1] = new Pizza ("MAR" , "Margherita" , 14.00) ;
		listPizza [2] = new Pizza ("REIN" , "La Reine" , 11.50) ;
		listPizza [3] = new Pizza ("FRC" , "La 4 Fromage" , 12.00) ;
		listPizza [4] = new Pizza ("CAN" , "La Cannibale" , 12.50) ;
		listPizza [5] = new Pizza ("SAV" , "La Savoyarde" , 13.00) ;
		listPizza [6] = new Pizza ("ORI" , "L'Orientale" , 13.50) ;
		listPizza [7] = new Pizza ("IND" , "L'Indienne" , 14.00) ;
		
		return listPizza ;
		
	}
	public void saveNewPizza(Pizza pizza) {
		
		
		Pizza [] newListPizza = new Pizza[listPizza.length + 1] ;
		
		for (int i = 0 ; i<listPizza.length ; i++) {
			newListPizza[i] = listPizza[i];
		}
		
		newListPizza [newListPizza.length - 1] = new Pizza (pizza.code , pizza.libelle , pizza.prix) ;
		listPizza  = newListPizza  ;
		listPizza[listPizza.length-1].id = listPizza.length-1 ;
		
	}
	public void updatePizza(String codePizza, Pizza pizza) {
		
		for ( int i = 0 ; i < listPizza.length ; i++ ) {
			if (listPizza [i].code.compareTo(codePizza) == 0) { //pour comparer des String
				
				listPizza [i] = new Pizza(i, pizza.code , pizza.libelle , pizza.prix) ;

			}
		}
		
	}
	public void deletePizza(String codePizza) {
		
		for ( int i = 0 ; i < listPizza.length ; i++ ) {
			if (listPizza [i].code.compareTo(codePizza) == 0) { //pour comparer des String
				
				Pizza [] newListPizza = new Pizza[listPizza.length -1] ;
				
				for (int j = i ; j < listPizza.length - 1 ; j++) {
					
					listPizza[j] = listPizza[j+1] ;
					listPizza[j].id = listPizza[j+1].id -1 ;
				
				}
				for (int j = 0 ; j < newListPizza.length ; j++) {
					
					newListPizza[j] = listPizza[j] ;
				
				}
				
				listPizza  = newListPizza  ;
				
			}
		}
		
		
	}
	public Pizza findPizzaByCode(String codePizza) {
		int indice = 0 ;
		for ( int i = 0 ; i < listPizza.length ; i++ ) {
			if (listPizza [i].code.compareTo(codePizza) == 0) {
				indice = i ;
			}
		}
		return listPizza[indice] ;
	}
	
	public boolean pizzaExists(String codePizza) {
		boolean existance = false ;
		
		for ( int i = 0 ; i < listPizza.length ; i++ ) {
			if (listPizza [i].code.compareTo(codePizza) == 0) {
				existance = true ;
			}
		
		
		}
		return existance ;
	}
}
