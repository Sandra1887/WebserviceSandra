package webservicesandra.webservicesandra;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebserviceSandraApplicationTests {

	@Test
	public void TestingMain() {
		WebserviceSandraApplication main1 = new WebserviceSandraApplication();
		WebserviceSandraApplication main2 = new WebserviceSandraApplication();

		assertEquals(main1.addition(), main2.addition());
	}

	@Test
	public void TestingAdd() {
		WebserviceSandraApplication main = new WebserviceSandraApplication();

		assertEquals(main.addition(), 10);
	}

}
