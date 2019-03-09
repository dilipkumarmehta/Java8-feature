package com.generic;

public class AdddNumber {
	public static void main(String[] args) {
		Test<String> t = new Test();
		t.add("dilip", "dfdfd");
		Test<Integer> t1 = new Test();
		t1.add(11, 22);

	}
}

class Test<T> {

	public <T> T add(T t, T t1) {
		return t1;
		
}
}