package lesson1;

public class Lesson1Task4 {

	public static void main(String[] args) {
		char[]chars = randomCharArray(30,100);
		System.out.println("Изначальный массив символов");
		System.out.println(chars);
		changeCharRegister(chars);
		System.out.println("Конечный массив символов");
		System.out.println(chars);
	}
	
	public static char[] randomCharArray(int min, int max){
		char[]chars = new char[random(min,max)];
		for(int i=0;i<chars.length;i++){
			if(Math.random()>0.5){
				chars[i] = (char)random((int)'A',(int)'Z');
			}else chars[i] = (char)random((int)'a',(int)'z');
		}
		
		return chars;
	}
	public static int random(int min,int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static void changeCharRegister(char[] chars){
		for(int i=0;i<chars.length;i++){
			if(chars[i]>='A'&&chars[i]<='Z'){
				chars[i]+=32;
			}else 
				{chars[i]-=32;
				
				}
		}
	}
	
	

}