//Java Demo
public class java1 {

	int i = 1;
	int j = 2;
	static int K = 3;
	String name = "rohini";

	public void test1() {

		System.out.println("Hi, test method is called");
		System.out.print(i + j + "\n");
		System.out.print(j - i + "\n");
		System.out.println(name);
	}

	public void stringmethod() {

		System.out.println("string method called\n");
		String name = "Rohini shiv";
		int i = name.length();
		System.out.println("i=" + (i));
		System.out.println("upper case =" + name.toUpperCase());
		System.out.println("Lower case=" + name.toLowerCase());
		System.out.println("index =" + name.indexOf("s"));
		String lastname = " Gupta";
		System.out.println("full name = " + name.concat(lastname));
		
		
	
	}

	public static void main(String[] args) {
		//int i=1;
		java1 obj = new java1();
		//obj.test1();
		System.out.println("I value =" + obj.i);
		System.out.println("value of K="+K);
		System.out.println("value of new I="+( obj.i+=3));
		obj.stringmethod();
	}
}
