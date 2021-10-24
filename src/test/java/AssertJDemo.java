import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class AssertJDemo
{
	@Test
	public void test()
	{
		final List<String> elements = Arrays.asList( "abc", "xyz", "www", "hhh");

		//asercja ktora zaliczy test jesli elements zawiera elementy "abc", "xyz", "www", "hhh"
		assertTrue(elements.contains("hhh" ) && elements.contains("www" ) &&elements.contains("www" )
		&& elements.contains("xyz" ) && elements.contains("abc" ));

		//Zalety AssertJ: mniej kodu, wieksza czytelnosc
		assertThat(elements).contains( "abc", "xyz", "www", "hhh" );

		String name = "123abcWww";
		//test zostanie zaliczony gdy name zaczyna (ma prefiks) od "123" oraz konczy sie (ma postfix) na "Www";
		assertThat(name).startsWith( "123" ).endsWith( "Www" ).isEqualToIgnoringCase( "123abcwww" );
	}
}
