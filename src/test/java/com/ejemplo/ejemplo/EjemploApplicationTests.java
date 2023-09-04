package com.ejemplo.ejemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjemploApplicationTests {


	@Test
	void test(){
		System.out.println("hola mundo");
		Assertions.assertEquals(5,5);
	}

}
