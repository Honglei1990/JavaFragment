public class SuffixStrToUpper {
	public static String captureName(String str){
		char[] cs = str.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
}
