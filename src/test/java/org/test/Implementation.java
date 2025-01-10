package org.test;

import java.util.*;
import java.util.Map.Entry;
import java.io.IOException;

public class Implementation {
	 
	public static void main(String[] args) throws IOException {
		
		HDFCDatabase hdfcDatabase= new HDFCDatabase();
		hdfcDatabase.readExcelData();
		hdfcDatabase.setUserId("shaik@123");
		hdfcDatabase.setPassword(123);
		hdfcDatabase.setBalance(122);
		
		
		HDFCDatabase hdfcDatabase2= new HDFCDatabase();
		hdfcDatabase2.readExcelData();
		hdfcDatabase2.setUserId("zayan@234");
		hdfcDatabase2.setPassword(144);
		hdfcDatabase2.setBalance(100);
		
		HDFCDatabase hdfcDatabase3= new HDFCDatabase();
		hdfcDatabase3.readExcelData();
		hdfcDatabase3.setUserId("afrose@345");
		hdfcDatabase3.setPassword(766);
		hdfcDatabase3.setBalance(188);
		
		HDFCDatabase hdfcDatabase4= new HDFCDatabase();
		hdfcDatabase4.readExcelData();
		hdfcDatabase4.setUserId("shk@123");
		hdfcDatabase4.setPassword(123);
		hdfcDatabase4.setBalance(166);
		
		
		
		List<HDFCDatabase> li= new ArrayList();
		li.add(hdfcDatabase);
		li.add(hdfcDatabase2);
		li.add(hdfcDatabase3);
		li.add(hdfcDatabase4);
		
		
		for (int i = 0; i < li.size(); i++) {
			HDFCDatabase hdfcDatabase5 = li.get(i);
			System.out.println(hdfcDatabase5.getBalance());
		}
		
		Set<HDFCDatabase> s= new LinkedHashSet();
		s.add(hdfcDatabase);
		s.add(hdfcDatabase2);
		s.add(hdfcDatabase3);
		s.add(hdfcDatabase4);
		
		
		for(HDFCDatabase x:s ) {
			System.out.println(x.getBalance());
		}
		
		Map<Integer,HDFCDatabase> m= new LinkedHashMap();
		m.put(10, hdfcDatabase);
		m.put(20, hdfcDatabase2);
		m.put(30, hdfcDatabase3);
		m.put(40, hdfcDatabase4);
		
		Set<Entry<Integer, HDFCDatabase>> entrySet = m.entrySet();
		
		for(Entry<Integer,HDFCDatabase> xi: entrySet) {
			System.out.println(xi.getValue().getBalance());
		}
		
	}
}
