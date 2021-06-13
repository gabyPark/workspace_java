package ch5;

public class Test192 {

	public static void main(String[] args) {

//		int [] [] arr = new int[2][];
//		arr[0] = new int [2];
//		arr[1] = new int [1];
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				System.out.println("arr["+i+"] : "+"arr["+j+"] : "+arr[i][j]);
//			}
//		}
				

//		int[][] math = new int[2][3];
//		for(int i=0;i<math.length;i++) {
//		for (int j=0; j<math[i].length; j++) {
//			System.out.println("math["+i+"] : "+"math["+j+"] : "+math[i][j]);
//		}
//	}
//		
//		int[][] eng = new int[2][];
//		eng[0] = new int[2];
//		eng[1] = new int[3];
//		for(int i=0;i<eng.length;i++) {
//		for (int j=0; j<eng[i].length; j++) {
//			System.out.println("eng["+i+"] : "+"eng["+j+"] : "+eng[i][j]);
//		}
//	}
//		
//		int [][] java = {{95,80},{92,96,80}};
//		for(int i=0;i<java.length;i++) {
//		for (int j=0; j<java[i].length; j++) {
//			System.out.println("java["+i+"] : "+"java["+j+"] : "+java[i][j]);
//	}
//	}		
		

		// p.195
		
		
		String[] str = new String[3];
		str[0] = "java";
		str[1] = "java";
		str[2] = new String ("java");
		
		System.out.println(str[0] == str[1]);
		System.out.println(str[0] == str[2]);
		System.out.println(str[0].equals(str[2]));
		
		// P. 195
		
		int [] old = {1,2,3};
		int [] newInt = new int[5];
		
		for(int i=0; i<old.length; i++) {
			newInt[i] = old[i];
		}
		
		for(int i=0; i<newInt.length; i++) {
			System.out.print(newInt[i]+", ");
		}
		
		//
		
//		int [] arr = {3,4,5};
//		int [] copyArr = new int[3];
//		
//		for(int i=0;i<arr.length;i++) {
//			copyArr[i] = arr[i];
//		}
		
//		System.arraycopy(arr, 0, copyArr, 0, 3);
		

	// p. 196
		
		String [] oldstr = {"java", "array", "copy"};
		String [] newstr = new String[5];
		
		System.arraycopy(oldstr, 0, newstr, 0, oldstr.length);
		
		for(int i=0; i<newstr.length; i++) {
			System.out.print(newstr[i]+", ");
		}
		
	// p.198
		
		int[] a = {1,2,3, 38, 90};
		
		int sum = 0;
		for(int score : a) {
			sum = sum+score;
		}
	
		System.out.println("Á¡¼ö ÃÑ ÇÕ : "+sum);
		
		double avg = (double) sum / a.length;
		System.out.println("Æò±Õ : "+avg);
	}

}
