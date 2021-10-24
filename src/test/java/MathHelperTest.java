import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathHelperTest
{
	@Test
	public void testMaxAbsBothPositive() {
		//given
		double num1 = 3.10;
		double num2 = 100.0;

		//when
		double result = MathHelper.maxAbs( num1, num2 );

		//then
		assertEquals(100.0, result, 0.0);
	}

	@Test
	public void testMaxAbsBothNegative() {
		//given
		double num1 = -3.10;
		double num2 = -100.0;

		//when
		double result = MathHelper.maxAbs( num1, num2 );

		//then
		assertEquals(-100.0, result, 0.0);
	}

	@Test
	public void testMaxAbsWithFirstZero() {
		//given
		double num1 = 0;
		double num2 = 100.0;

		//when
		double result = MathHelper.maxAbs( num1, num2 );

		//then
		assertEquals(100.0, result, 0.0);
	}

	@Test
	public void testMaxAbsWithSecondZero() {
		//given
		double num1 = 3.10;
		double num2 = 0;

		//when
		double result = MathHelper.maxAbs( num1, num2 );

		//then
		assertEquals(3.10, result, 0.0);
	}

	@Test
	public void testMaxAbsWithBothZero() {
		//given
		double num1 = 0;
		double num2 = 0;

		//when
		double result = MathHelper.maxAbs( num1, num2 );

		//then
		assertEquals(0, result, 0.0);
	}
}
