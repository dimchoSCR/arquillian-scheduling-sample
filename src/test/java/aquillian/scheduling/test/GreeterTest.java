package aquillian.scheduling.test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.scheduling.ArquillianScheduling;
import org.jboss.arquillian.junit.scheduling.scheduler.ScheduleWith;
import org.jboss.arquillian.junit.scheduling.scheduler.latestfailed.LatestFailedScheduler;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import aquillian.scheduling.test.Greeter;
import aquillian.scheduling.test.PhraseBuilder;

@RunWith(ArquillianScheduling.class)
@ScheduleWith(LatestFailedScheduler.class)
public class GreeterTest {

	@Deployment
	public static JavaArchive createDeployment(){
		return ShrinkWrap.create(JavaArchive.class)
				.addClasses(Greeter.class,PhraseBuilder.class)
				.addAsManifestResource(EmptyAsset.INSTANCE,"beans.xml");
	}
	
	@Inject
	Greeter greeter;
	
	@Test
	public void shouldCtreateGreeting() {
		assertEquals("Hello, Dimcho!", greeter.createGreeting("Dimcho"));
	}
	
	@Test
	public void failTest(){
		fail("Failing for test information purposes");
	}
}
