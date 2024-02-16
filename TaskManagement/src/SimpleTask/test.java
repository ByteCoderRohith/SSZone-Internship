package SimpleTask;

interface BaseI{ void method();}

public class test {
	void method() {
		System.out.println("Inside test method");
	}

}
class B extends test implements BaseI{
	
	public static void main(String[] args) {
		
	}
}
