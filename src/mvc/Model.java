package mvc;

public class Model {

	public String input1 = "";
	public String input2 = "";
	public static String operator = "";

	public String getValue() {
		// TODO Auto-generated method stub
		String result = null;
		
		switch(operator) {
			case "OR":
				result = this.input1 + this.input2;
			break;
		}
		
		return result;
	}
	
	public void resetValue() {
		
		this.input1 = "";
		this.input2 = "";
		this.operator = "";
		
	}
	
}
