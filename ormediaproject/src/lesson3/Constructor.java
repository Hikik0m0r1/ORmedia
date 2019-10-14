package lesson3;

import lesson3.ClassA;

public class Constructor {
	
	public static void one(){
		
		
		ClassA a1 = new ClassA("Вася",23);
		ClassA a2 = new ClassA();
		System.out.println(a1.getName());
		System.out.println(a1.getValueA());
		System.out.println(a2.getName());
		System.out.println(a2.getValueA());
		System.out.println();
		ClassA b1 = new ClassB("Ваня",1,1);
		ClassB b2 = new ClassB("Ваня",1,1);

		System.out.println(b1.getName());
		System.out.println(b1.getValueA());
		System.out.println(b2.getValueB());
		System.out.println(b1.equals(b2));
		
		

		
	}
	

}
