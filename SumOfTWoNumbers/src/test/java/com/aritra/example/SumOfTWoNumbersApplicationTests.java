package com.aritra.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aritra.example.service.AddService;

@SpringBootTest
@RunWith(SpringRunner.class)
class SumOfTWoNumbersApplicationTests {

	@Autowired
	private AddService addService;

	@Test
	void testAddNumbers() {

		assertEquals(5, addService.addNumbers(2, 3));

	}

}
