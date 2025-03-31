package hw5;

public class Work03 {
	// ref. Ex3

	public int maxElement(int x[][]) {
		int MaxInt = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > MaxInt) {
					MaxInt = x[i][j];
				}
			}
		}
		return MaxInt;
	}

	public double maxElement(double x[][]) {
		double MaxDouble = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > MaxDouble) {
					MaxDouble = x[i][j];
				}
			}
		}
		return MaxDouble;
	}


}
