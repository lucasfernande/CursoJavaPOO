
public class FuncoesString {

	public static void main(String[] args) {
		
		String origin = "Abc deg HIJ klm abc";
		
		String s = "potato apple lemon";
		String s01 = origin.toLowerCase();
		String s02 = origin.toUpperCase();
		String s03 = origin.trim();
		String s04 = origin.substring(2);
		String s05 = origin.substring(2, 9);
		String s06 = origin.replace('a', 'x');
		String s07 = origin.replace("abc", "cba");
		int i = origin.indexOf("bc");
		int j = origin.lastIndexOf("bc");
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("Original: - " + origin + " - ");
		System.out.println("LowerCase: - " + s01 + " - ");
		System.out.println("UpperCase: - " + s02 + " - ");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("SubString: -" + s04 + "-");
		System.out.println("SubString: -" + s05 + "-");
		System.out.println("Replace: -" + s06 + "-");
		System.out.println("Replace: -" + s07 + "-");
		System.out.println("Index of: " + i);
		System.out.println("Last Index of: " + j);
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
