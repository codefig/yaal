package on2013_05.on2013_05_17_CROC_Final.TaskC;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_05/on2013_05_17_CROC_Final/TaskC/TaskC.task"))
			Assert.fail();
	}
}
