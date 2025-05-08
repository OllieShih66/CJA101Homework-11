package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {
	public static void main(String[] args) {
		/*
		 * 設計對應的getter/setter方法， 並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
		 */
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 請寫一隻程式，能印出不重複的Train物件
//		// 排序方法依據compareTo
		Set<Train> set1 = new TreeSet<Train>();
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		set1.add(t4);
		set1.add(t5);
		set1.add(t6);
		set1.add(t7);

		System.out.println("==================刪除重複==================");
		System.out.println("***for-each****");
		for (Train tr1 : set1)
			System.out.println(tr1.getNumber() + "," + tr1.getType() + "," + tr1.getStart() + "," + tr1.getDest()
					+ tr1.getPrice());

		System.out.println("***iterator****");
		Iterator<Train> it = set1.iterator();
		while (it.hasNext()) {
			Train tr1 = it.next();
			System.out.println(tr1.getNumber() + "," + tr1.getType() + "," + tr1.getStart() + "," + tr1.getDest()
					+ tr1.getPrice());

		}

		System.out.println("==================由大到小排序==================");
		List<Train> list = new ArrayList<Train>();
		list.add(t7);
		list.add(t6);
		list.add(t5);
		list.add(t4);
		list.add(t3);
		list.add(t2);
		list.add(t1);

		Collections.sort(list);

		System.out.println("***for-each****");
		for (Train tr2 : list)
			System.out.println(tr2.getNumber() + "," + tr2.getType() + "," + tr2.getStart() + "," + tr2.getDest() + ","
					+ tr2.getPrice());

		System.out.println("***iterator****");
		Iterator<Train> it2 = list.iterator();
		while (it2.hasNext()) {
			Train tr2 = it2.next();
			System.out.println(tr2.getNumber() + "," + tr2.getType() + "," + tr2.getStart() + "," + tr2.getDest()
					+ tr2.getPrice());

		}

		System.out.println("***for****");
		for (int i = 0; i < list.size(); i++) {
			Train tr2 = list.get(i);
			System.out.println(tr2.getNumber() + "," + tr2.getType() + "," + tr2.getStart() + "," + tr2.getDest() + ","
					+ tr2.getPrice());
		}

		System.out.println("========由大到小排序，還可以不重複印出===========");

		Set<Train> set3 = new HashSet<Train>(); // 依據equals和hashcode判斷重複
		set3.add(t1);
		set3.add(t2);
		set3.add(t3);
		set3.add(t4);
		set3.add(t5);
		set3.add(t6);
		set3.add(t7);

		System.out.println("***for-each****");
		for (Train tr3 : set3)
			System.out.println(tr3.getNumber() + "," + tr3.getType() + "," + tr3.getStart() + "," + tr3.getDest() + ","
					+ tr3.getPrice());

		System.out.println("***iterator****");
		Iterator<Train> it3 = set3.iterator();
		while (it3.hasNext()) {
			Train tr3 = it3.next();
			System.out.println(tr3.getNumber() + "," + tr3.getType() + "," + tr3.getStart() + "," + tr3.getDest()
					+ tr3.getPrice());

		}

	}

}
