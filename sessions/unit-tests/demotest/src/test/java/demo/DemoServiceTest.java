package demo;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Copyright (C) Ethode LLC. - All Rights Reserved Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 *
 * @author Nick Artman<nick@addosolutions.com>
 * @created 9/9/15 : 11:08 AM
 */

@RunWith(SpringJUnit4ClassRunner.class)   // 1
@SpringApplicationConfiguration(classes = DemotestApplication.class)   // 2
@WebAppConfiguration   // 3
@IntegrationTest("server.port:0")   // 4
public class DemoServiceTest extends TestCase {

	@Autowired
	private DemoService demoService;

	public void setUp() throws Exception {
		super.setUp();

	}

	public void tearDown() throws Exception {

	}

	@Test
	public void testIsNumeric() throws Exception {
		DemoService demoService = new DemoService();

		assertTrue(demoService.isNumeric("12345"));
		assertTrue(demoService.isNumeric("123.45"));
		assertTrue(demoService.isNumeric("12345.0"));
		assertTrue(demoService.isNumeric("1"));
		assertFalse(demoService.isNumeric("a12345"));
		assertFalse(demoService.isNumeric("12a345"));
		assertFalse(demoService.isNumeric("12345a"));
		assertFalse(demoService.isNumeric("(12345)"));
	}

	@Test
	public void testGetMyValue() throws Exception {
		assertEquals("Hello!", demoService.getMyValue());
	}
}