package javaexercise_setThree;

public class PeakElement {
	/* Peak Element */
	public static void main(String[] args) {

		int peakElement[] = { 1, 4, 7, 10, 4, 5, 2, 11, 3 };

		int len = peakElement.length; // 9
		int li = peakElement[0]; // 1
		int hi = peakElement[len - 1]; // 3

		int globalPeak = peakElement[0];

		// System.out.println(globalPeak);

		// System.out.println(len +" " + li + " "+ hi);

		for (int i = 1; i < len - 1; i++) {
			if (peakElement[i] > peakElement[i - 1] && peakElement[i] > peakElement[i + 1]) {
				if (peakElement[i] > globalPeak) {
					globalPeak = peakElement[i];
				}
			}
		}

		System.out.println(globalPeak);
	}

}
