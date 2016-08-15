package aquillian.scheduling.test;

import static org.junit.Assert.*;

import org.jboss.arquillian.junit.scheduling.ArquillianScheduling;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ArquillianScheduling.class)
public class LatestFailedLongtermTest{
	@Test
	public void test1() {
		fail();
	}
	@Test
	public void test2() {
		
	}
	@Test
	public void test3() {
		fail();
	}
}
