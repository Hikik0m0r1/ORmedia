package lesson1;

public class lesson1 {

	public static void main(String[] args) {
		int array[] = {-1,-2,-2,-99,0,-1};
		int index = indexOfMaxDifference(array);
		show(array);
		System.out.println();
		System.out.print("Максимальная разница между элементами первого массива " + (index+1) + "-м и " + (index + 2) + "-м элементами");
	}
		
		public static int random(int min,int max){
			return (int)(Math.random()*(max-min+1)+min);
		}
		public static int[] randomArray(int length, int min,int max){
			int[] array = new int[length];
			for (int i=0;i<array.length;i++)array[i]=random(min,max);
			return array;
		}

		public static void show(int[] array){
			for(int i=0;i<array.length;i++){
				
				System.out.print(array[i]+" ");
			}
		}
	
		public static int indexOfMaxDifference(int[] array) {
			int diff = 0;
			int index = 0;
			for (int i = 0; i < array.length - 1; i++) {
				int temp = Math.abs(array[i + 1] - array[i]);
				if (temp > diff) {
					diff = temp;
					index = i;
				}
			
			
		}
			return index;

	}

}
