package com.xujun.demo.quick;

import com.xujun.demo.quick.controller.domain.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
class SpringboottestApplicationTests {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private Person person;
	@Test
	void contextLoads() {

        System.out.println(person);
        logger.info("---info---");
        logger.debug("---debug---");
        logger.trace("---trace---");
        logger.error("---error---");
	}

}
