import static org.junit.Assert.*;

import java.util.ArrayList;
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
		Assembly tA = new TokenAssembly("19 age value 12.");
		ArrayList<Token> tArray = new ArrayList<Token>();
		
		for(int i=0; i < tA.length(); i++) {
//			System.out.println((Token) tA.nextElement());
			tArray.add((Token) tA.nextElement());
		}
		
//		System.out.println(tArray.get(0) + " " + tArray.get(3));
		assertEquals(tArray.get(0) + " " + tArray.get(3),19.0 +" "+12.0);
	}
	
	@Test
	public void testAssemblyTokens2(){
		Assembly tA = new TokenAssembly("19 age value 12.");
		ArrayList<Token> tArray = new ArrayList<Token>();
		
		for(int i=0; i < tA.length(); i++) {
//			System.out.println((Token) tA.nextElement());
			tArray.add((Token) tA.nextElement());
		}
		
//		System.out.println(tArray.get(0) + " " + tArray.get(3));
		//Test that tokens stored do not match 19.0 and 12.0 (19.0 will match but 12.0 should not)
		assertNotEquals(tArray.get(0) + " " + tArray.get(2),19.0 +" "+ 12.0);
	}
	
	


}
