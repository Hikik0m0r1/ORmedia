package lesson3;

public class Something {
	private static Something instance;
	
	private Something(){	
	}
	public static Something getInstance(){ 
        if(instance == null){		
            instance = new Something();	
        }
        return instance;		
    }
}
	
	 

		
	
 
	

