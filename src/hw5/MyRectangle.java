package hw5;

public class MyRectangle {
	/*
	 * Ex4 請設計一個類別MyRectangle： (1) 有兩個double型態的屬性為width, depth (2) 有三個方法： (3)
	 * 有兩個建構子：
	 */
	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		System.out.println("長方形寬為：" + width);
		getWidth();
		System.out.println("長方形高為：" + depth);
		getDepth();
	}

	// 宣告寬高
	private double width;
	private double depth;

	// 設定寬
	public void setWidth(double width) {
		this.width = width;
	}

	// 取得寬
	public double getWidth() {
		return width;

	}

	// 設定高
	public void setDepth(double depth) {
		this.depth = depth;
	}

	// 取得高
	public double getDepth() {
		return depth;
	}

	// 計算該長方形的面積
	public double getArea(double width, double depth) {
		return width * depth;
	}

}
