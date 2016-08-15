package aquillian.scheduling.test;

import org.jboss.arquillian.junit.scheduling.ArquillianSuiteScheduling;
import org.jboss.arquillian.junit.scheduling.scheduler.latestfailed.LatestFailedSchedulerParams;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ArquillianSuiteScheduling.class)
@LatestFailedSchedulerParams(storagePath="statistics_short_term.xml",storeLongTerm=false)
@SuiteClasses({ Class1Test.class, Class2Test.class, Class4Test.class })
public class LatestFailedSuiteShorttermTest {

}
