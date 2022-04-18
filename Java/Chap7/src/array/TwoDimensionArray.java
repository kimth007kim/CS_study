package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr= new int[2][3];
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr.length);
		System.out.println(arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		char[][] alphabets = new char[2][13];
		char now = 'A';
		alphabets[0][0] = now;
		now++;
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
				if (!(i == 0 && j == 0)) {
					alphabets[i][j] = now;
					now++;
				}
			}

		}

		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
				System.out.print(alphabets[i][j]+" ");
			}
			System.out.println();
		}

	}
}
