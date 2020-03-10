import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Num;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

public class AssemblyTests {

	@Test
	public void testAssemblyTokens() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		
//		t.setString("19 age value 12.");
		Assembly tA = new TokenAssembly("19 age value 12.");
		
		for(int i=0; i < tA.length(); i++) {
			System.out.println((Token) tA.nextElement());
		}
		
//		assertEquals(tA.remainder(" "), "19 age value 12.");
		
		t.setString("19 value 12.");
		Assembly tA2 = new TokenAssembly(t);
		
		assertNotEquals(tA2.length(), 4);
		

//		Assembly in = new TokenAssembly(t); //Pass token into an Assembly (sort of an array of tokens)
//		Assembly out = p.bestMatch(in);
		
//		System.out.println(tA.length());
		
//		assertEquals(out.elementsConsumed(), 4);
		
		//Object notation diagrams
	}
	
	@Test
	public void assemblyDescriptionTest(){
		Tokenizer t = CobolParser.tokenizer();
		
		t.setString("19 age value 12.");
		Assembly tA = new TokenAssembly(t);
		
		
		assertEquals(tA.toString(), "[]^19.0/age/value/12.0");
		
		assertNotEquals(tA.toString(), "[]^");
	}
	
	


}
