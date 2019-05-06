import fr.pizzeria.model.Pizza;

public class ListerPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaMemoDao pizzaDao) {
		// TODO Auto-generated method stub
		
		System.out.println("Liste des pizzas  ");
		
		for ( int i = 0 ; i < pizzaDao.findAllPizzas().length ; i++) {
			
			System.out.println(pizzaDao.findAllPizzas() [i].id + " _ " + pizzaDao.findAllPizzas() [i].code + " -> " + pizzaDao.findAllPizzas() [i].libelle + " ( " + String.format("%.2f" , pizzaDao.findAllPizzas() [i].prix) + "€ )");
		
		}
		
	}
	
}
