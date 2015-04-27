package pl.foxrafi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CountriesAction {

	private static Logger logger = LogManager.getLogger(CountriesAction.class);
	
	public void printMyCountries(){
		List<String> countries = new ArrayList<String>();
		
		logger.info("Initial capacity of our arraylist is : " + countries.size());
		countries.add("Poland");
		countries.add("Germany");
		countries.add("France");
		countries.add("Switzerland");
		countries.add("United Kingdom");
		countries.add("algeria");
		countries.add("Australia");
		
		Collections.sort(countries);
		
		for(String country : countries) 
			logger.info(country);
	}
	
	public static void main(String[] args) {
		CountriesAction c = new CountriesAction();
		c.printMyCountries();
	}

}
