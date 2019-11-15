/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzafm;

/**
 *
 * @author Usuario
 */
public class PaisaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new PaisaStyleCheesePizza();
        	} else if (item.equals("creole")) {
        	    	return new PaisaStyleCreolePizza();
        	} else if (item.equals("hawaian")) {
        	    	return new PaisaStyleHawaianPizza();
        	} else if (item.equals("pepperoni")) {
            		return new PaisaStylePepperoniPizza();
        	} else return null;
	}
}

