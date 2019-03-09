package com.dilip.lang;

import java.util.HashSet;
import java.util.Set;

class TestBook {
	int id;
	String name;

	public TestBook(int id, String name) {
		this.id = id;
		this.name = name;
	}

	int i = 0;

	@Override
	public boolean equals(Object obj) {
		System.out.println(this.id + "eql" + i++);
		TestBook book = (TestBook) obj;
		if (this.name.compareTo(book.name) == 0 && this.id == book.id)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		System.out.println(this.id + "has" + i++);
		System.out.println(this.name.hashCode() * this.id);
		return this.name.hashCode() * this.id;
	}
}

public class EqualTest {
	public static void main(String args[]) {
		TestBook book1 = new TestBook(1, "book");
		TestBook book2 = new TestBook(1, "book");
		TestBook book3 = new TestBook(1, "book");
		/*Set<TestBook> set = new HashSet();
		set.add(book1);
		set.add(book2);
		set.add(book3);
		System.out.println(set.size());*/

		System.out.println("book1.equals(book2) = " + book1.equals(book2) + " book1.hash= " + book1.hashCode()
				+ " book2.hash= " + book2.hashCode());
		
		System.out.println("book1.equals(book3) = " + book1.equals(book3) + " book1.hash= " + book1.hashCode()
				+ " book3.hash= " + book3.hashCode());
		
		System.out.println("book2.equals(book3) = " + book2.equals(book3) + " book2.hash= " + book2.hashCode()
				+ " book3.hash= " + book3.hashCode());

	}

}