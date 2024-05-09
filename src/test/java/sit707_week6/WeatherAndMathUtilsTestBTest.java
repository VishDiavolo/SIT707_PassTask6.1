package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTestBTest {
  
	@Test
	public void countOddNumbers()
	{
		Assert.assertEquals(3, WeatherAndMathUtilsTestB.countOddNumbers(6));
	}
	@Test
	public void countOddNumbersd()
	{
		Assert.assertEquals(0, WeatherAndMathUtilsTestB.countOddNumbers(0));
	}
	
	@Test
	public void countOddNumbersEven()
	{int[] n = {2, 4, 6};
		Assert.assertEquals(0, WeatherAndMathUtilsTestB.countOddNumbersss(n));
	}
	@Test
	public void countOddNumbersOddandEven()
	{int[] n = {1, 2, 3, 4};
		Assert.assertEquals(2, WeatherAndMathUtilsTestB.countOddNumbersss(n));
	}
	@Test
	public void countOddNumbersAllOdd()
	{int[] n = {1,3,5};
		Assert.assertEquals(3, WeatherAndMathUtilsTestB.countOddNumbersss(n));
	}
	@Test
	public void countOddNumbersEmpty()
	{int[] n = {};
		Assert.assertEquals(0, WeatherAndMathUtilsTestB.countOddNumbersss(n));
	}
}

