package lesson1;

public class Lesson1Task2 {

	public static void main(String[] args) {
		int[]array = {7,158,-18,-90588,755,1,654};
		int max = 0;
		int min = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]>max)max =array[i];
			if(array[i]<min)min =array[i];
		
		}
		System.out.println("minimum: "+min);
		System.out.println("maximum: "+max);
		
	}

}


