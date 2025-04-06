package hw5;

public class Pencil extends Pen {
	// Ex6

	public void write() {
		System.out.println("削鉛筆再寫");
	}

	public static void main(String[] args) {
		Pen p1 = new Pencil();
		p1.setPrice(38);
		int p1Price = (int) Math.round(p1.getPrice() * 0.8);
		p1.setBrand("Pental");
		p1.write();
		System.out.println("鉛筆品牌為：" + p1.getBrand());
		System.out.println("鉛筆價格為：" + p1Price);

	}

}
