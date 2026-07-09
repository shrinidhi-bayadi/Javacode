package practice;

import java.util.HashMap;
import java.util.LinkedHashSet;

import java.util.*;


public class Hash_map {
	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<>();

		m.put(1,"A");
		m.put(2,"B");

		m.remove(1);

		System.out.println(m);
	}
}

