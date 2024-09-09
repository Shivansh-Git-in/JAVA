package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
Factorial num;

 @Test
 public void test0() {
	 num=new Factorial();
	 assertEquals(120,num.fact(5));
 }
 @Test
 public void test1() {
	 num=new Factorial();
	 assertEquals(24,num.fact(4));
 }

}