package com.arshin.jenkins.dummy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DummyApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(DummyApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info(" test casse executing");
		logger.info(" test casse executing***");
		assertEquals(true, true);
	}

}
