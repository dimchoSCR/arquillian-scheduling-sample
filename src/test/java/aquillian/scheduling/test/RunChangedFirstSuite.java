package aquillian.scheduling.test;

import org.jboss.arquillian.junit.scheduling.ArquillianSuiteScheduling;
import org.jboss.arquillian.junit.scheduling.scheduler.ScheduleWith;
import org.jboss.arquillian.junit.scheduling.scheduler.changedfiles.ChangedFilesSuiteScheduler;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ArquillianSuiteScheduling.class)
@ScheduleWith(ChangedFilesSuiteScheduler.class)
@SuiteClasses({Class4Test.class,Class2Test.class,Class1Test.class})
public class RunChangedFirstSuite {

}