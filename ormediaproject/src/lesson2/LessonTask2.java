package lesson2;

import java.util.Scanner;

public class LessonTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("Введите телефонный номер");
		String habs = scan.nextLine();
		//String habs = "802938162+1";
		char[] chars = habs.toCharArray();
		System.out.println(chars);
		if(initialize(chars)){
			System.out.println(" Телефонный номер  принят. ");
			break;
		}
		
			else {
		    System.out.println("Телефонный номер неверный");;
	            }
		    
		    }
		    }
		
        //System.out.println(" Телефонный номер  принят. ");
	
		    
		
	

	static boolean initialize(char[]chars){
		return(chars[0]==8);
		//return((chars[0]==8&&chars.length==11&&chars[1-10]=='0'-'9')||(chars[0]=='+'&&chars.length==13&&chars[1-12]=='0'-'9'));
	            }
	
	
	
}