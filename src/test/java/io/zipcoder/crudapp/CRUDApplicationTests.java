package io.zipcoder.crudapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration({ "file:src/main/java/WEB-INF/dispatcher-servlet.xml" })
@SpringBootTest
public class CRUDApplicationTests {

	@Test
	public void contextLoads() {
	}

}
