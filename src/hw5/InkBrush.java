package hw5;

public class InkBrush extends Pen {
	// Ex6
	public void write() {
		System.out.println("沾墨汁再寫");
	}

	public static void main(String[] args) {
		Pen i1 = new InkBrush();
		i1.setPrice(50);
		int i1Price = (int) Math.round(i1.getPrice() * 0.9);
		i1.setBrand("杜甫");
		i1.write();
		System.out.println("鉛筆品牌為：" + i1.getBrand());
		System.out.println("鉛筆價格為：" + i1Price);

	}
}
