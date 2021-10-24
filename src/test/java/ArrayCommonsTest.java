import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCommonsTest
{
	//	w postaci listy. Np. dla tablice [-3.0, 10.6, -2.0, 7.0]  metoda powinna zwrócić 7.0.
	//[-1.0, -2.0, 9.0, 0.0] - > 9
	//[-3, 0, -5] -> null
	//[] -> null
	//null -> null

	// [-3.0, 10.6, -2.0, 7.0]
	@Test
	public void testMinValueGreaterThan0NotNullResultForMixedValues() {
		//given					//given oznacza sekcje przygotowania danych do testu
		Double[] numbers= new Double[]{-3.0, 10.6, -2.0, 7.0};

		//when             //oznacza moment wywolania testowanej metody
		Double result = ArrayCommons.minValueGreaterThan0( numbers );

		//then 			//tutaj definiujemy kiedy ten przypadek testowy jest zaliczany - piszemy kryterium powodzenia testu
		assertEquals(new Double(7.0), result);  //test zostanie zaliczony jesli result bedzie rowne 7.0
	}
}
