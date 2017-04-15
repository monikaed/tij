package testGit;

public class Test1 {

	private final String name;
	private static int counter = 0;
	private final int id = ++counter;
	public static void main(String[] args) {
		
	}
	
	Test1(String name){
		this.name = name;
	}
	
	public void f(){
		System.out.println(name + id);
		
	}
	
	@Override
	public String toString(){
		return name + counter;
	}

}
