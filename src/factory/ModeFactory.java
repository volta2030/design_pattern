package factory;

public class ModeFactory {
	public static Mode createInstance(ModeType modeType) {
	
		if(modeType.equals(ModeType.ACCOUNTING)) 		   return new AccountingMode();
		else if(modeType.equals(ModeType.ENGINEERING)) return new EngineeringMode();
		else if(modeType.equals(ModeType.PROGRAMMING)) return new ProgrammingMode();
		
		return null;
	};
}
