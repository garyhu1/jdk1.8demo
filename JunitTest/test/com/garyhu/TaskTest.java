package com.garyhu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 当类被@RunWith注解修饰，或者类继承了一个被该注解修饰的类，
 * JUnit将会使用这个注解所指明的运行器（runner）来运行测试，
 * 而不是JUnit默认的运行器
 * 
 * @author garyhu
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class TaskTest {

}
