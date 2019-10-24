package lesson5;

import java.util.ArrayList;

public class MyList<T extends AClass> {
	
	private ArrayList<T>list = new ArrayList<>();
	
	public boolean add(T t){
		return this.list.add(t);
	}
	
	public boolean delete(T t){
		return this.list.remove(t);
	}
	
	public int size(){
		return this.list.size();
	}
	
	public T get(int index){
		return this.list.size()<=index?null:this.list.get(index);
	}
	

}
