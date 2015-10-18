/**
 * 
 */
package salesforce.coffeeshop.locator;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * This class creates the database.
 * @author rbukka
 *
 */
public class DatabaseReader {

	CoffeeShopStore store;
	
	public DatabaseReader(String fileName)
	{
		store = new CoffeeShopStore();
		File dir = new File(".");
		File fin = null;
		try {
			fin = new File(dir.getCanonicalPath() + File.separator + fileName);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				List<String> attrList = Arrays.asList(line.split(","));
				if (attrList.size() == 3)
				{	
				  CoffeeShop shop = new CoffeeShop();
				  shop.name = attrList.get(0);
				  shop.yCoordinate = Double.parseDouble(attrList.get(1));
				  shop.xCoordinate = Double.parseDouble(attrList.get(2));
				  store.allShops.put(shop.name, shop);
				}
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}
	
}
