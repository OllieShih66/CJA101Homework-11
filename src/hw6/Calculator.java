package hw6;

import java.util.Scanner;

public class Calculator {
	public Calculator() {
	}

	public int powerXY(int x, int y) throws Exception {
		if (x == 0 && y == 0) {
			throw new Exception("0的0次方沒有意義！");
		} else if (y < 0) {
			throw new Exception("次方數為負數時，結果不為整數！");
		} else {
			return (int) Math.pow(x, y);
			 
		}

	}

}
