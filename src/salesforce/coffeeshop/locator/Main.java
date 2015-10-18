package salesforce.coffeeshop.locator;
import java.util.Map.Entry;
import java.util.TreeMap;
/**
 * 
 * The main class.
 * @author rbukka
 *
 */
public class Main {

	public static void main(String[] args) {
		
		if(args.length < 3)
		{
			System.out.println("Please check the usage");
			System.out.println("Usage: <prgram> <user y coord> <used x coord> <shop data filename>");
		}
		else
		{
			double userYCoordinate = Double.parseDouble(args[0]);
			double userXCoordinate = Double.parseDouble(args[1]);
			String dataBase = args[2];
			DatabaseReader reader = new DatabaseReader(dataBase);
			NearestShopLocator shopLocator = new NearestShopLocator();
			TreeMap<Double , String> nearestList = shopLocator.nearestCoffeeShop(reader.store, userXCoordinate, userYCoordinate);
			int maxReturn = 3;
			int counter = 0;
			for(Entry<Double, String> entry : nearestList.entrySet()) {
				  Double key = entry.getKey();
				  String value = entry.getValue();
				  if(counter < maxReturn)
				   System.out.println(value + "," + key);
				  counter++;
				}

		}

	}

}
