package salesforce.coffeeshop.locator;

import java.util.TreeMap;
import java.util.Map.Entry;

public class NearestShopLocatorTest {

	public static void main(String[] args)
	{
		CoffeeShop shopA = new CoffeeShop();
		shopA.name = "A";
		shopA.xCoordinate = 0;
		shopA.yCoordinate = 0;
		
		CoffeeShopStore store = new CoffeeShopStore();
		store.allShops.put(shopA.name, shopA);
		
		NearestShopLocator nrt = new NearestShopLocator();
		TreeMap<Double , String> nearestList = nrt.nearestCoffeeShop(store, 1, 1);
		int maxReturn = 3;
		int counter = 0;
		for(Entry<Double, String> entry : nearestList.entrySet()) {
			  Double key = entry.getKey();
			  String value = entry.getValue();
			  if(counter < maxReturn)
			  {
			   System.out.println(value + "," + key);
			   assert value.equals(shopA.name);
 			  }
			  counter++;
			}
		
	}
}
