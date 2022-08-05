package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer(1,"James","010-1111-2222");
		Customer customer2 = new Customer();
		customer2.setNumber(0);
		customer2.setName("Cathy");
		customer2.setPhone("010-7777-8888");
		
		//데이터 넣기
		customers.add(customer);
		customers.add(customer2);
		
		//----
		int[]	number = {3,4,5,};
		String[] name = {"우비", "관우","장비"};
		String[] phone = {"3333","4444","5555"};
		
		for(int i=0; i < number.length;i++) {
			Customer customer3= new Customer(number[i],name[i],phone[i]);
			customers.add(customer3);
		}
		
		
			
		System.out.println(customers.get(0).getNumber()+customers.get(0).getName() + customers.get(0).getPhone());
		
		System.out.println(customers.get(1).getName()+customers.get(1).getName() + customers.get(1).getPhone());
		System.out.println(customers.get(2).getName()+customers.get(2).getName() + customers.get(2).getPhone());
		System.out.println(customers.get(3).getName()+customers.get(3).getName() + customers.get(3).getPhone());
		System.out.println(customers.get(4).getName()+customers.get(4).getName() + customers.get(4).getPhone());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


