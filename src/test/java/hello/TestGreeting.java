package hello;

import org.junit.*;
import hello.Greeter;

public class TestGreeting {
	
	@Test
	public void testGreeter() {
		Greeter msg = new Greeter();
		Assert.assertEquals("Hello world!", msg.sayHello());
	}
	
	@Test
	public void testSomething() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSomethingElse() {
		Assert.assertEquals("maven", "gradle");
	}
	

}