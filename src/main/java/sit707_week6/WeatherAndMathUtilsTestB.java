package sit707_week6;

public class WeatherAndMathUtilsTestB {

	public static int countOddNumbers(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		return count;

	}

	public static int countOddNumbersss(int[] numbers) {
		int count = 0;
		int i = 0;

		while (i < numbers.length) {
			if (numbers[i] % 2 != 0) {
				count++;
			}
			i++;
		}
		return count;
	}

}