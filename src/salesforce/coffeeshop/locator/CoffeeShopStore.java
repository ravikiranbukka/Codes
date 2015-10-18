/**
 * 
 */
package salesforce.coffeeshop.locator;

import java.util.HashMap;

/**
 * This class stores the information of all coffee shops given.
 * @author rbukka
 *
 */
public class CoffeeShopStore {

	HashMap<String, CoffeeShop> allShops;
	
	public CoffeeShopStore()
	{
		allShops = new HashMap<String, CoffeeShop>();
	}
	
	public void appendCoffeeShopStore(String name, CoffeeShop shop)
	{
		allShops.put(name, shop);
	}
	
}
