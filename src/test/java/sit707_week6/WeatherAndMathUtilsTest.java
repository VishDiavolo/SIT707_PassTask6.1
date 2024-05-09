package sit707_week6;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WeatherAndMathUtilsTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testStudentIdentity() {
		String studentId = "222207899";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Vishuddha Samarasekara";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse("Number is even", WeatherAndMathUtils.isEven(5));
	}

	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue("Number is not even", WeatherAndMathUtils.isEven(4));
	}

	@Test
	public void testALLCLEARWeatherAdvice() {
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
	}

	@Test
	public void testCancelWeatherAdviceWithCONCERNING_WINDSPEED() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
	}

	@Test
	public void testWARNWeatherAdviceWithCONCERNING_RAINFALL() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 5.0));
	}

	@Test
	public void testCancelWeatherAdviceWithDANGEROUS_WINDSPEED() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 0.0));
	}

	@Test
	public void testCancelWeatherAdviceWithDANGEROUS_RAINFALL() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 8.0));
	}

	@Test
	public void testCancelWeatherAdviceWithDANGEROUS_WINDSPEEDAndCONCERNING_RAINFALL() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 5.0));
	}

	@Test
	public void testCancelWeatherAdviceWithCONCERNING_WINDSPEEDAndDANGEROUS_RAINFALL() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 10.0));
	}

	@Test
	public void testCancelWeatherAdviceWithCONCERNING_WINDSPEEDAndCONCERNING_RAINFALL() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
	}

	@Test
	public void testNegativeWindSpeedExceptionRules() {
		thrown.expect(IllegalArgumentException.class);
		WeatherAndMathUtils.weatherAdvice(-10.0, 5.0);
	}

	@Test
	public void testNegativePrecipitationExceptionRules() {
		thrown.expect(IllegalArgumentException.class);
		WeatherAndMathUtils.weatherAdvice(10.0, -5.0);
	}

	@Test
	public void testisPrimetrue() {
		Assert.assertEquals(true, WeatherAndMathUtils.isPrime(1));
	}

	@Test
	public void testisPrimefalse() {
		Assert.assertEquals(true, WeatherAndMathUtils.isPrime(2));
	}

	@Test
	public void testisPrimefalse1() {
		Assert.assertEquals(false, WeatherAndMathUtils.isPrime(6));
	}

	@Test
	public void testisPrimefalse2() {
		Assert.assertEquals(true, WeatherAndMathUtils.isPrime(7));
	}
}
