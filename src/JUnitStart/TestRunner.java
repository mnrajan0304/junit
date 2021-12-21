package JUnitStart;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitIntro.class);
		
		List<Failure> fail = result.getFailures();
		
		for(Failure f: fail) {
			System.out.println(f.toString());
		}
		System.out.println(result.wasSuccessful());
		
		System.out.println(result.getRunCount());
	}

}
