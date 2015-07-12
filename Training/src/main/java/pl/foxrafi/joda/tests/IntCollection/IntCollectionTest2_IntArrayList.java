package pl.foxrafi.joda.tests.IntCollection;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.sun.jna.platform.win32.Kernel32;

public class IntCollectionTest2_IntArrayList {
	
	public static final Logger logger = LogManager.getLogger(IntCollectionTest2_IntArrayList.class);

	public static void main(String[] args) throws InterruptedException {
		List<Integer> ic = new ArrayList<Integer>();
		
		int pid = Kernel32.INSTANCE.GetCurrentProcessId();
		logger.info("Process id : " + pid);
		int range = 0;
		
		while(range < 20_000_000)
		{
			
			for(int i= range; i<range + 100_000; i++)
			   ic.add(i);
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
