package hello;

import banka.Bangka1;
import banka.Bangka2;

public class Hello {
	
	public static void main(String[] args) {
		
		//spring-Dynamic web으로 작성
		//스프링 자바니까 run application
		Bangka1 b1 = new Bangka1(); //new
		b1.bangkabangka1("홍길동");
		
		Bangka2 b2 = new Bangka2(); //new
		b2.bangkabangka2("이도령");
	}

}
