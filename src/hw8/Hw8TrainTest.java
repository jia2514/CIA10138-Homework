package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hw8TrainTest {

//	設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//	需使用的集合裡
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700)

	public static void main(String[] args) {

		Hw8Train t1 = new Hw8Train(202, "普悠瑪", "樹林", "花蓮", 400D);
		Hw8Train t2 = new Hw8Train(1254, "區間", "屏東", "基隆", 700D);
		Hw8Train t3 = new Hw8Train(118, "自強", "高雄", "台北", 500D);
		Hw8Train t4 = new Hw8Train(1288, "區間", "新竹", "基隆", 400D);
		Hw8Train t5 = new Hw8Train(122, "自強", "台中", "花蓮", 600D);
		Hw8Train t6 = new Hw8Train(1222, "區間", "樹林", "七堵", 300D);
		Hw8Train t7 = new Hw8Train(1254, "區間", "屏東", "基隆", 700D);

//	• 請寫一隻程式,能印出不重複的Train物件
		System.out.println("• 請寫一隻程式,能印出不重複的Train物件");

		Set<Hw8Train> set = new HashSet<Hw8Train>();

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		System.out.println("-----foreach-----");
		for (Hw8Train train : set) {
			System.out.println(train.toString());
		}

		System.out.println("-----Iterator-----");
		Iterator<Hw8Train> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("-----傳統for-----");
		Object[] myArray = set.toArray();
		for (int i = 0; i < myArray.length; i++) {
			Hw8Train tra = (Hw8Train) myArray[i];
			System.out.println(tra.toString());
		}

		System.out.println();

//	• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		List<Hw8Train> list = new ArrayList<Hw8Train>();

		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);

		Collections.sort(list);
		
		System.out.println("-----foreach-----");
		for (Hw8Train train : list) {
			System.out.println(train.toString());
		}
		
		System.out.println("-----Iterator-----");
		Iterator<Hw8Train> iterator2 = list.iterator();
		while (iterator2.hasNext())
			System.out.println(iterator2.next());

		System.out.println("-----傳統for-----");
		for (int i = 0; i < list.size(); i++) {
			Hw8Train tra = list.get(i);
			System.out.println(tra.toString());
		}
		
		System.out.println();

//	• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		System.out.println("• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");

		Set<Hw8Train> set2 = new TreeSet<Hw8Train>();

		set2.add(t1);
		set2.add(t2);
		set2.add(t3);
		set2.add(t4);
		set2.add(t5);
		set2.add(t6);
		set2.add(t7);

		System.out.println("-----foreach-----");
		for (Hw8Train train : set2) {
			System.out.println(train.toString());
		}

		System.out.println("-----Iterator-----");
		Iterator<Hw8Train> iterator3 = set2.iterator();
		while (iterator3.hasNext())
			System.out.println(iterator3.next());

		System.out.println("-----傳統for-----");
		Object[] myArray2 = set2.toArray();
		for (int i = 0; i < myArray2.length; i++) {
			Hw8Train tra = (Hw8Train) myArray2[i];
			System.out.println(tra.toString());
		}
		


//	• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)

	}
}
