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
 * @created 9/16/15 : 2:23 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)   // 1
@SpringApplicationConfiguration(classes = DemotestApplication.class)   // 2
@WebAppConfiguration   // 3
@IntegrationTest("server.port:0")   // 4
public class LiveTestServiceTest extends TestCase {

	@Autowired
	private LiveTestService liveTestService;

	@Test
	public void testGetHello() throws Exception {
		assertEquals("Hello World", liveTestService.getHello());
	}

	@Test
	public void testMultiply() throws Exception {

		LiveTestService service = new LiveTestService();

		assertEquals(4, service.multiply(2,2));

		assertEquals(1, service.multiply(1,1));

		assertEquals(2, service.multiply(1,2));

	}

	@Test
	public void testAdd() throws Exception {

		LiveTestService service = new LiveTestService();

		assertEquals(2, service.add(1, 1));

		assertEquals(3, service.add(1,2));

		assertEquals(4, service.add(2,2));

	}
}