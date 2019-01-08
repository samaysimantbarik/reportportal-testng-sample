package testreportportal.rp_testng;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportPortal1Test {
	private static final Logger LOGGER = LogManager.getLogger(ReportPortal1Test.class);
  @Test
  public void f1() {
	  LOGGER.debug("************step1");
	  Assert.assertTrue(true);
	  LOGGER.info("************step2");
	  LOGGER.debug("************step3");
	  LOGGER.debug("************step4");
	  Assert.assertTrue(true);
	  LOGGER.debug("************step1");
	  
	  String jsonobject="{ \"name\":\"John\", \"age\":30, \"car\":null }";
  }
}
