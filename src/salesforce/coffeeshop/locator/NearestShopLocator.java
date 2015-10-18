package salesforce.coffeeshop.locator;
/*
 * This class generates a tree map based on nearest coffee shops.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NearestShopLocator {

    public TreeMap<Double, String> nearestCoffeeShop(CoffeeShopStore store, double userXCoordinate, double userYCoordinate)
    {
    	TreeMap<Double , String> nearestShops = new TreeMap<Double, String>();
    	
    	Iterator<Entry<String, CoffeeShop>> it = store.allShops.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, CoffeeShop> pair = (Entry<String, CoffeeShop>)it.next();
            double distance = Math.sqrt(Math.pow(userXCoordinate - ((CoffeeShop)pair.getValue()).xCoordinate, 2) 
            		+ Math.pow(userYCoordinate - ((CoffeeShop)pair.getValue()).yCoordinate, 2));
            nearestShops.put(distance, pair.getKey());
        }
    	return nearestShops;
    	
    	
    }
	
}
