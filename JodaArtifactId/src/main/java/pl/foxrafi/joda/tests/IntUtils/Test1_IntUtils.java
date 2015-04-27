package pl.foxrafi.joda.tests.IntUtils;

import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.joda.primitives.IntUtils;
import org.joda.primitives.collection.IntCollection;
import org.joda.primitives.collection.impl.ArrayIntCollection;

public class Test1_IntUtils {

	private static Logger logger = LogManager.getLogger(Test1_IntUtils.class);
	
	public static void main(String[] args) {
		IntCollection ic = new ArrayIntCollection();
		ic.addAll(1, 250);
		
		int[] num = IntUtils.toPrimitiveArray(ic);

		logger.info(Arrays.toString(num));
	}

}
