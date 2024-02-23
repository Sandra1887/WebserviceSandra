package webservicesandra.webservicesandra;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import webservicesandra.webservicesandra.service.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebserviceSandraApplicationTests {

	@Test
	public void TestingAdd() {
		Calculator calc = new Calculator();

		assertEquals(calc.addition(), 10);
	}

}
