package module3;

import java.util.*;

/*
 * Write a Java program to create 
 * 1)synchronized List using Collections.synchronizedList() 
 * and iterate the elements using synchronized block.
 * 2)synchronized Set using Collections.synchronizedSet() 
 * and iterate the elements using synchronized block.
 * 3)synchronized Map using Collections.synchronizedMap() 
 * and iterate the elements using synchronized block.
 * 
 */
public class Assignment_93 {

	public static void main(String[] args) {
		List<Integer> rollnum = new ArrayList<Integer>();

		List<Integer> sync_rollnum = Collections.synchronizedList(rollnum);

		sync_rollnum.add(22);
		sync_rollnum.add(32);
		sync_rollnum.add(31);
//Accessing in a synchronized block
		System.out.println("access synchronized list-->");
		synchronized (sync_rollnum) {
			for (int i : sync_rollnum) {
				System.out.println(i);
			}

		}
		Set<Integer> id_num = new HashSet<Integer>();

		Set<Integer> sync_id = Collections.synchronizedSet(id_num);

		sync_id.add(2);
		sync_id.add(33);
		sync_id.add(22);
//Accessing in a synchronized block
		System.out.println("access synchronized Set-->");
		synchronized (sync_id) {
			for (int i : sync_id) {
				System.out.println(i);
			}

		}
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "shree");
		map1.put(12, "Ram");

		Map<Integer, String> sync_map = Collections.synchronizedMap(map1);
		sync_map.put(4, "Gia");

		// Accessing in a synchronized block
		System.out.println("access synchronized Map-->");
		synchronized (sync_map) {
			for (Map.Entry<Integer, String> i : sync_map.entrySet()) {
				System.out.println(i.getKey() + "-->" + i.getValue());
			}
		}

	}
}
