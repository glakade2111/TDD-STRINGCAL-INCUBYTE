package com.example.StringCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void StringcalculatorEmpty() {

		Stringcal calculator=new Stringcal();

		Assertions.assertEquals(0,Stringcal.add(""));
	}

}
