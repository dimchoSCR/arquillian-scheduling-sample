package aquillian.scheduling.test;

import static org.junit.Assert.*;

import org.jboss.arquillian.junit.scheduling.ArquillianScheduling;
import org.jboss.arquillian.junit.scheduling.scheduler.latestfailed.LatestFailedSchedulerParams;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ArquillianScheduling.class)
@LatestFailedSchedulerParams(storagePath="statistics_short_term.xml",storeLongTerm=false)
public class LatestFailedShortterm {
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}
	@Test
	public void test2() {
		
	}
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
}
