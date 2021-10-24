import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCommonsTest
{
	//	w postaci listy. Np. dla tablice [-3.0, 10.6, -2.0, 7.0]  metoda powinna zwrócić 7.0.
	//[-1.0, -2.0, 9.0, 0.0] - > 9
	//[-3, -2, -5] -> null
	//[] -> null
	//null -> null
	@Test
	public void testMinValueGreaterThan0NotNullResultForMixedValues() {
		//given					//given oznacza sekcje przygotowania danych do testu
		Double[] numbers1 = new Double[]{-3.0, 10.6, -2.0, 7.0};
		Double[] numbers2 = new Double[]{-1.0, -2.0, 9.0, 0.0};

		//when             //oznacza moment wywolania testowanej metody
		Double result1 = ArrayCommons.minValueGreaterThan0( numbers1 );
		Double result2 = ArrayCommons.minValueGreaterThan0( numbers2 );

		//then 			//tutaj definiujemy kiedy ten przypadek testowy jest zaliczany - piszemy kryterium powodzenia testu
		assertEquals(new Double(7.0), result1);  //test zostanie zaliczony jesli result bedzie rowne 7.0
		assertEquals(new Double(9.0), result2);
	}

	@Test
	public void testMinValueGreaterThan0NotNullResultForValuesLessThanZero() {
		//given					//given oznacza sekcje przygotowania danych do testu
		Double[] numbers1 = new Double[]{-3.0, -2.5, -5.009};

		//when             //oznacza moment wywolania testowanej metody
		Double result1 = ArrayCommons.minValueGreaterThan0( numbers1 );

		//then 			//tutaj definiujemy kiedy ten przypadek testowy jest zaliczany - piszemy kryterium powodzenia testu
		assertEquals(null, result1);  //test zostanie zaliczony jesli result bedzie rowne 7.0
	}

	@Test
	public void testMinValueGreaterThan0NotNullResultForNullOrEmptyInput() {
		//given					//given oznacza sekcje przygotowania danych do testu
		Double[] numbers1 = null;
		Double[] numbers2 = new Double[]{};

		//when             //oznacza moment wywolania testowanej metody
		Double result1 = ArrayCommons.minValueGreaterThan0( numbers1 );
		Double result2 = ArrayCommons.minValueGreaterThan0( numbers2 );

		//then 			//tutaj definiujemy kiedy ten przypadek testowy jest zaliczany - piszemy kryterium powodzenia testu
		assertEquals(null, result1);  //test zostanie zaliczony jesli result bedzie rowne 7.0
		assertEquals(null, result2);
	}
}
