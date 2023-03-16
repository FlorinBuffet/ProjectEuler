package p028_Number_spiral_diagonals;

public class Main_028 {

	public static void main(String[] args) {
		long[][] array = new long[1001][1001];

		long num = 1;
		int x = 500;
		int y = 500;
		int step = 2;
		int steps = 4;
		int movX = 1;
		int movY = 0;

		while (true) {
			try {
				array[x][y] = num;
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			num++;
			step--;
			if (step == 0) {
				steps++;
				step = (steps / 2) - 1;
				if (movX == 1) {
					movX = 0;
					movY = 1;
				} else if (movY == 1) {
					movX = -1;
					movY = 0;
				} else if (movX == -1) {
					movX = 0;
					movY = -1;
				} else if (movY == -1) {
					movX = 1;
					movY = 0;
				}
			}
			x += movX * 1;
			y += movY * 1;
		}

		long sum = -1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i][i];
			sum += array[array.length - 1 - i][i];
		}
		System.out.println(sum);

	}

}
