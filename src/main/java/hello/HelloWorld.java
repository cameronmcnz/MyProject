package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main (String args[]) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}

/* 

This is the old file from Parts 1-5.

Note the changes.

package hello;

public class HelloWorld {
	public static void main (String args[]) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}

*/



/* 

You could compile these classes by running the javac command from the java folder:

wasadmin@CLASSPC MINGW64 /c/_repos/MyProject/src/main/java (master)

$ javac hello/*.java

Here's how you could run the file. Take note of the folder where the command was run:

wasadmin@CLASSPC MINGW64 /c/_repos/MyProject/src/main/java (master)

$ java hello.HelloWorld
Hello World

*/