import org.junit.Test;
import static org.junit.Assert.*;

public class RomanosTest {
	
	@Test
	public void DeveRetornarNumeroUm(){
		NumerosRomanos numerosRomanos = new NumerosRomanos("I");
		assertEquals(1, numerosRomanos.Converter("I"));
	}
	
	
	
	
	
	
}
