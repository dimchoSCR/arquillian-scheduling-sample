package aquillian.scheduling.test;

import org.jboss.arquillian.junit.scheduling.ArquillianSuiteScheduling;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ArquillianSuiteScheduling.class)
@SuiteClasses({ Class1Test.class, Class2Test.class, Class4Test.class })
public class LatestFailedSuiteTestLongterm {
	
}
