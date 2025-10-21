package activities;

import java.util.Arrays;

public class Acitivity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int[] data = { 15, 4, 3, 13, 2, 10, 11, 18, 9, 12, 1, 5, 8, 6 };
		System.out.println("The Unsorted array is :" + Arrays.toString(data));
		for (i = 1; i < data.length; i++) {
			if (data[i] < data[i - 1]) {
				for (j = i - 1; j >= 0; j--) {
					if (data[i] > data[j]) {
						break;
					}
				}
				if (j < 0) {
					j = 0;
				} else {
					j = j + 1;
				}
				data = swap(data, i, j);
			}
		}
		System.out.println("The Sorted array is :" + Arrays.toString(data));
	}
	public static int[] swap(int[] data, int i, int j) {
		int temp;
		for (int k = j; k < i; k++) {
			temp = data[k];
			data[k] = data[i];
			data[i] = temp;

		}
		return data;
	}
}



