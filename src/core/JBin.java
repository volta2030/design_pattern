package core;

public class JBin {
	
	private static String aTemp = "";
	private static String bTemp = "";
	
	
	
	public static String or(String a, String b) {
		
		align(a, b);
		
		if(a.equals("")) a = aTemp;
		if(b.equals("")) b = bTemp;
		
		int length = a.length();
		char[] c = a.toCharArray();
		
		for(int i = 0 ; i < length; i++) {
			c[i] = a.charAt(i)=='1' || b.charAt(i)=='1' ? '1' : '0'; 
		}
		
		return String.valueOf(c);
	}
	
	public static String and(String a, String b) {
		
		align(a, b);
		
		if(a.equals("")) a = aTemp;
		if(b.equals("")) b = bTemp;
		
		int length = a.length();
		char[] c = a.toCharArray();
		
		for(int i = 0 ; i < length; i++) {
			c[i] = a.charAt(i)=='1' && b.charAt(i)=='1' ? '1' : '0'; 
		}
		
		return String.valueOf(c);
	}
	
	public static String not(String a) {
		
		int length = a.length();
		char[] c = a.toCharArray();
		
		for(int i = 0 ; i < length; i++) {
			c[i] = a.charAt(i)=='1' ? '0' : '1'; 
		}
		
		return String.valueOf(c);
	}
	
	private static void align(String a, String b) {
		
		if (a.length() > b.length()) {
			int count = a.length() - b.length();
			int i = 0;
			while(i < count) {
				b = "0" + b;
				i++;
			}
			
			bTemp = b;
			
		}else {
			int count = b.length() - a.length();
			int i = 0;
			while(i < count) {
				a = "0" + a;
				i++;
			}
			
			aTemp = a;
		}

	}
	

}
