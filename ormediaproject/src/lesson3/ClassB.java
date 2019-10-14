package lesson3;

public class ClassB extends lesson3.ClassA {
	private int ValueB;
	
	
	
	
	public ClassB (String name, int a, int b) {
		super (name, a);
		this.ValueB = b;
		//classA aB = new classA("Вася",23);
	}




	public int getValueB() {
		return ValueB;
	}




	public void setValueB(int valueB) {
		ValueB = valueB;
	}





}