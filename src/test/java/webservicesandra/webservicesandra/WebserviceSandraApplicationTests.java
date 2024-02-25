package webservicesandra.webservicesandra;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import webservicesandra.webservicesandra.onlyForTesting.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@SpringBootTest
class WebserviceSandraApplicationTests {
	@Test
	public void TestingAdd() {
		Calculator calc = new Calculator();

		assertEquals(calc.addition(), 10);
	}
}
