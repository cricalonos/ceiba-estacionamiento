package co.com.ceiba;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	private static Main main;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		main = new Main();
	}

	@Test
	public void test() {
		int result = main.sumarNumeros(2, 2);
		Assert.assertEquals(4, result);
	}

	@Test
	public void test2() {
		int result = main.sumarNumeros(4, 4);
		Assert.assertEquals(8, result);
	}

}
