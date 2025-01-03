package com.coderscampus.arraylist;

public class ExampleApplication {

	public static void main(String[] args) {
		CustomArrayList<String> myCustomList = new CustomArrayList<>();
		
	
		
		myCustomList.add("element 1");
		myCustomList.add("element 2");
		myCustomList.add("element 3");
		myCustomList.add("element 4");
		myCustomList.add("element 5");
		myCustomList.add("element 6");
		myCustomList.add("element 7");
		myCustomList.add("element 8");
		myCustomList.add("element 9");
		myCustomList.add("element 10");
		myCustomList.add("element 11");
		
		for (int i = 0 ; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		
		}
	}

}
