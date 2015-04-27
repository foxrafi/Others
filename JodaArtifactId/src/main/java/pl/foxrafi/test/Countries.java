package pl.foxrafi.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Countries {

	private static Logger logger = LogManager.getLogger(Countries.class);
	
	public Countries() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMyCountries(){
		List<String> countries = new ArrayList<String>();
		countries.add("Poland");
		countries.add("Germany");
		countries.add("France");
		countries.add("Switzerland");
		
		for(String country : countries) {
			logger.info(country);
		}
	}
	
	public static void main(String[] args) {
		Countries c = new Countries();
		c.printMyCountries();
	}

}
