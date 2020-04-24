package com.sankuai.inf.leaf.server;

import com.sankuai.inf.leaf.server.controller.LeafController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeafServerApplicationTests {

	@Autowired
	LeafController leafController;
	@Test
	public void contextLoads() {

		for (int i = 0; i < 1000; ++i) {
			String a = leafController.getSegmentId("segment-test");
			System.out.println(a);

		}

	}

}
