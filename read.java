import java.io.*;

class A {

	public static void main (String args[]) throws Exception {
		String n;
		System.out.println("enter the number:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		n = r.readLine();
		System.out.println("you entered "+ n);
	}
}
