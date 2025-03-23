package hw4;

public class Ex3 {
	/*
	 * 有個字串陣列如下 (八大行星)： {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
	 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	 */
	public static void main(String[] args) {
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < planet.length; i++) {

			// 處理大小寫
			String planet2 = planet[i].toLowerCase();
			for (int j = 0; j < planet[i].length(); j++) {
				switch (planet2.charAt(j)) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				}
				//if判斷式用法
//				char c = planet2.charAt(j);
//				if (c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
//					count++;
//				} 

			}

		}
		System.out.println(count);
	}
}