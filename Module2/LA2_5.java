public class LA2_5 {
	public static void main(String[] args) {
                 System.out.print("Kaushik Jain 22BCP357");
		String str1 = "abcde";
		String str2 = "edcba";
		
		if(reverseCheck(str1, str2)) System.out.println("Strings are reverse of each other");
		else System.out.println("Strings are NOT reverse of each other");
	 }
	
	public static boolean reverseCheck(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		for(int i = 0; i < str1.length()-1; i++) {
			if(str1.charAt(i) != str2.charAt(str1.length()-1-i)) return false;
		}
		return true;
	}
}