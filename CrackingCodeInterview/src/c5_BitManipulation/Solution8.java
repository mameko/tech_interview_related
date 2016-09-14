package c5_BitManipulation;

import java.util.Arrays;

public class Solution8 {

	public byte[] drawline(byte[] screen, int width, int x1, int x2, int y) {

		if (screen == null || screen.length == 0 || width == 0) {
			return null;
		}

		int hight = screen.length / width;
		int diff = x2 - x1;
		if (y < 0 || y >= hight || x1 < 0 || x2 >= width * 8 || diff > (width * 8)) {
			return null;
		}

		byte[] currentY = Arrays.copyOfRange(screen, y * width, (y + 1) * width);

		int cur = x1;
		int i = x1 % 8;
		int curyLoc = x1 / 8;
		while (cur <= x2) {
			char[] c = { '0', '0', '0', '0', '0', '0', '0', '0' };
			while (i < 8 && cur <= x2) {
				c[i] = '1';
				i++;
				cur++;
			}
			i = 0;
			byte mask = makemask(new String(c));
			currentY[curyLoc] |= mask;
			curyLoc++;
		}

		// copy back to original screen;
		for (int j = 0; j < width; j++) {
			screen[y * width + j] = currentY[j];
		}

		return screen;
	}

	private byte makemask(String s) {
		Integer tmp = Integer.parseInt(s, 2);
		return tmp.byteValue();
	}

	public static void main(String[] args) {
		Solution8 sol = new Solution8();

		// System.out.println(sol.drawline(null, 0, 0, 0, 0));

		byte[] screen1 = { (byte) 0 };
		// System.out.println(Arrays.toString(screen1));
		// System.out.println(Arrays.toString(sol.drawline(screen1, 1, 0, 6, 0)));// -2
		// System.out.println(Arrays.toString(sol.drawline(screen1, 1, 0, 7, 0)));// -1
		// System.out.println(Arrays.toString(sol.drawline(screen1, 1, 3, 6, 0)));// 30
		// System.out.println(Integer.toBinaryString(30));
		// System.out.println(Arrays.toString(sol.drawline(screen1, 1, 0, 9, 0)));// null

		byte[] screen2 = { (byte) 0, (byte) 0 };
		// System.out.println(Arrays.toString(sol.drawline(screen2, 1, 0, 7, 1)));// [0, -1]
		// System.out.println(Integer.toBinaryString(-1));

		// System.out.println(Arrays.toString(sol.drawline(screen2, 1, 7, 8, 0)));// null
		// System.out.println(Arrays.toString(sol.drawline(screen2, 2, 7, 8, 0)));//[1, -128]
		// System.out.println(Integer.toBinaryString(-128));

		byte[] screen3 = { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0 };
				// [0, 0, 0, 0, 112, 0, 0, 0, 0, 0, 0, 0]
				// System.out.println(Arrays.toString(sol.drawline(screen3, 4, 1, 3, 1)));
				// System.out.println(Integer.toBinaryString(112));

		// [0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -2]
		System.out.println(Arrays.toString(sol.drawline(screen3, 4, 0, 30, 2)));
		// System.out.println(Integer.toBinaryString(112));
	}

}
