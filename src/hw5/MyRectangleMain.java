package hw5;

public class MyRectangleMain {
	// ref. Ex4
	public static void main(String[] args) {
		MyRectangle mr1 = new MyRectangle();
		mr1.setWidth(10);
		System.out.println("長方形寬為：" + mr1.getWidth());
		mr1.setDepth(20);
		System.out.println("長方形高為：" + mr1.getDepth());
		double area1 = mr1.getArea(10, 20);
		System.out.println("長方形面積為：" + area1);

		MyRectangle mr2 = new MyRectangle(10, 20);
		double area2 = mr2.getArea(10, 20);
		System.out.println("長方形面積為：" + area2);

	}

}
