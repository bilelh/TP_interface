import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {
	
	Scanner questionUser = new Scanner(System.in);

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) {
		// TODO Auto-generated method stub
		
		System.out.println("Mise � jour d'une pizza  ");
		
		System.out.println("Veuillez choisir le code de la pizza � modifier:  ");
		questionUser.nextLine();
		String modif_code = questionUser.nextLine();
		
		
		boolean exist = pizzaDao.pizzaExists(modif_code) ;
		
		
		if (exist = true) {
		
		
			System.out.println("Veuillez saisir le nouveau code:  ");
			String newCode = questionUser.nextLine();
			
			System.out.println("Veuillez saisir le nouveau nom (sans espace):  ");
			String newLibelle = questionUser.nextLine();
			
			System.out.println("Veuillez saisir le nouveau prix (avec une virgule):  ");
			double newPrix = questionUser.nextDouble();
			
			Pizza newPizza = new Pizza (newCode , newLibelle , newPrix) ;
			
			pizzaDao.updatePizza(modif_code, newPizza);
		
		}
		
	}

}
