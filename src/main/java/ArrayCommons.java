public class ArrayCommons
{
	//	Zadanie 1
	//	Napisz klasę i metodę o odpowiedniej nazwie, która zwraca najmniejszą spośród dodatnich liczb przekazanych metodzie
	//	w postaci listy. Np. dla tablice [-3.0, 10.6, -2.0, 7.0]  metoda powinna zwrócić 7.0.
	//[-1.0, -2.0, 9.0, 0.0] - > 9
	//[-3, 0, -5] -> null
	//[] -> null
	//null -> null
	//	Jeśli tablica jest pusta,
	//	metoda powinna zwrocic null
	//	(np. w komentarzach możesz określić co dany przypadek testowy będzie testował).
	//
	public static Double minValueGreaterThan0(Double []numbers) {
		if(numbers == null || numbers.length == 0) {
			return null;   //null jest informacja ze nie ma zadnej wartosci dodatniej w numbers[]  (zamiast tego bezpieczniej jest rzucic wyjatek)
		}

		int numbersSize = numbers.length;

		Double resultCandidate = null;
		int k = 0;
		while(k < numbersSize) {  //ta petla szuka pierwszej wartosci dodatniej
			if(numbers[k] > 0) {
				resultCandidate = numbers[k];
				break;
			}
			k++;
		}
		//po zakonczeniu powyzszej petli w resultCandidate mamy kandaydata na wynik

		for(int i = k + 1; i < numbersSize; i++) {  //celem tej petli jest znalezienie ewentualnej mniejszej wartosci dodatniej
			if(numbers[i] > 0 && numbers[i] < resultCandidate) {
				resultCandidate = numbers[i];
			}
		}

		return resultCandidate;
	}

	//tutaj moga w przyszlosci pojawic sie inne metody
}
