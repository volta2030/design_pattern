package core;

public class JBin {

	public static String or(String a, String b) {
		//align
		if (a.length() > b.length()) {
			int count = a.length() - b.length();
			int j = 0;
			while(j < count) {
				b = "0" + b;
				j++;
			}
			
		}else {
			int count = b.length() - a.length();
			int j = 0;
			while(j < count) {
				a = "0" + a;
				j++;
			}

		}
		
		int length = a.length();
		char[] c = a.toCharArray();
		
		for(int i = 0 ; i < length; i++) {
			c[i] = a.charAt(i)=='1' || b.charAt(i)=='1' ? '1' : '0'; 
		}
		
		return String.valueOf(c);
	}
	
	public static String and(String a, String b) {
		//align
		if (a.length() > b.length()) {
			int count = a.length() - b.length();
			int j = 0;
			while(j < count) {
				b = "0" + b;
				j++;
			}
			
		}else {
			int count = b.length() - a.length();
			int j = 0;
			while(j < count) {
				a = "0" + a;
				j++;
			}
		}
		
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
	
}
