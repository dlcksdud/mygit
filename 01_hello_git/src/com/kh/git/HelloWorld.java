package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;

/**
 * 원격저장소 등록 후 push 할 수 있다.
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");
		System.out.println("good luck");
		
		new Foo().sayFoo();
		new Foo().sayFoo(); // #sayFoo에서 추가
		System.out.println("lucky you"); // master에서 추가
		
		new Dog().say();
		new Cat().say();
	}
	
	/**
	* 원격저장소에서 수정된 내용
	*/
	
	public void hello() {
		System.out.println("저를 fetch해주세요");
	}

}
