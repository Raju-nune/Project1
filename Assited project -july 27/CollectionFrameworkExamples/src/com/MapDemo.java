package com;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		Map mm = new HashMap();
		mm.put(2,"Raju");
		mm.put(1,"Rajesh");
		mm.put(4,"Ramesh");
		mm.put(3,"Raj");
		System.out.println(mm);
		mm.put(6,"Giri");
		mm.put(2,"Rajkumar");
		System.out.println(mm);
		System.out.println(mm.get(1));
		System.out.println(mm.get(100));
		System.out.println(mm.containsKey(1));
		System.out.println(mm.containsValue("Raju"));


	}

}
