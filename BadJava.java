/*
To compile this source code into bytecode? 

javac BadJava.java

To run the bytecode?

java BadJava

*/

public class BadJava {
	public static void main (String args[]) {
		String warning = "Java files do not go in this folder!!!\n";
		warning = warning + "And Java files should go in packages!!!";
		System.out.print(warning);
		javax.swing.JOptionPane.showMessageDialog(null, "This is a bad Java file!!! Delete it!");
	}
}