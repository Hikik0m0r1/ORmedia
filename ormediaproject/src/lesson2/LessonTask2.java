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
		//System.out.println(initialize(chars));
		if(initialize(chars)){
		break;
		}
		else {
		System.out.println("Телефонный номер неверный");;
	            }
		    
		   }
		System.out.println(" Телефонный номер  принят. ");
		    }
		
        
	
		    
		
	

	public static boolean initialize(char[]chars){
		return((chars[0]=='8'&&chars.length==11
				&&(chars[1]>='0'&&chars[1]<='9')
		        &&(chars[2]>='0'&&chars[2]<='9')
		        &&(chars[3]>='0'&&chars[3]<='9')
		        &&(chars[4]>='0'&&chars[4]<='9')
		        &&(chars[5]>='0'&&chars[5]<='9')
		        &&(chars[6]>='0'&&chars[6]<='9')
		        &&(chars[7]>='0'&&chars[7]<='9')
		        &&(chars[8]>='0'&&chars[8]<='9')
		        &&(chars[9]>='0'&&chars[9]<='9')
		        &&(chars[10]>='0'&&chars[10]<='9'))
		        ||(chars[0]=='+'||chars.length==13)
		        &&(chars[1]>='0'&&chars[1]<='9')
		        &&(chars[2]>='0'&&chars[2]<='9')
		        &&(chars[3]>='0'&&chars[3]<='9')
		        &&(chars[4]>='0'&&chars[4]<='9')
		        &&(chars[5]>='0'&&chars[5]<='9')
		        &&(chars[6]>='0'&&chars[6]<='9')
		        &&(chars[7]>='0'&&chars[7]<='9')
		        &&(chars[8]>='0'&&chars[8]<='9')
		        &&(chars[9]>='0'&&chars[9]<='9')
		        &&(chars[10]>='0'&&chars[10]<='9')
		        &&(chars[11]>='0'&&chars[11]<='9')
		        &&(chars[12]>='0'&&chars[12]<='9'));        
		//return(chars[1-10]>='0'&&chars[1-10]<='9');
	            }
	
	
	
}