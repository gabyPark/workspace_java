package ch11_1;

public class MatchEx {

	public static void main(String[] args) {
		
		String name1 = "È«±æµ¿123";
		String name2 = "·ù¹Ú°¡ºó";
		String name3 = "À±¿©Jin";
		String name4 = "¹Ú°Ç";
		String name5 = "¹Ú°¡ºó";
		
		String nameRule = "°¡-ÆR°¡-ÆR°¡-ÆR";
		System.out.println(name1.matches(nameRule));
		System.out.println(name2.matches(nameRule));
		System.out.println(name3.matches(nameRule));
		System.out.println(name4.matches(nameRule));
		System.out.println(name5.matches(nameRule));

		
		// ¹®ÀÚ¿­ ¸ðµÎ°¡ °¡~ÆR ¾È¿¡ µé¾î°¡¸ç, 3~5 ±ÛÀÚÀÎ°¡?
		String nameRule2 = "[°¡-ÆR]{3,5}";
		System.out.println(name1.matches(nameRule));
		System.out.println(name2.matches(nameRule));
		System.out.println(name3.matches(nameRule));
		System.out.println(name4.matches(nameRule));
		System.out.println(name5.matches(nameRule));
				

	}

}
