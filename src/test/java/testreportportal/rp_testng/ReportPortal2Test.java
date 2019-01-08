package testreportportal.rp_testng;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportPortal2Test {
	private static final Logger LOGGER = LogManager.getLogger(ReportPortal2Test.class);
  @Test
  public void f2() {
	  LOGGER.debug("************mystep1");
	  Assert.assertTrue(true);
	  LOGGER.info("************mystep2");
	  LOGGER.debug("************step3");
	  LOGGER.debug("************mystep4");
	  Assert.assertTrue(false);
	  LOGGER.debug("************mystep5");
	  
	  String jsonobject="{ \"name\":\"John\", \"age\":30, \"car\":null }";
  }
}
