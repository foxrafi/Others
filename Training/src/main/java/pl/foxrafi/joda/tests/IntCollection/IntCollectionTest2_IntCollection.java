package pl.foxrafi.joda.tests.IntCollection;

import java.io.Console;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.joda.primitives.collection.IntCollection;
import org.joda.primitives.collection.impl.ArrayIntCollection;

import com.sun.jna.platform.win32.Kernel32;

public class IntCollectionTest2_IntCollection {

	public static final Logger logger = LogManager.getLogger(IntCollectionTest2_IntCollection.class);
	
	public static void main(String[] args) throws InterruptedException {
		IntCollection ic = new ArrayIntCollection();
				
		int pid = Kernel32.INSTANCE.GetCurrentProcessId();
		logger.info("Process id : " + pid);
		int range = 0;
		
		while(range < 20_000_000){
			ic.addAll(range, range + 100_000);
			logger.info("Range added <" + range + "," + (range + 100_000) + ">");
			Thread.sleep(1000);
			range += 100_000;
		}
		
		Console c = System.console();
		if(c != null) {
			c.format("Press Enter to proceed.\n");
			c.readLine();
		}
	}
}
