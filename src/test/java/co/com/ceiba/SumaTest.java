package co.com.ceiba;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumaTest {

	private static Suma suma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		suma = new Suma();
	}

	@Test
	public void test() {
		int result = suma.sumarNumeros(2, 2);
		Assert.assertEquals(4, result);
	}

	@Test
	public void test2() {
		int result = suma.sumarNumeros(4, 4);
		Assert.assertEquals(8, result);
	}

}
