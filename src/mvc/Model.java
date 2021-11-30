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
			case "NOR" : result = JBin.nor(this.input1, this.input2); break;
			case "NAND" : result = JBin.nand(this.input1, this.input2); break;
			case "XOR" : result = JBin.xor(this.input1, this.input2); break;
			case "XNOR" : result = JBin.xnor(this.input1, this.input2); break;
		}
		
		return result;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public void resetValue() {
		this.input1 = "";
		this.input2 = "";
		this.operator = "";
	}
	
	public void undoInput1() {
		this.input1 = this.input1.substring(0, this.input1.length()-1);
	}
	
	public void undoInput2() {
		this.input2 = this.input2.substring(0, this.input2.length()-1);
	}
	
	public void undoOperator() {
		this.operator = "";
	}
	
}
