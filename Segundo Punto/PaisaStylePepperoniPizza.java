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
public class PaisaStylePepperoniPizza extends Pizza {
    
	public PaisaStylePepperoniPizza() {
		name = "Paisa Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "kumato Tomato Sauce";
 
		toppings.add("Gouda Cheese");
		toppings.add("Ham Pepperoni");
		toppings.add("Olives");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
