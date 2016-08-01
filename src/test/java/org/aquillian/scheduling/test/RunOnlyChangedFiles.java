package org.aquillian.scheduling.test;

import org.jboss.arquillian.junit.scheduling.ArquillianSuiteScheduling;
import org.jboss.arquillian.junit.scheduling.scheduler.ScheduleSuiteWith;
import org.jboss.arquillian.junit.scheduling.scheduler.changedfiles.ChangedFilesSuiteSchedulerParams;
import org.jboss.arquillian.junit.scheduling.scheduler.suite.ChangedFilesSuiteScheduler;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ArquillianSuiteScheduling.class)
@ScheduleSuiteWith(ChangedFilesSuiteScheduler.class)
@SuiteClasses({Class2Test.class, Class4Test.class,Class1Test.class,})
@ChangedFilesSuiteSchedulerParams(runOnlyChangedFiles=true)
public class RunOnlyChangedFiles {

}
