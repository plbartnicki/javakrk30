import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAnnotionDemo
{
	private final static List<Integer> dataTest = new ArrayList( ); //to jest lista napisow - mozemy tu dodawac dowolna ilosc napisow. Zaden z testow nie powinien zmieniac liczby w tej liscie
	//listy sa indeksowane tak jak tablice od 0... n-1

	@BeforeClass   //metoda adnotowana w ten sposob zostanie uruchomiona raz przed wszystkimi testami. Zaleta takiej metody jest redukcja kodu
	public static void setupBeforeAllMethods( )
	{
		//		System.out.println( "setupBeforeAllMethods has been executed" );   //tylko po to aby udowodnic ze metoda adnotowana @BeforeClass  wykona sie raz i przed wszystkimi testami

		//chcemy wypelnic dataTest  jakimis napisami
		for ( int i = 1000; i >= 1; i-- )    //1000, 999, 998, ... 1
		{
			dataTest.add( i );
		}
	}

	@Test
	public void testGet()
	{
		//when
		Integer value = dataTest.get( 2 );

		//then
		assertEquals( new Integer( 998 ), value );
	}


	//w testach nie definiujemy porzadku dla metod adnotowanych @Test => takie metody powinny byc niezalezne
	@Test
	public void testSort( )
	{
		//given
		List<Integer> copyDataTest = new ArrayList<>(dataTest );
		//chcemy przetestowac dzialanie poprawnosc algorytmu sortwanie
		Collections.sort( copyDataTest );   //gotowy  i optymalny algorytm sortowania
		System.out.println( copyDataTest );
		/*Zadanie 3
			Zamiast wywolywac System.out.println   (jak wyzej) nalezy napisac test ktory zostanie zaliczony jesli w s z y s t k i e liczby po sortowaniu
			są we właściwej kolejności
			Integer value = dataTest.get( 2 );  //zwraca wartosc z komorki o indeksie 2
		 */


		//na koncy powinna byc odpowiednia asercja
	}

	@Test
	public void testContains()
	{
		//when
		boolean result = dataTest.contains( 500  );

		//then
		assertTrue(result);
	}
}
