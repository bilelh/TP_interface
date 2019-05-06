import fr.pizzeria.model.Pizza;

public class ListerPizzaService extends MenuService {

	@Override
	public void executeUC(Pizza [] pizza) {
		// TODO Auto-generated method stub
		
		for ( int i = 0 ; i < pizza.length ; i++) {
			
			System.out.println(pizza [i].id + " _ " + pizza [i].code + " -> " + pizza [i].libelle + " ( " + String.format("%.2f" , pizza [i].prix) + "€ )");
		
		}
		
	}
	
}
