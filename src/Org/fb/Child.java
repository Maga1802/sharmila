package Org.fb;

public class Child implements PArent1,Parent2{

	@Override
	public void test3() {
		System.out.println("M1");
	}

	@Override
	public void test4() {
		System.out.println("M2");
		
	}
	@Override
	public void test1() {
		System.out.println("M4");		
	}
	@Override
	public void test2() {
		System.out.println("M5");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		
	}
	

}
