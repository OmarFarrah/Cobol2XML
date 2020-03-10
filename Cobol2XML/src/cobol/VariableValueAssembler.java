package cobol;

import parse.*;
import parse.tokens.Token;
public class VariableValueAssembler extends Assembler {
	
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		Token t = (Token) a.pop();
		c.setVariableInfo(t.sval()); //nval returns alphabetical value for token <variable data-type(variable length)>
		System.out.println("Token string[4]: " + c.getVariableInfo());
		
		t = (Token) a.pop(); //keyword "pic" dont need any action here
		String tokenString = t.sval().trim();
		System.out.println("Token string[3]: " + tokenString);
		
		t = (Token) a.pop(); // <variable name>
		c.setVariableName(t.sval());
		System.out.println("Token string[2]: " + c.getVariableName());
		
		t = (Token) a.pop();
		c.setLineNumber((int) Math.round(t.nval())); // <line number>
		System.out.println("Token string[1]: " + c.getLineNumber());
		
		a.setTarget(c);
	}
	
	
	
	
	
	
	
}
