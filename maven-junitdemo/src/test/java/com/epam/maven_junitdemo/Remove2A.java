package com.epam.maven_junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove2A {
   RemoveFirst obj1;
	  @BeforeEach
	  void setup() {
		   obj1=new RemoveFirst();
	  }
	
	@Test
	void test() {
		  String actual=obj1.Remove("AACDA");
		assertEquals("CDA", actual);
	}
	
	@Test
	void test2() {
		
		String actual=obj1.Remove("AA");
		assertEquals("", actual);
	}
	
	@Test
	void test3() {
		
		String actual=obj1.Remove("AAA");
		assertEquals("A", actual);
	}
	
	@Test
	void test4() {
		
		String actual=obj1.Remove("ABAA");
		assertEquals("BAA", actual);
	}
	
	@Test
	void test5() {
		
		String actual=obj1.Remove("BAAA");
		assertEquals("BAA", actual);
	}
	
	@Test
	void test6() {
		
		String actual=obj1.Remove("CCAAA");
		assertEquals("CCAAA", actual);
	}
	@Test
	void test7() {
		
		String actual=obj1.Remove("CCBB");
		assertEquals("CCBB", actual);
	}

}
