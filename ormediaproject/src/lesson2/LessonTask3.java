package lesson2;

import java.util.Scanner;

public class LessonTask3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("Введите ваш адрес электронной почты");
		String habs = scan.nextLine();
		//String habs = "802938162+1";
		char[] chars = habs.toCharArray();
		//System.out.println(initialize(chars));
		if(initialize(chars)){
		break;
		}
		else {
		System.out.println(" Адрес электронной почты неверный");;
	            }
		    
		   }
		System.out.println(" Адрес электронной почты  принят. ");
		    }
		
        
	
		    
		

	public static boolean initialize(char[]chars){
		int index = 0;
		for(int i=0;i<chars.length;i++){
			if((chars[i]>='A'&&chars[i]<='Z')||(chars[i]>='a'&&chars[i]<='z')||(chars[i]>='0'&&chars[i]<='9')){
			index = 1;
			}
		}
		return index>=1;     
		//return(chars[1-10]>='0'&&chars[1-10]<='9');
	            }
	
	
	
}