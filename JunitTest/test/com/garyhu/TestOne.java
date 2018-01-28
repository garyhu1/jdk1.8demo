package com.garyhu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOne {

	private Calculate calculate = new Calculate();
	
	//只执行一次，在最开始的时候
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	//只执行一次，在最后
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	//每个测试方法之前运行
	@Before
	public void setUp() throws Exception {
		calculate.clear();
		System.out.println("@Before");
	}

	//每个实测方法之后运行
	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void test() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(timeout=2000)//表示2秒后结束死循环
	public void testWhile(){
		while(true) {  
            System.out.println("run forever...");  //一个死循环  
        } 
	}
	
	//预期它会抛出一个算术异常，所以它会正常运行
	@Test(expected=ArithmeticException.class)
	public void testDivid(){
		calculate.divide(0);
		assertEquals("除法有问题",3, calculate.getResult()); //将除数设置为0  
	}

}
