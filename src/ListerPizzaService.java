import fr.pizzeria.model.Pizza;

public class ListerPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaMemoDao pizza) {
		// TODO Auto-generated method stub
		
		for ( int i = 0 ; i < pizza.findAllPizzas().length ; i++) {
			
			System.out.println(pizza.findAllPizzas() [i].id + " _ " + pizza.findAllPizzas() [i].code + " -> " + pizza.findAllPizzas() [i].libelle + " ( " + String.format("%.2f" , pizza.findAllPizzas() [i].prix) + "€ )");
		
		}
		
	}
	
}
