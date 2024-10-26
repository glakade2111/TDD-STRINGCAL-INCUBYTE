package com.example.StringCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void StringcalculatorEmpty() {


		Assertions.assertEquals(0,Stringcal.add(""));
	}

	@Test
	void StringcalOneDigit()
	{

		Assertions.assertEquals(3,Stringcal.add("3"));
	}

	@Test
	void StringcalTwoDigit()
	{
		Assertions.assertEquals(5,Stringcal.add("3,2"));
	}

	@Test
	void StringcalMulDigit()
	{
		Assertions.assertEquals(6,Stringcal.add("1,2,3"));
	}

	@Test
	void StringcalNegateNum() {
		Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Stringcal.add("1,-2,3,-4");
		});

		String expectedMessage = "Negative numbers";
		String actualMessage = exception.getMessage();

		Assertions.assertEquals(expectedMessage, actualMessage);
	}

	@Test
	void StringcalForNewline()
	{
		Assertions.assertEquals(3,"1\n2");
	}

}
