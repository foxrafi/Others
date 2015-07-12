package pl.foxrafi.joda.primitives.training.IntCollection;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.joda.primitives.collection.IntCollection;
import org.joda.primitives.collection.impl.ArrayIntCollection;

public class IntCollectionTest1 {	

	private static final Logger logger = LogManager.getLogger(IntCollectionTest1.class);

	public static void main(String[] args) {
		IntCollection ic = new ArrayIntCollection();
		logger.info("An object of IntCollection  was created.");
		
		//add an array of ints
		logger.info("Adding an array of 2 int values the main collection.");
		int[] intTable = {100,200};
		ic.addAll(intTable);
		
		//add one int value
		logger.info("Adding an int value to the main collection.");
		int i = 300;
		ic.add(i);
		
		//add one Integer object
		logger.info("Adding one Integer object to the main collection.");
		Integer j = 400;
		ic.add(j);
		
		//Normal array list with integers
		logger.info("Adding an ArrayList to the main collection");
		List<Integer> ali = new ArrayList<Integer>();
		ali.add(500); ali.add(600);
		ic.addAll(ali);
		
		//Add a range of int values starting from 601 ending at 610
		logger.info("Adding a range of int values to the main collection");
		ic.addAll(601, 610);
		
		//Add another IntCollection
		logger.info("Adding another IntCollection to the main collection");
		IntCollection ic2 = new ArrayIntCollection();
		ic2.addAll(700,710);		
		ic.addAll(ic2);
	}
}
