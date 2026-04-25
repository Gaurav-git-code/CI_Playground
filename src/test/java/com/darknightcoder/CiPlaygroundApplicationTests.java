package com.darknightcoder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiPlaygroundApplicationTests {

	@Test
	void contextLoads() {
        throw new RuntimeException("Intentional failure for CI verification");
	}

}
