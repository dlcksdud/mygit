package com.kh.git;

import com.kh.foo.Foo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");
		System.out.println("good luck");
		
		new Foo().sayFoo();
		new Foo().sayFoo(); // #sayFoo에서 추가
	}

}
