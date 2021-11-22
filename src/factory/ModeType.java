package factory;

public enum ModeType {
	ACCOUNTING(0, "Accounting"),
	ENGINEERING(1, "Engineering"),
	PROGRAMMING(2, "Programming");
	
	private final int number;
	private final String name;
	
	ModeType(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
}
