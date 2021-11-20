package mvc;

import core.JBin;

public class Model {

	public String input1 = "";
	public String input2 = "";
	public static String operator = "";

	public String getValue() {
		// TODO Auto-generated method stub
		String result = null;
		
		switch(operator) {
			case "OR": result = JBin.or(this.input1, this.input2); break;
			case "AND": result = JBin.and(this.input1, this.input2); break;
			case "NOT" : result = JBin.not(this.input1); break;
		}
		
		return result;
	}
	
	public void resetValue() {
		this.input1 = "";
		this.input2 = "";
		this.operator = "";
	}
	
}
