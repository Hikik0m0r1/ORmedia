package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) {
		MyList<? super BClass> list = new MyList<>();
		CClass c = new CClass();
		list.add(c);
		//CClass c1 = list.get(0);
		AClass c2 = list.get(0);
		
	}

}
