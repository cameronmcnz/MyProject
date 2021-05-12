package hello;

import org.junit.*;
import hello.Greeter;

public class TestGreeting {
	
	@Test
	public void testGreeter() {
		Greeter msg = new Greeter();
		Assert.assertEquals("Hello World!", msg.sayHello());
	}
	
	@Test
	public void testSomething() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testSomethingElse() {
		Assert.assertNotEquals("maven", "gradle");
	}
	

}