import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAnnotionDemo
{
	//ponizsza lista bedzie wspoldzielona przez wszystkie testy w tej klasie
	private  static List<Integer> dataTest = new ArrayList( ); //to jest lista napisow - mozemy tu dodawac dowolna ilosc napisow. Zaden z testow nie powinien zmieniac liczby w tej liscie
	//listy sa indeksowane tak jak tablice od 0... n-1

	@BeforeClass   //metoda adnotowana w ten sposob zostanie uruchomiona raz przed wszystkimi testami. Zaleta takiej metody jest redukcja kodu
	public static void setupBeforeAllMethods( )
	{
		System.out.println( "setupBeforeAllMethods has been executed" );   //tylko po to aby udowodnic ze metoda adnotowana @BeforeClass  wykona sie raz i przed wszystkimi testami
	}

	//metoda adnotowana @Before  wykona sie przed kazda metoda @Test
	@Before
	public void setupBefore()
	{
		dataTest.clear();
		for ( int i = 1000; i >= 1; i-- )    //1000, 999, 998, ... 1
		{
			dataTest.add( i );
		}
	}

	//istnieja rownie adnotacje @After i @AfterClass

	@Test
	public void testGet()
	{
		//when
		Integer value = dataTest.get( 2 );

		//then
		assertEquals( new Integer( 998 ), value );
	}

	@Test
	public void testContains()
	{
		//when
		boolean result = dataTest.contains( 500  );

		//then
		assertTrue(result);
	}
	//w testach nie definiujemy porzadku dla metod adnotowanych @Test => takie metody powinny byc niezalezne
	@Test
	public void testSort( )
	{
		//chcemy przetestowac dzialanie poprawnosc algorytmu sortwanie
		Collections.sort( dataTest );   //gotowy  i optymalny algorytm sortowania
//		System.out.println( copyDataTest );
		/*Zadanie 3
			Zamiast wywolywac System.out.println   (jak wyzej) nalezy napisac test ktory zostanie zaliczony jesli w s z y s t k i e liczby po sortowaniu
			są we właściwej kolejności
			Integer value = dataTest.get( 2 );  //zwraca wartosc z komorki o indeksie 2
		 */

		//i: 0 1 2 3  ..  7  8   (size = 9)
		//   1 2 3 4 ...  9  8
		boolean tested = true;
		for(int i = 0; i < dataTest.size() - 1; i++) {
			if(dataTest.get( i + 1 ) - 1 < dataTest.get( i )) {  //spr. czy istnieje para (kolejnych komorek) ktorych wartosci sa nieuporzadkowane po sortowaniu
				tested = false;   //ustawiamy informacje ze ciąg nie jest posortowany
				break;   //nie ma sensu sprawdzac dalej bo juz wiemy ze lista nie jest posortowany
			}
		}

		//na koncy powinna byc odpowiednia asercja
		assertTrue( tested );
	}

}
