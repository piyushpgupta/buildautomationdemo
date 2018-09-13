package example;

public class Greeting {
	public void coveredByUnitTest() {
		System.out.println("Hello, world.");
	}

	public void notCoveredByUnitTest() {
		System.out.println("Hello, world.");
	}

	public void notCoveredByUnitTest2() {
		System.out.println("Hello, world.");
	}

	public void testString() {
	  String x = "a test";
	  String y = new String("a test");
	  System.out.println(x.equals(y)); //prints true
  }

}
