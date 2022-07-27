package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		List ll1 = new ArrayList();
		ll1.add(10);
		ll1.add(10.10);
		ll1.add("Raju");
		ll1.add(true);
		Object obj = ll1.get(0);
		Integer i =(Integer)obj;
		int n =i.intValue();
		System.out.println(n);

	}

}
